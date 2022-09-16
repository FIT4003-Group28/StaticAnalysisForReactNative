package defpackage;
/* compiled from: PG */
/* renamed from: yxh  reason: default package */
/* loaded from: classes4.dex */
final class yxh implements Runnable {
    private final Runnable a;
    private final yxb b;
    private final yxj c;

    public yxh(yxb yxbVar, Runnable runnable) {
        this.a = runnable;
        this.b = yxbVar;
        yxj yxjVar = new yxj("SPAWN", yxbVar.f, 2);
        this.c = yxjVar;
        yxbVar.a(yxjVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        yxd.k(this.b);
        this.c.b();
        try {
            this.a.run();
        } finally {
        }
    }
}
