package defpackage;
/* compiled from: PG */
/* renamed from: bjzz  reason: default package */
/* loaded from: classes3.dex */
public class bjzz implements bjwx {
    private final cjtd a;
    private boolean b;

    public bjzz(bwrs<ilo> bwrsVar, ddde dddeVar) {
        ilo c = bwrsVar.c();
        c.getClass();
        cjta c2 = cjtd.c(c.bZ());
        ddes bZ = ddet.D.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        dddeVar.getClass();
        ddetVar.s = dddeVar;
        ddetVar.a |= 2097152;
        c2.s(bZ.bK());
        this.a = c2.a();
    }

    @Override // defpackage.bjwx
    public cjtd a() {
        cjta c = cjtd.c(this.a);
        c.d = dtxy.gB;
        return c.a();
    }

    @Override // defpackage.bjwx
    public cjtd b() {
        cjta c = cjtd.c(this.a);
        c.d = dtxy.gD;
        return c.a();
    }

    @Override // defpackage.bjwx
    public cjtd c() {
        cjta c = cjtd.c(this.a);
        c.d = dtxy.gC;
        return c.a();
    }

    @Override // defpackage.bjwx
    public cqkl d() {
        this.b = true;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bjwx
    public Boolean e() {
        return Boolean.valueOf(this.b);
    }
}
