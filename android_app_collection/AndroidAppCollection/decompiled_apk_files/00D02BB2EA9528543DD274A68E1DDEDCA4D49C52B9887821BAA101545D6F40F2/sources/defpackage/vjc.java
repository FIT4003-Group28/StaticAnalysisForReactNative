package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: vjc  reason: default package */
/* loaded from: classes7.dex */
public final class vjc extends cqiw<zfm> {
    public static final cqjg a = cqjg.a();
    private static final cqjg b = cqjg.a();
    private static final cqjg c = cqjg.a();
    private static final cqjg d = cqjg.a();
    private final boolean e;

    public vjc() {
        this(false);
    }

    public static vjc e() {
        return new vjc(true);
    }

    public static void f(View view) {
        ArrayList arrayList = new ArrayList();
        cqkx.f(view, uqz.a, arrayList);
        cqkx.f(view, xts.a, arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            if (view2 instanceof RecyclerView) {
                ((RecyclerView) view2).n(0);
            }
        }
    }

    @SafeVarargs
    private final <M extends cqkp> cqmj<zfm> h(M m, cqiw<M> cqiwVar, cqmp<zfm>... cqmpVarArr) {
        cqmj<zfm> fY = cqgr.fY(cqgr.aD(cqjv.v(m)), cqjv.k(cqjv.u(B().j()), cqgr.aW(4), cqgr.aW(0)), cqgr.fO(cqiwVar, m, new cqmp[0]));
        fY.f(cqmpVarArr);
        return fY;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<zfm> a() {
        xzp b2 = B().b();
        dbsk.s(b2);
        xts xtsVar = new xts();
        cqjg cqjgVar = c;
        cqmp<zfm>[] cqmpVarArr = {cqgr.bY(cqjd.u(cqjgVar))};
        uma d2 = B().d();
        dbsk.s(d2);
        ujo ujoVar = new ujo();
        cqmp<zfm>[] cqmpVarArr2 = {cqgr.aG(B().l()), cqgr.bY(cqjd.u(cqjgVar))};
        zff c2 = B().c();
        dbsk.s(c2);
        uqz uqzVar = new uqz();
        cqjg cqjgVar2 = d;
        cqmp<zfm>[] cqmpVarArr3 = {cqgr.bY(cqjd.k(cqjgVar2))};
        cqmp[] cqmpVarArr4 = {cqgr.aT(cqjgVar2), cqgr.bY(cqjd.m(cqjgVar))};
        vjb vjbVar = new vjb();
        zfg e = B().e();
        dbsk.s(e);
        cqmj fY = cqgr.fY(cqgr.aD(cqjv.v(B().e())), cqgr.fO(vjbVar, e, new cqmp[0]));
        fY.f(cqmpVarArr4);
        cqmp[] cqmpVarArr5 = {cqgr.aT(cqjgVar)};
        cqjg cqjgVar3 = b;
        cqmp[] cqmpVarArr6 = {cqgr.aT(cqjgVar3)};
        cqmj fY2 = cqgr.fY(cqic.d(cqjv.r(B().a().W(), cqjv.u(B().k())), new cqmp[0]), cqgr.cd(-1), cqgr.x(irn.G()), cqgr.fO(new vgp(), B().a(), new cqmp[0]));
        fY2.f(new cqmp[0]);
        vbn vbnVar = new vbn();
        zcl f = B().f();
        dbsk.s(f);
        cqmj fY3 = cqgr.fY(cqic.d(cqjv.r(B().k(), cqjv.u(cqjv.v(B().f()))), new cqmp[0]), cqgr.cd(-1), cqgr.fO(vbnVar, f, new cqmp[0]));
        fY3.f(new cqmp[0]);
        cqmj gj = cqgr.gj(cqgr.cd(-1), fY2, fY3);
        gj.f(cqmpVarArr6);
        cqmj fY4 = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.gj(cqgr.aR(B().a().V()), cqgr.eh(false), gj, cqgr.fY(cqgr.bY(cqjd.u(cqjgVar3)), cqgr.cd(-1), iue.b(B().i(dtxn.av)), cqgr.x(irn.G()), cqgr.cU(B().h()), cqgr.R(B().a().k()), cqgr.fO(viw.b(false, this.e, vig.e(), vhv.e(false)), B().a(), new cqmp[0]))));
        fY4.f(cqmpVarArr5);
        return cqgr.gj(cqgr.aT(a), iue.b(B().i(dtxn.ag)), h(b2, xtsVar, cqmpVarArr), h(d2, ujoVar, cqmpVarArr2), h(c2, uqzVar, cqmpVarArr3), fY, fY4);
    }

    private vjc(boolean z) {
        super(Boolean.valueOf(z));
        this.e = z;
    }
}
