package defpackage;
/* compiled from: PG */
/* renamed from: iss  reason: default package */
/* loaded from: classes3.dex */
final class iss implements Runnable {
    final /* synthetic */ ist a;

    public iss(ist istVar) {
        this.a = istVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ist istVar = this.a;
        if (istVar.c.compareAndSet(0, 1)) {
            istVar.a.addAll(istVar.b.a());
            istVar.c.compareAndSet(1, 2);
        }
    }
}
