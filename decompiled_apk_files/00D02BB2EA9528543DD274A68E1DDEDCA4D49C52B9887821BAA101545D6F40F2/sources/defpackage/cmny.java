package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.Format;
import com.google.android.filament.R;
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
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cmny  reason: default package */
/* loaded from: classes5.dex */
public final class cmny {
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f;
    private static final Pattern g;
    private static HashMap<String, String> h;
    private static final String[] i;
    private static final String[] j;
    private static final int[] k;
    private static final int[] l;

    public static int A(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int B(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long C(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static float D(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static long E(long j2, long j3, long j4) {
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

    public static long F(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d2 = j2;
        double d3 = f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 * d3);
    }

    public static long G(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d2 = j2;
        double d3 = f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 / d3);
    }

    public static long H(int i2) {
        return i2 & 4294967295L;
    }

    public static long I(int i2, int i3) {
        return H(i3) | (H(i2) << 32);
    }

    public static CharSequence J(CharSequence charSequence, int i2) {
        return charSequence.length() <= i2 ? charSequence : charSequence.subSequence(0, i2);
    }

    public static String K(Object[] objArr) {
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

    public static Format L(int i2, int i3, int i4) {
        clnf clnfVar = new clnf();
        clnfVar.k = "audio/raw";
        clnfVar.x = i3;
        clnfVar.y = i4;
        clnfVar.z = i2;
        return clnfVar.a();
    }

    public static int M(int i2) {
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

    public static boolean N(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static boolean O(int i2) {
        return i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static int P(int i2) {
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
                int i3 = a;
                return (i3 < 23 && i3 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int Q(int i2, int i3) {
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

    public static String R(String str) {
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
            cmmn.f(group);
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

    public static int S(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i3 : Integer.reverseBytes(i3);
    }

    public static int T(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type != 4 && type != 5) {
                    if (type == 6) {
                        return 5;
                    }
                    return type != 9 ? 8 : 7;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                    return 3;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 4;
                case 13:
                    return 5;
                case 16:
                case 19:
                default:
                    return 6;
                case 18:
                    return 2;
                case 20:
                    return a < 29 ? 0 : 9;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static String U(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return y(networkCountryIso);
            }
        }
        return y(Locale.getDefault().getCountry());
    }

    public static String[] V() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] u = a >= 24 ? u(configuration.getLocales().toLanguageTags(), ",") : new String[]{p(configuration.locale)};
        for (int i2 = 0; i2 < u.length; i2++) {
            u[i2] = q(u[i2]);
        }
        return u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean W(defpackage.cmnk r4, defpackage.cmnk r5, java.util.zip.Inflater r6) {
        /*
            int r0 = r4.d()
            r1 = 0
            if (r0 <= 0) goto L61
            byte[] r0 = r5.a
            int r2 = r0.length
            int r3 = r4.d()
            if (r2 >= r3) goto L17
            int r0 = r4.d()
            int r0 = r0 + r0
            byte[] r0 = new byte[r0]
        L17:
            if (r6 != 0) goto L1e
            java.util.zip.Inflater r6 = new java.util.zip.Inflater
            r6.<init>()
        L1e:
            byte[] r2 = r4.a
            int r3 = r4.b
            int r4 = r4.d()
            r6.setInput(r2, r3, r4)
            r4 = 0
        L2a:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r3 = r2 - r4
            int r3 = r6.inflate(r0, r4, r3)     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            int r4 = r4 + r3
            boolean r3 = r6.finished()     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            if (r3 == 0) goto L40
            r5.c(r0, r4)     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            r6.reset()
            r4 = 1
            return r4
        L40:
            boolean r3 = r6.needsDictionary()     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            if (r3 != 0) goto L55
            boolean r3 = r6.needsInput()     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            if (r3 == 0) goto L4d
            goto L55
        L4d:
            if (r4 != r2) goto L2a
            int r2 = r2 + r2
            byte[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.lang.Throwable -> L59 java.util.zip.DataFormatException -> L5e
            goto L2a
        L55:
            r6.reset()
            return r1
        L59:
            r4 = move-exception
            r6.reset()
            throw r4
        L5e:
            r6.reset()
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmny.W(cmnk, cmnk, java.util.zip.Inflater):boolean");
    }

    public static boolean X(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Point Y(Context context) {
        String ao;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        cmmn.f(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        int i2 = a;
        if (i2 <= 29 && defaultDisplay.getDisplayId() == 0 && X(context)) {
            if (!"Sony".equals(c) || !d.startsWith("BRAVIA") || !context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                if (i2 < 28) {
                    ao = ao("sys.display-size");
                } else {
                    ao = ao("vendor.display-size");
                }
                if (!TextUtils.isEmpty(ao)) {
                    try {
                        String[] u = u(ao.trim(), "x");
                        if (u.length == 2) {
                            int parseInt = Integer.parseInt(u[0]);
                            int parseInt2 = Integer.parseInt(u[1]);
                            if (parseInt > 0 && parseInt2 > 0) {
                                return new Point(parseInt, parseInt2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                    if (String.valueOf(ao).length() == 0) {
                        new String("Invalid display size: ");
                    }
                }
            } else {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i3 = a;
        if (i3 >= 23) {
            Display.Mode mode = defaultDisplay.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        } else if (i3 < 17) {
            defaultDisplay.getSize(point);
            return point;
        } else {
            defaultDisplay.getRealSize(point);
            return point;
        }
    }

    public static long Z(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime();
    }

    public static boolean a(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static long aa(long j2, long j3) {
        long j4 = j2 + j3;
        if (((j2 ^ j4) & (j3 ^ j4)) < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    public static <T extends Comparable<? super T>> int ab(List<? extends Comparable<? super T>> list, T t) {
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            return binarySearch ^ (-1);
        }
        int size = list.size();
        do {
            binarySearch++;
            if (binarySearch >= size) {
                break;
            }
        } while (list.get(binarySearch).compareTo(t) == 0);
        return binarySearch;
    }

    public static int ac(long[] jArr, long j2, boolean z) {
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

    public static <T extends Comparable<? super T>> int ad(List<? extends Comparable<? super T>> list, T t) {
        int binarySearch = Collections.binarySearch(list, t);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (list.get(binarySearch).compareTo(t) == 0);
        return binarySearch + 1;
    }

    public static int ae(int[] iArr, int i2) {
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

    public static int af(long[] jArr, long j2, boolean z) {
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

    public static int ag(byte[] bArr, int i2) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = k[(i3 >>> 24) ^ (bArr[i4] & 255)] ^ (i3 << 8);
        }
        return i3;
    }

    public static int ah(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i2 < i3) {
            i4 = l[i4 ^ (bArr[i2] & 255)];
            i2++;
        }
        return i4;
    }

    public static ExecutorService ai() {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: cmnx
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "Loader:ProgressiveMediaPeriod");
            }
        });
    }

    public static <T> T[] aj(T[] tArr, int i2) {
        cmmn.a(true);
        cmmn.a(i2 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, 1, i2);
    }

    public static void ak(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static long am(long j2, long j3) {
        long j4 = j2 - j3;
        if (((j2 ^ j4) & (j3 ^ j2)) < 0) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    public static void an(InputStream inputStream) {
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

    private static String ao(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            cmna.a(str.length() != 0 ? "Failed to read system property ".concat(str) : new String("Failed to read system property "), e2);
            return null;
        }
    }

    private static HashMap<String, String> ap() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = i.length;
        HashMap<String, String> hashMap = new HashMap<>(length + 86);
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

    public static boolean b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static <T> T c(T t) {
        return t;
    }

    public static <T> T[] d(T[] tArr) {
        return tArr;
    }

    public static <T> T[] e(T[] tArr, int i2) {
        cmmn.a(i2 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i2);
    }

    public static <T> T[] f(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }

    public static Handler g() {
        return h(null);
    }

    public static Handler h(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        cmmn.e(myLooper);
        return j(myLooper, callback);
    }

    public static Handler i() {
        return j(k(), null);
    }

    public static Handler j(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Looper k() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static void l(cmkg cmkgVar) {
        try {
            cmkgVar.f();
        } catch (IOException unused) {
        }
    }

    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean n(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void o(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static String p(Locale locale) {
        if (a >= 21) {
            return locale.toLanguageTag();
        }
        return locale.toString();
    }

    public static String q(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !"und".equals(replace)) {
            str = replace;
        }
        String x = x(str);
        int i2 = 0;
        String str2 = v(x, "-")[0];
        if (h == null) {
            h = ap();
        }
        String str3 = h.get(str2);
        if (str3 != null) {
            String valueOf = String.valueOf(x.substring(str2.length()));
            x = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return x;
        }
        while (true) {
            String[] strArr = j;
            int length = strArr.length;
            if (i2 >= 18) {
                return x;
            }
            if (x.startsWith(strArr[i2])) {
                String valueOf2 = String.valueOf(strArr[i2 + 1]);
                String valueOf3 = String.valueOf(x.substring(strArr[i2].length()));
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            i2 += 2;
        }
    }

    public static String r(byte[] bArr) {
        return new String(bArr, dbrc.c);
    }

    public static String s(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, dbrc.c);
    }

    public static byte[] t(String str) {
        return str.getBytes(dbrc.c);
    }

    public static String[] u(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] v(String str, String str2) {
        return str.split(str2, 2);
    }

    public static boolean w(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static String x(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    public static String y(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    public static String z(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    static {
        int i2;
        if ("S".equals(Build.VERSION.CODENAME)) {
            i2 = 31;
        } else {
            i2 = "R".equals(Build.VERSION.CODENAME) ? 30 : Build.VERSION.SDK_INT;
        }
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
        l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, R.styleable.AppCompatTheme_windowActionModeOverlay, R.styleable.AppCompatTheme_windowNoTitle, R.styleable.AppCompatTheme_windowFixedHeightMinor, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 98, R.styleable.AppCompatTheme_switchStyle, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, R.styleable.AppCompatTheme_textColorSearchUrl, 104, 97, 102, R.styleable.AppCompatTheme_tooltipFrameBackground, R.styleable.AppCompatTheme_viewInflaterClass, R.styleable.AppCompatTheme_windowMinWidthMinor, R.styleable.AppCompatTheme_windowFixedWidthMajor, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, R.styleable.AppCompatTheme_textColorAlertDialogListItem, R.styleable.AppCompatTheme_textAppearanceListItem, 96, R.styleable.AppCompatTheme_windowActionBar, R.styleable.AppCompatTheme_tooltipForegroundColor, R.styleable.AppCompatTheme_windowFixedWidthMinor, R.styleable.AppCompatTheme_windowMinWidthMajor, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, R.styleable.AppCompatTheme_windowActionBarOverlay, R.styleable.AppCompatTheme_toolbarStyle, R.styleable.AppCompatTheme_windowFixedHeightMajor, 127, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static void al(long[] jArr, long j2) {
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