package defpackage;
/* compiled from: PG */
/* renamed from: bzyn  reason: default package */
/* loaded from: classes4.dex */
public class bzyn extends bzym {
    private final bzyv b;
    private final dwui c;
    private final dzsj<cafi> d;

    public bzyn(bzyv bzyvVar, @dzsi String str, cqss cqssVar, boolean z, @dzsi String str2, dwui dwuiVar, amfi amfiVar, dzsj<cafi> dzsjVar) {
        super(null, cqssVar, z, str2, amfiVar);
        this.b = bzyvVar;
        this.c = dwuiVar;
        this.d = dzsjVar;
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
        this.b.a();
        this.d.a().k(null, null);
        return cqkl.a;
    }

    @Override // defpackage.bzyw
    public Boolean l() {
        return true;
    }

    @Override // defpackage.bzyw
    @dzsi
    public cjtd m() {
        return cjtd.a(this.a ? dtxt.b : dtxt.c);
    }

    @Override // defpackage.bzyw
    public String n() {
        return this.c.a;
    }

    @Override // defpackage.bzyw
    public String o() {
        return this.c.b;
    }

    @Override // defpackage.bzyw
    public Boolean p() {
        return Boolean.valueOf(this.a);
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
