package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: amqr  reason: default package */
/* loaded from: classes.dex */
public final class amqr implements Serializable, amqo {
    private static final long serialVersionUID = 0;
    public final Object a;

    public amqr(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amqr) {
            return akzj.f(this.a, ((amqr) obj).a);
        }
        return false;
    }

    @Override // defpackage.amqo
    public final Object get() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
