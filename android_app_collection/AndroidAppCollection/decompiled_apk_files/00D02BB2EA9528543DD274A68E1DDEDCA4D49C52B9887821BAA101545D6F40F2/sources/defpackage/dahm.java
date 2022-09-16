package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dahm  reason: default package */
/* loaded from: classes5.dex */
final class dahm implements dahw {
    final /* synthetic */ dahp a;

    public dahm(dahp dahpVar) {
        this.a = dahpVar;
    }

    @Override // defpackage.dahw
    public final void a(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.a;
        textInputLayout.setEndIconVisible(true);
        textInputLayout.setEndIconCheckable(true);
        dahp dahpVar = this.a;
        dahpVar.m.setChecked(!dahpVar.e());
        editText.removeTextChangedListener(this.a.a);
        editText.addTextChangedListener(this.a.a);
    }
}
