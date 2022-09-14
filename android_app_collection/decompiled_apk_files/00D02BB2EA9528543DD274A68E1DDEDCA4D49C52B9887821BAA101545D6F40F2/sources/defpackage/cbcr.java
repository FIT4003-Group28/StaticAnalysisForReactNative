package defpackage;
/* compiled from: PG */
/* renamed from: cbcr  reason: default package */
/* loaded from: classes4.dex */
public class cbcr implements cbrf {
    private final String a;
    @dzsi
    private final cqkn<cbrf> b;
    @dzsi
    private final cqkn<cbrf> c;

    public cbcr(String str, @dzsi cqkn<cbrf> cqknVar, @dzsi cqkn<cbrf> cqknVar2) {
        this.a = str;
        this.b = cqknVar;
        this.c = cqknVar2;
    }

    @Override // defpackage.cbrf
    public String a() {
        return this.a;
    }

    @Override // defpackage.cbrf
    public jic b() {
        ckql ckqlVar = new ckql();
        ckqlVar.e = true;
        return new jic(this.a, ckqc.FULLY_QUALIFIED, null, 0, null, ckqlVar);
    }

    @Override // defpackage.cbrf
    public Boolean c() {
        return Boolean.valueOf(this.b != null);
    }

    @Override // defpackage.cbrf
    @dzsi
    public cqkn<cbrf> d() {
        return this.b;
    }

    @Override // defpackage.cbrf
    public Boolean e() {
        return Boolean.valueOf(this.c != null);
    }

    @Override // defpackage.cbrf
    @dzsi
    public cqkn<cbrf> f() {
        return this.c;
    }
}
