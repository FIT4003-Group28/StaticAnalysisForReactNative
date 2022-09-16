package defpackage;
/* compiled from: PG */
/* renamed from: azkp  reason: default package */
/* loaded from: classes2.dex */
final class azkp implements Runnable {
    final /* synthetic */ azkr a;
    private final Throwable b;

    public azkp(azkr azkrVar, Throwable th) {
        this.a = azkrVar;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.b(this.b);
    }
}
