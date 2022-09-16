package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aklg  reason: default package */
/* loaded from: classes.dex */
public final class aklg implements TextWatcher {
    final /* synthetic */ aklh a;

    public aklg(aklh aklhVar) {
        this.a = aklhVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        for (akoj akojVar : this.a.c.b) {
            akojVar.d(charSequence.toString());
        }
    }
}
