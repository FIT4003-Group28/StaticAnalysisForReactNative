package defpackage;
/* compiled from: PG */
/* renamed from: dyfl  reason: default package */
/* loaded from: classes6.dex */
public final class dyfl {
    public final dyfk a;
    public final dyjb b;

    public dyfl(dyfk dyfkVar, dyjb dyjbVar) {
        dbsk.t(dyfkVar, "state is null");
        this.a = dyfkVar;
        dbsk.t(dyjbVar, "status is null");
        this.b = dyjbVar;
    }

    public static dyfl a(dyfk dyfkVar) {
        dbsk.b(dyfkVar != dyfk.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new dyfl(dyfkVar, dyjb.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dyfl)) {
            return false;
        }
        dyfl dyflVar = (dyfl) obj;
        return this.a.equals(dyflVar.a) && this.b.equals(dyflVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        if (this.b.i()) {
            return this.a.toString();
        }
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
