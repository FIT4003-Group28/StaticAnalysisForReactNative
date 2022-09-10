package defpackage;
/* compiled from: PG */
/* renamed from: csay  reason: default package */
/* loaded from: classes5.dex */
final class csay extends csbz {
    public csay() {
        super("THINKING");
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        csbz.r(csciVar);
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        float e;
        float f;
        float e2 = csbz.e(j, j2, 6000L) - ((int) e);
        csch cschVar = csciVar.b;
        csch cschVar2 = csciVar.c;
        csch cschVar3 = csciVar.d;
        csch cschVar4 = csciVar.e;
        if (e2 < 0.16749999f) {
            cschVar.c(4.712389f);
            cschVar2.c(0.0f);
            cschVar3.c(1.5707964f);
            cschVar4.c(3.1415927f);
        } else {
            double d = e2;
            if (d < 0.25d) {
                cschVar.c(4.712389f);
                cschVar2.c(1.5707964f);
                cschVar3.c(2.6179938f);
                cschVar4.c(3.6651917f);
            } else if (e2 < 0.4175f) {
                cschVar.c(0.0f);
                cschVar2.c(1.5707964f);
                cschVar3.c(3.1415927f);
                cschVar4.c(4.712389f);
            } else if (d < 0.5d) {
                cschVar.c(0.5235988f);
                cschVar2.c(1.5707964f);
                cschVar3.c(4.712389f);
                cschVar4.c(5.759587f);
            } else if (e2 < 0.6675f) {
                cschVar.c(1.5707964f);
                cschVar2.c(3.1415927f);
                cschVar3.c(4.712389f);
                cschVar4.c(0.0f);
            } else if (d < 0.75d) {
                cschVar.c(2.6179938f);
                cschVar2.c(3.6651917f);
                cschVar3.c(4.712389f);
                cschVar4.c(1.5707964f);
            } else if (e2 < 0.9175f) {
                cschVar.c(3.1415927f);
                cschVar2.c(4.712389f);
                cschVar3.c(0.0f);
                cschVar4.c(1.5707964f);
            } else if (e2 < 1.0f) {
                cschVar.c(4.712389f);
                cschVar2.c(5.759587f);
                cschVar3.c(0.5235988f);
                cschVar4.c(1.5707964f);
            }
            f = 2.0f;
            csciVar.d(f * 3.0f);
            return true;
        }
        f = 1.0f;
        csciVar.d(f * 3.0f);
        return true;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        csciVar.h(csciVar.b, 0.0f);
        float f = csciVar.b.f();
        float f2 = csciVar.c.f();
        float f3 = csciVar.d.f();
        float f4 = f3 - f2;
        float f5 = csciVar.e.f() - f3;
        if (f2 - f > 1.5707964f) {
            csciVar.h(csciVar.c, 0.0f);
        } else if (f4 > 1.5707964f) {
            csciVar.h(csciVar.d, 1.5707964f);
        } else if (f5 <= 1.5707964f) {
            csciVar.h(csciVar.b, 4.712389f);
        } else {
            csciVar.h(csciVar.e, 3.1415927f);
        }
        csciVar.b.c(4.712389f);
        csciVar.c.c(0.0f);
        csciVar.d.c(1.5707964f);
        csciVar.e.c(3.1415927f);
    }
}
