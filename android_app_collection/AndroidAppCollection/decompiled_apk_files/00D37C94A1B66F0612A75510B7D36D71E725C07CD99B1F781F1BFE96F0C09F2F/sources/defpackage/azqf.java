package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: azqf  reason: default package */
/* loaded from: classes2.dex */
public final class azqf implements Serializable {
    public final Object a;
    public final Object b;

    public azqf(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof azqf)) {
                return false;
            }
            azqf azqfVar = (azqf) obj;
            return azst.c(this.a, azqfVar.a) && azst.c(this.b, azqfVar.b);
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return '(' + this.a + ", " + this.b + ')';
    }
}
