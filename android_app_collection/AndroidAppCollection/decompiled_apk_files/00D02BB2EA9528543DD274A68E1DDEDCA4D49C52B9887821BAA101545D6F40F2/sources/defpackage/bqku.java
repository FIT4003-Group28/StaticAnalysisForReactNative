package defpackage;
/* compiled from: PG */
/* renamed from: bqku  reason: default package */
/* loaded from: classes4.dex */
public abstract class bqku {
    protected abstract bqla a();

    public abstract void b(bqkx bqkxVar);

    public abstract void c(bqkz bqkzVar);

    public final bqla d() {
        bqla a = a();
        boolean z = true;
        if (a.b().g() != 1) {
            if (a.a().d() == dqgr.DRAFT) {
                z = false;
            }
            dbsk.m(z, "savedDraftReviewUsage can be set to a non-unknown value only when the request deals with a published review.");
        }
        return a;
    }
}
