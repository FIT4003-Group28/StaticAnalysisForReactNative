package defpackage;

import android.text.TextUtils;
import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cmnf  reason: default package */
/* loaded from: classes5.dex */
public final class cmnf {
    private static final ArrayList<cmnd> a = new ArrayList<>();
    private static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str) {
        return "audio".equals(k(str));
    }

    public static boolean b(String str) {
        return "video".equals(k(str));
    }

    public static boolean c(String str) {
        return "text".equals(k(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static String e(String str) {
        cmne j;
        String x = cmny.x(str.trim());
        if (x.startsWith("avc1") || x.startsWith("avc3")) {
            return "video/avc";
        }
        if (x.startsWith("hev1") || x.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (x.startsWith("dvav") || x.startsWith("dva1") || x.startsWith("dvhe") || x.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (x.startsWith("av01")) {
            return "video/av01";
        }
        if (x.startsWith("vp9") || x.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (x.startsWith("vp8") || x.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        String str2 = null;
        if (x.startsWith("mp4a")) {
            if (x.startsWith("mp4a.") && (j = j(x)) != null) {
                str2 = f(j.a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (x.startsWith("ac-3") || x.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (x.startsWith("ec-3") || x.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (x.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (x.startsWith("ac-4") || x.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (x.startsWith("dtsc") || x.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (x.startsWith("dtsh") || x.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (x.startsWith("opus")) {
                return "audio/opus";
            }
            if (x.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (x.startsWith("flac")) {
                return "audio/flac";
            }
            if (x.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (x.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (x.contains("cea708")) {
                return "application/cea-708";
            }
            if (x.contains("eia608") || x.contains("cea608")) {
                return "application/cea-608";
            }
            int size = a.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                cmnd cmndVar = a.get(i);
                String str3 = cmndVar.b;
                if (x.startsWith(null)) {
                    String str4 = cmndVar.a;
                    break;
                }
                i++;
            }
            return null;
        }
    }

    public static String f(int i) {
        if (i != 32) {
            if (i == 33) {
                return "video/avc";
            }
            if (i == 35) {
                return "video/hevc";
            }
            if (i == 64) {
                return "audio/mp4a-latm";
            }
            if (i == 163) {
                return "video/wvc1";
            }
            if (i == 177) {
                return "video/x-vnd.on2.vp9";
            }
            if (i == 165) {
                return "audio/ac3";
            }
            if (i == 166) {
                return "audio/eac3";
            }
            switch (i) {
                case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                case 100:
                case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                    return "video/mpeg2";
                case 102:
                case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                case 104:
                    return "audio/mp4a-latm";
                case 105:
                case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                    return "audio/mpeg";
                case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                    return "video/mpeg";
                default:
                    switch (i) {
                        case 169:
                        case 172:
                            return "audio/vnd.dts";
                        case 170:
                        case 171:
                            return "audio/vnd.dts.hd";
                        case 173:
                            return "audio/opus";
                        case 174:
                            return "audio/ac4";
                        default:
                            return null;
                    }
            }
        }
        return "video/mp4v-es";
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (a(str)) {
            return 1;
        }
        if (b(str)) {
            return 2;
        }
        if (c(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = a.size();
        for (int i = 0; i < size; i++) {
            cmnd cmndVar = a.get(i);
            String str2 = cmndVar.a;
            if (str.equals(null)) {
                int i2 = cmndVar.c;
                return 0;
            }
        }
        return -1;
    }

    public static String i(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1007807498) {
            if (str.equals("audio/x-flac")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -586683234) {
            if (hashCode == 187090231 && str.equals("audio/mp3")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("audio/x-wav")) {
                c = 2;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? str : "audio/wav" : "audio/mpeg" : "audio/flac";
    }

    static cmne j(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        cmmn.f(group);
        String group2 = matcher.group(2);
        try {
            return new cmne(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String k(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean d(String str, String str2) {
        char c;
        cmne j;
        int c2;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return true;
            case '\n':
                return (str2 == null || (j = j(str2)) == null || (c2 = clqy.c(j.b)) == 0 || c2 == 16) ? false : true;
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int h(String str, String str2) {
        char c;
        cmne j;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 9;
            case 1:
                if (str2 != null && (j = j(str2)) != null) {
                    return clqy.c(j.b);
                }
                return 0;
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 18;
            case 5:
                return 17;
            case 6:
                return 7;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }
}
