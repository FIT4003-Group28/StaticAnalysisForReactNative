package defpackage;
/* compiled from: PG */
/* renamed from: boor  reason: default package */
/* loaded from: classes3.dex */
public class boor implements jae {
    private final String a;
    private final boou b;

    public boor(boou boouVar, String str) {
        this.b = boouVar;
        this.a = str;
    }

    @Override // defpackage.jae
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jae
    public Boolean b() {
        return this.b.s();
    }

    @Override // defpackage.jae
    @dzsi
    public cqtd c() {
        return null;
    }

    @Override // defpackage.jae
    public CharSequence d() {
        return this.a;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return Boolean.valueOf(!this.b.v().isEmpty());
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        boou boouVar = this.b;
        boouVar.B(Boolean.valueOf(!boouVar.s().booleanValue()));
        return cqkl.a;
    }

    @Override // defpackage.jae
    public cjtd g() {
        return cjtd.a(dddv.KS);
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
