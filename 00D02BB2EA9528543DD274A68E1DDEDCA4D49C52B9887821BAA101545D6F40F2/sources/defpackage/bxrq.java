package defpackage;
/* compiled from: PG */
/* renamed from: bxrq  reason: default package */
/* loaded from: classes4.dex */
final class bxrq implements dbsz<awwb> {
    boolean a = true;
    final /* synthetic */ boolean b;
    final /* synthetic */ deig c;
    final /* synthetic */ bxrr d;

    public bxrq(bxrr bxrrVar, boolean z, deig deigVar) {
        this.d = bxrrVar;
        this.b = z;
        this.c = deigVar;
    }

    @Override // defpackage.dbsz
    public final /* bridge */ /* synthetic */ void NU(awwb awwbVar) {
        awwb awwbVar2 = awwbVar;
        awwa c = awwbVar2.c(awvv.k);
        if (this.a && this.b && this.d.b.a()) {
            this.d.b.b().a().c(aeav.SEARCH_RECENT_HISTORY, c.a());
        }
        if (this.c.isDone()) {
            return;
        }
        if (c.a() || !c.b()) {
            this.c.j(awwbVar2);
        }
        this.a = false;
    }
}
