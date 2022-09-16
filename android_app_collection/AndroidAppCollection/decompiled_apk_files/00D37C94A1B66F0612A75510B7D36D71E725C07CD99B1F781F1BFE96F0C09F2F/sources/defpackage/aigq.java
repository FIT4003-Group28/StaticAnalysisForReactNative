package defpackage;

import android.support.v7.widget.RecyclerView;
/* compiled from: PG */
/* renamed from: aigq  reason: default package */
/* loaded from: classes.dex */
public class aigq implements airt, ynl {
    private final aigl a;
    private final axnm b;
    private boolean c;
    private aika d;

    public aigq(aigl aiglVar, axnm axnmVar) {
        aiglVar.getClass();
        this.a = aiglVar;
        this.b = axnmVar;
    }

    private final void a(aubk aubkVar) {
        aigi aigiVar = (aigi) this.b.get();
        ((ajrj) aigiVar.a).t();
        if (aubkVar != null) {
            RecyclerView recyclerView = aigiVar.g;
            if (recyclerView != null) {
                recyclerView.ab(0);
            }
            aigiVar.b(aubkVar);
        }
        this.a.j(0, false, 0);
        this.a.g = aubkVar != null ? aubkVar.g.I() : null;
    }

    protected int b(aika aikaVar) {
        if (aikaVar == aika.VIDEO_PLAYING) {
            return 1;
        }
        return aikaVar == aika.ENDED ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c() {
        return !((aigi) this.b.get()).a.isEmpty() && this.c;
    }

    public final void d(ahgn ahgnVar) {
        boolean z = this.c;
        boolean z2 = ahgnVar.d() == aijs.FULLSCREEN;
        this.c = z2;
        if (z != z2) {
            k();
        }
    }

    public final void e(ahhm ahhmVar) {
        aube aubeVar;
        if (ahhmVar.a() != null && (aubeVar = ahhmVar.a().i) != null) {
            aubb aubbVar = aubeVar.g;
            if (aubbVar == null) {
                aubbVar = aubb.a;
            }
            if ((aubbVar.b & 1) == 0) {
                j();
            } else {
                aubb aubbVar2 = aubeVar.g;
                if (aubbVar2 == null) {
                    aubbVar2 = aubb.a;
                }
                aubk aubkVar = aubbVar2.c;
                if (aubkVar == null) {
                    aubkVar = aubk.a;
                }
                a(aubkVar);
            }
        }
        k();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 134217728L)).h(aiwv.l(1)).aa(new aigp(this, 2), aiax.l), airwVar.ao().h(aiwv.n(airwVar.aB(), 134217728L)).h(aiwv.l(1)).aa(new aigp(this), aiax.l), airwVar.s().b.h(aiwv.n(airwVar.aB(), 134217728L)).h(aiwv.l(0)).aa(new aigp(this, 1), aiax.l)};
    }

    public final void i(ahhw ahhwVar) {
        if (this.d != ahhwVar.c()) {
            this.d = ahhwVar.c();
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j() {
        a(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k() {
        this.a.i(c() ? b(this.d) : 0, 0);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                d((ahgn) obj);
                return null;
            } else if (i == 1) {
                e((ahhm) obj);
                return null;
            } else if (i == 2) {
                i((ahhw) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahgn.class, ahhm.class, ahhw.class};
    }
}
