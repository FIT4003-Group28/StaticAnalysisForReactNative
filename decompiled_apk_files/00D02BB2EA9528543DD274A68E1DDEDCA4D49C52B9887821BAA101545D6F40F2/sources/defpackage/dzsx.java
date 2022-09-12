package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dzsx  reason: default package */
/* loaded from: classes6.dex */
public final class dzsx<A, B> implements Serializable {
    public final A a;
    public final B b;

    public dzsx(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof dzsx)) {
                return false;
            }
            dzsx dzsxVar = (dzsx) obj;
            return dzvx.d(this.a, dzsxVar.a) && dzvx.d(this.b, dzsxVar.b);
        }
        return true;
    }

    public final int hashCode() {
        A a = this.a;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return '(' + this.a + ", " + this.b + ')';
    }
}
