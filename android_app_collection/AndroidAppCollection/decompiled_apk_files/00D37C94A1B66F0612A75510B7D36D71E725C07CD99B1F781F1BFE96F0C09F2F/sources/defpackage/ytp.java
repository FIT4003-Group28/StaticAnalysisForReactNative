package defpackage;
/* compiled from: PG */
/* renamed from: ytp  reason: default package */
/* loaded from: classes4.dex */
final class ytp implements Runnable {
    private final yua a;
    private final cfb b;

    public ytp(yua yuaVar, cfb cfbVar) {
        this.a = yuaVar;
        this.b = cfbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.c()) {
            this.a.qz(this.b.a);
        } else {
            this.a.o(this.b.c);
        }
    }
}
