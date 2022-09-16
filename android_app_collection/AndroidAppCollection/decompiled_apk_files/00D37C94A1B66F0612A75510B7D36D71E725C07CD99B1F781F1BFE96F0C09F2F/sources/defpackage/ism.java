package defpackage;
/* compiled from: PG */
/* renamed from: ism  reason: default package */
/* loaded from: classes3.dex */
final class ism implements Runnable {
    final /* synthetic */ isn a;

    public ism(isn isnVar) {
        this.a = isnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        isn isnVar = this.a;
        if (isnVar.c.compareAndSet(0, 1)) {
            isnVar.a.addAll(isnVar.b.a());
            isnVar.c.compareAndSet(1, 2);
        }
    }
}
