package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cdvh  reason: default package */
/* loaded from: classes4.dex */
final class cdvh extends ne {
    private final int b;

    public cdvh(int i) {
        this.b = i;
    }

    @Override // defpackage.ne
    public final void f(View view, pc pcVar) {
        dzvx.c(view, "view");
        super.f(view, pcVar);
        pcVar.h(new oy(16, view.getContext().getString(this.b)));
    }
}
