package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: crf  reason: default package */
/* loaded from: classes5.dex */
public final class crf extends gen {
    public static final cjtd a = cjtd.a(dtxj.q);
    public static final cjtd b = cjtd.a(dtxj.p);
    public cjqy c;
    public cqkj d;
    public crj e;

    public static void g(List<dnzx> list, ges gesVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_duplicates", new ProtoBufUtil$ParcelableProtoList(list));
        crf crfVar = new crf();
        crfVar.B(bundle);
        crfVar.Nz(gesVar);
        crfVar.aJ(gesVar.J());
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((crg) btsx.b(crg.class, this)).a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        ProtoBufUtil$ParcelableProtoList protoBufUtil$ParcelableProtoList = (ProtoBufUtil$ParcelableProtoList) this.o.getParcelable("key_duplicates");
        dbsk.s(protoBufUtil$ParcelableProtoList);
        List a2 = protoBufUtil$ParcelableProtoList.a((dssr) dnzx.e.cu(7));
        cqkf e = this.d.e(new crx());
        crj crjVar = this.e;
        Context H = H();
        boxa a3 = crjVar.a.a();
        crj.a(a3, 1);
        Activity activity = (Activity) ((dxjd) crjVar.b).a;
        crj.a(activity, 2);
        crj.a(a2, 3);
        crj.a(H, 4);
        e.e(new cri(a3, activity, a2, H));
        View c = e.c();
        AlertDialog.Builder onCancelListener = new AlertDialog.Builder(H()).setNegativeButton(R.string.AAP_DIALOG_GO_BACK_BUTTON, q()).setPositiveButton(R.string.AAP_DUPLICATE_DETECTION_DIALOG_SUBMIT_EDIT, q()).setOnCancelListener(new DialogInterface.OnCancelListener(this) { // from class: crb
            private final crf a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                crf crfVar = this.a;
                crfVar.c.i(crf.a);
                crfVar.Ra(cre.CANCEL);
            }
        });
        onCancelListener.setView(c);
        final AlertDialog create = onCancelListener.create();
        create.setOnShowListener(new DialogInterface.OnShowListener(this, create) { // from class: crc
            private final crf a;
            private final AlertDialog b;

            {
                this.a = this;
                this.b = create;
            }

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.b.getButton(-1).setTextColor(akm.c(this.a.H(), R.color.qu_black_alpha_54));
            }
        });
        return create;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxj.o;
    }

    final DialogInterface.OnClickListener q() {
        return new DialogInterface.OnClickListener(this) { // from class: crd
            private final crf a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                crf crfVar = this.a;
                if (i == -1) {
                    crfVar.c.i(crf.b);
                    crfVar.Ra(cre.SUBMIT_REQUEST);
                    return;
                }
                crfVar.c.i(crf.a);
                crfVar.Ra(cre.CANCEL);
            }
        };
    }
}
