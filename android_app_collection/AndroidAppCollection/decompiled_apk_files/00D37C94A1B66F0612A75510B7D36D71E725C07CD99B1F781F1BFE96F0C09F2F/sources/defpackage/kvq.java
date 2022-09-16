package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: kvq  reason: default package */
/* loaded from: classes3.dex */
final class kvq implements TextWatcher {
    final /* synthetic */ kvz a;

    public kvq(kvz kvzVar) {
        this.a = kvzVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() != 0 || !this.a.aj.c().g()) {
            this.a.aJ.setVisibility(8);
        } else {
            this.a.aJ.setVisibility(0);
        }
        this.a.ai.d();
        this.a.aF();
        this.a.aL = editable.toString();
        this.a.bd();
        kvz kvzVar = this.a;
        kvzVar.bf(kvzVar.aL);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
