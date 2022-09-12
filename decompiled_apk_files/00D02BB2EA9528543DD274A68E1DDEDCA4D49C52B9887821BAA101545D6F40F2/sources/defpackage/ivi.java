package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: ivi  reason: default package */
/* loaded from: classes6.dex */
final class ivi implements TextWatcher {
    final /* synthetic */ ivk a;

    public ivi(ivk ivkVar) {
        this.a = ivkVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.Ov(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.Ou(charSequence);
    }
}
