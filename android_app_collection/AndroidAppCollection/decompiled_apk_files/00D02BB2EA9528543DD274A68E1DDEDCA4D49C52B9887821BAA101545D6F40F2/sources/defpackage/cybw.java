package defpackage;

import com.google.android.libraries.social.populous.core.AutoValue_ClientVersion;
import com.google.android.libraries.social.populous.core.ClientVersion;
/* compiled from: PG */
/* renamed from: cybw  reason: default package */
/* loaded from: classes5.dex */
public final class cybw extends cyek {
    public String a;
    public String b;
    public String c;
    public int d;

    public cybw() {
    }

    public cybw(ClientVersion clientVersion) {
        this.a = clientVersion.a();
        this.b = clientVersion.b();
        this.c = clientVersion.c();
        this.d = clientVersion.e();
    }

    @Override // defpackage.cyek
    public final void b(@dzsi String str) {
        this.c = str;
    }

    @Override // defpackage.cyek
    public final ClientVersion a() {
        String str = this.a == null ? " clientName" : "";
        if (this.b == null) {
            str = str.concat(" clientVersion");
        }
        if (this.d == 0) {
            str = String.valueOf(str).concat(" platform");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new AutoValue_ClientVersion(this.a, this.b, this.c, this.d);
    }
}
