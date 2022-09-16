package defpackage;
/* compiled from: PG */
/* renamed from: bus  reason: default package */
/* loaded from: classes2.dex */
final class bus extends bkw {
    public bus(bks bksVar) {
        super(bksVar);
    }

    @Override // defpackage.bkw
    public final String c() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
