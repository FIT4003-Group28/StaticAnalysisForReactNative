package defpackage;
/* compiled from: PG */
/* renamed from: bgn  reason: default package */
/* loaded from: classes3.dex */
final class bgn extends bt {
    public bgn(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bt
    public final String d() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
