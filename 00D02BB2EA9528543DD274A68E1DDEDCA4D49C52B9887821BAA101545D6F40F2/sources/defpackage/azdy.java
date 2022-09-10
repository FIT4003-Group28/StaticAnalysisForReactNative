package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: azdy  reason: default package */
/* loaded from: classes3.dex */
public final class azdy extends cqiw<azef> {
    public static final cqjg a = cqjg.a();
    private static final cqjg b = cqjg.a();
    private static final cqrp c = cqrp.f(12.0d);
    private static final cqrp d = cqrp.d(2.0d);
    private static final cqrp e = cqrp.d(48.0d);
    private static final cqrp f = cqrp.d(14.0d);
    private static final cqrp g = cqrp.d(22.0d);

    private static cqmn<azef> e() {
        return cqmn.a(cqgr.bV(cqrp.d(24.0d)), cqgr.bR(g), ibq.s(), cqgr.fh(cqrp.f(12.0d)), ibq.y(), cqgr.cj(Float.valueOf(0.075f)), ibq.z(), cqgr.l(true));
    }

    @SafeVarargs
    private static cqmj<azef> f(int i, Integer num, cqlc<azef, View.OnClickListener> cqlcVar, cqmp<azef>... cqmpVarArr) {
        cqmj b2;
        cqmp[] cqmpVarArr2 = new cqmp[7];
        cqmpVarArr2[0] = cqgr.cd(-1);
        cqmpVarArr2[1] = cqgr.bp(-2);
        cqmpVarArr2[2] = cqgr.cH(ibn.a());
        cqmpVarArr2[3] = cqgr.bw(16);
        cqmpVarArr2[4] = cqgr.aJ(16);
        if (num == null) {
            b2 = hyb.b(cqgr.bR(g), cqgr.eL(Integer.valueOf(i)), cqgr.cW(cqlcVar));
        } else {
            b2 = hyb.b(hyb.g(cqrt.f(num.intValue())), hyb.i(2), cqgr.bR(g), cqgr.eL(Integer.valueOf(i)), cqgr.cW(cqlcVar));
        }
        cqmpVarArr2[5] = b2;
        cqmpVarArr2[6] = cqgr.fD(azdl.a);
        cqmj<azef> fY = cqgr.fY(cqmpVarArr2);
        fY.f(cqmpVarArr);
        return fY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SafeVarargs
    private static final cqmj<azef> h(final azee azeeVar, cqmp<azef>... cqmpVarArr) {
        int i;
        int i2;
        cqmj cqmjVar;
        cqmp[] cqmpVarArr2 = new cqmp[10];
        cqmpVarArr2[0] = cqgr.K(azdr.a);
        cqmpVarArr2[1] = cqgr.au(azds.a);
        cqmpVarArr2[2] = cqgr.cW(cqgr.q(new cqlc(azeeVar) { // from class: azdt
            private final azee a;

            {
                this.a = azeeVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                azee azeeVar2 = this.a;
                cqjg cqjgVar = azdy.a;
                return ((azef) cqkpVar).b(azeeVar2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }));
        cqmpVarArr2[3] = cqgr.aW(1);
        cqmpVarArr2[4] = iue.c(new cqlc(azeeVar) { // from class: azcy
            private final azee a;

            {
                this.a = azeeVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                azee azeeVar2 = this.a;
                cqjg cqjgVar = azdy.a;
                return ((azef) cqkpVar).c(azeeVar2);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
        cqmpVarArr2[5] = cqgr.aJ(16);
        cqmpVarArr2[6] = cqgr.cd(-1);
        cqmpVarArr2[7] = cqgr.bR(g);
        cqmp[] cqmpVarArr3 = new cqmp[8];
        cqmpVarArr3[0] = cqgr.bp(-2);
        cqmpVarArr3[1] = cqgr.cd(0);
        cqmpVarArr3[2] = cqgr.ca(Float.valueOf(1.0f));
        cqrp cqrpVar = f;
        cqmpVarArr3[3] = cqgr.bV(cqrpVar);
        cqmpVarArr3[4] = cqgr.bD(cqrpVar);
        cqmpVarArr3[5] = cqgr.dr(1);
        cqmp[] cqmpVarArr4 = new cqmp[4];
        cqmpVarArr4[0] = ibq.h();
        azee azeeVar2 = azee.PRIVATE;
        int ordinal = azeeVar.ordinal();
        if (ordinal == 0) {
            i = R.string.LIST_PRIVATE;
        } else if (ordinal == 1) {
            i = R.string.LIST_SHARED;
        } else if (ordinal != 2) {
            String valueOf = String.valueOf(azeeVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Unsupported sharing state ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i = R.string.LIST_PUBLIC;
        }
        cqmpVarArr4[1] = cqgr.eL(Integer.valueOf(i));
        cqmpVarArr4[2] = ibq.x();
        cqmpVarArr4[3] = cqgr.eN(5);
        cqmpVarArr3[6] = cqgr.gq(cqmpVarArr4);
        if (azeeVar == azee.PUBLISHED) {
            cqmm e2 = caxf.e(azdb.a);
            e2.a(ibq.q(), cqgr.cd(-2), cqgr.cH(ibn.a()), ibq.y());
            cqmjVar = e2;
        } else {
            cqmp[] cqmpVarArr5 = new cqmp[4];
            int ordinal2 = azeeVar.ordinal();
            if (ordinal2 == 0) {
                i2 = R.string.LIST_SHARING_OPTIONS_PRIVATE_CAPTION;
            } else if (ordinal2 == 1) {
                i2 = R.string.LIST_SHARING_OPTIONS_SHARED_CAPTION;
            } else if (ordinal2 != 2) {
                String valueOf2 = String.valueOf(azeeVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                sb2.append("Unsupported sharing state ");
                sb2.append(valueOf2);
                throw new IllegalArgumentException(sb2.toString());
            } else {
                i2 = R.string.LIST_SHARING_OPTIONS_PUBLIC_CAPTION;
            }
            cqmpVarArr5[0] = cqgr.eL(Integer.valueOf(i2));
            cqmpVarArr5[1] = ibq.q();
            cqmpVarArr5[2] = cqgr.cd(-2);
            cqmpVarArr5[3] = ibq.y();
            cqmjVar = cqgr.gq(cqmpVarArr5);
        }
        cqmpVarArr3[7] = cqmjVar;
        cqmpVarArr2[8] = cqgr.gd(cqmpVarArr3);
        cqmpVarArr2[9] = cqgr.gh(cqgr.I(new cqlc(azeeVar) { // from class: azcz
            private final azee a;

            {
                this.a = azeeVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                azee azeeVar3 = this.a;
                cqjg cqjgVar = azdy.a;
                return ((azef) cqkpVar).a(azeeVar3);
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.ch(e), ibq.p(), ibq.x(), cqjv.n(azda.a, cqmn.a(ibq.H()), cqmn.a(ibq.I(ibm.v(), ibm.j()))), cqgr.J(false), cqgr.az(false));
        cqmj<azef> gd = cqgr.gd(cqmpVarArr2);
        gd.f(cqmpVarArr);
        return gd;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, azef azefVar, Context context, cqiv cqivVar) {
        cqivVar.f(new azdx(), azefVar.o().a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<azef> a() {
        cqrp cqrpVar = f;
        cqrp cqrpVar2 = c;
        cqmp[] cqmpVarArr = {cqgr.aF(azcx.a), cqgr.dr(1), cqgr.cd(-1), cqgr.gq(cqgr.bA(cqrpVar), ibq.q(), cqgr.fh(cqrpVar2), cqgr.co(cqrp.f(4.0d), false), cqgr.aJ(1), cqgr.eK(cqiq.b(Integer.valueOf((int) R.string.LIST_SHARING_OPTIONS_ONLY_OWNER_MAY_CHANGE), cqiq.h(azdi.a)))), ict.n(false, cqgr.cd(-1))};
        cqmp[] cqmpVarArr2 = {cqgr.eL(Integer.valueOf((int) R.string.LIST_SHARING_LIST_TYPE)), e()};
        cqmp[] cqmpVarArr3 = {cqgr.dr(1), cqgr.dU(cqrpVar), cqgr.dB(cqrpVar), cqgr.cd(-1), cqgr.bp(-2), h(azee.PRIVATE, new cqmp[0]), h(azee.SHARED, new cqmp[0]), h(azee.PUBLISHED, cqgr.aI(azdm.a))};
        cqmp[] cqmpVarArr4 = {cqgr.cd(-1)};
        cqmp[] cqmpVarArr5 = {cqgr.eL(Integer.valueOf((int) R.string.LIST_SHARING_URL_TITLE)), e()};
        cqrp cqrpVar3 = g;
        cqmp[] cqmpVarArr6 = {cqic.f(azdn.a, new cqmp[0]), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(cqrp.d(2.0d)), cqgr.z(ibm.b()), ict.n(false, cqmpVarArr4), cqgr.gq(cqmpVarArr5), cqgr.gq(cqgr.bG(ibn.g()), cqgr.bD(ibn.d()), cqgr.bV(ibn.e()), cqgr.bR(cqrpVar3), ibq.q(), ibq.y(), cqgr.fh(cqrpVar2), cqgr.co(d, false), cqgr.dU(cqrp.d(4.0d)), cqgr.eZ(5), cqgr.eM(azdo.a)), f(R.string.LIST_SHARING_URL_COPY_LINK_BUTTON, null, cqgr.q(azdj.a), iue.b(cjtd.a(dtxy.eM)))};
        cqmp[] cqmpVarArr7 = {cqgr.bV(ibn.f()), cqgr.cd(-1)};
        cqmp[] cqmpVarArr8 = {cqgr.eL(Integer.valueOf((int) R.string.LIST_SHARING_COLLABORATION_SECTION_TITLE)), e()};
        cqjg cqjgVar = b;
        cqjg cqjgVar2 = a;
        cqmp[] cqmpVarArr9 = {cqgr.aT(cqjgVar), cqgr.bY(cqjd.e(), cqjd.y(cqjgVar2)), cqgr.dU(ibn.h()), ibq.z(), ibq.h(), ibq.x(), cqgr.eJ(cqrt.l(R.string.LIST_SHARING_COLLABORATION_SECTION_TOGGLE_LABEL))};
        cqtv h = ibn.h();
        return cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-1), cqgr.z(ibm.b()), cqgr.gk(cqgr.cd(-1), cqgr.bp(-1), cqgr.av(true), cqgr.gd(cqgr.dr(1), cqgr.gd(cqmpVarArr), cqgr.gq(cqmpVarArr2), cqgr.gi(cqmpVarArr3), cqgr.gd(cqmpVarArr6), cqgr.gd(cqic.f(azdp.a, new cqmp[0]), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.dB(ibn.g()), ict.n(false, cqmpVarArr7), cqgr.gq(cqmpVarArr8), new cqmh(huy.class, cqgr.cd(-1), cqgr.bR(cqrpVar3), cqgr.bD(ibn.g()), cqgr.au(azdc.a), cqgr.cW(cqgr.q(azdd.a)), iue.c(azde.a), cqgr.gq(cqmpVarArr9), cjmv.a(cqgr.aT(cqjgVar2), cqgr.au(azdf.a), cqgr.J(false), cqgr.az(false), cqgr.j(azdg.a), cqgr.dz(h, h, h, h), cqgr.bY(cqjd.f()), cqgr.I(azdh.a)), cqgr.gq(cqgr.bY(cqjd.e(), cqjd.u(cqjgVar), cqjd.y(cqjgVar2)), cqgr.bG(ibn.g()), ibq.q(), ibq.y(), cqgr.fh(cqrpVar2), cqgr.eL(Integer.valueOf((int) R.string.LIST_SHARING_COLLABORATION_SECTION_TOGGLE_DESCRIPTION)))), cqgr.gd(cqic.f(azdq.a, new cqmp[0]), cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-1), ict.n(false, cqgr.bV(ibn.d()), cqgr.cd(-1)), cqgr.gq(cqgr.eL(Integer.valueOf((int) R.string.LIST_SHARING_COLLABORATORS_TITLE)), e()), cqgr.gd(cqgr.bV(ibn.f()), cqgr.bD(ibn.d()), cqgr.bR(cqrpVar3), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C()))), f(R.string.LIST_SHARING_OPTIONS_INVITE_BUTTON, 2131232137, cqgr.q(azdk.a), iue.b(cjtd.a(dtxy.eL)))))));
    }
}
