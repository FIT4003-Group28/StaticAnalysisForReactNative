package defpackage;
/* compiled from: PG */
/* renamed from: aajp  reason: default package */
/* loaded from: classes.dex */
public final class aajp {
    public final String a;
    public final aajj b;
    public final aajj c;
    public final aajk d;
    public final aajo e;
    private final aajk f;

    public aajp() {
    }

    public aajp(String str, aajj aajjVar, aajj aajjVar2, aajk aajkVar, aajk aajkVar2, aajo aajoVar) {
        this.a = str;
        this.b = aajjVar;
        this.c = aajjVar2;
        this.d = aajkVar;
        this.f = aajkVar2;
        this.e = aajoVar;
    }

    public static aajn a() {
        return new aajn();
    }

    public final Class b() {
        aajj aajjVar = this.c;
        aajj aajjVar2 = this.b;
        if (aajjVar != null) {
            return aajjVar.getClass();
        }
        aajjVar2.getClass();
        return aajjVar2.getClass();
    }

    public final boolean equals(Object obj) {
        aajj aajjVar;
        aajj aajjVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aajp) {
            aajp aajpVar = (aajp) obj;
            if (this.a.equals(aajpVar.a) && ((aajjVar = this.b) != null ? aajjVar.equals(aajpVar.b) : aajpVar.b == null) && ((aajjVar2 = this.c) != null ? aajjVar2.equals(aajpVar.c) : aajpVar.c == null) && this.d.equals(aajpVar.d) && this.f.equals(aajpVar.f) && this.e.equals(aajpVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        aajj aajjVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (aajjVar == null ? 0 : aajjVar.hashCode())) * 1000003;
        aajj aajjVar2 = this.c;
        if (aajjVar2 != null) {
            i = aajjVar2.hashCode();
        }
        return ((((((hashCode2 ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.e);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 103 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("EntityUpdate{entityKey=");
        sb.append(str);
        sb.append(", previousEntity=");
        sb.append(valueOf);
        sb.append(", currentEntity=");
        sb.append(valueOf2);
        sb.append(", previousMetadata=");
        sb.append(valueOf3);
        sb.append(", currentMetadata=");
        sb.append(valueOf4);
        sb.append(", reason=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
