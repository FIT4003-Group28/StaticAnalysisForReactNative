package defpackage;
/* compiled from: PG */
/* renamed from: ascq  reason: default package */
/* loaded from: classes2.dex */
final class ascq implements Runnable {
    final /* synthetic */ gga a;
    final /* synthetic */ qbt b;
    final /* synthetic */ qcz c;

    public ascq(gga ggaVar, qbt qbtVar, qcz qczVar) {
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
