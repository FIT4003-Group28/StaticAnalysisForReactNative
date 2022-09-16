package defpackage;
/* compiled from: PG */
/* renamed from: ilo  reason: default package */
/* loaded from: classes3.dex */
public final class ilo {
    public final avvb a;
    public final avvb b;

    public ilo() {
    }

    public ilo(avvb avvbVar, avvb avvbVar2) {
        this.a = avvbVar;
        this.b = avvbVar2;
    }

    public static ilo a(aajp aajpVar) {
        return new ilo(b(aajpVar.b), b(aajpVar.c));
    }

    private static avvb b(aajj aajjVar) {
        if (aajjVar instanceof avvb) {
            return (avvb) aajjVar;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ilo) {
            ilo iloVar = (ilo) obj;
            avvb avvbVar = this.a;
            if (avvbVar != null ? avvbVar.equals(iloVar.a) : iloVar.a == null) {
                avvb avvbVar2 = this.b;
                avvb avvbVar3 = iloVar.b;
                if (avvbVar2 != null ? avvbVar2.equals(avvbVar3) : avvbVar3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        avvb avvbVar = this.a;
        int i = 0;
        int hashCode = ((avvbVar == null ? 0 : avvbVar.hashCode()) ^ 1000003) * 1000003;
        avvb avvbVar2 = this.b;
        if (avvbVar2 != null) {
            i = avvbVar2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(valueOf2).length());
        sb.append("UploadStatusEntityPair{previousEntity=");
        sb.append(valueOf);
        sb.append(", currentEntity=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
