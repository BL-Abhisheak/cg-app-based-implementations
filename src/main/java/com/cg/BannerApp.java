package com.cg;

public class BannerApp {

    static public class CharacterPatternMap {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {return character;}

        public String[] getPattern() {return pattern;}
    }

    public static CharacterPatternMap[] createCharacterPatternMap() {
        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', getOPattern()),
                new CharacterPatternMap('P', getPPattern()),
                new CharacterPatternMap('S',  getSPattern())
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int patternHeight = charMaps[0].getPattern().length;

        for (int row = 0; row < patternHeight; row++) {
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                if (pattern != null)
                    System.out.print(pattern[row] + "  ");
            }
            System.out.println();
        }
    }


    public static String[] getOPattern() {
        return new String[]
                {
                        "   ***   ",
                        " **   ** ",
                        "**     **",
                        "**     **",
                        "**     **",
                        "**     **",
                        "**     **",
                        " **   ** ",
                        "   ***   "
                };
    }

    public static String[] getPPattern() {
        return new String[]
                {
                        "******   ",
                        "**    ** ",
                        "**     **",
                        "**    ** ",
                        "******   ",
                        "**       ",
                        "**       ",
                        "**       ",
                        "**       "
                };
    }

    public static String[] getSPattern() {
        return new String[]
                {
                        "   ***** ",
                        " **      ",
                        "**       ",
                        " **      ",
                        "   ***   ",
                        "      ** ",
                        "       **",
                        "      ** ",
                        " *****   "
                };
    }

    public static void main(String[] args) {
        CharacterPatternMap[] maps = createCharacterPatternMap();
        String message = "OOPS";
        printMessage(message, maps);
    }
}
