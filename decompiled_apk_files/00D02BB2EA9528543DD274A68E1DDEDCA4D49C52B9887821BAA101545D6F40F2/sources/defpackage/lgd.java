package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: lgd  reason: default package */
/* loaded from: classes7.dex */
public final class lgd extends cqiw<lie> {
    public static final int a = cqir.a();
    private static final cqtv b = cqsg.g(cqrp.d(dcyn.a), lgx.f);
    private final boolean c;

    public lgd() {
        this(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<lie> a() {
        cqtv cqtvVar;
        cqmp[] cqmpVarArr = new cqmp[14];
        cqmpVarArr[0] = cqgr.cd(-1);
        if (this.c) {
            cqtvVar = nqo.aS;
        } else {
            cqtvVar = nqo.aR;
        }
        cqmpVarArr[1] = cqgr.bq(cqtvVar);
        cqtv cqtvVar2 = b;
        cqmpVarArr[2] = cqgr.bR(cqtvVar2);
        cqmpVarArr[3] = cqgr.bG(cqtvVar2);
        cqmpVarArr[4] = cqgr.bv(3);
        cqmpVarArr[5] = nqu.b(lfm.a);
        cqlc cqlcVar = lfu.a;
        int i = a;
        cqmpVarArr[6] = cqjv.l(cqlcVar, nsc.o(Integer.valueOf(i)), nsc.o(-1));
        cqmpVarArr[7] = cqgr.aA(lfv.a);
        cqmpVarArr[8] = cqjv.l(lfw.a, cqgr.cQ(lbn.f), cqgr.cQ(-1));
        cqmpVarArr[9] = itj.h(cqgr.q(lfx.a));
        cqmpVarArr[10] = iue.c(lfy.a);
        cqmpVarArr[11] = cqgr.fY(cqgr.ce(nqo.x), cqgr.bq(nqo.y), cqgr.bR(cqrp.d(16.0d)), cqgr.bw(8388627), cqgr.gc(cqic.c(cqjv.x(lfz.a), new cqmp[0]), cqgr.cd(-1), cqgr.bp(-1), cqgr.bw(17), cqgr.eG(lga.a), cqgr.ei(ImageView.ScaleType.CENTER)), cqgr.gc(cqgr.aR(Integer.valueOf(i)), cqjv.l(cqjv.x(lgb.a), cqgr.cd(-1), cqgr.ce(nqo.z)), cqjv.l(cqjv.x(lgc.a), cqgr.bp(-1), cqgr.bq(nqo.A)), cqgr.bw(17), cqgr.eG(lfn.a), cqgr.ei(ImageView.ScaleType.CENTER_INSIDE)));
        cqmpVarArr[12] = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(16), cqgr.bR(nqo.V), cqgr.dF(nqo.R), cqgr.am(true), cqgr.gd(cqgr.dr(0), cqgr.bp(-2), cqgr.fY(cqgr.ca(Float.valueOf(1.0f)), cqgr.gq(cqgr.cd(-2), cqgr.bw(8388627), cqgr.am(true), cqgr.dF(cqrp.d(16.0d)), cqgr.eM(lfo.a), nre.n(), cqgr.eB(true))), cqmp.e), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.bw(8388611), cqgr.aJ(8388611), cqic.f(lfp.a, new cqmp[0]), vlb.a(), cqgr.am(true), cqgr.gq(cqgr.eB(true), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(lfq.a), nre.r()), nsc.A(nsc.t(cqrp.d(80.0d)), nsc.h(cqgr.cd(-2), cqgr.aF(lfr.a)), cqgr.gq(cqgr.eB(true), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(lfs.a), nre.r()))));
        cqmpVarArr[13] = nsc.c(cqgr.bw(80), cqgr.aF(lft.a));
        return nsc.u(cqmpVarArr);
    }

    public lgd(boolean z) {
        super(Boolean.valueOf(z));
        this.c = z;
    }
}
