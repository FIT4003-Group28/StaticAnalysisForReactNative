package defpackage;
/* compiled from: PG */
/* renamed from: booo  reason: default package */
/* loaded from: classes3.dex */
public class booo implements jae {
    private final byea a;
    private final String b;
    private final boqj c;

    public booo(byea byeaVar, String str, boqj boqjVar) {
        this.a = byeaVar;
        this.b = str;
        this.c = boqjVar;
    }

    @Override // defpackage.jae
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jae
    public Boolean b() {
        return Boolean.valueOf(this.c.v().contains(this.a));
    }

    @Override // defpackage.jae
    @dzsi
    public cqtd c() {
        return null;
    }

    @Override // defpackage.jae
    public CharSequence d() {
        return this.b;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        this.c.z(this.a, !b().booleanValue());
        return cqkl.a;
    }

    @Override // defpackage.jae
    @dzsi
    public cjtd g() {
        return null;
    }

    @Override // defpackage.jae
    public jic h() {
        return null;
    }

    @Override // defpackage.jae
    public String i() {
        return "";
    }
}
