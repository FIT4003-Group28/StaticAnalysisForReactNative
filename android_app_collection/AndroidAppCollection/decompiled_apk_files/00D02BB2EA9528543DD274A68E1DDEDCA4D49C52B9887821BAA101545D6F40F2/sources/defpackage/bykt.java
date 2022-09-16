package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bykt  reason: default package */
/* loaded from: classes4.dex */
final class bykt implements ecs {
    final /* synthetic */ byky a;

    public bykt(byky bykyVar) {
        this.a = bykyVar;
    }

    @Override // defpackage.ecs
    public final void Qf() {
        byky bykyVar = this.a;
        gga ggaVar = bykyVar.aE;
        if (ggaVar != null) {
            View c = bykyVar.d.c();
            bvsi bvsiVar = new bvsi(ggaVar);
            bvsiVar.c(this.a.e.c());
            bvsiVar.c(this.a.e.d());
            c.announceForAccessibility(bvsiVar.toString());
        }
    }
}
