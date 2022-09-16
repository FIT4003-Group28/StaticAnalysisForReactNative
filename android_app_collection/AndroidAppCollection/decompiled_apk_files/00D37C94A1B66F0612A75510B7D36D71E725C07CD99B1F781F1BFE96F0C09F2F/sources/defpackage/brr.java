package defpackage;
/* compiled from: PG */
/* renamed from: brr  reason: default package */
/* loaded from: classes2.dex */
final class brr implements Runnable {
    final /* synthetic */ ankt a;
    final /* synthetic */ bru b;
    final /* synthetic */ bwk c;

    public brr(bru bruVar, ankt anktVar, bwk bwkVar) {
        this.b = bruVar;
        this.a = anktVar;
        this.c = bwkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.get();
            bqf a = bqf.a();
            int i = bru.j;
            String.format("Starting work for %s", this.b.c.d);
            a.d(new Throwable[0]);
            bru bruVar = this.b;
            bruVar.e = bruVar.d.b();
            this.c.g(this.b.e);
        } catch (Throwable th) {
            this.c.f(th);
        }
    }
}
