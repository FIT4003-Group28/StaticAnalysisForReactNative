package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
/* compiled from: PG */
/* renamed from: mve  reason: default package */
/* loaded from: classes3.dex */
final class mve implements TextWatcher {
    final /* synthetic */ mvf a;

    public mve(mvf mvfVar) {
        this.a = mvfVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        mvf mvfVar = this.a;
        if (mvfVar.i || mvfVar.h) {
            return;
        }
        aafo aafoVar = mvfVar.c;
        apzg apzgVar = mvfVar.e.h;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, null);
        mvfVar.h = true;
    }
}
