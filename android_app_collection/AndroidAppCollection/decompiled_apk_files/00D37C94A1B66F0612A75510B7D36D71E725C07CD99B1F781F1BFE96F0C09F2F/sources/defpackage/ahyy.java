package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
/* compiled from: PG */
/* renamed from: ahyy  reason: default package */
/* loaded from: classes.dex */
public final class ahyy implements airt, ynl {
    final /* synthetic */ ahyz a;

    public ahyy(ahyz ahyzVar) {
        this.a = ahyzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0043, code lost:
        if (r0 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ajff r3, defpackage.aikd r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L45
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r3.c()
            if (r0 == 0) goto L45
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r3 = r3.c()
            asaa r3 = r3.t()
            r0 = 0
            if (r3 == 0) goto L43
            arzu r1 = r3.n
            if (r1 != 0) goto L19
            arzu r1 = defpackage.arzu.a
        L19:
            asuv r1 = r1.c
            if (r1 != 0) goto L1f
            asuv r1 = defpackage.asuv.a
        L1f:
            asuu r1 = r1.g
            if (r1 != 0) goto L25
            asuu r1 = defpackage.asuu.a
        L25:
            int r1 = r1.b
            r1 = r1 & 1
            if (r1 == 0) goto L43
            arzu r3 = r3.n
            if (r3 != 0) goto L31
            arzu r3 = defpackage.arzu.a
        L31:
            asuv r3 = r3.c
            if (r3 != 0) goto L37
            asuv r3 = defpackage.asuv.a
        L37:
            asuu r3 = r3.g
            if (r3 != 0) goto L3d
            asuu r3 = defpackage.asuu.a
        L3d:
            asur r0 = r3.c
            if (r0 != 0) goto L43
            asur r0 = defpackage.asur.a
        L43:
            if (r0 != 0) goto L4b
        L45:
            int r3 = r4.i
            r0 = 15
            if (r3 != r0) goto L57
        L4b:
            ahyz r3 = r2.a
            ahyp r3 = r3.s
            com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState r4 = com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState.a()
            r3.f(r4)
            return
        L57:
            boolean r3 = defpackage.aiqa.d(r3)
            if (r3 == 0) goto L76
            auad r3 = r4.e
            if (r3 != 0) goto L6d
            ahyz r3 = r2.a
            ahyp r3 = r3.s
            java.lang.String r0 = r4.d
            boolean r4 = r4.a
            r3.nh(r0, r4)
            return
        L6d:
            ahyz r0 = r2.a
            ahyp r0 = r0.s
            boolean r4 = r4.a
            r0.y(r3, r4)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahyy.a(ajff, aikd):void");
    }

    public final void b(aesr aesrVar) {
        ahyz ahyzVar = this.a;
        ahyzVar.f48J = 0L;
        ahyzVar.K = 0L;
        FormatStreamModel e = aesrVar.e();
        FormatStreamModel f = aesrVar.f();
        synchronized (this.a.L) {
            try {
                if (e != null && f != null) {
                    this.a.M = new FormatStreamModel[]{e, f};
                } else if (e != null) {
                    this.a.M = new FormatStreamModel[]{e};
                } else if (f != null) {
                    this.a.M = new FormatStreamModel[]{f};
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.N.b();
    }

    public final void c(ahgn ahgnVar) {
        boolean z = true;
        boolean z2 = ahgnVar.c() == aijs.FULLSCREEN;
        ahyz ahyzVar = this.a;
        if (ahyzVar.x != z2) {
            ahyzVar.x = z2;
            ahyzVar.s.ni(z2);
        }
        ahyz ahyzVar2 = this.a;
        if (ahgnVar.d() != aijs.REMOTE) {
            z = false;
        }
        ahyzVar2.w = z;
    }

    public final void d(ahhm ahhmVar) {
        aube aubeVar;
        if (ahhmVar.c() != aijx.VIDEO_WATCH_LOADED || ahhmVar.a() == null || (aubeVar = ahhmVar.a().i) == null || (aubeVar.b & 262144) == 0) {
            return;
        }
        ahyp ahypVar = this.a.s;
        arag aragVar = aubeVar.m;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        ahypVar.nN(ajgl.b(aragVar));
    }

    public final void e(ahhw ahhwVar) {
        ControlsState c;
        boolean z = true;
        boolean z2 = ahhwVar.l() && ahhwVar.b() != null && ahhwVar.b().G();
        aika c2 = ahhwVar.c();
        if (ahhwVar.b() != null && ahhwVar.b().c().aw() && c2.a(aika.INTERSTITIAL_REQUESTED, aika.INTERSTITIAL_PLAYING, aika.PLAYBACK_INTERRUPTED)) {
            c2 = aika.VIDEO_PLAYING;
        }
        this.a.y = c2.c(aika.PLAYBACK_LOADED);
        this.a.A = c2 == aika.ENDED;
        if (c2 == aika.NEW) {
            ahyz ahyzVar = this.a;
            ahyzVar.C = false;
            ahyzVar.B = false;
            ahyzVar.D = null;
            ahyzVar.E = aika.NEW;
            ahyzVar.y = false;
            ahyzVar.z = false;
            ahyzVar.A = false;
            ahyzVar.G = 0L;
            ahyzVar.H = 0L;
            ahyzVar.I = 0L;
            ahyzVar.f48J = 0L;
            ahyzVar.K = 0L;
            ahyzVar.s.ng();
            ahyzVar.s.f(ControlsState.b());
            ahyzVar.N.a();
            synchronized (ahyzVar.L) {
                ahyzVar.M = null;
            }
        } else if (!this.a.y || c2.b()) {
            ahyz ahyzVar2 = this.a;
            ahyp ahypVar = ahyzVar2.s;
            if (ahyzVar2.r.d()) {
                c = ControlsState.e();
            } else {
                c = ControlsState.c();
            }
            ahypVar.f(c);
        } else if (c2 == aika.PLAYBACK_INTERRUPTED) {
            this.a.s.f(new ControlsState(ahzb.PAUSED, false));
        } else if (c2.a(aika.INTERSTITIAL_REQUESTED, aika.READY)) {
            this.a.s.f(ControlsState.d());
        } else if (c2 == aika.ENDED) {
            this.a.s.f(ControlsState.a());
        }
        if (c2.d()) {
            this.a.s.f(ControlsState.f());
            this.a.N.b();
        }
        ahyz ahyzVar3 = this.a;
        ahyzVar3.E = c2;
        ahyzVar3.D = ahhwVar;
        ahyzVar3.e();
        if (!c2.c(aika.READY) || (ahhwVar.l() && (!ahhwVar.l() || !z2))) {
            z = false;
        }
        this.a.s.j(z);
        this.a.d();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 8192L)).h(aiwv.l(1)).aa(new ahyx(this, 6), ahqs.o), airwVar.G().c.h(aiwv.n(airwVar.aB(), 8192L)).h(aiwv.l(1)).aa(new ahyx(this, 3), ahqs.o), airwVar.G().d.h(aiwv.n(airwVar.aB(), 8192L)).h(aiwv.l(1)).aa(new ahyx(this, 7), ahqs.o), airwVar.G().k.h(aiwv.n(airwVar.aB(), 8192L)).h(aiwv.l(1)).aa(new ahyx(this), ahqs.o), airwVar.G().i.h(aiwv.n(airwVar.aB(), 8192L)).h(aiwv.l(1)).aa(new ahyx(this, 8), ahqs.o), airwVar.s().b.h(aiwv.n(airwVar.aB(), 8192L)).h(aiwv.l(0)).aa(new ahyx(this, 2), ahqs.o), airwVar.ap().h(aiwv.n(airwVar.aB(), 8192L)).h(aiwv.l(1)).aa(new ahyx(this, 5), ahqs.o), airwVar.ao().h(aiwv.n(airwVar.aB(), 8192L)).h(aiwv.l(1)).aa(new ahyx(this, 4), ahqs.o), aiwv.k(airwVar.G().g, ahja.f).h(aiwv.l(1)).aa(new ahyx(this, 1), ahqs.o)};
    }

    public final void h(ahhx ahhxVar) {
        this.a.G = ahhxVar.e();
        this.a.H = ahhxVar.h();
        this.a.I = ahhxVar.f();
        this.a.f48J = ahhxVar.a();
        this.a.f();
    }

    public final void i(ahia ahiaVar) {
        ControlsState d;
        ahyz ahyzVar = this.a;
        if (!ahyzVar.y || ahyzVar.A) {
            return;
        }
        int a = ahiaVar.a();
        if (a != 2) {
            if (a != 3 && a != 4) {
                if (a == 5) {
                    this.a.s.f(ControlsState.e());
                    return;
                } else if (a != 6) {
                    return;
                }
            }
            ahyp ahypVar = this.a.s;
            if (ahiaVar.c()) {
                d = ControlsState.c();
            } else {
                d = ControlsState.d();
            }
            ahypVar.f(d);
            return;
        }
        this.a.s.f(ControlsState.f());
    }

    public final void j() {
        this.a.z = true;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{aesr.class, ahgn.class, ahhm.class, ahhs.class, ahhw.class, ahhx.class, ahia.class, aikd.class};
            case 0:
                b((aesr) obj);
                return null;
            case 1:
                c((ahgn) obj);
                return null;
            case 2:
                d((ahhm) obj);
                return null;
            case 3:
                ahhs ahhsVar = (ahhs) obj;
                j();
                return null;
            case 4:
                e((ahhw) obj);
                return null;
            case 5:
                h((ahhx) obj);
                return null;
            case 6:
                i((ahia) obj);
                return null;
            case 7:
                a(null, (aikd) obj);
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
