package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bftj  reason: default package */
/* loaded from: classes3.dex */
public final class bftj extends bfdp {
    private static final dcqe b = dcqe.c("bftj");
    public cqkj a;

    @Override // defpackage.ges
    public final void Nv() {
        ((bftk) btsx.b(bftk.class, this)).cJ(this);
    }

    @Override // defpackage.bfdp
    protected final jib g() {
        return jib.g(J(), Rp(R.string.HOTEL_AMENITY_TITLE));
    }

    @Override // defpackage.bfdp
    protected final View i(ilo iloVar) {
        cqkf c = this.a.c(new bftx(), null);
        if (!iloVar.bV()) {
            bvoo.h("Hotel Placemark no longer has hotel amenities list", new Object[0]);
            gn gnVar = this.A;
            dbsk.s(gnVar);
            gnVar.e();
            return c.c();
        }
        c.e(new bfue(iloVar.bU()));
        return c.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxr.cj;
    }
}
