package defpackage;
/* compiled from: PG */
/* renamed from: cxee  reason: default package */
/* loaded from: classes.dex */
public abstract class cxee {
    public abstract cxef a();

    public abstract void b(int i);

    public final cxef c() {
        cxef a = a();
        boolean z = false;
        if (a.c() >= 0.0f && a.c() <= 1.0f) {
            z = true;
        }
        dbsk.m(z, "Probability shall be between 0 and 1.");
        return a;
    }

    public final void d(boolean z) {
        b(true != z ? 2 : 3);
    }
}
