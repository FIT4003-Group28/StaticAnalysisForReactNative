package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import java.io.IOException;
import java.io.Serializable;
/* compiled from: PG */
/* renamed from: beym  reason: default package */
/* loaded from: classes3.dex */
public final class beym extends gen {
    public bwqv a;
    public cqkj b;
    public cjqy c;

    public static beym g(bwqv bwqvVar, bwrs<ilo> bwrsVar, bfby bfbyVar) {
        beym beymVar = new beym();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "FollowPlaceWelcomeOfferSavedDialogFragment.placemark", bwrsVar);
        bundle.putSerializable("FollowPlaceWelcomeOfferSavedDialogFragment.source", bfbyVar);
        beymVar.B(bundle);
        return beymVar;
    }

    @Override // defpackage.ges
    public final void Nv() {
        ((beyn) btsx.b(beyn.class, this)).cG(this);
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        Bundle bundle2 = this.o;
        cqkf c = this.b.c(new beyq(), null);
        gdf gdfVar = new gdf((Context) J(), false);
        gdfVar.getWindow().setBackgroundDrawable(new cqlu());
        gdfVar.setContentView(c.c());
        try {
            final bwrs e = this.a.e(ilo.class, bundle2, "FollowPlaceWelcomeOfferSavedDialogFragment.placemark");
            dbsk.s(e);
            Serializable serializable = bundle2.getSerializable("FollowPlaceWelcomeOfferSavedDialogFragment.source");
            dbsk.s(serializable);
            final bfby bfbyVar = (bfby) serializable;
            c.e(new beys(this, e, bfbyVar));
            gdfVar.setOnCancelListener(new DialogInterface.OnCancelListener(this, bfbyVar, e) { // from class: beyl
                private final beym a;
                private final bfby b;
                private final bwrs c;

                {
                    this.a = this;
                    this.b = bfbyVar;
                    this.c = e;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    beym beymVar = this.a;
                    bfby bfbyVar2 = this.b;
                    bwrs bwrsVar = this.c;
                    cjqy cjqyVar = beymVar.c;
                    bfbx bfbxVar = bfbx.WELCOME_OFFER_SAVED_DISMISS;
                    ilo iloVar = (ilo) bwrsVar.c();
                    dbsk.s(iloVar);
                    cjqyVar.i(bfbz.b(bfbyVar2, bfbxVar, iloVar, dbpy.a));
                }
            });
        } catch (IOException e2) {
            bvoo.j(e2);
        }
        return gdfVar;
    }

    @Override // defpackage.ges
    public final ddho p() {
        Serializable serializable = this.o.getSerializable("FollowPlaceWelcomeOfferSavedDialogFragment.source");
        dbsk.s(serializable);
        ddho c = bfbz.c((bfby) serializable, bfbx.WELCOME_OFFER_SAVED);
        dbsk.s(c);
        return c;
    }
}
