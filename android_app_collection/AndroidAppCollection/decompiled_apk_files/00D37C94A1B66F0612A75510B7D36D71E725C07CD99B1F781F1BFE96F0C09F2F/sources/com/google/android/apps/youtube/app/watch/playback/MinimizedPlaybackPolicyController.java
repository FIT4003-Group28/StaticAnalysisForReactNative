package com.google.android.apps.youtube.app.watch.playback;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.MiniplayerRendererOuterClass;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MinimizedPlaybackPolicyController implements f, ezg, ynl {
    public atfy a;
    public int b;
    public ezx c;
    private final yni d;
    private final ezh e;
    private final aafo f;
    private final niy g;
    private final airr h;
    private boolean i;

    public MinimizedPlaybackPolicyController(yni yniVar, ezh ezhVar, aafo aafoVar, niy niyVar, airr airrVar) {
        this.d = yniVar;
        this.e = ezhVar;
        this.f = aafoVar;
        this.g = niyVar;
        this.h = airrVar;
    }

    public static atfy g(PlayerResponseModel playerResponseModel) {
        asaj asajVar;
        if (playerResponseModel != null && (asajVar = playerResponseModel.a) != null) {
            asaa asaaVar = asajVar.f;
            if (asaaVar == null) {
                asaaVar = asaa.a;
            }
            if ((asaaVar.b & 512) != 0) {
                asaa asaaVar2 = asajVar.f;
                if (asaaVar2 == null) {
                    asaaVar2 = asaa.a;
                }
                aunb aunbVar = asaaVar2.i;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (aunbVar.qn(MiniplayerRendererOuterClass.miniplayerRenderer)) {
                    asaa asaaVar3 = asajVar.f;
                    if (asaaVar3 == null) {
                        asaaVar3 = asaa.a;
                    }
                    aunb aunbVar2 = asaaVar3.i;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    return (atfy) aunbVar2.qm(MiniplayerRendererOuterClass.miniplayerRenderer);
                }
            }
        }
        return null;
    }

    public final void h(int i, ezx ezxVar, atfy atfyVar) {
        int ci;
        if (ezxVar == ezx.NONE) {
            this.i = false;
        }
        if (atfyVar != null && (ci = awwc.ci(atfyVar.b)) != 0 && ci == 5 && i == 2 && ezxVar == ezx.WATCH_WHILE_MINIMIZED) {
            if (this.b != 3 || this.c != ezx.WATCH_WHILE_MINIMIZED) {
                this.h.a();
                if (this.i) {
                    return;
                }
                aafo aafoVar = this.f;
                apzg apzgVar = atfyVar.c;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, null);
                this.i = true;
                return;
            }
            this.g.q();
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahhw ahhwVar = (ahhw) obj;
                atfy g = ahhwVar.c() == aika.NEW ? null : g(ahhwVar.b());
                h(this.b, this.c, g);
                this.a = g;
                return null;
            } else if (i == 1) {
                int a = ((ahia) obj).a();
                if (a != 2) {
                    if (a != 3) {
                        return null;
                    }
                    a = 3;
                }
                h(a, this.c, this.a);
                this.b = a;
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhw.class, ahia.class};
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        this.d.g(this);
        this.e.i(this);
        ajbf o = this.h.o();
        if (o != null) {
            this.a = g(o.c());
            this.b = true != this.h.d() ? 0 : 2;
            this.c = this.e.g();
        }
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.d.m(this);
        this.e.j(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        h(this.b, ezxVar, this.a);
        this.c = ezxVar;
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
