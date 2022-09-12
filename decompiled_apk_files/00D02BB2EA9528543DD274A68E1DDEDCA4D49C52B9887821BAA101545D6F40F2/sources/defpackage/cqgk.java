package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: cqgk  reason: default package */
/* loaded from: classes5.dex */
final class cqgk implements TextWatcher {
    final /* synthetic */ cqgl a;

    public cqgk(cqgl cqglVar) {
        this.a = cqglVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.a(charSequence);
    }
}
