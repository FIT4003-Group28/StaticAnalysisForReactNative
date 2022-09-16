package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: iwt  reason: default package */
/* loaded from: classes3.dex */
public final class iwt implements aafl, eoy, ynl {
    public static final String a = zep.a("MDX.MdxConnectNavigationCommand");
    public final adgc b;
    public final Context c;
    public final adgl d;
    public final snc e;
    public final adjb f;
    public final ScheduledExecutorService g;
    public final dt h;
    public final airr i;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public atdp m;
    private final adjg n;
    private final yni o;
    private final aafo p;
    private final eo q;
    private final bgo r;
    private final fvf s;
    private final adoa t;
    private final amfg u;

    public iwt(adgc adgcVar, Context context, adgl adglVar, snc sncVar, adjg adjgVar, adjb adjbVar, ankx ankxVar, yni yniVar, aafo aafoVar, eo eoVar, bgo bgoVar, dt dtVar, fvf fvfVar, adoa adoaVar, airr airrVar, amfg amfgVar, byte[] bArr, byte[] bArr2) {
        this.b = adgcVar;
        this.c = context;
        this.d = adglVar;
        this.e = sncVar;
        this.n = adjgVar;
        this.f = adjbVar;
        this.g = ankxVar;
        this.o = yniVar;
        this.p = aafoVar;
        this.q = eoVar;
        this.r = bgoVar;
        this.h = dtVar;
        this.s = fvfVar;
        this.t = adoaVar;
        this.i = airrVar;
        this.u = amfgVar;
    }

    public static Optional b(atdp atdpVar) {
        atcr atcrVar;
        if (atdpVar != null) {
            atcq atcqVar = atdpVar.c;
            if (atcqVar == null) {
                atcqVar = atcq.a;
            }
            if (atcqVar.b == 1) {
                atcq atcqVar2 = atdpVar.c;
                if (atcqVar2 == null) {
                    atcqVar2 = atcq.a;
                }
                if (atcqVar2.b == 1) {
                    atcrVar = (atcr) atcqVar2.c;
                } else {
                    atcrVar = atcr.a;
                }
                return Optional.of(atcrVar);
            }
        }
        return Optional.empty();
    }

    private final void i(String str, String str2) {
        fvg d = fvl.d();
        d.k(str);
        d.m(akzj.h(str2), new View.OnClickListener() { // from class: iwi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iwt iwtVar = iwt.this;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://support.google.com/youtube/answer/7640706"));
                iwtVar.h.startActivity(intent);
            }
        });
        this.s.i(d.b());
    }

    public final void d(boolean z, Optional optional) {
        if (!z) {
            h();
        } else if (this.t.e() != null) {
        } else {
            if (!optional.isPresent()) {
                bew c = adhf.c(this.r, new iwl(this));
                c.qw(this.q, c.getClass().getCanonicalName());
                this.o.g(this);
                this.j = true;
                return;
            }
            bhc bhcVar = (bhc) optional.get();
            String valueOf = String.valueOf(bhcVar.d);
            if (valueOf.length() != 0) {
                "Connecting to route: ".concat(valueOf);
            }
            atdp atdpVar = this.m;
            if (atdpVar == null || (atdpVar.b & 2) == 0) {
                this.b.W(bhcVar);
            } else {
                adgc adgcVar = this.b;
                adnk c2 = adnl.c();
                atdp atdpVar2 = this.m;
                atdpVar2.getClass();
                c2.f(atdpVar2.d);
                adgcVar.U(bhcVar, c2.a());
            }
            this.j = true;
            this.o.g(this);
        }
    }

    public final void e(final iws iwsVar) {
        ankt q;
        dt dtVar = this.h;
        final Optional b = b(this.m);
        if (b.isPresent()) {
            q = anii.h(this.u.a, new ampg() { // from class: iwm
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    bhc a2;
                    iwt iwtVar = iwt.this;
                    Optional optional = b;
                    Boolean bool = (Boolean) obj;
                    if (bool == null || !bool.booleanValue() || (((atcr) optional.get()).b & 1) == 0 || iwtVar.d.b(((atcr) optional.get()).c, iwtVar.c).size() != 1) {
                        a2 = iwtVar.d.a((atcr) optional.get(), iwtVar.c);
                    } else {
                        a2 = (bhc) iwtVar.d.b(((atcr) optional.get()).c, iwtVar.c).get(0);
                    }
                    return Optional.ofNullable(a2);
                }
            }, this.g);
        } else {
            q = anlz.q(Optional.empty());
        }
        ylx.n(dtVar, q, new zdt() { // from class: iwj
            @Override // defpackage.zdt
            public final void a(Object obj) {
                iws iwsVar2 = iws.this;
                String str = iwt.a;
                String valueOf = String.valueOf((Throwable) obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("Error thrown while attempting to find an available MDx route: ");
                sb.append(valueOf);
                zep.c(str, sb.toString());
                iwsVar2.a();
            }
        }, new zdt() { // from class: iwk
            @Override // defpackage.zdt
            public final void a(Object obj) {
                iwt iwtVar = iwt.this;
                iws iwsVar2 = iwsVar;
                Optional optional = (Optional) obj;
                if (!iwt.b(iwtVar.m).isPresent() ? iwtVar.d.j().isEmpty() : optional == null || !optional.isPresent()) {
                    iwsVar2.a();
                    return;
                }
                if (optional == null) {
                    optional = Optional.empty();
                }
                iwsVar2.b(optional);
            }
        });
    }

    public final void g() {
        this.j = false;
        this.k = false;
        this.o.m(this);
    }

    public final void h() {
        Optional b = b(this.m);
        if (b.isPresent()) {
            String valueOf = String.valueOf(((atcr) b.get()).c);
            if (valueOf.length() != 0) {
                "Failed to connect to MDx screen: ".concat(valueOf);
            }
            i(this.h.getString(R.string.mdx_connect_navigation_command_cant_connect_message, new Object[]{((atcr) b.get()).c}), this.h.getString(R.string.mdx_connect_navigation_command_cant_connect_get_help_button));
        } else {
            i(this.h.getString(R.string.mdx_connect_navigation_command_no_devices_found_message), this.h.getString(R.string.mdx_connect_navigation_command_no_devices_found_learn_more_button));
        }
        g();
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, Map map) {
        if (!apzgVar.qn(MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.mdxConnectNavigationEndpoint)) {
            zep.m(a, "MdxConnectNavigationEndpoint not filled");
            return;
        }
        MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint = (MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint) apzgVar.qm(MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.mdxConnectNavigationEndpoint);
        if ((mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.b & 2) != 0) {
            atdp atdpVar = mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.c;
            if (atdpVar == null) {
                atdpVar = atdp.a;
            }
            this.m = atdpVar;
        }
        atcn atcnVar = mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.d;
        if (atcnVar == null) {
            atcnVar = atcn.a;
        }
        atcw b = atcw.b(atcnVar.b);
        if (b == null) {
            b = atcw.MDX_SESSION_SOURCE_UNKNOWN;
        }
        boolean z = b == atcw.MDX_SESSION_SOURCE_CONTENT_RECOMMENDATION_NOTIFICATION;
        this.l = z;
        if (z) {
            this.n.d();
            this.f.b(this.m, "LR notification clicked.", atcs.MDX_NOTIFICATION_GEL_ACTION_CLICKED);
        }
        final Instant ofEpochMilli = Instant.ofEpochMilli(this.e.c());
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.b.P(this);
        } else {
            this.g.execute(new Runnable() { // from class: iwn
                @Override // java.lang.Runnable
                public final void run() {
                    iwt iwtVar = iwt.this;
                    iwtVar.b.P(iwtVar);
                }
            });
        }
        this.g.execute(new Runnable() { // from class: iwo
            @Override // java.lang.Runnable
            public final void run() {
                iwt iwtVar = iwt.this;
                iwtVar.e(new iwq(iwtVar, apzgVar, ofEpochMilli));
            }
        });
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    ahia ahiaVar = (ahia) obj;
                    if (!this.k) {
                        g();
                        return null;
                    } else if (ahiaVar.a() != 5 && ahiaVar.a() != 2) {
                        return null;
                    } else {
                        g();
                        this.i.a();
                        if (this.l) {
                            this.f.b(this.m, "LR notification navigated to watch page.", atcs.MDX_NOTIFICATION_GEL_ACTION_NAVIGATED_TO_WATCH);
                        }
                        e(new iwr(this));
                        return null;
                    }
                }
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            adob adobVar = (adob) obj;
            if (!this.j) {
                g();
                return null;
            }
            adnt a2 = adobVar.a();
            if (a2 == null || a2.a() == 2) {
                h();
                return null;
            } else if (a2.a() != 0 && a2.a() != 1) {
                return null;
            } else {
                String valueOf = String.valueOf(a2.k().b());
                if (valueOf.length() != 0) {
                    "Successfully connected to screen: ".concat(valueOf);
                }
                if (this.l) {
                    adjb adjbVar = this.f;
                    atdp atdpVar = this.m;
                    String str = "Connection started from LR notification";
                    if (atdpVar != null) {
                        String valueOf2 = String.valueOf(atdpVar.d);
                        str = str.concat(valueOf2.length() != 0 ? ": videoId=".concat(valueOf2) : new String(": videoId="));
                    }
                    zep.h(adjb.a, str);
                    adjbVar.a(atcs.MDX_NOTIFICATION_GEL_ACTION_CONNECTION_STARTED);
                }
                g();
                return null;
            }
        }
        return new Class[]{adob.class, ahia.class};
    }

    public final void c(aoob aoobVar, boolean z, Optional optional) {
        atdp atdpVar = this.m;
        if (atdpVar == null || (atdpVar.b & 2) == 0) {
            d(z, optional);
            return;
        }
        String str = atdpVar.d;
        this.o.g(this);
        aafo aafoVar = this.p;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopg aopgVar = WatchEndpointOuterClass.watchEndpoint;
        aopa createBuilder = awel.a.createBuilder();
        createBuilder.copyOnWrite();
        awel awelVar = (awel) createBuilder.instance;
        str.getClass();
        awelVar.b |= 1;
        awelVar.c = str;
        aopcVar.e(aopgVar, (awel) createBuilder.mo39build());
        aopcVar.copyOnWrite();
        apzg apzgVar = (apzg) aopcVar.instance;
        aoobVar.getClass();
        apzgVar.b |= 1;
        apzgVar.c = aoobVar;
        aafoVar.a((apzg) aopcVar.mo39build());
        this.k = true;
    }
}
