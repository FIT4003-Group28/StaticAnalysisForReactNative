package defpackage;
/* compiled from: PG */
/* renamed from: clno  reason: default package */
/* loaded from: classes5.dex */
public final class clno {
    public final String a;
    public final clnn b;
    public final clnm c;
    public final clnp d;
    public final clnk e;

    public clno(String str, clnk clnkVar, clnn clnnVar, clnm clnmVar, clnp clnpVar) {
        this.a = str;
        this.b = clnnVar;
        this.c = clnmVar;
        this.d = clnpVar;
        this.e = clnkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clno)) {
            return false;
        }
        clno clnoVar = (clno) obj;
        return cmny.b(this.a, clnoVar.a) && this.e.equals(clnoVar.e) && cmny.b(this.b, clnoVar.b) && cmny.b(this.c, clnoVar.c) && cmny.b(this.d, clnoVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        clnn clnnVar = this.b;
        return (((((hashCode + (clnnVar != null ? clnnVar.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31;
    }
}
