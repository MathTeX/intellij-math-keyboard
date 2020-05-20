package net.mlcoder.unimath.category;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombininingMark implements UniCode {
    public static final List<UniCode> symbols = new ArrayList<>();

    public final String desc;
    public final int codePoint;
    public final String chars;
    public final String generalCategory;
    public final int combiningClass;
    public final String[] tokenized;

    @Nullable
    public final String latex;

    @Nullable
    public final String ulatex;

    @Nullable
    public final String mathCategory;

    @Override
    public String desc() {
        return desc;
    }

    @Override
    public int codePoint() {
        return codePoint;
    }

    @Override
    public String chars() {
        return chars;
    }

    @Override
    public String generalCategory() {
        return generalCategory;
    }

    @Override
    public int combiningClass() {
        return combiningClass;
    }

    @Override @Nullable
    public String latex() {
        return latex;
    }

    @Override @Nullable
    public String ulatex() {
        return ulatex;
    }

    @Override @Nullable
    public String mathCategory() {
        return mathCategory;
    }

    @Override @Nullable
    public String[] tokenized() {
        return tokenized;
    }

    CombininingMark(int codePoint, String desc, String chars, String generalCategory, int combiningClass) {
        this(codePoint, desc, chars, generalCategory, combiningClass, null, null, null);
    }

    CombininingMark(int codePoint, String desc, String chars, String generalCategory, int combiningClass,
                 @Nullable String latex, @Nullable String ulatex, @Nullable String mathCategory) {
        this.codePoint = codePoint;
        this.desc = desc;
        this.generalCategory = generalCategory;
        this.combiningClass = combiningClass;
        this.chars = chars;
        this.latex = latex;
        this.ulatex = ulatex;
        this.mathCategory = mathCategory;
        this.tokenized = Arrays.stream(desc.split(" "))
            .filter(s -> s.length() != 0).toArray(String[]::new);
    }

    @Override
    public String toString() {
        return "[(CombininingMark)]{" +
            "codePoint=" + codePoint +
            ", desc='" + desc + '\'' +
            ", chars='" + chars + '\'' +
            ", generalCategory='" + generalCategory + '\'' +
            ", combiningClass=" + combiningClass +
            ", latex='" + latex + '\'' +
            ", ulatex='" + ulatex + '\'' +
        '}';
    }

    static {
        symbols.add(new CombininingMark(0x300, "combining grave accent", "̀", "Mn", 230, "\\grave", null, null));
        symbols.add(new CombininingMark(0x301, "combining acute accent", "́", "Mn", 230, "\\acute", null, null));
        symbols.add(new CombininingMark(0x302, "combining circumflex accent", "̂", "Mn", 230, "\\hat", "\\widehat", null));
        symbols.add(new CombininingMark(0x303, "combining tilde", "̃", "Mn", 230, "\\tilde", "\\widetilde", null));
        symbols.add(new CombininingMark(0x304, "combining macron", "̄", "Mn", 230, "\\bar", null, null));
        symbols.add(new CombininingMark(0x305, "combining overline", "̅", "Mn", 230, "\\overline", "\\wideoverbar", null));
        symbols.add(new CombininingMark(0x306, "combining breve", "̆", "Mn", 230, "\\breve", "\\widebreve", null));
        symbols.add(new CombininingMark(0x307, "combining dot above", "̇", "Mn", 230, "\\dot", null, null));
        symbols.add(new CombininingMark(0x308, "combining diaeresis", "̈", "Mn", 230, "\\ddot", null, null));
        symbols.add(new CombininingMark(0x309, "combining hook above", "̉", "Mn", 230, null, "\\ovhook", null));
        symbols.add(new CombininingMark(0x30A, "combining ring above", "̊", "Mn", 230, "\\mathring", "\\ocirc", null));
        symbols.add(new CombininingMark(0x30B, "combining double acute accent", "̋", "Mn", 230));
        symbols.add(new CombininingMark(0x30C, "combining caron", "̌", "Mn", 230, "\\check", "\\widecheck", null));
        symbols.add(new CombininingMark(0x30D, "combining vertical line above", "̍", "Mn", 230));
        symbols.add(new CombininingMark(0x30E, "combining double vertical line above", "̎", "Mn", 230));
        symbols.add(new CombininingMark(0x30F, "combining double grave accent", "̏", "Mn", 230));
        symbols.add(new CombininingMark(0x310, "combining candrabindu", "̐", "Mn", 230, null, "\\candra", null));
        symbols.add(new CombininingMark(0x311, "combining inverted breve", "̑", "Mn", 230));
        symbols.add(new CombininingMark(0x312, "combining turned comma above", "̒", "Mn", 230, null, "\\oturnedcomma", null));
        symbols.add(new CombininingMark(0x313, "combining comma above", "̓", "Mn", 230));
        symbols.add(new CombininingMark(0x314, "combining reversed comma above", "̔", "Mn", 230));
        symbols.add(new CombininingMark(0x315, "combining comma above right", "̕", "Mn", 232, null, "\\ocommatopright", null));
        symbols.add(new CombininingMark(0x316, "combining grave accent below", "̖", "Mn", 220));
        symbols.add(new CombininingMark(0x317, "combining acute accent below", "̗", "Mn", 220));
        symbols.add(new CombininingMark(0x318, "combining left tack below", "̘", "Mn", 220));
        symbols.add(new CombininingMark(0x319, "combining right tack below", "̙", "Mn", 220));
        symbols.add(new CombininingMark(0x31A, "combining left angle above", "̚", "Mn", 232, null, "\\droang", null));
        symbols.add(new CombininingMark(0x31B, "combining horn", "̛", "Mn", 216));
        symbols.add(new CombininingMark(0x31C, "combining left half ring below", "̜", "Mn", 220));
        symbols.add(new CombininingMark(0x31D, "combining up tack below", "̝", "Mn", 220));
        symbols.add(new CombininingMark(0x31E, "combining down tack below", "̞", "Mn", 220));
        symbols.add(new CombininingMark(0x31F, "combining plus sign below", "̟", "Mn", 220));
        symbols.add(new CombininingMark(0x320, "combining minus sign below", "̠", "Mn", 220));
        symbols.add(new CombininingMark(0x321, "combining palatalized hook below", "̡", "Mn", 202));
        symbols.add(new CombininingMark(0x322, "combining retroflex hook below", "̢", "Mn", 202));
        symbols.add(new CombininingMark(0x323, "combining dot below", "̣", "Mn", 220));
        symbols.add(new CombininingMark(0x324, "combining diaeresis below", "̤", "Mn", 220));
        symbols.add(new CombininingMark(0x325, "combining ring below", "̥", "Mn", 220));
        symbols.add(new CombininingMark(0x326, "combining comma below", "̦", "Mn", 220));
        symbols.add(new CombininingMark(0x327, "combining cedilla", "̧", "Mn", 202));
        symbols.add(new CombininingMark(0x328, "combining ogonek", "̨", "Mn", 202));
        symbols.add(new CombininingMark(0x329, "combining vertical line below", "̩", "Mn", 220));
        symbols.add(new CombininingMark(0x32A, "combining bridge below", "̪", "Mn", 220));
        symbols.add(new CombininingMark(0x32B, "combining inverted double arch below", "̫", "Mn", 220));
        symbols.add(new CombininingMark(0x32C, "combining caron below", "̬", "Mn", 220));
        symbols.add(new CombininingMark(0x32D, "combining circumflex accent below", "̭", "Mn", 220));
        symbols.add(new CombininingMark(0x32E, "combining breve below", "̮", "Mn", 220));
        symbols.add(new CombininingMark(0x32F, "combining inverted breve below", "̯", "Mn", 220));
        symbols.add(new CombininingMark(0x330, "combining tilde below", "̰", "Mn", 220, "\\utilde", "\\wideutilde", null));
        symbols.add(new CombininingMark(0x331, "combining macron below", "̱", "Mn", 220, "\\underbar", null, null));
        symbols.add(new CombininingMark(0x332, "combining low line", "̲", "Mn", 220, "\\underline", "\\mathunderbar", null));
        symbols.add(new CombininingMark(0x333, "combining double low line", "̳", "Mn", 220));
        symbols.add(new CombininingMark(0x334, "combining tilde overlay", "̴", "Mn", 1));
        symbols.add(new CombininingMark(0x335, "combining short stroke overlay", "̵", "Mn", 1));
        symbols.add(new CombininingMark(0x336, "combining long stroke overlay", "̶", "Mn", 1));
        symbols.add(new CombininingMark(0x337, "combining short solidus overlay", "̷", "Mn", 1));
        symbols.add(new CombininingMark(0x338, "combining long solidus overlay", "̸", "Mn", 1, "\\not", "\\notaccent", null));
        symbols.add(new CombininingMark(0x339, "combining right half ring below", "̹", "Mn", 220));
        symbols.add(new CombininingMark(0x33A, "combining inverted bridge below", "̺", "Mn", 220));
        symbols.add(new CombininingMark(0x33B, "combining square below", "̻", "Mn", 220));
        symbols.add(new CombininingMark(0x33C, "combining seagull below", "̼", "Mn", 220));
        symbols.add(new CombininingMark(0x33D, "combining x above", "̽", "Mn", 230));
        symbols.add(new CombininingMark(0x33E, "combining vertical tilde", "̾", "Mn", 230));
        symbols.add(new CombininingMark(0x33F, "combining double overline", "̿", "Mn", 230));
        symbols.add(new CombininingMark(0x340, "combining grave tone mark", "̀", "Mn", 230));
        symbols.add(new CombininingMark(0x341, "combining acute tone mark", "́", "Mn", 230));
        symbols.add(new CombininingMark(0x342, "combining perispomeni", "͂", "Mn", 230));
        symbols.add(new CombininingMark(0x343, "combining koronis", "̓", "Mn", 230));
        symbols.add(new CombininingMark(0x344, "combining dialytika tonos", "̈́", "Mn", 230));
        symbols.add(new CombininingMark(0x345, "combining ypogegrammeni", "ͅ", "Mn", 240));
        symbols.add(new CombininingMark(0x346, "combining bridge above", "͆", "Mn", 230));
        symbols.add(new CombininingMark(0x347, "combining equals sign below", "͇", "Mn", 220));
        symbols.add(new CombininingMark(0x348, "combining double vertical line below", "͈", "Mn", 220));
        symbols.add(new CombininingMark(0x349, "combining left angle below", "͉", "Mn", 220));
        symbols.add(new CombininingMark(0x34A, "combining not tilde above", "͊", "Mn", 230));
        symbols.add(new CombininingMark(0x34B, "combining homothetic above", "͋", "Mn", 230));
        symbols.add(new CombininingMark(0x34C, "combining almost equal to above", "͌", "Mn", 230));
        symbols.add(new CombininingMark(0x34D, "combining left right arrow below", "͍", "Mn", 220, null, "\\underleftrightarrow", null));
        symbols.add(new CombininingMark(0x34E, "combining upwards arrow below", "͎", "Mn", 220));
        symbols.add(new CombininingMark(0x34F, "combining grapheme joiner", "͏", "Mn", 0));
        symbols.add(new CombininingMark(0x350, "combining right arrowhead above", "͐", "Mn", 230));
        symbols.add(new CombininingMark(0x351, "combining left half ring above", "͑", "Mn", 230));
        symbols.add(new CombininingMark(0x352, "combining fermata", "͒", "Mn", 230));
        symbols.add(new CombininingMark(0x353, "combining x below", "͓", "Mn", 220));
        symbols.add(new CombininingMark(0x354, "combining left arrowhead below", "͔", "Mn", 220));
        symbols.add(new CombininingMark(0x355, "combining right arrowhead below", "͕", "Mn", 220));
        symbols.add(new CombininingMark(0x356, "combining right arrowhead and up arrowhead below", "͖", "Mn", 220));
        symbols.add(new CombininingMark(0x357, "combining right half ring above", "͗", "Mn", 230));
        symbols.add(new CombininingMark(0x358, "combining dot above right", "͘", "Mn", 232));
        symbols.add(new CombininingMark(0x359, "combining asterisk below", "͙", "Mn", 220));
        symbols.add(new CombininingMark(0x35A, "combining double ring below", "͚", "Mn", 220));
        symbols.add(new CombininingMark(0x35B, "combining zigzag above", "͛", "Mn", 230));
        symbols.add(new CombininingMark(0x35C, "combining double breve below", "͜", "Mn", 233));
        symbols.add(new CombininingMark(0x35D, "combining double breve", "͝", "Mn", 234));
        symbols.add(new CombininingMark(0x35E, "combining double macron", "͞", "Mn", 234));
        symbols.add(new CombininingMark(0x35F, "combining double macron below", "͟", "Mn", 233));
        symbols.add(new CombininingMark(0x360, "combining double tilde", "͠", "Mn", 234));
        symbols.add(new CombininingMark(0x361, "combining double inverted breve", "͡", "Mn", 234));
        symbols.add(new CombininingMark(0x362, "combining double rightwards arrow below", "͢", "Mn", 233));
        symbols.add(new CombininingMark(0x363, "combining a", "ͣ", "Mn", 230));
        symbols.add(new CombininingMark(0x364, "combining e", "ͤ", "Mn", 230));
        symbols.add(new CombininingMark(0x365, "combining i", "ͥ", "Mn", 230));
        symbols.add(new CombininingMark(0x366, "combining o", "ͦ", "Mn", 230));
        symbols.add(new CombininingMark(0x367, "combining u", "ͧ", "Mn", 230));
        symbols.add(new CombininingMark(0x368, "combining c", "ͨ", "Mn", 230));
        symbols.add(new CombininingMark(0x369, "combining d", "ͩ", "Mn", 230));
        symbols.add(new CombininingMark(0x36A, "combining h", "ͪ", "Mn", 230));
        symbols.add(new CombininingMark(0x36B, "combining m", "ͫ", "Mn", 230));
        symbols.add(new CombininingMark(0x36C, "combining r", "ͬ", "Mn", 230));
        symbols.add(new CombininingMark(0x36D, "combining t", "ͭ", "Mn", 230));
        symbols.add(new CombininingMark(0x36E, "combining v", "ͮ", "Mn", 230));
        symbols.add(new CombininingMark(0x36F, "combining x", "ͯ", "Mn", 230));
        symbols.add(new CombininingMark(0x1AB0, "combining doubled circumflex accent", "᪰", "Mn", 230));
        symbols.add(new CombininingMark(0x1AB1, "combining diaeresis-ring", "᪱", "Mn", 230));
        symbols.add(new CombininingMark(0x1AB2, "combining infinity", "᪲", "Mn", 230));
        symbols.add(new CombininingMark(0x1AB3, "combining downwards arrow", "᪳", "Mn", 230));
        symbols.add(new CombininingMark(0x1AB4, "combining triple dot", "᪴", "Mn", 230));
        symbols.add(new CombininingMark(0x1AB5, "combining x-x below", "᪵", "Mn", 220));
        symbols.add(new CombininingMark(0x1AB6, "combining wiggly line below", "᪶", "Mn", 220));
        symbols.add(new CombininingMark(0x1AB7, "combining open mark below", "᪷", "Mn", 220));
        symbols.add(new CombininingMark(0x1AB8, "combining double open mark below", "᪸", "Mn", 220));
        symbols.add(new CombininingMark(0x1AB9, "combining light centralization stroke below", "᪹", "Mn", 220));
        symbols.add(new CombininingMark(0x1ABA, "combining strong centralization stroke below", "᪺", "Mn", 220));
        symbols.add(new CombininingMark(0x1ABB, "combining parentheses above", "᪻", "Mn", 230));
        symbols.add(new CombininingMark(0x1ABC, "combining double parentheses above", "᪼", "Mn", 230));
        symbols.add(new CombininingMark(0x1ABD, "combining parentheses below", "᪽", "Mn", 220));
        symbols.add(new CombininingMark(0x1ABE, "combining parentheses overlay", "᪾", "Me", 0));
        symbols.add(new CombininingMark(0x1ABF, "combining w below", "ᪿ", "Mn", 220));
        symbols.add(new CombininingMark(0x1AC0, "combining latin small turned w below", "ᫀ", "Mn", 220));
        symbols.add(new CombininingMark(0x1DC0, "combining dotted grave accent", "᷀", "Mn", 230));
        symbols.add(new CombininingMark(0x1DC1, "combining dotted acute accent", "᷁", "Mn", 230));
        symbols.add(new CombininingMark(0x1DC2, "combining snake below", "᷂", "Mn", 220));
        symbols.add(new CombininingMark(0x1DC3, "combining suspension mark", "᷃", "Mn", 230));
        symbols.add(new CombininingMark(0x1DC4, "combining macron-acute", "᷄", "Mn", 230));
        symbols.add(new CombininingMark(0x1DC5, "combining grave-macron", "᷅", "Mn", 230));
        symbols.add(new CombininingMark(0x1DC6, "combining macron-grave", "᷆", "Mn", 230));
        symbols.add(new CombininingMark(0x1DC7, "combining acute-macron", "᷇", "Mn", 230));
        symbols.add(new CombininingMark(0x1DC8, "combining grave-acute-grave", "᷈", "Mn", 230));
        symbols.add(new CombininingMark(0x1DC9, "combining acute-grave-acute", "᷉", "Mn", 230));
        symbols.add(new CombininingMark(0x1DCA, "combining r below", "᷊", "Mn", 220));
        symbols.add(new CombininingMark(0x1DCB, "combining breve-macron", "᷋", "Mn", 230));
        symbols.add(new CombininingMark(0x1DCC, "combining macron-breve", "᷌", "Mn", 230));
        symbols.add(new CombininingMark(0x1DCD, "combining double circumflex above", "᷍", "Mn", 234));
        symbols.add(new CombininingMark(0x1DCE, "combining ogonek above", "᷎", "Mn", 214));
        symbols.add(new CombininingMark(0x1DCF, "combining zigzag below", "᷏", "Mn", 220));
        symbols.add(new CombininingMark(0x1DD0, "combining is below", "᷐", "Mn", 202));
        symbols.add(new CombininingMark(0x1DD1, "combining ur above", "᷑", "Mn", 230));
        symbols.add(new CombininingMark(0x1DD2, "combining us above", "᷒", "Mn", 230));
        symbols.add(new CombininingMark(0x1DD3, "combining latin small flattened open a above", "ᷓ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DD4, "combining latin small ae", "ᷔ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DD5, "combining latin small ao", "ᷕ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DD6, "combining latin small av", "ᷖ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DD7, "combining c cedilla", "ᷗ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DD8, "combining latin small insular d", "ᷘ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DD9, "combining latin small eth", "ᷙ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DDA, "combining g", "ᷚ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DDB, "combining latin G", "ᷛ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DDC, "combining k", "ᷜ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DDD, "combining l", "ᷝ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DDE, "combining latin L", "ᷞ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DDF, "combining latin M", "ᷟ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DE0, "combining n", "ᷠ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DE1, "combining latin N", "ᷡ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DE2, "combining latin R", "ᷢ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DE3, "combining r rotunda", "ᷣ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DE4, "combining s", "ᷤ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DE5, "combining latin small long s", "ᷥ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DE6, "combining z", "ᷦ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DE7, "combining latin small alpha", "ᷧ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DE8, "combining b", "ᷨ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DE9, "combining latin small beta", "ᷩ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DEA, "combining latin small schwa", "ᷪ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DEB, "combining f", "ᷫ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DEC, "combining l with double middle tilde", "ᷬ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DED, "combining o with light centralization stroke", "ᷭ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DEE, "combining p", "ᷮ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DEF, "combining latin small esh", "ᷯ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DF0, "combining u with light centralization stroke", "ᷰ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DF1, "combining w", "ᷱ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DF2, "combining a with diaeresis", "ᷲ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DF3, "combining o with diaeresis", "ᷳ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DF4, "combining u with diaeresis", "ᷴ", "Mn", 230));
        symbols.add(new CombininingMark(0x1DF5, "combining up tack above", "᷵", "Mn", 230));
        symbols.add(new CombininingMark(0x1DF6, "combining kavyka above right", "᷶", "Mn", 232));
        symbols.add(new CombininingMark(0x1DF7, "combining kavyka above left", "᷷", "Mn", 228));
        symbols.add(new CombininingMark(0x1DF8, "combining dot above left", "᷸", "Mn", 228));
        symbols.add(new CombininingMark(0x1DF9, "combining wide inverted bridge below", "᷹", "Mn", 220));
        symbols.add(new CombininingMark(0x1DFB, "combining deletion mark", "᷻", "Mn", 230));
        symbols.add(new CombininingMark(0x1DFC, "combining double inverted breve below", "᷼", "Mn", 233));
        symbols.add(new CombininingMark(0x1DFD, "combining almost equal to below", "᷽", "Mn", 220));
        symbols.add(new CombininingMark(0x1DFE, "combining left arrowhead above", "᷾", "Mn", 230));
        symbols.add(new CombininingMark(0x1DFF, "combining right arrowhead and down arrowhead below", "᷿", "Mn", 220));
        symbols.add(new CombininingMark(0x20D0, "combining left harpoon above", "⃐", "Mn", 230, "\\lvec", "\\overleftharpoon", null));
        symbols.add(new CombininingMark(0x20D1, "combining right harpoon above", "⃑", "Mn", 230, "\\vec", "\\overrightharpoon", null));
        symbols.add(new CombininingMark(0x20D2, "combining long vertical line overlay", "⃒", "Mn", 1, null, "\\vertoverlay", null));
        symbols.add(new CombininingMark(0x20D3, "combining short vertical line overlay", "⃓", "Mn", 1));
        symbols.add(new CombininingMark(0x20D4, "combining anticlockwise arrow above", "⃔", "Mn", 230));
        symbols.add(new CombininingMark(0x20D5, "combining clockwise arrow above", "⃕", "Mn", 230));
        symbols.add(new CombininingMark(0x20D6, "combining left arrow above", "⃖", "Mn", 230, "\\LVec", "\\overleftarrow", null));
        symbols.add(new CombininingMark(0x20D7, "combining right arrow above", "⃗", "Mn", 230, "\\vec", null, null));
        symbols.add(new CombininingMark(0x20D8, "combining ring overlay", "⃘", "Mn", 1));
        symbols.add(new CombininingMark(0x20D9, "combining clockwise ring overlay", "⃙", "Mn", 1));
        symbols.add(new CombininingMark(0x20DA, "combining anticlockwise ring overlay", "⃚", "Mn", 1));
        symbols.add(new CombininingMark(0x20DB, "combining three dots above", "⃛", "Mn", 230, "\\dddot", null, null));
        symbols.add(new CombininingMark(0x20DC, "combining four dots above", "⃜", "Mn", 230, "\\ddddot", null, null));
        symbols.add(new CombininingMark(0x20DD, "combining enclosing circle", "⃝", "Me", 0, null, "\\enclosecircle", null));
        symbols.add(new CombininingMark(0x20DE, "combining enclosing square", "⃞", "Me", 0, null, "\\enclosesquare", null));
        symbols.add(new CombininingMark(0x20DF, "combining enclosing diamond", "⃟", "Me", 0, null, "\\enclosediamond", null));
        symbols.add(new CombininingMark(0x20E0, "combining enclosing circle backslash", "⃠", "Me", 0));
        symbols.add(new CombininingMark(0x20E1, "combining left right arrow above", "⃡", "Mn", 230, "\\overleftrightarrow", null, null));
        symbols.add(new CombininingMark(0x20E2, "combining enclosing screen", "⃢", "Me", 0));
        symbols.add(new CombininingMark(0x20E3, "combining enclosing keycap", "⃣", "Me", 0));
        symbols.add(new CombininingMark(0x20E4, "combining enclosing upward pointing triangle", "⃤", "Me", 0, null, "\\enclosetriangle", null));
        symbols.add(new CombininingMark(0x20E5, "combining reverse solidus overlay", "⃥", "Mn", 1));
        symbols.add(new CombininingMark(0x20E6, "combining double vertical stroke overlay", "⃦", "Mn", 1));
        symbols.add(new CombininingMark(0x20E7, "combining annuity", "⃧", "Mn", 230, null, "\\annuity", null));
        symbols.add(new CombininingMark(0x20E8, "combining triple underdot", "⃨", "Mn", 220, null, "\\threeunderdot", null));
        symbols.add(new CombininingMark(0x20E9, "combining wide bridge above", "⃩", "Mn", 230, null, "\\widebridgeabove", null));
        symbols.add(new CombininingMark(0x20EA, "combining leftwards arrow overlay", "⃪", "Mn", 1));
        symbols.add(new CombininingMark(0x20EB, "combining long double solidus overlay", "⃫", "Mn", 1));
        symbols.add(new CombininingMark(0x20EC, "combining rightwards harpoon with barb downwards", "⃬", "Mn", 220, null, "\\underrightharpoondown", null));
        symbols.add(new CombininingMark(0x20ED, "combining leftwards harpoon with barb downwards", "⃭", "Mn", 220, null, "\\underleftharpoondown", null));
        symbols.add(new CombininingMark(0x20EE, "combining left arrow below", "⃮", "Mn", 220, "\\underleftarrow", null, null));
        symbols.add(new CombininingMark(0x20EF, "combining right arrow below", "⃯", "Mn", 220, "\\underrightarrow", null, null));
        symbols.add(new CombininingMark(0x20F0, "combining asterisk above", "⃰", "Mn", 230, null, "\\asteraccent", null));
    }
}