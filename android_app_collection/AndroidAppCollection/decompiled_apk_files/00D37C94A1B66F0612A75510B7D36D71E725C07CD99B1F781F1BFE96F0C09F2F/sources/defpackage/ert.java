package defpackage;

import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ert  reason: default package */
/* loaded from: classes3.dex */
public final class ert implements aafl {
    public static final /* synthetic */ int b = 0;
    public final azqb a;
    private final nmu c;
    private final axnm d;
    private final axnm e;
    private final npe f;
    private aypg g;
    private final aacz h;

    public ert(nmu nmuVar, aacz aaczVar, azqb azqbVar, axnm axnmVar, axnm axnmVar2, npe npeVar) {
        this.c = nmuVar;
        this.h = aaczVar;
        this.a = azqbVar;
        this.e = axnmVar2;
        this.d = axnmVar;
        this.f = npeVar;
    }

    public final void b() {
        aypg aypgVar = this.g;
        if (aypgVar == null || aypgVar.e()) {
            return;
        }
        ayqi.c((AtomicReference) this.g);
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aqvl aqvlVar;
        aqvq aqvqVar;
        aqvq aqvqVar2;
        b();
        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apzgVar.qm(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
        if ((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b & 4) == 0) {
            nmu nmuVar = this.c;
            if (showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c == 10) {
                aqvlVar = (aqvl) showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d;
            } else {
                aqvlVar = aqvl.a;
            }
            aqvk b2 = aqvk.b(aqvlVar.c);
            if (b2 == null) {
                b2 = aqvk.ENGAGEMENT_PANEL_SURFACE_UNKNOWN;
            }
            nml a = nmuVar.a(b2);
            if (ntr.j(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint, a)) {
                return;
            }
            if ((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b & 64) != 0) {
                aqvm aqvmVar = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.h;
                if (aqvmVar == null) {
                    aqvmVar = aqvm.a;
                }
                if (aqvmVar.b == 138681066) {
                    aqvm aqvmVar2 = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.h;
                    if (aqvmVar2 == null) {
                        aqvmVar2 = aqvm.a;
                    }
                    if (aqvmVar2.b == 138681066) {
                        aqvqVar = (aqvq) aqvmVar2.c;
                    } else {
                        aqvqVar = aqvq.b;
                    }
                    if (!a.x(ntr.d(aqvqVar))) {
                        if (aqvmVar2.b == 138681066) {
                            aqvqVar2 = (aqvq) aqvmVar2.c;
                        } else {
                            aqvqVar2 = aqvq.b;
                        }
                        a.q(aqvqVar2);
                    }
                }
            }
            ntr.i(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint, (nix) this.a.get());
            String h = ntr.h(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint);
            if (h == null) {
                h = (String) zew.K(map, "engagement_panel_id_key", String.class);
            }
            ntr.g(apzgVar, a, (nlz) zew.K(map, "engagement_panel_close_listener_key", nlz.class), h, eog.aC(this.h) && ((Boolean) zew.J(map, "triggered_on_ui_ready", false)).booleanValue(), map);
            if (!eog.aE(this.h) || !((ezh) this.e.get()).g().equals(ezx.WATCH_WHILE_FULLSCREEN) || ((nqr) this.d.get()).b != nqq.PORTRAIT_WATCH_PANEL || a.c() == null) {
                return;
            }
            this.g = a.h().l.u(efx.h).W().an(false).e().R(new aypv() { // from class: ers
                @Override // defpackage.aypv
                public final void a() {
                    ((nix) ert.this.a.get()).p(false);
                }
            });
            return;
        }
        final npe npeVar = this.f;
        if (!npe.a(apzgVar).isPresent()) {
            return;
        }
        final ayos an = ayoi.m(npeVar.c.b(), ayoi.T(apzgVar), lum.e).V(nox.c).an(Optional.empty());
        npeVar.a.f(new Callable() { // from class: npd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final npe npeVar2 = npe.this;
                return an.S(new ayqb() { // from class: npc
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        String e;
                        aqvq aqvqVar3;
                        byte[] bArr;
                        aqvl aqvlVar2;
                        aqvl aqvlVar3;
                        npe npeVar3 = npe.this;
                        Optional optional = (Optional) obj;
                        if (!optional.isPresent()) {
                            return;
                        }
                        nml nmlVar = (nml) ((ampr) optional.get()).a;
                        apzg apzgVar2 = (apzg) ((ampr) optional.get()).b;
                        Optional a2 = npe.a(apzgVar2);
                        if (!a2.isPresent() || ntr.j((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) a2.get(), nmlVar) || (e = ntr.e((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) a2.get())) == null) {
                            return;
                        }
                        ntr.i((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) a2.get(), (nix) npeVar3.g.get());
                        auvf auvfVar = ((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) a2.get()).e;
                        if (auvfVar == null) {
                            auvfVar = auvf.a;
                        }
                        aqvm aqvmVar3 = auvfVar.c;
                        if (aqvmVar3 == null) {
                            aqvmVar3 = aqvm.a;
                        }
                        if (aqvmVar3.b == 138681066) {
                            aqvqVar3 = (aqvq) aqvmVar3.c;
                        } else {
                            aqvqVar3 = aqvq.b;
                        }
                        aopa mo52toBuilder = aqvqVar3.mo52toBuilder();
                        int i = aqvqVar3.d;
                        if (i != 1) {
                            if (i == 18) {
                                aqvlVar2 = (aqvl) aqvqVar3.e;
                            } else {
                                aqvlVar2 = aqvl.a;
                            }
                            if ((aqvlVar2.b & 2) == 0) {
                                if (aqvqVar3.d == 18) {
                                    aqvlVar3 = (aqvl) aqvqVar3.e;
                                } else {
                                    aqvlVar3 = aqvl.a;
                                }
                                aopa mo52toBuilder2 = aqvlVar3.mo52toBuilder();
                                mo52toBuilder2.copyOnWrite();
                                aqvl aqvlVar4 = (aqvl) mo52toBuilder2.instance;
                                aqvlVar4.b |= 2;
                                aqvlVar4.d = e;
                                mo52toBuilder.copyOnWrite();
                                aqvq aqvqVar4 = (aqvq) mo52toBuilder.instance;
                                aqvl aqvlVar5 = (aqvl) mo52toBuilder2.mo39build();
                                aqvlVar5.getClass();
                                aqvqVar4.e = aqvlVar5;
                                aqvqVar4.d = 18;
                            }
                        }
                        if ((aqvqVar3.c & 1024) == 0) {
                            mo52toBuilder.copyOnWrite();
                            aqvq aqvqVar5 = (aqvq) mo52toBuilder.instance;
                            aqvqVar5.k = 1;
                            aqvqVar5.c |= 1024;
                        }
                        aqvq aqvqVar6 = (aqvq) mo52toBuilder.mo39build();
                        nmlVar.s(aqvqVar6, null, true, null, true);
                        Optional g = ntr.g(apzgVar2, nmlVar, null, ntr.h((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) a2.get()), false, null);
                        if (!g.isPresent()) {
                            return;
                        }
                        if ((aqvqVar6.c & 16) == 0) {
                            npe.b((nmc) g.get(), true);
                        }
                        aban abanVar = npeVar3.d;
                        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2 = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) a2.get();
                        if (apzgVar2 == null || (apzgVar2.b & 1) == 0) {
                            bArr = aadi.b;
                        } else {
                            bArr = apzgVar2.c.I();
                        }
                        abam d = npeVar3.d.d();
                        String e2 = ntr.e(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2);
                        e2.getClass();
                        d.a = e2;
                        auvf auvfVar2 = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2.e;
                        if (auvfVar2 == null) {
                            auvfVar2 = auvf.a;
                        }
                        if ((auvfVar2.b & 2) != 0) {
                            auvf auvfVar3 = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2.e;
                            if (auvfVar3 == null) {
                                auvfVar3 = auvf.a;
                            }
                            d.c = abam.g(auvfVar3.d);
                        }
                        d.k(bArr);
                        ylx.n(npeVar3.b, abanVar.a.g(d, npeVar3.e), new npb(npeVar3, g), new npb(npeVar3, g, 1));
                    }
                });
            }
        });
    }
}
