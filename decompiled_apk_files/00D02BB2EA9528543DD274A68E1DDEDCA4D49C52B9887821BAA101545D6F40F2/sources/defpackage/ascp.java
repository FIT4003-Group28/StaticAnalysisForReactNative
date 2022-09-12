package defpackage;
/* compiled from: PG */
/* renamed from: ascp  reason: default package */
/* loaded from: classes2.dex */
final class ascp implements Runnable {
    final /* synthetic */ gga a;
    final /* synthetic */ qbt b;
    final /* synthetic */ qcz c;

    public ascp(gga ggaVar, qbt qbtVar, qcz qczVar) {
        this.a = ggaVar;
        this.b = qbtVar;
        this.c = qczVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.w();
        this.b.m(this.c);
    }
}
