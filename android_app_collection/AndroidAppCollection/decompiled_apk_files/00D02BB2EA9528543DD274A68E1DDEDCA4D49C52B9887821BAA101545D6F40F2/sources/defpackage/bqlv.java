package defpackage;

import com.google.android.apps.gmm.review.impl.MaterialProgressSpinner;
/* compiled from: PG */
/* renamed from: bqlv  reason: default package */
/* loaded from: classes4.dex */
final class bqlv implements akeo {
    final /* synthetic */ bwrs a;
    final /* synthetic */ bqjh b;
    final /* synthetic */ bqly c;

    public bqlv(bqly bqlyVar, bwrs bwrsVar, bqjh bqjhVar) {
        this.c = bqlyVar;
        this.a = bwrsVar;
        this.b = bqjhVar;
    }

    @Override // defpackage.akeo
    public final void a(gga ggaVar, btlu btluVar) {
        String str;
        String v;
        if (!this.c.e.b() || ((str = btluVar.s().name) != null && (v = btluVar.v()) != null && !str.contentEquals(v))) {
            bqly bqlyVar = this.c;
            bwrs<ilo> bwrsVar = this.a;
            bqjh bqjhVar = this.b;
            ilo c = bwrsVar.c();
            dbsk.s(c);
            boolean z = !((c.bo().a & 256) != 0);
            int k = dcbg.b(c.bq().B).o(bqlu.a).k();
            if (k != 0) {
                bvoo.h("Some photos provided were not editable in the Review Editor", new Object[0]);
            }
            if (z || k > 0) {
                MaterialProgressSpinner materialProgressSpinner = new MaterialProgressSpinner(bqlyVar.b);
                materialProgressSpinner.show();
                begg a = bqlyVar.f.a();
                dnqg bZ = dnqh.p.bZ();
                int i = ddda.fd.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar = (dnqh) bZ.b;
                dnqhVar.a |= 64;
                dnqhVar.g = i;
                a.p(c, bZ.bK(), new bqlw(bqlyVar, bwrsVar, bqjhVar, materialProgressSpinner));
                return;
            }
            bqlyVar.f(bwrsVar, bqjhVar);
            return;
        }
        ggaVar.D(new bqte());
    }

    @Override // defpackage.akeo
    public final void b(gga ggaVar, btlu btluVar) {
        this.c.c.b(new bqje(this.a, 5, dcdc.e()));
    }
}
