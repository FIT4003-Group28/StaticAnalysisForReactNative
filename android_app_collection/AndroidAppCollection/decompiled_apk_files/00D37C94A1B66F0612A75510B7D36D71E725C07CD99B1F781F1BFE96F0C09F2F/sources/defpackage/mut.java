package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mut  reason: default package */
/* loaded from: classes3.dex */
public final class mut implements TextWatcher {
    final /* synthetic */ muu a;

    public mut(muu muuVar) {
        this.a = muuVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        muu muuVar = this.a;
        if (muuVar.l || muuVar.k) {
            return;
        }
        aafo aafoVar = muuVar.d;
        apzg apzgVar = muuVar.f.h;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, null);
        muuVar.k = true;
    }
}
