package defpackage;
/* compiled from: PG */
/* renamed from: dzek  reason: default package */
/* loaded from: classes6.dex */
final class dzek implements Runnable {
    final /* synthetic */ dzel a;
    private final dzbg b;
    private final Runnable c;

    public dzek(dzel dzelVar, dzbg dzbgVar, Runnable runnable) {
        this.a = dzelVar;
        this.b = dzbgVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dzbd.f(this.b, this.a.b(this.c));
    }
}
