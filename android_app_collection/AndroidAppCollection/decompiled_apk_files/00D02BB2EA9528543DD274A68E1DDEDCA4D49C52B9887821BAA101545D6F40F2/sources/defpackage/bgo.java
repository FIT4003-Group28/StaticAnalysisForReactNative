package defpackage;
/* compiled from: PG */
/* renamed from: bgo  reason: default package */
/* loaded from: classes3.dex */
final class bgo extends bt {
    public bgo(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bt
    public final String d() {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
}
