package fuad305;
public class BandwidthCalculator {
    public static void hostingBandwidthCalculator(double bandwidthBitsGB){


        double   bandwidthBitsMb=bandwidthBitsGB*1000*8/(30*24*3600);
        System.out.println(bandwidthBitsGB+" Gigabytes (GB) per month is equivalent to "+bandwidthBitsMb+" Mbit/s");
    }

    public static void websiteBandwidthCalculator(double pageViews,String pageViewUnit,double averagePageSize,String avgPSizeUnit,double reduntF){

        double bandwidthBitsGB=0;
        double bandwidthBitsMb=0;
        switch (avgPSizeUnit) {
            case "B":
                bandwidthBitsGB = averagePageSize/1000000000;
                break;
            case "KB":
                bandwidthBitsGB = averagePageSize/1000000;
                break;
            case "MB":
                bandwidthBitsGB = averagePageSize/1000;
                break;
            case "GB":
                bandwidthBitsGB = averagePageSize;
                break;
            case "TB":
                bandwidthBitsGB = averagePageSize* 1000L;
                break;
        }
        switch (pageViewUnit){
            case "s":
                bandwidthBitsGB= bandwidthBitsGB*30*24*3600;
                break;

            case "min":
                bandwidthBitsGB= bandwidthBitsGB*30*24*60;
                break;
            case "h":
                bandwidthBitsGB= bandwidthBitsGB*30*24;
                break;
            case"d":
                bandwidthBitsGB= bandwidthBitsGB*30;
                break;
            case "w":
                bandwidthBitsGB= bandwidthBitsGB*4;
                break;
            case "m":
                break;
            case "y":
                bandwidthBitsGB= bandwidthBitsGB/12;
                break;

        }
        bandwidthBitsGB=bandwidthBitsGB* pageViews;

        bandwidthBitsMb=bandwidthBitsGB*1000*8/(30*24*3600);
        System.out.println("Actual bandwidth needed is "+bandwidthBitsMb+" Mbits/s or "+bandwidthBitsGB+"\n GB per month" +"With redundancy factor of "+reduntF+",Actual bandwidth needed is "+(bandwidthBitsMb*reduntF)+" Mbits/s or "+(bandwidthBitsGB*reduntF)+"\n GB per month" );


    }


    /**
     * Method to convert bandwith units
     *
     * @param data
     * @param unit
     */
    public static void dataUnitConverter(double data, String unit) {
        //first converting to bits
        double bits = 0;
        switch (unit) {
            case "b":
                bits = data;
                break;
            case "kb":
                bits = 1000L * data;
                break;
            case "mb":
                bits = 1000000L * data;
                break;
            case "gb":
                bits = 1000000000L * data;
                break;
            case "tb":
                bits = 1000000000000L * data;
                break;
            case "B":
                bits = data * 8;
                break;
            case "KB":
                bits = 1000L * data * 8;
                break;
            case "MB":
                bits = 1000000L * data * 8;
                break;
            case "GB":
                bits = 1000000000L * data * 8;
                break;
            case "TB":
                bits = 1000000000000L * data * 8;

        }
        /*
        converting to all the units
         */
        System.out.println(bits + " bits (b)");
        System.out.println(bits / 1000 + " kilobits (kb)");
        System.out.println(bits / 1000000 + " megabits (mb)");
        System.out.println(bits / 1000000000 + " gigabits (gb)");
        System.out.println(bits / 1000000000000L + " terabits (tb)");

        System.out.println(bits / (8) + " bytes");
        System.out.println(bits / (1000 * 8) + " kilobits (KB)");
        System.out.println(bits / (1000000 * 8) + " kilobits (MB)");
        System.out.println(bits / (1000000000L * 8) + " kilobits (GB)");
        System.out.println(bits / (1000000000000L * 8) + " kilobits (TB)");


    }


    public static void downloadUploadTimeCalculator(long fileSize, String fileSizeUnit, long bandwidth, String bandwidthUnit) {
        long fileBits = 0;
        long bandwidthBits = 0;

        long time = 0;
        switch (fileSizeUnit) {
            case "B":
                fileBits = 8 * fileSize;
                break;
            case "KB":
                fileBits = 8 * 1000 * fileSize;
                break;
            case "MB":
                fileBits = 1000000L * fileSize * 8;
                break;
            case "GB":
                fileBits = 1000000000L * fileSize * 8;
                break;
            case "TB":
                fileBits = 1000000000000L * fileSize * 8;
        }
        switch (bandwidthUnit) {
            case "b":
                bandwidthBits = bandwidth;
                break;
            case "kb":
                bandwidthBits = 1000 * bandwidth;
                break;
            case "mb":
                bandwidthBits = 1000000L * bandwidth;
                break;
            case "gb":
                bandwidthBits = 1000000000L * bandwidth;
                break;
            case "tb":
                bandwidthBits = 1000000000000L * bandwidth;
        }
        time =  fileBits / bandwidthBits;
        long second = 0;
        long minutes = 0;
        long hours = 0;
        String strTime = "";
        if (time >= 60) {
            second = time % 60;
            minutes = time / 60;
            if (minutes >= 60) {
                hours = minutes / 60;
                minutes = minutes % 60;
            }
        } else {
            second = time;
        }

        if (second > 0) {
            strTime = second + " Seconds";
            if (minutes > 0) {
                strTime = minutes + " Minutes " + strTime;
                if (hours > 0) {
                    strTime = hours + " Hours " + strTime;
                }
            }
        }

        System.out.println(strTime);

    }

}
