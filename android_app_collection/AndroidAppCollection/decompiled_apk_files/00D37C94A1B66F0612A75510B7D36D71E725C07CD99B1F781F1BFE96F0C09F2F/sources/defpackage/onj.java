package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: onj  reason: default package */
/* loaded from: classes3.dex */
public final class onj implements ezg, ete, ynl {
    public final ooc a;
    public final ezh b;
    public final adoa c;
    public final airr d;
    public final aafo e;
    public final Handler f;
    public apzg g;
    public boolean h;
    public final sdb i;
    private final ony j;
    private final yni k;
    private final gck l;
    private final ofu m;
    private final ayor n;
    private final aypf o = new aypf();
    private boolean p;
    private final aacz q;

    public onj(ony onyVar, ooc oocVar, aacz aaczVar, yni yniVar, ezh ezhVar, sdb sdbVar, adoa adoaVar, gck gckVar, ofu ofuVar, airr airrVar, aafo aafoVar, Handler handler, ayor ayorVar, byte[] bArr) {
        this.j = onyVar;
        this.a = oocVar;
        this.q = aaczVar;
        this.k = yniVar;
        this.b = ezhVar;
        this.i = sdbVar;
        this.c = adoaVar;
        this.l = gckVar;
        this.m = ofuVar;
        this.d = airrVar;
        this.e = aafoVar;
        this.f = handler;
        this.n = ayorVar;
    }

    public final void a() {
        if (!this.p) {
            return;
        }
        this.p = false;
        this.a.e();
        this.a.g();
        this.k.m(this);
        this.b.j(this);
        this.i.b(this);
        this.o.c();
    }

    public final void b(boolean z) {
        int i;
        if (this.p) {
            return;
        }
        this.p = true;
        ooc oocVar = this.a;
        apyy b = this.q.b();
        asxj asxjVar = b.e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if ((asxjVar.c & 262144) != 0) {
            asxj asxjVar2 = b.e;
            if (asxjVar2 == null) {
                asxjVar2 = asxj.a;
            }
            awcm awcmVar = asxjVar2.G;
            if (awcmVar == null) {
                awcmVar = awcm.a;
            }
            i = awcmVar.c;
        } else {
            i = 1800;
        }
        oocVar.f = TimeUnit.SECONDS.toMillis(i);
        this.a.c(this.j.a(), TimeUnit.MINUTES);
        this.a.a();
        this.k.g(this);
        this.b.i(this);
        this.i.a(this);
        this.o.g(this.a.a.as(new onh(this, 1)), this.j.d.B().X(this.n).as(new onh(this)));
        if (this.i.a) {
            return;
        }
        if (this.d.d()) {
            this.a.d();
        }
        if (!z || !this.b.g().f()) {
            return;
        }
        this.d.aa();
    }

    public final void c() {
        this.h = false;
        ezx g = this.b.g();
        if (g == ezx.WATCH_WHILE_FULLSCREEN) {
            this.m.l(true);
        } else if (g == ezx.WATCH_WHILE_MINIMIZED) {
            this.l.i(2);
            this.m.l(true);
        } else if (g == ezx.VIRTUAL_REALITY_FULLSCREEN) {
            this.l.i(2);
            this.m.p();
        }
        this.d.a();
        this.e.c(this.g, amup.k("engagement_panel_close_listener_key", new nlz() { // from class: ong
            @Override // defpackage.nlz
            public final void a() {
                onj.this.d.b();
            }
        }));
    }

    @Override // defpackage.ete
    public final void g(boolean z) {
        if (z) {
            this.a.e();
        } else if (!this.d.d()) {
        } else {
            this.a.d();
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        apzg apzgVar;
        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                this.a.b();
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                this.a.b();
                return null;
            } else if (i == 2) {
                ahhm ahhmVar = (ahhm) obj;
                aijx c = ahhmVar.c();
                if (c == aijx.NEW || c == aijx.VIDEO_PLAYBACK_ERROR) {
                    this.g = null;
                    this.a.e();
                    return null;
                } else if (c != aijx.VIDEO_WATCH_LOADED) {
                    return null;
                } else {
                    if ((ahhmVar.a().a.b & 524288) != 0) {
                        apzgVar = ahhmVar.a().a.w;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                    } else {
                        apzgVar = null;
                    }
                    this.g = apzgVar;
                    if (!this.h || apzgVar == null) {
                        return null;
                    }
                    this.f.post(new Runnable() { // from class: oni
                        @Override // java.lang.Runnable
                        public final void run() {
                            onj.this.c();
                        }
                    });
                    return null;
                }
            } else if (i == 3) {
                if (((ahia) obj).a() != 2 || this.b.g().d() || this.i.a || this.c.d() != 2) {
                    this.a.e();
                    return null;
                }
                this.a.d();
                apzg apzgVar2 = this.g;
                if (apzgVar2 == null || (showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apzgVar2.qm(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) == null) {
                    return null;
                }
                aopa createBuilder = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a.createBuilder();
                String str = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c == 1 ? (String) showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d : "";
                createBuilder.copyOnWrite();
                HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.instance;
                str.getClass();
                hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c = 1;
                hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d = str;
                aopc aopcVar = (aopc) apzg.a.createBuilder();
                aopcVar.e(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint, (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.mo39build());
                this.e.c((apzg) aopcVar.mo39build(), null);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class, ahhm.class, ahia.class};
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (!ezxVar.f() || ezxVar.d()) {
            this.a.e();
        } else if (!this.d.d()) {
        } else {
            this.a.d();
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }
}
