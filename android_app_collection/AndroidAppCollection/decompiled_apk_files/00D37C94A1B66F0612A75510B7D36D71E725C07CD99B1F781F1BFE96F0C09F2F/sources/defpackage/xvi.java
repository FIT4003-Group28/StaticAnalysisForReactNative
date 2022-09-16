package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: xvi  reason: default package */
/* loaded from: classes4.dex */
final class xvi implements DialogInterface.OnClickListener {
    final /* synthetic */ Dialog a;

    public xvi(Dialog dialog) {
        this.a = dialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.a.cancel();
    }
}
