package defpackage;
/* compiled from: PG */
/* renamed from: ahjg  reason: default package */
/* loaded from: classes.dex */
public final class ahjg implements airt, ynl {
    private final ahje a;
    private atyr b = null;
    private ajbk c = ajbq.a;

    public ahjg(ahje ahjeVar) {
        this.a = ahjeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ahhw ahhwVar) {
        atyr atyrVar;
        float f;
        if (ahhwVar.c().h()) {
            return;
        }
        ajbk ajbkVar = null;
        if (ahhwVar.b() == null || ahhwVar.b().c() == null) {
            atyrVar = null;
        } else {
            atyrVar = ahhwVar.b().c().c.h;
            if (atyrVar == null) {
                atyrVar = atyr.a;
            }
        }
        if (ahhwVar.d() != null) {
            ajbkVar = ahhwVar.d().d();
        }
        if (ajbkVar == null) {
            ajbkVar = ajbq.a;
        }
        if (akzj.f(this.b, atyrVar) && akzj.f(this.c, ajbkVar)) {
            return;
        }
        this.b = atyrVar;
        this.c.j(ahjd.class);
        this.c = ajbkVar;
        atyr atyrVar2 = this.b;
        if (atyrVar2 == null) {
            return;
        }
        if (atyrVar2.b == 0.0f) {
            return;
        }
        airr airrVar = (airr) this.a.a.get();
        airrVar.getClass();
        ajbkVar.c(new ahjd(f * 1000.0f, airrVar));
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 8L)).h(aiwv.l(1)).aa(new ayqb() { // from class: ahjf
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ahjg.this.a((ahhw) obj);
            }
        }, aaga.m)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }
}
