package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dagk  reason: default package */
/* loaded from: classes5.dex */
final class dagk implements dahx {
    final /* synthetic */ dagq a;

    public dagk(dagq dagqVar) {
        this.a = dagqVar;
    }

    @Override // defpackage.dahx
    public final void a(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.a;
        if (editText == null || i != 2) {
            return;
        }
        editText.removeTextChangedListener(this.a.a);
        if (editText.getOnFocusChangeListener() != this.a.b) {
            return;
        }
        editText.setOnFocusChangeListener(null);
    }
}
