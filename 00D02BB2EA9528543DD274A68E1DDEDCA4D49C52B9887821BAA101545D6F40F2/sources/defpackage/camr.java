package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: camr  reason: default package */
/* loaded from: classes4.dex */
public final class camr extends cqiw<cafn> {
    public static final cqrp a = cqrp.d(20.0d);
    public static final cqrp b = cqrp.d(16.0d);
    private static final cqrp d = cqrp.d(64.0d);
    public static final cqrp c = cqrp.d(24.0d);
    private static final cqrp e = cqrp.d(220.0d);
    private static final cqtd f = cqui.c(cquh.i(cqta.f(), irg.a()));
    private static final cqtd g = cqui.c(cquh.i(irg.a(), cqta.f()));

    public static <T extends cafn> cqmj<T> e(cqlc<T, String> cqlcVar) {
        cqrp cqrpVar = a;
        return cqgr.gq(cqgr.dQ(cqrpVar), cqgr.dF(cqrpVar), cqgr.cd(-1), cqgr.bp(-2), cqgr.eN(4), ibq.f(), cqgr.eU(irg.m()), cqgr.eM(cqlcVar));
    }

    @SafeVarargs
    public static <T extends cafn> cqmj<T> f(cqlc<T, cqsn> cqlcVar, final cqlc<T, Boolean> cqlcVar2, cqmp<T>... cqmpVarArr) {
        cqmj<T> gd = cqgr.gd(cqgr.bp(-1), cqgr.dU(cqrp.d(6.0d)), cqgr.dB(cqrp.d(6.0d)), cqgr.aJ(17), cqgr.J(true), cqgr.gq(cqgr.bp(-1), cqgr.cd(-1), cqgr.dQ(cqrp.d(20.0d)), cqgr.dF(cqrp.d(20.0d)), cqgr.dU(cqrp.d(2.0d)), cqgr.dB(cqrp.d(2.0d)), cqgr.aJ(17), ibq.r(), cqgr.y(new cqlc(cqlcVar2) { // from class: calb
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                cafn cafnVar = (cafn) cqkpVar;
                cqrp cqrpVar = camr.a;
                if (((Boolean) ((cqlb) cqlcVar3).a).booleanValue()) {
                    return cqtt.p(cquy.c(cqrp.d(8.0d)), irg.s());
                }
                return aclp.a(irg.a(), irg.g(), cqrp.d(1.0d), cqrp.d(8.0d));
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eW(new cqlc(cqlcVar2) { // from class: calc
            private final cqlc a;

            {
                this.a = cqlcVar2;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqlc cqlcVar3 = this.a;
                cafn cafnVar = (cafn) cqkpVar;
                cqrp cqrpVar = camr.a;
                return ((Boolean) ((cqlb) cqlcVar3).a).booleanValue() ? irg.a() : irg.s();
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        }), cqgr.eM(cqlcVar)));
        gd.f(cqmpVarArr);
        return gd;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cafn cafnVar, Context context, cqiv cqivVar) {
        cafnVar.a(cqivVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cafn> a() {
        int i;
        Float valueOf = Float.valueOf(1.0f);
        cqmp[] cqmpVarArr = {cqic.c(cqjv.x(cale.a), new cqmp[0]), WebImageView.l(calf.a), cqgr.ei(ImageView.ScaleType.CENTER_CROP), cqgr.cd(-1), cqgr.bp(-1)};
        cqrp cqrpVar = e;
        cqmp[] cqmpVarArr2 = {cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.cH(cqrpVar), cqgr.z(irg.a())), cqgr.gs(cqgr.cd(-1), cqgr.bp(-1), cqgr.x(g))};
        cqmp[] cqmpVarArr3 = {cqic.c(cqjv.x(calg.a), new cqmp[0]), cqgr.bq(cqrpVar), cqgr.cd(-1), WebImageView.a(WebImageView.l(calh.a), cqgr.ei(ImageView.ScaleType.CENTER_CROP), cqgr.bw(48), cqgr.cd(-1), cqgr.bp(-1)), cqgr.gd(cqgr.cd(-1), cqgr.bp(-1), cqgr.dr(1), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ca(Float.valueOf(11.0f))), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ca(valueOf), cqgr.x(f)))};
        cqmp[] cqmpVarArr4 = {cqgr.ca(Float.valueOf(3.0f)), cqgr.cH(cqrp.d(100.0d)), cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1)};
        double d2 = Resources.getSystem().getConfiguration().screenWidthDp - (((i / 56) - 1) * 56);
        Double.isNaN(d2);
        cqmp[] cqmpVarArr5 = {cqgr.aJ(17), cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.x(cqtt.p(cquy.c(cqrp.d(15.0d)), irg.a())), cqgr.ap(cqrp.d(15.0d)), cqgr.bV(cqrp.d(47.0d)), cqgr.bJ(cqrp.d(d2 / 2.0d)), cqgr.bD(cqrp.d(30.0d)), cqgr.ck(C())};
        cqrp cqrpVar2 = d;
        cqrp d3 = cqrp.d(2.0d);
        return cqgr.fY(cqgr.bp(-1), cqgr.cd(-1), cqgr.dU(ird.b()), cqgr.x(irg.a()), cqgr.gk(cqgr.cd(-1), cqgr.bp(-1), cqgr.bw(17), cqgr.ca(valueOf), cqgr.av(true), cqgr.fY(cqgr.bp(-2), cqgr.cd(-1), WebImageView.a(cqmpVarArr), cqgr.gd(cqmpVarArr2), cqgr.fY(cqmpVarArr3), cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), iue.c(cali.a), cqgr.gd(cqmpVarArr4), cqgr.fY(cqgr.bp(-2), cqgr.cd(-1), cqgr.gd(cqmpVarArr5), WebImageView.a(cqgr.aF(cakz.a), cqgr.ce(cqrpVar2), cqgr.bq(cqrpVar2), cqgr.bw(49), cqgr.bV(cqrp.d(15.0d)), cqgr.ap(cqrp.d(20.0d)), cqgr.dz(d3, d3, d3, d3), cqgr.x(cqtt.g(irg.a())), cqgr.ei(ImageView.ScaleType.FIT_CENTER), WebImageView.l(cala.a))), cqgr.gd(cqgr.cc(calj.a), cqgr.cJ(calk.a), cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1)), cqgr.gd(cqgr.aF(call.a), cqgr.cd(-2), cqgr.bp(-2), cqgr.bD(a), cqgr.bw(81), cqgr.cH(irh.a()), f(cakw.a, cqkz.a(true), iue.c(cakx.a), cqgr.cW(cqgr.q(caky.a))))))), cqgr.fY(cqgr.bq(irh.a()), cqgr.ce(irh.a()), cqgr.bV(cqrp.d(8.0d)), cqgr.bR(cqrp.d(8.0d)), cqgr.bw(8388659), cqgr.x(irn.G()), cqgr.cW(cqgr.q(cakv.a)), cqgr.x(cqtt.g(irg.a())), cqgr.ap(cqrp.d(5.0d)), iue.c(cald.a), cqgr.gc(cqgr.T(cqrt.l(R.string.CLOSE)), cqgr.ei(ImageView.ScaleType.CENTER), cqgr.eE(cqrt.h(2131232205, irg.J())))));
    }
}
