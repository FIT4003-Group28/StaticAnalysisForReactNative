package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: coac  reason: default package */
/* loaded from: classes5.dex */
public final class coac implements cnzr {
    public final long a;
    public volatile byte[] b;
    public final coai c;
    final /* synthetic */ coad d;
    public volatile coag e;

    public coac(coad coadVar, coag coagVar, long j, coai coaiVar) {
        this.d = coadVar;
        this.e = coagVar;
        this.a = j;
        this.c = coaiVar;
        coadVar.b++;
    }

    public coac(coad coadVar, String str, coai coaiVar) {
        this.d = coadVar;
        this.c = coaiVar;
        this.b = coaj.b(str);
        this.a = 0L;
    }

    @Override // defpackage.cnzr
    public final void a() {
        this.d.d(new coab(this));
    }
}
