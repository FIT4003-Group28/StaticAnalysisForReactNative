package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ade  reason: default package */
/* loaded from: classes2.dex */
public final class ade implements TextWatcher {
    final /* synthetic */ adv a;

    public ade(adv advVar) {
        this.a = advVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        adv advVar = this.a;
        Editable text = advVar.a.getText();
        advVar.t = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        advVar.d(!isEmpty);
        advVar.o(isEmpty);
        advVar.f();
        advVar.e();
        if (advVar.m != null && !TextUtils.equals(charSequence, advVar.s)) {
            adp adpVar = advVar.m;
            charSequence.toString();
            adpVar.a();
        }
        advVar.s = charSequence.toString();
    }
}
