package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
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
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import javax.security.auth.x500.X500Principal;
/* compiled from: PG */
/* renamed from: rps  reason: default package */
/* loaded from: classes4.dex */
public final class rps extends rmk {
    private SecureRandom c;
    private final AtomicLong d;
    private int e;
    private Integer f;
    private static final String[] b = {"firebase_", "google_", "ga_"};
    public static final String[] a = {"_err"};

    static {
        Pattern.compile("^([^\\s@]+)@([^\\s@]+\\.[^\\s@]+)$");
        Pattern.compile("^(gmail|googlemail)\\.");
        Pattern.compile("[\\s-()/.]+");
        Pattern.compile("^\\+\\d{11,15}$");
        Pattern.compile("[0-9`~!@#$%^&*()_\\-+=:;<>,.?|/\\\\\\[\\]]+");
        Pattern.compile("\\s+");
    }

    public rps(rlx rlxVar) {
        super(rlxVar);
        this.f = null;
        this.d = new AtomicLong(0L);
    }

    public static ArrayList C(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ConditionalUserPropertyParcel conditionalUserPropertyParcel = (ConditionalUserPropertyParcel) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", conditionalUserPropertyParcel.a);
            bundle.putString("origin", conditionalUserPropertyParcel.b);
            bundle.putLong("creation_timestamp", conditionalUserPropertyParcel.d);
            bundle.putString("name", conditionalUserPropertyParcel.c.b);
            rgf.h(bundle, conditionalUserPropertyParcel.c.a());
            bundle.putBoolean("active", conditionalUserPropertyParcel.e);
            String str = conditionalUserPropertyParcel.f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            EventParcel eventParcel = conditionalUserPropertyParcel.g;
            if (eventParcel != null) {
                bundle.putString("timed_out_event_name", eventParcel.a);
                EventParams eventParams = conditionalUserPropertyParcel.g.b;
                if (eventParams != null) {
                    bundle.putBundle("timed_out_event_params", eventParams.a());
                }
            }
            bundle.putLong("trigger_timeout", conditionalUserPropertyParcel.h);
            EventParcel eventParcel2 = conditionalUserPropertyParcel.i;
            if (eventParcel2 != null) {
                bundle.putString("triggered_event_name", eventParcel2.a);
                EventParams eventParams2 = conditionalUserPropertyParcel.i.b;
                if (eventParams2 != null) {
                    bundle.putBundle("triggered_event_params", eventParams2.a());
                }
            }
            bundle.putLong("triggered_timestamp", conditionalUserPropertyParcel.c.c);
            bundle.putLong("time_to_live", conditionalUserPropertyParcel.j);
            EventParcel eventParcel3 = conditionalUserPropertyParcel.k;
            if (eventParcel3 != null) {
                bundle.putString("expired_event_name", eventParcel3.a);
                EventParams eventParams3 = conditionalUserPropertyParcel.k.b;
                if (eventParams3 != null) {
                    bundle.putBundle("expired_event_params", eventParams3.a());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void E(rnm rnmVar, Bundle bundle, boolean z) {
        if (bundle != null && rnmVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = rnmVar.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = rnmVar.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", rnmVar.c);
                return;
            }
            z = false;
        }
        if (bundle == null || rnmVar != null || !z) {
            return;
        }
        bundle.remove("_sn");
        bundle.remove("_sc");
        bundle.remove("_si");
    }

    static final boolean aA(String str) {
        qnm.b(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int aC(String str) {
        if ("_ldl".equals(str)) {
            J();
            return 2048;
        } else if ("_id".equals(str)) {
            J();
            return 256;
        } else if (!J().o(rkg.ac) || !"_lgclid".equals(str)) {
            J();
            return 36;
        } else {
            J();
            return 100;
        }
    }

    private final Object aD(int i, Object obj, boolean z, boolean z2) {
        Parcelable[] parcelableArr;
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
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return A(String.valueOf(obj), i, z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle w = w((Bundle) parcelable);
                    if (!w.isEmpty()) {
                        arrayList.add(w);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    private static boolean aE(String str, String[] strArr) {
        qnm.b(strArr);
        for (String str2 : strArr) {
            if (aq(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean aF(Context context, String str) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean al(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool != null) {
            return bool.equals(bool2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean an(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ao(String str) {
        qnm.l(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ap(Context context) {
        ActivityInfo receiverInfo;
        qnm.b(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean aq(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null) {
            return str.equals(str2);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ar(List list, List list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list != null) {
            return list.equals(list2);
        }
        return false;
    }

    static final boolean av(Bundle bundle, int i) {
        if (bundle != null && bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MessageDigest ax() {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean az(Context context) {
        qnm.b(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return aF(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return aF(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long q(byte[] bArr) {
        qnm.b(bArr);
        int length = bArr.length;
        int i = 0;
        qnm.j(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    public static Bundle t(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserAttributeParcel userAttributeParcel = (UserAttributeParcel) it.next();
            String str = userAttributeParcel.e;
            if (str != null) {
                bundle.putString(userAttributeParcel.b, str);
            } else {
                Long l = userAttributeParcel.d;
                if (l != null) {
                    bundle.putLong(userAttributeParcel.b, l.longValue());
                } else {
                    Double d = userAttributeParcel.g;
                    if (d != null) {
                        bundle.putDouble(userAttributeParcel.b, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public static Bundle v(Bundle bundle) {
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
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
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

    public final String A(String str, int i, boolean z) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SecureRandom B() {
        n();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            aG().f.b("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void F(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                N().S(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(rkt rktVar, int i) {
        int i2 = 0;
        for (String str : new TreeSet(rktVar.d.keySet())) {
            if (ao(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i);
                sb.append(" params");
                aG().e.c(sb.toString(), L().c(rktVar.a), L().b(rktVar.d));
                av(rktVar.d, 5);
                rktVar.d.remove(str);
            }
        }
    }

    public final void H(rpr rprVar, int i, String str, String str2, int i2) {
        R(rprVar, null, i, str, str2, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R(rpr rprVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        av(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        rprVar.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void S(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str == null) {
        } else {
            aG().h.c("Not putting event parameter. Invalid value type. name, type", L().d(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void T(rhj rhjVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            rhjVar.a(bundle);
        } catch (RemoteException e) {
            this.w.aG().f.b("Error returning boolean value to wrapper", e);
        }
    }

    public final void U(rhj rhjVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            rhjVar.a(bundle);
        } catch (RemoteException e) {
            this.w.aG().f.b("Error returning bundle list to wrapper", e);
        }
    }

    public final void V(rhj rhjVar, Bundle bundle) {
        try {
            rhjVar.a(bundle);
        } catch (RemoteException e) {
            this.w.aG().f.b("Error returning bundle value to wrapper", e);
        }
    }

    public final void W(rhj rhjVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            rhjVar.a(bundle);
        } catch (RemoteException e) {
            this.w.aG().f.b("Error returning byte array to wrapper", e);
        }
    }

    public final void X(rhj rhjVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            rhjVar.a(bundle);
        } catch (RemoteException e) {
            this.w.aG().f.b("Error returning int value to wrapper", e);
        }
    }

    public final void Y(rhj rhjVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            rhjVar.a(bundle);
        } catch (RemoteException e) {
            this.w.aG().f.b("Error returning long value to wrapper", e);
        }
    }

    public final void Z(rhj rhjVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            rhjVar.a(bundle);
        } catch (RemoteException e) {
            this.w.aG().f.b("Error returning string value to wrapper", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int a(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rps.a(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final URL aB(String str, String str2, long j) {
        try {
            qnm.l(str2);
            qnm.l(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 43009L, Integer.valueOf(p())), str2, str, Long.valueOf(j));
            if (str.equals(J().x("debug.deferred.deeplink"))) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            aG().c.b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    @Override // defpackage.rmk
    protected final void aI() {
        n();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                aG().f.a("Utils falling back to Random for random id");
            }
        }
        this.d.set(nextLong);
    }

    final void aa(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int h;
        String str4;
        int a2;
        if (bundle == null) {
            return;
        }
        J();
        int i = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                h = !z ? h(str5) : 0;
                if (h == 0) {
                    h = e(str5);
                }
            } else {
                h = 0;
            }
            if (h != 0) {
                au(bundle, h, str5, h == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (ak(bundle.get(str5))) {
                    aG().h.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    a2 = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    a2 = a(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (a2 == 0 || "_ev".equals(str4)) {
                    if (ao(str4) && !aE(str4, rmn.d) && (i = i + 1) > 0) {
                        aG().e.c("Item cannot contain custom parameters", L().c(str2), L().b(bundle));
                        av(bundle, 23);
                        bundle.remove(str4);
                    }
                } else {
                    au(bundle, a2, str4, bundle.get(str4));
                    bundle.remove(str4);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ab(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (aA(str)) {
                return true;
            }
            if (this.w.y()) {
                aG().e.b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", rks.a(str));
            }
            return false;
        }
        axtf.b();
        if (J().o(rkg.ae) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (aA(str2)) {
                return true;
            }
            aG().e.b("Invalid admob_app_id. Analytics disabled.", rks.a(str2));
            return false;
        }
        if (this.w.y()) {
            aG().e.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ac(String str, int i, String str2) {
        if (str2 == null) {
            aG().e.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            aG().e.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ad(String str, String[] strArr, String str2) {
        return ae(str, strArr, null, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ae(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            aG().e.b("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = b;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                aG().e.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !aE(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && aE(str2, strArr2)) {
            return true;
        }
        aG().e.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean af(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                aG().h.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ag(String str, String str2) {
        if (str2 == null) {
            aG().e.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            aG().e.b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        aG().e.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            aG().e.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ah(String str, String str2) {
        if (str2 == null) {
            aG().e.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            aG().e.b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                aG().e.c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    aG().e.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ai(String str) {
        n();
        if (qyr.b(I()).a(str) == 0) {
            return true;
        }
        aG().j.b("Permission not granted", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean aj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String k = J().k();
        P();
        return k.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean ak(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean am(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo d = qyr.b(context).d(str, 64);
            if (d == null || d.signatures == null || d.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(d.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            aG().c.b("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            aG().c.b("Error obtaining certificate", e2);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean as(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            qnm.b(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] at(Parcelable parcelable) {
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

    final void au(Bundle bundle, int i, String str, Object obj) {
        if (av(bundle, i)) {
            J();
            bundle.putString("_ev", A(str, 40, true));
            if (obj == null) {
                return;
            }
            if (!(obj instanceof String) && !(obj instanceof CharSequence)) {
                return;
            }
            bundle.putLong("_el", String.valueOf(obj).length());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final EventParcel aw(String str, String str2, Bundle bundle, String str3, long j, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (c(str2) != 0) {
            aG().c.b("Invalid conditional property event name", L().e(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle x = x(str, str2, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            x = w(x);
        }
        qnm.b(x);
        return new EventParcel(str2, new EventParams(x), str3, j);
    }

    public final int ay() {
        return qrr.d.h(I(), 12451000);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(String str, Object obj) {
        boolean af;
        if ("_ldl".equals(str)) {
            af = af("user property referrer", str, aC(str), obj);
        } else {
            af = af("user property", str, aC(str), obj);
        }
        return af ? 0 : 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(String str) {
        if (!ag("event", str)) {
            return 2;
        }
        if (!ae("event", rmm.a, rmm.b, str)) {
            return 13;
        }
        J();
        return !ac("event", 40, str) ? 2 : 0;
    }

    final int e(String str) {
        if (!ag("event param", str)) {
            return 3;
        }
        if (!ad("event param", null, str)) {
            return 14;
        }
        J();
        return !ac("event param", 40, str) ? 3 : 0;
    }

    @Override // defpackage.rmk
    protected final boolean f() {
        return true;
    }

    final int h(String str) {
        if (!ah("event param", str)) {
            return 3;
        }
        if (!ad("event param", null, str)) {
            return 14;
        }
        J();
        return !ac("event param", 40, str) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int o(String str) {
        if (!ag("user property", str)) {
            return 6;
        }
        if (!ad("user property", rmo.a, str)) {
            return 15;
        }
        J();
        return !ac("user property", 24, str) ? 6 : 0;
    }

    public final int p() {
        if (this.f == null) {
            int i = qrr.c;
            this.f = Integer.valueOf(qse.a(I()) / 1000);
        }
        return this.f.intValue();
    }

    public final long r() {
        long andIncrement;
        long j;
        if (this.d.get() == 0) {
            synchronized (this.d) {
                long nanoTime = System.nanoTime();
                Q();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i = this.e + 1;
                this.e = i;
                j = nextLong + i;
            }
            return j;
        }
        synchronized (this.d) {
            this.d.compareAndSet(-1L, 1L);
            andIncrement = this.d.getAndIncrement();
        }
        return andIncrement;
    }

    public final long s(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle u(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
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
            } catch (UnsupportedOperationException e) {
                aG().f.b("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle w(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object y = y(str, bundle.get(str));
                if (y == null) {
                    aG().h.b("Param value can't be null", L().d(str));
                } else {
                    S(bundle2, str, y);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle x(String str, String str2, Bundle bundle, List list, boolean z) {
        int h;
        int i;
        List list2 = list;
        boolean aE = aE(str2, rmm.d);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            int b2 = J().b();
            int i2 = 0;
            for (String str3 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str3)) {
                    h = !z ? h(str3) : 0;
                    if (h == 0) {
                        h = e(str3);
                    }
                } else {
                    h = 0;
                }
                if (h != 0) {
                    au(bundle2, h, str3, h == 3 ? str3 : null);
                    bundle2.remove(str3);
                    i = b2;
                } else {
                    i = b2;
                    int a2 = a(str, str2, str3, bundle.get(str3), bundle2, list, z, aE);
                    if (a2 == 17) {
                        au(bundle2, 17, str3, false);
                    } else if (a2 != 0 && !"_ev".equals(str3)) {
                        au(bundle2, a2, a2 == 21 ? str2 : str3, bundle.get(str3));
                        bundle2.remove(str3);
                    }
                    if (ao(str3)) {
                        int i3 = i2 + 1;
                        if (i3 > i) {
                            StringBuilder sb = new StringBuilder(48);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            aG().e.c(sb.toString(), L().c(str2), L().b(bundle));
                            av(bundle2, 5);
                            bundle2.remove(str3);
                        }
                        i2 = i3;
                    }
                }
                b2 = i;
                list2 = list;
            }
            return bundle2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object y(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            J();
            return aD(256, obj, true, true);
        }
        if (an(str)) {
            J();
        } else {
            J();
            i = 100;
        }
        return aD(i, obj, false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object z(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return aD(aC(str), obj, true, false);
        }
        return aD(aC(str), obj, false, false);
    }
}
