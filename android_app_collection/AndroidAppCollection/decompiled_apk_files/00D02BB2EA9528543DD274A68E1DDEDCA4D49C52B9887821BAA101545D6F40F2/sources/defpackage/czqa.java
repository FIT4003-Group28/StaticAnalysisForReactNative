package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: czqa  reason: default package */
/* loaded from: classes5.dex */
final class czqa implements TextWatcher {
    final /* synthetic */ czqc a;

    public czqa(czqc czqcVar) {
        this.a = czqcVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.a.a(charSequence.toString().trim());
    }
}
