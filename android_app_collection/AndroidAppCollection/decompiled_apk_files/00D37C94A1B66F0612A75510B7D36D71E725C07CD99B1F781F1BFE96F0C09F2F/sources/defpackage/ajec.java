package defpackage;
/* compiled from: PG */
/* renamed from: ajec  reason: default package */
/* loaded from: classes.dex */
public final class ajec {
    public final asaa a;
    public final apzg b;
    public final arzs c;
    public final atzm d;
    private final azqb e;
    private final String f;

    public ajec() {
    }

    public ajec(azqb azqbVar, String str, asaa asaaVar, apzg apzgVar, arzs arzsVar, atzm atzmVar) {
        this.e = azqbVar;
        this.f = str;
        this.a = asaaVar;
        this.b = apzgVar;
        this.c = arzsVar;
        this.d = atzmVar;
    }

    public final boolean a() {
        return ((Boolean) this.e.get()).booleanValue();
    }

    public final boolean equals(Object obj) {
        asaa asaaVar;
        apzg apzgVar;
        arzs arzsVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajec) {
            ajec ajecVar = (ajec) obj;
            if (this.e.equals(ajecVar.e) && this.f.equals(ajecVar.f) && ((asaaVar = this.a) != null ? asaaVar.equals(ajecVar.a) : ajecVar.a == null) && ((apzgVar = this.b) != null ? apzgVar.equals(ajecVar.b) : ajecVar.b == null) && ((arzsVar = this.c) != null ? arzsVar.equals(ajecVar.c) : ajecVar.c == null)) {
                atzm atzmVar = this.d;
                atzm atzmVar2 = ajecVar.d;
                if (atzmVar != null ? atzmVar.equals(atzmVar2) : atzmVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003;
        asaa asaaVar = this.a;
        int i = 0;
        int hashCode2 = (hashCode ^ (asaaVar == null ? 0 : asaaVar.hashCode())) * 1000003;
        apzg apzgVar = this.b;
        int hashCode3 = (hashCode2 ^ (apzgVar == null ? 0 : apzgVar.hashCode())) * 1000003;
        arzs arzsVar = this.c;
        int hashCode4 = (hashCode3 ^ (arzsVar == null ? 0 : arzsVar.hashCode())) * 1000003;
        atzm atzmVar = this.d;
        if (atzmVar != null) {
            i = atzmVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.e);
        String str = this.f;
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(this.b);
        String valueOf4 = String.valueOf(this.c);
        String valueOf5 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 153 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ModularHeartbeatResponseContext{isDeadProvider=");
        sb.append(valueOf);
        sb.append(", videoId=");
        sb.append(str);
        sb.append(", playabilityStatus=");
        sb.append(valueOf2);
        sb.append(", videoTransitionEndpoint=");
        sb.append(valueOf3);
        sb.append(", heartbeatAttestationConfig=");
        sb.append(valueOf4);
        sb.append(", playerAttestation=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
