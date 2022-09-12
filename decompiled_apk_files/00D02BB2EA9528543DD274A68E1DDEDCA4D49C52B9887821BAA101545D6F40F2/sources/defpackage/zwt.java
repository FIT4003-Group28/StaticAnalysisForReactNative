package defpackage;
/* compiled from: PG */
/* renamed from: zwt  reason: default package */
/* loaded from: classes7.dex */
public abstract class zwt {
    public static zwt e(int i, int i2, int i3, int i4) {
        return new zsw(i, i2, i3, i4);
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public final int f(zws zwsVar) {
        return zwsVar.a() ? zwsVar.b() ? d() : c() : zwsVar.b() ? b() : a();
    }
}
