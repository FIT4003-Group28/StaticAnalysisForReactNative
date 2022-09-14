package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eu  reason: default package */
/* loaded from: classes6.dex */
public final class eu implements DialogInterface.OnDismissListener {
    final /* synthetic */ ex a;

    public eu(ex exVar) {
        this.a = exVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ex exVar = this.a;
        Dialog dialog = exVar.d;
        if (dialog != null) {
            exVar.onDismiss(dialog);
        }
    }
}
