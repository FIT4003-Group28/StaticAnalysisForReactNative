package defpackage;
/* compiled from: PG */
/* renamed from: asib  reason: default package */
/* loaded from: classes2.dex */
final class asib implements Runnable {
    final /* synthetic */ amte a;
    final /* synthetic */ int b;
    final /* synthetic */ asih c;

    public asib(asih asihVar, amte amteVar, int i) {
        this.c = asihVar;
        this.a = amteVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        crfn a = crfn.a(this.a);
        a.d = this.b;
        this.c.e.a().c(a.c());
    }
}
