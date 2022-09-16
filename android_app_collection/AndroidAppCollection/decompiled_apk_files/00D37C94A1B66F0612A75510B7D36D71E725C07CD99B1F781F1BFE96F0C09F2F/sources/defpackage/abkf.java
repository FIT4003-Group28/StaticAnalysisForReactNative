package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: abkf  reason: default package */
/* loaded from: classes.dex */
public final class abkf extends ahzk implements abkc, ynl {
    public final Context a;
    public final abkd b;
    public final abkg c;
    public final aafo d;
    public final acti e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public apos i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    private auas t;

    public abkf(Context context, abkd abkdVar, abkg abkgVar, ayoi ayoiVar, aafo aafoVar, axnm axnmVar, ajhl ajhlVar, acti actiVar, abjy abjyVar) {
        super(abkdVar, axnmVar, ajhlVar, actiVar);
        this.a = context;
        this.b = abkdVar;
        this.c = abkgVar;
        this.d = aafoVar;
        this.e = actiVar;
        boolean a = abjyVar.a();
        this.f = a;
        asqt asqtVar = abjyVar.a;
        this.g = asqtVar.k;
        this.h = asqtVar.j.equals("lean-back");
        e(a ? 1 : 0);
        new aypf().d(ayoiVar.as(new ayqb() { // from class: abke
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                abkf abkfVar = abkf.this;
                boolean z = ((abkb) obj).a;
                if (!abkfVar.f) {
                    return;
                }
                apos aposVar = abkfVar.i;
                if (aposVar != null) {
                    aopa createBuilder = asjj.a.createBuilder();
                    aopa createBuilder2 = askc.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    askc askcVar = (askc) createBuilder2.instance;
                    askcVar.c = 1;
                    askcVar.b = 1 | askcVar.b;
                    createBuilder2.copyOnWrite();
                    askc askcVar2 = (askc) createBuilder2.instance;
                    askcVar2.b |= 2;
                    askcVar2.d = z;
                    createBuilder.copyOnWrite();
                    asjj asjjVar = (asjj) createBuilder.instance;
                    askc askcVar3 = (askc) createBuilder2.mo39build();
                    askcVar3.getClass();
                    asjjVar.H = askcVar3;
                    asjjVar.c |= 134217728;
                    abkfVar.e.H(3, new acte(aposVar.v.I()), (asjj) createBuilder.mo39build());
                }
                if (z) {
                    apos aposVar2 = abkfVar.i;
                    if (aposVar2 == null || (aposVar2.b & 512) == 0) {
                        return;
                    }
                    aafo aafoVar2 = abkfVar.d;
                    apzg apzgVar = aposVar2.k;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar2.a(apzgVar);
                    return;
                }
                apos aposVar3 = abkfVar.i;
                if (aposVar3 == null || (aposVar3.b & 16384) == 0) {
                    return;
                }
                aafo aafoVar3 = abkfVar.d;
                apzg apzgVar2 = aposVar3.p;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar3.a(apzgVar2);
            }
        }));
    }

    public final void a() {
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopg aopgVar = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint;
        aopa createBuilder = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a.createBuilder();
        createBuilder.copyOnWrite();
        HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.instance;
        hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c = 1;
        hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d = "live-chat-item-section";
        aopcVar.e(aopgVar, (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.mo39build());
        this.d.a((apzg) aopcVar.mo39build());
    }

    public final void b() {
        auas auasVar = this.t;
        if (auasVar == null || (auasVar.b & 1) == 0 || this.k) {
            return;
        }
        aafo aafoVar = this.d;
        apzg apzgVar = auasVar.c;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.a(apzgVar);
    }

    @Override // defpackage.ahzk
    public final void c(ahhm ahhmVar) {
        aube aubeVar;
        int i;
        WatchNextResponseModel a;
        aube aubeVar2;
        if (this.f) {
            if (this.s != 0 && (a = ahhmVar.a()) != null) {
                asgf asgfVar = a.a.f;
                if (asgfVar == null) {
                    asgfVar = asgf.a;
                }
                if (asgfVar.b == 78882851) {
                    aubeVar2 = (aube) asgfVar.c;
                } else {
                    aubeVar2 = aube.a;
                }
                if ((aubeVar2.b & 67108864) != 0) {
                    aunb aunbVar = aubeVar2.s;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                    if (aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
                        aunb aunbVar2 = aubeVar2.s;
                        if (aunbVar2 == null) {
                            aunbVar2 = aunb.a;
                        }
                        ajrs ajrsVar = new ajrs();
                        ajrsVar.a(this.q);
                        ajin ajinVar = (ajin) this.o.get();
                        this.p.oK(ajrsVar, ajhh.a((aqtb) aunbVar2.qm(ElementRendererOuterClass.elementRenderer)));
                        this.n.c = this.p.a();
                    }
                }
            }
            WatchNextResponseModel a2 = ahhmVar.a();
            if (a2 == null) {
                return;
            }
            asgf asgfVar2 = a2.a.f;
            if (asgfVar2 == null) {
                asgfVar2 = asgf.a;
            }
            if (asgfVar2.b == 78882851) {
                aubeVar = (aube) asgfVar2.c;
            } else {
                aubeVar = aube.a;
            }
            Iterator it = aubeVar.c.iterator();
            while (true) {
                i = 2;
                if (!it.hasNext()) {
                    this.i = null;
                    break;
                }
                auau auauVar = (auau) it.next();
                if ((auauVar.b & 8) != 0) {
                    auas auasVar = auauVar.c;
                    if (auasVar == null) {
                        auasVar = auas.a;
                    }
                    this.t = auasVar;
                    apok apokVar = auasVar.d;
                    if (apokVar == null) {
                        apokVar = apok.a;
                    }
                    if ((apokVar.b & 2) != 0) {
                        apok apokVar2 = this.t.d;
                        if (apokVar2 == null) {
                            apokVar2 = apok.a;
                        }
                        apos aposVar = apokVar2.d;
                        if (aposVar == null) {
                            aposVar = apos.a;
                        }
                        this.i = aposVar;
                    }
                }
            }
            apos aposVar2 = this.i;
            if (aposVar2 != null) {
                this.c.c(aposVar2);
                if (!this.j) {
                    return;
                }
                b();
                abkg abkgVar = this.c;
                if (true == this.m) {
                    i = 1;
                }
                abkgVar.d(i);
                return;
            }
            this.c.d(0);
            e(1);
        }
    }

    public final boolean d() {
        return this.f && this.i != null && this.j && !this.k;
    }

    @Override // defpackage.ahzk, defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (cls != abkf.class) {
            if (i == -1) {
                return new Class[]{ahhm.class};
            }
            if (i == 0) {
                c((ahhm) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        int i2 = 2;
        switch (i) {
            case -1:
                return new Class[]{abjv.class, ahgk.class, ahgn.class, ahhm.class, ahhv.class, ahhw.class};
            case 0:
                abjv abjvVar = (abjv) obj;
                if (((ampq) abjvVar.h()).h() || !d()) {
                    return null;
                }
                boolean b = abjvVar.b();
                if (b && this.l) {
                    return null;
                }
                this.c.d(true != b ? 2 : 1);
                if (b) {
                    e(2);
                    this.b.l();
                    return null;
                }
                e(1);
                a();
                return null;
            case 1:
                ahgk ahgkVar = (ahgk) obj;
                this.c.d(0);
                this.i = null;
                e(1);
                this.b.g(false);
                return null;
            case 2:
                ahgn ahgnVar = (ahgn) obj;
                if (!this.f) {
                    return null;
                }
                int i3 = this.a.getResources().getConfiguration().orientation;
                if (!ahgnVar.c().equals(aijs.FULLSCREEN)) {
                    if (ahgnVar.c().equals(aijs.DEFAULT) && this.s == 2) {
                        aopc aopcVar = (aopc) apzg.a.createBuilder();
                        aopg aopgVar = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint;
                        aopa createBuilder = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a.createBuilder();
                        createBuilder.copyOnWrite();
                        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.instance;
                        showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c = 1;
                        showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d = "live-chat-item-section";
                        aopcVar.e(aopgVar, (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.mo39build());
                        this.d.a((apzg) aopcVar.mo39build());
                    }
                    this.j = false;
                    this.c.d(0);
                    e(1);
                    return null;
                } else if (this.j) {
                    return null;
                } else {
                    this.j = true;
                    if (this.i == null) {
                        return null;
                    }
                    abkg abkgVar = this.c;
                    if (this.m && (i3 != 1 || this.g)) {
                        i2 = 1;
                    }
                    abkgVar.d(i2);
                    if ((this.h || i3 == 1) && !this.k) {
                        a();
                    }
                    b();
                    return null;
                }
            case 3:
                c((ahhm) obj);
                return null;
            case 4:
                ahhv ahhvVar = (ahhv) obj;
                if (!this.f) {
                    return null;
                }
                this.b.g(ahhvVar.a);
                return null;
            case 5:
                boolean z = this.k;
                boolean a = ((ahhw) obj).c().a(aika.PLAYBACK_INTERRUPTED, aika.INTERSTITIAL_REQUESTED, aika.INTERSTITIAL_PLAYING, aika.ENDED);
                this.k = a;
                if (a) {
                    e(1);
                    return null;
                } else if (!z) {
                    return null;
                } else {
                    if (d() && !this.l && this.c.a() == 1) {
                        e(2);
                    }
                    if (!this.m) {
                        return null;
                    }
                    this.c.d(1);
                    return null;
                }
            default:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("unsupported op code: ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
        }
    }
}
