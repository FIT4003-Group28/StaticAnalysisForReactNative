package defpackage;
/* compiled from: PG */
/* renamed from: cpwb  reason: default package */
/* loaded from: classes5.dex */
public final class cpwb implements cpve {
    final /* synthetic */ cpve a;
    final /* synthetic */ cpve b;

    public cpwb(cpve cpveVar, cpve cpveVar2) {
        this.a = cpveVar;
        this.b = cpveVar2;
    }

    @Override // defpackage.cpve
    public final /* bridge */ /* synthetic */ Object a(Object obj, int i, cpvi cpviVar) {
        Double d = (Double) this.a.a(obj, i, cpviVar);
        double d2 = dcyn.a;
        Double valueOf = Double.valueOf(d == null ? 0.0d : d.doubleValue());
        Double d3 = (Double) this.b.a(obj, i, cpviVar);
        if (d3 != null) {
            d2 = d3.doubleValue();
        }
        return Double.valueOf(valueOf.doubleValue() + Double.valueOf(d2).doubleValue());
    }
}
