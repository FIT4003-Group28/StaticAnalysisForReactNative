package defpackage;
/* compiled from: PG */
/* renamed from: brob  reason: default package */
/* loaded from: classes4.dex */
public abstract class brob {
    public static final brob a = d(1, 0);

    public static brob c(boolean z, float f, int i) {
        return d(!z ? 2 : f == 0.0f ? 3 : ((double) f) < 0.9d ? 4 : f < 1.0f ? 5 : 6, i);
    }

    public static brob d(int i, int i2) {
        return new brnv(i, i2);
    }

    public abstract int a();

    public abstract int b();
}
