package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dahn  reason: default package */
/* loaded from: classes5.dex */
final class dahn implements dahx {
    final /* synthetic */ dahp a;

    public dahn(dahp dahpVar) {
        this.a = dahpVar;
    }

    @Override // defpackage.dahx
    public final void a(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.a;
        if (editText == null || i != 1) {
            return;
        }
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editText.removeTextChangedListener(this.a.a);
    }
}
