package defpackage;
/* compiled from: PG */
/* renamed from: cbaz  reason: default package */
/* loaded from: classes4.dex */
class cbaz implements cbqx {
    private final String a;
    private final cbqv b;

    public cbaz(cbqv cbqvVar, gga ggaVar) {
        this.b = cbqvVar;
        this.a = ggaVar.getString(cbqvVar.e);
    }

    @Override // defpackage.iao
    public cjtd b() {
        return cjtd.b;
    }

    @Override // defpackage.iao
    public CharSequence c() {
        return ian.a(this);
    }

    @Override // defpackage.iao
    public Boolean d() {
        return ian.c();
    }

    @Override // defpackage.iao
    public hxy e() {
        return null;
    }

    @Override // defpackage.iao
    public Integer f() {
        return ian.b();
    }

    @Override // defpackage.iao
    /* renamed from: g */
    public String a() {
        return this.a;
    }

    @Override // defpackage.cbqx
    public cbqv h() {
        return this.b;
    }
}
