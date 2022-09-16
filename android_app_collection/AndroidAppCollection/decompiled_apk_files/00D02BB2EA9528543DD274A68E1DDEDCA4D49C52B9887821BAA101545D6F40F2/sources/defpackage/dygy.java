package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dygy  reason: default package */
/* loaded from: classes6.dex */
public final class dygy {
    public static final dygy a = new dygy(null, dyjb.b, false);
    @dzsi
    public final dyhc b;
    public final dyjb c;
    public final boolean d;
    @dzsi
    private final dyfb e = null;

    private dygy(@dzsi dyhc dyhcVar, dyjb dyjbVar, boolean z) {
        this.b = dyhcVar;
        dbsk.t(dyjbVar, "status");
        this.c = dyjbVar;
        this.d = z;
    }

    public static dygy a(dyhc dyhcVar) {
        dbsk.t(dyhcVar, "subchannel");
        return new dygy(dyhcVar, dyjb.b, false);
    }

    public static dygy b(dyjb dyjbVar) {
        dbsk.b(!dyjbVar.i(), "error status shouldn't be OK");
        return new dygy(null, dyjbVar, false);
    }

    public static dygy c(dyjb dyjbVar) {
        dbsk.b(!dyjbVar.i(), "drop status shouldn't be OK");
        return new dygy(null, dyjbVar, true);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dygy)) {
            return false;
        }
        dygy dygyVar = (dygy) obj;
        if (dbsd.a(this.b, dygyVar.b) && dbsd.a(this.c, dygyVar.c)) {
            dyfb dyfbVar = dygyVar.e;
            if (dbsd.a(null, null) && this.d == dygyVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, null, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("subchannel", this.b);
        b.b("streamTracerFactory", null);
        b.b("status", this.c);
        b.h("drop", this.d);
        return b.toString();
    }
}
