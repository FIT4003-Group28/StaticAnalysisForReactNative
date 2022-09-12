package defpackage;

import android.graphics.Typeface;
import android.widget.ImageView;
import java.util.List;
/* compiled from: PG */
/* renamed from: mac  reason: default package */
/* loaded from: classes7.dex */
public final class mac {
    public static final int a = cqir.a();
    public static final int b = cqir.a();

    public static void a(List<atxw> list, cqiv cqivVar, cqtc cqtcVar) {
        for (atxw atxwVar : list) {
            cqtd a2 = mad.a(atxwVar.j());
            if (atxwVar instanceof atxy) {
                if (a2 == null) {
                    nqu.u();
                }
                cqivVar.a(new lzx(new Object[]{true, cqtcVar}, cqtcVar), (atxy) atxwVar);
            } else {
                if (a2 == null) {
                    nqu.w();
                }
                cqivVar.a(new lzv(new Object[]{cqtcVar, false}, cqtcVar), atxwVar);
            }
        }
    }

    public static <T extends atxw> cqmj<T> b(cqtc cqtcVar, boolean z) {
        cqmp[] cqmpVarArr = new cqmp[10];
        cqmpVarArr[0] = cqgr.aR(Integer.valueOf(z ? b : -1));
        cqmpVarArr[1] = cqgr.bq(cqtcVar);
        cqmpVarArr[2] = nqu.b(lzs.a);
        cqmpVarArr[3] = cqgr.aA(lzt.a);
        cqmpVarArr[4] = itj.h(cqgr.q(lzu.a));
        cqmpVarArr[5] = iue.c(lzo.a);
        cqmpVarArr[6] = nsc.p(lzp.a);
        cqmpVarArr[7] = nsc.c(new cqmp[0]);
        cqmpVarArr[8] = cqgr.gc(cqgr.aR(Integer.valueOf(a)), cqgr.ce(nqo.Y), cqgr.bq(nqo.Y), cqgr.bw(8388627), cqgr.am(true), cqgr.eG(lzq.a), cqgr.ei(ImageView.ScaleType.CENTER));
        lzy lzyVar = new lzy();
        Typeface typeface = nre.a;
        nrb d = nrd.d();
        d.c(lzyVar);
        cqmpVarArr[9] = cqgr.gq(cqgr.bp(-2), cqgr.dQ(nqo.V), cqgr.dF(nqo.R), cqgr.bw(8388627), vlb.a(), cqgr.am(true), d.m(), cqgr.eM(lzr.a));
        return nsc.u(cqmpVarArr);
    }
}
