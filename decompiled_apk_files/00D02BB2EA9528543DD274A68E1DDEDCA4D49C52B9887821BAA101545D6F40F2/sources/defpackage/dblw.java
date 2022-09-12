package defpackage;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: dblw  reason: default package */
/* loaded from: classes5.dex */
public final class dblw implements Serializable {
    private static final long serialVersionUID = -8514239465808977353L;
    public final String a;
    public final Long b;

    public dblw(String str, Date date) {
        this.a = str;
        this.b = date == null ? null : Long.valueOf(date.getTime());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dblw)) {
            return false;
        }
        dblw dblwVar = (dblw) obj;
        return Objects.equals(this.a, dblwVar.a) && Objects.equals(this.b, dblwVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("tokenValue", this.a);
        b.b("expirationTimeMillis", this.b);
        return b.toString();
    }
}
