package defpackage;
/* compiled from: PG */
/* renamed from: jnp  reason: default package */
/* loaded from: classes3.dex */
public final class jnp implements ynl {
    public final agsd a;
    public final yni b;
    private final fcu c;
    private final afvn d;
    private final ayor e;
    private final jsf f;
    private ampq g = amon.a;

    public jnp(fcu fcuVar, agsd agsdVar, yni yniVar, afvn afvnVar, ayor ayorVar, jsf jsfVar) {
        this.a = agsdVar;
        this.c = fcuVar;
        this.b = yniVar;
        this.d = afvnVar;
        this.e = ayorVar;
        this.f = jsfVar;
    }

    public static atrf d(int i) {
        aopa createBuilder = atrf.a.createBuilder();
        createBuilder.copyOnWrite();
        atrf atrfVar = (atrf) createBuilder.instance;
        atrfVar.c = i - 1;
        atrfVar.b |= 1;
        aopc aopcVar = (aopc) atrc.b.createBuilder();
        aopcVar.cm(atra.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK_WIFI);
        atrc atrcVar = (atrc) aopcVar.mo39build();
        createBuilder.copyOnWrite();
        atrf atrfVar2 = (atrf) createBuilder.instance;
        atrcVar.getClass();
        atrfVar2.e = atrcVar;
        atrfVar2.b |= 4;
        String w = emn.w();
        createBuilder.copyOnWrite();
        atrf atrfVar3 = (atrf) createBuilder.instance;
        w.getClass();
        atrfVar3.b |= 2;
        atrfVar3.d = w;
        return (atrf) createBuilder.mo39build();
    }

    public final void a() {
        this.f.a().h(jgs.h).U(new jno(this, 1), ick.o);
    }

    public final void b() {
        if (this.g.h()) {
            ((aypg) this.g.c()).qr();
            this.g = amon.a;
        }
    }

    public final void c() {
        this.g = ampq.j(((yvc) this.c.c.get()).b.C(new fcr(this.d.c().b())).G(this.e).I().ak().n().Z(new jno(this)));
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                b();
                c();
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                b();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }
}
