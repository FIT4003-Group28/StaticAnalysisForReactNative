package defpackage;
/* compiled from: PG */
/* renamed from: anoq  reason: default package */
/* loaded from: classes2.dex */
public class anoq implements anop {
    private final anox a;
    private final anry b;

    public anoq(anox anoxVar, anry anryVar) {
        this.a = anoxVar;
        this.b = anryVar;
    }

    @Override // defpackage.anop
    public String a() {
        return this.b.f();
    }

    @Override // defpackage.anop
    public Boolean b() {
        boolean z = false;
        if ((this.b.o().a & 8) == 0 && (this.b.o().a & 16) == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.anop
    public jic c() {
        return this.b.L();
    }

    @Override // defpackage.anop
    public cqkl d() {
        this.a.e(this.b.g);
        return cqkl.a;
    }

    @Override // defpackage.anop
    public cqkl e() {
        this.b.Z();
        return cqkl.a;
    }

    @Override // defpackage.anop
    public cjtd f() {
        return this.b.R(dtyi.de);
    }

    @Override // defpackage.anop
    public cjtd g() {
        return this.b.R(dtyi.df);
    }
}
