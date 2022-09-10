package defpackage;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bthd  reason: default package */
/* loaded from: classes4.dex */
public final class bthd extends gen {
    public cjqy a;
    public cqkj b;
    public cqhn c;
    private bthv d;
    private bths e;

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        cqkf c = this.b.c(new bthp(), null);
        final gdf gdfVar = new gdf(c.c().getContext(), false);
        gdfVar.getWindow().requestFeature(1);
        gdfVar.getWindow().setBackgroundDrawable(new cqlu());
        gdfVar.setContentView(c.c());
        bthy bthyVar = new bthy(J(), this.e, new Runnable(gdfVar) { // from class: bthc
            private final Dialog a;

            {
                this.a = gdfVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.dismiss();
            }
        }, this.a);
        this.d = bthyVar;
        c.e(bthyVar);
        return gdfVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        this.e = (bths) this.o.getSerializable("options");
        super.l(bundle);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return this.e.e();
    }
}
