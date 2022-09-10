package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: uxj  reason: default package */
/* loaded from: classes7.dex */
public final class uxj extends cqiw<zct> {
    public final boolean d;
    private final boolean h;
    private final boolean i;
    private static final cqjg e = cqjg.a();
    public static final cqlc<zct, Boolean> a = uwz.a;
    public static final cqlc<zct, Boolean> b = uxa.a;
    private static final cqlc<zct, Boolean> f = cqkz.b(uxb.a);
    public static final cqlc<zct, Boolean> c = cqkz.b(uxc.a);
    private static final cqlc<zct, cqtd> g = uxd.a;

    public uxj(boolean z, boolean z2, boolean z3) {
        super(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
        this.i = z2;
        this.h = z;
        this.d = z3;
    }

    public static cqiw<zct> e(boolean z, boolean z2) {
        return new uxj(z, !z, !z2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean f(zct zctVar) {
        return zctVar.e().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean g(zct zctVar) {
        return (zctVar.r().booleanValue() || zctVar.I().booleanValue()) && !f(zctVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean h(zct zctVar) {
        return zctVar.F().booleanValue() && !zctVar.g().booleanValue() && !zctVar.r().booleanValue() && !f(zctVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean i(zct zctVar) {
        return zctVar.c().booleanValue() && !h(zctVar) && !zctVar.g().booleanValue() && !zctVar.r().booleanValue() && !f(zctVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean j(zct zctVar) {
        return zctVar.s().booleanValue() && !zctVar.I().booleanValue() && !f.a(zctVar).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean k(zct zctVar) {
        return zctVar.s().booleanValue() && (zctVar.I().booleanValue() || f.a(zctVar).booleanValue()) && (!zctVar.g().booleanValue() || !zctVar.H().booleanValue());
    }

    protected static boolean l(zct zctVar) {
        return zctVar.z().booleanValue() && !a.a(zctVar).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean m(zct zctVar) {
        return l(zctVar) && !zctVar.I().booleanValue() && !f.a(zctVar).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean n(zct zctVar) {
        return l(zctVar) && (zctVar.I().booleanValue() || f.a(zctVar).booleanValue()) && (!zctVar.g().booleanValue() || !zctVar.H().booleanValue());
    }

    public static boolean o(zct zctVar) {
        return !cqjv.v(zctVar.J()).booleanValue();
    }

    private static cqmj<zct> q(cqlc<zct, Boolean> cqlcVar) {
        return new cqmh(zud.class, cqic.f(cqlcVar, new cqmp[0]), cqgr.bw(8388627), cqgr.aJ(8388627), cqgr.dr(0), cqgr.cd(-2), cqgr.bp(-2), iue.c(uve.a), cqgr.bX(uvp.a), cqgr.gq(cqgr.aR(Integer.valueOf(zud.b)), cqgr.eh(false), irn.E(), ibq.o(), irn.v(), cqgr.eI("  •  ")), cqgr.gc(cqgr.eG(g), cqgr.ce(cqrp.d(18.0d)), cqgr.bq(cqrp.d(18.0d))), cqgr.gq(cqgr.aF(cqjv.x(uwa.a)), cqgr.aR(Integer.valueOf(zud.a)), cqgr.eh(false), ibq.o(), cqgr.bR(cqrp.d(4.0d)), cqgr.bG(cqrp.d(4.0d)), irn.E(), irn.v()), zud.b(uwl.a), zud.a(uww.a));
    }

    private final cqmj<zct> r(final cqlc<zct, Boolean> cqlcVar) {
        return cqgr.gd(cqic.c(new cqlc(cqlcVar) { // from class: uxe
            private final cqlc a;

            {
                this.a = cqlcVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar2 = this.a;
                zct zctVar = (zct) cqkpVar;
                cqlc<zct, Boolean> cqlcVar3 = uxj.a;
                boolean z = true;
                if (((Boolean) cqlcVar2.a(zctVar)).booleanValue() && !uxj.a.a(zctVar).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }, new cqmp[0]), cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(8388627), cqgr.ck(D(0)));
    }

    private static cqmn<zct> s(cqnf<zct> cqnfVar, cqlc<zct, cqss> cqlcVar) {
        return cqmn.a(cqnfVar, cqgr.eW(cqlcVar));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, zct zctVar, Context context, cqiv cqivVar) {
        cqiw vboVar;
        Collection K;
        zct zctVar2 = zctVar;
        if (i == 0) {
            vboVar = new vcj();
            K = zctVar2.t();
        } else if (i != 1) {
            return;
        } else {
            vboVar = new vbo();
            K = zctVar2.K();
        }
        cqivVar.f(vboVar, K);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zct> a() {
        cqmp cqmpVar;
        cqmp[] cqmpVarArr = new cqmp[8];
        cqmpVarArr[0] = cqgr.dr(1);
        cqmpVarArr[1] = cqgr.dQ(irh.b());
        cqmpVarArr[2] = cqgr.dF(irh.b());
        cqmpVarArr[3] = cqgr.dX(new cqlc(this) { // from class: uwu
            private final uxj a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                uxj uxjVar = this.a;
                if (uxj.b.a((zct) cqkpVar).booleanValue()) {
                    return cqrp.d(14.0d);
                }
                return uxjVar.d ? cqrp.d(dcyn.a) : cqrp.d(14.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr[4] = cqgr.dE(new cqlc(this) { // from class: uwv
            private final uxj a;

            {
                this.a = this;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                uxj uxjVar = this.a;
                if (uxj.b.a((zct) cqkpVar).booleanValue()) {
                    return cqrp.d(14.0d);
                }
                return uxjVar.d ? cqrp.d(6.0d) : cqrp.d(14.0d);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr[5] = this.d ? vlh.m(cqgr.aF(b)) : cqmp.e;
        cqmpVarArr[6] = cqgr.fR(new uoq(), uwx.a, new cqmp[0]);
        cqmp[] cqmpVarArr2 = new cqmp[8];
        cqmpVarArr2[0] = cqgr.aR(Integer.valueOf((int) R.id.sheet_header));
        cqmpVarArr2[1] = cqgr.bw(16);
        cqmpVarArr2[2] = cqmp.e;
        cqmpVarArr2[3] = cqgr.cd(-1);
        cqmpVarArr2[4] = cqgr.bp(-2);
        cqmpVarArr2[5] = p();
        cqmp[] cqmpVarArr3 = new cqmp[8];
        cqmpVarArr3[0] = cqgr.bw(16);
        cqmpVarArr3[1] = cqgr.cd(0);
        cqmpVarArr3[2] = cqgr.ca(Float.valueOf(1.0f));
        cqmpVarArr3[3] = cqgr.bp(-2);
        cqmpVarArr3[4] = cqgr.dr(1);
        cqmj gd = cqgr.gd(cqgr.gq(cqgr.cd(-2), cqgr.aJ(8388611), irn.E(), cqjv.n(uxf.a, s(ibq.l(), uxg.a), s(ibq.e(), uxh.a)), cqgr.eM(uxi.a)), cqgr.gc(cqgr.bw(8388627), cqgr.dU(cqrp.d(2.0d)), iue.d(uvf.a, cqkz.a(dtxn.dF)), cqgr.dT(uvg.a), cqgr.eG(uvh.a), cqgr.bI(uvi.a)), cqgr.gq(cqic.c(uvj.a, new cqmp[0]), cqgr.bG(cqrp.d(8.0d)), irn.E(), cqjv.n(uvk.a, s(ibq.l(), cqkz.a(irg.H())), s(ibq.e(), cqkz.a(irg.H()))), cqgr.eK(cqiq.c("(%s)", cqiq.h(uvl.a)))), cqgr.gq(cqic.f(uvm.a, new cqmp[0]), cqgr.bG(cqrp.d(8.0d)), irn.E(), ibq.e(), cqgr.eU(irg.J()), cqgr.eM(uvn.a)), r(uvo.a), q(uvq.a), cqgr.gg(cqic.f(uvr.a, new cqmp[0]), cqgr.aJ(80), cqgr.bq(cqrp.d(30.0d)), cqgr.ce(cqrp.d(24.0d))));
        gd.f(new cqmp[0]);
        cqmpVarArr3[5] = gd;
        cqmp[] cqmpVarArr4 = new cqmp[0];
        final ddho ddhoVar = dtxn.aO;
        final ddho ddhoVar2 = dtxn.aP;
        cqmp[] cqmpVarArr5 = new cqmp[13];
        cqmpVarArr5[0] = cqgr.aI(uvs.a);
        cqmpVarArr5[1] = cqgr.cd(-2);
        cqmpVarArr5[2] = cqgr.bp(-2);
        cqmpVarArr5[3] = cqgr.bV(cqrp.d(6.0d));
        cqmpVarArr5[4] = cqgr.aJ(8388611);
        cqmpVarArr5[5] = cqgr.gq(cqic.f(uvt.a, new cqmp[0]), cqgr.bI(uvu.a), irn.E(), ibq.o(), irn.v(), cqgr.eM(uvv.a));
        cqmpVarArr5[6] = cqgr.gq(cqic.f(uvw.a, new cqmp[0]), cqgr.bI(uvx.a), irn.E(), ibq.o(), irn.v(), cqgr.eM(uvy.a));
        cqmpVarArr5[7] = cqgr.gc(cqic.f(uvz.a, new cqmp[0]), cqgr.bG(cqrp.d(5.0d)), cqgr.ch(cqrp.d(18.0d)), cqgr.eE(itd.c()));
        cqmpVarArr5[8] = jlb.a(cqic.f(c, new cqmp[0]), cqgr.cD(uwb.a), cqgr.bI(uwc.a), iue.c(new cqlc(ddhoVar, ddhoVar2) { // from class: uwd
            private final ddho a;
            private final ddho b;

            {
                this.a = ddhoVar;
                this.b = ddhoVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                ddho ddhoVar3 = this.a;
                ddho ddhoVar4 = this.b;
                zct zctVar = (zct) cqkpVar;
                if (true != uxj.a.a(zctVar).booleanValue()) {
                    ddhoVar3 = ddhoVar4;
                }
                return zctVar.Z(ddhoVar3);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.cm(cqrp.f(2.0d)), cqgr.ar(TextUtils.TruncateAt.END), ibq.o(), irn.v(), cqjv.f(iug.ORIGINAL_TEXT, uwe.a), cqjv.f(iug.SHORT_TEXT, uwf.a));
        if (this.i) {
            cqmpVar = cqgr.gd(cqic.f(uwg.a, new cqmp[0]), cqgr.bI(uwh.a), cqgr.gq(cqgr.aI(uwi.a), ibq.o(), irn.E(), irn.v(), cqgr.eJ(cqrt.l(R.string.MOSTLY_FLAT_ROUTE))), cqgr.gq(cqgr.aF(uwj.a), cqgr.ai(cqrt.f(2131231121)), cqgr.al(cqrp.d(4.0d)), ibq.o(), irn.E(), irn.v(), cqgr.eM(uwk.a)), cqgr.gq(cqgr.aF(uwm.a), cqgr.bR(irh.g()), ibq.o(), irn.E(), irn.v(), cqgr.eI("·")), cqgr.gq(cqgr.aF(uwn.a), cqgr.bR(irh.g()), cqgr.ai(cqrt.f(2131231119)), cqgr.al(cqrp.d(4.0d)), ibq.o(), irn.v(), cqgr.eM(uwo.a)));
        } else {
            cqmpVar = cqmp.e;
        }
        cqmpVarArr5[9] = cqmpVar;
        cqmpVarArr5[10] = cqgr.gq(cqic.f(uwp.a, new cqmp[0]), irn.E(), ibq.o(), irn.v(), cqgr.eM(uwq.a), cqgr.bI(uwr.a));
        cqmpVarArr5[11] = r(uws.a);
        cqmpVarArr5[12] = q(uwt.a);
        cqmj gd2 = cqgr.gd(cqmpVarArr5);
        gd2.f(cqmpVarArr4);
        cqmpVarArr3[6] = gd2;
        cqmpVarArr3[7] = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.aJ(8388611), cqgr.bw(8388611), p(), cqgr.ck(D(1)));
        cqmpVarArr2[6] = cqgr.gd(cqmpVarArr3);
        cqmpVarArr2[7] = cqgr.fP(new uzo(), uwy.a, new cqmp[0]);
        cqmpVarArr[7] = cqgr.gd(cqmpVarArr2);
        return cqgr.gd(cqmpVarArr);
    }

    protected final cqmp<zct> p() {
        return this.h ? irn.R() : cqmp.e;
    }
}
