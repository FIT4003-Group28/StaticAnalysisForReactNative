package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnfs  reason: default package */
/* loaded from: classes3.dex */
public final class bnfs implements View.OnClickListener {
    final /* synthetic */ bnft a;

    public bnfs(bnft bnftVar) {
        this.a = bnftVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        runnable = this.a.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
