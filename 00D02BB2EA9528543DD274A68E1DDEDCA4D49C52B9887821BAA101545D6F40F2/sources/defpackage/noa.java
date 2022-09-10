package defpackage;
/* compiled from: PG */
/* renamed from: noa  reason: default package */
/* loaded from: classes7.dex */
public class noa implements nny {
    private final nnz a;
    private final jzp b;
    private String c;
    private String d;
    @dzsi
    private cqtd e;
    private int f;

    public noa(nnz nnzVar, jzp jzpVar, String str) {
        dbsk.s(nnzVar);
        this.a = nnzVar;
        this.b = jzpVar;
        dbsk.s(str);
        this.c = str;
        this.d = "";
        this.f = 1;
    }

    @Override // defpackage.nny
    public CharSequence a() {
        return this.c;
    }

    @Override // defpackage.nny
    public CharSequence b() {
        return this.d;
    }

    @Override // defpackage.nny
    public Boolean c() {
        return Boolean.valueOf(this.f == 2);
    }

    @Override // defpackage.nny
    public Boolean d() {
        return Boolean.valueOf(this.f == 3);
    }

    @Override // defpackage.nny
    @dzsi
    public cqtd e() {
        return this.e;
    }

    @Override // defpackage.nny
    public Boolean f() {
        return Boolean.valueOf(this.b.h());
    }

    @Override // defpackage.nny
    public cqkl g() {
        ((nnt) this.a).a.l();
        return cqkl.a;
    }

    @Override // defpackage.nny
    public cqkl h() {
        ((nnt) this.a).a.b.b();
        return cqkl.a;
    }

    public void i(String str) {
        dbsk.s(str);
        this.c = str;
    }

    public void j(String str) {
        dbsk.s(str);
        this.d = str;
        this.f = 2;
    }

    public void k() {
        this.d = "";
        this.f = 3;
    }

    public void l() {
        this.d = "";
        this.f = 1;
    }

    public void m(cqtd cqtdVar) {
        dbsk.s(cqtdVar);
        this.e = cqtdVar;
    }
}
