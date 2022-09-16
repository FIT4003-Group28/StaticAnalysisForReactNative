package defpackage;
/* compiled from: PG */
/* renamed from: abvi  reason: default package */
/* loaded from: classes.dex */
final class abvi implements Runnable {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final abyb d;

    public abvi(abyb abybVar, boolean z, boolean z2, boolean z3) {
        this.d = abybVar;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final abyb abybVar = this.d;
        if (abybVar != null) {
            if (this.a) {
                if (!abybVar.b.U) {
                    return;
                }
                zep.b("The stream failed to transition to an active state after an initial period.");
                abybVar.b.t.post(new Runnable() { // from class: abya
                    @Override // java.lang.Runnable
                    public final void run() {
                        abyb.this.b.j.m();
                    }
                });
            } else if (!this.b) {
                if (!this.c) {
                    return;
                }
                abybVar.b.j.d();
            } else {
                abyp abypVar = abybVar.b.j;
                int i = abypVar.a;
                if (i == 6) {
                    abypVar.f(6);
                } else if (i == 5) {
                    abypVar.f(5);
                } else {
                    zep.l("LiveSC: ignoring notifyStreamBroadcastStatusIsReady");
                    abypVar.h();
                }
            }
        }
    }
}
