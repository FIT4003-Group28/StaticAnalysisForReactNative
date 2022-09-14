package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: amry  reason: default package */
/* loaded from: classes2.dex */
public final class amry implements amri {
    private final akra a = new akra();

    @Override // defpackage.amri
    public final float a(aktc aktcVar, amrk amrkVar, akra akraVar, dmlo dmloVar) {
        for (akrk akrkVar : amrkVar.f.d) {
            List<akra> q = akrkVar.q();
            for (int i = 1; i < q.size(); i++) {
                if (akra.M(q.get(i - 1), q.get(i), akraVar, this.a) < 10000.0f) {
                    return 1.0f;
                }
            }
        }
        return 0.0f;
    }
}
