package defpackage;
/* compiled from: PG */
/* renamed from: aiem  reason: default package */
/* loaded from: classes2.dex */
public final class aiem extends aiej {
    private Double a;

    public aiem() {
    }

    public aiem(aiek aiekVar) {
        this.a = Double.valueOf(((aien) aiekVar).a);
    }

    @Override // defpackage.aiej
    public final void b(double d) {
        this.a = Double.valueOf(d);
    }

    @Override // defpackage.aiej
    public final aiek a() {
        String str = this.a == null ? " accuracyInMeters" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new aien(this.a.doubleValue());
    }
}
