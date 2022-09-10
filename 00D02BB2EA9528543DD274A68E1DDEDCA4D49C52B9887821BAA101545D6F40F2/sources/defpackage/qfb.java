package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: qfb  reason: default package */
/* loaded from: classes7.dex */
final class qfb implements TextWatcher {
    final /* synthetic */ qff a;

    public qfb(qff qffVar) {
        this.a = qffVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.b(charSequence);
    }
}
