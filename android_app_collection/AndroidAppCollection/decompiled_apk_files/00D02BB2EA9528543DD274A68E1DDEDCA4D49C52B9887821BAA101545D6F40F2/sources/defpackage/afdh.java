package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
/* compiled from: PG */
/* renamed from: afdh  reason: default package */
/* loaded from: classes2.dex */
public final class afdh extends jeo<afdl> {
    public afdh(Context context, afdn afdnVar, cqkj cqkjVar) {
        super(context, 16974129, new afdk(), afdnVar, cqkjVar);
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
