package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: et  reason: default package */
/* loaded from: classes6.dex */
public final class et implements DialogInterface.OnCancelListener {
    final /* synthetic */ ex a;

    public et(ex exVar) {
        this.a = exVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ex exVar = this.a;
        Dialog dialog = exVar.d;
        if (dialog != null) {
            exVar.onCancel(dialog);
        }
    }
}
