package com.google.android.apps.youtube.app.player.controls;

import android.app.Activity;
import com.google.android.apps.youtube.app.player.controls.ReportVideoController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReportVideoController implements f, ynl {
    public final Activity a;
    public final afvn b;
    public final yzj c;
    public final afwc d;
    public final aizn e;
    private final yrj g;
    private final jyh h;
    private final jyn i;
    private final yni j;
    private final airw k;
    private final aacz m;
    private aypg l = null;
    public asgn f = null;

    public ReportVideoController(Activity activity, yrj yrjVar, afvn afvnVar, yzj yzjVar, afwc afwcVar, aizn aiznVar, jyh jyhVar, jyn jynVar, yni yniVar, airw airwVar, aacz aaczVar) {
        this.a = activity;
        this.g = yrjVar;
        this.b = afvnVar;
        this.c = yzjVar;
        this.d = afwcVar;
        this.e = aiznVar;
        this.h = jyhVar;
        this.i = jynVar;
        this.j = yniVar;
        this.k = airwVar;
        this.m = aaczVar;
    }

    public final void g(ahhm ahhmVar) {
        WatchNextResponseModel a = ahhmVar.a();
        if (a != null) {
            asgt asgtVar = a.a;
            if ((asgtVar.b & 1024) != 0) {
                asgn asgnVar = asgtVar.k;
                if (asgnVar == null) {
                    asgnVar = asgn.a;
                }
                this.f = asgnVar;
                return;
            }
        }
        this.f = null;
    }

    public final void h(asgn asgnVar) {
        if (!this.g.p()) {
            zag.q(this.a, R.string.main_flagging_while_offline, 1);
            return;
        }
        int i = asgnVar.b;
        if (i == 77875886) {
            this.h.a((atul) asgnVar.c);
        } else if (i != 113762946) {
        } else {
            jyn jynVar = this.i;
            aunm aunmVar = (aunm) asgnVar.c;
            ajbf o = jynVar.a.o();
            if (o != null) {
                jynVar.c.a = ampq.j(Long.valueOf(o.b()));
            }
            jynVar.b.c(aunmVar, jynVar.c);
        }
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
        if (!eog.aq(this.m)) {
            this.j.m(this);
            return;
        }
        aypg aypgVar = this.l;
        if (aypgVar == null) {
            return;
        }
        azof.f((AtomicReference) aypgVar);
        this.l = null;
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (eog.aq(this.m)) {
            this.l = this.k.ao().I().G(aypa.a()).aa(new ayqb() { // from class: jyl
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    ReportVideoController.this.g((ahhm) obj);
                }
            }, jww.e);
        } else {
            this.j.g(this);
        }
    }
}
