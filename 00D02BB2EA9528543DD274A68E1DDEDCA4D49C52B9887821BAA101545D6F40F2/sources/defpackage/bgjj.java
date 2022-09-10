package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
/* compiled from: PG */
/* renamed from: bgjj  reason: default package */
/* loaded from: classes3.dex */
public final class bgjj extends bghe<bgns> {
    private final cqlc<bgns, cqfc> d = new cqlc(this) { // from class: bgio
        private final bgjj a;

        {
            this.a = this;
        }

        @Override // defpackage.cqlc
        public final Object a(cqkp cqkpVar) {
            bgns bgnsVar = (bgns) cqkpVar;
            return new cqfc() { // from class: bgja
                @Override // defpackage.cqfc
                public final void a(View view, boolean z) {
                    View a2 = cqhu.a(view, bgjj.a);
                    dbsk.s(a2);
                    double width = a2.getWidth();
                    Double.isNaN(width);
                    bgjj.b = cqrp.c(width * 0.9d);
                }
            };
        }

        @Override // defpackage.cqlc
        public final boolean b() {
            return false;
        }
    };
    public static final cqjg a = cqjg.a();
    private static final cqjg c = cqjg.a();
    public static cqrp b = cqrp.d(300.0d);

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cqkp cqkpVar, Context context, cqiv cqivVar) {
        cqiw bgmzVar;
        Object obj;
        bgns bgnsVar = (bgns) cqkpVar;
        List<diov> m = bgnsVar.m();
        for (int i2 = 0; i2 < m.size(); i2++) {
            int a2 = dgbq.a(m.get(i2).a);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 - 1 != 2) {
                bgmzVar = new bgkb(cqgr.ce(b), cqgr.bp(-1), cqgr.ei(ImageView.ScaleType.CENTER_CROP));
                obj = (bgnu) bgnsVar.l(i2);
            } else {
                bgmzVar = new bgmz(cqgr.fD(null), cqgr.ce(b), cqgr.bp(-1));
                obj = (bgoc) bgnsVar.l(i2);
            }
            cqivVar.a(bgmzVar, obj);
            if (i2 != m.size() - 1) {
                cqivVar.a(new hsd(), hsd.d(ibn.d()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bgns> a() {
        bgin bginVar = new bgin();
        cqlc cqlcVar = bgjc.a;
        cqmp[] cqmpVarArr = {cqgr.dQ(ibn.f()), cqgr.dF(cqrp.d(8.0d)), cqgr.dU(ibn.f()), cqgr.dB(ibn.f())};
        cqjg cqjgVar = a;
        cqjg cqjgVar2 = c;
        return cqgr.fY(cqgr.bp(-2), cqgr.cd(-1), cqqx.E(cqgr.bp(-2), f(), g(), h(), e(), cqgr.fF(this.d), cqqx.s(cqrp.d(4.0d)), cqqx.i(cqrp.d(2.0d)), cqqx.g(cqrp.d(8.0d)), cqqx.B(true), cqqx.y(false), cqqx.d(ibm.b()), iue.c(bgiz.a), cqgr.V(bgjb.a), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.fR(bginVar, cqlcVar, cqmpVarArr), cqgr.fR(new bglj(), bgjd.a, new cqmp[0]), cqgr.gj(cqgr.cd(-1), cqgr.bp(-2), cqgr.gd(cqgr.aT(cqjgVar), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.gj(cqgr.aI(bgje.a), cqgr.cd(-1), cqgr.bq(b), cqgr.dE(bgjf.a), iue.c(bgjg.a), cqqx.D(cqgr.aT(cqjgVar2), cqgr.cd(-1), cqgr.bp(-1), cqqx.v(bgjh.a), cqqx.G(), cqgr.ck(C())), cqgr.fP(new bgkh(), bgji.a, cqgr.f(cqjgVar2))), cqgr.fY(cqgr.aF(bgip.a), cqgr.fF(bgiq.a), cqgr.dE(bgir.a), cqgr.fR(new bgkb(new cqmp[0]), bgis.a, new cqmp[0]), cqgr.fR(new bgmz(new cqmp[0]), bgit.a, new cqmp[0])), cqgr.fP(new bgjx(), bgiu.a, cqgr.aI(bgiv.a))), cqgr.fP(new bgic(), bgiw.a, cqjv.l(bgix.a, cqgr.bY(cqjd.j()), cqgr.bY(cqjd.u(cqjgVar))))), cqgr.fR(new bglb(), bgiy.a, new cqmp[0]))));
    }
}
