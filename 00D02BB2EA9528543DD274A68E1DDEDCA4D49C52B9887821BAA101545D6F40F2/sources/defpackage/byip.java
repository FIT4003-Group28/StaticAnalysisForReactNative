package defpackage;
/* compiled from: PG */
/* renamed from: byip  reason: default package */
/* loaded from: classes4.dex */
public final class byip {
    public final cqat b;
    @dzsi
    public byio e;
    public final bvgj g;
    private final eaow h;
    public final btzi<dhlj, dhll> f = new byin(this);
    public dhll c = dhll.g;
    public byjw d = byjw.WAITING_TO_REQUEST;
    public long a = -1;

    public byip(bvgj bvgjVar, cqat cqatVar, eaow eaowVar) {
        this.g = bvgjVar;
        this.b = cqatVar;
        this.h = eaowVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        byio byioVar = this.e;
        if (byioVar != null) {
            byjw byjwVar = this.d;
            dhll dhllVar = this.c;
            byjy byjyVar = (byjy) byioVar;
            byjx byjxVar = byjyVar.d;
            if (byjxVar == null) {
                return;
            }
            byje byjeVar = byjyVar.c;
            byjxVar.s(byjwVar, byjeVar.n, byjeVar.q, dhllVar, byjeVar.m);
        }
    }

    public final boolean b() {
        return this.a > 0 && this.b.b() < this.a + this.h.b;
    }
}
