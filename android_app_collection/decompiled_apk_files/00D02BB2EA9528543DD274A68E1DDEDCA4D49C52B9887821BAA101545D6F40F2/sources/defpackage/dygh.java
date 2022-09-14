package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dygh  reason: default package */
/* loaded from: classes6.dex */
public final class dygh {
    public final String a;
    public final dygg b;
    public final long c;
    @dzsi
    public final dygs d;
    @dzsi
    public final dygs e;

    public dygh(String str, dygg dyggVar, long j, @dzsi dygs dygsVar) {
        this.a = str;
        dbsk.t(dyggVar, "severity");
        this.b = dyggVar;
        this.c = j;
        this.d = null;
        this.e = dygsVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dygh) {
            dygh dyghVar = (dygh) obj;
            if (dbsd.a(this.a, dyghVar.a) && dbsd.a(this.b, dyghVar.b) && this.c == dyghVar.c) {
                dygs dygsVar = dyghVar.d;
                if (dbsd.a(null, null) && dbsd.a(this.e, dyghVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), null, this.e});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("description", this.a);
        b.b("severity", this.b);
        b.g("timestampNanos", this.c);
        b.b("channelRef", null);
        b.b("subchannelRef", this.e);
        return b.toString();
    }
}
