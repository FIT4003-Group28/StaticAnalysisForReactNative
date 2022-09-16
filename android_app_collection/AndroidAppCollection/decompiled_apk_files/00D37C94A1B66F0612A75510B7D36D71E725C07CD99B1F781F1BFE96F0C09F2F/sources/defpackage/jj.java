package defpackage;

import j$.util.Objects;
/* compiled from: PG */
/* renamed from: jj  reason: default package */
/* loaded from: classes3.dex */
public final class jj {
    public final Object a;
    public final Object b;

    public jj(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jj)) {
            return false;
        }
        jj jjVar = (jj) obj;
        return Objects.equals(jjVar.a, this.a) && Objects.equals(jjVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
