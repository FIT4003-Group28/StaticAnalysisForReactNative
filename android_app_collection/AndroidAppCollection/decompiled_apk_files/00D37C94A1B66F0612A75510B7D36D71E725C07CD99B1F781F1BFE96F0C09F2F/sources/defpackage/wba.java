package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wba  reason: default package */
/* loaded from: classes4.dex */
public final class wba extends wap {
    public was ae;

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.ae.g();
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        return new AlertDialog.Builder(mJ()).setMessage(R.string.camera_permission_description).setPositiveButton(R.string.camera_permission_positive_button, new waz(this)).create();
    }
}
