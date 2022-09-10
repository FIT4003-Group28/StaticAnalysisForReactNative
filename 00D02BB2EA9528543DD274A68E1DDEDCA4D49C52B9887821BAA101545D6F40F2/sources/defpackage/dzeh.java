package defpackage;
/* compiled from: PG */
/* renamed from: dzeh  reason: default package */
/* loaded from: classes6.dex */
final class dzeh implements Runnable {
    final /* synthetic */ dzem a;
    private final dzei b;

    public dzeh(dzem dzemVar, dzei dzeiVar) {
        this.a = dzemVar;
        this.b = dzeiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dzei dzeiVar = this.b;
        dzbd.f(dzeiVar.b, this.a.b(dzeiVar));
    }
}
