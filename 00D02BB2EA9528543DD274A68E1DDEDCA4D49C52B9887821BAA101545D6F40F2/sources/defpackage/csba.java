package defpackage;
/* compiled from: PG */
/* renamed from: csba  reason: default package */
/* loaded from: classes5.dex */
final class csba extends csbz {
    public csba() {
        super("ROTATION EXIT");
    }

    public static final float d(float f) {
        float f2 = f % 6.2831855f;
        return f2 < 0.0f ? f2 + 6.2831855f : f2;
    }

    @Override // defpackage.csbz
    public final void a(csci csciVar) {
        if (!csbz.j(csciVar)) {
            csciVar.d(12.0f);
        }
    }

    @Override // defpackage.csbz
    public final boolean b(long j, long j2, csci csciVar) {
        if (!csbz.j(csciVar)) {
            if (!csbz.h(csciVar)) {
                float e = csciVar.e();
                float d = d(2.7488937f - (csciVar.b.d() + e));
                float d2 = d(2.7488937f - (csciVar.c.d() + e));
                float d3 = d((-0.3926991f) - (csciVar.d.d() + e));
                if (d > d((-0.3926991f) - (csciVar.e.d() + e)) && d3 > d2 && d < 4.712389f && d3 < 4.712389f) {
                    csciVar.j();
                    csciVar.f();
                    csbz.g(csciVar);
                }
                return true;
            }
            o(csciVar, j2);
            if (!csbz.j(csciVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.csbz
    public final void c(csci csciVar) {
        if (!csbz.h(csciVar)) {
            csciVar.j();
            csciVar.f();
            csbz.g(csciVar);
        }
    }
}
