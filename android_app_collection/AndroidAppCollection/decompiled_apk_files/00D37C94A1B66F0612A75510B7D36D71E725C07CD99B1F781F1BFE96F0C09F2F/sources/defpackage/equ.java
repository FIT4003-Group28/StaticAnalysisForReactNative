package defpackage;

import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: equ */
/* loaded from: classes3.dex */
public final class equ implements aafl {
    private final ahcy a;
    private final fcl b;
    private final azqb c;
    private final jem d;
    private final Executor e;
    private final axxt f;

    public equ(ahcy ahcyVar, fcl fclVar, azqb azqbVar, jem jemVar, Executor executor, axxt axxtVar) {
        this.a = ahcyVar;
        this.b = fclVar;
        this.c = azqbVar;
        this.d = jemVar;
        this.e = executor;
        this.f = axxtVar;
    }

    public static /* synthetic */ void b(Throwable th) {
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
        sb.append("Failed to handle the error state when add the video.");
        sb.append(valueOf);
        zep.b(sb.toString());
    }

    private final void d(String str, boolean z) {
        if (this.b.h()) {
            agqv e = ((agrf) this.c.get()).a().m().e(str);
            agqu agquVar = e == null ? null : e.j;
            if (e == null || agquVar == null) {
                return;
            }
            this.a.f(agquVar, z);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
        sb.append("Trying to renew download (id=");
        sb.append(str);
        sb.append(") but user does not have downloads.");
        zep.l(sb.toString());
    }

    private final void e(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint, boolean z) {
        int i = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c;
        if (i != 7) {
            this.a.d(i == 1 ? (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d : "", z);
        } else {
            this.a.e((String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d, z);
        }
    }

    public final void c(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint, attp attpVar, acti actiVar, atpy atpyVar) {
        int i = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c;
        if (i != 7) {
            this.a.o(i == 1 ? (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d : "", attpVar, null, actiVar, atpyVar);
        } else {
            this.a.w((String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d, attpVar, actiVar, atpyVar);
        }
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        final String g;
        final attp attpVar;
        Boolean bool;
        final OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) apzgVar.qm(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
        int i = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c;
        String str = "";
        int i2 = 1;
        if (i == 1) {
            g = (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d;
        } else {
            g = aakj.g(i == 7 ? (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d : str);
        }
        int ag = akel.ag(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.f);
        if (ag == 0) {
            ag = 1;
        }
        boolean z = false;
        atpy atpyVar = null;
        switch (ag - 1) {
            case 1:
                Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
                if ((offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b & 32) != 0) {
                    aunb aunbVar = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.g;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                    attpVar = (attp) aunbVar.qm(OfflineabilityRendererOuterClass.offlineabilityRenderer);
                } else {
                    attpVar = null;
                }
                if (attpVar == null) {
                    if (I instanceof aqfa) {
                        aqfa aqfaVar = (aqfa) I;
                        aqez aqezVar = aqfaVar.t;
                        if (aqezVar == null) {
                            aqezVar = aqez.a;
                        }
                        if ((aqezVar.b & 1) != 0) {
                            aqez aqezVar2 = aqfaVar.t;
                            if (aqezVar2 == null) {
                                aqezVar2 = aqez.a;
                            }
                            attpVar = aqezVar2.c;
                            if (attpVar == null) {
                                attpVar = attp.a;
                            }
                        }
                        attpVar = null;
                    } else if (I instanceof audk) {
                        audk audkVar = (audk) I;
                        audj audjVar = audkVar.s;
                        if (audjVar == null) {
                            audjVar = audj.a;
                        }
                        if (audjVar.b == 60572968) {
                            audj audjVar2 = audkVar.s;
                            if (audjVar2 == null) {
                                audjVar2 = audj.a;
                            }
                            if (audjVar2.b == 60572968) {
                                attpVar = (attp) audjVar2.c;
                            } else {
                                attpVar = attp.a;
                            }
                        }
                        attpVar = null;
                    } else if (I instanceof arfe) {
                        arfe arfeVar = (arfe) I;
                        arfd arfdVar = arfeVar.t;
                        if (arfdVar == null) {
                            arfdVar = arfd.a;
                        }
                        if ((arfdVar.b & 1) != 0) {
                            arfd arfdVar2 = arfeVar.t;
                            if (arfdVar2 == null) {
                                arfdVar2 = arfd.a;
                            }
                            attpVar = arfdVar2.c;
                            if (attpVar == null) {
                                attpVar = attp.a;
                            }
                        }
                        attpVar = null;
                    } else if (I instanceof auex) {
                        auex auexVar = (auex) I;
                        auew auewVar = auexVar.q;
                        if (auewVar == null) {
                            auewVar = auew.a;
                        }
                        if ((auewVar.b & 1) != 0) {
                            auew auewVar2 = auexVar.q;
                            if (auewVar2 == null) {
                                auewVar2 = auew.a;
                            }
                            attpVar = auewVar2.c;
                            if (attpVar == null) {
                                attpVar = attp.a;
                            }
                        }
                        attpVar = null;
                    } else if (I instanceof awbh) {
                        awbh awbhVar = (awbh) I;
                        if ((awbhVar.b & 1024) != 0) {
                            awbg awbgVar = awbhVar.m;
                            if (awbgVar == null) {
                                awbgVar = awbg.a;
                            }
                            attpVar = awbgVar.b;
                            if (attpVar == null) {
                                attpVar = attp.a;
                            }
                        }
                        attpVar = null;
                    } else if (I instanceof awar) {
                        awar awarVar = (awar) I;
                        awaq awaqVar = awarVar.t;
                        if (awaqVar == null) {
                            awaqVar = awaq.a;
                        }
                        if ((awaqVar.b & 1) != 0) {
                            awaq awaqVar2 = awarVar.t;
                            if (awaqVar2 == null) {
                                awaqVar2 = awaq.a;
                            }
                            attpVar = awaqVar2.c;
                            if (attpVar == null) {
                                attpVar = attp.a;
                            }
                        }
                        attpVar = null;
                    } else if (I instanceof itx) {
                        itx itxVar = (itx) I;
                        awaq awaqVar3 = itxVar.a().t;
                        if (awaqVar3 == null) {
                            awaqVar3 = awaq.a;
                        }
                        if ((awaqVar3.b & 1) != 0) {
                            awaq awaqVar4 = itxVar.a().t;
                            if (awaqVar4 == null) {
                                awaqVar4 = awaq.a;
                            }
                            attpVar = awaqVar4.c;
                            if (attpVar == null) {
                                attpVar = attp.a;
                            }
                        }
                        attpVar = null;
                    } else {
                        if (I instanceof avxc) {
                            avxc avxcVar = (avxc) I;
                            avxb avxbVar = avxcVar.n;
                            if (avxbVar == null) {
                                avxbVar = avxb.a;
                            }
                            if (avxbVar.b == 60572968) {
                                avxb avxbVar2 = avxcVar.n;
                                if (avxbVar2 == null) {
                                    avxbVar2 = avxb.a;
                                }
                                if (avxbVar2.b == 60572968) {
                                    attpVar = (attp) avxbVar2.c;
                                } else {
                                    attpVar = attp.a;
                                }
                            }
                        }
                        attpVar = null;
                    }
                }
                if (attpVar == null) {
                    String valueOf = String.valueOf(I);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    sb.append("Object is not an offlineable video: ");
                    sb.append(valueOf);
                    zep.b(sb.toString());
                    return;
                }
                final acti actiVar = (acti) zew.K(map, "com.google.android.libraries.youtube.logging.interaction_logger", acti.class);
                aqxe aqxeVar = this.f.a.b().C;
                if (aqxeVar == null) {
                    aqxeVar = aqxe.a;
                }
                if (aqxeVar.a(45353483L)) {
                    aoqp aoqpVar = aqxeVar.b;
                    if (!aoqpVar.containsKey(45353483L)) {
                        throw new IllegalArgumentException();
                    }
                    aqxf aqxfVar = (aqxf) aoqpVar.get(45353483L);
                    if (aqxfVar.b == 1) {
                        z = ((Boolean) aqxfVar.c).booleanValue();
                    }
                    bool = Boolean.valueOf(z);
                } else {
                    bool = false;
                }
                if (!bool.booleanValue()) {
                    if ((offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b & 64) != 0 && (atpyVar = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.h) == null) {
                        atpyVar = atpy.a;
                    }
                    c(offlineVideoEndpointOuterClass$OfflineVideoEndpoint, attpVar, actiVar, atpyVar);
                    return;
                }
                final jem jemVar = this.d;
                ankt i3 = anii.i(anko.q(((agrf) jemVar.c.get()).a().m().h(g)), new anir() { // from class: jel
                    @Override // defpackage.anir
                    public final ankt a(Object obj) {
                        jem jemVar2 = jem.this;
                        ampq ampqVar = (ampq) obj;
                        if (!ampqVar.h()) {
                            return anlz.q(ampr.a(null, false));
                        }
                        return anii.h(((agss) jemVar2.b.get()).b((agqv) ampqVar.c()), new jbv((agqv) ampqVar.c(), 2), jemVar2.f);
                    }
                }, jemVar.f);
                ylx.k(i3, jemVar.e, gpe.p, new ylw() { // from class: jek
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        jem jemVar2 = jem.this;
                        String str2 = g;
                        acti actiVar2 = actiVar;
                        ampr amprVar = (ampr) obj;
                        agqv agqvVar = (agqv) amprVar.a;
                        boolean booleanValue = ((Boolean) amprVar.b).booleanValue();
                        if (agqvVar == null || !booleanValue) {
                            return;
                        }
                        if (jemVar2.b(agqvVar)) {
                            jemVar2.a.n(null, str2, null, true);
                        } else if (agqvVar.r()) {
                            zag.q(jemVar2.d, R.string.add_video_to_offline_error, 1);
                        } else if (agqvVar.x()) {
                            agqu agquVar = agqvVar.j;
                            if (agquVar.e()) {
                                jemVar2.a.f(agquVar, true);
                                return;
                            }
                            Object c = agquVar.c();
                            if (c == null) {
                                return;
                            }
                            jemVar2.a.r(str2, c, actiVar2);
                        } else {
                            jemVar2.a.d(str2, true);
                        }
                    }
                });
                ylx.k(anii.h(i3, gvq.p, jemVar.f), this.e, dzl.h, new ylw() { // from class: eqt
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        atpy atpyVar2;
                        equ equVar = equ.this;
                        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint2 = offlineVideoEndpointOuterClass$OfflineVideoEndpoint;
                        attp attpVar2 = attpVar;
                        acti actiVar2 = actiVar;
                        if (Boolean.TRUE.equals((Boolean) obj)) {
                            return;
                        }
                        if ((offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.b & 64) != 0) {
                            atpyVar2 = offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.h;
                            if (atpyVar2 == null) {
                                atpyVar2 = atpy.a;
                            }
                        } else {
                            atpyVar2 = null;
                        }
                        equVar.c(offlineVideoEndpointOuterClass$OfflineVideoEndpoint2, attpVar2, actiVar2, atpyVar2);
                    }
                });
                return;
            case 2:
                e(offlineVideoEndpointOuterClass$OfflineVideoEndpoint, false);
                return;
            case 3:
                if (this.b.h()) {
                    ((agrf) this.c.get()).a().m().x(g);
                    return;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(g).length() + 63);
                sb2.append("Trying to pause download (id=");
                sb2.append(g);
                sb2.append(") but user does not have downloads");
                zep.l(sb2.toString());
                return;
            case 4:
                this.a.t();
                return;
            case 5:
                if (this.b.h()) {
                    ((agrf) this.c.get()).a().m().z(g);
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(g).length() + 65);
                sb3.append("Trying to resume download (id=");
                sb3.append(g);
                sb3.append(") but user does not have downloads.");
                zep.l(sb3.toString());
                return;
            case 6:
            default:
                int ag2 = akel.ag(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.f);
                if (ag2 != 0) {
                    i2 = ag2;
                }
                String ah = akel.ah(i2);
                StringBuilder sb4 = new StringBuilder(String.valueOf(ah).length() + 34);
                sb4.append("Unsupported Offline Video Action: ");
                sb4.append(ah);
                zep.l(sb4.toString());
                return;
            case 7:
                int i4 = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c;
                if (i4 != 7) {
                    ahcy ahcyVar = this.a;
                    String str2 = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.e;
                    if (i4 == 1) {
                        str = (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d;
                    }
                    ahcyVar.n(str2, str, null, true);
                    return;
                }
                this.a.v(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.e, (String) offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d);
                return;
            case 8:
                d(g, false);
                return;
            case 9:
                e(offlineVideoEndpointOuterClass$OfflineVideoEndpoint, true);
                return;
            case 10:
                d(g, true);
                return;
        }
    }
}
