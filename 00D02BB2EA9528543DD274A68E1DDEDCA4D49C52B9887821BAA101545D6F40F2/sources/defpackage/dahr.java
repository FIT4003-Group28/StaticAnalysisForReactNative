package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dahr  reason: default package */
/* loaded from: classes5.dex */
public final class dahr implements TextWatcher {
    final /* synthetic */ TextInputLayout a;

    public dahr(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.a;
        textInputLayout.a(!textInputLayout.n);
        TextInputLayout textInputLayout2 = this.a;
        if (textInputLayout2.b) {
            textInputLayout2.d(editable.length());
        }
        TextInputLayout textInputLayout3 = this.a;
        if (textInputLayout3.f) {
            textInputLayout3.e(editable.length());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
