package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: accl  reason: default package */
/* loaded from: classes2.dex */
class accl implements acci {
    private final aceh a;
    private final int b;
    private final jic c;
    private final acck d;
    private final boolean e;

    public accl(aceh acehVar, int i, acck acckVar, boolean z) {
        this.a = acehVar;
        this.b = i;
        this.d = acckVar;
        this.e = z;
        this.c = new jic(ckqc.FIFE.a(acehVar.b().h, 512, 512, ImageView.ScaleType.CENTER_CROP), ckqc.FULLY_QUALIFIED, 0);
    }

    @Override // defpackage.acci
    public String a() {
        return this.a.a();
    }

    @Override // defpackage.acci
    public jic b() {
        return this.c;
    }

    @Override // defpackage.acci
    public cqkl c(cjqm cjqmVar) {
        this.d.f(this.a);
        return cqkl.a;
    }

    @Override // defpackage.acci
    public cjtd d() {
        cjta b = cjtd.b();
        b.i(this.b);
        b.d = dtye.t;
        if (this.a.d().a()) {
            ddes bZ = ddet.D.bZ();
            ddhq bZ2 = ddhr.c.bZ();
            int intValue = this.a.d().b().intValue();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddhr ddhrVar = (ddhr) bZ2.b;
            ddhrVar.a |= 1;
            ddhrVar.b = intValue;
            ddhr bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddet ddetVar = (ddet) bZ.b;
            bK.getClass();
            ddetVar.l = bK;
            ddetVar.a |= 512;
            b.s(bZ.bK());
        }
        return b.a();
    }

    @Override // defpackage.acci
    public Boolean e() {
        return Boolean.valueOf(this.e);
    }
}
