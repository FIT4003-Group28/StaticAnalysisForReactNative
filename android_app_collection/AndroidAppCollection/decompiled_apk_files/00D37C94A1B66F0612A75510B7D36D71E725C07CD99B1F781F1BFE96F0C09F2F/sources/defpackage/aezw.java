package defpackage;

import android.net.Uri;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: aezw  reason: default package */
/* loaded from: classes.dex */
public final class aezw extends ppa {
    private final pnp d;
    private final afjm e;
    private final afci f;
    private final afbi g;
    private final pjc h;
    private final afbq i;
    private final aeyz j;
    private atk k;

    public aezw(afbi afbiVar, afjm afjmVar, afci afciVar, pnp pnpVar, Handler handler, Handler handler2, aeyq aeyqVar, afbq afbqVar) {
        this.g = afbiVar;
        this.e = afjmVar;
        this.f = afciVar;
        this.d = pnpVar;
        this.j = new aeyz(handler, aeyqVar, handler2);
        this.i = afbqVar;
        pix pixVar = new pix();
        pixVar.b("OtfOrVodMediaSource");
        pixVar.a = Uri.EMPTY;
        pixVar.b = afbiVar;
        this.h = pixVar.a();
    }

    @Override // defpackage.pqb
    public final pjc r() {
        return this.h;
    }

    @Override // defpackage.ppa
    protected final void rA() {
    }

    @Override // defpackage.ppa
    protected final void rz(atk atkVar) {
        this.k = atkVar;
        rF(new afcr(this.h));
    }

    @Override // defpackage.pqb
    public final void s() {
    }

    @Override // defpackage.pqb
    public final void u(ppy ppyVar) {
        ((aezv) ppyVar).n();
    }

    @Override // defpackage.pqb
    public final ppy v(ppz ppzVar, axf axfVar, long j) {
        aezv aezvVar;
        synchronized (this.g) {
            aezvVar = new aezv(this.e, this.f, this.d, n(ppzVar), this.k, rJ(ppzVar), axfVar, this.g.a(), this.g.b(), this.j, this.g.a, this.h, this.i);
        }
        return aezvVar;
    }
}
