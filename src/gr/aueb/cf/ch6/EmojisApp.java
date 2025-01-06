package gr.aueb.cf.ch6;
//prints emojis

public class EmojisApp {
    public static void main(String[] args) {
        int emojiStart = 0x1F600; //https://russellcottrell.com/greek/utilities/SurrogatePairCalculator.htm
        int emojiEnd = 0x1F64F;
        int counter = 0;
        int emoji;

        emoji = emojiStart;
        while (emoji < emojiEnd) {
            System.out.print(Character.toChars(emoji));
            System.out.print(" ");
            emoji++;
            counter++;
            if (counter % 16 == 0) {
                 System.out.println();
            }
        }
    }
}
