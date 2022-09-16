package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amph  reason: default package */
/* loaded from: classes.dex */
public final class amph implements Serializable, ampg {
    private static final long serialVersionUID = 0;
    private final Object a = null;

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        return null;
    }

    @Override // defpackage.ampg
    public final boolean equals(Object obj) {
        if (obj instanceof amph) {
            Object obj2 = ((amph) obj).a;
            return akzj.f(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("null".length() + 20);
        sb.append("Functions.constant(");
        sb.append("null");
        sb.append(")");
        return sb.toString();
    }
}
