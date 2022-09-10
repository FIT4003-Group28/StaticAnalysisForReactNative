package defpackage;
/* compiled from: PG */
/* renamed from: bwat  reason: default package */
/* loaded from: classes4.dex */
public final class bwat extends bvwn<dmha> {
    private final bvyk b;

    public bwat(bvyk bvykVar) {
        super(dmha.d);
        this.b = bvykVar;
    }

    @Override // defpackage.bvwn
    public final /* bridge */ /* synthetic */ void a(dmha dmhaVar) {
        dmha dmhaVar2 = dmhaVar;
        dhjx dhjxVar = dmhaVar2.a;
        if (dhjxVar == null) {
            dhjxVar = dhjx.f;
        }
        if (alad.c(dhjxVar) == null) {
            bvwi c = bvwj.c();
            c.b(drtc.INVALID_ARGUMENT);
            throw c.a();
        }
        bvyk bvykVar = this.b;
        dhjx dhjxVar2 = dmhaVar2.a;
        if (dhjxVar2 == null) {
            dhjxVar2 = dhjx.f;
        }
        dmgo dmgoVar = dmhaVar2.b;
        if (dmgoVar == null) {
            dmgoVar = dmgo.c;
        }
        int i = dmgoVar.a;
        dmgo dmgoVar2 = dmhaVar2.b;
        if (dmgoVar2 == null) {
            dmgoVar2 = dmgo.c;
        }
        int i2 = dmgoVar2.b;
        bvrj.UI_THREAD.c();
        float f = bvykVar.d.getResources().getDisplayMetrics().densityDpi / 160.0f;
        dhkd dhkdVar = dhjxVar2.d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        float f2 = (i + (dhkdVar.b / 2)) * f;
        dhkd dhkdVar2 = dhjxVar2.d;
        if (dhkdVar2 == null) {
            dhkdVar2 = dhkd.d;
        }
        alae a = alae.a(f2, (i2 + (dhkdVar2.c / 2)) * f, bvykVar.a.af().getWidth(), bvykVar.a.af().getHeight());
        alad c2 = alad.c(dhjxVar2);
        dbsk.s(c2);
        alaa b = alad.b(c2);
        b.f = a;
        bvykVar.g = b.a();
        if (!bvykVar.i) {
            return;
        }
        bvykVar.c();
    }
}
