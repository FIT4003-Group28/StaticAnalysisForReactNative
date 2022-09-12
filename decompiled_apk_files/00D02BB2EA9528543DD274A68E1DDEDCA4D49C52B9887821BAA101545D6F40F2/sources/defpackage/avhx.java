package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
/* compiled from: PG */
/* renamed from: avhx  reason: default package */
/* loaded from: classes2.dex */
public final class avhx implements TextWatcher {
    final /* synthetic */ EditText a;
    final /* synthetic */ gde b;

    public avhx(EditText editText, gde gdeVar) {
        this.a = editText;
        this.b = gdeVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.b(-1).setEnabled(!(this.a.getText() == null ? "" : this.a.getText().toString().trim()).isEmpty());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
