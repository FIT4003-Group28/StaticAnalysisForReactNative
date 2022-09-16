package com.google.android.apps.youtube.app.common.ui.bottomui;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class HatsController implements f, ezb, ezg, akev, airt, xgn, ynl {
    public final aafo a;
    public fvp b;
    public ahhx d;
    public ahhw e;
    public ahhj f;
    public long g;
    private final fud h;
    private final azqb i;
    private final azqb j;
    private final xgp k;
    private final Handler l;
    private final fwg o;
    private fwf p;
    private fvp q;
    private final yni r;
    private final airw s;
    private final acth u;
    private boolean v;
    private boolean w;
    private final aacz x;
    private final aypf t = new aypf();
    public final Map c = new HashMap();
    private volatile boolean n = false;
    private final Object m = new Object();

    public HatsController(fud fudVar, aafo aafoVar, azqb azqbVar, azqb azqbVar2, fwg fwgVar, yni yniVar, airw airwVar, aacz aaczVar, acth acthVar, xgp xgpVar, Handler handler) {
        this.h = fudVar;
        this.a = aafoVar;
        this.i = azqbVar;
        this.j = azqbVar2;
        this.o = fwgVar;
        this.r = yniVar;
        this.s = airwVar;
        this.x = aaczVar;
        this.u = acthVar;
        this.k = xgpVar;
        this.l = handler;
    }

    public static boolean m(avdu avduVar) {
        avdq avdqVar = avduVar.c;
        if (avdqVar == null) {
            avdqVar = avdq.a;
        }
        for (avcz avczVar : avdqVar.l) {
            if (avczVar.b == 1) {
                avdb b = avdb.b(((avcy) avczVar.c).b);
                if (b == null) {
                    b = avdb.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED;
                }
                if (b == avdb.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_CONTENT_VIDEO_START) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean p(avdu avduVar) {
        avdq avdqVar = avduVar.c;
        if (avdqVar == null) {
            avdqVar = avdq.a;
        }
        for (avcz avczVar : avdqVar.l) {
            if (avczVar.b == 1) {
                avdb b = avdb.b(((avcy) avczVar.c).b);
                if (b == null) {
                    b = avdb.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED;
                }
                if (b == avdb.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PLAYBACK_FINISH) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void r() {
        this.b = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = 0L;
        this.v = false;
        this.w = false;
    }

    @Override // defpackage.xgn
    public final /* synthetic */ void a(wxp wxpVar) {
    }

    @Override // defpackage.xgn
    public final void b(wxr wxrVar) {
        wxq wxqVar = wxq.AD_INTERRUPT_ACQUIRED;
        aijw aijwVar = aijw.PLAYBACK_PENDING;
        aika aikaVar = aika.NEW;
        int ordinal = wxrVar.a().ordinal();
        if (ordinal == 2) {
            if (this.b != null && wxrVar.b() == xdb.PRE_ROLL) {
                avdq avdqVar = this.b.e.c;
                if (avdqVar == null) {
                    avdqVar = avdq.a;
                }
                for (avcz avczVar : avdqVar.l) {
                    if (avczVar.b == 1) {
                        avdb b = avdb.b(((avcy) avczVar.c).b);
                        if (b == null) {
                            b = avdb.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED;
                        }
                        if (b == avdb.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PREROLL_AD_START) {
                            j(this.b.d(wxrVar.e()));
                            return;
                        }
                    }
                }
            }
            if (this.b == null || wxrVar.b() != xdb.MID_ROLL) {
                return;
            }
            avdq avdqVar2 = this.b.e.c;
            if (avdqVar2 == null) {
                avdqVar2 = avdq.a;
            }
            for (avcz avczVar2 : avdqVar2.l) {
                if (avczVar2.b == 1) {
                    avdb b2 = avdb.b(((avcy) avczVar2.c).b);
                    if (b2 == null) {
                        b2 = avdb.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED;
                    }
                    if (b2 == avdb.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_MIDROLL_AD_START) {
                        j(this.b.d(wxrVar.e()));
                        return;
                    }
                }
            }
        } else if (ordinal == 3) {
            if (this.b != null && wxrVar.b() == xdb.PRE_ROLL) {
                avdq avdqVar3 = this.b.e.c;
                if (avdqVar3 == null) {
                    avdqVar3 = avdq.a;
                }
                for (avcz avczVar3 : avdqVar3.l) {
                    if (avczVar3.b == 1) {
                        avdb b3 = avdb.b(((avcy) avczVar3.c).b);
                        if (b3 == null) {
                            b3 = avdb.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED;
                        }
                        if (b3 == avdb.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_PREROLL_AD_FINISH) {
                            j(this.b.d(wxrVar.e()));
                            return;
                        }
                    }
                }
            }
            if (this.b == null || wxrVar.b() != xdb.MID_ROLL) {
                return;
            }
            avdq avdqVar4 = this.b.e.c;
            if (avdqVar4 == null) {
                avdqVar4 = avdq.a;
            }
            for (avcz avczVar4 : avdqVar4.l) {
                if (avczVar4.b == 1) {
                    avdb b4 = avdb.b(((avcy) avczVar4.c).b);
                    if (b4 == null) {
                        b4 = avdb.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_UNSPECIFIED;
                    }
                    if (b4 == avdb.SURVEY_DISPLAY_TRIGGER_PLAYBACK_EVENT_MIDROLL_AD_FINISH) {
                        j(this.b.d(wxrVar.e()));
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.ae(fuj.b, fuj.a).I().G(aypa.a()).aa(new fuk(this), dzq.t)};
    }

    @Override // defpackage.ezb
    public final void h(ezw ezwVar) {
        fvp fvpVar = this.b;
        if (fvpVar == null || !m(fvpVar.e)) {
            return;
        }
        r();
    }

    public final void i(avdu avduVar) {
        if (avduVar == null) {
            return;
        }
        fvp fvpVar = this.b;
        if (fvpVar == null || !fvpVar.e(avduVar)) {
            fvp fvpVar2 = this.q;
            if (fvpVar2 == null || !fvpVar2.e(avduVar)) {
                return;
            }
            this.h.a().i(3);
            return;
        }
        this.b = null;
    }

    public final void j(fvp fvpVar) {
        if (this.v) {
            this.w = true;
            return;
        }
        BottomUiContainer a = this.h.a();
        if (a == null) {
            return;
        }
        fvo f = fvpVar.f();
        f.k = new fum(this, fvpVar);
        fvp a2 = f.a();
        if (!this.h.j(a2)) {
            return;
        }
        this.h.e(a2);
        if (this.p == null) {
            fwg fwgVar = this.o;
            HatsContainer g = a.g();
            ajxz ajxzVar = (ajxz) fwgVar.a.get();
            ajxzVar.getClass();
            aafo aafoVar = (aafo) fwgVar.b.get();
            aafoVar.getClass();
            ayom ayomVar = (ayom) fwgVar.c.get();
            ayomVar.getClass();
            g.getClass();
            this.p = new fwf(ajxzVar, aafoVar, ayomVar, g);
        }
        a.o(a2, this.p, BottomUiContainer.m(this, a2));
        r();
    }

    public final void k(avdu avduVar) {
        l(avduVar, false);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ahhw ahhwVar = (ahhw) obj;
                if (this.b == null) {
                    this.e = ahhwVar;
                    return null;
                }
                wxq wxqVar = wxq.AD_INTERRUPT_ACQUIRED;
                aijw aijwVar = aijw.PLAYBACK_PENDING;
                aika aikaVar = aika.NEW;
                int ordinal = ahhwVar.c().ordinal();
                if (ordinal != 8) {
                    if (ordinal != 9 || !p(this.b.e)) {
                        return null;
                    }
                    j(this.b.d(ahhwVar.e()));
                    return null;
                } else if (!m(this.b.e)) {
                    return null;
                } else {
                    j(this.b.d(ahhwVar.e()));
                    return null;
                }
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhw.class};
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
        if (r3 == 0) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.avdu r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.common.ui.bottomui.HatsController.l(avdu, boolean):void");
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        fvp fvpVar = (fvp) obj;
        this.h.f();
        this.q = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0123 A[ORIG_RETURN, RETURN] */
    @Override // defpackage.akev
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void lf(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.common.ui.bottomui.HatsController.lf(java.lang.Object):void");
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        if (eog.aq(this.x)) {
            this.t.c();
        } else {
            this.r.m(this);
        }
        ((ezh) this.i.get()).j(this);
        ((ezd) this.j.get()).h(this);
        this.k.k(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (eog.aq(this.x)) {
            this.t.g(g(this.s));
        } else {
            this.r.g(this);
        }
        this.t.g(this.s.ab().O(gam.b).I().G(aypa.a()).aa(new fuk(this, 1), dzq.t));
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (ezxVar.j()) {
            this.b = null;
        } else if (ezxVar.b()) {
            this.v = true;
        } else if (ezxVar != ezx.WATCH_WHILE_MAXIMIZED) {
        } else {
            if (this.v && this.w) {
                this.v = false;
                this.l.postDelayed(new Runnable() { // from class: ful
                    @Override // java.lang.Runnable
                    public final void run() {
                        HatsController hatsController = HatsController.this;
                        fvp fvpVar = hatsController.b;
                        if (fvpVar != null) {
                            hatsController.j(fvpVar);
                        }
                    }
                }, 750L);
            }
            this.v = false;
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    public final void q(fvp fvpVar, apzg apzgVar) {
        if (apzgVar.qn(FeedbackEndpointOuterClass.feedbackEndpoint)) {
            aopa mo52toBuilder = ((aqyh) apzgVar.qm(FeedbackEndpointOuterClass.feedbackEndpoint)).mo52toBuilder();
            if (TextUtils.isEmpty(fvpVar.l)) {
                mo52toBuilder.copyOnWrite();
                aqyh aqyhVar = (aqyh) mo52toBuilder.instance;
                aqyhVar.b &= -5;
                aqyhVar.g = aqyh.a.g;
            } else {
                String str = fvpVar.l;
                mo52toBuilder.copyOnWrite();
                aqyh aqyhVar2 = (aqyh) mo52toBuilder.instance;
                str.getClass();
                aqyhVar2.b |= 4;
                aqyhVar2.g = str;
            }
            aopa createBuilder = auqr.a.createBuilder();
            String k = this.u.oi().k();
            createBuilder.copyOnWrite();
            auqr auqrVar = (auqr) createBuilder.instance;
            k.getClass();
            auqrVar.b |= 1;
            auqrVar.c = k;
            aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
            aopcVar.e(FeedbackEndpointOuterClass.feedbackEndpoint, (aqyh) mo52toBuilder.mo39build());
            aopcVar.e(auqs.b, (auqr) createBuilder.mo39build());
            apzg apzgVar2 = (apzg) aopcVar.mo39build();
        }
    }
}
