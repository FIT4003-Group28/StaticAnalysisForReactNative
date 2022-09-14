package defpackage;
/* compiled from: PG */
/* renamed from: bxry  reason: default package */
/* loaded from: classes4.dex */
public final class bxry implements dbsz<awwb> {
    boolean a = true;
    final /* synthetic */ boolean b;
    final /* synthetic */ deig c;
    final /* synthetic */ bxrz d;

    public bxry(bxrz bxrzVar, boolean z, deig deigVar) {
        this.d = bxrzVar;
        this.b = z;
        this.c = deigVar;
    }

    @Override // defpackage.dbsz
    public final /* bridge */ /* synthetic */ void NU(awwb awwbVar) {
        awwb awwbVar2 = awwbVar;
        awwa c = awwbVar2.c(awvv.E);
        if (this.a && this.b) {
            ((aeaa) ((dxio) ((dbsu) this.d.d).a).a()).c(aeav.SEARCH_ZERO_SUGGEST_ADS, c.a());
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
