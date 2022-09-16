package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: axzm  reason: default package */
/* loaded from: classes2.dex */
public final class axzm {
    public final String a;
    public final axzk b;
    public final long c;
    public final axzw d;
    public final axzw e;

    private axzm(String str, axzk axzkVar, long j, axzw axzwVar, axzw axzwVar2) {
        this.a = str;
        axzkVar.getClass();
        this.b = axzkVar;
        this.c = j;
        this.d = null;
        this.e = axzwVar2;
    }

    public /* synthetic */ axzm(String str, axzk axzkVar, long j, axzw axzwVar, axzw axzwVar2, axzl axzlVar) {
        this(str, axzkVar, j, null, axzwVar2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof axzm) {
            axzm axzmVar = (axzm) obj;
            if (akzj.f(this.a, axzmVar.a) && akzj.f(this.b, axzmVar.b) && this.c == axzmVar.c && akzj.f(this.d, axzmVar.d) && akzj.f(this.e, axzmVar.e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e});
    }

    public String toString() {
        ampp c = akzj.c(this);
        c.b("description", this.a);
        c.b("severity", this.b);
        c.f("timestampNanos", this.c);
        c.b("channelRef", this.d);
        c.b("subchannelRef", this.e);
        return c.toString();
    }
}
