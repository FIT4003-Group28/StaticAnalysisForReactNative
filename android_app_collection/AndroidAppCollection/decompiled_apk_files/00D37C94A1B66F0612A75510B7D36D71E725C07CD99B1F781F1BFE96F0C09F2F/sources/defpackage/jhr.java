package defpackage;
/* compiled from: PG */
/* renamed from: jhr  reason: default package */
/* loaded from: classes3.dex */
public final class jhr {
    public final String a;
    public final jic b;
    public final ayqb c;

    public jhr(String str, jic jicVar, ayqb ayqbVar) {
        if (str != null) {
            this.a = str;
            this.b = jicVar;
            this.c = ayqbVar;
            return;
        }
        throw new NullPointerException("Null outputEntityKey");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jhr) {
            jhr jhrVar = (jhr) obj;
            if (this.a.equals(jhrVar.a) && this.b.equals(jhrVar.b) && this.c.equals(jhrVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 78 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("TransformationWrapper{outputEntityKey=");
        sb.append(str);
        sb.append(", transformer=");
        sb.append(valueOf);
        sb.append(", transformationFunction=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public jhr() {
    }
}
