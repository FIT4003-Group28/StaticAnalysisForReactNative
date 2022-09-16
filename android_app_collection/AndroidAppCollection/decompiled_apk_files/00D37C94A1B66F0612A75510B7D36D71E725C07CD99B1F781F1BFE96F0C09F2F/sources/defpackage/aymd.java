package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aymd  reason: default package */
/* loaded from: classes2.dex */
public final class aymd {
    final ayaj a;
    final Object b;

    public aymd(ayaj ayajVar, Object obj) {
        this.a = ayajVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aymd aymdVar = (aymd) obj;
            if (akzj.f(this.a, aymdVar.a) && akzj.f(this.b, aymdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("provider", this.a);
        c.b("config", this.b);
        return c.toString();
    }
}
