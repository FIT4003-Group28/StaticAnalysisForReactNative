package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alqf  reason: default package */
/* loaded from: classes.dex */
public final class alqf implements alqp {
    final /* synthetic */ alqj a;

    public alqf(alqj alqjVar) {
        this.a = alqjVar;
    }

    @Override // defpackage.alqp
    public final void a(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.a;
        textInputLayout.u(true);
        textInputLayout.m(true);
        alqj alqjVar = this.a;
        alqjVar.m.setChecked(!alqjVar.a());
        editText.removeTextChangedListener(this.a.a);
        editText.addTextChangedListener(this.a.a);
    }
}
