package defpackage;
/* compiled from: PG */
/* renamed from: aabk  reason: default package */
/* loaded from: classes.dex */
public final class aabk {
    private final Object a;

    private aabk(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    public static aabk a(Object obj) {
        return new aabk(obj);
    }

    public Object b() {
        return this.a;
    }
}
