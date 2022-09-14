package defpackage;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
/* compiled from: PG */
/* renamed from: cyin  reason: default package */
/* loaded from: classes5.dex */
final class cyin extends cylu {
    private final cyhg a;
    private final cych b;
    private final ClientVersion c;
    private final ClientConfigInternal d;

    public cyin(cyhg cyhgVar, cych cychVar, ClientVersion clientVersion, ClientConfigInternal clientConfigInternal) {
        this.a = cyhgVar;
        this.b = cychVar;
        this.c = clientVersion;
        this.d = clientConfigInternal;
    }

    @Override // defpackage.cylu
    public final cyhg a() {
        return this.a;
    }

    @Override // defpackage.cylu
    public final cych b() {
        return this.b;
    }

    @Override // defpackage.cylu
    public final ClientVersion c() {
        return this.c;
    }

    @Override // defpackage.cylu
    public final ClientConfigInternal d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cylu) {
            cylu cyluVar = (cylu) obj;
            if (this.a.equals(cyluVar.a()) && this.b.equals(cyluVar.b()) && this.c.equals(cyluVar.c()) && this.d.equals(cyluVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 76 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("RequestMetadata{authenticator=");
        sb.append(valueOf);
        sb.append(", accountData=");
        sb.append(valueOf2);
        sb.append(", clientVersion=");
        sb.append(valueOf3);
        sb.append(", clientConfig=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
