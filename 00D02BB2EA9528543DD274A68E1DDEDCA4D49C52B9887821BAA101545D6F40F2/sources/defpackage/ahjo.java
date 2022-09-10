package defpackage;
/* compiled from: PG */
/* renamed from: ahjo  reason: default package */
/* loaded from: classes2.dex */
public class ahjo implements ahah {
    private final dldw a;

    public ahjo(dldw dldwVar) {
        this.a = dldwVar;
    }

    @Override // defpackage.ahah
    public jic a() {
        String str = this.a.c;
        return new jic(str, jfv.a(str), 0, 250);
    }

    @Override // defpackage.ahah
    public Boolean b() {
        return Boolean.valueOf(!this.a.c.isEmpty());
    }

    @Override // defpackage.ahah
    public String c() {
        return this.a.a;
    }

    @Override // defpackage.ahah
    public String d() {
        return this.a.b;
    }

    @Override // defpackage.ahah
    public String e() {
        return this.a.f;
    }

    @Override // defpackage.ahah
    public String f() {
        return this.a.e;
    }

    @Override // defpackage.ahah
    public String g() {
        return "/";
    }

    @Override // defpackage.ahah
    public String h() {
        return this.a.d;
    }
}
