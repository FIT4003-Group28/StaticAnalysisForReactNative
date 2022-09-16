package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.PlayerCollapsedStateMonitor;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.state.PlaybackServiceState;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.vr.ndk.base.DaydreamApi;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: jwi  reason: default package */
/* loaded from: classes3.dex */
public final class jwi extends jvt implements fed, ezg, ajar, fdv, airt, ynl {
    public nub a;
    public aire aA;
    public ahkv aB;
    public jwb aC;
    public azqb aD;
    public evm aE;
    public ghv aF;
    public yzm aG;
    public BandaidConnectionOpenerController aH;
    public azqb aI;
    public fdw aJ;
    public oez aK;
    public feh aL;
    public ofu aM;
    public ezh aN;
    public aadd aO;
    public Executor aP;
    public fnf aQ;
    public gfu aR;
    public ghs aS;
    public YouTubePlayerViewNotForReflection aT;
    public aacz aU;
    public yjk aV;
    private final aypf aW = new aypf();
    private final Set aX = new HashSet();
    private ViewGroup aY;
    private fei aZ;
    public YouTubePlayerOverlaysLayout ae;
    public azqb af;
    public enr ag;
    public env ah;
    public ahiw ai;
    public jvw aj;
    public aiop ak;
    public jvn al;
    public wjy am;
    public ahub an;
    public acti ao;
    public ajas ap;
    public adft aq;
    public azqb ar;
    public azqb as;
    public ahsn at;
    public adoa au;
    public PlayerCollapsedStateMonitor av;
    public jvl aw;
    public jvx ax;
    public airr ay;
    public aiky az;
    public ntx b;
    private boolean ba;
    private gfs bb;
    private boolean bc;
    private aypg bd;
    private jwh be;
    public yzj c;
    public yni d;
    public airw e;

    private final void aL(boolean z) {
        if (!z || !this.ay.d() || this.aB.w || ar()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 && mJ().isInMultiWindowMode()) {
            return;
        }
        this.aJ.a(3);
    }

    private final void aM(PlaybackStartDescriptor playbackStartDescriptor, boolean z, PlaybackServiceState playbackServiceState, avhn avhnVar, acvg acvgVar) {
        int i;
        aiou j = this.aj.j();
        if (j != null) {
            j.b();
        }
        int i2 = -1;
        if (this.aN.g() == ezx.WATCH_WHILE_MAXIMIZED) {
            arhd a = this.aO.a();
            asxp asxpVar = a.e;
            if (asxpVar == null) {
                asxpVar = asxp.a;
            }
            if ((asxpVar.d & 1) != 0) {
                asxp asxpVar2 = a.e;
                if (asxpVar2 == null) {
                    asxpVar2 = asxp.a;
                }
                i = asxpVar2.Q;
            }
            i = -1;
        } else {
            arhd a2 = this.aO.a();
            asxp asxpVar3 = a2.e;
            if (asxpVar3 == null) {
                asxpVar3 = asxp.a;
            }
            if ((asxpVar3.c & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
                asxp asxpVar4 = a2.e;
                if (asxpVar4 == null) {
                    asxpVar4 = asxp.a;
                }
                i = asxpVar4.P;
            }
            i = -1;
        }
        asxp asxpVar5 = this.aO.a().e;
        if (asxpVar5 == null) {
            asxpVar5 = asxp.a;
        }
        if (true == asxpVar5.R) {
            i2 = i;
        }
        boolean z2 = false;
        if (this.aN.g().d() && !z) {
            z2 = true;
        }
        aijo a3 = aijp.a();
        a3.f(i);
        a3.e(i2);
        a3.b(z2);
        if (acvgVar != null) {
            a3.a = acvgVar;
            boolean z3 = this.e.r().k;
            aopa createBuilder = asno.a.createBuilder();
            createBuilder.copyOnWrite();
            asno asnoVar = (asno) createBuilder.instance;
            asnoVar.b |= 256;
            asnoVar.i = !z3;
            acvgVar.a((asno) createBuilder.mo39build());
        }
        if (playbackServiceState != null) {
            this.aA.g(playbackServiceState, a3.a());
        } else {
            this.aA.e(playbackStartDescriptor, a3.a());
        }
        for (fee feeVar : this.aX) {
            feeVar.j(etk.g(playbackStartDescriptor), avhnVar);
        }
    }

    private static final Optional aN(apzg apzgVar) {
        if (apzgVar == null || (apzgVar.b & 1) == 0 || !apzgVar.qn(WatchEndpointOuterClass.watchEndpoint)) {
            return Optional.empty();
        }
        awel awelVar = (awel) apzgVar.qm(WatchEndpointOuterClass.watchEndpoint);
        awee aweeVar = awelVar.p;
        if (aweeVar == null) {
            aweeVar = awee.a;
        }
        if ((aweeVar.b & 2) == 0) {
            return Optional.empty();
        }
        awee aweeVar2 = awelVar.p;
        if (aweeVar2 == null) {
            aweeVar2 = awee.a;
        }
        auqn b = auqn.b(aweeVar2.c);
        if (b == null) {
            b = auqn.SEEK_SOURCE_UNKNOWN;
        }
        return Optional.of(b);
    }

    private final void aO(PlaybackStartDescriptor playbackStartDescriptor, PlaybackServiceState playbackServiceState, acvg acvgVar) {
        aM(playbackStartDescriptor, false, playbackServiceState, null, acvgVar);
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        this.aJ.a(2);
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        this.aJ.a(1);
    }

    @Override // defpackage.feb
    public final void a() {
        if (fcw.c(this.ay) && !this.ay.U()) {
            ezw a = this.aK.a();
            PlaybackServiceState l = this.ay.l(false);
            if (a == null) {
                return;
            }
            aijl d = PlaybackStartDescriptor.d();
            d.a = a.a();
            aK(d.a(), l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aE(ahhr ahhrVar) {
        aL(ahhrVar.a());
    }

    public final void aF(boolean z) {
        boolean c = fcw.c(this.ay);
        if (c == (this.aN.g() != ezx.NONE)) {
            return;
        }
        if (!c) {
            if (!z) {
                return;
            }
            this.aM.h(false);
            return;
        }
        boolean d = this.ay.d();
        if (this.ba) {
            this.aM.l(false);
        } else {
            this.aM.m(false);
        }
        if (!d || this.ay.d()) {
            return;
        }
        this.ay.aa();
        ViewGroup viewGroup = this.aY;
        if (viewGroup == null) {
            return;
        }
        viewGroup.post(new Runnable() { // from class: jwf
            @Override // java.lang.Runnable
            public final void run() {
                jwi.this.ay.b();
            }
        });
    }

    public final void aG(boolean z) {
        adnt e = this.au.e();
        boolean z2 = false;
        if (!this.aL.b && this.ay.Q()) {
            z2 = true;
        }
        if (e != null || z2) {
            return;
        }
        if (z) {
            this.a.h(true);
        }
        this.ay.K();
        this.ay.s();
        if (z) {
            return;
        }
        this.a.b();
        for (fee feeVar : this.aX) {
            feeVar.i();
        }
    }

    public final void aH(PlaybackStartDescriptor playbackStartDescriptor, acvg acvgVar) {
        playbackStartDescriptor.p(!this.ay.d());
        aO(playbackStartDescriptor, null, acvgVar);
    }

    @Override // defpackage.ajar
    public final void aI(afkn afknVar) {
        if ("surfaceunavailable".equals(afknVar.i())) {
            aL(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aJ() {
        zag.q(mJ(), R.string.playlist_skipped_unavailable_videos, 1);
    }

    public final void aK(PlaybackStartDescriptor playbackStartDescriptor, PlaybackServiceState playbackServiceState) {
        aO(playbackStartDescriptor, playbackServiceState, null);
    }

    @Override // defpackage.feb
    public final void b() {
        this.a.c();
        a();
    }

    @Override // defpackage.fdv
    public final void c(boolean z) {
        airr airrVar = this.ay;
        int i = 1;
        if (true == z) {
            i = 3;
        }
        airrVar.X(i);
    }

    @Override // defpackage.fdv
    public final void d(boolean z) {
        asaa t;
        apkl apklVar;
        apkk c;
        if (this.aN.g().d()) {
            this.aM.h(false);
            aG(false);
        } else if (z && !this.bc) {
            aG(true);
        }
        ahso ahsoVar = (ahso) this.aI.get();
        ahsoVar.a.k();
        if (ahsoVar.a.w) {
            ahsoVar.c();
        }
        apka apkaVar = null;
        r0 = null;
        apkk apkkVar = null;
        apkaVar = null;
        apkaVar = null;
        apkaVar = null;
        apkaVar = null;
        ahsoVar.g = null;
        ahsoVar.j = null;
        ahsoVar.i = null;
        ahsu ahsuVar = (ahsu) ahsoVar.b;
        ahsuVar.b = null;
        ahsuVar.c = null;
        DaydreamApi daydreamApi = ahsoVar.d;
        if (daydreamApi != null) {
            daydreamApi.close();
            ahsoVar.d = null;
        }
        ahsoVar.h(this.at);
        this.aH.h();
        enr enrVar = this.ag;
        eny enyVar = (eny) enrVar.b;
        eoe a = eoe.a(((eof) enyVar.a.c()).c);
        if (a == null) {
            a = eoe.BACKGROUND_AUDIO_POLICY_UNSPECIFIED;
        }
        boolean d = eny.d(a, enyVar.c, (eoe) enyVar.b.get());
        int i = 3;
        if (!d) {
            ent entVar = enrVar.c;
            PlayerResponseModel playerResponseModel = entVar.e;
            if (playerResponseModel != null && (c = aijr.c(playerResponseModel.t())) != null) {
                apkkVar = c;
            }
            if (!entVar.e(apkkVar)) {
                enrVar.c.a();
            }
        } else if (Build.VERSION.SDK_INT < 28 || !enrVar.a.isPackageSuspended()) {
            ylr.c();
            ahfh a2 = ((airr) enrVar.d.get()).e.a();
            int i2 = a2.b;
            int i3 = i2 - 1;
            if (i3 == 1) {
                ((fei) enrVar.e.get()).a();
                ent entVar2 = enrVar.c;
                entVar2.b.h();
                if (entVar2.a.c()) {
                    env envVar = entVar2.b;
                    envVar.s = 2;
                    envVar.h = envVar.f.c();
                    envVar.g();
                    enq enqVar = entVar2.c;
                    enqVar.a();
                    enqVar.k = true;
                    if (enqVar.j == null) {
                        enqVar.j = new fi(enqVar.a);
                        yhr.f(enqVar.j, enqVar.a);
                        Intent className = new Intent().setClassName(enqVar.a, etk.e("honeycomb.Shell$HomeActivity"));
                        Intent putExtra = etk.b(enqVar.a).putExtra(":android:no_headers", true).putExtra("background_settings", true);
                        String string = enqVar.b.getString(R.string.background_settings_notification_message, eog.t(enqVar.e, enqVar.a));
                        fh fhVar = new fh();
                        fhVar.c(string);
                        fi fiVar = enqVar.j;
                        fiVar.k(enqVar.b.getString(R.string.pref_background_options_title));
                        fiVar.j(string);
                        fiVar.u(enqVar.b.getString(R.string.background_settings_is_on_title));
                        fiVar.i(null);
                        fiVar.r(2131232804);
                        fiVar.o(false);
                        fiVar.g(true);
                        fiVar.s(fhVar);
                        fiVar.z = enqVar.b.getColor(R.color.yt_youtube_red);
                        fiVar.g = PendingIntent.getActivity(enqVar.a, 1, className, zgd.M() | 134217728);
                        fiVar.e(2131231708, enqVar.b.getString(R.string.background_settings_notification_action_button), PendingIntent.getActivity(enqVar.a, 2, putExtra, 134217728 | zgd.M()));
                        fiVar.A = 1;
                    }
                    enqVar.j.w(System.currentTimeMillis());
                    enqVar.d.notify(1005, enqVar.j.b());
                }
                env envVar2 = entVar2.b;
                PlayerResponseModel playerResponseModel2 = entVar2.e;
                if (playerResponseModel2 != null && (t = playerResponseModel2.t()) != null && (t.b & 1024) != 0) {
                    arzr arzrVar = t.j;
                    if (arzrVar == null) {
                        arzrVar = arzr.a;
                    }
                    if (arzrVar.b == 64657230) {
                        arzr arzrVar2 = t.j;
                        if (arzrVar2 == null) {
                            arzrVar2 = arzr.a;
                        }
                        if (arzrVar2.b == 64657230) {
                            apklVar = (apkl) arzrVar2.c;
                        } else {
                            apklVar = apkl.a;
                        }
                    } else {
                        apklVar = null;
                    }
                    if (apklVar != null) {
                        apkk apkkVar2 = apklVar.d;
                        if (apkkVar2 == null) {
                            apkkVar2 = apkk.a;
                        }
                        if ((apkkVar2.b & 4) != 0) {
                            apkk apkkVar3 = apklVar.d;
                            if (apkkVar3 == null) {
                                apkkVar3 = apkk.a;
                            }
                            apkaVar = apkkVar3.e;
                            if (apkaVar == null) {
                                apkaVar = apka.a;
                            }
                        }
                    }
                }
                envVar2.q = apkaVar;
            } else if (i3 == 2) {
                ((adjj) enrVar.f.get()).i();
                enrVar.c.e(a2.a);
            } else if (i3 == 3) {
                enrVar.c.a();
            }
            i = i2;
        }
        boolean isFinishing = mJ().isFinishing();
        boolean z2 = this.ay.Q() || i == 1;
        if (fcw.c(this.ay)) {
            if (isFinishing && !z2) {
                aG(false);
            } else if (!isFinishing) {
                this.a.h(false);
            }
        }
        if (!mJ().isChangingConfigurations() || Build.VERSION.SDK_INT < 24) {
            this.ay.z(isFinishing);
        } else if (!z2) {
            this.ay.a();
        }
        this.aE.b();
        this.ay.X(1);
        feh fehVar = this.aL;
        fehVar.b = false;
        Iterator it = fehVar.a.iterator();
        while (it.hasNext()) {
            ((feg) it.next()).kF();
        }
        this.aF.b(new jwc(this));
    }

    @Override // defpackage.fdv
    public final void e(boolean z) {
        this.aH.i();
        this.ay.A();
        ahso ahsoVar = (ahso) this.aI.get();
        ahsoVar.b(this.at);
        dt mJ = mJ();
        jwh jwhVar = this.be;
        yjk yjkVar = this.aV;
        mJ.getClass();
        ahsoVar.g = mJ;
        jwhVar.getClass();
        ahsoVar.j = jwhVar;
        ahsoVar.i = yjkVar;
        ahsoVar.a.l();
        ahsoVar.d = DaydreamApi.create(ahsoVar.g);
        ahsu ahsuVar = (ahsu) ahsoVar.b;
        ahsuVar.b = ahsoVar;
        ahsuVar.c = mJ;
        this.ay.x(this.aT.c, (aijc) this.as.get());
        this.ay.X(this.aN.g().e() ? 2 : true != z ? 1 : 3);
        feh fehVar = this.aL;
        fehVar.b = true;
        Iterator it = fehVar.a.iterator();
        while (it.hasNext()) {
            ((feg) it.next()).nr();
        }
        this.aC.b(this.aN.g());
        aF(false);
        if (!fcw.c(this.ay)) {
            this.aF.a(new jwc(this));
        }
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.ae(jvb.c, jvb.d).aa(new jwe(this), ick.t), airwVar.ao().I().G(aypa.a()).aa(new jwe(this, 1), ick.t), airwVar.aq().aa(new jwe(this, 2), ick.t)};
    }

    @Override // defpackage.feb
    public final void h() {
        this.ay.aa();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                s((ahhm) obj);
                return null;
            } else if (i == 1) {
                aE((ahhr) obj);
                return null;
            } else if (i == 2) {
                ahht ahhtVar = (ahht) obj;
                aJ();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhm.class, ahhr.class, ahht.class};
    }

    @Override // defpackage.fed
    public final void l() {
        this.aZ.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0153 A[RETURN] */
    @Override // defpackage.fed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.ezu r17, defpackage.ezx r18, boolean r19, defpackage.acvg r20) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwi.m(ezu, ezx, boolean, acvg):void");
    }

    @Override // defpackage.dp
    public final void mR() {
        super.mR();
        this.aZ.d();
        this.aT.c.D();
        this.am.a = null;
        this.aB.g.clear();
        this.aX.remove(this.aQ);
    }

    @Override // defpackage.dp
    public final void mS() {
        super.mS();
        this.ap.a(this);
        this.aq.b((MediaRouteButton) this.aD.get());
        this.d.d(new exe());
        if (eog.aq(this.aU)) {
            this.aW.g(g(this.e));
        } else {
            this.d.g(this);
        }
        ahiw ahiwVar = this.ai;
        if (!ahiwVar.d) {
            ahiwVar.g(ahiwVar.b);
            ahiwVar.d = true;
        }
        jvl jvlVar = this.aw;
        jvlVar.a.i(jvlVar);
        jvx jvxVar = this.ax;
        jvxVar.a.i(jvxVar);
        jvw jvwVar = this.aj;
        jvwVar.d = this.ak;
        jvwVar.a = this.al;
        this.aJ.a(0);
        aacz aaczVar = this.aU;
        if (eog.aA(aaczVar)) {
            asxj asxjVar = aaczVar.b().e;
            if (asxjVar == null) {
                asxjVar = asxj.a;
            }
            if (!asxjVar.aM) {
                return;
            }
            this.bd = this.aS.b.n().Z(new jwe(this, 3));
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.player_fragment, viewGroup, false);
        this.aY = viewGroup2;
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = (YouTubePlayerViewNotForReflection) viewGroup2.findViewById(R.id.player_view);
        this.aT = youTubePlayerViewNotForReflection;
        youTubePlayerViewNotForReflection.g(this.aG);
        this.bb = this.aR.a();
        aukw aukwVar = this.aU.b().E;
        if (aukwVar == null) {
            aukwVar = aukw.a;
        }
        this.bc = aukwVar.e;
        this.a.e(bundle);
        if (bundle != null) {
            env envVar = this.ah;
            int i = bundle.getInt("background_dialog_type");
            if (i < 0) {
                emn.a();
            }
            envVar.s = emn.a()[i];
            if (bundle.containsKey("background_failed_upsell_dialog")) {
                envVar.j = (avvh) aopi.parseFrom(avvh.a, bundle.getByteArray("background_failed_upsell_dialog"), aoos.b());
            } else if (bundle.containsKey("background_failed_dismissible_dialog")) {
                envVar.l = (aqmu) aopi.parseFrom(aqmu.a, bundle.getByteArray("background_failed_dismissible_dialog"), aoos.b());
            } else if (bundle.containsKey("background_failed_dismissible_snackbar")) {
                envVar.m = (atpl) aopi.parseFrom(atpl.a, bundle.getByteArray("background_failed_dismissible_snackbar"), aoos.b());
            } else {
                if (bundle.containsKey("background_failed_upsell_dialog_on_elements")) {
                    envVar.k = (apzj) aopi.parseFrom(apzj.a, bundle.getByteArray("background_failed_upsell_dialog_on_elements"), aoos.b());
                }
                envVar.h = bundle.getLong("background_start_time");
                this.ba = bundle.getBoolean("is_player_maximized");
            }
            envVar.h = bundle.getLong("background_start_time");
            this.ba = bundle.getBoolean("is_player_maximized");
        }
        this.aZ = (fei) this.af.get();
        this.b.l(new jwg(this));
        this.be = new jwh(this);
        wjy wjyVar = this.am;
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection2 = this.aT;
        youTubePlayerViewNotForReflection2.getClass();
        wjyVar.a = youTubePlayerViewNotForReflection2;
        ((zao) this.ar.get()).b = this.ae;
        r(this.aK);
        this.aJ.c(this);
        r(this.aQ);
        this.aN.i(this);
        this.aN.i(this.aT);
        this.aN.i(this.ae);
        this.aN.i(this.aZ);
        this.X.c(this.aH);
        this.X.c(this.av);
        return this.aY;
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        this.aJ.a(4);
        this.ap.a(null);
        jvw jvwVar = this.aj;
        jvwVar.d = null;
        jvwVar.a = null;
        if (eog.aq(this.aU)) {
            this.aW.c();
        } else {
            this.d.m(this);
        }
        jvl jvlVar = this.aw;
        jvlVar.a.j(jvlVar);
        jvx jvxVar = this.ax;
        jvxVar.a.j(jvxVar);
        this.aq.i((MediaRouteButton) this.aD.get());
        aypg aypgVar = this.bd;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.bd = null;
        }
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        this.a.g(bundle);
        env envVar = this.ah;
        int i = envVar.s;
        int i2 = i - 1;
        if (i != 0) {
            bundle.putInt("background_dialog_type", i2);
            int i3 = envVar.s;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 2) {
                bundle.putByteArray("background_failed_dismissible_dialog", envVar.l.toByteArray());
            } else if (i4 == 3) {
                bundle.putByteArray("background_failed_upsell_dialog", envVar.j.toByteArray());
            } else if (i4 == 4) {
                bundle.putByteArray("background_failed_dismissible_snackbar", envVar.m.toByteArray());
            } else if (i4 == 5) {
                bundle.putByteArray("background_failed_upsell_dialog_on_elements", envVar.k.toByteArray());
            }
            bundle.putLong("background_start_time", envVar.h);
            ezx g = this.aN.g();
            boolean z = true;
            if ((!g.h() || g.j()) && !g.g()) {
                z = false;
            }
            this.ba = z;
            bundle.putBoolean("is_player_maximized", z);
            bundle.putInt("PREVIOUS_THEME", this.bb.c);
            return;
        }
        throw null;
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (ezxVar == ezx.NONE) {
            aG(false);
        }
        this.aC.b(ezxVar);
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    public final void r(fee feeVar) {
        this.aX.add(feeVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(ahhm ahhmVar) {
        PlayerConfigModel c;
        PlayerResponseModel b = ahhmVar.b();
        if (ahhmVar.c() != aijx.VIDEO_PLAYBACK_LOADED || b == null || (c = b.c()) == null || !c.aN()) {
            return;
        }
        this.c.c(R.string.force_muted_video);
    }
}
