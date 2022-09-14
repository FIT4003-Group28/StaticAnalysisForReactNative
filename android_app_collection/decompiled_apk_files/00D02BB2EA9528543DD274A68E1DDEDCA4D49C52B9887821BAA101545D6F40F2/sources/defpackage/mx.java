package defpackage;

import java.util.Objects;
/* compiled from: PG */
/* renamed from: mx  reason: default package */
/* loaded from: classes7.dex */
public final class mx<F, S> {
    public final F a;
    public final S b;

    public mx(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mx)) {
            return false;
        }
        mx mxVar = (mx) obj;
        return Objects.equals(mxVar.a, this.a) && Objects.equals(mxVar.b, this.b);
    }

    public final int hashCode() {
        F f = this.a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
