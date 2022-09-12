package defpackage;
/* compiled from: PG */
/* renamed from: cwxo  reason: default package */
/* loaded from: classes.dex */
public abstract class cwxo {
    public abstract cwxp a();

    public abstract void b(int i);

    public final cwxp c() {
        cwxp a = a();
        float c = a.c();
        boolean z = false;
        if (c > 0.0f && c <= 100.0f) {
            z = true;
        }
        dbsk.b(z, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        return a;
    }

    public final void d(boolean z) {
        b(true != z ? 2 : 3);
    }
}
