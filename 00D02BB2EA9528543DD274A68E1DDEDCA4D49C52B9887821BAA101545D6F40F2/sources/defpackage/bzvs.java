package defpackage;
/* compiled from: PG */
/* renamed from: bzvs  reason: default package */
/* loaded from: classes4.dex */
public abstract class bzvs {
    public abstract bzvt a();

    public abstract void b(dbsg<Integer> dbsgVar);

    public final bzvt c() {
        bzvt a = a();
        if (a.a().a()) {
            boolean z = false;
            if (a.a().b().intValue() > 0 && a.a().b().intValue() <= 5) {
                z = true;
            }
            dbsk.p(z, "If present, numRatingStars must be within [1..5], but was %s", a.a().b());
        }
        return a;
    }
}
