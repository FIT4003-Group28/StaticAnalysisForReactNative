package defpackage;
/* compiled from: PG */
/* renamed from: awme  reason: default package */
/* loaded from: classes3.dex */
public abstract class awme {
    public static final awme c = d(0, 0);

    public static awme d(int i, int i2) {
        return new awmd(i, i2);
    }

    public abstract int a();

    public abstract int b();

    public final int c() {
        return a() + b();
    }
}
