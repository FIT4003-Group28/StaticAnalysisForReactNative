package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alqh  reason: default package */
/* loaded from: classes.dex */
public final class alqh implements alqq {
    final /* synthetic */ alqj a;

    public alqh(alqj alqjVar) {
        this.a = alqjVar;
    }

    @Override // defpackage.alqq
    public final void a(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.a;
        if (editText == null || i != 1) {
            return;
        }
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editText.post(new alqg(this, editText));
    }
}
