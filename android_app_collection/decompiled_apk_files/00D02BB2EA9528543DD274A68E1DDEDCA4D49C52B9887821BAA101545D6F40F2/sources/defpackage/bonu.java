package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: bonu  reason: default package */
/* loaded from: classes3.dex */
public final class bonu implements DialogInterface.OnClickListener {
    final /* synthetic */ bonv a;

    public bonu(bonv bonvVar) {
        this.a = bonvVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -2) {
            this.a.d.d();
            i = -2;
        }
        cqkf<boqr> cqkfVar = this.a.f;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        dialogInterface.dismiss();
        DialogInterface.OnClickListener onClickListener = this.a.e;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }
}
