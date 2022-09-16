package defpackage;
/* compiled from: PG */
/* renamed from: but  reason: default package */
/* loaded from: classes2.dex */
final class but extends bkw {
    public but(bks bksVar) {
        super(bksVar);
    }

    @Override // defpackage.bkw
    public final String c() {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
}
