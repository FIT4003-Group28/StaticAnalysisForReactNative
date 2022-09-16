package defpackage;
/* compiled from: PG */
/* renamed from: bmlk  reason: default package */
/* loaded from: classes3.dex */
class bmlk implements iao {
    final /* synthetic */ bmll a;
    private final int b;
    private final cjtd c;
    private final bege d;

    public bmlk(bmll bmllVar, cjta cjtaVar, int i, ddho ddhoVar, bege begeVar) {
        this.a = bmllVar;
        this.b = i;
        cjtaVar.d = ddhoVar;
        this.c = cjtaVar.a();
        this.d = begeVar;
    }

    @Override // defpackage.iao
    public cjtd b() {
        return this.c;
    }

    @Override // defpackage.iao
    public CharSequence c() {
        return ian.a(this);
    }

    @Override // defpackage.iao
    public Boolean d() {
        bege.UPDATES.equals(this.d);
        return false;
    }

    @Override // defpackage.iao
    public hxy e() {
        return hya.f(this.a.b).a();
    }

    @Override // defpackage.iao
    public Integer f() {
        return ian.b();
    }

    @Override // defpackage.iao
    /* renamed from: g */
    public String a() {
        return this.a.g.getString(this.b);
    }
}
