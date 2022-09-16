package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsSurvey;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: fwc  reason: default package */
/* loaded from: classes3.dex */
final class fwc implements TextWatcher {
    final /* synthetic */ TextInputLayout a;
    final /* synthetic */ fwf b;

    public fwc(fwf fwfVar, TextInputLayout textInputLayout) {
        this.b = fwfVar;
        this.a = textInputLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        HatsSurvey hatsSurvey = this.b.d;
        boolean z = false;
        if (length > 0 && length <= this.a.c) {
            z = true;
        }
        hatsSurvey.g(z);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
