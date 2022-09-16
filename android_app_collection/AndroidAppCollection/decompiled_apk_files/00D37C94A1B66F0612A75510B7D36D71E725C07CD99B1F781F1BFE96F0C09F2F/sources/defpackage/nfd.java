package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Pair;
/* compiled from: PG */
/* renamed from: nfd  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nfd implements amqo {
    public final /* synthetic */ Context a;
    private final /* synthetic */ int b;

    public /* synthetic */ nfd(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.amqo
    public final Object get() {
        switch (this.b) {
            case 0:
                return new nff(this.a);
            case 1:
                return new nff(this.a);
            case 2:
                return new nff(this.a);
            case 3:
                return new nff(this.a);
            case 4:
                Context context = this.a;
                qcv qcvVar = qdb.a;
                qda b = qat.b();
                if (b.c) {
                    return null;
                }
                synchronized (b.a) {
                    if (b.c) {
                        return null;
                    }
                    if (!b.d) {
                        b.d = true;
                    }
                    b.g = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    try {
                        b.f = qyr.b(b.g).c(b.g.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    Context c = qse.c(context);
                    if (c != null || context == null || (c = context.getApplicationContext()) != null) {
                        context = c;
                    }
                    if (context != null) {
                        qhp qhpVar = qat.a.b;
                        b.e = context.getSharedPreferences("google_ads_flags", 0);
                        SharedPreferences sharedPreferences = b.e;
                        if (sharedPreferences != null) {
                            sharedPreferences.registerOnSharedPreferenceChangeListener(b);
                        }
                        qdj.a.set(new qcz(b));
                        b.a();
                        b.c = true;
                        b.d = false;
                        b.b.open();
                        return null;
                    }
                    b.d = false;
                    b.b.open();
                    return null;
                }
            case 5:
                return this.a.getSharedPreferences("primes", 0);
            case 6:
                Context context2 = this.a;
                if (uwv.a == 0) {
                    synchronized (uwv.class) {
                        if (uwv.a == 0) {
                            int a = uwv.a(context2);
                            if (a <= 0) {
                                a = 60;
                            }
                            double d = a;
                            Double.isNaN(d);
                            uwv.a = (int) Math.ceil(1000.0d / d);
                        }
                    }
                }
                return Integer.valueOf(uwv.a);
            case 7:
                return new vca(rtd.b(this.a));
            case 8:
                Context context3 = this.a;
                int i = vbt.d;
                return vsc.g(context3);
            case 9:
                return zfm.c(this.a);
            case 10:
                String packageName = this.a.getPackageName();
                return packageName != null ? packageName : "";
            case 11:
                return zag.v(this.a);
            case 12:
                Pair q = zew.q(this.a);
                return new afmv(((Integer) q.first).intValue(), ((Integer) q.second).intValue(), true);
            default:
                Pair q2 = zew.q(this.a);
                return new afmv(Math.min(((Integer) q2.first).intValue(), ((Integer) q2.second).intValue()), Math.max(((Integer) q2.first).intValue(), ((Integer) q2.second).intValue()), true);
        }
    }
}
