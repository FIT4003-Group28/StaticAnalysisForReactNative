package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ahqm  reason: default package */
/* loaded from: classes.dex */
final class ahqm implements Runnable {
    final /* synthetic */ ViewGroup.LayoutParams a;
    final /* synthetic */ ahqo b;

    public ahqm(ahqo ahqoVar, ViewGroup.LayoutParams layoutParams) {
        this.b = ahqoVar;
        this.a = layoutParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahqn ahqnVar = this.b.k;
        final ViewGroup.LayoutParams layoutParams = this.a;
        zgd.u(ahqnVar, new azqb() { // from class: ahql
            @Override // defpackage.azqb
            public final Object get() {
                return layoutParams;
            }
        }, zgd.s(this.a.width, this.a.height), ViewGroup.LayoutParams.class);
    }
}
