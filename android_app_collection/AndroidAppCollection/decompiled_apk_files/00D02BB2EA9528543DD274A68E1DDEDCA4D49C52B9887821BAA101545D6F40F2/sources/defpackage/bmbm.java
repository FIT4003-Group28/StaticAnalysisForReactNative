package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bmbm  reason: default package */
/* loaded from: classes3.dex */
public class bmbm implements bmbf {
    private dcdc<dglo> a = dcdc.e();
    private dcdc<bmbe> b = dcdc.e();
    private final cjtd c;

    public bmbm(boolean z, @dzsi ilo iloVar) {
        if (iloVar == null) {
            this.c = cjtd.b;
        } else if (z) {
            cjta c = cjtd.c(iloVar.bZ());
            c.d = dtxy.hn;
            this.c = c.a();
        } else {
            cjta c2 = cjtd.c(iloVar.bZ());
            c2.d = dtyb.bl;
            this.c = c2.a();
        }
    }

    @Override // defpackage.bmbf
    public dcdc<bmbe> b() {
        return this.b;
    }

    @Override // defpackage.bmbf
    public void c(List<dglo> list) {
        this.a = dcdc.r(list);
        this.b = dcbg.b(list).s(bmbl.a).z();
    }

    @Override // defpackage.bmbf
    public cjtd d() {
        return this.c;
    }

    @Override // defpackage.bmbf
    /* renamed from: e */
    public dcdc<dglo> a() {
        return dcbg.b(this.a).o(bmbk.a).z();
    }
}
