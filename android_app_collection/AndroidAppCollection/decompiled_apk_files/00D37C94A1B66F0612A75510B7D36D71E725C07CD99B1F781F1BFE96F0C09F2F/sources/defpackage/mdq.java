package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
/* compiled from: PG */
/* renamed from: mdq  reason: default package */
/* loaded from: classes3.dex */
final class mdq implements DialogInterface.OnKeyListener {
    final /* synthetic */ mdr a;

    public mdq(mdr mdrVar) {
        this.a = mdrVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Bundle bundle = this.a.m;
        if (bundle != null && i == bundle.getInt("KeyPress") && keyEvent.getAction() == 1) {
            Dialog dialog = this.a.d;
            if (dialog != null) {
                dialog.dismiss();
            }
            return true;
        }
        return false;
    }
}
