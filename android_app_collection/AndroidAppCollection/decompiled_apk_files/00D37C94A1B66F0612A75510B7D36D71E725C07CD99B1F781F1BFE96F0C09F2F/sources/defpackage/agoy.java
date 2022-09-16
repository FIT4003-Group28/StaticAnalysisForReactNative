package defpackage;

import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: agoy  reason: default package */
/* loaded from: classes.dex */
public final class agoy implements ynl {
    public final yni a;
    public final azqb b;
    private final aahf c;
    private final afvn d;
    private final Executor e;
    private aypg f;
    private afvm g;

    public agoy(aahf aahfVar, afvn afvnVar, Executor executor, yni yniVar, azqb azqbVar) {
        aahfVar.getClass();
        this.c = aahfVar;
        afvnVar.getClass();
        this.d = afvnVar;
        executor.getClass();
        this.e = executor;
        yniVar.getClass();
        this.a = yniVar;
        this.b = azqbVar;
    }

    public final void a() {
        afvm c = this.d.c();
        if (!c.z() && !Objects.equals(this.g, c)) {
            b();
            this.g = c;
            this.f = this.c.a(c).g(aqqv.class).X(azpj.b(this.e)).as(new ayqb() { // from class: agox
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    aqqv aqqvVar;
                    agsd agsdVar;
                    agoy agoyVar = agoy.this;
                    aajp aajpVar = (aajp) obj;
                    if (aajpVar.c == null && (aqqvVar = (aqqv) aajpVar.b) != null) {
                        aajk aajkVar = aajpVar.d;
                        if ((aajkVar != null && new agpv(aajkVar).k("license_released")) || (agsdVar = (agsd) agoyVar.b.get()) == null) {
                            return;
                        }
                        try {
                            aopa createBuilder = atrf.a.createBuilder();
                            createBuilder.copyOnWrite();
                            atrf atrfVar = (atrf) createBuilder.instance;
                            atrfVar.c = 2;
                            atrfVar.b |= 1;
                            String d = aqqvVar.d();
                            createBuilder.copyOnWrite();
                            atrf atrfVar2 = (atrf) createBuilder.instance;
                            d.getClass();
                            atrfVar2.b = 2 | atrfVar2.b;
                            atrfVar2.d = d;
                            aopc aopcVar = (aopc) atrc.b.createBuilder();
                            aopcVar.cm(atra.OFFLINE_ORCHESTRATION_ACTION_CONSTRAINT_NETWORK);
                            aopg aopgVar = aqqr.b;
                            aopa createBuilder2 = aqqr.a.createBuilder();
                            aqqy aqqyVar = aqqvVar.b;
                            createBuilder2.copyOnWrite();
                            aqqr aqqrVar = (aqqr) createBuilder2.instance;
                            aqqyVar.getClass();
                            aqqrVar.e = aqqyVar;
                            aqqrVar.c |= 64;
                            aopcVar.e(aopgVar, (aqqr) createBuilder2.mo39build());
                            createBuilder.copyOnWrite();
                            atrf atrfVar3 = (atrf) createBuilder.instance;
                            atrc atrcVar = (atrc) aopcVar.mo39build();
                            atrcVar.getClass();
                            atrfVar3.e = atrcVar;
                            atrfVar3.b |= 4;
                            agsdVar.d((atrf) createBuilder.mo39build());
                        } catch (agse e) {
                            zep.d("Failed to delete DRM License Entity: ", e);
                        }
                    }
                }
            });
        }
    }

    public final void b() {
        aypg aypgVar = this.f;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.f = null;
            this.g = null;
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                a();
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
