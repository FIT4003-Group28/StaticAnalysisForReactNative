package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cqaq  reason: default package */
/* loaded from: classes5.dex */
public final class cqaq extends cqao {
    public String a;
    public Bundle b;
    public String c;

    @Override // defpackage.cqao
    public final cqap a() {
        String str = this.b == null ? " featureArguments" : "";
        if (this.c == null) {
            str = str.concat(" gsaPackageName");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cqar(this.a, this.b, this.c);
    }
}
