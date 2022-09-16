package defpackage;
/* compiled from: PG */
/* renamed from: bvwr  reason: default package */
/* loaded from: classes4.dex */
public abstract class bvwr<T> implements bvwd {
    private final Class<T> a;

    /* JADX INFO: Access modifiers changed from: protected */
    public bvwr(Class<T> cls) {
        this.a = cls;
    }

    public abstract void a(T t);

    @Override // defpackage.bvwd
    public final void b(Object obj) {
        if (this.a.isInstance(obj)) {
            a(this.a.cast(obj));
        }
    }
}
