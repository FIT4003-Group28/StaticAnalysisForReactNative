package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: cy  reason: default package */
/* loaded from: classes5.dex */
public final class cy {
    @Deprecated
    public final cx a;
    @Deprecated
    public final cx b;

    @Deprecated
    public cy(cx cxVar, cx cxVar2) {
        if (cxVar.b == cxVar2.b) {
            this.a = cxVar;
            this.b = cxVar2;
            return;
        }
        String valueOf = String.valueOf(cxVar);
        String valueOf2 = String.valueOf(cxVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(valueOf2).length());
        sb.append("Ranges must have the same number of visible decimals: ");
        sb.append(valueOf);
        sb.append("~");
        sb.append(valueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    @Deprecated
    public final String toString() {
        String sb;
        String valueOf = String.valueOf(this.a);
        cx cxVar = this.b;
        if (cxVar == this.a) {
            sb = "";
        } else {
            String valueOf2 = String.valueOf(cxVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1);
            sb2.append("~");
            sb2.append(valueOf2);
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(sb).length());
        sb3.append(valueOf);
        sb3.append(sb);
        return sb3.toString();
    }
}
