package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
/* compiled from: PG */
/* renamed from: alqi  reason: default package */
/* loaded from: classes.dex */
final class alqi implements View.OnClickListener {
    final /* synthetic */ alqj a;

    public alqi(alqj alqjVar) {
        this.a = alqjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText = this.a.k.a;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (this.a.a()) {
            editText.setTransformationMethod(null);
        } else {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            editText.setSelection(selectionEnd);
        }
        this.a.k.h();
    }
}
