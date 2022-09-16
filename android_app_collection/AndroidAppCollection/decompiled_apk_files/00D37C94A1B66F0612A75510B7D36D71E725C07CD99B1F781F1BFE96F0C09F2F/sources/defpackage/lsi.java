package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lsi  reason: default package */
/* loaded from: classes3.dex */
public final class lsi implements TextWatcher {
    final /* synthetic */ lsl a;

    public lsi(lsl lslVar) {
        this.a = lslVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        lsl lslVar = this.a;
        lslVar.g = editable;
        lslVar.j();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
