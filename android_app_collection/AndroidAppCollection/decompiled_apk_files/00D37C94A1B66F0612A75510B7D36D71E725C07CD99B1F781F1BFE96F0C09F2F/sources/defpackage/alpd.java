package defpackage;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: alpd  reason: default package */
/* loaded from: classes.dex */
final class alpd implements alqq {
    final /* synthetic */ alpi a;

    public alpd(alpi alpiVar) {
        this.a = alpiVar;
    }

    @Override // defpackage.alqq
    public final void a(TextInputLayout textInputLayout, int i) {
        EditText editText = textInputLayout.a;
        if (editText == null || i != 2) {
            return;
        }
        editText.post(new alpc(this, editText));
        if (editText.getOnFocusChangeListener() == this.a.b) {
            editText.setOnFocusChangeListener(null);
        }
        View.OnFocusChangeListener onFocusChangeListener = this.a.m.getOnFocusChangeListener();
        alpi alpiVar = this.a;
        if (onFocusChangeListener != alpiVar.b) {
            return;
        }
        alpiVar.m.setOnFocusChangeListener(null);
    }
}
