package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: egt  reason: default package */
/* loaded from: classes3.dex */
public final class egt {
    public final Activity a;
    public final acth b;
    public final axnm c;
    public final azqb d;
    public final axnm e;
    public final axnm f;
    public ajgx g;
    public final axnm h;
    public final axnm i;
    public boolean j = true;
    private final aadd k;
    private final ayor l;

    public egt(Activity activity, aadd aaddVar, final aacz aaczVar, acth acthVar, axnm axnmVar, azqb azqbVar, final axnm axnmVar2, axnm axnmVar3, axnm axnmVar4, final axnm axnmVar5, final airw airwVar, axnm axnmVar6, final axnm axnmVar7, axnm axnmVar8, final ayor ayorVar, ayor ayorVar2, Executor executor) {
        this.a = activity;
        this.k = aaddVar;
        this.b = acthVar;
        this.c = axnmVar;
        this.d = azqbVar;
        this.h = axnmVar3;
        this.e = axnmVar6;
        this.f = axnmVar4;
        this.i = axnmVar8;
        this.l = ayorVar2;
        if (a()) {
            if (eog.av(aaczVar)) {
                executor.execute(new Runnable() { // from class: egr
                    @Override // java.lang.Runnable
                    public final void run() {
                        egt.this.d(axnmVar2, axnmVar5, airwVar, axnmVar7, ayorVar, aaczVar);
                    }
                });
                return;
            }
            axnmVar.get();
            azqbVar.get();
            axnmVar3.get();
            axnmVar4.get();
            axnmVar5.get();
            axnmVar6.get();
            axnmVar7.get();
            axnmVar8.get();
            d(axnmVar2, axnmVar5, airwVar, axnmVar7, ayorVar, aaczVar);
        }
    }

    public static boolean b(ezx ezxVar) {
        return ezxVar.equals(ezx.NONE) || ezxVar.equals(ezx.INLINE_MINIMAL) || ezxVar.equals(ezx.WATCH_WHILE_MINIMIZED);
    }

    public static final String c(aawr aawrVar) {
        if (aawrVar != null) {
            apnf apnfVar = aawrVar.a.f;
            if (apnfVar == null) {
                apnfVar = apnf.a;
            }
            if ((apnfVar.b & 1) == 0) {
                return null;
            }
            apnf apnfVar2 = aawrVar.a.f;
            if (apnfVar2 == null) {
                apnfVar2 = apnf.a;
            }
            apzg apzgVar = apnfVar2.c;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            return ntr.e((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apzgVar.qm(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint));
        }
        return null;
    }

    public final boolean a() {
        return eog.B(this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(axnm axnmVar, axnm axnmVar2, airw airwVar, final axnm axnmVar3, ayor ayorVar, aacz aaczVar) {
        ypf ypfVar = (ypf) axnmVar.get();
        ezh ezhVar = (ezh) this.h.get();
        ayoi o = ayoi.o(ypfVar.b(ype.RESUMED).A(2L, TimeUnit.SECONDS), ((egn) this.d.get()).b(), ezhVar.h().aA().I(efx.c).V(dzy.d).ad(ezhVar.g()).x(2L, TimeUnit.SECONDS).i(aynq.LATEST).W(), img.b);
        asxj asxjVar = aaczVar.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if (asxjVar.bF) {
            o = o.X(this.l);
        }
        o.ak(((itg) axnmVar2.get()).a(), eho.b).q(zna.t(ypfVar.a())).X(ayorVar).as(new ayqb() { // from class: egq
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                final egt egtVar = egt.this;
                axnm axnmVar4 = axnmVar3;
                ampr amprVar = (ampr) obj;
                aawr aawrVar = (aawr) amprVar.b;
                babp babpVar = (babp) amprVar.a;
                boolean booleanValue = ((Boolean) babpVar.a()).booleanValue();
                egm egmVar = (egm) babpVar.b();
                boolean z = false;
                boolean z2 = booleanValue && (egmVar.equals(egm.ACTIVE) || egmVar.equals(egm.ON_HOLD) || egmVar.equals(egm.SYSTEM_ACTIVE) || egmVar.equals(egm.SYSTEM_ON_HOLD)) && egt.b((ezx) babpVar.c());
                boolean booleanValue2 = ((Boolean) babpVar.a()).booleanValue();
                egm egmVar2 = (egm) babpVar.b();
                ezx ezxVar = (ezx) babpVar.c();
                boolean z3 = egmVar2.equals(egm.ACTIVE) || egmVar2.equals(egm.SYSTEM_ACTIVE);
                boolean z4 = !egt.b(ezxVar);
                if (booleanValue2 && z3 && z4) {
                    z = true;
                }
                nml nmlVar = (nml) axnmVar4.get();
                if (z || egt.c(aawrVar) == null || !Objects.equals(egt.c(aawrVar), nmlVar.i()) || !nmlVar.y()) {
                    airr airrVar = (airr) egtVar.f.get();
                    if (z) {
                        airrVar.a();
                        apnf apnfVar = aawrVar.a.f;
                        if (apnfVar == null) {
                            apnfVar = apnf.a;
                        }
                        if ((apnfVar.b & 1) != 0) {
                            if (((ezh) egtVar.h.get()).g().equals(ezx.WATCH_WHILE_FULLSCREEN)) {
                                ((ofu) egtVar.e.get()).c();
                            }
                            aafo aafoVar = (aafo) egtVar.c.get();
                            apnf apnfVar2 = aawrVar.a.f;
                            if (apnfVar2 == null) {
                                apnfVar2 = apnf.a;
                            }
                            apzg apzgVar = apnfVar2.c;
                            if (apzgVar == null) {
                                apzgVar = apzg.a;
                            }
                            aafoVar.c(apzgVar, amup.k("engagement_panel_close_listener_key", new nlz() { // from class: ego
                                @Override // defpackage.nlz
                                public final void a() {
                                    egt egtVar2 = egt.this;
                                    airr airrVar2 = (airr) egtVar2.f.get();
                                    if (!airrVar2.d() && egtVar2.j) {
                                        airrVar2.b();
                                    }
                                    ((egn) egtVar2.d.get()).c(apnc.BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_ENGAGE_PANEL);
                                }
                            }));
                        }
                    }
                    if (!z2) {
                        ajgx ajgxVar = egtVar.g;
                        if (ajgxVar == null) {
                            return;
                        }
                        ajgxVar.l();
                        egtVar.g = null;
                        airr airrVar2 = (airr) egtVar.f.get();
                        if (airrVar2.d() || !egtVar.j) {
                            return;
                        }
                        airrVar2.b();
                        return;
                    }
                    airrVar.a();
                    if (!egtVar.a()) {
                        return;
                    }
                    aruk arukVar = aawrVar.a;
                    if ((arukVar.b & 512) == 0) {
                        return;
                    }
                    apnf apnfVar3 = arukVar.f;
                    if (apnfVar3 == null) {
                        apnfVar3 = apnf.a;
                    }
                    aunb aunbVar = apnfVar3.d;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                    if (!aunbVar.qn(ConfirmDialogRendererOuterClass.confirmDialogRenderer)) {
                        return;
                    }
                    aqft aqftVar = (aqft) aunbVar.qm(ConfirmDialogRendererOuterClass.confirmDialogRenderer);
                    egn egnVar = (egn) egtVar.d.get();
                    egtVar.g = ajgx.g(egtVar.a, aqftVar, (aafo) egtVar.c.get(), egtVar.b.oi(), (ajgz) egtVar.i.get(), true, false, new egs(egnVar), null);
                    egnVar.d(apnc.BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_DIALOG);
                    return;
                }
                String c = egt.c(aawrVar);
                if (c == null) {
                    return;
                }
                aopa createBuilder = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a.createBuilder();
                createBuilder.copyOnWrite();
                HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.instance;
                hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c = 1;
                hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d = c;
                aopc aopcVar = (aopc) apzg.a.createBuilder();
                aopcVar.e(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint, (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.mo39build());
                ((aafo) egtVar.c.get()).a((apzg) aopcVar.mo39build());
            }
        });
        airwVar.G().i.h(zhn.b(ypfVar.a())).G(ayorVar).Z(new egp(this));
        airwVar.G().a.I().h(zhn.b(ypfVar.a())).G(ayorVar).Z(new egp(this, 1));
    }
}
