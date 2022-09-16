package com.google.android.apps.youtube.app.common.ui.tooltip;

import com.google.android.apps.youtube.app.common.ui.tooltip.TooltipPlayerResponseMonitor;
import java.util.Iterator;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class TooltipPlayerResponseMonitor implements f, ezg, ynl {
    public String a;
    public String b;
    private final akfw c;
    private final yni d;
    private final airw e;
    private final aypf f = new aypf();
    private final aacz g;

    public TooltipPlayerResponseMonitor(akfw akfwVar, yni yniVar, airw airwVar, aacz aaczVar) {
        this.c = akfwVar;
        this.d = yniVar;
        this.e = airwVar;
        this.g = aaczVar;
    }

    private final void h() {
        this.c.g(this.b);
        this.b = null;
    }

    public final void g(ahhw ahhwVar) {
        avjf avjfVar;
        asaj asajVar = ahhwVar.b() != null ? ahhwVar.b().a : null;
        if (ahhwVar.c() != aika.NEW || asajVar == null) {
            return;
        }
        final String e = ahhwVar.e();
        if (e == null || e.equals(this.a)) {
            h();
        }
        this.a = e;
        Iterator it = asajVar.u.iterator();
        while (true) {
            if (!it.hasNext()) {
                avjfVar = null;
                break;
            }
            asaf asafVar = (asaf) it.next();
            if ((asafVar.b & 4) != 0) {
                avjfVar = asafVar.e;
                if (avjfVar == null) {
                    avjfVar = avjf.a;
                }
            }
        }
        if (avjfVar == null) {
            this.b = null;
            return;
        }
        this.c.e(avjfVar, new ampt() { // from class: ggc
            @Override // defpackage.ampt
            public final boolean a(Object obj) {
                TooltipPlayerResponseMonitor tooltipPlayerResponseMonitor = TooltipPlayerResponseMonitor.this;
                String str = e;
                avjf avjfVar2 = (avjf) obj;
                return (avjfVar2.b & 2) != 0 && avjfVar2.d.equals(tooltipPlayerResponseMonitor.b) && str != null && str.equals(tooltipPlayerResponseMonitor.a);
            }
        });
        this.b = avjfVar.d;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                g((ahhw) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (eog.aq(this.g)) {
            this.f.c();
        } else {
            this.d.m(this);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (eog.aq(this.g)) {
            this.f.c();
            this.f.g(this.e.G().b.aa(new ayqb() { // from class: ggd
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    TooltipPlayerResponseMonitor.this.g((ahhw) obj);
                }
            }, fzc.h));
            return;
        }
        this.d.g(this);
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (ezxVar != ezx.NONE || this.b == null) {
            return;
        }
        h();
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
