package defpackage;
/* compiled from: PG */
/* renamed from: aakd  reason: default package */
/* loaded from: classes.dex */
public final class aakd {
    public static final aakd a = a().a();
    public final aajj b;
    public final aajk c;
    public final aorw d;

    public aakd() {
    }

    public aakd(aajj aajjVar, aajk aajkVar, aorw aorwVar) {
        this.b = aajjVar;
        this.c = aajkVar;
        this.d = aorwVar;
    }

    public static aakc a() {
        aakc aakcVar = new aakc();
        aakcVar.c(aajk.a);
        aakcVar.b(aajz.a);
        return aakcVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aakd) {
            aakd aakdVar = (aakd) obj;
            aajj aajjVar = this.b;
            if (aajjVar != null ? aajjVar.equals(aakdVar.b) : aakdVar.b == null) {
                if (this.c.equals(aakdVar.c) && this.d.equals(aakdVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        aajj aajjVar = this.b;
        return (((((aajjVar == null ? 0 : aajjVar.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("InternalEntityWrapper{wrappedEntity=");
        sb.append(valueOf);
        sb.append(", metadata=");
        sb.append(valueOf2);
        sb.append(", applicability=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
