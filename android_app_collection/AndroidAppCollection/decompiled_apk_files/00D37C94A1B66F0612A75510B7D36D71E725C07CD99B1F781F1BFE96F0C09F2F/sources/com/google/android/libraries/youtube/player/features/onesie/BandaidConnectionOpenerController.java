package com.google.android.libraries.youtube.player.features.onesie;

import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class BandaidConnectionOpenerController implements f, ynl {
    private final aekg a;
    private final yni d;
    private final airw e;
    private final aacz g;
    private final aypf f = new aypf();
    private boolean b = false;
    private aika c = aika.NEW;

    public BandaidConnectionOpenerController(aekg aekgVar, yni yniVar, airw airwVar, aacz aaczVar) {
        this.a = aekgVar;
        this.d = yniVar;
        this.e = airwVar;
        this.g = aaczVar;
    }

    private final void k(long j) {
        aekg aekgVar = this.a;
        if (aekgVar != null) {
            aekgVar.g(j);
        }
    }

    private final void l(String str) {
        aekg aekgVar = this.a;
        if (aekgVar != null) {
            aekgVar.h(str);
        }
    }

    private static final boolean m(aacz aaczVar) {
        if (aaczVar == null || aaczVar.b() == null) {
            return false;
        }
        atzt atztVar = aaczVar.b().v;
        if (atztVar == null) {
            atztVar = atzt.a;
        }
        return atztVar.f;
    }

    public final void g(ahhw ahhwVar) {
        aika c = ahhwVar.c();
        aika aikaVar = aika.NEW;
        int ordinal = c.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                atfw atfwVar = this.g.b().k;
                if (atfwVar == null) {
                    atfwVar = atfw.a;
                }
                if ((atfwVar.b & 1073741824) == 0) {
                    l("vl");
                }
                this.c = c;
                return;
            } else if (ordinal != 9) {
                return;
            }
        }
        if (!this.b) {
            k(1500L);
        }
        this.c = c;
    }

    public final void h() {
        l("as");
        this.b = true;
    }

    public final void i() {
        if (this.c != aika.PLAYBACK_LOADED) {
            k(1500L);
        }
        this.b = false;
    }

    public final void j() {
        k(0L);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                g((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (m(this.g)) {
            this.f.c();
        } else {
            this.d.m(this);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (m(this.g)) {
            this.f.c();
            this.f.g(this.e.G().b.aa(new ayqb() { // from class: ahxs
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    BandaidConnectionOpenerController.this.g((ahhw) obj);
                }
            }, ahqs.k));
            return;
        }
        this.d.g(this);
    }
}
