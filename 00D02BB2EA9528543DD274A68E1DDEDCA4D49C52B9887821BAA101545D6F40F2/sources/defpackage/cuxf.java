package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.messaging.lighter.ui.composebox.ComposeBoxView;
/* compiled from: PG */
/* renamed from: cuxf  reason: default package */
/* loaded from: classes5.dex */
public final class cuxf implements TextWatcher {
    final /* synthetic */ cuwy a;
    final /* synthetic */ ComposeBoxView b;

    public cuxf(ComposeBoxView composeBoxView, cuwy cuwyVar) {
        this.b = composeBoxView;
        this.a = cuwyVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.b.j.mo48getText().toString().trim().isEmpty()) {
            this.a.b(true);
        } else {
            this.a.b(false);
        }
    }
}
