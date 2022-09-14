package defpackage;
/* compiled from: PG */
/* renamed from: ataf  reason: default package */
/* loaded from: classes2.dex */
public final class ataf implements arrh {
    private final atcx a;
    private final gek b;
    private final atcu c;
    private final atcp d;
    private final jkf e;

    public ataf(atcx atcxVar, gek gekVar, atcu atcuVar, jkf jkfVar, atcp atcpVar) {
        this.a = atcxVar;
        this.b = gekVar;
        this.c = atcuVar;
        this.e = jkfVar;
        this.d = atcpVar;
    }

    @Override // defpackage.arrh
    public final void a() {
        if (!((ges) this.c).aD) {
            return;
        }
        atcp atcpVar = this.d;
        atcpVar.k.c(atcpVar.g);
        this.b.c = jjn.FULLY_EXPANDED;
        this.a.aT();
    }

    @Override // defpackage.arrh
    public final void b() {
        if (!((ges) this.c).aD) {
            return;
        }
        this.e.w();
        this.c.Qk();
    }

    @Override // defpackage.arrh
    public final boolean c() {
        atcp atcpVar = this.d;
        return atcpVar.k.b() == atcpVar.g;
    }
}
