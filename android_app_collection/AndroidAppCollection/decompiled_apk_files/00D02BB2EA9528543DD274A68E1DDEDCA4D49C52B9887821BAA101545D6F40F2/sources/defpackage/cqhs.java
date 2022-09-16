package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cqhs  reason: default package */
/* loaded from: classes.dex */
public final class cqhs {
    final Class<?> a;
    public final Object[] b;

    public cqhs(Class<?> cls, Object... objArr) {
        this.a = cls;
        this.b = (Object[]) dbsk.s(objArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cqhs) {
            cqhs cqhsVar = (cqhs) obj;
            return this.a.equals(cqhsVar.a) && Arrays.deepEquals(this.b, cqhsVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Arrays.deepHashCode(this.b) * 31);
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(this.a);
        String deepToString = Arrays.deepToString(this.b);
        int length = String.valueOf(simpleName).length();
        StringBuilder sb = new StringBuilder(length + 17 + String.valueOf(valueOf).length() + String.valueOf(deepToString).length());
        sb.append(simpleName);
        sb.append("{class: ");
        sb.append(valueOf);
        sb.append(", args: ");
        sb.append(deepToString);
        sb.append("}");
        return sb.toString();
    }
}
