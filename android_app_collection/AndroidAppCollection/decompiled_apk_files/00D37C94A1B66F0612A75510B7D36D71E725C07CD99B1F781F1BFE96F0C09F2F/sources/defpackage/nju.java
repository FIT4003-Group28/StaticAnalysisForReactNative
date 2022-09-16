package defpackage;

import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.apps.youtube.app.player.controls.MusicDeeplinkMenuItemController;
import com.google.android.apps.youtube.app.player.controls.SingleLoopMenuItemController;
import com.google.android.apps.youtube.app.watch.bottomsheet.PlayerOverflowBottomSheetController;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: nju  reason: default package */
/* loaded from: classes3.dex */
public final class nju extends njn implements AdapterView.OnItemClickListener, ajgy, airt, ynl {
    private static final ampt aD = mem.i;
    public mdv aA;
    public njw aB;
    private final aypf aE = new aypf();
    private List aF = Collections.emptyList();
    private List aG;
    private String aH;
    private ajsm aI;
    private ajqh aJ;
    public yni ae;
    public airr af;
    public ajxz ag;
    public jxv ah;
    public jzb ai;
    public jxy aj;
    public jya ak;
    public jyu al;
    public jxr am;
    public jzd an;
    public jyf ao;
    public jyk ap;
    public SingleLoopMenuItemController aq;
    public ajgz ar;
    public airw as;
    public goh at;
    public MusicDeeplinkMenuItemController au;
    public acti av;
    public Set aw;
    acum ax;
    ajqv ay;
    public aacz az;

    private final void aN(PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null) {
            return;
        }
        asak asakVar = playerResponseModel.a.f106J;
        if (asakVar == null) {
            asakVar = asak.a;
        }
        acte a = acte.a(asakVar);
        acum acumVar = this.ax;
        if (a == acumVar) {
            return;
        }
        if (acumVar != null) {
            this.av.q(acumVar, null);
        }
        this.ax = a;
        if (a == null) {
            return;
        }
        this.av.D(a);
        this.av.u(this.ax, null);
        this.at.a();
    }

    @Override // defpackage.vew
    protected final /* bridge */ /* synthetic */ ListAdapter aG() {
        this.aI = new ajsm();
        for (aten atenVar : this.aG) {
            ateo ateoVar = atenVar.c;
            if (ateoVar == null) {
                ateoVar = ateo.a;
            }
            if ((ateoVar.b & 2) != 0) {
                ateo ateoVar2 = atenVar.c;
                if (ateoVar2 == null) {
                    ateoVar2 = ateo.a;
                }
                arhs arhsVar = ateoVar2.d;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b = arhr.b(arhsVar.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                if (b != arhr.OUTLINE_YOUTUBE_MUSIC) {
                }
            }
            ajsm ajsmVar = this.aI;
            akbb akbbVar = new akbb(abgc.h(atenVar).toString(), atenVar);
            if (abgc.f(atenVar) != null) {
                ajxz ajxzVar = this.ag;
                arhr b2 = arhr.b(abgc.f(atenVar).c);
                if (b2 == null) {
                    b2 = arhr.UNKNOWN;
                }
                int a = ajxzVar.a(b2);
                if (a > 0) {
                    akbbVar.e = rh().getDrawable(a);
                }
            }
            ajsmVar.add(akbbVar);
        }
        ajsm ajsmVar2 = new ajsm();
        this.aJ = new ajqh(ajsmVar2);
        for (akba akbaVar : this.aF) {
            ajsmVar2.add(akbaVar);
            akbaVar.a.add(new njs(this));
        }
        ajrj ajrjVar = new ajrj();
        ajrjVar.m(this.aI);
        ajrjVar.m(this.aJ);
        this.ay = new ajqv(ajrjVar, aD);
        return new akaz(mJ(), this.ay);
    }

    @Override // defpackage.vew
    protected final AdapterView.OnItemClickListener aI() {
        return this;
    }

    @Override // defpackage.vew
    protected final String aJ() {
        return null;
    }

    public final void aK(ahic ahicVar) {
        aN(ahicVar.a().c());
    }

    public final void aL(ahhw ahhwVar) {
        if (!ahhwVar.c().c(aika.PLAYBACK_LOADED) || ahhwVar.b() == null) {
            return;
        }
        aM();
    }

    public final void aM() {
        airr airrVar = this.af;
        if (airrVar == null) {
            return;
        }
        boolean equals = TextUtils.equals(airrVar.q(), this.aH);
        this.aJ.h(true != equals ? 0 : Integer.MAX_VALUE);
        if (!equals || !ap()) {
            return;
        }
        this.aJ.v();
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().b.aa(new njt(this, 1), kjt.u), airwVar.V().aa(new njt(this), kjt.u)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                aL((ahhw) obj);
                return null;
            } else if (i == 1) {
                aK((ahic) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhw.class, ahic.class};
    }

    @Override // defpackage.ajgy
    public final void lL() {
        ku();
    }

    @Override // defpackage.vew, defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        jxt[] jxtVarArr = new jxt[12];
        jxtVarArr[0] = this.ai.a();
        jxy jxyVar = this.aj;
        if (jxyVar.b == null) {
            jxyVar.a();
        }
        jxtVarArr[1] = jxyVar.b;
        final SingleLoopMenuItemController singleLoopMenuItemController = this.aq;
        if (singleLoopMenuItemController.e == null) {
            singleLoopMenuItemController.e = new jxt(singleLoopMenuItemController.a.getString(R.string.single_loop_menu_item), new jxs() { // from class: jyp
                @Override // defpackage.jxs
                public final void a() {
                    SingleLoopMenuItemController singleLoopMenuItemController2 = SingleLoopMenuItemController.this;
                    singleLoopMenuItemController2.c.H(3, new acte(actj.SINGLE_LOOP_PLAYER_MENU_ITEM), null);
                    singleLoopMenuItemController2.b.D().h(true != singleLoopMenuItemController2.f ? 2 : 0);
                }
            });
            singleLoopMenuItemController.h();
            singleLoopMenuItemController.e.g(singleLoopMenuItemController.g);
        }
        if (singleLoopMenuItemController.e.g) {
            singleLoopMenuItemController.c.D(new acte(actj.SINGLE_LOOP_PLAYER_MENU_ITEM));
        }
        jxtVarArr[2] = singleLoopMenuItemController.e;
        jxtVarArr[3] = this.al.a();
        jxtVarArr[4] = this.am.b;
        jxtVarArr[5] = this.ap.b;
        jyf jyfVar = this.ao;
        jyfVar.a();
        jxtVarArr[6] = jyfVar.b;
        final jya jyaVar = this.ak;
        if (jyaVar.d == null) {
            jyaVar.d = new jxt(jyaVar.a.getString(R.string.listening_controls_overflow_menu_item), new jxs() { // from class: jxz
                @Override // defpackage.jxs
                public final void a() {
                    jya jyaVar2 = jya.this;
                    aopa createBuilder = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a.createBuilder();
                    createBuilder.copyOnWrite();
                    ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.instance;
                    showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c = 1;
                    showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d = "listen-first";
                    aafo aafoVar = jyaVar2.b;
                    aopc aopcVar = (aopc) apzg.a.createBuilder();
                    aopcVar.e(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint, (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.mo39build());
                    aafoVar.a((apzg) aopcVar.mo39build());
                }
            });
            jyaVar.d.e = zag.f(jyaVar.a, 2131232800, R.attr.ytTextPrimary);
            jyaVar.d.g(true);
        }
        if (!jyaVar.c) {
            jyaVar.d.g(false);
        }
        jxtVarArr[7] = jyaVar.d;
        jxtVarArr[8] = this.an.a;
        final jxv jxvVar = this.ah;
        if (jxvVar.b == null) {
            jxvVar.b = new jxt(jxvVar.a.getString(R.string.menu_help), new jxs() { // from class: jxu
                @Override // defpackage.jxs
                public final void a() {
                    jxv jxvVar2 = jxv.this;
                    jxvVar2.c.a(jxvVar2.a, "yt_android_watch");
                }
            });
            jxvVar.b.g(true);
            jxvVar.b.e = zag.f(jxvVar.a, 2131233461, R.attr.ytTextPrimary);
        }
        jxtVarArr[9] = jxvVar.b;
        final goh gohVar = this.at;
        if (gohVar.e == null) {
            gohVar.e = new jxt("", new jxs() { // from class: gof
                @Override // defpackage.jxs
                public final void a() {
                    goh gohVar2 = goh.this;
                    aowi g = gohVar2.b.g();
                    if (g == null) {
                        zep.b("User clicked presence menu item but no menu data is available");
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(gohVar2.a);
                    arag aragVar = g.e;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                    AlertDialog.Builder title = builder.setTitle(ajgl.b(aragVar));
                    arag aragVar2 = g.d;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    AlertDialog.Builder message = title.setMessage(ajgl.b(aragVar2));
                    arag aragVar3 = g.f;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                    AlertDialog create = message.setPositiveButton(ajgl.b(aragVar3), (DialogInterface.OnClickListener) null).setCancelable(true).create();
                    create.setCanceledOnTouchOutside(true);
                    create.show();
                }
            });
            gohVar.e.g(false);
            gohVar.e.e = zag.f(gohVar.a, gohVar.c.a(arhr.ACCOUNT_LINKED), R.attr.ytTextPrimary);
        }
        jxtVarArr[10] = gohVar.e;
        MusicDeeplinkMenuItemController musicDeeplinkMenuItemController = this.au;
        if (musicDeeplinkMenuItemController.b == null) {
            musicDeeplinkMenuItemController.b = new jxt("", new jyc(musicDeeplinkMenuItemController));
            musicDeeplinkMenuItemController.h();
        }
        jxtVarArr[11] = musicDeeplinkMenuItemController.b;
        this.aF = Arrays.asList(jxtVarArr);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            if (!bundle2.containsKey("FEED_MENU_ITEMS_KEY")) {
                this.aG = new ArrayList();
            } else {
                try {
                    this.aG = ((atep) aphq.i(bundle2, "FEED_MENU_ITEMS_KEY", atep.a, aoos.b())).c;
                } catch (aopx e) {
                    String valueOf = String.valueOf(e.toString());
                    throw new RuntimeException(valueOf.length() != 0 ? "unable to decode menu items: ".concat(valueOf) : new String("unable to decode menu items: "));
                }
            }
            this.aH = bundle2.getString("VIDEO_ID_KEY");
        }
    }

    @Override // defpackage.akas, defpackage.vew, defpackage.dh, defpackage.dp
    public final void mS() {
        super.mS();
        aM();
        if (eog.aq(this.az)) {
            this.aE.c();
            this.aE.g(g(this.as));
        } else {
            this.ae.g(this);
        }
        this.ar.a(this);
        this.aA.a();
        this.at.b(true);
        if (this.af.o() != null) {
            aN(this.af.o().c());
        }
        Set set = this.aw;
        boolean z = set != null && set.contains(0);
        final SingleLoopMenuItemController singleLoopMenuItemController = this.aq;
        singleLoopMenuItemController.h = true;
        jxt jxtVar = singleLoopMenuItemController.e;
        if (jxtVar == null || !jxtVar.g) {
            return;
        }
        singleLoopMenuItemController.c.u(new acte(actj.SINGLE_LOOP_PLAYER_MENU_ITEM), null);
        if (!z) {
            return;
        }
        ValueAnimator valueAnimator = singleLoopMenuItemController.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        singleLoopMenuItemController.j = ValueAnimator.ofArgb(singleLoopMenuItemController.d, 0).setDuration(3000L);
        singleLoopMenuItemController.j.setStartDelay(1000L);
        singleLoopMenuItemController.j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jyo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                jxt jxtVar2 = SingleLoopMenuItemController.this.e;
                int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                if (jxtVar2.i == intValue) {
                    return;
                }
                jxtVar2.i = intValue;
                jxtVar2.c();
            }
        });
        singleLoopMenuItemController.j.start();
    }

    @Override // defpackage.vew
    protected final int mv() {
        return 0;
    }

    @Override // defpackage.dh, defpackage.dp
    public final void my() {
        super.my();
        if (eog.aq(this.az)) {
            this.aE.c();
        } else {
            this.ae.m(this);
        }
        this.ar.d(this);
        this.at.b(false);
        acum acumVar = this.ax;
        if (acumVar != null) {
            this.av.q(acumVar, null);
            this.at.a();
        }
        SingleLoopMenuItemController singleLoopMenuItemController = this.aq;
        singleLoopMenuItemController.h = false;
        jxt jxtVar = singleLoopMenuItemController.e;
        if (jxtVar != null && jxtVar.g) {
            singleLoopMenuItemController.c.q(new acte(actj.SINGLE_LOOP_PLAYER_MENU_ITEM), null);
        }
        ValueAnimator valueAnimator = singleLoopMenuItemController.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            singleLoopMenuItemController.j = null;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        vex item = ((akaz) this.aC).getItem(i);
        if (!(item instanceof vez)) {
            return;
        }
        vez vezVar = (vez) item;
        njw njwVar = this.aB;
        if (njwVar == null) {
            dismiss();
            return;
        }
        if (vezVar instanceof akbb) {
            aten atenVar = ((akbb) vezVar).j;
            if (atenVar != null) {
                String str = this.aH;
                PlayerOverflowBottomSheetController playerOverflowBottomSheetController = njwVar.a;
                if (TextUtils.equals(str, playerOverflowBottomSheetController.i())) {
                    apzg e = abgc.e(atenVar);
                    if (e == null) {
                        e = abgc.d(atenVar);
                    }
                    if (e != null) {
                        playerOverflowBottomSheetController.a.c(e, null);
                    }
                }
            }
        } else if (vezVar instanceof jxt) {
            ((jxt) vezVar).a();
        }
        dismiss();
    }
}
