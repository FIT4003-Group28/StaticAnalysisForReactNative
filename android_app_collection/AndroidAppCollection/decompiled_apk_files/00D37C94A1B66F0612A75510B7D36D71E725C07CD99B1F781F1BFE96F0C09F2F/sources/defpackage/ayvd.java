package defpackage;
/* compiled from: PG */
/* renamed from: ayvd  reason: default package */
/* loaded from: classes2.dex */
final class ayvd implements Runnable {
    final /* synthetic */ ayve a;
    private final Object b;

    public ayvd(ayve ayveVar, Object obj) {
        this.a = ayveVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.c(this.b);
    }
}
