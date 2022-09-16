package defpackage;
/* compiled from: PG */
/* renamed from: ajba  reason: default package */
/* loaded from: classes.dex */
public final class ajba extends ajfb {
    public final axnm a;
    final snc b;
    private final aant f;
    private final aynx g;
    private final aacz i;
    private long h = -1;
    public float c = 1.0f;
    public boolean d = false;
    public boolean e = false;

    public ajba(axnm axnmVar, aant aantVar, snc sncVar, aynx aynxVar, aacz aaczVar) {
        this.a = axnmVar;
        this.f = aantVar;
        this.b = sncVar;
        this.g = aynxVar;
        this.i = aaczVar;
    }

    @Override // defpackage.ajfb
    public final void R(ahhw ahhwVar) {
        aijw aijwVar = aijw.PLAYBACK_PENDING;
        aika aikaVar = aika.NEW;
        int ordinal = ahhwVar.c().ordinal();
        if (ordinal == 2) {
            boolean l = ahhwVar.l();
            this.e = l;
            if (l && this.c > 1.0f) {
                y();
            }
            ((ajaz) this.a.get()).F(this.c);
        } else if (ordinal == 4) {
            this.d = true;
        } else if (ordinal == 7) {
            this.d = false;
        } else if (ordinal != 9) {
        } else {
            z();
        }
    }

    @Override // defpackage.ajfb
    public final void S(ahgh ahghVar) {
        if (!this.d) {
            this.c = ahghVar.a();
        }
    }

    @Override // defpackage.ajfb
    public final void c(String str) {
        z();
    }

    @Override // defpackage.ajfb
    public final void e(ahhx ahhxVar) {
        long e = ahhxVar.e();
        if (!ahhxVar.j() || !this.e) {
            return;
        }
        if ((this.c <= 1.0f || ahhxVar.f() - e >= 500) && (this.c >= 1.0f || e - ahhxVar.h() >= 500)) {
            return;
        }
        y();
        ((ajaz) this.a.get()).F(this.c);
    }

    @Override // defpackage.ajfb
    public final void v(ahia ahiaVar) {
        if (ahiaVar.a() == 3) {
            z();
        } else if (ahiaVar.a() != 2) {
        } else {
            long d = this.b.d();
            avwb avwbVar = this.f.get().c.t;
            if (avwbVar == null) {
                avwbVar = avwb.a;
            }
            int i = avwbVar.c * 1000;
            long j = this.h;
            if (j != -1 && i > 0 && d - j > i) {
                this.c = 1.0f;
            }
            this.h = -1L;
            ((ajaz) this.a.get()).F(this.c);
        }
    }

    public final void w() {
        aypf aypfVar = new aypf();
        if (aiix.F(this.i)) {
            aypfVar.d(this.g.Z(new ajay(this, 1)));
            aypfVar.d(aiwv.j(this.g, aiyy.f).Z(new ajay(this)));
            aypfVar.d(aiwv.j(this.g, aiyy.g).Z(new ajay(this, 2)));
            aypfVar.d(aiwv.j(this.g, aiyy.i).Z(new ajay(this, 5)));
            aypfVar.d(aiwv.j(this.g, aiyy.e).Z(new ajay(this, 4)));
            aypfVar.d(aiwv.j(this.g, aiyy.h).Z(new ajay(this, 3)));
        }
    }

    public final void y() {
        this.h = -1L;
        this.c = 1.0f;
    }

    public final void z() {
        this.h = this.b.d();
    }
}
