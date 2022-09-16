package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* compiled from: PG */
/* renamed from: alja  reason: default package */
/* loaded from: classes.dex */
final class alja implements Runnable {
    final /* synthetic */ SwipeDismissBehavior a;
    private final View b;
    private final boolean c;

    public alja(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = swipeDismissBehavior;
        this.b = view;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aloa aloaVar;
        amk amkVar = this.a.a;
        if (amkVar == null || !amkVar.n()) {
            if (!this.c || (aloaVar = this.a.f) == null) {
                return;
            }
            aloaVar.a(this.b);
            return;
        }
        lj.H(this.b, this);
    }
}
