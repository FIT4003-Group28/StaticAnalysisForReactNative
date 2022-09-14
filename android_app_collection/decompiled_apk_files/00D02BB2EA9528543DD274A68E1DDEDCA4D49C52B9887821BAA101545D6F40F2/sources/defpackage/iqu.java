package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: iqu  reason: default package */
/* loaded from: classes6.dex */
public final class iqu {
    public akqi a = akqi.a;
    public final dxio<akox> b;
    public final Resources c;
    private final cjqq d;

    public iqu(dxio<akox> dxioVar, Resources resources, cjqq cjqqVar) {
        this.b = dxioVar;
        this.c = resources;
        this.d = cjqqVar;
    }

    public final void a() {
        if (!this.a.equals(akqi.a)) {
            this.b.a().Q("travel_highlight");
            this.a = akqi.a;
        }
    }

    public final void b(ddhj ddhjVar, akqi akqiVar) {
        cjta b = cjtd.b();
        b.d = dtyc.fR;
        ddes bZ = ddet.D.bZ();
        ddeo bZ2 = ddep.f.bZ();
        dtbk g = akqiVar.g();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddep ddepVar = (ddep) bZ2.b;
        g.getClass();
        ddepVar.b = g;
        ddepVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddep bK = bZ2.bK();
        bK.getClass();
        ddetVar.c = bK;
        ddetVar.a |= 1;
        b.s(bZ.bK());
        b.w(ddhjVar);
        this.d.g().d(b.a());
    }
}
