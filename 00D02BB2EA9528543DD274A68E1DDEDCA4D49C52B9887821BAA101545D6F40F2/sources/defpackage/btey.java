package defpackage;
/* compiled from: PG */
/* renamed from: btey  reason: default package */
/* loaded from: classes4.dex */
public class btey implements btex {
    private final cklf a;
    private boolean b;
    private boolean c;

    public btey(cqhn cqhnVar, cklf cklfVar, boolean z, boolean z2) {
        this.a = cklfVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.btex
    public cqkl a() {
        this.b = !this.b;
        this.c = false;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.btex
    public cqkl b() {
        this.c = !this.c;
        this.b = false;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.btex
    public cqkl c() {
        this.a.a("license_plate_android");
        return cqkl.a;
    }

    @Override // defpackage.btex
    public Boolean d() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.btex
    public Boolean e() {
        return Boolean.valueOf(this.c);
    }
}
