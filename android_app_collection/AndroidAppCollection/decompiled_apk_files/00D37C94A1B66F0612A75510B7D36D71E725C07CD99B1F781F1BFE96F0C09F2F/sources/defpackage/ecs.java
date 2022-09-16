package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ecs  reason: default package */
/* loaded from: classes3.dex */
public final class ecs implements ecz, ecx, xgo {
    public final azqb a;
    public final azqb b;
    public final Map c = new HashMap();
    private final azqb d;
    private final azqb e;
    private final azqb f;
    private final Executor g;
    private eda h;

    public ecs(edd eddVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, Executor executor) {
        this.d = azqbVar;
        this.a = azqbVar2;
        this.b = azqbVar3;
        this.e = azqbVar4;
        this.f = azqbVar5;
        this.g = executor;
        eddVar.a(this);
    }

    public final void a(ecr ecrVar) {
        if (ecrVar.e != null || ecrVar.d == null || ecrVar.c == null || !ecrVar.b.b.isDone()) {
            return;
        }
        try {
            ect ectVar = (ect) this.f.get();
            xdu xduVar = ecrVar.a;
            xci xciVar = ecrVar.c;
            String str = ecrVar.d;
            wll wllVar = (wll) ectVar.a.get();
            wli wliVar = (wli) ectVar.b.get();
            wwf wwfVar = ectVar.d;
            ecrVar.e = new ecu(wllVar, wliVar, ((wwh) ectVar.c.get()).a(xduVar, xciVar), (asaj) ecrVar.b.b.get(), xduVar, xciVar, str);
            ecu ecuVar = ecrVar.e;
            if (ecuVar.c != 0) {
                return;
            }
            ecuVar.c = 1;
            ecuVar.a.a(ecuVar);
        } catch (InterruptedException | ExecutionException | wuo e) {
            wwf.a(ecrVar.a, e.getMessage());
        }
    }

    @Override // defpackage.ecx
    public final void b() {
        for (ecr ecrVar : this.c.values()) {
            ecu ecuVar = ecrVar.e;
            if (ecuVar != null) {
                ecuVar.a.c(ecuVar);
                if (ecuVar.c == 2) {
                    ecuVar.c = 3;
                    ecuVar.b.b(2, new afzn[0]);
                }
            }
            if (ecrVar.f && ecrVar.c != null) {
                ((wkt) this.b.get()).e(xcb.a, ecrVar.a, ecrVar.c, 4);
            }
            if (ecrVar.c != null) {
                xcb xcbVar = xcb.a;
                xdu xduVar = ecrVar.a;
                ((wkt) this.b.get()).u(ecrVar.c);
            }
            if (ecrVar.f) {
                ((wkt) this.b.get()).l(xcb.a, ecrVar.a);
            }
            ((wkt) this.b.get()).p(xcb.a, ecrVar.a);
        }
        this.c.clear();
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void c(Bundle bundle) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.ecx
    public final void f(xdo xdoVar, String str) {
        ecr ecrVar = (ecr) this.c.get(xdoVar.a);
        if (ecrVar == null) {
            return;
        }
        ecrVar.d = str;
        a(ecrVar);
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.ecx
    public final /* synthetic */ void h(xdo xdoVar) {
    }

    @Override // defpackage.xgo
    public final void i(xgb xgbVar) {
        if (xgbVar != xgb.SKIP) {
            return;
        }
        eda edaVar = this.h;
        if (edaVar == null) {
            wwf.a(null, "Received onMuteAdEvent with no registered reelMuteRequestApi");
            return;
        }
        ylr.c();
        ((ico) edaVar).bg(iah.a(4), true);
    }

    @Override // defpackage.ecx
    public final void j(List list) {
        int i;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            xdo xdoVar = (xdo) it.next();
            ecr ecrVar = new ecr(xdu.b(((wwd) this.d.get()).b.b(apcd.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM), apcd.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM, 3, xac.b(new xbn(xdoVar))), xdoVar);
            arrayList.add(ecrVar);
            this.c.put(xdoVar.a, ecrVar);
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            final ecr ecrVar2 = (ecr) arrayList.get(i);
            ((wkt) this.b.get()).o(xcb.a, ecrVar2.a);
            ecrVar2.b.b.qY(new Runnable() { // from class: ecq
                @Override // java.lang.Runnable
                public final void run() {
                    avww avwwVar;
                    amup b;
                    aoyb aoybVar;
                    ecs ecsVar = ecs.this;
                    ecr ecrVar3 = ecrVar2;
                    if (ecsVar.c.containsKey(ecrVar3.b.a)) {
                        try {
                            asaj asajVar = (asaj) ecrVar3.b.b.get();
                            if (asajVar == null) {
                                return;
                            }
                            Iterator it2 = asajVar.m.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    avwwVar = null;
                                    break;
                                }
                                asac asacVar = (asac) it2.next();
                                if (asacVar.b == 84813246) {
                                    aoybVar = (aoyb) asacVar.c;
                                } else {
                                    aoybVar = aoyb.a;
                                }
                                for (aoyc aoycVar : aoybVar.c) {
                                    if ((aoycVar.b & 64) != 0) {
                                        avwwVar = aoycVar.g;
                                        if (avwwVar == null) {
                                            avwwVar = avww.a;
                                        }
                                    }
                                }
                            }
                            if (avwwVar == null) {
                                return;
                            }
                            wvx wvxVar = (wvx) ecsVar.a.get();
                            xdu xduVar = ecrVar3.a;
                            xdo xdoVar2 = ecrVar3.b;
                            String a = wvxVar.c.a(apcb.LAYOUT_TYPE_MEDIA, xduVar.a);
                            apcb apcbVar = apcb.LAYOUT_TYPE_MEDIA;
                            wwc wwcVar = wvxVar.b;
                            if (!xrz.b(wwcVar.a)) {
                                b = amyc.b;
                            } else {
                                amum h = amup.h();
                                apai apaiVar = avwwVar.c;
                                if (apaiVar == null) {
                                    apaiVar = apai.a;
                                }
                                if (!apaiVar.m.isEmpty()) {
                                    wzp a2 = wzp.a(wwcVar.b.c(apcf.TRIGGER_TYPE_ACTIVE_VIEW_VIEWABLE_CRITERIA_SATISFIED), a);
                                    apai apaiVar2 = avwwVar.c;
                                    if (apaiVar2 == null) {
                                        apaiVar2 = apai.a;
                                    }
                                    h.f(a2, apaiVar2.m);
                                }
                                apai apaiVar3 = avwwVar.c;
                                if (apaiVar3 == null) {
                                    apaiVar3 = apai.a;
                                }
                                if (!apaiVar3.n.isEmpty()) {
                                    wzl a3 = wzl.a(wwcVar.b.c(apcf.TRIGGER_TYPE_ACTIVE_VIEW_MEASURABLE_CRITERIA_SATISFIED), a);
                                    apai apaiVar4 = avwwVar.c;
                                    if (apaiVar4 == null) {
                                        apaiVar4 = apai.a;
                                    }
                                    h.f(a3, apaiVar4.n);
                                }
                                apai apaiVar5 = avwwVar.c;
                                if (apaiVar5 == null) {
                                    apaiVar5 = apai.a;
                                }
                                if (!apaiVar5.o.isEmpty()) {
                                    wzk a4 = wzk.a(wwcVar.b.c(apcf.TRIGGER_TYPE_ACTIVE_VIEW_GROUPM_VIEWABLE_CRITERIA_SATISFIED), a);
                                    apai apaiVar6 = avwwVar.c;
                                    if (apaiVar6 == null) {
                                        apaiVar6 = apai.a;
                                    }
                                    h.f(a4, apaiVar6.o);
                                }
                                b = h.b();
                            }
                            amup amupVar = b;
                            wvy wvyVar = wvxVar.a;
                            apai apaiVar7 = avwwVar.c;
                            if (apaiVar7 == null) {
                                apaiVar7 = apai.a;
                            }
                            ecrVar3.c = new xci(a, apcbVar, 3, amuk.q(), amuk.q(), amuk.q(), amupVar, amon.a, amon.a, ampq.j(wvyVar.a(new VideoAdTrackingModel(apaiVar7))), xac.b(new xbl(asajVar), new xbn(xdoVar2)));
                            ((wkt) ecsVar.b.get()).f(xcb.a, ecrVar3.a, ecrVar3.c);
                            ecsVar.a(ecrVar3);
                            if (!ecrVar3.f) {
                                return;
                            }
                            ((wkt) ecsVar.b.get()).b(xcb.a, ecrVar3.a, ecrVar3.c);
                        } catch (InterruptedException | ExecutionException unused) {
                        }
                    }
                }
            }, this.g);
        }
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.ecx
    public final void l(xdo xdoVar) {
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = xdoVar.a;
        if (!this.c.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
            wwf.a(null, "Got onPageEnter for unregistered reel");
            return;
        }
        ecr ecrVar = (ecr) this.c.get(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        ecrVar.f = true;
        ((wkt) this.b.get()).i(xcb.a, ecrVar.a);
        if (ecrVar.c == null) {
            return;
        }
        ((wkt) this.b.get()).b(xcb.a, ecrVar.a, ecrVar.c);
    }

    @Override // defpackage.ecx
    public final void m(int i, xdo xdoVar) {
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = xdoVar.a;
        if (!this.c.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
            wwf.a(null, "Got onPageExit for unregistered reel");
            return;
        }
        ecr ecrVar = (ecr) this.c.get(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        try {
            if (ecrVar.c == null) {
                wwf.a(ecrVar.a, "Got onPageExit with playerResponse not yet bound");
            } else {
                if (ecrVar.f) {
                    ((wkt) this.b.get()).e(xcb.a, ecrVar.a, ecrVar.c, i != 0 ? i != 1 ? 3 : 0 : 2);
                }
                ecu ecuVar = ecrVar.e;
                if (ecuVar != null && ecuVar.c == 2 && i == 0) {
                    ecuVar.b.a(17, new afzn[0]);
                }
            }
            ((wkt) this.b.get()).l(xcb.a, ecrVar.a);
        } finally {
            ecrVar.f = false;
        }
    }

    @Override // defpackage.ecz
    public final void n(ecy ecyVar) {
        ecyVar.a(this);
    }

    @Override // defpackage.ecz
    public final void o(eda edaVar) {
        try {
            ((xgp) this.e.get()).c(this);
        } catch (wlb e) {
            wwf.a(null, e.getMessage());
        }
        this.h = edaVar;
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void q(int i, int i2) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void r(DisplayMetrics displayMetrics, Rect rect, Rect rect2) {
    }

    @Override // defpackage.ecz
    public final void s() {
        ((xgp) this.e.get()).l(this);
        this.h = null;
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void t(boolean z) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // defpackage.ecx
    public final /* synthetic */ void v(xdo xdoVar) {
    }
}
