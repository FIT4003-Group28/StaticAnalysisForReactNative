package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: imu  reason: default package */
/* loaded from: classes.dex */
public final class imu {
    public final gga a;
    public final dxio<bnlf> b;
    public final dxio<bsvm> c;
    public final dxio<ache> d;
    public final dxio<anhg> e;
    public final dxio<ahwf> f;
    public final dxio<avik> g;
    public final dxio<apsa> h;
    public final dxio<ceet> i;
    public final cese j;
    public final btxv k;
    public final imi l;
    public final bnlg m;
    public final bttf n;
    private final dxio<cjqy> o;
    private final cjqq p;

    public imu(gga ggaVar, bttf bttfVar, dxio<cjqy> dxioVar, cjqq cjqqVar, dxio<bnlf> dxioVar2, btxv btxvVar, dxio<bsvm> dxioVar3, dxio<ache> dxioVar4, dxio<anhg> dxioVar5, dxio<ahwf> dxioVar6, dxio<avik> dxioVar7, dxio<apsa> dxioVar8, dxio<ceet> dxioVar9, cese ceseVar, imi imiVar, bnlg bnlgVar) {
        this.a = ggaVar;
        this.n = bttfVar;
        this.o = dxioVar;
        this.p = cjqqVar;
        this.b = dxioVar2;
        this.k = btxvVar;
        this.c = dxioVar3;
        this.d = dxioVar4;
        this.e = dxioVar5;
        this.f = dxioVar6;
        this.g = dxioVar7;
        this.h = dxioVar8;
        this.i = dxioVar9;
        this.j = ceseVar;
        this.l = imiVar;
        this.m = bnlgVar;
    }

    public final void a(View view, ddho ddhoVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        cjtd a = b.a();
        this.o.a().j(this.p.f(view).d(a), a);
    }
}
