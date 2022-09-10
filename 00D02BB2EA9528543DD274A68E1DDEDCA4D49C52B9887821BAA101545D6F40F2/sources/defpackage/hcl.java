package defpackage;

import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: hcl  reason: default package */
/* loaded from: classes6.dex */
public final class hcl extends cqiw<jaj> {
    private static final cqtv a = cqrp.d(4.0d);

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> d(@dzsi cqtd cqtdVar, @dzsi cqss cqssVar, CharSequence charSequence, cqmj<T> cqmjVar, cqmp<T>... cqmpVarArr) {
        cqmj gq = cqgr.gq(cqgr.bR(irh.e()), cqgr.bG(irh.b()), cqgr.bV(irh.h()), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), irn.n(), irn.v(), cqgr.eI(charSequence));
        cqmj gc = cqgr.gc(cqgr.bR(irh.b()), cqgr.bV(cqrp.d(14.5d)), irn.A(), cqgr.fm(cqssVar), cqgr.eE(cqtdVar));
        gc.f(cqgr.bY(cqjd.e()));
        gq.f(cqgr.bY(cqjd.e(), cqjd.i()));
        cqmjVar.f(cqgr.bY(cqjd.v(gq)));
        cqmj<T> gj = cqgr.gj(cqgr.cd(-1), cqgr.bV(irh.h()), cqgr.bD(irh.h()), gc, gq, cqmjVar);
        gj.f(cqmpVarArr);
        return gj;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqlc<T, cqtd> cqlcVar, cqlc<T, cqss> cqlcVar2, cqlc<T, ? extends CharSequence> cqlcVar3, cqmj<T> cqmjVar, cqmp<T>... cqmpVarArr) {
        cqmj d = hci.d(cqlcVar3);
        cqmj d2 = hck.d(cqlcVar, cqlcVar2);
        d2.f(cqgr.bY(cqjd.e()));
        d.f(cqgr.bY(cqjd.e(), cqjd.i()));
        cqmjVar.f(cqgr.bY(cqjd.v(d)));
        cqmj<T> gj = cqgr.gj(cqgr.cd(-1), cqgr.bV(irh.h()), cqgr.bD(irh.h()), d2, d, cqmjVar);
        gj.f(cqmpVarArr);
        return gj;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> f(cqlc<T, ? extends CharSequence> cqlcVar, cqlc<T, Integer> cqlcVar2, cqlc<T, Boolean> cqlcVar3, cqlc<T, TextWatcher> cqlcVar4, cqmp<T>... cqmpVarArr) {
        cqmj<T> fX = cqgr.fX(cqgr.dp(cqlcVar4), cqgr.bf(cqlcVar2), cqgr.eC(cqlcVar3), cqgr.aQ(cqlcVar), cqgr.aJ(80), cqgr.eN(5));
        fX.f(cqmpVarArr);
        h(fX);
        return fX;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> g(cqlc<T, cqsn> cqlcVar, cqlc<T, Integer> cqlcVar2, cqlc<T, Boolean> cqlcVar3, cqlc<T, ? extends CharSequence> cqlcVar4, cqlc<T, TextWatcher> cqlcVar5, cqlc<T, View.OnFocusChangeListener> cqlcVar6, cqlc<T, View.OnClickListener> cqlcVar7, cqlc<T, Boolean> cqlcVar8, cqlc<T, View.OnClickListener> cqlcVar9, cqlc<T, cjtd> cqlcVar10, cqmp<T>... cqmpVarArr) {
        cqmj fX = cqgr.fX(cqgr.eM(cqlcVar4), cqgr.aQ(cqlcVar), cqgr.aJ(80), cqgr.dF(irh.a()), cqgr.bf(cqlcVar2), cqgr.eC(cqlcVar3), cqgr.aU(6), cqgr.eN(5), cqgr.cW(cqlcVar7), cqgr.dp(cqlcVar5), cqgr.dg(cqlcVar6));
        h(fX);
        cqmj<T> fY = cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), fX, cqgr.gb(cqgr.aI(cqlcVar8), cqgr.ce(irh.a()), cqgr.bq(irh.a()), cqgr.bw(8388629), cqgr.bG(irh.b()), cqgr.T(cqrt.l(R.string.ACCESSIBILITY_CLEAR)), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.x(irn.J()), cqgr.cW(cqlcVar9), iue.c(cqlcVar10), cqgr.eE(cqrt.h(2131231563, irg.H()))));
        fY.f(cqmpVarArr);
        return fY;
    }

    public static <T extends cqkp> void h(cqmj<T> cqmjVar) {
        cqmjVar.f(cqgr.bw(16), cqgr.cd(-1), cqgr.bp(-2), cqgr.bR(cqsg.g(irh.e(), a)), cqgr.bG(irh.b()), cqgr.dU(cqrp.d(6.0d)), cqgr.cH(irh.a()), irn.j(), cqgr.eX(irg.H()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<jaj> a() {
        throw null;
    }
}
