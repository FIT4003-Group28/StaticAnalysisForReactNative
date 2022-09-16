package defpackage;
/* compiled from: PG */
/* renamed from: bwqa  reason: default package */
/* loaded from: classes4.dex */
public class bwqa implements bwoi {
    private final dxio<nut> a;
    private final String b;
    private final dthb c;
    @dzsi
    private final String d;
    @dzsi
    private final dtid e;
    @dzsi
    private final cjtd f;

    public bwqa(dtkf dtkfVar, @dzsi String str, @dzsi dvnp dvnpVar, @dzsi dtid dtidVar, dxio<nut> dxioVar) {
        this.d = str;
        this.e = dtidVar;
        this.a = dxioVar;
        this.b = dtkfVar.b.size() > 0 ? dtkfVar.b.get(0) : "";
        dthb dthbVar = dtkfVar.h;
        this.c = dthbVar == null ? dthb.F : dthbVar;
        this.f = oyf.b(str, dtkfVar.k, dtxl.b, dvnpVar, (dtkfVar.a & 128) != 0 ? decs.a(dtkfVar.m) : null);
    }

    @Override // defpackage.bwoi
    public String a() {
        return this.b;
    }

    @Override // defpackage.bwoi
    public cqkl b(cjqm cjqmVar) {
        this.a.a().f().d(null, this.c, nxc.a(this.e, this.d, cjqmVar), null, null);
        return cqkl.a;
    }

    @Override // defpackage.bwoi
    @dzsi
    public cqtd c() {
        return iut.a(cqrt.g(2131232509, ire.f()));
    }

    @Override // defpackage.bwoi
    @dzsi
    public cjtd d() {
        return this.f;
    }
}
