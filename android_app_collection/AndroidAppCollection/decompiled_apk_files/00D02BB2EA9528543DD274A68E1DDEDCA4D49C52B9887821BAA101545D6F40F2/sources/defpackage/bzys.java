package defpackage;
/* compiled from: PG */
/* renamed from: bzys  reason: default package */
/* loaded from: classes4.dex */
public class bzys extends bzym {
    private final boolean b;
    private final dzsj<ccif> c;
    private final dioi d;
    private final dinw e;
    private final bzyv f;
    private final ddho g;

    public bzys(bzyv bzyvVar, @dzsi String str, dinw dinwVar, dioi dioiVar, cqss cqssVar, boolean z, boolean z2, @dzsi String str2, amfi amfiVar, dzsj<ccif> dzsjVar) {
        super(null, cqssVar, z2, str2, amfiVar);
        this.b = z;
        this.c = dzsjVar;
        this.e = dinwVar;
        this.d = dioiVar;
        this.f = bzyvVar;
        this.g = z ? dtxu.ao : dtxy.oJ;
    }

    @Override // defpackage.bzyw
    public cqkl i() {
        return cqkl.a;
    }

    @Override // defpackage.bzyw
    @dzsi
    public cqtd j() {
        return null;
    }

    @Override // defpackage.bzyw
    public cqkl k() {
        this.f.a();
        this.c.a().a(this.g, this.e);
        return cqkl.a;
    }

    @Override // defpackage.bzyw
    public Boolean l() {
        return true;
    }

    @Override // defpackage.bzyw
    public cjtd m() {
        return cjtd.a(this.g);
    }

    @Override // defpackage.bzyw
    public String n() {
        return this.d.a;
    }

    @Override // defpackage.bzyw
    public String o() {
        return this.d.b;
    }

    @Override // defpackage.bzyw
    public Boolean p() {
        return Boolean.valueOf(!this.b);
    }

    @Override // defpackage.bzyw
    public Boolean q() {
        return true;
    }

    @Override // defpackage.bzyw
    @dzsi
    public cjtd r() {
        return null;
    }
}
