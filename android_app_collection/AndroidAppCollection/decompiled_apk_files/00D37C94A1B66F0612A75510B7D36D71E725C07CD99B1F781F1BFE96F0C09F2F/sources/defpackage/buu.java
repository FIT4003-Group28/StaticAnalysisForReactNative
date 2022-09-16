package defpackage;
/* compiled from: PG */
/* renamed from: buu  reason: default package */
/* loaded from: classes2.dex */
final class buu extends bkw {
    public buu(bks bksVar) {
        super(bksVar);
    }

    @Override // defpackage.bkw
    public final String c() {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }
}
