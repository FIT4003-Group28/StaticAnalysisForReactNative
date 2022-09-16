package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xur  reason: default package */
/* loaded from: classes4.dex */
public final class xur implements DialogInterface.OnClickListener {
    final /* synthetic */ Dialog a;
    final /* synthetic */ xuz b;

    public xur(xuz xuzVar, Dialog dialog) {
        this.b = xuzVar;
        this.a = dialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.ak.H(3, new acte(actj.BACKSTAGE_POST_DIALOG_CANCEL_BUTTON), null);
        dialogInterface.dismiss();
        this.a.cancel();
    }
}
