package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.service;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ab;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class i implements airt, ynl {
    final /* synthetic */ j a;

    public i(j jVar) {
        this.a = jVar;
    }

    private final void c() {
        j jVar = this.a;
        jVar.q.d(R.id.api_watch_in_youtube_button, jVar.o != null);
    }

    public final void a(ahhm ahhmVar) {
        aube aubeVar;
        aqts aqtsVar;
        apoj apojVar;
        aqts aqtsVar2;
        WatchNextResponseModel a = ahhmVar.a();
        if (ahhmVar.c() == aijx.VIDEO_WATCH_LOADED && a != null) {
            asgf asgfVar = a.a.f;
            if (asgfVar == null) {
                asgfVar = asgf.a;
            }
            if (asgfVar.b == 78882851) {
                aubeVar = (aube) asgfVar.c;
            } else {
                aubeVar = aube.a;
            }
            if ((aubeVar.b & 1048576) != 0) {
                j jVar = this.a;
                apok apokVar = aubeVar.o;
                if (apokVar == null) {
                    apokVar = apok.a;
                }
                apoj apojVar2 = apokVar.c;
                if (apojVar2 == null) {
                    apojVar2 = apoj.a;
                }
                jVar.o = apojVar2;
                c();
            } else {
                this.a.o = null;
                c();
            }
            boolean z = false;
            if ((aubeVar.b & 4096) != 0) {
                aubj aubjVar = aubeVar.i;
                if (aubjVar == null) {
                    aubjVar = aubj.a;
                }
                if (aubjVar.b == 149559471) {
                    aqtsVar2 = (aqts) aubjVar.c;
                } else {
                    aqtsVar2 = aqts.a;
                }
                aunb aunbVar = aqtsVar2.d;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                aqtq aqtqVar = (aqtq) aunbVar.qm(aqtt.b);
                if (aqtqVar != null) {
                    arag aragVar = aqtqVar.b;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    if (aragVar.c.size() > 0) {
                        arag aragVar2 = aqtqVar.b;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                        if ((((arai) aragVar2.c.get(0)).b & 512) != 0) {
                            j jVar2 = this.a;
                            arag aragVar3 = aqtqVar.b;
                            if (aragVar3 == null) {
                                aragVar3 = arag.a;
                            }
                            apzg apzgVar = ((arai) aragVar3.c.get(0)).m;
                            if (apzgVar == null) {
                                apzgVar = apzg.a;
                            }
                            jVar2.p = apzgVar;
                        }
                    }
                }
                this.a.p = null;
            } else {
                this.a.p = null;
            }
            j jVar3 = this.a;
            aqtp h = pce.h(jVar3.n);
            if (h != null && h.l) {
                z = true;
            }
            jVar3.l.e = z;
            jVar3.d.p(z);
            if (!z) {
                return;
            }
            aubj aubjVar2 = aubeVar.i;
            if (aubjVar2 == null) {
                aubjVar2 = aubj.a;
            }
            if (aubjVar2.b == 149559471) {
                aqtsVar = (aqts) aubjVar2.c;
            } else {
                aqtsVar = aqts.a;
            }
            j jVar4 = this.a;
            jVar4.e.a(aqtsVar, jVar4.d);
            aunb aunbVar2 = aqtsVar.e;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            aunb aunbVar3 = ((aqtr) aunbVar2.qm(aqtt.c)).c;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            j jVar5 = this.a;
            jVar5.g.b((avaq) aunbVar3.qm(SubscribeButtonRendererOuterClass.subscribeButtonRenderer), jVar5.f, jVar5.i, jVar5.h);
            com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.b bVar = this.a.k;
            auav auavVar = aubeVar.f;
            if (auavVar == null) {
                auavVar = auav.a;
            }
            if (auavVar.b == 65153809) {
                apojVar = (apoj) auavVar.c;
            } else {
                apojVar = apoj.a;
            }
            bVar.b(apojVar, this.a.j);
            return;
        }
        j jVar6 = this.a;
        jVar6.o = null;
        jVar6.p = null;
        c();
    }

    public final void b(ahhw ahhwVar) {
        PlayerResponseModel b = ahhwVar.b();
        if (ahhwVar.c() != aika.PLAYBACK_LOADED || b == null) {
            if (ahhwVar.c() != aika.VIDEO_PLAYING) {
                return;
            }
            this.a.a.pC(false);
            return;
        }
        asad asadVar = b.a.C;
        if (asadVar == null) {
            asadVar = asad.a;
        }
        atzx atzxVar = asadVar.c;
        if (atzxVar == null) {
            atzxVar = atzx.a;
        }
        if ((atzxVar.b & 32) == 0) {
            this.a.a.pC(false);
            return;
        }
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.controlsoverlay.shared.h hVar = this.a.a;
        atzx atzxVar2 = asadVar.c;
        if (atzxVar2 == null) {
            atzxVar2 = atzx.a;
        }
        hVar.pC(atzxVar2.g);
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.aa(new h(this), ab.n), airwVar.ao().aa(new h(this, 1), ab.n)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((ahhm) obj);
                return null;
            } else if (i == 1) {
                b((ahhw) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhm.class, ahhw.class};
    }
}
