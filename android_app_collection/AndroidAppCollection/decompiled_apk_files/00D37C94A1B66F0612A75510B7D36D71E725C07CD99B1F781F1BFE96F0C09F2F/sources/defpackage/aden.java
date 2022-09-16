package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aden  reason: default package */
/* loaded from: classes.dex */
public final class aden extends dh {
    public adez ae;

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        return new AlertDialog.Builder(mJ()).setTitle(R.string.mdx_logged_out_watch_history_dialog_title).setMessage(R.string.mdx_logged_out_watch_history_dialog_message).setNegativeButton(17039360, new adem(this, 1)).setPositiveButton(R.string.mdx_logged_out_watch_history_dialog_confirm_button, new adem(this)).create();
    }
}
