package defpackage;
/* compiled from: PG */
/* renamed from: osk  reason: default package */
/* loaded from: classes4.dex */
public abstract class osk {
    public static osk d(int i, Object obj) {
        return new osi(Integer.valueOf(i), obj, osl.DEFAULT);
    }

    public static osk e(Object obj) {
        return new osi(null, obj, osl.VERY_LOW);
    }

    public static osk f(int i, Object obj) {
        return new osi(Integer.valueOf(i), obj, osl.VERY_LOW);
    }

    public abstract osl a();

    public abstract Integer b();

    public abstract Object c();
}
