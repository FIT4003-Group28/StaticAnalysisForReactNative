package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpao  reason: default package */
/* loaded from: classes3.dex */
public final class bpao extends gen {
    public static final cjtd a = cjtd.a(dtya.bR);
    public static final cjtd b = cjtd.a(dtya.bS);
    public cjqy c;

    public final void g(ges gesVar) {
        Nz(gesVar);
        super.aJ(gesVar.J());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        final ilo iloVar = (ilo) this.o.getSerializable("poi_key");
        return new AlertDialog.Builder(H()).setTitle(R.string.RAP_PLACE_SELECTION_DIALOG_TITLE).setMessage(Rq(R.string.RAP_PLACE_SELECTION_DIALOG_TEXT, (String) this.o.getSerializable("poi_name_key"))).setNegativeButton(R.string.NO_THANKS, bpak.a).setPositiveButton(R.string.YES_BUTTON, new DialogInterface.OnClickListener(this, iloVar) { // from class: bpal
            private final bpao a;
            private final ilo b;

            {
                this.a = this;
                this.b = iloVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                bpao bpaoVar = this.a;
                ilo iloVar2 = this.b;
                bpaoVar.c.i(bpao.b);
                bpaoVar.Ra(new bpai(dbsg.i(iloVar2)));
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: bpam
            private final bpao a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                bpao bpaoVar = this.a;
                bpaoVar.c.i(bpao.a);
                bpaoVar.Ra(new bpai(dbpy.a));
            }
        }).create();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.bQ;
    }
}
