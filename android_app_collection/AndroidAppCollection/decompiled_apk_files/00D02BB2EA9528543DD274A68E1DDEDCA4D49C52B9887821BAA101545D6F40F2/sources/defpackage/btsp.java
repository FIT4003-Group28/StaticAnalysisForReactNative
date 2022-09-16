package defpackage;
/* compiled from: PG */
/* renamed from: btsp  reason: default package */
/* loaded from: classes.dex */
public final class btsp<T> implements dxio<T> {
    final dbty<T> a;
    volatile transient boolean b;
    transient T c;

    public btsp(dbty<T> dbtyVar) {
        this.a = dbtyVar;
    }

    public static <T> btsp<T> b(dbty<T> dbtyVar) {
        dbsk.s(dbtyVar);
        return new btsp<>(dbtyVar);
    }

    public static <T> btsp<T> c(T t) {
        return b(dbud.b(t));
    }

    @Override // defpackage.dxio
    public final T a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    T a = this.a.a();
                    this.c = a;
                    this.b = true;
                    return a;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("LazySingleton.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
