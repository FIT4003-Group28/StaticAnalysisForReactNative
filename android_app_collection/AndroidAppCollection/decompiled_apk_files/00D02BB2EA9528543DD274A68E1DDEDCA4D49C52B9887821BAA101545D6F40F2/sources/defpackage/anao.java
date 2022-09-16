package defpackage;
/* compiled from: PG */
/* renamed from: anao  reason: default package */
/* loaded from: classes2.dex */
final class anao extends anaw {
    public final akuc a;
    public final String b;

    public anao(akuc akucVar, String str) {
        if (akucVar != null) {
            this.a = akucVar;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null clientEi");
        }
        throw new NullPointerException("Null loggedLabelSnapshot");
    }

    @Override // defpackage.anaw
    public final akuc a() {
        return this.a;
    }

    @Override // defpackage.anaw
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anaw) {
            anaw anawVar = (anaw) obj;
            if (this.a.equals(anawVar.a()) && this.b.equals(anawVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + str.length());
        sb.append("ViewportLogReference{loggedLabelSnapshot=");
        sb.append(valueOf);
        sb.append(", clientEi=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
