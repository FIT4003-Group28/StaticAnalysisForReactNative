package defpackage;
/* compiled from: PG */
/* renamed from: dykn  reason: default package */
/* loaded from: classes6.dex */
final class dykn implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ dyko b;

    public dykn(dyko dykoVar, int i) {
        this.b = dykoVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = dyzn.a;
        try {
            this.b.o.c(this.a);
        } catch (Throwable th) {
            this.b.c(th);
        }
    }
}
