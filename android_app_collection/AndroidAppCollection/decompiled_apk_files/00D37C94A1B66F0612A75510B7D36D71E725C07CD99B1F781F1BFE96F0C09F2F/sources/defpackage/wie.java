package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.youtube.account.verification.ui.CodeInputEditText;
import com.google.android.libraries.youtube.account.verification.ui.CodeInputView;
/* compiled from: PG */
/* renamed from: wie  reason: default package */
/* loaded from: classes4.dex */
public final class wie implements TextWatcher {
    final /* synthetic */ int a;
    final /* synthetic */ CodeInputView b;

    public wie(CodeInputView codeInputView, int i) {
        this.b = codeInputView;
        this.a = i;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 > i2) {
            CodeInputView codeInputView = this.b;
            CodeInputEditText codeInputEditText = codeInputView.a[this.a];
            if (!codeInputView.c) {
                return;
            }
            int i4 = CodeInputView.i(codeInputEditText);
            if (i4 < 5) {
                codeInputView.d(i4 + 1);
                return;
            }
            codeInputView.c();
            codeInputView.f(-1);
            wif wifVar = codeInputView.b;
            if (wifVar == null) {
                return;
            }
            wifVar.h(codeInputView.b());
        }
    }
}
