package defpackage;
/* compiled from: PG */
/* renamed from: aonn  reason: default package */
/* loaded from: classes2.dex */
public class aonn implements aonm {
    private final anrr a;

    public aonn(anrr anrrVar) {
        this.a = anrrVar;
    }

    @Override // defpackage.aonm
    public String a() {
        return this.a.f();
    }

    @Override // defpackage.aonm
    public cqss b() {
        dvax b = dvax.b(this.a.g.m);
        if (b == null) {
            b = dvax.UNKNOWN;
        }
        if (!b.equals(dvax.ACTIVITY)) {
            return irg.J();
        }
        return iva.b(this.a.M().a(), ibl.b());
    }

    @Override // defpackage.aonm
    public String c() {
        return this.a.g();
    }

    @Override // defpackage.aonm
    public CharSequence d() {
        anrr anrrVar = this.a;
        if (anrrVar.n == null) {
            anrp A = anrrVar.A();
            anrrVar.n = anrrVar.c.getString(A.a, A.b.toArray());
        }
        return anrrVar.n;
    }

    @Override // defpackage.aonm
    public jic e() {
        return this.a.J();
    }

    @Override // defpackage.aonm
    public Boolean f() {
        return Boolean.valueOf(this.a.e());
    }

    @Override // defpackage.aonm
    public cqsn g() {
        if (this.a.e()) {
            return this.a.i();
        }
        return this.a.h();
    }

    @Override // defpackage.aonm
    public Boolean h() {
        return Boolean.valueOf(this.a.j);
    }

    @Override // defpackage.aonm
    public Boolean i() {
        boolean z = false;
        if (!this.a.e() && this.a.N()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
