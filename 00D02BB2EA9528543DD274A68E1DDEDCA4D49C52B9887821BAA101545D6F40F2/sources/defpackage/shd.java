package defpackage;
/* compiled from: PG */
/* renamed from: shd  reason: default package */
/* loaded from: classes7.dex */
public class shd implements sbe {
    private final dcdc<zdu> a;
    @dzsi
    private final String b;
    @dzsi
    private final String c;
    private final int d;
    private final cqkn<sbe> e;
    private final ddho f;
    private int g;
    private boolean h = false;
    @dzsi
    private final String i;

    public shd(dcdc<zdu> dcdcVar, @dzsi String str, @dzsi String str2, int i, cqkn<sbe> cqknVar, ddho ddhoVar, int i2, @dzsi String str3) {
        this.a = dcdcVar;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = cqknVar;
        this.f = ddhoVar;
        this.g = i2;
        this.i = str3;
    }

    @Override // defpackage.sbe
    public dcdc<zdu> a() {
        return this.a;
    }

    @Override // defpackage.sbe
    @dzsi
    public String b() {
        return this.b;
    }

    @Override // defpackage.sbe
    @dzsi
    public String c() {
        return this.c;
    }

    @Override // defpackage.sbe
    public Boolean d() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.sbe
    public void e(boolean z) {
        this.h = z;
    }

    @Override // defpackage.sbe
    public cqkn<sbe> f() {
        return this.e;
    }

    @Override // defpackage.sbe
    public int g() {
        return this.d;
    }

    @Override // defpackage.sbe
    public cjtd h() {
        cjta b = cjtd.b();
        b.d = this.f;
        b.i(this.g);
        return b.a();
    }

    @Override // defpackage.sbe
    public void i(int i) {
        this.g = i;
    }

    @Override // defpackage.sbe
    @dzsi
    public CharSequence j() {
        return this.i;
    }
}
