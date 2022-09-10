package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
/* compiled from: PG */
/* renamed from: quh  reason: default package */
/* loaded from: classes7.dex */
final class quh extends jeo<rbe> {
    public quh(Context context, rbe rbeVar, cqkj cqkjVar) {
        super(context, new qzq(), rbeVar, cqkjVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jeo, android.app.Dialog
    public final void onCreate(@dzsi Bundle bundle) {
        requestWindowFeature(1);
        Window window = getWindow();
        dbsk.s(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        super.onCreate(bundle);
    }
}
