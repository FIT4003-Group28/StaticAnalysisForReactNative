package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: ahmy  reason: default package */
/* loaded from: classes.dex */
final class ahmy implements Runnable {
    final /* synthetic */ FrameLayout.LayoutParams a;
    final /* synthetic */ ahnh b;

    public ahmy(ahnh ahnhVar, FrameLayout.LayoutParams layoutParams) {
        this.b = ahnhVar;
        this.a = layoutParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahnf ahnfVar = this.b.j;
        final FrameLayout.LayoutParams layoutParams = this.a;
        zgd.u(ahnfVar, new azqb() { // from class: ahmx
            @Override // defpackage.azqb
            public final Object get() {
                return layoutParams;
            }
        }, zgd.s(this.a.width, this.a.height), ViewGroup.LayoutParams.class);
    }
}
