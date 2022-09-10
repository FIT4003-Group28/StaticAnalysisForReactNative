package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bqvh  reason: default package */
/* loaded from: classes4.dex */
public class bqvh implements bqta {
    public final bqvb a;
    public final cqkp b;
    public final bqvd c;
    public final ges d;
    public final bqks e;
    public dcdn<String, bqsz> f = dcmn.a;

    public bqvh(bqks bqksVar, bqvb bqvbVar, cqkp cqkpVar, ges gesVar, cqhn cqhnVar, bqvd bqvdVar) {
        this.e = bqksVar;
        this.a = new bqvg(bqvbVar, bqksVar);
        this.b = cqkpVar;
        this.d = gesVar;
        this.c = bqvdVar;
        am.a(bqksVar.h, bqke.a).b(gesVar, new aa(this) { // from class: bqve
            private final bqvh a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                final bqvh bqvhVar = this.a;
                dcdc<bbtm> dcdcVar = (dcdc) obj;
                dcdg p = dcdn.p();
                dbsk.s(dcdcVar);
                int size = dcdcVar.size();
                dbsk.s(dcdcVar);
                int i = 0;
                for (bbtm bbtmVar : dcdcVar) {
                    String A = bbtmVar.A();
                    int i2 = i + 1;
                    bqsz bqszVar = (bqsz) dbsg.j(bqvhVar.f.get(bbtmVar.A())).e(new dbty(bqvhVar) { // from class: bqvf
                        private final bqvh a;

                        {
                            this.a = bqvhVar;
                        }

                        @Override // defpackage.dbty
                        public final Object a() {
                            bqvh bqvhVar2 = this.a;
                            bqvd bqvdVar2 = bqvhVar2.c;
                            bqvb bqvbVar2 = bqvhVar2.a;
                            ges gesVar2 = bqvhVar2.d;
                            bqvd.a(bqvbVar2, 1);
                            bqvd.a(gesVar2, 2);
                            Activity activity = (Activity) ((dxjd) bqvdVar2.a).a;
                            bqvd.a(activity, 3);
                            cqkj a = bqvdVar2.b.a();
                            bqvd.a(a, 4);
                            btvo a2 = bqvdVar2.c.a();
                            bqvd.a(a2, 5);
                            bqse a3 = bqvdVar2.d.a();
                            bqvd.a(a3, 6);
                            cqhn a4 = bqvdVar2.e.a();
                            bqvd.a(a4, 7);
                            return new bqvc(bqvbVar2, gesVar2, activity, a, a2, a3, a4);
                        }
                    });
                    bqszVar.h(bbtmVar, i, size, !(!bbtmVar.l().a() && bqvhVar.e.b.a(bqkl.i(bbtmVar))));
                    p.f(A, bqszVar);
                    i = i2;
                }
                bqvhVar.f = p.b();
                cqkx.p(bqvhVar.b);
            }
        });
    }

    @Override // defpackage.bqta
    public dcdc<bqsz> a() {
        return dcdc.r(this.f.values());
    }
}
