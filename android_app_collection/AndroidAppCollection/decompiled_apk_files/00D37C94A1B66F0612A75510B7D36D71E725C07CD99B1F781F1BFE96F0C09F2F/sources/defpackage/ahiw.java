package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahiw  reason: default package */
/* loaded from: classes.dex */
public final class ahiw implements ahig, airt {
    public final azqb a;
    public final airw b;
    public aijs c;
    public boolean d = false;
    public int e;
    public int f;
    public boolean g;
    private final ahiu h;
    private final zah i;
    private final yrj j;

    public ahiw(azqb azqbVar, airw airwVar, ahiu ahiuVar, zah zahVar, yrj yrjVar) {
        this.a = azqbVar;
        ahiuVar.getClass();
        this.h = ahiuVar;
        zahVar.getClass();
        this.i = zahVar;
        yrjVar.getClass();
        this.j = yrjVar;
        this.b = airwVar;
    }

    public final boolean a() {
        if (!this.d || this.c != aijs.BACKGROUND || !((aire) this.a.get()).i(aiqk.d) || !this.h.g() || this.g) {
            return false;
        }
        int i = this.j.m() ? this.f : this.e;
        return i == 0 || i == -1 || this.i.a() < TimeUnit.MINUTES.toMillis((long) i);
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 4L)).h(aiwv.l(1)).aa(new ahiv(this, 2), aaga.l), airwVar.s().b.h(aiwv.n(airwVar.aB(), 4L)).h(aiwv.l(0)).aa(new ahiv(this, 1), aaga.l), airwVar.ao().h(aiwv.n(airwVar.aB(), 4L)).h(aiwv.l(1)).aa(new ahiv(this), aaga.l)};
    }

    @Override // defpackage.ahig
    public final void p() {
        this.g = true;
    }

    @Override // defpackage.ahig
    public final void q(boolean z) {
    }
}
