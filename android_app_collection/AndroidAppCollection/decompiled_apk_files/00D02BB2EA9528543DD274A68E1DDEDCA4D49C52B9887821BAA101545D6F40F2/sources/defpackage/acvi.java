package defpackage;
/* compiled from: PG */
/* renamed from: acvi  reason: default package */
/* loaded from: classes2.dex */
public class acvi implements acvf {
    private final String a;
    private final String b;
    @dzsi
    private final String c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public acvi(String str, String str2, @dzsi String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // defpackage.acvf
    public Boolean a() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.acvf
    public String b() {
        return this.a;
    }

    @Override // defpackage.acvf
    public String c() {
        return this.b;
    }

    @Override // defpackage.acvf
    @dzsi
    public String d() {
        return this.c;
    }

    @Override // defpackage.acvf
    public Boolean e() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.acvf
    public Boolean f() {
        return Boolean.valueOf(this.f);
    }
}
