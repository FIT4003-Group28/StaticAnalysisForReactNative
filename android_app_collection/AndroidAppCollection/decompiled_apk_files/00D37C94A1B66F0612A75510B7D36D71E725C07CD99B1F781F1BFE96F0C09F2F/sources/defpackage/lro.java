package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: lro  reason: default package */
/* loaded from: classes3.dex */
final class lro implements DialogInterface.OnClickListener {
    final /* synthetic */ lrp a;
    private final /* synthetic */ int b;

    public lro(lrp lrpVar) {
        this.a = lrpVar;
    }

    public lro(lrp lrpVar, int i) {
        this.b = i;
        this.a = lrpVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b == 0) {
            this.a.c(false);
            this.a.e(1);
            dialogInterface.dismiss();
            return;
        }
        this.a.e.setChecked(true);
        dialogInterface.dismiss();
    }
}
