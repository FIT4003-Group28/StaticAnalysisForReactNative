package defpackage;
/* compiled from: PG */
/* renamed from: azys  reason: default package */
/* loaded from: classes2.dex */
public final class azys extends azyq {
    public final Runnable a;

    public azys(Runnable runnable, long j, azyr azyrVar) {
        super(j, azyrVar);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } finally {
            this.h.f();
        }
    }

    public final String toString() {
        return "Task[" + banl.j(this.a) + '@' + banl.k(this.a) + ", " + this.g + ", " + this.h + ']';
    }
}
