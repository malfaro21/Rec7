/**
 * Recitation7 is a class for completing
 *  Reciation 7 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class Recitation7
{

    // define your constants after this comment
    public static void main(String[] args){
        System.out.println(Recitation7.leftRightTriangle(5));
    }


    private static String repString(char aChar, int numOfRep){
        String str  = "";
        for (int count = 0; count < numOfRep; count++){
            str += aChar;
        }
        return str;
    }
    public static String leftRightTriangle(int height)
    {
        String str = "";
        for (int row = 0; row < height; row++)
        {
            str += repString('*', row+1) + "\n";
        }


        return str;
    }

    public static String rightRightTriangle(int height)
    {
        String str = "";
        int counter = 1;
        for(int row = height - 1; row >= 0; row--){
            for(int x = 0; x<row; x++){
                str += ' ';
            }
            str += repString('*',counter) + "\n";
            counter +=1;

        }
        return str;
    }

    public static String circle(int radius)
    {
        String str = "";
        for(int row = radius; row >=-(radius-1); row-- ){
            int XandYproduct = (int) Math.sqrt(radius*radius-row*row);
            int theNegAndPosAxis = XandYproduct *2;
            int spacesOnBoth = (radius*2 - theNegAndPosAxis);
            if(spacesOnBoth == radius*2){
                str +="";
            }
            else {
                for (int spaceOnOneSide =0;spaceOnOneSide< spacesOnBoth/2;spaceOnOneSide++ ){
                    str+=" ";
                }
                for(int x = theNegAndPosAxis; x*2 > 0; x--){
                    str += '*';
                }
                str+="\n";
            }



        }
        return str;
    }
}
