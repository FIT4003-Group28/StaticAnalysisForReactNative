package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bqkw  reason: default package */
/* loaded from: classes4.dex */
public abstract class bqkw {
    protected abstract bqkx a();

    public abstract void b(List<dreq> list);

    public abstract void c(akqi akqiVar);

    public abstract void d(dqgr dqgrVar);

    public abstract void e(String str);

    public abstract void f(int i);

    public abstract void g(eapy eapyVar);

    public final bqkx h() {
        bqkx a = a();
        boolean z = true;
        dbsk.n(a.b() >= 0 && a.b() <= 5, "starRating must be in [0..5]: %s", a.b());
        if (!a.c().isEmpty() || a.b() > 0) {
            if (dqgr.DRAFT.equals(a.d())) {
                dbsk.m(!a.c().isEmpty(), "reviewText must be non-empty when saving a draft.");
            } else {
                if (a.b() <= 0) {
                    z = false;
                }
                dbsk.m(z, "starRating must be non-zero when publishing a review.");
            }
        }
        return a;
    }
}
