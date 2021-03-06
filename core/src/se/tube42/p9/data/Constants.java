
package se.tube42.p9.data;

public final class Constants
{
    public static final int
          COUNT = 9,
          WORD_MIN_SIZE = 4,
          WORD_MAX_SIZE = 9
          ;

    public static final int
          WORD_SHORT = 0,
          WORD_INVALID = 1,
          WORD_SEEN = 2,
          WORD_NEW = 3
          ;

    public static final String
          CHARSET_ALPHA = "abcdefghijklmnopqrstuvwxyz",
          CHARSET_ALNUM = CHARSET_ALPHA + "0123456789",
          CHARSET_FULL = CHARSET_ALNUM + "%?!.,()-";
    ;


    public static final int
          COLOR_BG = 0xf3f5be,
          COLOR_FG = 0x312f2b,
          COLOR_1 = 0xc2be86,
          COLOR_2 = 0x1f8bc2,
          COLOR_3 = 0xe93c40,
          COLOR_4 = 0xeb9710
          ;


    public static final int
	ICONS_BACK = 0,
	ICONS_SEEN = 1,
	ICONS_SHUFFLE = 2,
	ICONS_DEL = 3,
	ICONS_FORWARD = 4,
	ICONS_STAR0 = 5,
	ICONS_STAR1 = 6,
	ICONS_LOCK = 7,
	ICONS_PLAY = 8,
	ICONS_HELP = 9,
	ICONS_ABOUT = 10,
	ICONS_SETTINGS = 11,
	ICONS_9 = 12,
	ICONS_9P = 13,
	ICONS_STATS = 14
	;

    public static final String ABOUT_TEXT =
	"a word puzzle i made since i love word puzzles...\n" +
          "\n" +
	"the objective is to find the 9-letter word and unlock more levels. " +
	"once you have unlocked them all, well congrats, you now know many unusual words..."
          ;
}
