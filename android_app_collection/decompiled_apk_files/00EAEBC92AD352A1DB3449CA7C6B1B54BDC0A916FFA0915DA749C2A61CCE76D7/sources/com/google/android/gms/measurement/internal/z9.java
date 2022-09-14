package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import c.e.a.b.d.g.cb;
import c.e.a.b.d.g.nd;
import com.facebook.react.modules.appstate.AppStateModule;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
/* loaded from: classes.dex */
public final class z9 extends b6 {

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f7841g = {"firebase_", "google_", "ga_"};

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f7842h = {"_err"};

    /* renamed from: c  reason: collision with root package name */
    private SecureRandom f7843c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicLong f7844d;

    /* renamed from: e  reason: collision with root package name */
    private int f7845e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f7846f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z9(d5 d5Var) {
        super(d5Var);
        this.f7846f = null;
        this.f7844d = new AtomicLong(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int a(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Object r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.z9.a(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public static long a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    public static long a(o oVar) {
        long j = 0;
        if (oVar == null) {
            return 0L;
        }
        Iterator<String> it = oVar.iterator();
        while (it.hasNext()) {
            Object a2 = oVar.a(it.next());
            if (a2 instanceof Parcelable[]) {
                j += ((Parcelable[]) a2).length;
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(byte[] bArr) {
        com.google.android.gms.common.internal.s.a(bArr);
        int i = 0;
        com.google.android.gms.common.internal.s.b(bArr.length > 0);
        long j = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j += (bArr[length] & 255) << i;
            i += 8;
        }
        return j;
    }

    public static Bundle a(List<y9> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (y9 y9Var : list) {
            String str = y9Var.f7819f;
            if (str != null) {
                bundle.putString(y9Var.f7816c, str);
            } else {
                Long l = y9Var.f7818e;
                if (l != null) {
                    bundle.putLong(y9Var.f7816c, l.longValue());
                } else {
                    Double d2 = y9Var.f7821h;
                    if (d2 != null) {
                        bundle.putDouble(y9Var.f7816c, d2.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    private final Object a(int i, Object obj, boolean z, boolean z2) {
        Parcelable[] parcelableArr;
        Bundle a2;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return a(String.valueOf(obj), i, z);
            }
            if (!c.e.a.b.d.g.k9.a() || !l().a(r.H0) || !l().a(r.G0) || !z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if ((parcelable instanceof Bundle) && (a2 = a((Bundle) parcelable)) != null && !a2.isEmpty()) {
                    arrayList.add(a2);
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public static String a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (!z) {
            return null;
        }
        return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
    }

    private static void a(Bundle bundle, int i, String str, String str2, Object obj) {
        if (b(bundle, i)) {
            bundle.putString("_ev", a(str, 40, true));
            if (obj == null) {
                return;
            }
            com.google.android.gms.common.internal.s.a(bundle);
            if (obj == null) {
                return;
            }
            if (!(obj instanceof String) && !(obj instanceof CharSequence)) {
                return;
            }
            bundle.putLong("_el", String.valueOf(obj).length());
        }
    }

    private final void a(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int h2;
        String str4;
        int a2;
        String sb;
        if (bundle == null) {
            return;
        }
        boolean a3 = l().a(r.I0);
        int m = a3 ? 0 : l().m();
        int i = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                h2 = z ? h(str5) : 0;
                if (h2 == 0) {
                    h2 = i(str5);
                }
            } else {
                h2 = 0;
            }
            if (h2 != 0) {
                a(bundle, h2, str5, str5, h2 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (a(bundle.get(str5))) {
                    c().y().a("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    a2 = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    a2 = a(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (a2 != 0 && !"_ev".equals(str4)) {
                    a(bundle, a2, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (e(str4) && (!a3 || !a(str4, f6.f7297d))) {
                    int i2 = i + 1;
                    if (i2 > m) {
                        if (a3) {
                            sb = "Item cannot contain custom parameters";
                        } else {
                            StringBuilder sb2 = new StringBuilder(63);
                            sb2.append("Child bundles can't contain more than ");
                            sb2.append(m);
                            sb2.append(" custom params");
                            sb = sb2.toString();
                        }
                        c().u().a(sb, i().a(str2), i().a(bundle));
                        b(bundle, a3 ? 23 : 5);
                        bundle.remove(str4);
                    }
                    i = i2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context, boolean z) {
        com.google.android.gms.common.internal.s.a(context);
        return b(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Bundle bundle, int i) {
        int i2 = 0;
        if (bundle.size() <= i) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i2++;
            if (i2 > i) {
                bundle.remove(str);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool != null) {
            return bool.equals(bool2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    private static boolean a(String str, String[] strArr) {
        com.google.android.gms.common.internal.s.a(strArr);
        for (String str2 : strArr) {
            if (c(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list != null) {
            return list.equals(list2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static Bundle b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static ArrayList<Bundle> b(List<oa> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (oa oaVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", oaVar.f7562b);
            bundle.putString("origin", oaVar.f7563c);
            bundle.putLong("creation_timestamp", oaVar.f7565e);
            bundle.putString("name", oaVar.f7564d.f7816c);
            d6.a(bundle, oaVar.f7564d.f());
            bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, oaVar.f7566f);
            String str = oaVar.f7567g;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            p pVar = oaVar.f7568h;
            if (pVar != null) {
                bundle.putString("timed_out_event_name", pVar.f7569b);
                o oVar = oaVar.f7568h.f7570c;
                if (oVar != null) {
                    bundle.putBundle("timed_out_event_params", oVar.j());
                }
            }
            bundle.putLong("trigger_timeout", oaVar.i);
            p pVar2 = oaVar.j;
            if (pVar2 != null) {
                bundle.putString("triggered_event_name", pVar2.f7569b);
                o oVar2 = oaVar.j.f7570c;
                if (oVar2 != null) {
                    bundle.putBundle("triggered_event_params", oVar2.j());
                }
            }
            bundle.putLong("triggered_timestamp", oaVar.f7564d.f7817d);
            bundle.putLong("time_to_live", oaVar.k);
            p pVar3 = oaVar.l;
            if (pVar3 != null) {
                bundle.putString("expired_event_name", pVar3.f7569b);
                o oVar3 = oaVar.l.f7570c;
                if (oVar3 != null) {
                    bundle.putBundle("expired_event_params", oVar3.j());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private static boolean b(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    private static boolean b(Bundle bundle, int i) {
        if (bundle != null && bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i);
            return true;
        }
        return false;
    }

    private final boolean b(String str, String str2, int i, Object obj) {
        int size;
        if (!(obj instanceof Parcelable[])) {
            if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            }
            return true;
        }
        size = ((Parcelable[]) obj).length;
        if (size > i) {
            c().y().a("Parameter array is too long; discarded. Value kind, name, array length", str, str2, Integer.valueOf(size));
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle[] b(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    private final boolean c(Context context, String str) {
        b4 s;
        String str2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b2 = com.google.android.gms.common.n.c.a(context).b(str, 64);
            if (b2 == null || b2.signatures == null || b2.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b2.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e2) {
            e = e2;
            s = c().s();
            str2 = "Package name not found";
            s.a(str2, e);
            return true;
        } catch (CertificateException e3) {
            e = e3;
            s = c().s();
            str2 = "Error obtaining certificate";
            s.a(str2, e);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null) {
            return str.equals(str2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(String str) {
        com.google.android.gms.common.internal.s.b(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean g(String str) {
        for (String str2 : f7842h) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int h(String str) {
        if (!a("event param", str)) {
            return 3;
        }
        if (!a("event param", (String[]) null, str)) {
            return 14;
        }
        return !a("event param", 40, str) ? 3 : 0;
    }

    private final int i(String str) {
        if (!b("event param", str)) {
            return 3;
        }
        if (!a("event param", (String[]) null, str)) {
            return 14;
        }
        return !a("event param", 40, str) ? 3 : 0;
    }

    private static boolean j(String str) {
        com.google.android.gms.common.internal.s.a(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int k(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (!l().a(r.l0) || !"_lgclid".equals(str)) ? 36 : 100;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MessageDigest y() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public final int a(int i) {
        return com.google.android.gms.common.f.a().a(d(), com.google.android.gms.common.i.f6959a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(String str) {
        if (!b("event", str)) {
            return 2;
        }
        if (!a("event", c6.f7215a, str)) {
            return 13;
        }
        return !a("event", 40, str) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0069 -> B:17:0x0076). Please submit an issue!!! */
    public final long a(Context context, String str) {
        g();
        com.google.android.gms.common.internal.s.a(context);
        com.google.android.gms.common.internal.s.b(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest y = y();
        long j = -1;
        if (y == null) {
            c().s().a("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e2) {
                    c().s().a("Package name not found", e2);
                }
                if (!c(context, str)) {
                    PackageInfo b2 = com.google.android.gms.common.n.c.a(context).b(d().getPackageName(), 64);
                    if (b2.signatures == null || b2.signatures.length <= 0) {
                        c().v().a("Could not get signatures");
                    } else {
                        j = a(y.digest(b2.signatures[0].toByteArray()));
                    }
                }
            }
            j = 0;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            c().v().a("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a2 = a(str, bundle.get(str));
                if (a2 == null) {
                    c().y().a("Param value can't be null", i().b(str));
                } else {
                    a(bundle2, str, a2);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle a(String str, String str2, Bundle bundle, List<String> list, boolean z, boolean z2) {
        int h2;
        int i;
        Bundle bundle2;
        String str3;
        int i2;
        boolean z3 = c.e.a.b.d.g.k9.a() && l().a(r.I0);
        boolean a2 = z3 ? a(str2, c6.f7217c) : z2;
        if (bundle != null) {
            Bundle bundle3 = new Bundle(bundle);
            int m = l().m();
            int i3 = 0;
            for (String str4 : l().e(str, r.b0) ? new TreeSet<>(bundle.keySet()) : bundle.keySet()) {
                if (list == null || !list.contains(str4)) {
                    h2 = z ? h(str4) : 0;
                    if (h2 == 0) {
                        h2 = i(str4);
                    }
                } else {
                    h2 = 0;
                }
                if (h2 != 0) {
                    a(bundle3, h2, str4, str4, h2 == 3 ? str4 : null);
                    bundle3.remove(str4);
                    i = m;
                    bundle2 = bundle3;
                } else {
                    i = m;
                    Bundle bundle4 = bundle3;
                    int a3 = a(str, str2, str4, bundle.get(str4), bundle3, list, z, a2);
                    if (!z3 || a3 != 17) {
                        str3 = str4;
                        bundle2 = bundle4;
                        if (a3 != 0 && !"_ev".equals(str3)) {
                            a(bundle2, a3, a3 == 21 ? str2 : str3, str3, bundle.get(str3));
                            bundle2.remove(str3);
                        }
                    } else {
                        str3 = str4;
                        bundle2 = bundle4;
                        a(bundle2, a3, str3, str3, (Object) false);
                    }
                    if (e(str3)) {
                        int i4 = i3 + 1;
                        i2 = i;
                        if (i4 > i2) {
                            StringBuilder sb = new StringBuilder(48);
                            sb.append("Event can't contain more than ");
                            sb.append(i2);
                            sb.append(" params");
                            c().u().a(sb.toString(), i().a(str2), i().a(bundle));
                            b(bundle2, 5);
                            bundle2.remove(str3);
                            i3 = i4;
                            m = i2;
                            bundle3 = bundle2;
                        } else {
                            i3 = i4;
                        }
                    } else {
                        i2 = i;
                    }
                    m = i2;
                    bundle3 = bundle2;
                }
                bundle3 = bundle2;
                m = i;
            }
            return bundle3;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final p a(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (a(str2) != 0) {
            c().s().a("Invalid conditional property event name", i().c(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        return new p(str2, new o(a(a(str, str2, bundle2, com.google.android.gms.common.util.f.a("_o"), false, false))), str3, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object a(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return a(256, obj, true, true);
        }
        if (!f(str)) {
            i = 100;
        }
        return a(i, obj, false, true);
    }

    public final URL a(long j, String str, String str2, long j2) {
        try {
            com.google.android.gms.common.internal.s.b(str2);
            com.google.android.gms.common.internal.s.b(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j), Integer.valueOf(u())), str2, str, Long.valueOf(j2));
            if (str.equals(l().t())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            c().s().a("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            return null;
        }
    }

    public final void a(int i, String str, String str2, int i2) {
        a((String) null, i, str, str2, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            c().v().a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                j().a(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (c.e.a.b.d.g.k9.a() && l().a(r.H0) && l().a(r.G0) && (obj instanceof Bundle[])) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str == null) {
        } else {
            c().y().a("Not putting event parameter. Invalid value type. name, type", i().b(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void a(nd ndVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            ndVar.a(bundle);
        } catch (RemoteException e2) {
            this.f7802a.c().v().a("Error returning int value to wrapper", e2);
        }
    }

    public final void a(nd ndVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            ndVar.a(bundle);
        } catch (RemoteException e2) {
            this.f7802a.c().v().a("Error returning long value to wrapper", e2);
        }
    }

    public final void a(nd ndVar, Bundle bundle) {
        try {
            ndVar.a(bundle);
        } catch (RemoteException e2) {
            this.f7802a.c().v().a("Error returning bundle value to wrapper", e2);
        }
    }

    public final void a(nd ndVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            ndVar.a(bundle);
        } catch (RemoteException e2) {
            this.f7802a.c().v().a("Error returning string value to wrapper", e2);
        }
    }

    public final void a(nd ndVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            ndVar.a(bundle);
        } catch (RemoteException e2) {
            this.f7802a.c().v().a("Error returning bundle list to wrapper", e2);
        }
    }

    public final void a(nd ndVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            ndVar.a(bundle);
        } catch (RemoteException e2) {
            this.f7802a.c().v().a("Error returning boolean value to wrapper", e2);
        }
    }

    public final void a(nd ndVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            ndVar.a(bundle);
        } catch (RemoteException e2) {
            this.f7802a.c().v().a("Error returning byte array to wrapper", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(d4 d4Var, int i) {
        int i2 = 0;
        for (String str : new TreeSet(d4Var.f7237d.keySet())) {
            if (e(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                c().u().a(sb.toString(), i().a(d4Var.f7234a), i().a(d4Var.f7237d));
                b(d4Var.f7237d, 5);
                d4Var.f7237d.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        b(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        this.f7802a.w();
        this.f7802a.t().a("auto", "_err", bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ApplySharedPref"})
    public final boolean a(String str, double d2) {
        try {
            SharedPreferences.Editor edit = d().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d2));
            return edit.commit();
        } catch (Exception e2) {
            c().s().a("Failed to persist Deferred Deep Link. exception", e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(String str, int i, String str2) {
        if (str2 == null) {
            c().u().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            c().u().a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(String str, String str2) {
        if (str2 == null) {
            c().u().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            c().u().a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                c().u().a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    c().u().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                c().y().a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (j(str)) {
                return true;
            }
            if (this.f7802a.y()) {
                c().u().a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", z3.a(str));
            }
            return false;
        } else if (cb.a() && l().a(r.o0) && !TextUtils.isEmpty(str3)) {
            return true;
        } else {
            if (TextUtils.isEmpty(str2)) {
                if (this.f7802a.y()) {
                    c().u().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (j(str2)) {
                return true;
            } else {
                c().u().a("Invalid admob_app_id. Analytics disabled.", z3.a(str2));
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(String str, String[] strArr, String str2) {
        boolean z;
        if (str2 == null) {
            c().u().a("Name is required and can't be null. Type", str);
            return false;
        }
        com.google.android.gms.common.internal.s.a(str2);
        String[] strArr2 = f7841g;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            c().u().a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (strArr == null || !a(str2, strArr)) {
            return true;
        } else {
            c().u().a("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(String str) {
        if (!b("user property", str)) {
            return 6;
        }
        if (!a("user property", e6.f7272a, str)) {
            return 15;
        }
        return !a("user property", 24, str) ? 6 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(String str, Object obj) {
        int k;
        String str2;
        if ("_ldl".equals(str)) {
            k = k(str);
            str2 = "user property referrer";
        } else {
            k = k(str);
            str2 = "user property";
        }
        return a(str2, str, k, obj) ? 0 : 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(String str, String str2) {
        if (str2 == null) {
            c().u().a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            c().u().a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt) && codePointAt != 95) {
                c().u().a("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    c().u().a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object c(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int k = k(str);
        return equals ? a(k, obj, true, false) : a(k, obj, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(String str) {
        g();
        if (com.google.android.gms.common.n.c.a(d()).a(str) == 0) {
            return true;
        }
        c().A().a("Permission not granted", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String s = l().s();
        w();
        return s.equals(str);
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final void m() {
        g();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                c().v().a("Utils falling back to Random for random id");
            }
        }
        this.f7844d.set(nextLong);
    }

    @Override // com.google.android.gms.measurement.internal.b6
    protected final boolean q() {
        return true;
    }

    public final long s() {
        int i = (this.f7844d.get() > 0L ? 1 : (this.f7844d.get() == 0L ? 0 : -1));
        synchronized (this.f7844d) {
            if (i != 0) {
                this.f7844d.compareAndSet(-1L, 1L);
                return this.f7844d.getAndIncrement();
            }
            long nextLong = new Random(System.nanoTime() ^ b().a()).nextLong();
            int i2 = this.f7845e + 1;
            this.f7845e = i2;
            return nextLong + i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SecureRandom t() {
        g();
        if (this.f7843c == null) {
            this.f7843c = new SecureRandom();
        }
        return this.f7843c;
    }

    public final int u() {
        if (this.f7846f == null) {
            this.f7846f = Integer.valueOf(com.google.android.gms.common.f.a().a(d()) / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
        }
        return this.f7846f.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String v() {
        byte[] bArr = new byte[16];
        t().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final boolean x() {
        try {
            d().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
