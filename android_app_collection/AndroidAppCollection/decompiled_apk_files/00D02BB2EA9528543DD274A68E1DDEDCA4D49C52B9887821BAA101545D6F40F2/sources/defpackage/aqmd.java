package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqmd  reason: default package */
/* loaded from: classes2.dex */
public class aqmd extends aqcg implements aqls {
    private static final dcqe r = dcqe.c("aqmd");
    @dzsi
    private aqea A;
    @dzsi
    private btlu B;
    private boolean C;
    public final apzy f;
    public final aqgn g;
    public final dxio<aqov> h;
    public final dxio<apyz> i;
    public final dxio<akfa> j;
    public final dxio<aqru> k;
    public final dxio<aqci> l;
    public apzb m;
    @dzsi
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    private final apyv s;
    private final aqis t;
    private final aqeg<cvav, cvbp> u;
    private final aqgl v;
    private final dxio<aqhw> w;
    private final dxio<aqmk> x;
    @dzsi
    private aqgk y;
    @dzsi
    private crzp<dcdn<String, apzn>> z;

    public aqmd(aqwo aqwoVar, apzy apzyVar, cqhn cqhnVar, gga ggaVar, bvrb bvrbVar, apyv apyvVar, aqit aqitVar, aqeh aqehVar, aqgl aqglVar, aqgn aqgnVar, dxio<aqov> dxioVar, dxio<aqbo> dxioVar2, dxio<apyz> dxioVar3, dxio<aqhw> dxioVar4, dxio<akfa> dxioVar5, dxio<aqru> dxioVar6, dxio<aqci> dxioVar7, dxio<aqmk> dxioVar8, ges gesVar) {
        super(ggaVar, gesVar, bvrbVar, dxioVar2);
        this.m = apzb.INBOX_IN_UPDATES_TAB;
        this.n = null;
        this.o = false;
        this.C = false;
        this.p = false;
        this.q = false;
        this.f = apzyVar;
        this.s = apyvVar;
        o oVar = gesVar.Z;
        cqhn a = aqitVar.a.a();
        aqit.a(a, 1);
        aqhu a2 = aqitVar.b.a();
        aqit.a(a2, 2);
        aqki a3 = aqitVar.c.a();
        aqit.a(a3, 3);
        aqkc a4 = aqitVar.d.a();
        aqit.a(a4, 4);
        aqeh a5 = aqitVar.e.a();
        aqit.a(a5, 5);
        aqgn a6 = aqitVar.f.a();
        aqit.a(a6, 6);
        aqjh a7 = aqitVar.g.a();
        aqit.a(a7, 7);
        dxio a8 = ((dxjh) aqitVar.h).a();
        aqit.a(a8, 8);
        dxio a9 = ((dxjh) aqitVar.i).a();
        aqit.a(a9, 9);
        dxio a10 = ((dxjh) aqitVar.j).a();
        aqit.a(a10, 10);
        Executor a11 = aqitVar.k.a();
        aqit.a(a11, 11);
        aqit.a(gesVar, 12);
        aqit.a(oVar, 13);
        this.t = new aqis(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, gesVar, oVar);
        this.v = aqglVar;
        this.g = aqgnVar;
        this.j = dxioVar5;
        this.k = dxioVar6;
        this.h = dxioVar;
        this.i = dxioVar3;
        this.l = dxioVar7;
        this.w = dxioVar4;
        this.x = dxioVar8;
        this.u = aqehVar.a(gesVar.Z, cvbp.class, aqle.b);
    }

    private final synchronized void t() {
        btlu btluVar;
        btlu j = this.j.a().j();
        if (!btlu.g(this.B, j)) {
            u();
            this.B = j;
        }
        btlu btluVar2 = this.B;
        if (btluVar2 != null && !this.s.b(btluVar2)) {
            u();
            this.a.runOnUiThread(new Runnable(this) { // from class: aqlu
                private final aqmd a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    aqmd aqmdVar = this.a;
                    cqkx.p(aqmdVar);
                    aqmdVar.p();
                }
            });
            return;
        }
        if (this.z != null || (btluVar = this.B) == null || !btluVar.l()) {
            return;
        }
        aqgl aqglVar = this.v;
        btlu btluVar3 = this.B;
        dbsk.s(btluVar3);
        this.y = aqglVar.a(btluVar3, dbss.ALWAYS_TRUE);
        crzp<dcdn<String, apzn>> crzpVar = new crzp(this) { // from class: aqlv
            private final aqmd a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                final aqmd aqmdVar = this.a;
                Map map = (Map) crzmVar.l();
                boolean z = false;
                boolean z2 = map != null && !dcjz.y(map, aqly.a).isEmpty();
                if (map != null && !map.isEmpty()) {
                    z = true;
                }
                aqmdVar.p = z;
                String str = null;
                if (map != null && map.size() == 1) {
                    str = (String) dcft.c(map.keySet());
                }
                aqmdVar.n = str;
                aqmdVar.o = z2;
                aqmdVar.a.runOnUiThread(new Runnable(aqmdVar) { // from class: aqlz
                    private final aqmd a;

                    {
                        this.a = aqmdVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aqmd aqmdVar2 = this.a;
                        cqkx.p(aqmdVar2);
                        aqmdVar2.p();
                        String str2 = aqmdVar2.n;
                        if (!aqmdVar2.o && aqmdVar2.f.l() && aqmdVar2.q && str2 != null) {
                            aqmdVar2.q = false;
                            aqmdVar2.k.a().a(str2);
                        }
                    }
                });
            }
        };
        this.z = crzpVar;
        this.y.a(crzpVar, dege.a);
    }

    private final synchronized void u() {
        if (this.z != null) {
            aqgk aqgkVar = this.y;
            dbsk.s(aqgkVar);
            aqgkVar.b(this.z);
        }
        this.z = null;
        this.B = null;
        this.n = null;
        this.p = false;
        this.o = false;
        this.A = null;
    }

    @Override // defpackage.aqcc
    public Boolean b() {
        return false;
    }

    @Override // defpackage.aqcc
    public cjtd c() {
        return cjtd.a(dtxv.dE);
    }

    @Override // defpackage.aqls
    public Boolean d() {
        boolean z = false;
        if (this.o && this.p) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aqls
    public Boolean e() {
        return Boolean.valueOf(this.C);
    }

    @Override // defpackage.aqls
    public aqoh f() {
        return this.w.a();
    }

    @Override // defpackage.aqls
    public aqhg g() {
        return this.t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqcg
    public final void h() {
        this.C = true;
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqcg
    public final void i(ctyy ctyyVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqcg
    public final void j(final dcdc<ctyy> dcdcVar) {
        dbsg i;
        if (dcdcVar.size() != 2) {
            i = dbpy.a;
        } else {
            ctyy ctyyVar = dcdcVar.get(0);
            ctyy ctyyVar2 = dcdcVar.get(1);
            if (!ctyyVar.b().e().a().equals(ctyyVar2.b().e().a())) {
                i = dbpy.a;
            } else {
                int d = aqda.d(ctyyVar);
                if (d == 1) {
                    i = aqda.d(ctyyVar2) == 2 ? dbsg.i(new aqbx(ctyyVar, ctyyVar2)) : dbpy.a;
                } else if (d != 2) {
                    i = dbpy.a;
                } else {
                    i = aqda.d(ctyyVar2) == 1 ? dbsg.i(new aqbx(ctyyVar2, ctyyVar)) : dbpy.a;
                }
            }
        }
        if (i.a()) {
            this.t.g((aqbx) i.b());
        } else if (dcdcVar.size() != 1 || aqda.d(dcdcVar.get(0)) != 1) {
            StringBuilder sb = new StringBuilder();
            int size = dcdcVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(aqda.d(dcdcVar.get(i2)));
                sb.append(",");
            }
            bvoo.h("Unexpected values returned in onAccountContextsReady(..). Account types: %s", sb.toString());
            h();
        } else {
            this.u.a(new aqef(this, dcdcVar) { // from class: aqlt
                private final aqmd a;
                private final dcdc b;

                {
                    this.a = this;
                    this.b = dcdcVar;
                }

                @Override // defpackage.aqef
                public final cuvu a(View view) {
                    final aqmd aqmdVar = this.a;
                    dcdc dcdcVar2 = this.b;
                    cvbp cvbpVar = (cvbp) view;
                    aqov a = aqmdVar.h.a();
                    ctyy ctyyVar3 = (ctyy) dcdcVar2.get(0);
                    final aqgn aqgnVar = aqmdVar.g;
                    aqgnVar.getClass();
                    return a.a(ctyyVar3, cvbpVar, new dbsl(aqgnVar) { // from class: aqma
                        private final aqgn a;

                        {
                            this.a = aqgnVar;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            return this.a.b((cufw) obj);
                        }
                    }, new cvau(aqmdVar) { // from class: aqmb
                        private final aqmd a;

                        {
                            this.a = aqmdVar;
                        }

                        @Override // defpackage.cvau
                        public final void a(ConversationId conversationId) {
                            aqmd aqmdVar2 = this.a;
                            apza i3 = apzc.i();
                            i3.b(conversationId);
                            i3.d(aqmdVar2.m);
                            aqmdVar2.i.a().n(i3.e(), false);
                        }
                    }, aqmc.a);
                }
            });
        }
    }

    @Override // defpackage.aqls
    public cjtd k() {
        return cjtd.a(dtxv.dC);
    }

    @Override // defpackage.aqls
    public aqek<cvbp> l() {
        return this.u.e;
    }

    @Override // defpackage.aqls
    @dzsi
    public aqea m() {
        if (this.o || !this.p || this.n == null) {
            return null;
        }
        if (this.A == null) {
            aqeb p = aqec.p();
            aqdk aqdkVar = (aqdk) p;
            aqdkVar.a = this.a.getString(R.string.BANNER_TRY_BUSINESS_MESSAGING_TITLE);
            aqdkVar.b = this.a.getString(R.string.BANNER_TRY_BUSINESS_MESSAGING_SUBTITLE);
            aqdkVar.i = aqdb.a(dtxv.bQ, this.n).a();
            p.b(this.a.getString(R.string.BANNER_ENABLE_BUSINESS_MESSAGING_ACTION));
            aqdkVar.c = cqrt.g(2131232197, ibm.b());
            aqdkVar.d = new Runnable(this) { // from class: aqlw
                private final aqmd a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    aqmd aqmdVar = this.a;
                    btlu j = aqmdVar.j.a().j();
                    if (j == null || !j.l() || (str = aqmdVar.n) == null) {
                        return;
                    }
                    aqmdVar.k.a().a(str);
                }
            };
            aqdkVar.e = aqdb.a(dtxv.bS, this.n).a();
            aqdkVar.f = this.a.getString(R.string.LEARN_MORE);
            aqdkVar.g = new Runnable(this) { // from class: aqlx
                private final aqmd a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.l.a().a();
                }
            };
            aqdkVar.h = aqdb.a(dtxv.bR, this.n).a();
            this.A = p.a();
        }
        return this.A;
    }

    @Override // defpackage.aqls
    public cjtd n() {
        return cjtd.a(dtxv.dB);
    }

    public void o() {
        if (this.C) {
            this.C = false;
            cqkx.p(this);
        }
        t();
    }

    public void q() {
        u();
        this.t.j();
        this.x.a().a();
    }

    public apzt r() {
        return this.t.h();
    }

    public void s(apzt apztVar) {
        this.m = apzb.a(apztVar.c);
        this.q = apztVar.d;
        this.t.i(apztVar);
    }

    public final void p() {
        if (this.o) {
            PE(dcdc.g(1, 2));
        } else {
            PE(dcdc.f(1));
        }
    }
}
