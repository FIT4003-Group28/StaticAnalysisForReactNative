package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: crwr  reason: default package */
/* loaded from: classes5.dex */
final class crwr extends crwy {
    public String a;
    public crts b;
    public Uri c;
    private int d;

    public crwr() {
    }

    public crwr(crwz crwzVar) {
        crws crwsVar = (crws) crwzVar;
        this.a = crwsVar.a;
        this.b = crwsVar.b;
        this.c = crwsVar.c;
        this.d = crwsVar.d;
    }

    @Override // defpackage.crwy
    public final void b(int i) {
        this.d = i;
    }

    @Override // defpackage.crwy
    public final crwz a() {
        String str = this.a == null ? " gpuMediaId" : "";
        if (this.b == null) {
            str = str.concat(" uploadOption");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" uri");
        }
        if (this.d == 0) {
            str = String.valueOf(str).concat(" mediaType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new crws(this.a, this.b, this.c, this.d);
    }
}
