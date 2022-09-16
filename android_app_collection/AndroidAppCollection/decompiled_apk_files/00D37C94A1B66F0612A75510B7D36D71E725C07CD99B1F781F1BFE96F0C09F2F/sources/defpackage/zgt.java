package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.youtube.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: PG */
/* renamed from: zgt  reason: default package */
/* loaded from: classes4.dex */
public final class zgt {
    public static long A(long j, apyy apyyVar) {
        long j2;
        if ((apyyVar.b & 262144) != 0) {
            athd athdVar = apyyVar.o;
            if (athdVar == null) {
                athdVar = athd.a;
            }
            j2 = athdVar.c;
        } else {
            j2 = 52428800;
        }
        return Math.max(0L, j - j2);
    }

    public static long B(apyy apyyVar, File file) {
        return A(zew.e(file), apyyVar);
    }

    public static Intent C() {
        return new Intent().setAction("android.intent.action.SEND").setType("text/plain").setFlags(524288);
    }

    public static Intent D(Context context, String str, Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent createChooser = Intent.createChooser(L(context, str, uri), context.getText(R.string.send_playlist));
        createChooser.addFlags(268435456);
        createChooser.addFlags(262144);
        return createChooser;
    }

    public static Intent E(Context context, String str, Uri uri) {
        String p = zgh.p(str);
        Uri k = k(uri);
        if (k == null) {
            return null;
        }
        Intent createChooser = Intent.createChooser(L(context, p, k), context.getText(R.string.send_video));
        createChooser.addFlags(268435456);
        createChooser.addFlags(262144);
        return createChooser;
    }

    public static List F(PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(C(), 65536)) {
            if (resolveInfo != null && resolveInfo.activityInfo != null && resolveInfo.activityInfo.name != null && resolveInfo.activityInfo.applicationInfo != null && resolveInfo.activityInfo.applicationInfo.packageName != null) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    public static void G(Context context, String str, Uri uri) {
        Intent D = D(context, str, uri);
        if (D != null) {
            context.startActivity(D);
        } else {
            zep.l("Share playlist error: empty playlist url");
        }
    }

    public static void H(Context context, String str, Uri uri) {
        Intent E = E(context, str, uri);
        if (E != null) {
            context.startActivity(E);
        } else {
            zep.l("Share video error: null watch uri");
        }
    }

    public static void I(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 26 || context.getApplicationInfo().targetSdkVersion < 26) {
            context.startService(intent);
        } else {
            context.startForegroundService(intent);
        }
    }

    private static String J(String str) {
        try {
            new URI(str);
            return str;
        } catch (URISyntaxException unused) {
            Uri parse = Uri.parse(str);
            try {
                try {
                    String encode = Uri.encode(parse.getEncodedAuthority(), "%,;:$&+=@[]");
                    String encode2 = Uri.encode(parse.getEncodedPath(), "%,;:$&+=/@");
                    String uri = parse.buildUpon().encodedAuthority(encode).encodedPath(encode2).encodedQuery(Uri.encode(parse.getEncodedQuery(), "%,;:$&+=/[]@?")).build().toString();
                    new URI(uri);
                    return uri;
                } catch (URISyntaxException unused2) {
                    return Uri.encode(str, ":/");
                }
            } catch (URISyntaxException unused3) {
                String encode3 = Uri.encode(parse.getEncodedAuthority(), ",;:$&+=@[]");
                String encode4 = Uri.encode(parse.getEncodedPath(), ",;:$&+=/@");
                String uri2 = parse.buildUpon().encodedAuthority(encode3).encodedPath(encode4).encodedQuery(Uri.encode(parse.getEncodedQuery(), ",;:$&+=/@[]?")).build().toString();
                new URI(uri2);
                return uri2;
            }
        }
    }

    private static String K(Resources resources, String str, int i) {
        int parseInt;
        if (str != null) {
            try {
                parseInt = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
            int abs = Math.abs(parseInt);
            return resources.getQuantityString(i, abs, Integer.valueOf(abs));
        }
        parseInt = 0;
        int abs2 = Math.abs(parseInt);
        return resources.getQuantityString(i, abs2, Integer.valueOf(abs2));
    }

    private static Intent L(Context context, String str, Uri uri) {
        if (str == null) {
            str = context.getString(R.string.share_untitled);
        }
        String b = alj.a().b(str);
        Intent C = C();
        String string = context.getString(R.string.share_subject, b);
        String string2 = context.getString(R.string.share_text, b, uri);
        C.putExtra("android.intent.extra.SUBJECT", string);
        C.putExtra("android.intent.extra.TEXT", string2);
        return C;
    }

    public static long a(long j, long j2) {
        return j != 0 ? j : j2;
    }

    public static String b(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        sb.append(str);
        sb.append("(Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str3 = Build.MODEL;
        if (str3.length() > 0) {
            sb.append("; ");
            sb.append(str3);
        }
        String str4 = Build.ID;
        if (str4.length() > 0) {
            sb.append(" Build/");
            sb.append(str4);
        }
        sb.append(')');
        if (!TextUtils.isEmpty(str2)) {
            sb.append(' ');
            sb.append(str2);
        }
        return sb.toString();
    }

    public static String c(byte[] bArr) {
        Scanner scanner = new Scanner(new GZIPInputStream(new ByteArrayInputStream(bArr)));
        scanner.useDelimiter("\\A");
        try {
            return scanner.hasNext() ? scanner.next() : "";
        } finally {
            scanner.close();
        }
    }

    public static String d(TelephonyManager telephonyManager) {
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (true == TextUtils.isEmpty(networkCountryIso)) {
            networkCountryIso = "";
        }
        String replace = networkCountryIso.trim().replace(",", "");
        if (replace.length() > 2) {
            replace = replace.substring(0, 2);
        }
        return zgh.l(replace);
    }

    public static boolean e(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == null && bundle2 == null;
        } else if (bundle.size() != bundle2.size()) {
            return false;
        } else {
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null) {
                    if (obj2 != null || !bundle2.containsKey(str)) {
                        return false;
                    }
                } else if (!(obj instanceof Bundle) || !(obj2 instanceof Bundle)) {
                    if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
                        if (!obj.equals(obj2)) {
                            return false;
                        }
                    } else if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if (!e((Bundle) obj, (Bundle) obj2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static synchronized byte[] f(byte[] bArr) {
        byte[] digest;
        synchronized (zgt.class) {
            synchronized (zgs.class) {
                digest = zgs.a.digest(bArr);
            }
        }
        return digest;
    }

    public static byte[] g(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    public static Uri h(String str) {
        return o(str, "", -1, 0L);
    }

    public static Uri i(String str) {
        Uri parse = Uri.parse(J(str));
        if (parse.isAbsolute()) {
            return parse;
        }
        throw new MalformedURLException("Uri must have an absolute scheme");
    }

    public static Uri j(String str) {
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            return parse.buildUpon().scheme("https").build();
        }
        if (str.contains("://") || !str.contains(":")) {
            return parse;
        }
        if (!str.startsWith("//")) {
            str = str.length() != 0 ? "//".concat(str) : new String("//");
        }
        String valueOf = String.valueOf(str);
        return Uri.parse(valueOf.length() != 0 ? "https:".concat(valueOf) : new String("https:"));
    }

    public static Uri k(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("v");
            return (host == null || !host.contains("youtube.com") || TextUtils.isEmpty(queryParameter)) ? uri : new Uri.Builder().scheme(uri.getScheme()).authority("youtu.be").appendPath(queryParameter).build();
        } catch (UnsupportedOperationException unused) {
            return uri;
        }
    }

    public static boolean l(Uri uri) {
        uri.getClass();
        return "https".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean m(String str) {
        return l(Uri.parse(str));
    }

    public static boolean n(Uri uri) {
        return "127.0.0.1".equals(uri.getHost()) || "localhost".equals(uri.getHost());
    }

    public static Uri o(String str, String str2, int i, long j) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("www.youtube.com").appendPath("watch").appendQueryParameter("v", str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("list", str2);
            if (i != -1) {
                appendQueryParameter.appendQueryParameter("index", String.valueOf(i));
            }
        }
        if (j != 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("t=");
            sb.append(j);
            appendQueryParameter.encodedFragment(sb.toString());
        }
        return appendQueryParameter.build();
    }

    static int p(int i) {
        return (1 << i) - 1;
    }

    public static int q(int i, int i2) {
        return i | (i2 << 6);
    }

    public static int r(long j, int i) {
        return v(s(j), i);
    }

    public static int s(long j) {
        return (int) (j & 4294967295L);
    }

    public static int t(int i) {
        return p(i >> 6);
    }

    public static int u(int i) {
        return i & p(6);
    }

    public static int v(int i, int i2) {
        return (i >> u(i2)) & t(i2);
    }

    public static int w(int i, int i2, int i3) {
        int u = u(i2);
        int t = t(i2);
        return (i & ((t << u) ^ (-1))) | ((t & Math.max(0, Math.min(i3, t))) << u);
    }

    public static long x(int i, int i2) {
        return i | (i2 << 32);
    }

    public static boolean y(long j, int i) {
        return v((int) (j >> 32), i) != r(j, i);
    }

    public static CharSequence z(Resources resources, CharSequence charSequence) {
        String str;
        int i;
        Object obj;
        resources.getClass();
        charSequence.getClass();
        List h = amqf.b(':').h(charSequence.toString());
        Object obj2 = null;
        if (h.size() >= 3) {
            str = K(resources, (String) h.get(0), R.plurals.accessibility_duration_description_hours);
            i = 1;
        } else {
            str = null;
            i = 0;
        }
        if (i < h.size()) {
            obj = K(resources, (String) h.get(i), R.plurals.accessibility_duration_description_minutes);
            i++;
        } else {
            obj = null;
        }
        if (i < h.size()) {
            obj2 = K(resources, (String) h.get(i), R.plurals.accessibility_duration_description_seconds);
        }
        if (!TextUtils.isEmpty(str)) {
            return resources.getString(R.string.accessibility_duration_hour, str, obj, obj2);
        }
        return resources.getString(R.string.accessibility_duration_minutes, obj, obj2);
    }
}
