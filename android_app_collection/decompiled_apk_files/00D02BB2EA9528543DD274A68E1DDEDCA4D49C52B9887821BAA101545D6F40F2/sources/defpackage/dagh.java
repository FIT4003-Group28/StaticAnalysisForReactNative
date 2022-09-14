package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: dagh  reason: default package */
/* loaded from: classes5.dex */
final class dagh implements TextWatcher {
    final /* synthetic */ dagq a;

    public dagh(dagq dagqVar) {
        this.a = dagqVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        dagq dagqVar = this.a;
        if (dagqVar.k.g != null) {
            return;
        }
        dagqVar.c(dagq.d(editable));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
