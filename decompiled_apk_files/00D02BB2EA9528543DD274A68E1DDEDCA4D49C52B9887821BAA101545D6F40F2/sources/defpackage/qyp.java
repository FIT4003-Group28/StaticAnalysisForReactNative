package defpackage;

import android.app.Application;
import android.content.res.Resources;
import android.location.Address;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: qyp  reason: default package */
/* loaded from: classes7.dex */
public class qyp implements qye {
    public static final dcdn<dndr, dndr> a = dcdn.l(dndr.INFERRED_HOME, dndr.HOME, dndr.INFERRED_WORK, dndr.WORK);
    public final Application b;
    public final quz c;
    public final Runnable d;
    public final dxio<bvjj> e;
    public final dxio<cqat> f;
    private final bsvm i;
    private final dxio<axwy> j;
    private final Executor k;
    private final qyg l;
    private final btvo m;
    private final dxio<afha> n;
    public qvb g = qvb.c(null, null);
    @dzsi
    public CharSequence h = null;
    private boolean o = false;

    public qyp(Application application, qyh qyhVar, bsvm bsvmVar, dxio<axwy> dxioVar, axws axwsVar, dxio<bvjj> dxioVar2, dxio<cqat> dxioVar3, Executor executor, qyg qygVar, btvo btvoVar, dxio<afha> dxioVar4, quz quzVar, Runnable runnable) {
        this.b = application;
        this.i = bsvmVar;
        this.j = dxioVar;
        this.e = dxioVar2;
        this.f = dxioVar3;
        this.k = executor;
        this.l = qygVar;
        this.m = btvoVar;
        this.n = dxioVar4;
        this.c = quzVar;
        this.d = runnable;
        axwsVar.c(false);
    }

    @dzsi
    public static String m(dbsg<Address> dbsgVar) {
        if (!dbsgVar.a()) {
            return null;
        }
        return dbsgVar.b().getLocality();
    }

    private final dehn<dbsg<Address>> o(@dzsi azva azvaVar) {
        if (azvaVar == null) {
            return deha.a(dbpy.a);
        }
        final qyg qygVar = this.l;
        final akqq akqqVar = azvaVar.e;
        if (akqqVar == null) {
            return deha.a(dbpy.a);
        }
        return qygVar.a.c(new Callable(qygVar, akqqVar) { // from class: qyf
            private final qyg a;
            private final akqq b;

            {
                this.a = qygVar;
                this.b = akqqVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                qyg qygVar2 = this.a;
                akqq akqqVar2 = this.b;
                try {
                    List<Address> fromLocation = qygVar2.b.getFromLocation(akqqVar2.a, akqqVar2.b, 1);
                    return !fromLocation.isEmpty() ? dbsg.i(fromLocation.get(0)) : dbpy.a;
                } catch (IOException unused) {
                    return dbpy.a;
                }
            }
        });
    }

    @Override // defpackage.qye
    public String a() {
        return this.b.getResources().getString(R.string.INFERRED_HOME_WORK_NOTICE_TITLE_COMMUTE);
    }

    @Override // defpackage.qye
    @dzsi
    public CharSequence b() {
        return this.h;
    }

    @Override // defpackage.qye
    public String c() {
        Resources resources = this.b.getResources();
        String string = resources.getString(R.string.BASED_ON_YOUR_LOCATION_HISTORY);
        String string2 = resources.getString(R.string.VISIBLE_ONLY_TO_YOU);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 3 + String.valueOf(string2).length());
        sb.append(string);
        sb.append(" • ");
        sb.append(string2);
        return sb.toString();
    }

    @Override // defpackage.qye
    public CharSequence d() {
        Resources resources = this.b.getResources();
        bvsx bvsxVar = new bvsx(resources);
        bvsv a2 = bvsxVar.a(resources.getString(R.string.LOCATION_HISTORY_SETTINGS_LINK));
        a2.m(R.color.qu_daynight_google_blue_500);
        bvsu c = bvsxVar.c(R.string.TURN_OFF_LOCATION_HISTORY_MESSAGE);
        c.a(a2);
        return c.c();
    }

    @Override // defpackage.qye
    public cqkl e() {
        this.i.j();
        return cqkl.a;
    }

    @Override // defpackage.qye
    public CharSequence f() {
        bvsu c = new bvsx(this.b.getResources()).c(R.string.LEARN_MORE);
        c.m(R.color.qu_daynight_google_blue_500);
        return c.c();
    }

    @Override // defpackage.qye
    public cqkl g() {
        this.n.a().m(cjxr.i(this.m), 4);
        return cqkl.a;
    }

    @Override // defpackage.qye
    public cjtd h() {
        return cjtd.a(dtxl.aC);
    }

    @Override // defpackage.qye
    public cjtd i() {
        return cjtd.a(dtxl.aG);
    }

    @Override // defpackage.qye
    public cjtd j() {
        return cjtd.a(dtxl.aF);
    }

    @Override // defpackage.qye
    public dcdc<qyd> k() {
        Application application = this.b;
        dxio<axwy> dxioVar = this.j;
        dxio<bvjj> dxioVar2 = this.e;
        dxio<cqat> dxioVar3 = this.f;
        final quz quzVar = this.c;
        quzVar.getClass();
        return dcdc.g(new qyo(application, dxioVar, dxioVar2, dxioVar3, new Runnable(quzVar) { // from class: qyk
            private final quz a;

            {
                this.a = quzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        }, ((qun) this.g).a), new qyl(this));
    }

    public void l(qvb qvbVar) {
        this.g = qvbVar;
        if (qyh.a(qvbVar)) {
            azva azvaVar = null;
            this.h = null;
            quy quyVar = ((qun) this.g).a;
            final azva d = quyVar == null ? null : quyVar.d();
            quy quyVar2 = ((qun) this.g).a;
            if (quyVar2 != null) {
                azvaVar = quyVar2.e();
            }
            final azva azvaVar2 = azvaVar;
            final dehn<dbsg<Address>> o = o(d);
            final dehn<dbsg<Address>> o2 = o(azvaVar2);
            deha.k(o, o2).c(new Runnable(this, o, o2, d, azvaVar2) { // from class: qyi
                private final qyp a;
                private final dehn b;
                private final dehn c;
                private final azva d;
                private final azva e;

                {
                    this.a = this;
                    this.b = o;
                    this.c = o2;
                    this.d = d;
                    this.e = azvaVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dndr dndrVar;
                    boolean z;
                    qyp qypVar = this.a;
                    dehn dehnVar = this.b;
                    dehn dehnVar2 = this.c;
                    azva azvaVar3 = this.d;
                    azva azvaVar4 = this.e;
                    try {
                        String m = qyp.m((dbsg) dehnVar.get());
                        String m2 = qyp.m((dbsg) dehnVar2.get());
                        if (azvaVar3 != null && m == null) {
                            return;
                        }
                        if ((azvaVar4 != null && m2 == null) || (dndrVar = ((qun) qypVar.g).b) == null) {
                            return;
                        }
                        if (dndrVar != dndr.HOME && dndrVar != dndr.INFERRED_HOME) {
                            z = false;
                            if (m == null || m2 == null) {
                            }
                            bvsx bvsxVar = new bvsx(qypVar.b.getResources());
                            bvsu c = bvsxVar.c(R.string.COMMUTE_SOURCE_TO_DESTINATION);
                            Object[] objArr = new Object[2];
                            bvsv a2 = bvsxVar.a(true != z ? m : m2);
                            a2.i();
                            objArr[0] = a2;
                            if (true != z) {
                                m = m2;
                            }
                            bvsv a3 = bvsxVar.a(m);
                            a3.i();
                            objArr[1] = a3;
                            c.a(objArr);
                            qypVar.h = c.c();
                            return;
                        }
                        z = true;
                        if (m == null) {
                        }
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }, this.k).Pk(new Runnable(this) { // from class: qyj
                private final qyp a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    qyp qypVar = this.a;
                    if (qypVar.h != null) {
                        qypVar.d.run();
                    }
                }
            }, this.k);
            return;
        }
        this.o = true;
        this.d.run();
    }

    public boolean n() {
        return this.o;
    }
}
