package defpackage;

import com.google.android.apps.maps.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bafl  reason: default package */
/* loaded from: classes3.dex */
public class bafl implements baem {
    public final Executor a;
    public final bbaa b;
    public final gga c;
    public final bafk d;
    public final ges e;
    private final beya i;
    public int h = 1;
    public dcdc<bayf> f = dcdc.e();
    public final Map<azxb, bazz> g = new HashMap();

    public bafl(Executor executor, beya beyaVar, bbaa bbaaVar, gga ggaVar, bafk bafkVar, ges gesVar) {
        this.a = executor;
        this.i = beyaVar;
        this.b = bbaaVar;
        this.c = ggaVar;
        this.d = bafkVar;
        this.e = gesVar;
    }

    @Override // defpackage.baem
    public Boolean a() {
        boolean z = true;
        if (this.h != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.baem
    public List<bayf> c() {
        return this.f;
    }

    public void d() {
        this.h = 1;
        final bexz a = this.i.a(new bexy(this) { // from class: bafa
            private final bafl a;

            {
                this.a = this;
            }

            @Override // defpackage.bexy
            public final void a(bexz bexzVar, boolean z) {
                final bafl baflVar = this.a;
                if (!z) {
                    if (!baflVar.e.aD) {
                        return;
                    }
                    baflVar.a.execute(new Runnable(baflVar) { // from class: bafg
                        private final bafl a;

                        {
                            this.a = baflVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bafl baflVar2 = this.a;
                            baflVar2.h = 2;
                            cqkx.p(baflVar2);
                        }
                    });
                    return;
                }
                bafk bafkVar = baflVar.d;
                Runnable runnable = new Runnable(baflVar) { // from class: bafe
                    private final bafl a;

                    {
                        this.a = baflVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bafl baflVar2 = this.a;
                        baflVar2.h = 3;
                        cqkx.p(baflVar2);
                    }
                };
                Runnable runnable2 = new Runnable(baflVar) { // from class: baff
                    private final bafl a;

                    {
                        this.a = baflVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bafl baflVar2 = this.a;
                        baflVar2.h = 2;
                        cqkx.p(baflVar2);
                    }
                };
                azzu azzuVar = bexzVar.a;
                dbsk.s(azzuVar);
                List<baal> b = bafkVar.a.b(azzuVar.i());
                if (b.isEmpty()) {
                    bafkVar.d.f(b);
                    runnable.run();
                    return;
                }
                bafkVar.c = bafkVar.b.a(azzuVar, new bafj(bafkVar, runnable, b, runnable2));
                boolean i = bafkVar.c.i(b);
                bafkVar.d.f(bafkVar.a(b));
                if (i) {
                    return;
                }
                runnable.run();
            }
        });
        this.d.d.b(this.e, new aa(this, a) { // from class: bafb
            private final bafl a;
            private final bexz b;

            {
                this.a = this;
                this.b = a;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                final bafl baflVar = this.a;
                final bexz bexzVar = this.b;
                baflVar.f = dcbg.b((List) obj).s(new dbrn(baflVar, bexzVar) { // from class: bafd
                    private final bafl a;
                    private final bexz b;

                    {
                        this.a = baflVar;
                        this.b = bexzVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        bafl baflVar2 = this.a;
                        bexz bexzVar2 = this.b;
                        baal baalVar = (baal) obj2;
                        ayfk ayfkVar = baflVar2.d.c;
                        dbsk.s(ayfkVar);
                        azxb a2 = baalVar.a();
                        if (baflVar2.g.containsKey(a2)) {
                            bazz bazzVar = baflVar2.g.get(a2);
                            bazzVar.h(bexzVar2);
                            return bazzVar;
                        }
                        bazz a3 = baflVar2.b.a(baalVar, bexzVar2);
                        baak z = baalVar.z();
                        dbsk.s(z);
                        bnju h = ayfkVar.h(z.a());
                        if (h == null) {
                            return a3;
                        }
                        a3.i(h);
                        baflVar2.g.put(a2, a3);
                        return a3;
                    }
                }).z();
                cqkx.p(baflVar);
            }
        });
        cqkx.p(this);
    }

    @Override // defpackage.baem
    public baye b() {
        int i = this.h;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                gga ggaVar = this.c;
                return new bbao(ggaVar, ggaVar.getString(R.string.FOLLOWED_TAB_RETRY_SYNC_HEADLINE_TEXT), null, false, new Runnable(this) { // from class: bafc
                    private final bafl a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d();
                    }
                });
            } else if (i2 != 2) {
                String str = i != 1 ? i != 2 ? "FINISHED" : "FAILED" : "LOADING";
                StringBuilder sb = new StringBuilder(str.length() + 15);
                sb.append("unknown state: ");
                sb.append(str);
                throw new AssertionError(sb.toString());
            }
        }
        return new bafh(this);
    }
}
