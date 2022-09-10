package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bxka  reason: default package */
/* loaded from: classes4.dex */
public final class bxka extends cqiw<bwob> {
    private static <V extends cqkp> void e(cqiv cqivVar, @dzsi V v, cqiw<V> cqiwVar) {
        if (v != null) {
            if (cqivVar.i() > 0) {
                gva.c(cqivVar, v, cqiwVar, new bxjx(), new ije());
            } else {
                cqivVar.a(cqiwVar, v);
            }
        }
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bwob bwobVar, Context context, cqiv cqivVar) {
        bwoh g;
        cjyw cjywVar;
        cjtd a;
        ddxx c;
        bwob bwobVar2 = bwobVar;
        cjzo a2 = cjzp.a(context);
        e(cqivVar, bwobVar2.k(), new bwnc());
        e(cqivVar, bwobVar2.l(), new vpu());
        e(cqivVar, bwobVar2.m(), new vqd());
        e(cqivVar, bwobVar2.n(), new vqd());
        e(cqivVar, bwobVar2.o(), new vqd());
        e(cqivVar, bwobVar2.j(), new bwmx());
        e(cqivVar, bwobVar2.f(), new bwkl());
        e(cqivVar, bwobVar2.b(), new bwlk());
        cjyp cjypVar = (cjyp) bwobVar2.a().a();
        if (cjypVar != null && (g = bwobVar2.g()) != null && !g.c().isEmpty()) {
            e(cqivVar, g, new bwmp());
            Iterator<cjyw> it = cjypVar.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    cjywVar = null;
                    break;
                }
                cjywVar = it.next();
                ddho[] ddhoVarArr = {dtyi.cd};
                int i2 = 0;
                while (true) {
                    if (i2 >= cjywVar.b().size()) {
                        break;
                    }
                    if (cjywVar.b().size() > i2 && (cjywVar.b().get(i2).c instanceof oxi) && (a = ((oxi) cjywVar.b().get(i2).c).a()) != null && (c = cjrx.c(a.d)) != null) {
                        ddho d = cjth.d(c.d);
                        for (int i3 = 0; i3 <= 0; i3++) {
                            if (ddhoVarArr[i3].equals(d)) {
                                if (i2 >= 0) {
                                    break;
                                }
                            }
                        }
                        continue;
                    }
                    i2++;
                }
            }
            if (cjywVar != null) {
                cjypVar.a().remove(cjywVar);
            }
        }
        if (cjypVar != null) {
            for (cjyw cjywVar2 : cjypVar.a()) {
                gva.c(cqivVar, cjywVar2, a2.f(cjywVar2.c()), new cjym(cjywVar2), new ije());
            }
        }
        bwoe h = bwobVar2.h();
        if (h != null) {
            cqivVar.a(new bwla(), h);
        }
        bwof i4 = bwobVar2.i();
        if (i4 != null) {
            cqivVar.a(new bwlg(), i4);
        }
        bwkq.e(bwobVar2, cqivVar);
        bwok e = bwobVar2.e();
        if (cqivVar.i() > 0) {
            e(cqivVar, e, new bwmt());
        }
        if (cqivVar.i() > 0) {
            cqivVar.a(new ijf(), new bxjz());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bwob> a() {
        cqmp[] cqmpVarArr = {cqgr.bp(-1), cqgr.cd(-1), cqgr.aF(bxjt.a), cqgr.aR(Integer.valueOf((int) R.id.cardui_cardlist)), cjyn.f(C(), cqqx.K(bxjs.a), cqqx.v(bxju.a)), cqgr.gs(cqgr.bq(ise.b), cqgr.cd(-1), cqgr.x(ibp.b()), cqgr.bk(bxjv.a))};
        cqmp[] cqmpVarArr2 = {cqic.f(bxjw.a, new cqmp[0])};
        cqmj gd = cqgr.gd(cqgr.dr(1), cqgr.cd(-1), cqgr.bp(-1), cqgr.aJ(1), cqgr.z(ibm.b()), cqgr.dU(cqrp.d(32.0d)), cqgr.gc(cqgr.ce(cqrp.d(46.0d)), cqgr.bq(cqrp.d(46.0d)), cqgr.ei(ImageView.ScaleType.FIT_CENTER), cqgr.eE(iup.e(R.raw.realtime_train_promo_icon))), cqgr.gq(cqgr.dU(cqrp.d(24.0d)), cqgr.dQ(cqrp.d(48.0d)), cqgr.dF(cqrp.d(48.0d)), cqgr.eL(Integer.valueOf((int) R.string.DIRECTIONS_TRAIN_PROMO_BODY_TEXT)), cqgr.eN(4), ibq.p(), ibq.x()));
        gd.f(cqmpVarArr2);
        return cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.z(iva.b(ibl.g(), ibl.d())), cqgr.fY(cqmpVarArr), gd);
    }
}
