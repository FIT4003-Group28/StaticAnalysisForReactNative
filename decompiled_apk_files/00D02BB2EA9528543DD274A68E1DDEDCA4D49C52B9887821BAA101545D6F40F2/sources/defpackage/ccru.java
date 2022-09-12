package defpackage;

import android.content.IntentFilter;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ccru  reason: default package */
/* loaded from: classes4.dex */
public final class ccru {
    public final Executor a;
    private final gga c;
    private final crzb d;
    private final dxio<bbul> e;
    public final List<ccrs> b = new ArrayList();
    private dbsg<ccrt> f = dbpy.a;

    public ccru(gga ggaVar, crzb crzbVar, Executor executor, dxio<bbul> dxioVar) {
        this.c = ggaVar;
        this.d = crzbVar;
        this.a = executor;
        this.e = dxioVar;
    }

    private final synchronized void f() {
        if (this.f.a()) {
            apt.a(this.c).c(this.f.b());
            this.f = dbpy.a;
        }
    }

    public final synchronized void a() {
        dcbg<deig> s = dcbg.b(this.b).s(ccrj.a);
        d(this.b);
        for (deig deigVar : s) {
            deigVar.cancel(true);
        }
    }

    public final void b(final List<String> list, final bvqg<List<drax>> bvqgVar) {
        boolean z = false;
        if (!list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (TextUtils.isEmpty(it.next())) {
                    break;
                }
            }
        }
        dbsk.a(z);
        this.a.execute(new Runnable(this, list, bvqgVar) { // from class: ccrk
            private final ccru a;
            private final List b;
            private final bvqg c;

            {
                this.a = this;
                this.b = list;
                this.c = bvqgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ccru ccruVar = this.a;
                List list2 = this.b;
                bvqg bvqgVar2 = this.c;
                dcdc z2 = dcbg.b(list2).s(ccrq.a).z();
                synchronized (ccruVar) {
                    ccruVar.b.addAll(z2);
                    ccruVar.e();
                }
                dege degeVar = dege.a;
                ccrr ccrrVar = new ccrr(ccruVar, bvqgVar2, z2);
                final dcbg s = dcbg.b(z2).s(ccrm.a);
                deha.q(deha.l(s).b(new Callable(s) { // from class: ccrn
                    private final Iterable a;

                    {
                        this.a = s;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Iterable<dehn> iterable = this.a;
                        dccx F = dcdc.F();
                        for (dehn dehnVar : iterable) {
                            dbsk.l(dehnVar.isDone());
                            dbsg dbsgVar = (dbsg) deha.s(dehnVar);
                            if (dbsgVar.a()) {
                                F.g((drax) dbsgVar.b());
                            }
                        }
                        return F.f();
                    }
                }, dege.a), ccrrVar, degeVar);
                ccruVar.c(z2);
            }
        });
    }

    public final synchronized void c(List<ccrs> list) {
        dbsg<String> j;
        dcdc r = dcdc.r(list);
        r.size();
        this.d.a();
        int size = r.size();
        for (int i = 0; i < size; i++) {
            ccrs ccrsVar = (ccrs) r.get(i);
            String str = ccrsVar.a;
            if (ccrsVar.c.a()) {
                j = ccrsVar.c;
            } else {
                j = dbsg.j(this.e.a().e(str));
            }
            if (j.a()) {
                int k = this.e.a().k(j.b());
                int i2 = k - 1;
                if (k == 0) {
                    throw null;
                }
                if (i2 == 2) {
                    j.b();
                    ccrsVar.b.j(dbpy.a);
                } else if (i2 == 3) {
                    String f = this.e.a().f(j.b());
                    dbsk.s(f);
                    dbsg<String> g = this.e.a().g(j.b());
                    draw bZ = drax.d.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    drax draxVar = (drax) bZ.b;
                    f.getClass();
                    draxVar.a |= 1;
                    draxVar.b = f;
                    if (g.a()) {
                        String b = g.b();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        drax draxVar2 = (drax) bZ.b;
                        b.getClass();
                        draxVar2.a = 2 | draxVar2.a;
                        draxVar2.c = b;
                    }
                    j.b();
                    ccrsVar.b.j(dbsg.i(bZ.bK()));
                } else {
                    j.b();
                    ccrsVar.c = j;
                }
            }
            if (ccrsVar.b.isDone()) {
                String str2 = ccrsVar.a;
                d(dcdc.f(ccrsVar));
            }
        }
        this.b.size();
    }

    public final synchronized void d(List<ccrs> list) {
        this.b.removeAll(list);
        if (this.b.isEmpty()) {
            f();
        }
    }

    public final synchronized void e() {
        if (!this.f.a()) {
            ccrt ccrtVar = new ccrt(new bvqg(this) { // from class: ccro
                private final ccru a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    ccru ccruVar = this.a;
                    ccruVar.a.execute(new Runnable(ccruVar, (dbsg) obj) { // from class: ccrl
                        private final ccru a;
                        private final dbsg b;

                        {
                            this.a = ccruVar;
                            this.b = r2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            List<ccrs> list;
                            ccru ccruVar2 = this.a;
                            final dbsg dbsgVar = this.b;
                            synchronized (ccruVar2) {
                                if (dbsgVar.a() && !((String) dbsgVar.b()).isEmpty()) {
                                    list = dcbg.b(ccruVar2.b).o(new dbsl(dbsgVar) { // from class: ccrp
                                        private final dbsg a;

                                        {
                                            this.a = dbsgVar;
                                        }

                                        @Override // defpackage.dbsl
                                        public final boolean a(Object obj2) {
                                            ccrs ccrsVar = (ccrs) obj2;
                                            dbsk.s(ccrsVar);
                                            return ((String) this.a.b()).equals(ccrsVar.a);
                                        }
                                    }).z();
                                } else {
                                    list = ccruVar2.b;
                                }
                                ccruVar2.c(list);
                            }
                        }
                    });
                }
            });
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("geo.uploader.upload_progress_broadcast_action");
            apt.a(this.c).b(ccrtVar, intentFilter);
            this.e.a().j(ccrtVar);
            this.f = dbsg.i(ccrtVar);
        }
    }
}
