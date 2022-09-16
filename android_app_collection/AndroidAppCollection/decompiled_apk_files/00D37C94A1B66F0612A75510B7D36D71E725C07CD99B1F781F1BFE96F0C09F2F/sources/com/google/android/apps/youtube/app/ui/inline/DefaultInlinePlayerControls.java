package com.google.android.apps.youtube.app.ui.inline;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DefaultInlinePlayerControls extends fyo implements f, mdh, airt, ynl {
    public final mcc d;
    private final airr e;
    private final ezh f;
    private final aiix g;
    private final yni h;
    private final airw i;
    private final aypf j = new aypf();
    private final fdu k;
    private final evm l;
    private final jvo m;
    private final aacz n;

    public DefaultInlinePlayerControls(airr airrVar, jvo jvoVar, ezh ezhVar, yni yniVar, airw airwVar, aacz aaczVar, fdu fduVar, evm evmVar, feh fehVar, aiix aiixVar) {
        this.e = airrVar;
        this.m = jvoVar;
        this.f = ezhVar;
        this.h = yniVar;
        this.i = airwVar;
        this.n = aaczVar;
        this.k = fduVar;
        this.l = evmVar;
        this.g = aiixVar;
        this.d = new mcc(this, fehVar);
    }

    private final boolean w() {
        return this.k.b == fdq.WATCH_WHILE && this.e.T();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().b.aa(new mcb(this), kjt.o), airwVar.ao().I().G(aypa.a()).aa(new mcb(this, 1), kjt.o)};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                o((ahhm) obj);
                return null;
            } else if (i == 1) {
                p((ahhw) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhm.class, ahhw.class};
    }

    @Override // defpackage.mdh
    public final ajbf l() {
        return this.e.n();
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.mdh
    public final String m() {
        return this.e.q();
    }

    @Override // defpackage.mdh
    public final void n() {
        this.e.e();
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (eog.aq(this.n)) {
            this.j.c();
        } else {
            this.h.m(this);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (eog.aq(this.n)) {
            this.j.g(g(this.i));
        } else {
            this.h.g(this);
        }
    }

    public final void o(ahhm ahhmVar) {
        if (this.c != null && ahhmVar.c() == aijx.VIDEO_PLAYBACK_ERROR) {
            i();
        }
    }

    public final void p(ahhw ahhwVar) {
        if (this.c == null) {
            return;
        }
        if ((this.a != 3 || !ahhwVar.c().c(aika.PLAYBACK_LOADED)) && (this.a != 0 || !ahhwVar.c().a(aika.NEW, aika.ENDED, aika.INTERSTITIAL_REQUESTED))) {
            return;
        }
        i();
    }

    @Override // defpackage.mdh
    public final void q() {
        this.e.a();
    }

    @Override // defpackage.mdh
    public final void r() {
        this.e.b();
    }

    @Override // defpackage.mdh
    public final void s(PlaybackStartDescriptor playbackStartDescriptor) {
        jwi jwiVar = (jwi) this.m.get();
        if (jwiVar.ay.N(playbackStartDescriptor)) {
            jwiVar.aG(false);
        }
    }

    @Override // defpackage.mdh
    public final void t() {
        ajah ajahVar = this.e.q.a;
        if (ajahVar == null) {
            return;
        }
        ajahVar.am();
    }

    @Override // defpackage.mdh
    public final boolean u() {
        return this.e.d();
    }

    @Override // defpackage.mdh
    public final void v(ezu ezuVar) {
        if (!this.g.f()) {
            this.h.f(new exd());
        }
        this.m.get().m(ezuVar, this.f.g(), false, this.l.c(2));
    }

    @Override // defpackage.fyo
    protected final boolean j(fyp fypVar, int i) {
        return i == 0 ? !w() || !this.d.a : i != 3 || w();
        return true;
    }
}
