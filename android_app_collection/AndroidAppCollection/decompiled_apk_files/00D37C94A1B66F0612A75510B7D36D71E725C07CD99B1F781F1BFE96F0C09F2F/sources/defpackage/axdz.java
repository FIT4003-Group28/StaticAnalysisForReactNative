package defpackage;

import com.google.vr.cardboard.ExternalSurfaceManager;
/* compiled from: PG */
/* renamed from: axdz  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class axdz implements axef {
    public final /* synthetic */ ExternalSurfaceManager a;
    private final /* synthetic */ int b;

    public /* synthetic */ axdz(ExternalSurfaceManager externalSurfaceManager) {
        this.a = externalSurfaceManager;
    }

    public /* synthetic */ axdz(ExternalSurfaceManager externalSurfaceManager, int i) {
        this.b = i;
        this.a = externalSurfaceManager;
    }

    @Override // defpackage.axef
    public final void a(axed axedVar) {
        if (this.b == 0) {
            axea axeaVar = this.a.a;
            if (!axedVar.i || axedVar.d.get() <= 0) {
                return;
            }
            axedVar.d.decrementAndGet();
            axedVar.g.updateTexImage();
            axedVar.g.getTransformMatrix(axedVar.c);
            axeaVar.a(axedVar.a, axedVar.f[0], axedVar.g.getTimestamp(), axedVar.c);
            return;
        }
        axea axeaVar2 = this.a.a;
        if (!axedVar.i || axedVar.d.getAndSet(0) <= 0) {
            return;
        }
        axedVar.g.updateTexImage();
        axedVar.g.getTransformMatrix(axedVar.c);
        axeaVar2.a(axedVar.a, axedVar.f[0], axedVar.g.getTimestamp(), axedVar.c);
    }
}
