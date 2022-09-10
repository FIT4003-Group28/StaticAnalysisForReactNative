package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpbr  reason: default package */
/* loaded from: classes3.dex */
public final class bpbr extends gen {
    @dzsi
    public dodb a;
    public ilo b;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        Bundle bundle2 = this.o;
        this.b = (ilo) bundle2.getSerializable("key_segment");
        dodb dodbVar = (dodb) bvrs.f(bundle2, "key_route", (dssr) dodb.d.cu(7));
        this.a = dodbVar;
        return new AlertDialog.Builder(H()).setTitle(Rp(R.string.NEW_PARENT_ROUTE_SELECTED)).setMessage(Rq(R.string.SWITCH_PARENT_ROUTE_CONFIRMATION, dodbVar != null ? dodbVar.c : Rp(R.string.UNNAMED_ROAD))).setNegativeButton(R.string.NO_THANKS, bpbn.a).setPositiveButton(R.string.YES_BUTTON, new DialogInterface.OnClickListener(this) { // from class: bpbo
            private final bpbr a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                bpbr bpbrVar = this.a;
                dodb dodbVar2 = bpbrVar.a;
                ilo iloVar = bpbrVar.b;
                if (dodbVar2 == null) {
                    dodbVar2 = dodb.d;
                }
                bpbrVar.Ra(new bpaj(dbsg.i(dodbVar2), iloVar));
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: bpbp
            private final bpbr a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                bpbr bpbrVar = this.a;
                bpbrVar.Ra(new bpaj(dbpy.a, bpbrVar.b));
            }
        }).create();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.cf;
    }
}
