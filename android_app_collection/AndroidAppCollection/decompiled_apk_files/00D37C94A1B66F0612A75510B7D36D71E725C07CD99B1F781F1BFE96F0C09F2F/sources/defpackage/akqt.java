package defpackage;
/* compiled from: PG */
/* renamed from: akqt  reason: default package */
/* loaded from: classes.dex */
public final class akqt {
    public final ahdi a;
    public final ahdh b;
    private final agix c;

    public akqt() {
    }

    public akqt(ahdi ahdiVar, agix agixVar, ahdh ahdhVar, byte[] bArr) {
        this.a = ahdiVar;
        this.c = agixVar;
        this.b = ahdhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akqt) {
            akqt akqtVar = (akqt) obj;
            if (this.a.equals(akqtVar.a) && this.c.equals(akqtVar.c) && this.b.equals(akqtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.b);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + String.valueOf(valueOf3).length() + "null".length());
        sb.append("CachePolicy{expiryGenerator=");
        sb.append(valueOf);
        sb.append(", keyConverter=");
        sb.append(valueOf2);
        sb.append(", costGenerator=");
        sb.append(valueOf3);
        sb.append(", cacheMissFetcher=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
