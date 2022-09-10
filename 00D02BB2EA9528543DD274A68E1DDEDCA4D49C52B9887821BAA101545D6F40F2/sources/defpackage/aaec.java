package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
/* compiled from: PG */
/* renamed from: aaec  reason: default package */
/* loaded from: classes2.dex */
public final class aaec extends gen implements aafk, gfv {
    private static final dcqe d = dcqe.c("aaec");
    public cqkj a;
    private abs ad;
    public aafm b;
    @dzsi
    public bsjm c;
    @dzsi
    private cqkf<aafe> e;
    private aafl g;

    @Override // defpackage.ges, defpackage.gfv
    public final void Nw(@dzsi Object obj) {
        gfw ba = ba();
        if (ba != null) {
            ba.Qn(obj);
        }
    }

    @Override // defpackage.ges, defpackage.gfv
    public final void Nz(@dzsi gfw gfwVar) {
        if (gfwVar == null) {
            F(null, 0);
        } else if (gfwVar instanceof fd) {
            F((fd) gfwVar, 0);
        } else {
            bvoo.h("%s must extend Fragment. It's the only way to preserve the listener if the activity is recreated.", gfwVar.getClass());
        }
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<aafe> cqkfVar = this.e;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.e = null;
        }
        super.Qe();
    }

    @Override // defpackage.ges
    @dzsi
    public final gfw ba() {
        fd G = G();
        if (G != null) {
            if (G instanceof gfw) {
                return (gfw) G;
            }
            bvoo.h("dispatchResult: Expected GmmActivityFragmentResultListener but instead found %s", G.getClass());
            return null;
        }
        return null;
    }

    @Override // defpackage.gen
    public final Dialog i(@dzsi Bundle bundle) {
        cqkf<aafe> c = this.a.c(new aaew(), null);
        this.e = c;
        c.e(this.g);
        View c2 = this.e.c();
        RecyclerView recyclerView = (RecyclerView) cqhu.a(c2, aaew.a);
        if (recyclerView != null) {
            aag aagVar = new aag();
            this.ad = aagVar;
            recyclerView.setLayoutManager(aagVar);
            this.ad.O(this.g.o());
        } else {
            bvoo.h("Attempted to scroll month recycler view, but view could not be found.", new Object[0]);
        }
        gdf gdfVar = new gdf((Context) J(), true);
        Window window = gdfVar.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        gdfVar.setContentView(c2);
        return gdfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    @Override // defpackage.ges, defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(@defpackage.dzsi android.os.Bundle r11) {
        /*
            r10 = this;
            super.l(r11)
            android.os.Bundle r0 = r10.o
            java.lang.String r1 = "refinements_model"
            java.io.Serializable r0 = r0.getSerializable(r1)
            bsjm r0 = (defpackage.bsjm) r0
            r10.c = r0
            r1 = 4
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L76
            r4 = 23
            java.util.Set r0 = r0.c(r4)
            int r4 = r0.size()
            if (r4 != r2) goto L76
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            dspd r0 = (defpackage.dspd) r0
            djmv r4 = defpackage.djmv.c
            r5 = 7
            java.lang.Object r4 = r4.cu(r5)
            dssr r4 = (defpackage.dssr) r4
            dssj r0 = defpackage.bvrs.c(r0, r4)
            djmv r0 = (defpackage.djmv) r0
            if (r0 == 0) goto L4e
            int r4 = r0.a
            r5 = 13
            if (r4 != r5) goto L4e
            java.lang.Object r0 = r0.b
            djkn r0 = (defpackage.djkn) r0
            int r4 = r0.a
            if (r4 != r1) goto L4e
            java.lang.Object r0 = r0.b
            djjx r0 = (defpackage.djjx) r0
            goto L4f
        L4e:
            r0 = r3
        L4f:
            if (r0 == 0) goto L76
            djjv r3 = r0.b
            if (r3 != 0) goto L57
            djjv r3 = defpackage.djjv.e
        L57:
            djjv r0 = r0.c
            if (r0 != 0) goto L5d
            djjv r0 = defpackage.djjv.e
        L5d:
            eapg r4 = new eapg
            int r5 = r3.b
            int r6 = r3.c
            int r3 = r3.d
            r4.<init>(r5, r6, r3)
            eapg r3 = new eapg
            int r5 = r0.b
            int r6 = r0.c
            int r0 = r0.d
            r3.<init>(r5, r6, r0)
            r8 = r3
            r7 = r4
            goto L78
        L76:
            r7 = r3
            r8 = r7
        L78:
            aafm r0 = r10.b
            eapg r6 = defpackage.eapg.a()
            aafl r9 = new aafl
            dzsj<android.app.Activity> r3 = r0.a
            dxjd r3 = (defpackage.dxjd) r3
            T r3 = r3.a
            android.app.Activity r3 = (android.app.Activity) r3
            defpackage.aafm.a(r3, r2)
            dzsj<cqhn> r2 = r0.b
            java.lang.Object r2 = r2.a()
            cqhn r2 = (defpackage.cqhn) r2
            r4 = 2
            defpackage.aafm.a(r2, r4)
            dzsj<aafq> r4 = r0.c
            java.lang.Object r4 = r4.a()
            aafq r4 = (defpackage.aafq) r4
            r5 = 3
            defpackage.aafm.a(r4, r5)
            dzsj<aafh> r0 = r0.d
            java.lang.Object r0 = r0.a()
            r5 = r0
            aafh r5 = (defpackage.aafh) r5
            defpackage.aafm.a(r5, r1)
            r0 = 5
            defpackage.aafm.a(r10, r0)
            r0 = 6
            defpackage.aafm.a(r6, r0)
            r0 = r9
            r1 = r3
            r3 = r4
            r4 = r5
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaec.l(android.os.Bundle):void");
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtxo.bm;
    }
}
