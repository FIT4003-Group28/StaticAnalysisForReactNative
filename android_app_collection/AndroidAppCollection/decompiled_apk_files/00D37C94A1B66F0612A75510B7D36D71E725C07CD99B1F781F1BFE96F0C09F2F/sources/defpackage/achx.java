package defpackage;
/* compiled from: PG */
/* renamed from: achx  reason: default package */
/* loaded from: classes.dex */
final class achx implements akev {
    final /* synthetic */ acid a;

    public achx(acid acidVar) {
        this.a = acidVar;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfq akfqVar = (akfq) obj;
        if (i != 4) {
            acid acidVar = this.a;
            if (acidVar.aj.i()) {
                ylx.n(acidVar, acidVar.ao.a.b(new aapz(12), anjk.a), zbx.p, zbx.q);
            } else {
                acidVar.an.edit().putBoolean("PREF_HAS_SEEN_ORIENTATION_TOOLTIP", true).apply();
            }
        }
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        akfq akfqVar = (akfq) obj;
    }
}
