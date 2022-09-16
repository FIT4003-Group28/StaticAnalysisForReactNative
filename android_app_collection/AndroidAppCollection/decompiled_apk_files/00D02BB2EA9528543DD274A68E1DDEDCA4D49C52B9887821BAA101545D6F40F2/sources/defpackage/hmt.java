package defpackage;

import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
/* compiled from: PG */
/* renamed from: hmt  reason: default package */
/* loaded from: classes6.dex */
final class hmt extends InputConnectionWrapper {
    final /* synthetic */ hmu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmt(hmu hmuVar, InputConnection inputConnection) {
        super(inputConnection, false);
        this.a = hmuVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        hmu hmuVar = this.a;
        hmuVar.a.a(hmuVar, new CompletionInfo[0]);
        return super.commitText(completionInfo.getText(), 1);
    }
}
