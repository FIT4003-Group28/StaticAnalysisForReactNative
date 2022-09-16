package defpackage;
/* compiled from: PG */
/* renamed from: jhx  reason: default package */
/* loaded from: classes3.dex */
public final class jhx implements jic {
    public final int a;
    public final Class b;
    private final aagi c;
    private final jin d;
    private final ampg e;

    public jhx(aagi aagiVar, jin jinVar, int i, Class cls, ampg ampgVar) {
        this.c = aagiVar;
        this.d = jinVar;
        this.a = i;
        this.b = cls;
        this.e = ampgVar;
    }

    @Override // defpackage.jic
    public final int a() {
        return this.a;
    }

    @Override // defpackage.jic
    public final int b() {
        return this.a;
    }

    @Override // defpackage.jic
    public final jia c(aajj aajjVar, String str, jib jibVar) {
        aajj a;
        aagh c = this.c.c();
        if (aajjVar == null) {
            abga abgaVar = (abga) this.e.apply(str);
            abgaVar.getClass();
            a = abgaVar.a(c);
        } else {
            a = aajjVar.e().a(c);
        }
        return jia.a(a);
    }

    @Override // defpackage.jic
    public final ampq d(String str) {
        return ampq.j(str);
    }

    @Override // defpackage.jic
    public final amvn e(String str) {
        return amvn.r(this.d.a(str));
    }

    @Override // defpackage.jic
    public final Class f() {
        return this.b;
    }

    @Override // defpackage.jic
    public final Class g() {
        return this.b;
    }

    @Override // defpackage.jic
    public final mhk h(String str) {
        return new mhk(1, str);
    }
}
