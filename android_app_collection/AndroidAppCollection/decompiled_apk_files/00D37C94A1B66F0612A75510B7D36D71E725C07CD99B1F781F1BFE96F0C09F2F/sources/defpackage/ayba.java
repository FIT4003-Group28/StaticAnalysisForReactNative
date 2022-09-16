package defpackage;

import io.grpc.Status;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ayba  reason: default package */
/* loaded from: classes2.dex */
public final class ayba {
    public final Status a;
    public final Object b;

    private ayba(Status status) {
        this.b = null;
        this.a = status;
        aqxo.u(!status.f(), "cannot use OK status: %s", status);
    }

    private ayba(Object obj) {
        this.b = obj;
        this.a = null;
    }

    public static ayba a(Object obj) {
        return new ayba(obj);
    }

    public static ayba b(Status status) {
        return new ayba(status);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ayba aybaVar = (ayba) obj;
            if (akzj.f(this.a, aybaVar.a) && akzj.f(this.b, aybaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        if (this.b != null) {
            ampp c = akzj.c(this);
            c.b("config", this.b);
            return c.toString();
        }
        ampp c2 = akzj.c(this);
        c2.b("error", this.a);
        return c2.toString();
    }
}
