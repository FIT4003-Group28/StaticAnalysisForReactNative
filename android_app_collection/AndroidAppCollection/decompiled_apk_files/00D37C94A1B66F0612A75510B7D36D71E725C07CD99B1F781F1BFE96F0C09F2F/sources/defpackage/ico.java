package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelPlaybackErrorLogger;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelRecyclerView;
import com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPauseLifecycleObserver;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelPlayerView;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyRendererOuterClass;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: ico  reason: default package */
/* loaded from: classes3.dex */
public final class ico extends hyo implements ibn, ier, ies, iei, icy, ifv, ifl, iam, gto, gtq, icq, eda, iae {
    static final String a = String.valueOf(ibl.class.getName()).concat("$ReelSequenceControllerStateKey");
    static final String b = String.valueOf(ico.class.getName()).concat("$ReelSequenceControllerStateKey");
    public static final /* synthetic */ int bD = 0;
    public yni aA;
    public ajmy aB;
    public aafo aC;
    public afvn aD;
    public afwc aE;
    public yzj aF;
    public Optional aG;
    public acth aH;
    public ahub aI;
    public axnm aJ;
    public Context aK;
    public Handler aL;
    public aiba aM;
    public SubtitlesOverlayPresenter aN;
    public aibi aO;
    public axnm aP;
    public axnm aQ;
    public axnm aR;
    public axnm aS;
    public zdp aT;
    public yrj aU;
    public afkf aV;
    public afst aW;
    public aadd aX;
    public amqo aY;
    public amqo aZ;
    public gts ae;
    public iai af;
    public hyx ag;
    public ifu ah;
    public icx ai;
    public ReelPlaybackErrorLogger aj;
    public ian ak;
    public ieu al;
    public iak am;
    public icr an;
    public iee ao;
    public icw ap;
    public ias aq;
    public idx ar;
    public hyu as;
    public iex at;
    public edd au;
    public airr av;
    public aijf aw;
    public aire ax;
    public airw ay;
    public snc az;
    public adyb bA;
    public aafd bB;
    public rzc bC;
    private ReelRecyclerView bE;
    private apzg bF;
    private icn bG;
    private apzg bN;
    private long bO;
    private long bP;
    public amqo ba;
    public acuu bb;
    public ajpa bc;
    public Set bd;
    public yve be;
    public artv bf;
    public ieh bg;
    public ReelPlayerView bh;
    public Bundle bi;
    public String bj;
    public PlaybackStartDescriptor bk;
    public boolean bl;
    public iat bn;
    public icp bo;
    public String bp;
    public apzg bs;
    public Runnable bu;
    public boolean bv;
    public boolean bw;
    public boolean bx;
    public aikh by;
    public aacz bz;
    public ihp d;
    public ifm e;
    public final afmw c = new icd(this);
    public int bm = 0;
    private boolean bH = false;
    private boolean bI = false;
    private boolean bJ = false;
    final icm bq = new icm(this);
    final icj br = new icj(this);
    private final aypf bK = new aypf();
    private final azpo bL = azpo.W();
    private final azpx bM = azpm.e().aO();
    public final Object bt = new Object();
    private boolean bQ = true;

    public static ico aE(Bundle bundle) {
        bundle.getParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor").getClass();
        ico icoVar = new ico();
        icoVar.ae(bundle);
        return icoVar;
    }

    static iet aG(Optional optional) {
        if (optional.isPresent()) {
            ibk ibkVar = ((iaj) optional.get()).f;
            if (!(ibkVar instanceof ibi)) {
                return null;
            }
            return ((ibi) ibkVar).v;
        }
        return null;
    }

    private final int bA(boolean z) {
        aunb aunbVar;
        artv artvVar = this.bf;
        if (artvVar == null) {
            return 1;
        }
        aulr x = hqp.x(artvVar);
        if (x == null || (x.b & 512) == 0) {
            aunbVar = null;
        } else {
            aunbVar = x.l;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
        }
        aoob v = hqp.v(aunbVar);
        artv artvVar2 = this.bf;
        if ((artvVar2.b & 16) == 0) {
            if (!z) {
                return 1;
            }
            return bz(iah.b(v));
        }
        apzg apzgVar = artvVar2.g;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aZ(apzgVar, 1, null);
        if (v != null) {
            bt(v);
        }
        aijl d = PlaybackStartDescriptor.d();
        d.a = this.bs;
        this.ax.a(new aiqk(aiqj.JUMP, d.a(), ifu.a((acvg) this.am.a().orElse(null), ifu.f(aI()), false, null)));
        iet aF = aF();
        if (aF == null) {
            return 2;
        }
        aF.d.e();
        return 2;
    }

    private final int bB(boolean z) {
        if (this.bf == null) {
            return 1;
        }
        int bh = bh(false, false);
        if (bh == 1 && z) {
            bh = bA(false);
        }
        if (bh != 1) {
            return bh;
        }
        if (this.af.w) {
            return bg(iah.a(2), false);
        }
        return bz(iah.a(2));
    }

    private static final aulw bC(aulr aulrVar) {
        if (aulrVar != null) {
            aulx aulxVar = aulrVar.h;
            if (aulxVar == null) {
                aulxVar = aulx.a;
            }
            if ((aulxVar.b & 1) == 0) {
                return null;
            }
            aulx aulxVar2 = aulrVar.h;
            if (aulxVar2 == null) {
                aulxVar2 = aulx.a;
            }
            aulw aulwVar = aulxVar2.c;
            return aulwVar == null ? aulw.a : aulwVar;
        }
        return null;
    }

    private final int bn() {
        return gtm.d(this.m).orElse(-1);
    }

    private final Optional bo() {
        if (bv()) {
            apzg apzgVar = this.bs;
            if (apzgVar == null) {
                return Optional.empty();
            }
            return Optional.of(((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).d);
        }
        asaj asajVar = ((artv) Optional.ofNullable(this.bf).orElse(artv.a)).e;
        if (asajVar == null) {
            asajVar = asaj.a;
        }
        asap asapVar = asajVar.g;
        if (asapVar == null) {
            asapVar = asap.a;
        }
        return Optional.of(asapVar.c);
    }

    private final void bp(actj actjVar) {
        iet aF;
        idw idwVar;
        auld auldVar = this.aX.a().u;
        if (auldVar == null) {
            auldVar = auld.a;
        }
        if (!auldVar.k) {
            this.aI.k();
        }
        aH().H(3, new acte(actjVar), null);
        this.am.b();
        if (mJ() != null && (aF = aF()) != null && (idwVar = aF.f) != null) {
            idwVar.h();
        }
        apzg apzgVar = this.bF;
        if (apzgVar != null) {
            this.aC.a(apzgVar);
        }
    }

    private final void bq() {
        if (this.bI) {
            if (((gfu) this.aJ.get()).a() == gfs.DARK) {
                br();
                return;
            } else if (Build.VERSION.SDK_INT < 23) {
                mJ().getWindow().setStatusBarColor(zhn.d(this.aK, R.attr.ytStatusBarBackground));
                return;
            } else if (Build.VERSION.SDK_INT < 23) {
                return;
            } else {
                View decorView = mJ().getWindow().getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
        }
        bs(1);
    }

    private final void br() {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        View decorView = mJ().getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
    }

    private final void bs(int i) {
        Window window = mJ().getWindow();
        if (i == 0) {
            window.addFlags(1024);
        } else if (i != 1) {
            window.clearFlags(1024);
            window.clearFlags(67108864);
            window.addFlags(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            window.setStatusBarColor(0);
            mJ().getWindow().getDecorView().setSystemUiVisibility(1280);
            br();
        } else {
            window.clearFlags(-2080373760);
            this.O.setFitsSystemWindows(true);
        }
    }

    private final void bt(aoob aoobVar) {
        apzg apzgVar = this.bs;
        if (apzgVar == null) {
            return;
        }
        if (aoobVar != null) {
            aH().u(new acte(aoobVar), null);
            aopc aopcVar = (aopc) this.bs.mo52toBuilder();
            aopcVar.copyOnWrite();
            apzg apzgVar2 = (apzg) aopcVar.instance;
            apzgVar2.b |= 1;
            apzgVar2.c = aoobVar;
            this.bs = (apzg) aopcVar.mo39build();
            return;
        }
        aopc aopcVar2 = (aopc) apzgVar.mo52toBuilder();
        aopcVar2.copyOnWrite();
        apzg apzgVar3 = (apzg) aopcVar2.instance;
        apzgVar3.b &= -2;
        apzgVar3.c = apzg.a.c;
        this.bs = (apzg) aopcVar2.mo39build();
    }

    private final boolean bu() {
        return !this.aG.isPresent() || ((fdu) this.aG.get()).b == fdq.REEL;
    }

    private final boolean bv() {
        return aI().H;
    }

    private static boolean bw(PlaybackStartDescriptor playbackStartDescriptor) {
        return hqp.q(hqp.f(playbackStartDescriptor)) == 12;
    }

    private final boolean bx() {
        auld auldVar = this.aX.a().u;
        if (auldVar == null) {
            auldVar = auld.a;
        }
        return auldVar.i;
    }

    private final boolean by() {
        return eog.aq(this.bz) || bc();
    }

    @Override // defpackage.hyo, defpackage.dp
    public final void T(Activity activity) {
        this.bO = System.currentTimeMillis();
        super.T(activity);
    }

    @Override // defpackage.dp
    public final void W() {
        dt mJ;
        ImageView imageView;
        iet aF = aF();
        if (aF != null) {
            aF.e.d(true);
            aF.j.g();
            if (aF.r && aF.f != null && (mJ = mJ()) != null && !mJ.isFinishing()) {
                idw idwVar = aF.f;
                if (aI().F && ((imageView = idwVar.e) == null || imageView.getVisibility() != 0)) {
                    idw idwVar2 = aF.f;
                    idwVar2.a(this.bh.c, Optional.empty());
                    idwVar2.g();
                }
            }
        }
        if (this.bl) {
            this.ak.b();
        }
        if (this.aq.e()) {
            this.aq.b();
        }
        ifu ifuVar = this.ah;
        ifuVar.k.c();
        ifuVar.c();
        this.bB.d(this);
        ListIterator listIterator = this.e.a.listIterator();
        while (listIterator.hasNext()) {
            ifl iflVar = (ifl) ((WeakReference) listIterator.next()).get();
            if (iflVar == this || iflVar == null) {
                listIterator.remove();
            }
        }
        this.aA.m(this.am);
        this.bK.c();
        this.aA.m(this.bg.b.o);
        if (!by()) {
            this.aA.m(this.bq);
        }
        this.aA.m(this.br);
        if (bu()) {
            this.av.a();
            this.av.z(mJ().isFinishing());
        }
        this.aI.q(ahta.a);
        super.W();
    }

    @Override // defpackage.dp
    public final void Y() {
        if (bf()) {
            this.am.c("r_fr");
        }
        super.Y();
        this.bh.requestLayout();
        this.aG.ifPresent(fyb.h);
        if (bf()) {
            this.am.c("r_fcp");
        }
        if (by()) {
            this.bK.g(this.bq.g(this.ay));
        } else {
            this.aA.g(this.bq);
        }
        this.aA.g(this.br);
        if (bx()) {
            this.bK.g(this.aO.g(this.ay));
            this.bK.g(this.aN.g(this.ay));
        }
        this.bK.g(this.bg.b.n.g(this.ay));
        this.bK.g(this.bg.b.u.g(this.ay));
        this.aA.g(this.bg.b.o);
        this.aA.g(this.am);
        aypf aypfVar = this.bK;
        aynx O = this.ay.V().n().O(gam.p);
        icm icmVar = this.bq;
        icmVar.getClass();
        int i = 0;
        aynx aynxVar = this.ay.G().c;
        icm icmVar2 = this.bq;
        icmVar2.getClass();
        aynx ab = this.ay.ab();
        icm icmVar3 = this.bq;
        icmVar3.getClass();
        aypfVar.g(O.Z(new icc(icmVar, 1)), aynxVar.aa(new icc(icmVar2), ick.b), ab.aa(new icc(icmVar3, 2), ick.b));
        this.bB.c(this);
        this.e.a(this);
        PlaybackStartDescriptor playbackStartDescriptor = this.bk;
        if (playbackStartDescriptor != null) {
            iai iaiVar = this.af;
            final String l = playbackStartDescriptor.l();
            final String k = this.bk.k();
            if (l == null) {
                l = "";
            }
            if (k == null) {
                k = "";
            }
            final Long[] lArr = {Long.MIN_VALUE};
            iaiVar.m.J(new zdt() { // from class: hzv
                @Override // defpackage.zdt
                public final void a(Object obj) {
                    Long[] lArr2 = lArr;
                    String str = l;
                    String str2 = k;
                    iaj iajVar = (iaj) obj;
                    if (lArr2[0].longValue() == Long.MIN_VALUE) {
                        ReelWatchEndpointOuterClass$ReelWatchEndpoint a2 = iajVar.a();
                        if (!str.equals(a2.d) || !str2.equals(a2.e) || iajVar.b) {
                            return;
                        }
                        lArr2[0] = Long.valueOf(iajVar.a);
                    }
                }
            });
            long longValue = lArr[0].longValue();
            if (longValue != Long.MIN_VALUE) {
                iai iaiVar2 = this.af;
                ibp ibpVar = new ibp(this);
                if (longValue != Long.MIN_VALUE) {
                    iaiVar2.D = ibpVar;
                    int B = iaiVar2.m.B(longValue);
                    if (iaiVar2.v == Long.MIN_VALUE) {
                        iaiVar2.v = longValue;
                    }
                    if (B >= 0) {
                        iaiVar2.x = B;
                        iaiVar2.n.ab(B);
                    }
                }
            }
        }
        iet aF = aF();
        if (aF != null) {
            aF.d.e();
        }
        if (true == this.bJ) {
            i = 2;
        }
        bs(i);
        ice iceVar = new ice(this);
        if (bf()) {
            this.am.c("r_fgw");
        }
        this.bh.getViewTreeObserver().addOnGlobalLayoutListener(iceVar);
        if (this.bh.getWidth() == 0 || this.bh.getHeight() == 0) {
            return;
        }
        iceVar.onGlobalLayout();
    }

    @Override // defpackage.gto
    public final aynr a() {
        return this.bL.x();
    }

    @Override // defpackage.iei
    public final iet aF() {
        return aG(this.af.g());
    }

    public final acti aH() {
        return this.aH.oi();
    }

    public final aull aI() {
        arhd a2 = this.aX.a();
        if (a2 == null) {
            a2 = arhd.a;
        }
        auld auldVar = a2.u;
        if (auldVar == null) {
            auldVar = auld.a;
        }
        aull aullVar = auldVar.d;
        return aullVar == null ? aull.a : aullVar;
    }

    public final aulr aJ() {
        artv artvVar = this.bf;
        if (artvVar != null) {
            auls aulsVar = artvVar.d;
            if (aulsVar == null) {
                aulsVar = auls.a;
            }
            if ((aulsVar.b & 1) == 0) {
                return null;
            }
            auls aulsVar2 = this.bf.d;
            if (aulsVar2 == null) {
                aulsVar2 = auls.a;
            }
            aulr aulrVar = aulsVar2.c;
            return aulrVar == null ? aulr.a : aulrVar;
        }
        return null;
    }

    public final aumh aK() {
        Optional g = this.af.g();
        if (g.isPresent()) {
            iaj iajVar = (iaj) g.get();
            if (!iajVar.b) {
                return null;
            }
            aunb aunbVar = iajVar.a().p;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            return (aumh) aunbVar.qm(ReelWatchSurveyRendererOuterClass.reelWatchSurveyRenderer);
        }
        return null;
    }

    public final void aL() {
        zdg.c(rb(), this.bh, rb().getString(R.string.reel_accessibility_playback_ended));
    }

    public final void aM(actj actjVar) {
        bp(actjVar);
        dt mJ = mJ();
        if (mJ != null) {
            aukw aukwVar = this.bz.b().E;
            if (aukwVar == null) {
                aukwVar = aukw.a;
            }
            if (!aukwVar.c) {
                mJ.finishAfterTransition();
                mJ.overridePendingTransition(0, true != this.bH ? R.anim.reel_activity_slide_down : R.anim.reel_activity_slide_out_right);
            }
            this.bL.sm();
        }
    }

    public final void aN() {
        PlaybackStartDescriptor playbackStartDescriptor = this.bk;
        if (playbackStartDescriptor == null) {
            hqp.C(1, "No playbackStartDescriptor available when loadPlaybackService called.");
        } else {
            this.ax.e(playbackStartDescriptor, ifu.a((acvg) this.am.a().orElse(null), ifu.f(aI()), false, null));
        }
    }

    public final void aO() {
        Runnable runnable;
        synchronized (this.bt) {
            if ((this.bv || this.bw) && ((this.bQ || !aI().B) && (runnable = this.bu) != null)) {
                this.aL.post(runnable);
                this.bu = null;
            }
        }
    }

    @Override // defpackage.ier
    public final void aP() {
        mJ().onBackPressed();
    }

    @Override // defpackage.ier
    public final void aQ() {
        aulr aJ = aJ();
        if (aJ != null) {
            aulq aulqVar = aJ.f;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aulp aulpVar = aulqVar.c;
            if (aulpVar == null) {
                aulpVar = aulp.a;
            }
            if ((aulpVar.b & 4) == 0) {
                return;
            }
            aulq aulqVar2 = aJ.f;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            aulp aulpVar2 = aulqVar2.c;
            if (aulpVar2 == null) {
                aulpVar2 = aulp.a;
            }
            if ((aulpVar2.b & 64) != 0) {
                aH().H(3, new acte(aulpVar2.h), null);
            }
            aafo aafoVar = this.aC;
            apzg apzgVar = aulpVar2.e;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }

    @Override // defpackage.ifv
    public final void aR() {
        icw icwVar = this.ap;
        icwVar.d.oi().m(icwVar.a);
        if (this.bl) {
            ian ianVar = this.ak;
            if (ianVar.h == null) {
                return;
            }
            int i = ianVar.a;
            if ((i & 1) != 0) {
                return;
            }
            ianVar.a = i | 1;
            ianVar.c.oi().n(new acte(ianVar.h));
            ianVar.d();
        }
    }

    @Override // defpackage.ifl
    public final void aS(arqn arqnVar, arqo arqoVar) {
        int bL = awwc.bL(arqoVar.c);
        if (bL != 0 && bL == 2) {
            gts gtsVar = this.ae;
            String str = arqnVar.d;
            synchronized (gtsVar.a) {
                gtsVar.a.remove(str);
            }
            if (bB(true) != 1) {
                return;
            }
            aM(actj.LIGHTWEIGHT_PLAYER_AUTO_DISMISS);
        }
    }

    @Override // defpackage.ifv
    public final void aT(long j, artv artvVar, boolean z) {
        String str;
        long j2;
        if (!bv()) {
            if (artvVar != null) {
                asaj asajVar = artvVar.e;
                if (asajVar == null) {
                    asajVar = asaj.a;
                }
                if ((asajVar.b & 8) != 0) {
                    asaj asajVar2 = artvVar.e;
                    if (asajVar2 == null) {
                        asajVar2 = asaj.a;
                    }
                    asap asapVar = asajVar2.g;
                    if (asapVar == null) {
                        asapVar = asap.a;
                    }
                    str = asapVar.c;
                }
            }
            str = null;
        } else {
            str = (String) bo().orElse("");
        }
        if ((artvVar.b & 4096) != 0) {
            apzg apzgVar = artvVar.k;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            this.bN = apzgVar;
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if (bv()) {
                str = reelWatchEndpointOuterClass$ReelWatchEndpoint.d;
            }
            apzg apzgVar2 = this.bN;
            this.bs = apzgVar2;
            iai iaiVar = this.af;
            iaiVar.o(j, apzgVar2);
            if (j == iaiVar.v && apzgVar2.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                iaiVar.B.a = !hqp.o(hqp.d((ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar2.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)));
                iaiVar.B.b = iai.s((aull) iaiVar.d.get());
            }
            this.ae.e(this.bN);
            this.bM.c(this.bN);
            this.am.e(str);
            if (hqp.q(reelWatchEndpointOuterClass$ReelWatchEndpoint) != 1) {
                iak iakVar = this.am;
                int i = iak.i(reelWatchEndpointOuterClass$ReelWatchEndpoint);
                synchronized (iakVar.a) {
                    if (iakVar.c != null) {
                        int i2 = iakVar.f;
                        if (i2 == 0) {
                            throw null;
                        }
                        if (i2 != i) {
                            iakVar.f = i;
                            aopa createBuilder = asnu.a.createBuilder();
                            createBuilder.copyOnWrite();
                            asnu asnuVar = (asnu) createBuilder.instance;
                            asnuVar.f = i - 1;
                            asnuVar.b |= 8;
                            asnu asnuVar2 = (asnu) createBuilder.mo39build();
                            aopa createBuilder2 = asno.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            asno asnoVar = (asno) createBuilder2.instance;
                            asnuVar2.getClass();
                            asnoVar.x = asnuVar2;
                            asnoVar.c |= 1073741824;
                            iakVar.c.a((asno) createBuilder2.mo39build());
                        }
                    }
                }
            }
            iet aF = aF();
            if (aI().G && this.ao.d() && aF != null) {
                aF.f.f(reelWatchEndpointOuterClass$ReelWatchEndpoint);
            }
        }
        if ((artvVar.b & 8192) != 0) {
            ibd ibdVar = this.af.b;
            String str2 = artvVar.l;
            if (!ibdVar.l && !amps.e(str2)) {
                ibdVar.l = true;
                ihq a2 = ibdVar.a.a();
                a2.a = str2;
                ibdVar.a(ibdVar.i, a2, 2);
            }
        }
        iak iakVar2 = this.am;
        synchronized (iakVar2.a) {
            if (iakVar2.c == null || !iakVar2.h(str)) {
                j2 = 0;
            } else {
                long c = iakVar2.b.c();
                iakVar2.c.c("ps_r");
                iakVar2.c.c("r_wrr");
                aopa createBuilder3 = asnu.a.createBuilder();
                int i3 = z ? 4 : 2;
                createBuilder3.copyOnWrite();
                asnu asnuVar3 = (asnu) createBuilder3.instance;
                asnuVar3.d = i3 - 1;
                asnuVar3.b = 2 | asnuVar3.b;
                asnu asnuVar4 = (asnu) createBuilder3.mo39build();
                aopa createBuilder4 = asno.a.createBuilder();
                String str3 = true != z ? "warm" : "hot";
                createBuilder4.copyOnWrite();
                asno asnoVar2 = (asno) createBuilder4.instance;
                asnoVar2.b |= 8;
                asnoVar2.g = str3;
                createBuilder4.copyOnWrite();
                asno asnoVar3 = (asno) createBuilder4.instance;
                asnuVar4.getClass();
                asnoVar3.x = asnuVar4;
                asnoVar3.c |= 1073741824;
                iakVar2.c.a((asno) createBuilder4.mo39build());
                j2 = c - iakVar2.d;
            }
        }
        if (aI().x) {
            synchronized (this.bt) {
                if (this.bu != null) {
                    hqp.C(1, "Last delayed ReelItemPlayback not processed during playback");
                }
                this.bu = new ibt(this, j2, j, artvVar, 1);
                aO();
            }
            return;
        }
        mJ().runOnUiThread(new ibt(this, j2, j, artvVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aU(long r16, defpackage.artv r18, long r19) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ico.aU(long, artv, long):void");
    }

    @Override // defpackage.ifv
    public final void aV(final long j, final apzg apzgVar, final artv artvVar, final int i) {
        mJ().runOnUiThread(new Runnable() { // from class: ibs
            @Override // java.lang.Runnable
            public final void run() {
                ico icoVar = ico.this;
                int i2 = i;
                artv artvVar2 = artvVar;
                long j2 = j;
                apzg apzgVar2 = apzgVar;
                if (i2 == 0) {
                    if ((artvVar2.b & 8) == 0) {
                        return;
                    }
                    apzg apzgVar3 = artvVar2.f;
                    if (apzgVar3 == null) {
                        apzgVar3 = apzg.a;
                    }
                    icoVar.aY(apzgVar3);
                } else if (i2 == 1) {
                    if ((artvVar2.b & 16) == 0) {
                        return;
                    }
                    apzg apzgVar4 = artvVar2.g;
                    if (apzgVar4 == null) {
                        apzgVar4 = apzg.a;
                    }
                    icoVar.aY(apzgVar4);
                } else {
                    iai iaiVar = icoVar.af;
                    if (apzgVar2 == null || artvVar2 == null) {
                        return;
                    }
                    Optional h = iaiVar.h(j2);
                    if (!h.isPresent()) {
                        return;
                    }
                    iaj iajVar = (iaj) h.get();
                    if (iajVar.e != null) {
                        return;
                    }
                    iajVar.b(artvVar2);
                    ibk ibkVar = iajVar.f;
                    if (!(ibkVar instanceof ibi)) {
                        return;
                    }
                    hyu hyuVar = iaiVar.a;
                    ReelWatchEndpointOuterClass$ReelWatchEndpoint a2 = iajVar.a();
                    asaj asajVar = artvVar2.e;
                    if (asajVar == null) {
                        asajVar = asaj.a;
                    }
                    hyuVar.d(a2, asajVar);
                    String str = ((ReelWatchEndpointOuterClass$ReelWatchEndpoint) iajVar.d.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)).d;
                    iet ietVar = ((ibi) ibkVar).v;
                    ietVar.l(str, artvVar2, j2, hqp.g(iajVar.a()), iajVar.c, iajVar.a());
                    ietVar.d.c();
                }
            }
        });
    }

    @Override // defpackage.ifv
    public final void aW(apzg apzgVar) {
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = apzgVar == null ? null : (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        String str = reelWatchEndpointOuterClass$ReelWatchEndpoint == null ? null : reelWatchEndpointOuterClass$ReelWatchEndpoint.d;
        icw icwVar = this.ap;
        icwVar.g = this.af.q;
        icwVar.h = hqp.n(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        this.an.a(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        iak iakVar = this.am;
        synchronized (iakVar.a) {
            if (iakVar.c != null && iakVar.h(str)) {
                iakVar.c.c("r_wrs");
            }
        }
        this.bC = null;
    }

    public final void aX() {
        AccessibilityManager accessibilityManager;
        ibr ibrVar = new ibr(this, 2);
        if (!this.bl) {
            ibrVar.run();
            return;
        }
        ian ianVar = this.ak;
        ibx ibxVar = new ibx(ibrVar);
        ianVar.g = null;
        if (ianVar.d == null) {
            ibxVar.run();
            return;
        }
        try {
            if (!((ihs) ianVar.j.a().get(1000L, TimeUnit.MILLISECONDS)).b && (accessibilityManager = ianVar.f) != null && !accessibilityManager.isTouchExplorationEnabled()) {
                ianVar.g = ibrVar;
                if (ianVar.f()) {
                    ianVar.a();
                    return;
                }
                hqs.c(ianVar.d, true);
                ianVar.c(false);
                if (ianVar.d != null && ianVar.f() && ianVar.i == 0) {
                    ianVar.i = ianVar.b.a();
                }
                ianVar.h = actj.REEL_PLAYER_EDUCATIONAL_OVERLAY;
                ianVar.e();
                return;
            }
        } catch (Exception unused) {
        }
        ianVar.a();
        ibxVar.run();
    }

    public final void aY(apzg apzgVar) {
        if (apzgVar == null || !apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            return;
        }
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        iet aF = aF();
        if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 64) == 0 || aF == null) {
            return;
        }
        idw idwVar = aF.f;
        avhn avhnVar = reelWatchEndpointOuterClass$ReelWatchEndpoint.h;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        Uri r = akel.r(avhnVar, idwVar.d.getWidth(), idwVar.d.getHeight());
        if (r == null) {
            return;
        }
        idwVar.a.l(r, idwVar.j);
    }

    public final void aZ(apzg apzgVar, int i, acvg acvgVar) {
        this.bs = apzgVar;
        this.bf = null;
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        String str = reelWatchEndpointOuterClass$ReelWatchEndpoint != null ? reelWatchEndpointOuterClass$ReelWatchEndpoint.d : null;
        this.am.k(i, 4, reelWatchEndpointOuterClass$ReelWatchEndpoint, acvgVar, 0L);
        this.bg.e(0L);
        this.bg.f(0L);
        apzg apzgVar2 = this.bs;
        if (apzgVar2 != null && apzgVar2.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar2.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            iet aF = aF();
            if (aF != null) {
                if ((reelWatchEndpointOuterClass$ReelWatchEndpoint2.b & 64) != 0) {
                    aF.f.d(reelWatchEndpointOuterClass$ReelWatchEndpoint2);
                } else {
                    idw idwVar = aF.f;
                    idwVar.i = false;
                    idwVar.h = null;
                    idwVar.f.a(idwVar.d);
                    zag.o(idwVar.d, true);
                }
            }
        }
        if (reelWatchEndpointOuterClass$ReelWatchEndpoint != null) {
            this.af.o(this.af.f(), this.bs);
            this.ae.e(this.bs);
        }
        this.am.g(str, 0L);
    }

    @Override // defpackage.gto
    public final ayoi b() {
        return this.bM.R();
    }

    public final void ba(final Runnable runnable) {
        runnable.getClass();
        int i = true != this.aU.o() ? R.string.reel_error_no_connection : R.string.reel_generic_error_message;
        final iet aF = aF();
        if (aF != null) {
            aF.d.d(N(i), new Runnable() { // from class: ibw
                @Override // java.lang.Runnable
                public final void run() {
                    iet ietVar = iet.this;
                    Runnable runnable2 = runnable;
                    int i2 = ico.bD;
                    ietVar.d.b();
                    ietVar.d.e();
                    runnable2.run();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean bc() {
        return this.ay instanceof kpd;
    }

    @Override // defpackage.icy
    public final boolean bd(long j) {
        iai iaiVar = this.af;
        return (iaiVar.r() && !iaiVar.b.k) || iaiVar.m.B(j) != iaiVar.m.z();
    }

    @Override // defpackage.icy
    public final boolean be(long j) {
        iai iaiVar = this.af;
        return (iaiVar.r() && iaiVar.b.d()) || iaiVar.m.B(j) != iaiVar.m.y();
    }

    public final boolean bf() {
        aull aullVar;
        aadd aaddVar = this.aX;
        if (aaddVar == null) {
            aullVar = null;
        } else {
            auld auldVar = aaddVar.a().u;
            if (auldVar == null) {
                auldVar = auld.a;
            }
            aullVar = auldVar.d;
            if (aullVar == null) {
                aullVar = aull.a;
            }
        }
        return aullVar != null && aullVar.t;
    }

    public final int bg(iah iahVar, boolean z) {
        aulw bC;
        apzg apzgVar;
        if (this.av.p() != null) {
            artv artvVar = this.bf;
            if (artvVar != null && (apzgVar = this.bs) != null) {
                int i = artvVar.b;
                if ((i & 16) == 0 && (i & 8) == 0) {
                    this.ae.g(apzgVar);
                }
            }
            if (artvVar != null) {
                int i2 = artvVar.b;
                if ((i2 & 16) != 0 && (i2 & 8) == 0 && (bC = bC(aJ())) != null) {
                    int i3 = bC.b;
                    if ((i3 & 1) != 0 && (i3 & 2) != 0 && bC.c == 2) {
                        gts gtsVar = this.ae;
                        apzg apzgVar2 = this.bf.g;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        gtsVar.g(apzgVar2);
                    }
                }
            }
            aopa createBuilder = ReelWatchEndpointOuterClass$ReelWatchEndpoint.a.createBuilder();
            String p = this.av.p();
            createBuilder.copyOnWrite();
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) createBuilder.instance;
            p.getClass();
            reelWatchEndpointOuterClass$ReelWatchEndpoint.b |= 8;
            reelWatchEndpointOuterClass$ReelWatchEndpoint.e = p;
            createBuilder.copyOnWrite();
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) createBuilder.instance;
            reelWatchEndpointOuterClass$ReelWatchEndpoint2.b |= 16;
            reelWatchEndpointOuterClass$ReelWatchEndpoint2.f = 1;
            aopc aopcVar = (aopc) apzg.a.createBuilder();
            aopcVar.e(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint, (ReelWatchEndpointOuterClass$ReelWatchEndpoint) createBuilder.mo39build());
            this.ae.g((apzg) aopcVar.mo39build());
        }
        int t = this.af.t(iahVar);
        if (z && t == 1) {
            aL();
            if (!zdg.e(rb())) {
                aM(actj.LIGHTWEIGHT_PLAYER_AUTO_DISMISS);
                return 1;
            }
        }
        return t;
    }

    public final int bh(boolean z, boolean z2) {
        aunb aunbVar;
        apjf a2;
        artv artvVar = this.bf;
        if (artvVar == null) {
            return 1;
        }
        aulr x = hqp.x(artvVar);
        if (x == null || (x.b & 256) == 0) {
            aunbVar = null;
        } else {
            aunbVar = x.k;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
        }
        aoob v = hqp.v(aunbVar);
        artv artvVar2 = this.bf;
        if ((artvVar2.b & 8) == 0) {
            if (!z2) {
                return 1;
            }
            if (!z) {
                return bg(iah.b(v), true);
            }
            return bg(iah.a(2), true);
        }
        apzg apzgVar = artvVar2.f;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aZ(apzgVar, true != z ? 2 : 5, null);
        if (z) {
            if (x != null && (x.b & 1024) != 0 && (a2 = hqp.a(x)) != null) {
                bt(a2.d);
            }
        } else if (v != null) {
            bt(v);
        }
        aijl d = PlaybackStartDescriptor.d();
        d.f = z;
        d.e = z;
        d.a = this.bs;
        this.ax.a(new aiqk(aiqj.JUMP, d.a(), ifu.a((acvg) this.am.a().orElse(null), ifu.f(aI()), false, null)));
        iet aF = aF();
        if (aF != null) {
            aF.d.e();
        }
        return 2;
    }

    @Override // defpackage.icy
    public final int bi() {
        artv artvVar;
        boolean z = true;
        if (this.af.q && (artvVar = this.bf) != null) {
            z = hqp.o(hqp.x(artvVar));
        }
        return bh(false, z);
    }

    @Override // defpackage.icy
    public final int bj() {
        artv artvVar;
        boolean z = true;
        if (this.af.q && (artvVar = this.bf) != null) {
            aulr x = hqp.x(artvVar);
            z = hqp.o(x);
            if ((this.bf.b & 16) == 0 && hqp.o(x)) {
                this.av.V(0L);
                return 4;
            }
        }
        return bA(z);
    }

    @Override // defpackage.icy
    public final void bk() {
        bg(iah.a(0), true);
    }

    @Override // defpackage.icy
    public final void bl() {
        bz(iah.a(0));
    }

    @Override // defpackage.ifv
    public final void bm(String str) {
        mJ().runOnUiThread(new ibv(this, str, 1));
    }

    @Override // defpackage.gto
    public final void c() {
        bq();
    }

    @Override // defpackage.gto
    public final void d() {
    }

    @Override // defpackage.gto
    public final boolean h() {
        if (this.ak.f()) {
            this.ak.b();
            return true;
        } else if (this.aq.e()) {
            this.aq.b();
            return true;
        } else if (bn() == 0) {
            bp(actj.MOBILE_BACK_BUTTON);
            return false;
        } else {
            bq();
            return false;
        }
    }

    @Override // defpackage.gto
    public final boolean k() {
        if (this.ak.f()) {
            this.ak.b();
            return false;
        } else if (this.aq.e()) {
            this.aq.b();
            return false;
        } else if (bn() == 0) {
            aM(actj.MOBILE_BACK_BUTTON);
            return false;
        } else {
            bq();
            return true;
        }
    }

    @Override // defpackage.hyo, defpackage.dp
    public final void kt(Context context) {
        this.bO = System.currentTimeMillis();
        super.kt(context);
    }

    @Override // defpackage.gtq
    public final Object l() {
        aull aullVar;
        aadd aaddVar = this.aX;
        if (aaddVar == null) {
            aullVar = null;
        } else {
            auld auldVar = aaddVar.a().u;
            if (auldVar == null) {
                auldVar = auld.a;
            }
            aullVar = auldVar.d;
            if (aullVar == null) {
                aullVar = aull.a;
            }
        }
        if (aullVar == null || !aullVar.z) {
            return null;
        }
        return new icn(new ReelToReelList(this.af.i(), this.af.j()));
    }

    @Override // defpackage.gtq
    public final void m(Object obj) {
        if (obj instanceof icn) {
            this.bG = (icn) obj;
        }
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        this.bP = this.az.c();
        super.mQ(bundle);
        this.an.h(this);
        this.bn = new iat(this.bb, this.ah, this.d);
        this.bo = new icp(this.bb, this.ah);
        amzs it = ((amyt) this.bd).iterator();
        while (it.hasNext()) {
            this.X.c((apx) it.next());
        }
        if (bundle != null) {
            this.bi = bundle.getBundle(a);
            this.bj = bundle.getString(b);
        }
    }

    @Override // defpackage.dp
    public final void mR() {
        iai iaiVar = this.af;
        iaiVar.r = null;
        iaiVar.s = null;
        hzs hzsVar = iaiVar.m;
        synchronized (hzsVar.d) {
            for (iaj iajVar : hzsVar.d) {
                ibk ibkVar = iajVar.f;
                if (ibkVar != null) {
                    ibkVar.F();
                }
            }
            hzsVar.d.clear();
        }
        hzsVar.mr();
        this.at.a.clear();
        this.au.c(null);
        ihp ihpVar = this.d;
        if (ihpVar.b == this.af) {
            ihpVar.b = null;
        }
        if (bu() && !this.av.T()) {
            this.av.s();
        }
        ReelRecyclerView reelRecyclerView = this.bE;
        if (reelRecyclerView != null) {
            this.bc.b(reelRecyclerView);
        }
        if (bc()) {
            this.bo.a(aH());
        }
        super.mR();
    }

    @Override // defpackage.dp
    public final void mS() {
        if (bf()) {
            this.am.c("r_fs");
        }
        super.mS();
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x03cc, code lost:
        if (r3.e != false) goto L191;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ee A[EDGE_INSN: B:223:0x02ee->B:124:0x02ee ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0263  */
    @Override // defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mc(android.view.LayoutInflater r27, android.view.ViewGroup r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 1459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ico.mc(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.iae
    public final void n(int i) {
        synchronized (this.bt) {
            this.bQ = i == 0;
            aO();
        }
    }

    @Override // defpackage.ibn
    public final /* bridge */ /* synthetic */ apx o() {
        idx idxVar = this.ar;
        iee ieeVar = (iee) idxVar.a.get();
        ieeVar.getClass();
        iei ieiVar = (iei) idxVar.b.get();
        ieiVar.getClass();
        return new ReelPauseLifecycleObserver(ieeVar, ieiVar);
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ReelPlayerView reelPlayerView = this.bh;
        if (reelPlayerView == null) {
            afus.b(2, 24, "null playerView in ReelWatchFragment#onConfigurationChanged");
            dt mJ = mJ();
            if (mJ == null) {
                return;
            }
            mJ.finish();
            return;
        }
        int width = reelPlayerView.getWidth();
        int height = this.bh.getHeight();
        ViewTreeObserver viewTreeObserver = this.bh.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new icf(this, width, height, viewTreeObserver));
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        ReelToReelList reelToReelList;
        PlaybackStartDescriptor playbackStartDescriptor;
        aull aullVar = null;
        PlaybackServiceState l = bu() ? this.av.l(true) : null;
        if (l != null && (playbackStartDescriptor = l.a) != null) {
            if (this.bN == null || !hqp.k(playbackStartDescriptor)) {
                bundle.putParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", l.a);
            } else {
                aijl d = PlaybackStartDescriptor.d();
                d.a = this.bN;
                bundle.putParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", d.a());
            }
        }
        if (this.af.r()) {
            aadd aaddVar = this.aX;
            if (aaddVar != null) {
                auld auldVar = aaddVar.a().u;
                if (auldVar == null) {
                    auldVar = auld.a;
                }
                aullVar = auldVar.d;
                if (aullVar == null) {
                    aullVar = aull.a;
                }
            }
            if (aullVar != null && aullVar.y) {
                reelToReelList = new ReelToReelList(amuk.q(), amuk.q());
                bundle.putParcelable("ReelToReelListBundleKey", reelToReelList);
                String str = a;
                ibd ibdVar = this.af.b;
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("ReelSequenceController.IS_INITIALIZED_KEY", ibdVar.l);
                bundle2.putParcelable("ReelSequenceController.PENDING_PREV_CONTINUATION_KEY", ibdVar.h);
                bundle2.putParcelable("ReelSequenceController.PENDING_NEXT_CONTINUATION_KEY", ibdVar.i);
                bundle2.putBoolean("ReelSequenceController.END_OF_SEQUENCE_KEY", ibdVar.k);
                bundle.putBundle(str, bundle2);
                bundle.putBoolean("UseRpcSequenceKey", this.af.r());
                bundle.putString(b, this.aH.oi().k());
            }
        }
        reelToReelList = new ReelToReelList(this.af.i(), this.af.j());
        bundle.putParcelable("ReelToReelListBundleKey", reelToReelList);
        String str2 = a;
        ibd ibdVar2 = this.af.b;
        Bundle bundle22 = new Bundle();
        bundle22.putBoolean("ReelSequenceController.IS_INITIALIZED_KEY", ibdVar2.l);
        bundle22.putParcelable("ReelSequenceController.PENDING_PREV_CONTINUATION_KEY", ibdVar2.h);
        bundle22.putParcelable("ReelSequenceController.PENDING_NEXT_CONTINUATION_KEY", ibdVar2.i);
        bundle22.putBoolean("ReelSequenceController.END_OF_SEQUENCE_KEY", ibdVar2.k);
        bundle.putBundle(str2, bundle22);
        bundle.putBoolean("UseRpcSequenceKey", this.af.r());
        bundle.putString(b, this.aH.oi().k());
    }

    @Override // defpackage.ibn
    public final aulb p() {
        return (aulb) this.af.g().map(glk.r).map(glk.t).orElse(aulb.REEL_LOOP_BEHAVIOR_UNKNOWN);
    }

    @Override // defpackage.ibn
    public final void q(String str) {
        Optional bo = bo();
        if (!bo.isPresent() || !((String) bo.get()).equals(str)) {
            zag.q(rb(), R.string.reel_overflow_menu_error, 0);
            return;
        }
        asgn asgnVar = ((aulr) Optional.ofNullable(aJ()).orElse(aulr.a)).i;
        if (asgnVar == null) {
            asgnVar = asgn.a;
        }
        if (this.aD.t()) {
            bb(asgnVar);
        } else {
            this.aE.c(mJ(), null, new icg(this, asgnVar));
        }
    }

    @Override // defpackage.ibn
    public final void r(atep atepVar) {
        final aopa mo52toBuilder = atepVar.mo52toBuilder();
        ylx.n(L(), this.be.a(), hmv.i, new zdt() { // from class: ica
            @Override // defpackage.zdt
            public final void a(Object obj) {
                ico icoVar = ico.this;
                aopa aopaVar = mo52toBuilder;
                awvc awvcVar = (awvc) obj;
                if (awvcVar != null && awvcVar.d) {
                    aopa createBuilder = ateo.a.createBuilder();
                    arag h = ajgl.h(icoVar.rh().getString(R.string.reel_nerd_stats));
                    createBuilder.copyOnWrite();
                    ateo ateoVar = (ateo) createBuilder.instance;
                    h.getClass();
                    ateoVar.c = h;
                    ateoVar.b |= 1;
                    aopc aopcVar = (aopc) arhs.a.createBuilder();
                    arhr arhrVar = arhr.NERD_STATS;
                    aopcVar.copyOnWrite();
                    arhs arhsVar = (arhs) aopcVar.instance;
                    arhsVar.c = arhrVar.pS;
                    arhsVar.b |= 1;
                    createBuilder.copyOnWrite();
                    ateo ateoVar2 = (ateo) createBuilder.instance;
                    arhs arhsVar2 = (arhs) aopcVar.mo39build();
                    arhsVar2.getClass();
                    ateoVar2.d = arhsVar2;
                    ateoVar2.b |= 2;
                    aopc aopcVar2 = (aopc) apzg.a.createBuilder();
                    aopcVar2.e(atns.b, atns.a);
                    createBuilder.copyOnWrite();
                    ateo ateoVar3 = (ateo) createBuilder.instance;
                    apzg apzgVar = (apzg) aopcVar2.mo39build();
                    apzgVar.getClass();
                    ateoVar3.e = apzgVar;
                    ateoVar3.b |= 4;
                    ateo ateoVar4 = (ateo) createBuilder.mo39build();
                    aopa createBuilder2 = aten.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    aten atenVar = (aten) createBuilder2.instance;
                    ateoVar4.getClass();
                    atenVar.c = ateoVar4;
                    atenVar.b |= 1;
                    aopaVar.aC(createBuilder2);
                }
            }
        });
        atep atepVar2 = (atep) mo52toBuilder.mo39build();
        dt mJ = mJ();
        iet aF = aF();
        if (aF == null) {
            return;
        }
        akbe akbeVar = new akbe() { // from class: icb
            @Override // defpackage.akbe
            public final void a(aten atenVar) {
                ico icoVar = ico.this;
                if (atenVar == null || icoVar.bl) {
                    return;
                }
                icoVar.aq.d();
            }
        };
        final hzq hzqVar = (hzq) this.aQ.get();
        final ien ienVar = aF.d;
        final Optional of = Optional.of(akbeVar);
        if (hzqVar.f != null) {
            return;
        }
        hzqVar.f = hzr.aH(atepVar2, hzqVar.a, hzqVar.d, hzqVar.e);
        hzqVar.f.af = new akbe() { // from class: hzp
            @Override // defpackage.akbe
            public final void a(aten atenVar) {
                hzq hzqVar2 = hzq.this;
                Optional optional = of;
                HashMap hashMap = new HashMap();
                hashMap.put(actk.b, Boolean.TRUE);
                if (abgc.e(atenVar) != null) {
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", hzqVar2.f);
                    hzqVar2.b.c(abgc.e(atenVar), hashMap);
                } else if (abgc.d(atenVar) != null) {
                    hzqVar2.b.c(abgc.d(atenVar), hashMap);
                } else if (!optional.isPresent()) {
                } else {
                    ((akbe) optional.get()).a(atenVar);
                }
            }
        };
        hzqVar.f.X.c(new f() { // from class: com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelMenuBottomSheetController$1
            private int c = 0;

            @Override // defpackage.f, defpackage.g
            public final /* synthetic */ void kG(apy apyVar) {
            }

            @Override // defpackage.f, defpackage.g
            public final void lc(apy apyVar) {
                ienVar.a(false);
                this.c = hzq.this.c.b();
            }

            @Override // defpackage.f, defpackage.g
            public final void ld(apy apyVar) {
                ienVar.a(true);
                hzq.this.c.c(this.c);
                this.c = 0;
                hzq.this.f = null;
            }

            @Override // defpackage.g
            public final /* synthetic */ void nA(apy apyVar) {
            }

            @Override // defpackage.g
            public final /* synthetic */ void nv(apy apyVar) {
            }

            @Override // defpackage.f, defpackage.g
            public final /* synthetic */ void nz(apy apyVar) {
            }
        });
        hzqVar.f.qv(mJ.getSupportFragmentManager(), null);
    }

    @Override // defpackage.ibn
    public final void s() {
        aiah aiahVar = this.bg.b;
        aiahVar.f();
        this.bg.g(aiahVar.p);
    }

    private final int bz(iah iahVar) {
        iai iaiVar = this.af;
        int i = iaiVar.x;
        if (i <= 0) {
            this.av.V(0L);
            return 4;
        }
        iaiVar.g.g();
        iaiVar.z = iahVar;
        iaiVar.n.a(true);
        int i2 = i - 1;
        iaiVar.y = i2;
        iaiVar.n.al(i2);
        return 3;
    }

    public final void bb(asgn asgnVar) {
        iet aF;
        atep atepVar;
        aunm aunmVar;
        int i = asgnVar.b;
        if (i == 113762946) {
            ajuw ajuwVar = (ajuw) this.aR.get();
            if (asgnVar.b == 113762946) {
                aunmVar = (aunm) asgnVar.c;
            } else {
                aunmVar = aunm.a;
            }
            ajuwVar.c(aunmVar, this.aS.get());
        } else if (i != 66439850 || (aF = aF()) == null) {
        } else {
            final iaz iazVar = (iaz) this.aP.get();
            dt mJ = mJ();
            View view = aF.a.j() == 4 ? aF.g : aF.h;
            final ien ienVar = aF.d;
            int j = aF.a.j();
            if (asgnVar.b == 66439850) {
                atepVar = (atep) asgnVar.c;
            } else {
                atepVar = atep.a;
            }
            final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mJ, 2132083360);
            final AtomicReference atomicReference = new AtomicReference();
            ajqw ajqwVar = new ajqw();
            final ajya ajyaVar = new ajya() { // from class: iaw
                @Override // defpackage.ajya
                public final Map a() {
                    return null;
                }
            };
            final ajyb ajybVar = new ajyb() { // from class: iax
                @Override // defpackage.ajyb
                public final void a() {
                    ((ww) atomicReference.get()).k();
                }
            };
            iay iayVar = new iay(ajqwVar, new ajry() { // from class: iav
                @Override // defpackage.ajry
                public final ajru b(ViewGroup viewGroup) {
                    iaz iazVar2 = iaz.this;
                    return new ajzd(contextThemeWrapper, iazVar2.a, ajyaVar, ajybVar);
                }
            });
            iayVar.a(aten.class);
            ajrg a2 = iazVar.c.a(iayVar.a);
            ajsm ajsmVar = new ajsm();
            a2.h(ajsmVar);
            ajsmVar.addAll(atepVar.c);
            int c = zag.c(contextThemeWrapper, a2, new FrameLayout(contextThemeWrapper));
            float dimension = contextThemeWrapper.getResources().getDimension(R.dimen.innertube_menu_width_increment_dp);
            ww wwVar = new ww(contextThemeWrapper);
            atomicReference.set(wwVar);
            wwVar.j = j != 4 ? 8388661 : 8388693;
            Resources resources = contextThemeWrapper.getResources();
            wwVar.r((int) zag.a(contextThemeWrapper, c, dimension));
            wwVar.g = -resources.getDimensionPixelOffset(R.dimen.reel_popup_menu_horizontal_offset);
            wwVar.j(-resources.getDimensionPixelOffset(R.dimen.reel_popup_menu_vertical_offset));
            wwVar.z();
            wwVar.y();
            wwVar.e(a2);
            if (view != null) {
                wwVar.l = view;
            }
            iazVar.d = iazVar.b.a();
            ienVar.a(false);
            wwVar.v(new PopupWindow.OnDismissListener() { // from class: iau
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    iaz iazVar2 = iaz.this;
                    ienVar.a(true);
                    iazVar2.b.c(iazVar2.d);
                    iazVar2.d = 0;
                }
            });
            wwVar.s();
        }
    }
}
