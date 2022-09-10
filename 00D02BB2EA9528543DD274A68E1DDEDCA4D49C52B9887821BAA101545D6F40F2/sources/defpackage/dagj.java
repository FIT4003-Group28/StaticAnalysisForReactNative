package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dagj  reason: default package */
/* loaded from: classes5.dex */
final class dagj implements dahw {
    final /* synthetic */ dagq a;

    public dagj(dagq dagqVar) {
        this.a = dagqVar;
    }

    @Override // defpackage.dahw
    public final void a(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.a;
        textInputLayout.setEndIconVisible(editText.hasFocus() && dagq.d(editText.getText()));
        textInputLayout.setEndIconCheckable(false);
        editText.setOnFocusChangeListener(this.a.b);
        editText.removeTextChangedListener(this.a.a);
        editText.addTextChangedListener(this.a.a);
    }
}
