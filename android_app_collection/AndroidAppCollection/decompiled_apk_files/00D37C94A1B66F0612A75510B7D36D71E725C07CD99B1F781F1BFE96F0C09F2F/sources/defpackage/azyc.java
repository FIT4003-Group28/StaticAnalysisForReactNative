package defpackage;
/* compiled from: PG */
/* renamed from: azyc  reason: default package */
/* loaded from: classes2.dex */
public abstract class azyc {
    private final aztu a;

    public azyc(byte[] bArr) {
        this.a = ayme.f(azxm.a);
    }

    public abstract Object a(Object obj);

    public abstract void b(Object obj, Object obj2);

    public final Object c(Object obj) {
        Object obj2 = this.a.a;
        if (obj2 == azxm.a) {
            obj2 = a(obj);
            boolean z = azuy.a;
            Object obj3 = this.a.a;
            if (obj3 != azxm.a) {
                obj2 = obj3;
            } else if (!this.a.c(azxm.a, obj2)) {
                obj2 = this.a.a;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public final String toString() {
        return banl.j(this) + '@' + banl.k(this);
    }

    public azyc() {
    }
}
