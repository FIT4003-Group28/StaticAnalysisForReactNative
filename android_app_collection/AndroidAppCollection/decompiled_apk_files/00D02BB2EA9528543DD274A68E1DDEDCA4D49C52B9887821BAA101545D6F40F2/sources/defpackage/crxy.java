package defpackage;
/* compiled from: PG */
/* renamed from: crxy  reason: default package */
/* loaded from: classes.dex */
public final class crxy {
    public final String a;
    public final cryd b;

    public crxy(String str, cryd crydVar) {
        this.a = str;
        this.b = crydVar;
        if (!cxot.a(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "baseUrl is not a fife Url: ".concat(valueOf) : new String("baseUrl is not a fife Url: "));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof crxy) {
            crxy crxyVar = (crxy) obj;
            if (this.b.equals(crxyVar.b) && this.a.equals(crxyVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(valueOf).length());
        sb.append("FifeModel{baseUrl='");
        sb.append(str);
        sb.append('\'');
        sb.append(", fifeUrlOptions=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
