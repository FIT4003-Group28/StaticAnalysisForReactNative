package defpackage;
/* compiled from: PG */
/* renamed from: buw  reason: default package */
/* loaded from: classes2.dex */
final class buw extends bkw {
    public buw(bks bksVar) {
        super(bksVar);
    }

    @Override // defpackage.bkw
    public final String c() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
