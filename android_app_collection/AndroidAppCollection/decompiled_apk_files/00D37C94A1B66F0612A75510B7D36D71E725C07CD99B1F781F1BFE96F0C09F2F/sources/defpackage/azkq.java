package defpackage;
/* compiled from: PG */
/* renamed from: azkq  reason: default package */
/* loaded from: classes2.dex */
final class azkq implements Runnable {
    final /* synthetic */ azkr a;
    private final Object b;

    public azkq(azkr azkrVar, Object obj) {
        this.a = azkrVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.sh(this.b);
    }
}
