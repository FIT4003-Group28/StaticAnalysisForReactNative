package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: boxz  reason: default package */
/* loaded from: classes3.dex */
public final class boxz extends gen implements DialogInterface.OnClickListener {
    public bvsx a;
    public int b;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        CharSequence c;
        ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList = (ProtoBufUtil$ParcelableProtoList) this.o.getParcelable("key_routes");
        dbsk.s(protoBufUtil$ParcelableProtoList);
        final List a = protoBufUtil$ParcelableProtoList.a((dssr) dodb.d.cu(7));
        AlertDialog.Builder onCancelListener = new AlertDialog.Builder(H()).setNegativeButton(R.string.NO_THANKS, new DialogInterface.OnClickListener(this, a) { // from class: boxt
            private final boxz a;
            private final List b;

            {
                this.a = this;
                this.b = a;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.Ra(new boxk(dodb.d, 2, dcdc.r(this.b)));
            }
        }).setPositiveButton(R.string.YES_BUTTON, new DialogInterface.OnClickListener(this, a) { // from class: boxu
            private final boxz a;
            private final List b;

            {
                this.a = this;
                this.b = a;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dodb dodbVar;
                boxz boxzVar = this.a;
                List list = this.b;
                if (list.size() == 1) {
                    dodbVar = (dodb) dcft.c(list);
                } else {
                    dodbVar = (dodb) list.get(boxzVar.b);
                }
                boxzVar.Ra(new boxk(dodbVar, 1, dcdc.e()));
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: boxv
            private final boxz a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.a.Ra(new boxk(dodb.d, 3, dcdc.e()));
            }
        });
        List k = dchl.k(a, boxw.a);
        if (k.size() != 1) {
            c = Rp(R.string.FEATURE_SELECTION_ROUTE_PROMPT_GENERIC);
        } else {
            bvsu c2 = this.a.c(R.string.FEATURE_SELECTION_ROUTE_PROMPT);
            bvsv a2 = this.a.a(dcft.c(k));
            a2.i();
            c2.a(a2);
            c = c2.c();
        }
        if (k.size() > 1) {
            int i = -1;
            if (bundle != null) {
                i = bundle.getInt("key_selected_route_index", -1);
            }
            this.b = i;
            onCancelListener.setTitle(c).setSingleChoiceItems((CharSequence[]) k.toArray(new String[k.size()]), this.b, this);
        } else {
            onCancelListener.setMessage(c);
        }
        final AlertDialog create = onCancelListener.create();
        if (k.size() > 1 && this.b < 0) {
            create.setOnShowListener(new DialogInterface.OnShowListener(create) { // from class: boxx
                private final AlertDialog a;

                {
                    this.a = create;
                }

                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.a.getButton(-1).setEnabled(false);
                }
            });
        }
        return create;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i >= 0) {
            this.b = i;
            ((AlertDialog) dialogInterface).getButton(-1).setEnabled(true);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.cc;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putInt("key_selected_route_index", this.b);
    }
}
