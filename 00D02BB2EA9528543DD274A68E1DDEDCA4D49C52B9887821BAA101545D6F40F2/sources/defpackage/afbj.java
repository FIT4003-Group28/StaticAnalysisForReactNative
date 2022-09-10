package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
/* compiled from: PG */
/* renamed from: afbj  reason: default package */
/* loaded from: classes2.dex */
public final class afbj extends jeo<afbn> {
    public afbj(Context context, afbn afbnVar, cqkj cqkjVar) {
        super(context, 16974129, new afbm(), afbnVar, cqkjVar);
    }

    @Override // defpackage.jeo, android.app.Dialog
    public final void onCreate(@dzsi Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        super.onCreate(bundle);
    }
}
