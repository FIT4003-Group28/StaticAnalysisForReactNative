package defpackage;
/* compiled from: PG */
/* renamed from: cxdf  reason: default package */
/* loaded from: classes.dex */
public abstract class cxdf {
    public abstract cxdg a();

    public abstract void b(int i);

    public final cxdg c() {
        cxdg a = a();
        boolean z = true;
        dbsk.m(a.a() >= 0, "Rate limit per second must be >= 0");
        if (a.c() <= 0.0f || a.c() > 1.0f) {
            z = false;
        }
        dbsk.m(z, "Sampling Probability shall be > 0 and <= 1");
        return a;
    }

    public final void d(boolean z) {
        b(true != z ? 2 : 3);
    }
}
