package com.google.android.apps.youtube.app.extensions.reel.watch.activity;

import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelSnackbarController implements f, akev, ynl {
    public final fvi a;
    public final dt b;
    private final yni c;
    private final akfg d;
    private final acth e;
    private final fud f;
    private final Set g = new HashSet();

    public ReelSnackbarController(dt dtVar, yni yniVar, akfg akfgVar, fvi fviVar, acth acthVar, fud fudVar) {
        this.b = dtVar;
        this.c = yniVar;
        this.d = akfgVar;
        this.a = fviVar;
        this.e = acthVar;
        this.f = fudVar;
    }

    public final void g() {
        for (akfi akfiVar : this.g) {
            this.d.m(akfiVar);
        }
    }

    public final void h(byte[] bArr, fvg fvgVar) {
        acti oi = this.e.oi();
        if (bArr.length > 0 && oi != null) {
            fvgVar.b = new lmk(oi, bArr, 1);
        }
        fvgVar.e(true);
        this.d.n(fvgVar.b());
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        this.c.g(this);
        this.d.e(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                aabj aabjVar = (aabj) obj;
                ampq e = aabjVar.e();
                ampq f = aabjVar.f();
                if (e.h()) {
                    h(((atoo) e.c()).e.I(), this.a.a((atoo) e.c(), aabjVar.g()));
                    return null;
                } else if (!f.h()) {
                    return null;
                } else {
                    dt dtVar = this.b;
                    arag aragVar = ((atpl) f.c()).c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    zag.r(dtVar, ajgl.b(aragVar), 0);
                    return null;
                }
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{aabj.class};
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        this.f.d((BottomUiContainer) this.b.findViewById(R.id.bottom_ui_container));
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        this.g.remove((akfi) obj);
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        this.g.add((akfi) obj);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        this.c.m(this);
        this.d.h(this);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
