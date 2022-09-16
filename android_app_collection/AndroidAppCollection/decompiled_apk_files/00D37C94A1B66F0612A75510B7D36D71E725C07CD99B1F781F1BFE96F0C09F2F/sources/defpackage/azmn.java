package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: azmn  reason: default package */
/* loaded from: classes2.dex */
final class azmn extends ayoq {
    volatile boolean a;
    private final ayqk b;
    private final aypf c;
    private final ayqk d;
    private final aznd e;

    public azmn(aznd azndVar) {
        this.e = azndVar;
        ayqk ayqkVar = new ayqk();
        this.b = ayqkVar;
        aypf aypfVar = new aypf();
        this.c = aypfVar;
        ayqk ayqkVar2 = new ayqk();
        this.d = ayqkVar2;
        ayqkVar2.d(ayqkVar);
        ayqkVar2.d(aypfVar);
    }

    @Override // defpackage.ayoq
    public final aypg a(Runnable runnable) {
        if (this.a) {
            return ayqj.INSTANCE;
        }
        return this.e.i(runnable, 0L, TimeUnit.MILLISECONDS, this.b);
    }

    @Override // defpackage.ayoq
    public final aypg c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.a) {
            return ayqj.INSTANCE;
        }
        return this.e.i(runnable, j, timeUnit, this.c);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.a;
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (!this.a) {
            this.a = true;
            this.d.qr();
        }
    }
}
