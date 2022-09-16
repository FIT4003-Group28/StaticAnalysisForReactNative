package defpackage;
/* compiled from: PG */
/* renamed from: ahvs  reason: default package */
/* loaded from: classes.dex */
public final class ahvs implements airt, ynl {
    final /* synthetic */ ahvu a;

    public ahvs(ahvu ahvuVar) {
        this.a = ahvuVar;
    }

    public final void a(ahgn ahgnVar) {
        this.a.g = ahgnVar.c();
        if (this.a.j()) {
            return;
        }
        ahvu ahvuVar = this.a;
        if (ahvuVar.n != ahvuVar.k()) {
            if (this.a.k()) {
                ahvu ahvuVar2 = this.a;
                ahvuVar2.n(false, ahvuVar2.l.e);
            } else {
                this.a.m();
            }
        }
        this.a.i();
    }

    public final void b(ahhw ahhwVar) {
        ahhwVar.c().h();
        aijs aijsVar = aijs.DEFAULT;
        int ordinal = ahhwVar.c().ordinal();
        if (ordinal == 0) {
            this.a.h();
            this.a.g();
        } else if (ordinal == 4) {
            if (ahhwVar.a() == null) {
                return;
            }
            this.a.f(ahvu.e(ahhwVar.a()), ahhwVar.k());
        } else if (ordinal == 7) {
            this.a.f(ahvu.e(ahhwVar.b()), ahhwVar.e());
        } else if (ordinal != 8) {
        } else {
            ahvu ahvuVar = this.a;
            if (ahvuVar.f) {
                return;
            }
            ahvuVar.f(ahvu.e(ahhwVar.b()), ahhwVar.e());
        }
    }

    public final void c(ahhx ahhxVar) {
        int e = (int) ahhxVar.e();
        ahvu ahvuVar = this.a;
        if (e == ahvuVar.p) {
            return;
        }
        ahvuVar.p = e;
        if (ahvuVar.i == null) {
            return;
        }
        ahvuVar.i();
        if (ahvuVar.i.d.size() == 0) {
            return;
        }
        int i = -1;
        int i2 = 0;
        avhn avhnVar = null;
        apha aphaVar = null;
        for (int i3 = 0; i3 < ahvuVar.m.size(); i3++) {
            apha aphaVar2 = (apha) ahvuVar.m.get(i3);
            long j = aphaVar2.c;
            long j2 = e;
            if (j <= j2 && aphaVar2.d > j2 && (aphaVar == null || j > aphaVar.c)) {
                i = i3;
                aphaVar = aphaVar2;
            }
        }
        if (i != ahvuVar.k) {
            ahvuVar.k = i;
            ahvuVar.l = aphaVar;
            apha aphaVar3 = ahvuVar.l;
            if (aphaVar3 != null) {
                if ((aphaVar3.b & 128) != 0 && (avhnVar = aphaVar3.f) == null) {
                    avhnVar = avhn.a;
                }
                ahvuVar.h = ahvuVar.d(ahvu.l(avhnVar), new ahvn());
                ahvuVar.d.a(ahvuVar.l.h);
            }
        }
        if (ahvuVar.l == null) {
            ahvuVar.m();
        } else if (ahvuVar.j()) {
            ahvuVar.m();
        } else if (ahvuVar.k() && !ahvuVar.n) {
            if (!ahvuVar.j[ahvuVar.k]) {
                i2 = ahvuVar.l.e;
            }
            ahvuVar.n(true, i2);
        }
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 2048L)).h(aiwv.l(1)).aa(new ahvr(this), ahqs.g), airwVar.G().d.h(aiwv.n(airwVar.aB(), 2048L)).h(aiwv.l(1)).aa(new ahvr(this, 2), ahqs.g), airwVar.s().b.h(aiwv.n(airwVar.aB(), 2048L)).h(aiwv.l(0)).aa(new ahvr(this, 1), ahqs.g)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((ahgn) obj);
                return null;
            } else if (i == 1) {
                b((ahhw) obj);
                return null;
            } else if (i == 2) {
                c((ahhx) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahgn.class, ahhw.class, ahhx.class};
    }
}
