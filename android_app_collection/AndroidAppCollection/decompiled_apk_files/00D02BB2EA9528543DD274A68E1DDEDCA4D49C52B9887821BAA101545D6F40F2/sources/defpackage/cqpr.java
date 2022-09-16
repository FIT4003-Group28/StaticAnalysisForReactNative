package defpackage;
/* compiled from: PG */
/* renamed from: cqpr  reason: default package */
/* loaded from: classes.dex */
public final class cqpr<T> {
    public final aim<Class<? extends T>, Class<? extends T>> a = new aim<>();

    public final <U extends T> void a(Class<U> cls, Class<? extends U> cls2) {
        this.a.put(cls, cls2);
    }
}
