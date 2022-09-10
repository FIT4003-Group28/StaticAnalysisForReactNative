package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.libraries.messaging.lighter.ui.composebox.ComposeBoxView;
/* compiled from: PG */
/* renamed from: cuxg  reason: default package */
/* loaded from: classes5.dex */
public final class cuxg implements TextWatcher {
    final /* synthetic */ ComposeBoxView a;

    public cuxg(ComposeBoxView composeBoxView) {
        this.a = composeBoxView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z = !TextUtils.isEmpty(editable);
        ComposeBoxView composeBoxView = this.a;
        if (z == composeBoxView.k) {
            return;
        }
        composeBoxView.k = z;
        if (!z && composeBoxView.l) {
            return;
        }
        composeBoxView.h(z);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
