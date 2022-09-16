package com.google.android.apps.youtube.app.player.controls;

import android.app.Activity;
import com.google.android.apps.youtube.app.player.controls.MusicDeeplinkMenuItemController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MusicDeeplinkMenuItemController implements f, ynl {
    public final aafo a;
    public jxt b;
    public aten c;
    private final Activity d;
    private final airw e;
    private final ajxz f;
    private aypg g;
    private boolean h;

    public MusicDeeplinkMenuItemController(Activity activity, airw airwVar, aafo aafoVar, ajxz ajxzVar) {
        this.d = activity;
        airwVar.getClass();
        this.e = airwVar;
        aafoVar.getClass();
        this.a = aafoVar;
        ajxzVar.getClass();
        this.f = ajxzVar;
    }

    private final void i(arhr arhrVar, boolean z) {
        int a = this.f.a(arhrVar);
        if (a == 0) {
            return;
        }
        if (z) {
            this.b.e = zag.f(this.d, a, R.attr.ytTextPrimary);
            return;
        }
        this.b.f = zag.f(this.d, a, R.attr.ytTextPrimary);
    }

    public final void g(ahhm ahhmVar) {
        aube aubeVar;
        arhs f;
        WatchNextResponseModel a = ahhmVar.a();
        boolean z = true;
        if (a != null && (aubeVar = a.i) != null && (aubeVar.b & 1) != 0) {
            aubd aubdVar = aubeVar.d;
            if (aubdVar == null) {
                aubdVar = aubd.a;
            }
            if ((aubdVar.b & 1) != 0) {
                aubd aubdVar2 = aubeVar.d;
                if (aubdVar2 == null) {
                    aubdVar2 = aubd.a;
                }
                atep atepVar = aubdVar2.c;
                if (atepVar == null) {
                    atepVar = atep.a;
                }
                for (aten atenVar : atepVar.c) {
                    if ((atenVar.b & 1) != 0 && (f = abgc.f(atenVar)) != null) {
                        arhr b = arhr.b(f.c);
                        if (b == null) {
                            b = arhr.UNKNOWN;
                        }
                        if (b == arhr.OUTLINE_YOUTUBE_MUSIC) {
                            this.c = atenVar;
                            break;
                        }
                    }
                }
            }
        }
        z = false;
        this.h = z;
        if (this.b != null) {
            h();
        }
    }

    public final void h() {
        aten atenVar = this.c;
        if (atenVar != null) {
            this.b.c = abgc.h(atenVar).toString();
            arhr b = arhr.b(abgc.f(this.c).c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            i(b, true);
            arhr b2 = arhr.b(abgc.g(this.c).c);
            if (b2 == null) {
                b2 = arhr.UNKNOWN;
            }
            i(b2, false);
        }
        this.b.g(this.h);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                g((ahhm) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhm.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        aypg aypgVar = this.g;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.g = null;
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.g = this.e.ao().I().G(aypa.a()).aa(new ayqb() { // from class: jyb
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                MusicDeeplinkMenuItemController.this.g((ahhm) obj);
            }
        }, jww.d);
    }
}
