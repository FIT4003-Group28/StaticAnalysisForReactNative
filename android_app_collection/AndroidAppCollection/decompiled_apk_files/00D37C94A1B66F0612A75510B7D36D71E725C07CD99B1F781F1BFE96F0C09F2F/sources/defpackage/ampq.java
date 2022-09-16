package defpackage;

import java.io.Serializable;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ampq  reason: default package */
/* loaded from: classes.dex */
public abstract class ampq implements Serializable {
    private static final long serialVersionUID = 0;

    public static ampq i(Object obj) {
        return obj == null ? amon.a : new ampv(obj);
    }

    public static ampq j(Object obj) {
        obj.getClass();
        return new ampv(obj);
    }

    public abstract ampq a(ampq ampqVar);

    public abstract ampq b(ampg ampgVar);

    public abstract Object c();

    public abstract Object d(amqo amqoVar);

    public abstract Object e(Object obj);

    public abstract boolean equals(Object obj);

    public abstract Object f();

    public abstract Set g();

    public abstract boolean h();

    public abstract int hashCode();
}
