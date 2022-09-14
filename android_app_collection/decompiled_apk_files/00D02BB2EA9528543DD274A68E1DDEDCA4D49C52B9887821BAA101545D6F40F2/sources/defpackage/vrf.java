package defpackage;

import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: vrf  reason: default package */
/* loaded from: classes7.dex */
public class vrf implements vqv {
    private final cklf a;
    private final vpd b;
    private final btrm c;
    @dzsi
    private final Runnable d;
    private boolean e = false;
    private boolean f = false;

    public vrf(cqhn cqhnVar, cklf cklfVar, vpd vpdVar, btrm btrmVar, @dzsi Runnable runnable, boolean z) {
        this.a = cklfVar;
        this.d = runnable;
        this.b = vpdVar;
        this.c = btrmVar;
    }

    @Override // defpackage.vqv
    public cqkl a() {
        this.e = !this.e;
        this.f = false;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.vqv
    public cqkl b() {
        this.f = !this.f;
        this.e = false;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.vqv
    public cqkl c() {
        this.a.a("license_plate_android");
        return cqkl.a;
    }

    @Override // defpackage.vqv
    public cqkl d() {
        this.b.h(vpc.JAKARTA, this.e, this.f);
        EnumMap k = dcjz.k(vux.class);
        dowl dowlVar = dowl.UNSET;
        boolean z = this.f;
        if (z && !this.e) {
            dowlVar = dowl.JAKARTA_ODD;
        } else if (this.e && !z) {
            dowlVar = dowl.JAKARTA_EVEN;
        }
        k.put((EnumMap) vux.AVOID_ODD_EVEN_ROADS, (vux) Integer.valueOf(dowlVar.t));
        this.c.b(sri.a(k));
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.vqv
    public Boolean e() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.vqv
    public Boolean f() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.vqv
    public cjtd g() {
        return cjtd.a(dtxx.a);
    }

    @Override // defpackage.vqv
    public cjtd h() {
        return cjtd.a(dtxx.f);
    }

    @Override // defpackage.vqv
    public cjtd i() {
        return cjtd.a(dtxx.c);
    }

    @Override // defpackage.vqv
    public cjtd j() {
        return cjtd.a(dtxx.d);
    }

    @Override // defpackage.vqv
    public cjtd k() {
        return cjtd.a(dtxx.b);
    }
}
