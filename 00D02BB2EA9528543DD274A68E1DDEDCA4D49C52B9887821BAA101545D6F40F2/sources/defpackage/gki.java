package defpackage;

import android.os.Build;
import android.view.View;
/* compiled from: PG */
/* renamed from: gki  reason: default package */
/* loaded from: classes6.dex */
final class gki extends ne {
    final /* synthetic */ gkj b;

    public gki(gkj gkjVar) {
        this.b = gkjVar;
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        gkj<? extends View> gkjVar = this.b.e;
        if (gkjVar != null) {
            pcVar.M(gkjVar.b);
        }
        gkj<? extends View> gkjVar2 = this.b.f;
        if (gkjVar2 != null) {
            View view2 = gkjVar2.b;
            if (Build.VERSION.SDK_INT >= 22) {
                pcVar.a.setTraversalBefore(view2);
            }
        }
        super.f(view, pcVar);
    }
}
