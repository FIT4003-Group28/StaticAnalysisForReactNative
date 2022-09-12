package defpackage;

import android.app.Activity;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aaxr  reason: default package */
/* loaded from: classes2.dex */
public class aaxr implements aawt {
    private final aaxc a;
    private final aaxo b;
    private final bmdq c;
    private final Activity d;
    private final dxio<afha> e;
    private boolean f;
    private String g = "";
    @dzsi
    private aaja h = null;

    public aaxr(aaxc aaxcVar, aaxo aaxoVar, bmdq bmdqVar, Activity activity, dxio<afha> dxioVar) {
        this.a = aaxcVar;
        this.b = aaxoVar;
        this.c = bmdqVar;
        this.d = activity;
        this.e = dxioVar;
    }

    @Override // defpackage.aawt
    public aawm a() {
        return this.a;
    }

    @Override // defpackage.aawt
    public aaws b() {
        return this.b;
    }

    @Override // defpackage.aakt
    public Boolean c() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.aawt
    public String d() {
        return this.g;
    }

    @Override // defpackage.aawt
    @dzsi
    public aaja e() {
        return this.h;
    }

    public void f(diwb diwbVar) {
        this.b.j(diwbVar);
        this.a.i(diwbVar);
        dccx F = dcdc.F();
        ditt dittVar = diwbVar.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        String str = dittVar.b;
        djsp djspVar = diwbVar.H;
        if (djspVar == null) {
            djspVar = djsp.g;
        }
        if ((djspVar.a & 16) != 0) {
            cjta b = cjtd.b();
            b.d = dtxo.bV;
            if (!dbsj.d(str)) {
                b.g(str);
            }
            djsp djspVar2 = diwbVar.H;
            if (djspVar2 == null) {
                djspVar2 = djsp.g;
            }
            dnpq dnpqVar = djspVar2.f;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
            F.g(new aajh(dnpqVar, ditv.DEFAULT_ICON, b.a(), this.e.a()));
        }
        dnpq dnpqVar2 = diwbVar.p;
        if (dnpqVar2 == null) {
            dnpqVar2 = dnpq.g;
        }
        String str2 = dnpqVar2.d;
        dnpq dnpqVar3 = diwbVar.p;
        if (dnpqVar3 == null) {
            dnpqVar3 = dnpq.g;
        }
        String str3 = dnpqVar3.c;
        if (!str2.isEmpty() && !str3.isEmpty()) {
            cjta b2 = cjtd.b();
            b2.d = dtxo.bX;
            if (!dbsj.d(str)) {
                b2.g(str);
            }
            dnpq dnpqVar4 = diwbVar.p;
            if (dnpqVar4 == null) {
                dnpqVar4 = dnpq.g;
            }
            F.g(new aajh(dnpqVar4, ditv.DEFAULT_ICON, b2.a(), this.e.a()));
        }
        if ((diwbVar.a & 32768) != 0) {
            cjta b3 = cjtd.b();
            b3.d = dtxo.bT;
            if (!dbsj.d(str)) {
                b3.g(str);
            }
            dgfy dgfyVar = diwbVar.q;
            if (dgfyVar == null) {
                dgfyVar = dgfy.f;
            }
            dgfy dgfyVar2 = dgfyVar;
            ditv ditvVar = ditv.DEFAULT_ICON;
            ditt dittVar2 = diwbVar.e;
            if (dittVar2 == null) {
                dittVar2 = ditt.n;
            }
            F.g(new aajf(dgfyVar2, ditvVar, dittVar2.f, b3.a(), this.c, this.d));
        }
        aaja a = aaiy.a(F.f());
        boolean z = false;
        boolean z2 = a != null && !a.a().isEmpty();
        this.h = a;
        String join = TextUtils.join(" · ", dcbg.b(diwbVar.r).s(aaxq.a).E(String.class));
        this.g = join;
        boolean z3 = !join.isEmpty();
        if (b().c().booleanValue() || a().c().booleanValue() || z2 || z3) {
            z = true;
        }
        this.f = z;
    }
}
