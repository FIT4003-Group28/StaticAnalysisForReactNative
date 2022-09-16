package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.youtube.app.common.player.PlaybackLoopShuffleMonitor;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: occ  reason: default package */
/* loaded from: classes3.dex */
public final class occ implements ocr {
    public final aafo a;
    public final String b;
    public final acti c;
    public final acud d;
    public final nml e;
    public WatchNextResponseModel f;
    public Runnable g;
    private final ocn h;
    private final azqb i;
    private final azqb j;
    private final ocz k;
    private final oeg l;
    private final View m;
    private final ahub n;
    private final ahtz o;
    private final ocy p;
    private final ezh q;
    private aypg r;
    private ocm s;
    private npm t;
    private oba u;
    private String v;
    private String w;
    private int x;
    private ahty y = ahty.NEW;

    public occ(aafo aafoVar, ocn ocnVar, azqb azqbVar, azqb azqbVar2, ocz oczVar, acti actiVar, nml nmlVar, ezh ezhVar, ghs ghsVar, ahub ahubVar, acud acudVar, oeg oegVar, View view, String str) {
        this.a = aafoVar;
        this.c = actiVar;
        this.d = acudVar;
        this.n = ahubVar;
        this.h = ocnVar;
        this.i = azqbVar;
        this.j = azqbVar2;
        this.k = oczVar;
        this.l = oegVar;
        this.m = view;
        this.e = nmlVar;
        this.q = ezhVar;
        this.b = str;
        obz obzVar = new obz(this);
        this.o = obzVar;
        oca ocaVar = new oca(this);
        this.p = ocaVar;
        ahubVar.c(obzVar);
        oczVar.a(ocaVar);
        aynx n = ghsVar.d.n();
        final ocb ocbVar = new ocb(this);
        this.r = n.aa(new ayqb() { // from class: obx
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ocb ocbVar2 = ocb.this;
                ocbVar2.a.h(((Integer) obj).intValue());
            }
        }, npy.o);
    }

    public static aqvq b(WatchNextResponseModel watchNextResponseModel, String str) {
        audg audgVar = watchNextResponseModel.g;
        aopa createBuilder = aqvq.b.createBuilder();
        createBuilder.copyOnWrite();
        aqvq aqvqVar = (aqvq) createBuilder.instance;
        aqvqVar.d = 1;
        aqvqVar.e = str;
        aopc aopcVar = (aopc) asvv.b.createBuilder();
        aopa createBuilder2 = awbr.a.createBuilder();
        createBuilder2.copyOnWrite();
        awbr awbrVar = (awbr) createBuilder2.instance;
        awbrVar.b |= 1;
        awbrVar.c = 3L;
        aopcVar.copyOnWrite();
        asvv asvvVar = (asvv) aopcVar.instance;
        awbr awbrVar2 = (awbr) createBuilder2.mo39build();
        awbrVar2.getClass();
        asvvVar.e = awbrVar2;
        asvvVar.c |= 2;
        aoob aoobVar = audgVar.t;
        aopcVar.copyOnWrite();
        asvv asvvVar2 = (asvv) aopcVar.instance;
        aoobVar.getClass();
        asvvVar2.c |= 1;
        asvvVar2.d = aoobVar;
        asvv asvvVar3 = (asvv) aopcVar.mo39build();
        createBuilder.copyOnWrite();
        aqvq aqvqVar2 = (aqvq) createBuilder.instance;
        asvvVar3.getClass();
        aqvqVar2.x = asvvVar3;
        aqvqVar2.c |= 2097152;
        createBuilder.copyOnWrite();
        aqvq aqvqVar3 = (aqvq) createBuilder.instance;
        aqvqVar3.c |= 1048576;
        aqvqVar3.w = 111059;
        createBuilder.copyOnWrite();
        aqvq aqvqVar4 = (aqvq) createBuilder.instance;
        aqvqVar4.k = 1;
        aqvqVar4.c |= 1024;
        aopa createBuilder3 = aqvn.a.createBuilder();
        createBuilder3.copyOnWrite();
        aqvn aqvnVar = (aqvn) createBuilder3.instance;
        aqvnVar.c = 1;
        aqvnVar.b |= 1;
        createBuilder.copyOnWrite();
        aqvq aqvqVar5 = (aqvq) createBuilder.instance;
        aqvn aqvnVar2 = (aqvn) createBuilder3.mo39build();
        aqvnVar2.getClass();
        aqvqVar5.i = aqvnVar2;
        aqvqVar5.c |= 64;
        createBuilder.copyOnWrite();
        aqvq aqvqVar6 = (aqvq) createBuilder.instance;
        aqvqVar6.c |= 131072;
        aqvqVar6.t = true;
        aopa createBuilder4 = aqvp.a.createBuilder();
        audg audgVar2 = audg.a;
        createBuilder4.copyOnWrite();
        aqvp aqvpVar = (aqvp) createBuilder4.instance;
        audgVar2.getClass();
        aqvpVar.c = audgVar2;
        aqvpVar.b = 50631000;
        createBuilder.copyOnWrite();
        aqvq aqvqVar7 = (aqvq) createBuilder.instance;
        aqvp aqvpVar2 = (aqvp) createBuilder4.mo39build();
        aqvpVar2.getClass();
        aqvqVar7.f = aqvpVar2;
        aqvqVar7.c |= 8;
        aopa createBuilder5 = aqvo.a.createBuilder();
        aopa createBuilder6 = auqh.a.createBuilder();
        aopa createBuilder7 = auqk.a.createBuilder();
        audg audgVar3 = audg.a;
        createBuilder7.copyOnWrite();
        auqk auqkVar = (auqk) createBuilder7.instance;
        audgVar3.getClass();
        auqkVar.aM = audgVar3;
        auqkVar.d = 2097152 | auqkVar.d;
        createBuilder6.aK(createBuilder7);
        createBuilder5.copyOnWrite();
        aqvo aqvoVar = (aqvo) createBuilder5.instance;
        auqh auqhVar = (auqh) createBuilder6.mo39build();
        auqhVar.getClass();
        aqvoVar.c = auqhVar;
        aqvoVar.b = 49399797;
        createBuilder.copyOnWrite();
        aqvq aqvqVar8 = (aqvq) createBuilder.instance;
        aqvo aqvoVar2 = (aqvo) createBuilder5.mo39build();
        aqvoVar2.getClass();
        aqvqVar8.g = aqvoVar2;
        aqvqVar8.c |= 16;
        return (aqvq) createBuilder.mo39build();
    }

    private final nph k() {
        nmc b = this.e.b(this.b);
        if (b != null && (b.b() instanceof nph)) {
            return (nph) b.b();
        }
        return null;
    }

    private final void l(String str, String str2) {
        if (TextUtils.equals(this.v, str)) {
            if (TextUtils.equals(this.w, str2) || str2 == null) {
                return;
            }
            ocm ocmVar = this.s;
            if (ocmVar != null) {
                ocmVar.i = (Integer) ocmVar.e.get(str2);
                ocmVar.c();
                ocmVar.d();
                ocmVar.b();
                m(k());
            }
            npm npmVar = this.t;
            if (npmVar != null && npmVar.m && !akzj.f(npmVar.p, str2)) {
                npmVar.m(str2);
                Integer num = (Integer) npmVar.f.get(str2);
                if (num != null && num.intValue() >= 0 && num.intValue() < npmVar.d.size()) {
                    Object obj = npmVar.d.get(num.intValue());
                    if ((obj instanceof mri) || (obj instanceof mez)) {
                        npmVar.l(num.intValue(), true);
                    }
                }
            }
        } else {
            c();
            this.f = null;
        }
        this.v = str;
        this.w = str2;
    }

    private final void m(nph nphVar) {
        ocm ocmVar;
        if (nphVar == null || (ocmVar = this.s) == null) {
            return;
        }
        nphVar.n(ocmVar.f.getText());
    }

    @Override // defpackage.ocr
    public final void d() {
        aypg aypgVar = this.r;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.r = null;
        }
        ocm ocmVar = this.s;
        if (ocmVar != null) {
            ocmVar.b.i(ocmVar.d);
        }
        this.n.m(this.o);
        ocz oczVar = this.k;
        oczVar.a.remove(this.p);
    }

    @Override // defpackage.ocr
    public final void e(WatchNextResponseModel watchNextResponseModel) {
        audg audgVar;
        String str;
        if (TextUtils.isEmpty(watchNextResponseModel.b) || (str = this.w) == null || str.length() <= 0 || this.w.equals(watchNextResponseModel.b)) {
            this.f = watchNextResponseModel;
            if (this.v == null) {
                String str2 = null;
                if (watchNextResponseModel != null && (audgVar = watchNextResponseModel.g) != null) {
                    str2 = audgVar.k;
                }
                this.v = str2;
            }
            i();
        }
    }

    public final void f(ahty ahtyVar, Runnable runnable) {
        Runnable runnable2;
        this.y = ahtyVar;
        this.g = runnable;
        if (!ahtyVar.a(ahty.LOGGED_ATTACH_WATCH_NEXT) || (runnable2 = this.g) == null) {
            return;
        }
        runnable2.run();
        this.g = null;
    }

    public final void g() {
        nph k;
        CharSequence charSequence;
        Spanned spanned;
        arhs arhsVar;
        if (this.t == null) {
            this.t = (npm) this.i.get();
        }
        WatchNextResponseModel watchNextResponseModel = this.f;
        if (watchNextResponseModel != null) {
            npm npmVar = this.t;
            audg audgVar = watchNextResponseModel.g;
            if (audgVar != null) {
                npmVar.h.c(audgVar);
            }
        }
        WatchNextResponseModel watchNextResponseModel2 = this.f;
        if (watchNextResponseModel2 == null || (k = k()) == null) {
            return;
        }
        audg audgVar2 = watchNextResponseModel2.g;
        apmf apmfVar = null;
        if (audgVar2 == null) {
            k.j(null);
            k.i(null);
            k.n(null);
            k.m(null);
            k.p(null);
        } else {
            int i = audgVar2.c;
            if ((i & 2) != 0) {
                arag aragVar = audgVar2.h;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                charSequence = ajgl.b(aragVar);
            } else {
                charSequence = (i & 1) != 0 ? audgVar2.g : null;
            }
            k.j(charSequence);
            if ((audgVar2.c & 2048) != 0) {
                arag aragVar2 = audgVar2.q;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                spanned = ajgl.b(aragVar2);
            } else {
                spanned = null;
            }
            k.i(spanned);
            if ((audgVar2.d & 1) != 0) {
                arhsVar = audgVar2.B;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
            } else {
                arhsVar = null;
            }
            k.m(arhsVar);
            Iterator it = audgVar2.x.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                aplw aplwVar = (aplw) it.next();
                if ((aplwVar.b & 256) != 0) {
                    apmfVar = aplwVar.e;
                    if (apmfVar == null) {
                        apmfVar = apmf.a;
                    }
                }
            }
            k.p(apmfVar);
        }
        m(k);
        WatchNextResponseModel watchNextResponseModel3 = this.f;
        if (watchNextResponseModel3 == null) {
            return;
        }
        if (this.u == null) {
            this.u = (oba) this.j.get();
        }
        this.u.a(watchNextResponseModel3.g, watchNextResponseModel3.h);
    }

    public final void h(int i) {
        int i2;
        this.x = i;
        nph k = k();
        if (k == null) {
            return;
        }
        int i3 = R.attr.ytTextAppearanceDisplay1;
        if (i == 1) {
            i = 1;
            i2 = R.attr.ytTextAppearanceDisplay1;
        } else {
            i2 = R.attr.ytTextAppearanceTitle2;
        }
        int i4 = R.dimen.yt_text_style_display1_line_height;
        int i5 = i == 1 ? R.dimen.yt_text_style_display1_line_height : R.dimen.playlist_ep_title_line_height;
        int i6 = i == 1 ? 0 : R.dimen.playlist_ep_title_text_size;
        k.e = i2;
        k.c = i6;
        k.d = i5;
        k.r();
        if (i != 1) {
            i3 = R.attr.ytTextAppearanceTitle2;
        }
        if (i != 1) {
            i4 = R.dimen.yt_text_style_title2_line_height;
        }
        k.o(i3, i4);
        k.q(i == 1 ? R.attr.ytTextAppearanceBody2a : R.attr.ytTextAppearanceBody1a, i == 1 ? R.dimen.yt_text_style_body2a_line_height : R.dimen.yt_text_style_body1a_line_height);
    }

    public final void i() {
        audg audgVar;
        WatchNextResponseModel watchNextResponseModel;
        WatchNextResponseModel watchNextResponseModel2 = this.f;
        if (watchNextResponseModel2 == null || (audgVar = watchNextResponseModel2.g) == null || adwa.a(audgVar.k) || !this.k.c()) {
            c();
            return;
        }
        if (this.s == null) {
            this.m.setOnClickListener(new View.OnClickListener() { // from class: obw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    occ occVar = occ.this;
                    occVar.c.H(3, new acte(actj.PLAYLIST_ENTRY_POINT), null);
                    if (!occVar.e.x(occVar.b)) {
                        return;
                    }
                    aafo aafoVar = occVar.a;
                    String str = occVar.b;
                    aopa createBuilder = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a.createBuilder();
                    createBuilder.copyOnWrite();
                    ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.instance;
                    showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c = 1;
                    showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d = str;
                    aopc aopcVar = (aopc) apzg.a.createBuilder();
                    aopcVar.e(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint, (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.mo39build());
                    aopg aopgVar = atno.b;
                    aopa createBuilder2 = atnp.a.createBuilder();
                    int i = actj.PLAYLIST_ENTRY_POINT.II;
                    createBuilder2.copyOnWrite();
                    atnp atnpVar = (atnp) createBuilder2.instance;
                    atnpVar.b |= 2;
                    atnpVar.d = i;
                    aopcVar.e(aopgVar, (atnp) createBuilder2.mo39build());
                    aafoVar.a((apzg) aopcVar.mo39build());
                }
            });
            ocn ocnVar = this.h;
            oeg oegVar = this.l;
            View view = this.m;
            PlaybackLoopShuffleMonitor playbackLoopShuffleMonitor = (PlaybackLoopShuffleMonitor) ocnVar.a.get();
            playbackLoopShuffleMonitor.getClass();
            akfc akfcVar = (akfc) ocnVar.b.get();
            akfcVar.getClass();
            gfu gfuVar = (gfu) ocnVar.c.get();
            gfuVar.getClass();
            acti actiVar = (acti) ocnVar.d.get();
            actiVar.getClass();
            this.s = new ocm(playbackLoopShuffleMonitor, akfcVar, gfuVar, actiVar, oegVar, view);
        }
        ocm ocmVar = this.s;
        if (ocmVar != null && (watchNextResponseModel = this.f) != null) {
            ocmVar.a(watchNextResponseModel.g);
            this.l.h(16);
            this.c.n(new acte(actj.PLAYLIST_ENTRY_POINT));
        }
        if (!this.e.x(this.b)) {
            WatchNextResponseModel watchNextResponseModel3 = this.f;
            if (watchNextResponseModel3 != null) {
                this.e.q(b(watchNextResponseModel3, this.b));
                nph k = k();
                if (k != null) {
                    if (this.u == null) {
                        this.u = (oba) this.j.get();
                    }
                    k.a = this.u.i;
                    if (k.b) {
                        k.b = false;
                        nmn nmnVar = k.f;
                        if (nmnVar != null) {
                            nmnVar.a(false);
                        }
                    }
                    h(this.x);
                }
            }
            g();
            return;
        }
        f(this.y, new Runnable() { // from class: oby
            @Override // java.lang.Runnable
            public final void run() {
                occ occVar = occ.this;
                WatchNextResponseModel watchNextResponseModel4 = occVar.f;
                if (watchNextResponseModel4 != null) {
                    nml nmlVar = occVar.e;
                    aqvq b = occ.b(watchNextResponseModel4, occVar.b);
                    acud acudVar = occVar.d;
                    String str = occVar.b;
                    aoob aoobVar = occVar.f.a.t;
                    aopa createBuilder = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a.createBuilder();
                    createBuilder.copyOnWrite();
                    ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.instance;
                    showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c = 1;
                    showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d = str;
                    aopc aopcVar = (aopc) apzg.a.createBuilder();
                    aopcVar.e(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint, (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.mo39build());
                    aopcVar.copyOnWrite();
                    apzg apzgVar = (apzg) aopcVar.instance;
                    aoobVar.getClass();
                    apzgVar.b |= 1;
                    apzgVar.c = aoobVar;
                    nmlVar.s(b, null, true, acudVar.f((apzg) aopcVar.mo39build()), false);
                }
                occVar.g();
            }
        });
    }

    @Override // defpackage.ocr
    public final void j(fgh fghVar) {
        if (fghVar == null) {
            if (this.q.g() != ezx.NONE) {
                return;
            }
            l(null, null);
            return;
        }
        PlaybackStartDescriptor a = fghVar.a();
        l(a.k(), a.l());
    }

    @Override // defpackage.ocy
    public final void pm(boolean z) {
        i();
    }

    @Override // defpackage.ocr
    public final void c() {
        npm npmVar = this.t;
        if (npmVar != null && npmVar.m) {
            npmVar.l.c();
            npmVar.d.clear();
            npmVar.c.d(null);
            oes oesVar = npmVar.j;
            if (oesVar != null) {
                oesVar.A();
            }
            npmVar.f.clear();
            npmVar.o = true;
        }
        ocm ocmVar = this.s;
        if (ocmVar != null) {
            ocmVar.a(null);
        }
        oba obaVar = this.u;
        if (obaVar != null) {
            obaVar.a(null, null);
            obaVar.c.m(obaVar);
        }
        if (this.e.x(this.b)) {
            aafo aafoVar = this.a;
            String str = this.b;
            aopc aopcVar = (aopc) apzg.a.createBuilder();
            aopg aopgVar = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint;
            aopa createBuilder = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a.createBuilder();
            createBuilder.copyOnWrite();
            HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.instance;
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c = 1;
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d = str;
            aopcVar.e(aopgVar, (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.mo39build());
            aafoVar.a((apzg) aopcVar.mo39build());
        }
        this.g = null;
        this.l.e(16);
    }
}
