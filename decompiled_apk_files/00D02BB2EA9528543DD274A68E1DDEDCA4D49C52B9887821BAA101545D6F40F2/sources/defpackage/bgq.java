package defpackage;
/* compiled from: PG */
/* renamed from: bgq  reason: default package */
/* loaded from: classes3.dex */
final class bgq extends bt {
    public bgq(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bt
    public final String d() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
