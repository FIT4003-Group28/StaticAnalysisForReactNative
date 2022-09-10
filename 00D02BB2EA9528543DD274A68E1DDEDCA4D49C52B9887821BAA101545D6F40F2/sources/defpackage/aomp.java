package defpackage;
/* compiled from: PG */
/* renamed from: aomp  reason: default package */
/* loaded from: classes2.dex */
final class aomp implements angt<aogb, aoge> {
    final /* synthetic */ aomr a;
    private final gfq b;
    private boolean c = false;

    public aomp(aomr aomrVar, gfq gfqVar) {
        this.a = aomrVar;
        this.b = gfqVar;
    }

    @Override // defpackage.angt
    public final void a(angu<aogb, aoge> anguVar) {
        aouv aouvVar = (aouv) anguVar;
        angf angfVar = (angf) aouvVar.c;
        if (angfVar.a == angr.ABSENT) {
            this.a.d.c((aogb) aouvVar.b, dbpy.a);
        }
        if (angfVar.a == angr.PENDING_DIRTY_OR_ABSENT_DATA) {
            this.c = true;
        }
        if (!this.c || angfVar.a != angr.SUCCESS) {
            this.a.an.g();
            if (!this.a.an.h().booleanValue() || this.a.an.k().a()) {
                return;
            }
            gfq.l(this.a);
            return;
        }
        gfq.l(this.a);
    }
}
