package defpackage;
/* compiled from: PG */
/* renamed from: bgp  reason: default package */
/* loaded from: classes3.dex */
final class bgp extends bt {
    public bgp(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bt
    public final String d() {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }
}
