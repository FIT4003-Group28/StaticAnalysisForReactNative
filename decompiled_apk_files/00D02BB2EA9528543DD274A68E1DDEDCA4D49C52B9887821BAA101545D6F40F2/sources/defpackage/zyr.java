package defpackage;

import android.view.View;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zyr  reason: default package */
/* loaded from: classes7.dex */
public final class zyr extends cqiw<zyt> {
    private static final cqss e = irg.J();
    public static final cqss a = ibm.x();
    private static final cqss f = irg.i();
    public static final cqss b = irg.f();
    public static final cqss c = irg.j();
    public static final cqss d = irg.a();
    private static final cqvj g = irn.e;
    private static final cqvj h = irn.b;
    private static final cqrp i = cqrp.f(16.0d);

    private static cqmj<zyt> e(int i2, int i3, int i4, cqlc<zyt, CharSequence> cqlcVar, cqlc<zyt, cqgl> cqlcVar2, final cqlc<zyt, View.OnClickListener> cqlcVar3) {
        cqmp[] cqmpVarArr = new cqmp[4];
        cqmpVarArr[0] = cqjv.j(cqpl.COUNTER_ENABLED, Boolean.valueOf(i4 != Integer.MAX_VALUE));
        Integer valueOf = Integer.valueOf(i4);
        cqmpVarArr[1] = cqjv.j(cqpl.COUNTER_MAX_LENGTH, valueOf);
        cqmpVarArr[2] = cqgr.ca(Float.valueOf(1.0f));
        cqmpVarArr[3] = cqgr.fX(cqgr.aR(Integer.valueOf(i2)), cqgr.bp(-1), cqgr.cd(-1), cqgr.t(false), cqgr.aO(Integer.valueOf(i3)), cqgr.cx(valueOf), cqgr.eB(true), cqgr.dp(cqgi.a(cqlcVar2)), cqgr.eM(cqlcVar), cqgr.eU(e), cqgr.eX(f), cqgr.fh(i), cqgr.fe(g), cqgr.aA(new cqlc(cqlcVar3) { // from class: zyp
            private final cqlc a;

            {
                this.a = cqlcVar3;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqss cqssVar = zyr.a;
                return Boolean.valueOf(this.a.a((zyt) cqkpVar) == null);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.cW(cqlcVar3));
        return cqpm.a(cqmpVarArr);
    }

    private static final cqmj<zyt> f() {
        cqrp d2 = cqrp.d(10.0d);
        cqrp d3 = cqrp.d(10.0d);
        cqmp[] cqmpVarArr = {cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(3), cqgr.dz(d3, d3, d3, d3), cqgr.eL(Integer.valueOf(zxq.WIDGET_CONFIG_TITLE)), cqgr.eU(irg.a()), cqgr.fh(cqrp.f(22.0d)), cqgr.fe(g)};
        cqrp d4 = cqrp.d(10.0d);
        return cqgr.fY(cqgr.bp(-2), cqgr.cd(-1), cqgr.x(a), cqgr.dz(d2, d2, d2, d2), cqgr.gq(cqmpVarArr), cqgr.gc(cqgr.bq(cqrp.d(50.0d)), cqgr.ce(cqrp.d(50.0d)), cqgr.bw(5), cqgr.dz(d4, d4, d4, d4), cqgr.eE(cqrt.g(2131232205, irg.a())), cqgr.cW(cqgr.q(zxr.a)), iue.c(zyc.a)));
    }

    private static final cqmj<zyt> h() {
        return cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.bw(17), cqgr.bD(cqrp.d(10.0d)), cqgr.dr(0), jfx.a(cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(17), cqgr.z(b), WebImageView.b(zyj.a, cqgr.bq(cqrp.d(40.0d)), cqgr.ce(cqrp.d(40.0d)), cqgr.bA(cqrp.d(20.0d)), cqgr.bw(17))), cqgr.gs(cqgr.bp(-1), cqgr.ce(cqrp.d(15.0d))), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), e(R.id.WIDGET_NAME_EDITTEXT, zxq.SET_WIDGET_NAME_HINT, 7, zyk.a, zyl.a, cqkz.a(null)), e(R.id.WIDGET_DESTINATION_EDITTEXT, zxq.SET_WIDGET_DESTINATION_HINT, Integer.MAX_VALUE, zym.a, zyn.a, cqgr.q(zyo.a))));
    }

    private static final cqmj<zyt> i(final int i2) {
        cqss cqssVar = a;
        cqss cqssVar2 = e;
        return cqgr.gd(cqgr.aI(new cqlc(i2) { // from class: zxw
            private final int a;

            {
                this.a = i2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i3 = this.a;
                cqss cqssVar3 = zyr.a;
                return ((zyt) cqkpVar).l(i3);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(0), cqgr.fW(cqgr.bV(cqrp.d(10.0d)), cqgr.bD(cqrp.d(10.0d)), cqgr.bG(cqrp.d(10.0d)), cqgr.cW(cqgr.q(new cqlc(i2) { // from class: zxx
            private final int a;

            {
                this.a = i2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i3 = this.a;
                cqss cqssVar3 = zyr.a;
                return ((zyt) cqkpVar).p(i3);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })), cqgr.I(new cqlc(i2) { // from class: zxy
            private final int a;

            {
                this.a = i2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i3 = this.a;
                cqss cqssVar3 = zyr.a;
                return ((zyt) cqkpVar).o(i3);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), irn.ac(cqssVar, cqssVar2)), cqgr.gq(cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(16), cqgr.eM(new cqlc(i2) { // from class: zxz
            private final int a;

            {
                this.a = i2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                int i3 = this.a;
                cqss cqssVar3 = zyr.a;
                return ((zyt) cqkpVar).n(i3);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eU(cqssVar2), cqgr.fh(i), cqgr.fe(g)));
    }

    private static final cqmj<zyt> j(final dqvj dqvjVar) {
        return cqqx.E(cqgr.bp(-2), cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(Float.valueOf(1.0f)), cqqx.f(new cqlc(dqvjVar) { // from class: zyq
            private final dqvj a;

            {
                this.a = dqvjVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                dqvj dqvjVar2 = this.a;
                cqss cqssVar = zyr.a;
                return ((zyt) cqkpVar).k(dqvjVar2).booleanValue() ? zyr.a : zyr.b;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqqx.g(cqrp.d(3.0d)), cqqx.i(cqrp.d(dcyn.a)), cqgr.cW(cqgr.q(new cqlc(dqvjVar) { // from class: zxs
            private final dqvj a;

            {
                this.a = dqvjVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                dqvj dqvjVar2 = this.a;
                cqss cqssVar = zyr.a;
                return ((zyt) cqkpVar).m(dqvjVar2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })), iue.c(new cqlc(dqvjVar) { // from class: zxt
            private final dqvj a;

            {
                this.a = dqvjVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                dqvj dqvjVar2 = this.a;
                cqss cqssVar = zyr.a;
                return ((zyt) cqkpVar).u(dqvjVar2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.gc(cqgr.bp(-2), cqgr.cd(-2), cqgr.bw(17), cqgr.bV(cqrp.d(20.0d)), cqgr.bD(cqrp.d(20.0d)), cqgr.fn(new cqlc(dqvjVar) { // from class: zxu
            private final dqvj a;

            {
                this.a = dqvjVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                dqvj dqvjVar2 = this.a;
                cqss cqssVar = zyr.a;
                return ((zyt) cqkpVar).k(dqvjVar2).booleanValue() ? zyr.d : zyr.c;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eG(new cqlc(dqvjVar) { // from class: zxv
            private final dqvj a;

            {
                this.a = dqvjVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                dqvj dqvjVar2 = this.a;
                cqss cqssVar = zyr.a;
                return ((zyt) cqkpVar).j(dqvjVar2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zyt> a() {
        cqss cqssVar = d;
        Float valueOf = Float.valueOf(1.0f);
        cqss cqssVar2 = e;
        cqmp[] cqmpVarArr = {cqgr.bp(-2), cqgr.cd(-1), cqgr.bV(cqrp.d(15.0d)), cqgr.bD(cqrp.d(15.0d)), cqgr.eL(Integer.valueOf((int) R.string.OPTIONS)), cqgr.eU(cqssVar2), cqgr.fh(cqrp.f(18.0d)), cqgr.fe(g)};
        cqss cqssVar3 = b;
        cqmp[] cqmpVarArr2 = {cqgr.cd(-1), cqgr.bq(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dU(cqrp.d(20.0d)), cqgr.bR(cqrp.d(20.0d)), cqgr.bG(cqrp.d(20.0d)), cqgr.dr(1), h(), cqgr.gq(cqmpVarArr), cqqx.E(cqgr.bp(-2), cqgr.cd(-1), cqqx.d(cqssVar3), cqqx.g(cqrp.d(3.0d)), cqqx.i(cqrp.d(dcyn.a)), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(0), j(dqvj.DRIVE), j(dqvj.TRANSIT), j(dqvj.WALK), j(dqvj.BICYCLE))), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.gs(cqgr.bq(cqrp.d(10.0d)), cqgr.cd(-1)), i(102), i(104), i(com.google.android.filament.R.styleable.AppCompatTheme_viewInflaterClass)))};
        cqmp[] cqmpVarArr3 = {cqgr.bq(cqrp.d(1.0d)), cqgr.cd(-1), cqgr.x(cqssVar3)};
        cqrp cqrpVar = i;
        cqvj cqvjVar = h;
        return cqgr.fY(cqgr.bp(-1), cqgr.cd(-1), cqgr.x(cqssVar), cqgr.az(true), cqgr.aC(true), cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.bw(48), cqgr.dr(1), f(), cqgr.gk(cqmpVarArr2), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.bw(1), cqgr.dr(1), cqgr.gs(cqmpVarArr3), cqgr.gd(cqgr.bq(cqrp.d(60.0d)), cqgr.cd(-1), cqgr.dr(0), cqgr.fV(cqgr.bp(-1), cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqgr.z(cqssVar), cqgr.eL(Integer.valueOf((int) R.string.CANCEL_BUTTON)), cqgr.eU(cqssVar2), cqgr.fh(cqrpVar), cqgr.fe(cqvjVar), cqgr.cW(cqgr.q(zya.a)), iue.c(zyb.a)), cqgr.gs(cqgr.bp(-1), cqgr.ce(cqrp.d(1.0d)), cqgr.x(cqssVar3)), cqgr.fV(cqgr.bp(-1), cqgr.ce(cqrp.d(dcyn.a)), cqgr.ca(valueOf), cqgr.bA(cqrp.d(dcyn.a)), cqgr.z(cqssVar), cqgr.au(zyd.a), cqgr.eL(Integer.valueOf((int) R.string.SAVE)), cqgr.eW(zye.a), cqgr.fh(cqrpVar), cqgr.fe(cqvjVar), cqgr.cW(cqgr.q(zyf.a)), iue.c(zyg.a))))));
    }
}
