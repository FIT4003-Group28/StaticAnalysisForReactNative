package defpackage;
/* compiled from: PG */
/* renamed from: uop  reason: default package */
/* loaded from: classes4.dex */
public final class uop {
    public final uor a;
    public final uor b;
    public final amuk c;
    private final vgu d;

    public uop() {
    }

    public uop(uor uorVar, uor uorVar2, vgu vguVar, amuk amukVar, byte[] bArr) {
        this.a = uorVar;
        this.b = uorVar2;
        this.d = vguVar;
        this.c = amukVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uop) {
            uop uopVar = (uop) obj;
            if (this.a.equals(uopVar.a) && this.b.equals(uopVar.b) && this.d.equals(uopVar.d)) {
                amuk amukVar = this.c;
                amuk amukVar2 = uopVar.c;
                if (amukVar != null ? amxp.v(amukVar, amukVar2) : amukVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        amuk amukVar = this.c;
        return hashCode ^ (amukVar == null ? 0 : amukVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 100 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("ImageModelLoader{imageRetriever=");
        sb.append(valueOf);
        sb.append(", secondaryImageRetriever=");
        sb.append(valueOf2);
        sb.append(", defaultImageRetriever=");
        sb.append(valueOf3);
        sb.append(", postProcessors=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
