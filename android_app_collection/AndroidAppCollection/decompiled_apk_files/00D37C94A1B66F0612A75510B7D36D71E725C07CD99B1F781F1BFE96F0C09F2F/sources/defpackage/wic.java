package defpackage;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.google.android.libraries.youtube.account.verification.ui.CodeInputEditText;
/* compiled from: PG */
/* renamed from: wic  reason: default package */
/* loaded from: classes4.dex */
public final class wic extends InputConnectionWrapper {
    final /* synthetic */ CodeInputEditText a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wic(CodeInputEditText codeInputEditText, InputConnection inputConnection) {
        super(inputConnection, true);
        this.a = codeInputEditText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        CodeInputEditText codeInputEditText;
        wid widVar;
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && (widVar = (codeInputEditText = this.a).a) != null) {
            widVar.a(codeInputEditText);
        }
        return super.sendKeyEvent(keyEvent);
    }
}
