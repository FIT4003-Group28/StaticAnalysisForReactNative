package defpackage;
/* compiled from: PG */
/* renamed from: bgd  reason: default package */
/* loaded from: classes3.dex */
final class bgd extends bt {
    public bgd(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bt
    public final String d() {
        return "DELETE from WorkProgress where work_spec_id=?";
    }
}
