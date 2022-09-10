package defpackage;
/* compiled from: PG */
/* renamed from: bxrl  reason: default package */
/* loaded from: classes4.dex */
final class bxrl implements dbsz<awwb> {
    final /* synthetic */ bxrn a;
    private final boolean b;
    private boolean c = true;

    public bxrl(bxrn bxrnVar, boolean z) {
        this.a = bxrnVar;
        this.b = z;
    }

    @Override // defpackage.dbsz
    /* renamed from: b */
    public final synchronized void NU(awwb awwbVar) {
        aeav aeavVar;
        awwa c = awwbVar.c(this.a.b);
        if (this.c && this.b && this.a.f.a()) {
            if (this.a.b == awvv.k) {
                aeavVar = aeav.SEARCH_RECENT_HISTORY;
            } else {
                aeavVar = aeav.PERSONALIZED_HISTORY;
            }
            this.a.f.b().a().c(aeavVar, c.a());
        }
        if (c.a() || !c.b()) {
            bxrn bxrnVar = this.a;
            bxrnVar.h.b(dcdc.r(((dvhq) awwbVar.a(bxrnVar.b).c(dvhq.d)).b));
        }
        this.c = false;
    }
}
