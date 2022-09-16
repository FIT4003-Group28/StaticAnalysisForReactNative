package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: alpb  reason: default package */
/* loaded from: classes.dex */
final class alpb implements alqp {
    final /* synthetic */ alpi a;

    public alpb(alpi alpiVar) {
        this.a = alpiVar;
    }

    @Override // defpackage.alqp
    public final void a(TextInputLayout textInputLayout) {
        EditText editText = textInputLayout.a;
        textInputLayout.u(this.a.d());
        textInputLayout.m(false);
        editText.setOnFocusChangeListener(this.a.b);
        alpi alpiVar = this.a;
        alpiVar.m.setOnFocusChangeListener(alpiVar.b);
        editText.removeTextChangedListener(this.a.a);
        editText.addTextChangedListener(this.a.a);
    }
}
