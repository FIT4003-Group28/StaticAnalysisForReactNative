package defpackage;
/* compiled from: PG */
/* renamed from: aics  reason: default package */
/* loaded from: classes.dex */
public final class aics implements airt, ynl {
    final /* synthetic */ aict a;

    public aics(aict aictVar) {
        this.a = aictVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ahgn ahgnVar) {
        this.a.c.d(ahgnVar.c() == aijs.FULLSCREEN);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ahhw ahhwVar) {
        aika aikaVar = aika.NEW;
        int ordinal = ahhwVar.c().ordinal();
        if (ordinal == 0) {
            aict aictVar = this.a;
            aictVar.f = false;
            aictVar.g = false;
            aictVar.c.a(false);
        } else if (ordinal != 8) {
        } else {
            aict aictVar2 = this.a;
            if (aictVar2.g) {
                return;
            }
            aictVar2.a(ahhwVar.b().a);
        }
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 8388608L)).h(aiwv.l(1)).aa(new aicr(this), aiax.f), airwVar.s().b.h(aiwv.n(airwVar.aB(), 8388608L)).h(aiwv.l(0)).aa(new aicr(this, 1), aiax.f)};
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
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahgn.class, ahhw.class};
    }
}
