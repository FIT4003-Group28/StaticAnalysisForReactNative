package defpackage;
/* compiled from: PG */
/* renamed from: bdbl  reason: default package */
/* loaded from: classes3.dex */
public final class bdbl implements bdai {
    private final dcdc<bdah> a;

    private bdbl(dcdc<bdah> dcdcVar) {
        this.a = dcdcVar;
    }

    public static bdai b(dcdc<bdah> dcdcVar) {
        return new bdbl(dcdcVar);
    }

    @Override // defpackage.bdai
    public final dcdc<jbt> a(bczw bczwVar) {
        dccx F = dcdc.F();
        dcdc<bdah> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            jbt a = dcdcVar.get(i).a(bczwVar);
            if (a != null) {
                F.g(a);
            }
        }
        return F.f();
    }
}
