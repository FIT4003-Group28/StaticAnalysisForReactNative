package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
/* compiled from: PG */
/* renamed from: alt  reason: default package */
/* loaded from: classes.dex */
public final class alt extends InputConnectionWrapper {
    final /* synthetic */ alv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alt(InputConnection inputConnection, alv alvVar) {
        super(inputConnection, false);
        this.a = alvVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        alv alvVar = this.a;
        alz alzVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            alzVar = new alz(new alw(inputContentInfo));
        }
        if (alvVar.a(alzVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
