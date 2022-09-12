package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
/* compiled from: PG */
/* renamed from: ame  reason: default package */
/* loaded from: classes2.dex */
public final class ame extends InputConnectionWrapper {
    final /* synthetic */ cuxh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ame(InputConnection inputConnection, cuxh cuxhVar) {
        super(inputConnection, false);
        this.a = cuxhVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        this.a.a();
        return true;
    }
}
