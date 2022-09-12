package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: cdwh  reason: default package */
/* loaded from: classes4.dex */
final class cdwh implements TextWatcher {
    final /* synthetic */ z a;

    public cdwh(z zVar) {
        this.a = zVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.g(charSequence);
    }
}
