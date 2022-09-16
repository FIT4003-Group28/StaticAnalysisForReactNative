package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: PG */
/* renamed from: wmh  reason: default package */
/* loaded from: classes4.dex */
public final class wmh implements xgp, xfl, ahvv, ynl {
    public final azqb a;
    public final azqb b;
    public final azqb c;
    public xgo e;
    private final azqb f;
    private final azqb g;
    private final azqb h;
    private final aadd i;
    private xfm j;
    public final Set d = new CopyOnWriteArraySet();
    private xgu k = xgu.a().a();

    public wmh(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, yni yniVar, aadd aaddVar) {
        this.a = azqbVar;
        this.f = azqbVar2;
        this.g = azqbVar3;
        this.b = azqbVar4;
        this.c = azqbVar5;
        this.h = azqbVar6;
        this.i = aaddVar;
        yniVar.g(this);
        yniVar.a(this, wxr.class, new ynj() { // from class: wmg
            @Override // defpackage.ynj
            public final void a(Object obj) {
                wxr wxrVar = (wxr) obj;
                for (xgn xgnVar : wmh.this.d) {
                    xgnVar.b(wxrVar);
                }
            }
        });
    }

    private final boolean q() {
        return this.j != null;
    }

    @Override // defpackage.xgp
    public final xfk a() {
        xfm xfmVar = this.j;
        if (xfmVar == null) {
            return null;
        }
        return xfmVar.a;
    }

    @Override // defpackage.xgp
    public final void b(xgn xgnVar) {
        this.d.add(xgnVar);
    }

    @Override // defpackage.xgp
    public final void c(xgo xgoVar) {
        if (this.e == null) {
            this.e = xgoVar;
            return;
        }
        throw new wlb("Tried to override existing listener");
    }

    @Override // defpackage.xgp
    public final void d() {
        m(null);
    }

    @Override // defpackage.xfl
    public final void e() {
        if (!q()) {
            wwf.a(null, "Ignoring onAdClickthrough because adOverlay inaccessible");
        } else if (((wxc) this.f.get()).d(this.j.a)) {
        } else {
            if (xrz.m(this.i)) {
                ((wvu) this.h.get()).d();
            }
            xgo xgoVar = this.e;
            if (xgoVar == null) {
                return;
            }
            xgoVar.d();
        }
    }

    @Override // defpackage.xgp
    public final void g(aozt aoztVar) {
        xfm xfmVar = this.j;
        if (xfmVar != null) {
            xfj[] xfjVarArr = xfmVar.c;
            int length = xfjVarArr.length;
            for (int i = 0; i < length; i = 1) {
                xfjVarArr[0].a(aoztVar);
            }
        }
    }

    @Override // defpackage.xgp
    public final void h(wxp wxpVar) {
        for (xgn xgnVar : this.d) {
            xgnVar.a(wxpVar);
        }
    }

    @Override // defpackage.ahvv
    public final void i() {
        xgo xgoVar = this.e;
        if (xgoVar != null) {
            xgoVar.k();
        }
    }

    @Override // defpackage.xgp
    public final void j(DisplayMetrics displayMetrics, Rect rect, Rect rect2) {
        xgo xgoVar = this.e;
        if (xgoVar != null) {
            xgoVar.r(displayMetrics, rect, rect2);
        }
    }

    @Override // defpackage.xgp
    public final void k(xgn xgnVar) {
        this.d.remove(xgnVar);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                wxm wxmVar = (wxm) obj;
                e();
                return null;
            } else if (i == 1) {
                xgc xgcVar = (xgc) obj;
                xgo xgoVar = this.e;
                if (xgoVar == null) {
                    return null;
                }
                xgoVar.i(xgcVar.a());
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{wxm.class, xgc.class};
    }

    @Override // defpackage.xgp
    public final void l(xgo xgoVar) {
        xgo xgoVar2 = this.e;
        if (xgoVar2 == null || akzj.f(xgoVar, xgoVar2)) {
            this.e = null;
        } else {
            wwf.a(null, "Tried to remove unassociated listener");
        }
    }

    @Override // defpackage.xgp
    public final void m(xfm xfmVar) {
        xfm xfmVar2 = this.j;
        aafo aafoVar = null;
        if (xfmVar2 != null) {
            xfmVar2.d = null;
        }
        this.j = xfmVar;
        if (xfmVar != null) {
            xfmVar.d = this;
            p(this.k);
        }
        wmt wmtVar = (wmt) this.g.get();
        if (xfmVar != null) {
            aafoVar = xfmVar.b;
        }
        wmtVar.a = aafoVar;
    }

    @Override // defpackage.xgp
    public final void n(boolean z) {
        xgo xgoVar = this.e;
        if (xgoVar != null) {
            xgoVar.t(z);
        }
    }

    @Override // defpackage.xgp
    public final void o(boolean z) {
        xgo xgoVar = this.e;
        if (xgoVar != null) {
            xgoVar.u(z);
        }
    }

    @Override // defpackage.xgp
    public final void p(xgu xguVar) {
        this.k = xguVar;
        if (!q()) {
            return;
        }
        this.j.a.qV(xguVar);
    }
}
