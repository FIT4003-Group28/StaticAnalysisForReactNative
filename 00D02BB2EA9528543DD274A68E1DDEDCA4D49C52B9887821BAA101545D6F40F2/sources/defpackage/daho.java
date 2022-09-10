package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
/* compiled from: PG */
/* renamed from: daho  reason: default package */
/* loaded from: classes5.dex */
final class daho implements View.OnClickListener {
    final /* synthetic */ dahp a;

    public daho(dahp dahpVar) {
        this.a = dahpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText = this.a.k.a;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (this.a.e()) {
            editText.setTransformationMethod(null);
        } else {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            editText.setSelection(selectionEnd);
        }
        this.a.k.m();
    }
}
