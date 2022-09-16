package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
/* compiled from: PG */
/* renamed from: xvp  reason: default package */
/* loaded from: classes4.dex */
final class xvp implements TextWatcher {
    final /* synthetic */ EditText a;
    final /* synthetic */ xvr b;

    public xvp(xvr xvrVar, EditText editText) {
        this.b = xvrVar;
        this.a = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        xvr xvrVar = this.b;
        xvrVar.c(xvrVar.l());
        float lineSpacingExtra = this.a.getLineSpacingExtra();
        float lineSpacingMultiplier = this.a.getLineSpacingMultiplier();
        this.a.setLineSpacing(0.0f, 1.0f);
        this.a.setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
    }
}
