package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: qmc  reason: default package */
/* loaded from: classes4.dex */
public final class qmc {
    public static final String a;
    private static qmc h;
    public final qlv b;
    public final SharedPreferences c;
    public final String d;
    public final Set e;
    public final Set f;
    public long g;
    private final Runnable i;
    private final Handler j;

    static {
        new qpu("FeatureUsageAnalytics");
        a = "20.1.0";
    }

    private qmc(SharedPreferences sharedPreferences, qlv qlvVar, String str) {
        this.c = sharedPreferences;
        this.b = qlvVar;
        this.d = str;
        HashSet hashSet = new HashSet();
        this.e = hashSet;
        HashSet hashSet2 = new HashSet();
        this.f = hashSet2;
        this.j = new rfm(Looper.getMainLooper());
        this.i = new Runnable() { // from class: qmb
            @Override // java.lang.Runnable
            public final void run() {
                qmc qmcVar = qmc.this;
                if (qmcVar.e.isEmpty()) {
                    return;
                }
                long j = true != qmcVar.f.equals(qmcVar.e) ? 86400000L : 172800000L;
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = qmcVar.g;
                if (j2 != 0 && currentTimeMillis - j2 < j) {
                    return;
                }
                aopa createBuilder = anfz.a.createBuilder();
                String str2 = qmc.a;
                createBuilder.copyOnWrite();
                anfz anfzVar = (anfz) createBuilder.instance;
                str2.getClass();
                anfzVar.b |= 2;
                anfzVar.d = str2;
                String str3 = qmcVar.d;
                createBuilder.copyOnWrite();
                anfz anfzVar2 = (anfz) createBuilder.instance;
                str3.getClass();
                anfzVar2.b |= 1;
                anfzVar2.c = str3;
                anfz anfzVar3 = (anfz) createBuilder.mo39build();
                ArrayList<anfx> arrayList = new ArrayList();
                arrayList.addAll(qmcVar.e);
                aopa createBuilder2 = anfy.a.createBuilder();
                createBuilder2.copyOnWrite();
                anfy anfyVar = (anfy) createBuilder2.instance;
                aopq aopqVar = anfyVar.d;
                if (!aopqVar.c()) {
                    anfyVar.d = aopi.mutableCopy(aopqVar);
                }
                for (anfx anfxVar : arrayList) {
                    anfyVar.d.g(anfxVar.X);
                }
                createBuilder2.copyOnWrite();
                anfy anfyVar2 = (anfy) createBuilder2.instance;
                anfzVar3.getClass();
                anfyVar2.c = anfzVar3;
                anfyVar2.b |= 1;
                angb b = angc.b();
                b.copyOnWrite();
                ((angc) b.instance).o((anfy) createBuilder2.mo39build());
                qmcVar.b.a((angc) b.mo39build(), 243);
                SharedPreferences.Editor edit = qmcVar.c.edit();
                if (!qmcVar.f.equals(qmcVar.e)) {
                    qmcVar.f.clear();
                    qmcVar.f.addAll(qmcVar.e);
                    for (anfx anfxVar2 : qmcVar.f) {
                        String a2 = qmcVar.a(anfxVar2);
                        String c = qmcVar.c(a2);
                        String b2 = qmc.b("feature_usage_timestamp_reported_feature_", a2);
                        if (!TextUtils.equals(c, b2)) {
                            long j3 = qmcVar.c.getLong(c, 0L);
                            edit.remove(c);
                            if (j3 != 0) {
                                edit.putLong(b2, j3);
                            }
                        }
                    }
                }
                qmcVar.g = currentTimeMillis;
                edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
            }
        };
        String string = sharedPreferences.getString("feature_usage_sdk_version", null);
        String string2 = sharedPreferences.getString("feature_usage_package_name", null);
        hashSet.clear();
        hashSet2.clear();
        this.g = 0L;
        if (!a.equals(string) || !str.equals(string2)) {
            HashSet hashSet3 = new HashSet();
            for (String str2 : sharedPreferences.getAll().keySet()) {
                if (str2.startsWith("feature_usage_timestamp_")) {
                    hashSet3.add(str2);
                }
            }
            hashSet3.add("feature_usage_last_report_time");
            g(hashSet3);
            this.c.edit().putString("feature_usage_sdk_version", a).putString("feature_usage_package_name", this.d).apply();
            return;
        }
        this.g = sharedPreferences.getLong("feature_usage_last_report_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet4 = new HashSet();
        for (String str3 : sharedPreferences.getAll().keySet()) {
            if (str3.startsWith("feature_usage_timestamp_")) {
                long j = this.c.getLong(str3, 0L);
                if (j == 0 || currentTimeMillis - j <= 1209600000) {
                    if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                        anfx f = f(str3.substring(41));
                        this.f.add(f);
                        this.e.add(f);
                    } else if (str3.startsWith("feature_usage_timestamp_detected_feature_")) {
                        this.e.add(f(str3.substring(41)));
                    }
                } else {
                    hashSet4.add(str3);
                }
            }
        }
        g(hashSet4);
        qnm.b(this.i);
        h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str, String str2) {
        return String.format("%s%s", str, str2);
    }

    public static void d(anfx anfxVar) {
        qmc qmcVar = h;
        if (qmcVar == null) {
            return;
        }
        qmcVar.c.edit().putLong(qmcVar.c(qmcVar.a(anfxVar)), System.currentTimeMillis()).apply();
        qmcVar.e.add(anfxVar);
        qmcVar.h();
    }

    public static synchronized void e(SharedPreferences sharedPreferences, qlv qlvVar, String str) {
        synchronized (qmc.class) {
            if (h == null) {
                h = new qmc(sharedPreferences, qlvVar, str);
            }
        }
    }

    private static anfx f(String str) {
        try {
            return anfx.a(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return anfx.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        }
    }

    private final void g(Set set) {
        if (set.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.c.edit();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }

    private final void h() {
        this.j.post(this.i);
    }

    public final String a(anfx anfxVar) {
        return Integer.toString(anfxVar.X);
    }

    public final String c(String str) {
        String b = b("feature_usage_timestamp_reported_feature_", str);
        return this.c.contains(b) ? b : b("feature_usage_timestamp_detected_feature_", str);
    }
}
