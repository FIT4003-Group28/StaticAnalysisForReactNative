package defpackage;

import android.app.AlertDialog;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: bhyj  reason: default package */
/* loaded from: classes3.dex */
final class bhyj implements TextWatcher {
    final /* synthetic */ AlertDialog a;

    public bhyj(AlertDialog alertDialog) {
        this.a = alertDialog;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (TextUtils.isEmpty(editable)) {
            this.a.getButton(-1).setEnabled(false);
        } else {
            this.a.getButton(-1).setEnabled(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
