package defpackage;
/* compiled from: PG */
/* renamed from: bijn  reason: default package */
/* loaded from: classes3.dex */
public class bijn extends bijk implements biiy {
    private final dnjj g;
    private final cjtd h;

    public bijn(dnjj dnjjVar, bijz bijzVar, gga ggaVar, cjqy cjqyVar, cjqq cjqqVar, buzn buznVar, dxio<axwy> dxioVar, @dzsi axxe axxeVar) {
        super(bijzVar, ggaVar, cjqyVar, cjqqVar, buznVar, dxioVar, axxeVar);
        this.g = dnjjVar;
        this.h = cjtd.a(dtxy.kO);
    }

    @Override // defpackage.biiy
    @dzsi
    public String a() {
        return this.g.b;
    }

    @Override // defpackage.biiy
    @dzsi
    public String b() {
        return this.g.a;
    }

    @Override // defpackage.biiy
    public cjtd c() {
        return this.h;
    }

    @Override // defpackage.bijd
    public String q() {
        dnwd dnwdVar = this.g.d;
        if (dnwdVar == null) {
            dnwdVar = dnwd.b;
        }
        return dnwdVar.a;
    }

    @Override // defpackage.bijk
    @dzsi
    public final String u() {
        return b();
    }

    @Override // defpackage.bijk
    @dzsi
    public final String v() {
        dnpq dnpqVar = this.g.c;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return dnpqVar.c;
    }
}
