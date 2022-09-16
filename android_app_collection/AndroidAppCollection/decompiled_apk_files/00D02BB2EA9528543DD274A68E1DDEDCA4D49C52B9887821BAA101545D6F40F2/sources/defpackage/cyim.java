package defpackage;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
/* compiled from: PG */
/* renamed from: cyim  reason: default package */
/* loaded from: classes5.dex */
public final class cyim extends cylt {
    public ClientVersion a;
    private cyhg b;
    private cych c;
    private ClientConfigInternal d;

    @Override // defpackage.cylt
    public final void b(cych cychVar) {
        if (cychVar != null) {
            this.c = cychVar;
            return;
        }
        throw new NullPointerException("Null accountData");
    }

    @Override // defpackage.cylt
    public final void c(cyhg cyhgVar) {
        if (cyhgVar != null) {
            this.b = cyhgVar;
            return;
        }
        throw new NullPointerException("Null authenticator");
    }

    @Override // defpackage.cylt
    public final void d(ClientConfigInternal clientConfigInternal) {
        if (clientConfigInternal != null) {
            this.d = clientConfigInternal;
            return;
        }
        throw new NullPointerException("Null clientConfig");
    }

    @Override // defpackage.cylt
    public final cylu a() {
        String str = this.b == null ? " authenticator" : "";
        if (this.c == null) {
            str = str.concat(" accountData");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" clientVersion");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" clientConfig");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cyin(this.b, this.c, this.a, this.d);
    }
}
