package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: him  reason: default package */
/* loaded from: classes3.dex */
public final class him implements TextWatcher {
    final /* synthetic */ View a;
    final /* synthetic */ hin b;

    public him(hin hinVar, View view) {
        this.b = hinVar;
        this.a = view;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.b.a.hasFocus()) {
            hin hinVar = this.b;
            hinVar.c.a(hinVar.a.getText().toString());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.setVisibility(i3 == 0 ? 4 : 0);
    }
}
