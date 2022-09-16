package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: adhj  reason: default package */
/* loaded from: classes.dex */
public final class adhj extends dh {
    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        return new AlertDialog.Builder(mJ()).setMessage(R.string.mdx_sideloaded_dialog_error_message).setPositiveButton(R.string.mdx_sideloaded_dialog_confirm_button, new DialogInterface.OnClickListener() { // from class: adhi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                adhj.this.ku();
            }
        }).create();
    }
}
