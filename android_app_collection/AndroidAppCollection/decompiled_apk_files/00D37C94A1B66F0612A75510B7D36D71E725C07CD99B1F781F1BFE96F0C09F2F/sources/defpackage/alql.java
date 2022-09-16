package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: alql  reason: default package */
/* loaded from: classes.dex */
public final class alql implements TextWatcher {
    final /* synthetic */ TextInputLayout a;

    public alql(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.a;
        textInputLayout.Q(!textInputLayout.p);
        TextInputLayout textInputLayout2 = this.a;
        if (textInputLayout2.b) {
            textInputLayout2.O(editable.length());
        }
        TextInputLayout textInputLayout3 = this.a;
        if (textInputLayout3.f) {
            textInputLayout3.R(editable.length());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
