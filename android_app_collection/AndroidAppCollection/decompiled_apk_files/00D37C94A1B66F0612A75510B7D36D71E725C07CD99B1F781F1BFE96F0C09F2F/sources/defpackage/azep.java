package defpackage;
/* compiled from: PG */
/* renamed from: azep  reason: default package */
/* loaded from: classes2.dex */
final class azep implements Runnable {
    final /* synthetic */ azeq a;
    private final Object b;

    public azep(azeq azeqVar, Object obj) {
        this.a = azeqVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.c(this.b);
    }
}
