package defpackage;
/* compiled from: PG */
/* renamed from: buv  reason: default package */
/* loaded from: classes2.dex */
final class buv extends bkw {
    public buv(bks bksVar) {
        super(bksVar);
    }

    @Override // defpackage.bkw
    public final String c() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
