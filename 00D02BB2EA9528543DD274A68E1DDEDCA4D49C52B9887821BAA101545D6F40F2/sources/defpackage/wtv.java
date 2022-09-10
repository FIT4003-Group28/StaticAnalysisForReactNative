package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
/* compiled from: PG */
/* renamed from: wtv  reason: default package */
/* loaded from: classes7.dex */
final class wtv extends jeo<zdl> {
    public wtv(Context context, zdl zdlVar, cqkj cqkjVar) {
        super(context, new vgm(), zdlVar, cqkjVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jeo, android.app.Dialog
    public final void onCreate(@dzsi Bundle bundle) {
        Window window = getWindow();
        dbsk.s(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        super.onCreate(bundle);
    }
}
