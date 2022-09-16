package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ues  reason: default package */
/* loaded from: classes4.dex */
public final class ues {
    public final Context a;
    private final ucj b;
    private final snc c;
    private final ufv d;
    private final ufu e;
    private final uhe f;
    private final uee g;

    public ues(Context context, ucj ucjVar, snc sncVar, ufv ufvVar, ufu ufuVar, uhe uheVar, uee ueeVar) {
        this.a = context;
        this.b = ucjVar;
        this.c = sncVar;
        this.d = ufvVar;
        this.e = ufuVar;
        this.f = uheVar;
        this.g = ueeVar;
    }

    public final uep a(aojw aojwVar) {
        return new ueu(this, this.c, aojwVar, 0, null, this.b, this.d, this.e, this.f, this.g);
    }

    public final uep b(aojs aojsVar) {
        return new ueu(this, this.c, null, 0, aojsVar, this.b, this.d, this.e, this.f, this.g);
    }

    public final uep c(int i) {
        return new ueu(this, this.c, null, i, null, this.b, this.d, this.e, this.f, this.g);
    }
}
