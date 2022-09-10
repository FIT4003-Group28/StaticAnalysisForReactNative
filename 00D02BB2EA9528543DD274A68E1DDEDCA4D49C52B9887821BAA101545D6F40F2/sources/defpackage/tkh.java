package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tkh  reason: default package */
/* loaded from: classes7.dex */
public final class tkh implements tkm {
    public final dxio<qbt> a;
    public final Activity b;
    public final tmb c;
    public final tnv d;
    public final cvt e;
    public boolean g;
    private final btrm h;
    private final crzb i;
    private final qga j;
    private final xlw k;
    private final tks l;
    private final tkg m = new tkg(this);
    public dbsg<tkj> f = dbpy.a;

    public tkh(dxio<qbt> dxioVar, qga qgaVar, xlw xlwVar, tks tksVar, Activity activity, btrm btrmVar, tmb tmbVar, crzb crzbVar, tnv tnvVar, cvt cvtVar) {
        this.a = dxioVar;
        this.j = qgaVar;
        this.k = xlwVar;
        this.l = tksVar;
        this.e = cvtVar;
        this.b = activity;
        this.h = btrmVar;
        this.c = tmbVar;
        this.i = crzbVar;
        this.d = tnvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void g() {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkh.g():void");
    }

    @Override // defpackage.tkm
    public final void a(btlu btluVar, tlv tlvVar, dbsg<amve> dbsgVar) {
        b(btluVar, tlvVar, dbsgVar, new tkk(true, dbpy.a, dbpy.a, dcdc.e()));
    }

    @Override // defpackage.tkm
    public final void b(btlu btluVar, tlv tlvVar, dbsg<amve> dbsgVar, tkn tknVar) {
        dbsg<Integer> dbsgVar2;
        int a;
        boolean z;
        this.i.a();
        if (dbsgVar.a()) {
            dbsgVar2 = tlvVar.w(dbsgVar.b());
        } else {
            dbsgVar2 = dbpy.a;
        }
        if (!dbsgVar2.a() || !tlvVar.v(dbsgVar2.b().intValue())) {
            a = tlvVar.a();
        } else {
            a = dbsgVar2.b().intValue();
        }
        tkf tkfVar = new tkf(btluVar, tlvVar, a, tknVar);
        if (this.f.a()) {
            tkj b = this.f.b();
            if (b.a().equals(tkfVar.a) && b.b().equals(tkfVar.b) && b.c() == tkfVar.c && b.d().equals(tkfVar.d)) {
                z = false;
                if (this.g || !z) {
                }
                g();
                return;
            }
        }
        this.f = dbsg.i(tkfVar);
        z = true;
        if (this.g) {
        }
    }

    @Override // defpackage.tkm
    public final void c() {
        this.i.a();
        if (this.g) {
            return;
        }
        this.g = true;
        btrm btrmVar = this.h;
        tkg tkgVar = this.m;
        dceq a = dcet.a();
        a.b(alco.class, new tki(alco.class, tkgVar, bvrj.UI_THREAD));
        btrmVar.g(tkgVar, a.a());
        if (!this.f.a()) {
            return;
        }
        g();
    }

    @Override // defpackage.tkm
    public final void d() {
        this.i.a();
        if (this.g) {
            this.h.a(this.m);
        }
        e();
        this.g = false;
    }

    @Override // defpackage.tkm
    public final void e() {
        this.i.a();
        this.f = dbpy.a;
        qbo f = this.a.a().f();
        if (f != null) {
            f.h();
        }
        this.e.b();
        this.j.b();
        this.k.b();
        this.l.a();
    }

    @Override // defpackage.tkm
    public final void f() {
        qbo f;
        this.i.a();
        if (!this.g || (f = this.a.a().f()) == null) {
            return;
        }
        f.f();
    }
}
