package defpackage;
/* compiled from: PG */
/* renamed from: bxrh  reason: default package */
/* loaded from: classes4.dex */
final class bxrh implements dbsz<awwb> {
    boolean a = true;
    final /* synthetic */ boolean b;
    final /* synthetic */ deig c;
    final /* synthetic */ bxri d;

    public bxrh(bxri bxriVar, boolean z, deig deigVar) {
        this.d = bxriVar;
        this.b = z;
        this.c = deigVar;
    }

    @Override // defpackage.dbsz
    public final /* bridge */ /* synthetic */ void NU(awwb awwbVar) {
        awwb awwbVar2 = awwbVar;
        awwa c = awwbVar2.c(awvv.I);
        if (this.a && this.b) {
            ((aeaa) ((dxio) ((dbsu) this.d.b).a).a()).c(aeav.PERSONALIZED_HISTORY, c.a());
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
