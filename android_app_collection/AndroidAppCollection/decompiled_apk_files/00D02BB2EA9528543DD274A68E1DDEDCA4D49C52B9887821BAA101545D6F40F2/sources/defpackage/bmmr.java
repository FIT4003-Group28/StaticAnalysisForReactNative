package defpackage;
/* compiled from: PG */
/* renamed from: bmmr  reason: default package */
/* loaded from: classes3.dex */
public class bmmr implements bmmk {
    private final gga a;
    private final dxio<afha> b;
    private final String c;
    private final String d;
    @dzsi
    private final String e;
    private final boolean f;
    private final bwrs<ilo> g;

    public bmmr(gga ggaVar, dxio<afha> dxioVar, String str, String str2, @dzsi String str3, boolean z, bwrs<ilo> bwrsVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = bwrsVar;
    }

    @Override // defpackage.bmmk
    public String a() {
        return this.c;
    }

    @Override // defpackage.bmmk
    public String b() {
        return this.d;
    }

    @Override // defpackage.bmmk
    public Boolean c() {
        boolean z = false;
        if (this.f && this.e != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmmk
    public cqkl d() {
        if (this.e != null) {
            this.b.a().k(this.a, this.e, 1);
        }
        return cqkl.a;
    }

    @Override // defpackage.bmmk
    public cjtd e() {
        ilo c = this.g.c();
        dbsk.s(c);
        cjta c2 = cjtd.c(c.bZ());
        c2.d = dtxy.hs;
        return c2.a();
    }
}
