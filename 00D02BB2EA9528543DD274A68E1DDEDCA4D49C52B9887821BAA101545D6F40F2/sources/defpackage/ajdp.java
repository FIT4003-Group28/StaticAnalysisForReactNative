package defpackage;
/* compiled from: PG */
/* renamed from: ajdp  reason: default package */
/* loaded from: classes2.dex */
class ajdp implements ajah {
    final /* synthetic */ ajdr a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dbsg c;

    public ajdp(ajdr ajdrVar, boolean z, dbsg dbsgVar) {
        this.a = ajdrVar;
        this.b = z;
        this.c = dbsgVar;
    }

    @Override // defpackage.ajah
    public cqkl a() {
        this.a.q();
        return cqkl.a;
    }

    @Override // defpackage.ajah
    public cjtd b() {
        if (this.b) {
            return cjtd.a(dtxu.fF);
        }
        return cjtd.a(this.c.a() ? dtxu.eO : dtxu.dB);
    }
}
