package defpackage;
/* compiled from: PG */
/* renamed from: mfq  reason: default package */
/* loaded from: classes7.dex */
final class mfq implements Runnable {
    final /* synthetic */ dtiy a;
    final /* synthetic */ dtja b;
    final /* synthetic */ akqs c;
    final /* synthetic */ bwjw d;
    final /* synthetic */ btys e;
    final /* synthetic */ mfs f;

    public mfq(mfs mfsVar, dtiy dtiyVar, dtja dtjaVar, akqs akqsVar, bwjw bwjwVar, btys btysVar) {
        this.f = mfsVar;
        this.a = dtiyVar;
        this.b = dtjaVar;
        this.c = akqsVar;
        this.d = bwjwVar;
        this.e = btysVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bwnn a = this.f.e.a().a(this.a, dcdc.f(this.b), bwnl.a);
        a.d(this.c);
        this.f.d.h(a.a(), this.d, this.e);
    }
}
