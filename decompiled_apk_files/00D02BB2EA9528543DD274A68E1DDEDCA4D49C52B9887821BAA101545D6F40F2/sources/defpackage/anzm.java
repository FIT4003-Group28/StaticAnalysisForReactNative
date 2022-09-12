package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anzm  reason: default package */
/* loaded from: classes2.dex */
public final class anzm extends cqiw<anzn> {
    public static <T extends cqkp> cqmj<T> e(cqmp<T> cqmpVar, boolean z, boolean z2) {
        cqmp cqmpVar2;
        cqmp[] cqmpVarArr = new cqmp[7];
        cqmpVarArr[0] = cqgr.cd(-2);
        cqmpVarArr[1] = cqgr.bp(-2);
        cqmpVarArr[2] = cqgr.dr(0);
        cqmpVarArr[3] = cqgr.ez(3);
        cqmpVarArr[4] = cqgr.af(itd.a(irh.g(), cqta.f()));
        if (z) {
            cqmpVar2 = cqgr.gc(apla.a(f()), cqgr.eE(g(2131232569)));
        } else {
            cqmpVar2 = cqmp.e;
        }
        cqmpVarArr[5] = cqmpVar2;
        cqmpVarArr[6] = z2 ? itj.u(cqgr.ei(ImageView.ScaleType.CENTER), apla.a(f()), cqmpVar) : cqgr.gc(apla.a(f()), cqmpVar);
        return cqgr.gd(cqmpVarArr);
    }

    public static cqtv f() {
        return cqrt.d(R.dimen.timeline_day_details_activity_segment_icon_size);
    }

    public static cqtd g(int i) {
        return cqrt.h(i, irg.E());
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, anzn anznVar, Context context, cqiv cqivVar) {
        Object obj;
        cqiw anzjVar;
        anzn anznVar2 = anznVar;
        cqivVar.a(new anzl(), anznVar2);
        if (!anznVar2.j().booleanValue()) {
            dcdc<cqkp> h = anznVar2.h();
            int min = Math.min(3, h.size());
            int i2 = 0;
            while (i2 < min) {
                boolean z = i2 != 0;
                Object obj2 = (cqkp) h.get(i2);
                if (obj2 instanceof antv) {
                    obj = (antv) obj2;
                    anzjVar = new anzh(z);
                } else if (obj2 instanceof anxw) {
                    obj = (anxw) obj2;
                    anzjVar = new anzj(z);
                } else {
                    i2++;
                }
                cqivVar.a(anzjVar, obj);
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<anzn> a() {
        cqmj gd = cqgr.gd(cqgr.cd(-2), cqgr.bp(-2), cqgr.dr(1), cqgr.bG(cqrt.d(R.dimen.timeline_day_details_segment_title_margin_end)), cqgr.gq(cqgr.bw(8388613), cqgr.cd(-2), irn.n(), irn.v(), irn.E(), cqgr.eM(anzd.a), cqgr.aF(cqjv.x(anze.a))), cqgr.gq(cqgr.bw(8388613), cqgr.cd(-2), irn.n(), irn.v(), irn.E(), cqgr.eM(anzf.a)));
        cqmj b = jgq.b(cqgr.ck(C()));
        b.f(cqgr.bY(cqjd.e(), cqjd.t(), cqjd.z(gd)));
        gd.f(cqgr.bY(cqjd.f(), cqjd.t()));
        return cqgr.gj(cqgr.cd(-1), cqgr.bp(-2), cqgr.dQ(apkz.a()), cqgr.dF(irh.b()), b, gd);
    }
}
