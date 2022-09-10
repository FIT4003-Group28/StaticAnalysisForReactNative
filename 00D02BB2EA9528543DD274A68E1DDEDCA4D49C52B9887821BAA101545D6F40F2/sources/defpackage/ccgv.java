package defpackage;
/* compiled from: PG */
/* renamed from: ccgv  reason: default package */
/* loaded from: classes4.dex */
public class ccgv implements ccic {
    static final ddho a = dtxu.al;
    private final dxio<ccif> b;
    private final gen c;
    @dzsi
    private final dinw d;

    public ccgv(dxio<ccif> dxioVar, gen genVar, @dzsi dinw dinwVar) {
        this.b = dxioVar;
        this.c = genVar;
        this.d = dinwVar;
    }

    @Override // defpackage.ccic
    public cqkl a() {
        this.c.aT();
        this.b.a().a(a, this.d);
        return cqkl.a;
    }

    @Override // defpackage.ccic
    public cqkl b() {
        this.c.aT();
        return cqkl.a;
    }

    @Override // defpackage.ccic
    @dzsi
    public cjtd c() {
        return cjtd.a(dtxu.ak);
    }

    @Override // defpackage.ccic
    public cjtd d() {
        return cjtd.a(a);
    }
}
