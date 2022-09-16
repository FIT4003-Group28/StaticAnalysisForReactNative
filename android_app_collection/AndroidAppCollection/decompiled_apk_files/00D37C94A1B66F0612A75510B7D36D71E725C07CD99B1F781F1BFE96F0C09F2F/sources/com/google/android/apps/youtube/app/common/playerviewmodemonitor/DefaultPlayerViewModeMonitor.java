package com.google.android.apps.youtube.app.common.playerviewmodemonitor;

import com.google.android.apps.youtube.app.common.playerviewmodemonitor.DefaultPlayerViewModeMonitor;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DefaultPlayerViewModeMonitor implements f, ezh, nxg, ahsn, fze, fdt {
    public volatile ezx a;
    private final nxh b;
    private final fdu c;
    private final azpx d;
    private final azpx e;
    private final azpx f;
    private final azpx g;
    private final aypf h;
    private final Map i;
    private final ayoi j;
    private final ayoi k;
    private final InlinePlaybackLifecycleController l;
    private final ahso m;

    public DefaultPlayerViewModeMonitor(ayoi ayoiVar, nxh nxhVar, oah oahVar, fdu fduVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, ahso ahsoVar) {
        this.b = nxhVar;
        this.c = fduVar;
        this.l = inlinePlaybackLifecycleController;
        this.m = ahsoVar;
        azpx aO = azpm.aI(false).aO();
        this.e = aO;
        azpx aO2 = azpm.aI(Integer.valueOf(nxhVar.b)).aO();
        this.d = aO2;
        azpx aO3 = azpm.aI(false).aO();
        this.f = aO3;
        azpx aO4 = azpm.aI(fduVar.b).aO();
        this.g = aO4;
        azpx azpxVar = oahVar.a;
        ayrd.b(ayoiVar, "source1 is null");
        ayoi e = ayoi.n(new ayok[]{ayoiVar, aO2, aO, aO3, aO4, azpxVar}, new ayqq(), aynx.a).B().F(new ayqb() { // from class: fgw
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                DefaultPlayerViewModeMonitor.this.a = (ezx) obj;
            }
        }).aa().aE().e(0);
        this.j = e;
        this.h = new aypf();
        this.i = new HashMap();
        this.a = ezx.NONE;
        this.k = e.aA();
    }

    public static ezx l(int i, ezx ezxVar) {
        ampq j;
        if (i == 1) {
            j = ampq.j(ezx.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED);
        } else if (i == 2) {
            j = ampq.j(ezx.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED);
        } else if (i != 3) {
            j = i != 4 ? amon.a : ampq.j(ezx.WATCH_WHILE_SLIDING_FULLSCREEN_DISMISSED);
        } else {
            j = ampq.j(ezx.WATCH_WHILE_SLIDING_MAXIMIZED_FULLSCREEN);
        }
        return j.h() ? (ezx) j.c() : ezxVar;
    }

    @Override // defpackage.ezh
    public final ezx g() {
        return this.a;
    }

    @Override // defpackage.ezh
    public final ayoi h() {
        return this.j;
    }

    @Override // defpackage.ezh
    public final void i(final ezg ezgVar) {
        if (this.i.containsKey(ezgVar)) {
            return;
        }
        this.i.put(ezgVar, this.k.as(new ayqb() { // from class: fgv
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                List list = (List) obj;
                ezg.this.pb((ezx) list.get(0), (ezx) list.get(1));
            }
        }));
    }

    @Override // defpackage.ezh
    public final void j(ezg ezgVar) {
        aypg aypgVar = (aypg) this.i.remove(ezgVar);
        if (aypgVar != null) {
            aypgVar.qr();
        }
    }

    @Override // defpackage.fdt
    public final void k(fdq fdqVar) {
        this.g.c(fdqVar);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        this.b.a(this);
        this.c.d(this);
        this.l.l(this);
        this.m.b(this);
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.b.b(this);
        this.c.a.remove(this);
        this.l.c.a.remove(this);
        this.m.h(this);
        this.h.c();
    }

    @Override // defpackage.fze
    public final void lh(fyp fypVar, int i) {
        this.e.c(Boolean.valueOf(i != 0));
    }

    @Override // defpackage.ahsn
    public final void m(boolean z) {
        this.f.c(Boolean.valueOf(z));
    }

    @Override // defpackage.nxg
    public final void n(int i) {
        this.d.c(Integer.valueOf(i));
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
}
