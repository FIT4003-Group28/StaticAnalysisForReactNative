package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.Format;
import com.google.cardboard.sdk.R;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: pxi  reason: default package */
/* loaded from: classes4.dex */
public final class pxi {
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f;
    private static final Pattern g;
    private static HashMap h;
    private static final String[] i;
    private static final String[] j;
    private static final int[] k;
    private static final int[] l;

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2;
        String str = Build.DEVICE;
        b = str;
        String str2 = Build.MANUFACTURER;
        c = str2;
        String str3 = Build.MODEL;
        d = str3;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i2);
        e = sb.toString();
        f = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        g = Pattern.compile("%([A-Fa-f0-9]{2})");
        Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, R.styleable.AppCompatTheme_windowNoTitle, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, PrivateKeyType.INVALID, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, R.styleable.AppCompatTheme_windowMinWidthMinor, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, R.styleable.AppCompatTheme_windowFixedWidthMinor, R.styleable.AppCompatTheme_windowMinWidthMajor, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static String A(byte[] bArr) {
        return new String(bArr, amoz.c);
    }

    public static String B(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, amoz.c);
    }

    public static String C(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int length = objArr.length;
            if (i2 < length) {
                sb.append(objArr[i2].getClass().getSimpleName());
                if (i2 < length - 1) {
                    sb.append(", ");
                }
                i2++;
            } else {
                return sb.toString();
            }
        }
    }

    public static String D(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return akzj.h(networkCountryIso);
            }
        }
        return akzj.h(Locale.getDefault().getCountry());
    }

    public static String E(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        String str3 = Build.VERSION.RELEASE;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(" (Linux;Android ");
        sb.append(str3);
        sb.append(") ExoPlayerLib/2.15.0");
        return sb.toString();
    }

    public static String F(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String g2 = akzj.g(str);
        int i2 = 0;
        String str2 = aa(g2, "-")[0];
        if (h == null) {
            h = aq();
        }
        String str3 = (String) h.get(str2);
        if (str3 != null) {
            String valueOf = String.valueOf(g2.substring(str2.length()));
            g2 = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return g2;
        }
        while (true) {
            String[] strArr = j;
            int length = strArr.length;
            if (i2 >= 18) {
                return g2;
            }
            if (g2.startsWith(strArr[i2])) {
                String valueOf2 = String.valueOf(strArr[i2 + 1]);
                String valueOf3 = String.valueOf(g2.substring(strArr[i2].length()));
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            i2 += 2;
        }
    }

    public static String G(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.charAt(i4) == '%') {
                i3++;
            }
        }
        if (i3 == 0) {
            return str;
        }
        int i5 = length - (i3 + i3);
        StringBuilder sb = new StringBuilder(i5);
        Matcher matcher = g.matcher(str);
        while (i3 > 0 && matcher.find()) {
            String group = matcher.group(1);
            ptx.a(group);
            int parseInt = Integer.parseInt(group, 16);
            sb.append((CharSequence) str, i2, matcher.start());
            sb.append((char) parseInt);
            i2 = matcher.end();
            i3--;
        }
        if (i2 < length) {
            sb.append((CharSequence) str, i2, length);
        }
        if (sb.length() == i5) {
            return sb.toString();
        }
        return null;
    }

    public static ExecutorService H(String str) {
        return Executors.newSingleThreadExecutor(new pxh(str));
    }

    public static void I(asv asvVar) {
        if (asvVar != null) {
            try {
                asvVar.j();
            } catch (IOException unused) {
            }
        }
    }

    public static void J(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void K(List list, int i2, int i3) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            throw new IllegalArgumentException();
        }
        if (i2 == i3) {
            return;
        }
        list.subList(i2, i3).clear();
    }

    public static void L(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static boolean M(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean N(defpackage.pwu r3, defpackage.pwu r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.a()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            int r0 = r4.b()
            int r2 = r3.a()
            if (r0 >= r2) goto L1a
            int r0 = r3.a()
            int r0 = r0 + r0
            r4.z(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.a
            int r2 = r3.b
            int r3 = r3.a()
            r5.setInput(r0, r2, r3)
            r3 = 0
        L2d:
            byte[] r0 = r4.a     // Catch: java.lang.Throwable -> L67 java.util.zip.DataFormatException -> L6c
            int r2 = r4.b()     // Catch: java.lang.Throwable -> L67 java.util.zip.DataFormatException -> L6c
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L67 java.util.zip.DataFormatException -> L6c
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L67 java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L47
            r4.F(r3)     // Catch: java.lang.Throwable -> L67 java.util.zip.DataFormatException -> L6c
            r5.reset()
            r3 = 1
            return r3
        L47:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L67 java.util.zip.DataFormatException -> L6c
            if (r0 != 0) goto L63
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L67 java.util.zip.DataFormatException -> L6c
            if (r0 == 0) goto L54
            goto L63
        L54:
            int r0 = r4.b()     // Catch: java.lang.Throwable -> L67 java.util.zip.DataFormatException -> L6c
            if (r3 != r0) goto L2d
            int r0 = r4.b()     // Catch: java.lang.Throwable -> L67 java.util.zip.DataFormatException -> L6c
            int r0 = r0 + r0
            r4.z(r0)     // Catch: java.lang.Throwable -> L67 java.util.zip.DataFormatException -> L6c
            goto L2d
        L63:
            r5.reset()
            return r1
        L67:
            r3 = move-exception
            r5.reset()
            throw r3
        L6c:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxi.N(pwu, pwu, java.util.zip.Inflater):boolean");
    }

    public static boolean O(int i2) {
        return i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static boolean P(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static boolean Q(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean R(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static boolean S(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean T(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static byte[] U(String str) {
        return str.getBytes(amoz.c);
    }

    public static Object[] V(Object[] objArr) {
        return objArr;
    }

    public static Object[] W(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static Object[] X(Object[] objArr, int i2) {
        ptx.c(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    public static String[] Y() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] Z = a >= 24 ? Z(configuration.getLocales().toLanguageTags(), ",") : new String[]{configuration.locale.toLanguageTag()};
        for (int i2 = 0; i2 < Z.length; i2++) {
            Z[i2] = F(Z[i2]);
        }
        return Z;
    }

    public static String[] Z(String str, String str2) {
        return str.split(str2, -1);
    }

    public static float a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static String[] aa(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] ab(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : Z(str.trim(), "(\\s*,\\s*)");
    }

    public static long ac(long j2, long j3) {
        long j4 = j2 + j3;
        if (((j2 ^ j4) & (j3 ^ j4)) < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    public static int ad(List list, Comparable comparable) {
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            return binarySearch ^ (-1);
        }
        int size = list.size();
        do {
            binarySearch++;
            if (binarySearch >= size) {
                break;
            }
        } while (((Comparable) list.get(binarySearch)).compareTo(comparable) == 0);
        return binarySearch;
    }

    public static int ae(long[] jArr, long j2, boolean z) {
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            return binarySearch ^ (-1);
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j2);
        return !z ? binarySearch : binarySearch - 1;
    }

    public static int af(List list, Comparable comparable) {
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (((Comparable) list.get(binarySearch)).compareTo(comparable) == 0);
        return binarySearch + 1;
    }

    public static int ag(int[] iArr, int i2) {
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (iArr[binarySearch] == i2);
        return binarySearch;
    }

    public static int ah(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            i2 = binarySearch + 1;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static int ai(byte[] bArr, int i2) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = k[(i3 >>> 24) ^ (bArr[i4] & 255)] ^ (i3 << 8);
        }
        return i3;
    }

    public static int aj(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i2 < i3) {
            i4 = l[i4 ^ (bArr[i2] & 255)];
            i2++;
        }
        return i4;
    }

    public static Object[] ak(Object[] objArr, int i2) {
        ptx.c(true);
        ptx.c(i2 <= objArr.length);
        return Arrays.copyOfRange(objArr, 1, i2);
    }

    public static void al(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static long an(long j2, long j3) {
        long j4 = j2 - j3;
        if (((j2 ^ j4) & (j3 ^ j2)) < 0) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    public static void ao(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.toByteArray();
                return;
            }
        }
    }

    private static String ap(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            pns.e("Util", str.length() != 0 ? "Failed to read system property ".concat(str) : new String("Failed to read system property "), e2);
            return null;
        }
    }

    private static HashMap aq() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = i.length;
        HashMap hashMap = new HashMap(length + 86);
        int i2 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = i;
            int length3 = strArr.length;
            if (i2 < 86) {
                hashMap.put(strArr[i2], strArr[i2 + 1]);
                i2 += 2;
            } else {
                return hashMap;
            }
        }
    }

    public static int b(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int c(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static int d(int i2) {
        switch (i2) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static int e(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i3 : Integer.reverseBytes(i3);
    }

    public static int f(String str) {
        String[] Z;
        int length;
        int i2 = 0;
        if (str != null && (length = (Z = Z(str, "_")).length) >= 2) {
            String str2 = Z[length - 1];
            boolean z = length >= 3 && "neg".equals(Z[length + (-2)]);
            try {
                ptx.a(str2);
                i2 = Integer.parseInt(str2);
                if (z) {
                    return -i2;
                }
            } catch (NumberFormatException unused) {
            }
            return i2;
        }
        return 0;
    }

    public static int g(int i2) {
        if (i2 != 8) {
            if (i2 == 16) {
                return 2;
            }
            if (i2 == 24) {
                return 536870912;
            }
            return i2 != 32 ? 0 : 805306368;
        }
        return 3;
    }

    public static int h(int i2, int i3) {
        if (i2 != 2) {
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                if (i2 != 268435456) {
                    if (i2 == 536870912) {
                        return i3 * 3;
                    }
                    if (i2 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i3 * 4;
        }
        return i3 + i3;
    }

    public static int i(int i2) {
        if (i2 != 2) {
            if (i2 == 3) {
                return 8;
            }
            return i2 != 4 ? 3 : 4;
        }
        return 0;
    }

    public static long j(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static long k(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d2 = j2;
        double d3 = f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 * d3);
    }

    public static long l(long j2) {
        if (j2 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j2 + SystemClock.elapsedRealtime();
    }

    public static long m(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d2 = j2;
        double d3 = f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 / d3);
    }

    public static long n(long j2, long j3, long j4) {
        if (j4 < j3 || j4 % j3 != 0) {
            if (j4 < j3 && j3 % j4 == 0) {
                return j2 * (j3 / j4);
            }
            double d2 = j2;
            double d3 = j3;
            double d4 = j4;
            Double.isNaN(d3);
            Double.isNaN(d4);
            Double.isNaN(d2);
            return (long) (d2 * (d3 / d4));
        }
        return j2 / (j4 / j3);
    }

    public static long o(int i2, int i3) {
        return p(i3) | (p(i2) << 32);
    }

    public static long p(int i2) {
        return i2 & 4294967295L;
    }

    public static Point q(Context context) {
        String ap;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            ptx.a(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        int i2 = a;
        if (i2 <= 29 && display.getDisplayId() == 0 && S(context)) {
            if (!"Sony".equals(c) || !d.startsWith("BRAVIA") || !context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                if (i2 < 28) {
                    ap = ap("sys.display-size");
                } else {
                    ap = ap("vendor.display-size");
                }
                if (!TextUtils.isEmpty(ap)) {
                    try {
                        String[] Z = Z(ap.trim(), "x");
                        if (Z.length == 2) {
                            int parseInt = Integer.parseInt(Z[0]);
                            int parseInt2 = Integer.parseInt(Z[1]);
                            if (parseInt > 0 && parseInt2 > 0) {
                                return new Point(parseInt, parseInt2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                    String valueOf = String.valueOf(ap);
                    Log.e("Util", valueOf.length() != 0 ? "Invalid display size: ".concat(valueOf) : new String("Invalid display size: "));
                }
            } else {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (a < 23) {
            display.getRealSize(point);
            return point;
        }
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static Handler r(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Handler s() {
        return t(null);
    }

    public static Handler t(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        ptx.b(myLooper);
        return r(myLooper, callback);
    }

    public static Handler u() {
        return r(v(), null);
    }

    public static Looper v() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static Format w(int i2, int i3, int i4) {
        pis pisVar = new pis();
        pisVar.k = "audio/raw";
        pisVar.x = i3;
        pisVar.y = i4;
        pisVar.z = i2;
        return pisVar.a();
    }

    public static CharSequence x(CharSequence charSequence, int i2) {
        return charSequence.length() <= i2 ? charSequence : charSequence.subSequence(0, i2);
    }

    public static Object y(Object obj) {
        return obj;
    }

    public static String z(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static void am(long[] jArr, long j2) {
        int i2 = 0;
        if (j2 < 1000000 || j2 % 1000000 != 0) {
            if (j2 >= 1000000 || 1000000 % j2 != 0) {
                double d2 = j2;
                Double.isNaN(d2);
                double d3 = 1000000.0d / d2;
                while (i2 < jArr.length) {
                    double d4 = jArr[i2];
                    Double.isNaN(d4);
                    jArr[i2] = (long) (d4 * d3);
                    i2++;
                }
                return;
            }
            long j3 = 1000000 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j3;
                i2++;
            }
            return;
        }
        long j4 = j2 / 1000000;
        while (i2 < jArr.length) {
            jArr[i2] = jArr[i2] / j4;
            i2++;
        }
    }
}
