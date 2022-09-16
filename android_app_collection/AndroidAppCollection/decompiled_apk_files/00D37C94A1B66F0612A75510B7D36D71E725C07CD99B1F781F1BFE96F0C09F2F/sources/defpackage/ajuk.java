package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: ajuk  reason: default package */
/* loaded from: classes.dex */
final class ajuk implements TextWatcher {
    final /* synthetic */ ajul a;

    public ajuk(ajul ajulVar) {
        this.a = ajulVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.a();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
