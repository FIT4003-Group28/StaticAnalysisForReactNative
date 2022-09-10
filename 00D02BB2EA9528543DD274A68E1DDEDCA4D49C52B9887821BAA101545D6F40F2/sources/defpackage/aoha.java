package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: aoha  reason: default package */
/* loaded from: classes2.dex */
public abstract class aoha implements Serializable {
    @dzsi
    private transient String a;

    public static aoha c(aogb aogbVar, long j) {
        return new aoga(aogbVar, j);
    }

    public static aoha d(dvap dvapVar) {
        dngs dngsVar = dvapVar.b;
        if (dngsVar == null) {
            dngsVar = dngs.h;
        }
        return c(aogb.e(dngsVar), dvapVar.c);
    }

    public abstract aogb a();

    public abstract long b();

    public final String e() {
        if (this.a == null) {
            String valueOf = String.valueOf(a().m());
            long b = b();
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append(valueOf);
            sb.append("@");
            sb.append(b);
            this.a = sb.toString();
        }
        return this.a;
    }

    public final String toString() {
        return e();
    }
}
