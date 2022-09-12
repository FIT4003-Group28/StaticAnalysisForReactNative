package defpackage;
/* compiled from: PG */
/* renamed from: bgr  reason: default package */
/* loaded from: classes3.dex */
final class bgr extends bt {
    public bgr(bn bnVar) {
        super(bnVar);
    }

    @Override // defpackage.bt
    public final String d() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
