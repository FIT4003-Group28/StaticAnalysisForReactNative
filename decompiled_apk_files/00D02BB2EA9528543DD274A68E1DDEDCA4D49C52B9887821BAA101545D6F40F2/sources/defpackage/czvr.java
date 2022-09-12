package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* compiled from: PG */
/* renamed from: czvr  reason: default package */
/* loaded from: classes5.dex */
final class czvr implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;
    private final boolean c;

    public czvr(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = swipeDismissBehavior;
        this.b = view;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dafa dafaVar;
        amy amyVar = this.a.a;
        if (amyVar == null || !amyVar.l()) {
            if (!this.c || (dafaVar = this.a.f) == null) {
                return;
            }
            dafaVar.a(this.b);
            return;
        }
        od.j(this.b, this);
    }
}
