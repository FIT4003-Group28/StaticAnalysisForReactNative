package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bnfg  reason: default package */
/* loaded from: classes3.dex */
public final class bnfg implements bnek {
    private final bnfa a;
    private final bnfd b;
    private final bgez c;
    private final bgpt d;
    private final boolean e;

    public bnfg(gga ggaVar, bwqv bwqvVar, bnfb bnfbVar, bnfe bnfeVar, bgpu bgpuVar, bhhf bhhfVar, bwrs<ilo> bwrsVar, int i) {
        apup a = bnfbVar.a.a();
        bnfb.a(a, 1);
        bhhf a2 = bnfbVar.b.a();
        bnfb.a(a2, 2);
        bnfb.a(bwrsVar, 3);
        this.a = new bnfa(a, a2, bwrsVar);
        ilo c = bwrsVar.c();
        Activity activity = (Activity) ((dxjd) bnfeVar.a).a;
        bnfe.a(activity, 1);
        dxio a3 = ((dxjh) bnfeVar.b).a();
        bnfe.a(a3, 2);
        dxio a4 = ((dxjh) bnfeVar.c).a();
        bnfe.a(a4, 3);
        btvo a5 = bnfeVar.d.a();
        bnfe.a(a5, 4);
        bnfe.a(c, 5);
        this.b = new bnfd(activity, a3, a4, a5, c);
        bnff bnffVar = new bnff(ggaVar, bwqvVar, bwrsVar);
        this.c = bnffVar;
        bgpt a6 = bgpuVar.a();
        a6.h(bwrsVar.c(), i, bnffVar, bgnk.PLACESHEET_POST_TAB);
        this.d = a6;
        this.e = bhhfVar.b(bwrsVar);
    }

    @Override // defpackage.bnek
    public boolean d() {
        return this.e;
    }

    @Override // defpackage.bnek
    /* renamed from: e */
    public bnfa a() {
        return this.a;
    }

    @Override // defpackage.bnek
    /* renamed from: f */
    public bnfd b() {
        return this.b;
    }

    @Override // defpackage.bnek
    /* renamed from: g */
    public bgpt c() {
        return this.d;
    }
}
