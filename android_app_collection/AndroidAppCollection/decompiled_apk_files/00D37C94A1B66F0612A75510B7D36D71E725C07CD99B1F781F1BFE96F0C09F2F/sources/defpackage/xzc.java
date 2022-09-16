package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: xzc  reason: default package */
/* loaded from: classes4.dex */
final class xzc implements TextWatcher {
    final /* synthetic */ xze a;

    public xzc(xze xzeVar) {
        this.a = xzeVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() > 0) {
            this.a.c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131231381, 0);
            this.a.d = true;
        } else {
            this.a.c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            xze xzeVar = this.a;
            xzeVar.d = false;
            xzeVar.d();
        }
        this.a.e();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
