package defpackage;
/* compiled from: PG */
/* renamed from: cett  reason: default package */
/* loaded from: classes4.dex */
class cett implements cetc {
    private final String a;
    private final String b;
    private final Runnable c;

    public cett(String str, String str2, Runnable runnable) {
        this.a = str;
        this.b = str2;
        this.c = runnable;
    }

    @Override // defpackage.cetc
    public String a() {
        return this.a;
    }

    @Override // defpackage.cetc
    public String b() {
        return this.b;
    }

    @Override // defpackage.cetc
    public String c() {
        return dbrz.e(", ").i(a(), b(), new Object[0]);
    }

    @Override // defpackage.cetc
    public Boolean d() {
        return false;
    }

    @Override // defpackage.cetc
    public Boolean e() {
        return true;
    }

    @Override // defpackage.cetc
    public cqkl f() {
        this.c.run();
        return cqkl.a;
    }

    @Override // defpackage.cetc
    public cjtd g() {
        return cjtd.a(dtxy.J);
    }
}
