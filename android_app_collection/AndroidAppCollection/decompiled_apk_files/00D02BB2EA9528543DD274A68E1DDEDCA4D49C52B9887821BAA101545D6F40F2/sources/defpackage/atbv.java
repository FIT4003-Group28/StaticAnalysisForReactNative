package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: atbv  reason: default package */
/* loaded from: classes2.dex */
public final class atbv extends gen {
    public static final dcqe a = dcqe.c("atbv");
    @dzsi
    private atni ad;
    private atbu ae;
    public amvh b;
    public btrm c;
    public cqkj d;
    public cqhn e;
    @dzsi
    private cqkf<atni> g;

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<atni> cqkfVar = this.g;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.g = null;
        }
        super.Qe();
    }

    @Override // defpackage.gen
    protected final boolean aV() {
        return true;
    }

    @Override // defpackage.gen
    public final Dialog i(@dzsi Bundle bundle) {
        AlertDialog create = new AlertDialog.Builder(J()).setView(this.g.c()).create();
        create.getWindow().addFlags(ImageMetadata.LENS_APERTURE);
        return create;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.ae = new atbu(this);
        this.b = (amvh) this.o.getSerializable("nextDestination");
        this.ad = new atmx(this.e, this.ae, this.b.p(), J().getString(R.string.MENU_REMOVE_NEXT_STOP_ACTION, new Object[]{this.b.s(J().getResources())}));
        cqkf<atni> e = this.d.e(new atjy());
        this.g = e;
        e.e(this.ad);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxw.aG;
    }
}
