package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: umw  reason: default package */
/* loaded from: classes.dex */
public final class umw extends afhx {
    public static final dbsl<afga> a = umv.a;
    private final dxio<qbt> b;
    private final cjqy c;

    public umw(Intent intent, @dzsi String str, dxio<qbt> dxioVar, cjqy cjqyVar) {
        super(intent, str, afid.DIRECTIONS);
        this.b = dxioVar;
        this.c = cjqyVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        bvrj.UI_THREAD.c();
        Intent intent = this.f;
        amvh h = amvh.h("", null);
        cjta b = cjtd.b();
        b.g(cjrx.a(ddcu.JF.a));
        b.d = dtxw.dG;
        dnqh a2 = yys.a(this.c.o(b.a()));
        qcw x = qcx.x();
        x.s(dqvj.TRANSIT);
        x.k(qbs.DEFAULT);
        x.r(h);
        x.b(dcdc.t((amvh[]) intent.getSerializableExtra("DirectionsGmmIntentdestinations")));
        x.w((dwao) bvrs.f(intent.getExtras(), "DirectionsGmmIntenttransitOptions", (dssr) dwao.R.cu(7)));
        x.v(a2);
        this.b.a().n(x.a());
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return durz.EIT_TRANSIT_REROUTE;
    }
}
