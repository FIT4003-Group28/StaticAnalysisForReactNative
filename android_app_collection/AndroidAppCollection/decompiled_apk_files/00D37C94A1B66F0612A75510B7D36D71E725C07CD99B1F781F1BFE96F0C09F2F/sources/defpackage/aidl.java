package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aidl  reason: default package */
/* loaded from: classes.dex */
public final class aidl extends ylz implements airt {
    public final airr d;
    public final airw e;
    public final aypf f = new aypf();
    private ajbf g;
    private aidk h;
    private final atzb i;

    public aidl(airr airrVar, airw airwVar, atzb atzbVar) {
        airrVar.getClass();
        this.d = airrVar;
        this.e = airwVar;
        atzbVar.getClass();
        this.i = atzbVar;
    }

    @Override // defpackage.ylz
    public final void b() {
        ajbk d;
        this.f.c();
        ajbf ajbfVar = this.g;
        if (ajbfVar == null || this.h == null || (d = ajbfVar.d()) == null) {
            return;
        }
        d.i(this.h);
    }

    public final void d(ajbf ajbfVar) {
        long max;
        if (this.h != null) {
            return;
        }
        this.g = ajbfVar;
        ajbk d = ajbfVar != null ? ajbfVar.d() : null;
        if (d == null) {
            return;
        }
        long h = this.d.h();
        if (h <= 0) {
            return;
        }
        if (this.i.d >= 0) {
            max = Math.min(TimeUnit.MILLISECONDS.convert(this.i.d, TimeUnit.SECONDS), h);
        } else {
            max = Math.max(TimeUnit.MILLISECONDS.convert(this.i.d, TimeUnit.SECONDS) + h, 0L);
        }
        aidk aidkVar = new aidk(this, max, h);
        this.h = aidkVar;
        d.c(aidkVar);
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 67108864L)).h(aiwv.l(1)).aa(new ayqb() { // from class: aidj
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aidl aidlVar = aidl.this;
                ahhw ahhwVar = (ahhw) obj;
                if (!ahhwVar.c().c(aika.PLAYBACK_LOADED) || ahhwVar.c().h()) {
                    return;
                }
                aidlVar.d(ahhwVar.d());
            }
        }, aiax.j)};
    }
}
