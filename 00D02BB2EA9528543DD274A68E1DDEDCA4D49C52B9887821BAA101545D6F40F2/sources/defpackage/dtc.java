package defpackage;
/* compiled from: PG */
/* renamed from: dtc  reason: default package */
/* loaded from: classes6.dex */
public class dtc {
    public final ahjq a;
    public final dta b;
    private final btvo c;
    private final czkm<dsw> d;
    private final dehq e;

    public dtc(btvo btvoVar, ahjq ahjqVar, czkm<dsw> czkmVar, dehq dehqVar, dta dtaVar) {
        this.c = btvoVar;
        this.a = ahjqVar;
        this.d = czkmVar;
        this.e = dehqVar;
        this.b = dtaVar;
    }

    public final void a(dqkc dqkcVar) {
        dknv dknvVar = this.c.getAugmentedRealityParameters().a;
        if (dknvVar == null) {
            dknvVar = dknv.v;
        }
        if (!dknvVar.h) {
            return;
        }
        deha.q(this.d.b(), new dtb(this, dqkcVar), this.e);
    }
}
