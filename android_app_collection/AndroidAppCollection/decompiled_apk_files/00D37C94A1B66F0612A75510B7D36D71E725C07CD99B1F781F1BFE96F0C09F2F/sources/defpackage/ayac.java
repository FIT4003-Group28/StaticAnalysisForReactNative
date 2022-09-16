package defpackage;

import io.grpc.Status;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ayac  reason: default package */
/* loaded from: classes2.dex */
public final class ayac {
    public static final ayac a = new ayac(null, Status.b, false);
    public final ayag b;
    public final Status c;
    public final boolean d;
    private final axym e = null;

    private ayac(ayag ayagVar, Status status, boolean z) {
        this.b = ayagVar;
        status.getClass();
        this.c = status;
        this.d = z;
    }

    public static ayac a(Status status) {
        aqxo.q(!status.f(), "drop status shouldn't be OK");
        return new ayac(null, status, true);
    }

    public static ayac b(Status status) {
        aqxo.q(!status.f(), "error status shouldn't be OK");
        return new ayac(null, status, false);
    }

    public static ayac c(ayag ayagVar) {
        return new ayac(ayagVar, Status.b, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ayac)) {
            return false;
        }
        ayac ayacVar = (ayac) obj;
        if (akzj.f(this.b, ayacVar.b) && akzj.f(this.c, ayacVar.c)) {
            axym axymVar = ayacVar.e;
            if (akzj.f(null, null) && this.d == ayacVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, null, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("subchannel", this.b);
        c.b("streamTracerFactory", null);
        c.b("status", this.c);
        c.g("drop", this.d);
        return c.toString();
    }
}
