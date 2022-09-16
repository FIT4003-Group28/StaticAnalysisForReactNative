package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.libraries.youtube.livecreation.ui.view.StreamStatusView;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acke  reason: default package */
/* loaded from: classes.dex */
public final class acke extends acjf implements View.OnClickListener, acjp, acmr, abwj, abwf, abyg, abyj, abyf, abyd, abut {
    public static final SwipeDismissBehavior a = new ackb();
    public boolean aA;
    public boolean aB;
    public int aC;
    public aths aD;
    public String aE;
    public boolean aF;
    public boolean aG;
    boolean aI;
    public boolean aJ;
    public Runnable aK;
    public abxk aL;
    private View aM;
    private TextView aN;
    private View aO;
    private StreamStatusView aP;
    private Button aQ;
    private ImageButton aR;
    private byte[] aS;
    private LinearLayout aT;
    private acmu aU;
    private aloh aV;
    private int aW;
    private NetworkOperationView aX;
    private TextView aY;
    private LinearLayout aZ;
    public asfs ae;
    public abzc af;
    public ache ag;
    public znk ah;
    public akvm ai;
    public abyl aj;
    public akfo ak;
    public snc al;
    public ajhl am;
    public afvn an;
    public aagi ao;
    public View ap;
    public ViewGroup aq;
    public TextView ar;
    public WaitingIndicatorView as;
    public TextView at;
    public ImageView au;
    public ImageView av;
    acjs aw;
    public View ax;
    public ChooseFilterView ay;
    public abyk az;
    public aafo b;
    private View ba;
    private aajl bb;
    private String bc;
    private boolean bd;
    private aqtb be;
    private String bf;
    private String bg;
    private String bh;
    private String bi;
    private boolean bj;
    private boolean bk;
    private String bm;
    private boolean bn;
    private boolean bo;
    public acti c;
    public Handler d;
    public ackg e;
    private abyi bl = abyi.GOOD;
    public boolean aH = true;

    public static acke aG(String str, boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, String str2, String str3, aths athsVar, long j, long j2) {
        zgh.m(str);
        acke ackeVar = new acke();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_VIDEO_ID", str);
        bundle.putBoolean("ARG_IS_MIC_SUPPORTED", z);
        bundle.putBoolean("ARG_IS_MIC_ENABLED", z2);
        bundle.putInt("ARG_CAMERA_COUNT", i);
        bundle.putBoolean("ARG_LIVE_STREAM_IS_PORTRAIT", z3);
        bundle.putBoolean("ARG_DID_START_BROADCAST", z4);
        bundle.putBoolean("ARG_IS_COSTREAM", z5);
        bundle.putString("ARG_STREAM_URL", str2);
        bundle.putString("ARG_STREAM_KEY", str3);
        if (athsVar != null) {
            aphq.m(bundle, "ARG_STREAM_RENDERER", athsVar);
        }
        bundle.putLong("ARG_TIMER_START_STREAM", j);
        bundle.putLong("ARG_TIMER_DURATION_STREAM", j2);
        ackeVar.ae(bundle);
        return ackeVar;
    }

    private final void aO() {
        aP();
        this.ap.setAlpha(0.0f);
        this.aX.setVisibility(8);
    }

    private final void aP() {
        this.as.c();
        this.aO.setVisibility(8);
    }

    private final void aQ(boolean z) {
        if (z) {
            mJ().getWindow().addFlags(128);
        } else {
            mJ().getWindow().clearFlags(128);
        }
    }

    private final void aR(CharSequence charSequence) {
        TextView textView = this.at;
        if (textView != null) {
            textView.setText(charSequence);
            this.at.post(new acjz(this, 1));
            aT(this.aV);
        }
    }

    private final void aS(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.aZ.setContentDescription(rh().getString(R.string.lc_stream_status_cd, str, str2));
    }

    private static void aT(aloh alohVar) {
        if (alohVar != null) {
            alod alodVar = alohVar.e;
            alodVar.getViewTreeObserver().addOnGlobalLayoutListener(new ackd(alodVar));
            alohVar.g();
        }
    }

    private final void aU() {
        if (!this.aO.isShown()) {
            this.as.a();
            this.aO.setVisibility(0);
        }
    }

    private final void aV(int i) {
        this.aY.setText(i);
        aU();
        this.ap.setAlpha(0.0f);
        this.aX.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aW() {
        /*
            r7 = this;
            dt r0 = r7.mJ()
            if (r0 == 0) goto L60
            abyi r1 = r7.bl
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3c
            int r1 = r1.ordinal()
            if (r1 == r3) goto L21
            r4 = 2
            if (r1 == r4) goto L19
            int r1 = r7.aW
            r4 = 0
            goto L29
        L19:
            r1 = 2131100452(0x7f060324, float:1.7813286E38)
            int r1 = defpackage.ake.d(r0, r1)
            goto L28
        L21:
            r1 = 2131100477(0x7f06033d, float:1.7813337E38)
            int r1 = defpackage.ake.d(r0, r1)
        L28:
            r4 = 1
        L29:
            android.view.Window r5 = r0.getWindow()
            r5.setStatusBarColor(r1)
            com.google.android.libraries.youtube.livecreation.ui.view.StreamStatusView r1 = r7.aP
            if (r1 == 0) goto L3d
            abyi r5 = r7.bl
            java.lang.String r6 = r7.bm
            r1.b(r5, r6)
            goto L3d
        L3c:
            r4 = 0
        L3d:
            boolean r1 = r7.bk
            android.view.Window r0 = r0.getWindow()
            r5 = 134217728(0x8000000, float:3.85186E-34)
            if (r1 == 0) goto L56
            if (r3 == r4) goto L4e
            r1 = 5894(0x1706, float:8.259E-42)
            r2 = 5894(0x1706, float:8.259E-42)
            goto L52
        L4e:
            r1 = 5890(0x1702, float:8.254E-42)
            r2 = 5890(0x1702, float:8.254E-42)
        L52:
            r0.addFlags(r5)
            goto L59
        L56:
            r0.clearFlags(r5)
        L59:
            android.view.View r0 = r0.getDecorView()
            r0.setSystemUiVisibility(r2)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acke.aW():void");
    }

    private final void aX(aths athsVar) {
        if (athsVar == null) {
            return;
        }
        if ((athsVar.b & 16) != 0) {
            apzg apzgVar = athsVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            if (apzgVar.qn(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint) && (((LiveChatEndpointOuterClass$LiveChatEndpoint) apzgVar.qm(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint)).b & 2) != 0) {
                assp asspVar = ((LiveChatEndpointOuterClass$LiveChatEndpoint) apzgVar.qm(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint)).d;
                if (asspVar == null) {
                    asspVar = assp.a;
                }
                a(asspVar);
            } else {
                apzg apzgVar2 = athsVar.f;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                b(apzgVar2);
            }
        }
        if ((athsVar.b & 1) != 0) {
            TextView textView = this.ar;
            arag aragVar = athsVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
        }
        athq athqVar = athsVar.d;
        if (athqVar == null) {
            athqVar = athq.a;
        }
        if (athqVar.b == 65153809) {
            apoj apojVar = (apoj) athqVar.c;
            this.aS = apojVar.t.I();
            this.c.D(new acte(this.aS));
            if ((apojVar.b & 32) != 0) {
                arhs arhsVar = apojVar.g;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b = arhr.b(arhsVar.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                if (b != arhr.UNKNOWN) {
                    ImageButton imageButton = this.aR;
                    arhs arhsVar2 = apojVar.g;
                    if (arhsVar2 == null) {
                        arhsVar2 = arhs.a;
                    }
                    arhr b2 = arhr.b(arhsVar2.c);
                    if (b2 == null) {
                        b2 = arhr.UNKNOWN;
                    }
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    int[] iArr = {-16842910};
                    int[] iArr2 = new int[0];
                    int a2 = this.ag.a(b2);
                    if (a2 != 0) {
                        Drawable a3 = akf.a(rb(), a2);
                        a3.setAlpha(rh().getInteger(R.integer.lc_close_icon_inactive_alpha));
                        stateListDrawable.addState(iArr, a3);
                        Drawable a4 = akf.a(rb(), a2);
                        a4.setAlpha(rh().getInteger(R.integer.lc_close_icon_active_alpha));
                        stateListDrawable.addState(iArr2, a4);
                    }
                    imageButton.setImageDrawable(stateListDrawable);
                    this.aR.setVisibility(0);
                    if ((apojVar.b & 65536) != 0) {
                        ImageButton imageButton2 = this.aR;
                        aovr aovrVar = apojVar.r;
                        if (aovrVar == null) {
                            aovrVar = aovr.a;
                        }
                        imageButton2.setContentDescription(aovrVar.c);
                    }
                }
            }
            if ((apojVar.b & 256) != 0) {
                Button button = this.aQ;
                arag aragVar2 = apojVar.i;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                button.setText(ajgl.b(aragVar2));
                this.aQ.setVisibility(0);
            }
        }
        athw athwVar = athsVar.e;
        if (athwVar == null) {
            athwVar = athw.a;
        }
        athv athvVar = athwVar.b;
        if (athvVar == null) {
            athvVar = athv.a;
        }
        if (athvVar.b.size() != 0) {
            Context rb = rb();
            athw athwVar2 = athsVar.e;
            if (athwVar2 == null) {
                athwVar2 = athw.a;
            }
            athv athvVar2 = athwVar2.b;
            if (athvVar2 == null) {
                athvVar2 = athv.a;
            }
            this.aU = new acmu(rb, this, athvVar2, this.aT, this.ag, this.b, this.c);
        }
        if (athsVar.g.size() <= 1 || !((aunb) athsVar.g.get(1)).qn(ElementRendererOuterClass.elementRenderer)) {
            return;
        }
        this.be = (aqtb) ((aunb) athsVar.g.get(1)).qm(ElementRendererOuterClass.elementRenderer);
        aN(asux.LIVESTREAM_CONNECTION_STATE_NEVER_CONNECTED);
        aL();
    }

    @Override // defpackage.abyg
    public final void A() {
    }

    @Override // defpackage.dp
    public final void R(Bundle bundle) {
        super.R(bundle);
        this.e.R(this.az.k.a());
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        this.bo = false;
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        aW();
        if (this.ar.getVisibility() == 0) {
            this.ar.setVisibility(8);
        }
    }

    @Override // defpackage.abwj
    public final void a(assp asspVar) {
        c(true);
        acjs acjsVar = this.aw;
        acjsVar.ap = asspVar;
        acjsVar.ao = null;
        if (acjsVar.ar()) {
            acjsVar.a.p();
            acjsVar.o();
        }
    }

    public final void aH() {
        this.bn = false;
        aK(true);
        aQ(true);
    }

    public final void aI() {
        if (this.bn) {
            return;
        }
        this.bn = true;
        nw nwVar = new nw(mJ(), com.google.cardboard.sdk.R.style.Theme_AppCompat_Dialog);
        nwVar.f(R.string.lc_confirm_stop_streaming);
        nwVar.k(17039370, new acjv(this, 1));
        nwVar.h(17039360, new acjv(this));
        nwVar.j(new DialogInterface.OnCancelListener() { // from class: acjt
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                acke.this.aH();
            }
        });
        nwVar.q();
    }

    public final void aJ(final boolean z, final int i) {
        if (!this.ap.isShown()) {
            return;
        }
        this.aK = new Runnable() { // from class: acju
            @Override // java.lang.Runnable
            public final void run() {
                acke.this.aJ(z, i);
            }
        };
        if (!this.aJ) {
            return;
        }
        if (z != this.bd || achk.c(mJ())) {
            this.aM.setVisibility(8);
            this.aN.setVisibility(8);
            return;
        }
        int rotation = mJ().getWindowManager().getDefaultDisplay().getRotation();
        int i2 = yzf.b;
        int i3 = -1;
        if (i != -1) {
            i3 = i * 90;
        }
        int i4 = ((4 - rotation) % 4) * 90;
        this.aN.setCompoundDrawablesRelativeWithIntrinsicBounds(0, true != this.bd ? 2131232714 : 2131232715, 0, 0);
        this.aN.setRotation(i4 - i3);
        this.aM.setVisibility(0);
        this.aN.setVisibility(0);
    }

    public final void aK(boolean z) {
        this.bk = z;
        aW();
    }

    public final void aL() {
        aqtb aqtbVar = this.be;
        if (aqtbVar == null) {
            return;
        }
        ajhh a2 = ajhh.a(aqtbVar);
        this.am.oK(new ajrs(), a2);
        this.aq.removeAllViews();
        this.aq.addView(this.am.a());
    }

    public final void aM() {
        aU();
        this.aY.setText("");
        this.ap.setAlpha(0.0f);
        this.aX.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aN(defpackage.asux r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.bi
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L6a
            aqtb r0 = r4.be
            if (r0 != 0) goto Lf
            goto L6c
        Lf:
            byte[] r0 = defpackage.ajhm.a(r0)
            if (r0 != 0) goto L16
            goto L6c
        L16:
            aoos r2 = defpackage.aoos.b()     // Catch: defpackage.aopx -> L5f
            awnn r3 = defpackage.awnn.a     // Catch: defpackage.aopx -> L5f
            aopi r0 = defpackage.aopi.parseFrom(r3, r0, r2)     // Catch: defpackage.aopx -> L5f
            awnn r0 = (defpackage.awnn) r0     // Catch: defpackage.aopx -> L5f
            awow r2 = r0.c     // Catch: defpackage.aopx -> L5f
            if (r2 != 0) goto L28
            awow r2 = defpackage.awow.a     // Catch: defpackage.aopx -> L5f
        L28:
            aopg r3 = defpackage.awmx.b     // Catch: defpackage.aopx -> L5f
            java.lang.Object r2 = r2.qm(r3)     // Catch: defpackage.aopx -> L5f
            awmx r2 = (defpackage.awmx) r2     // Catch: defpackage.aopx -> L5f
            awnc r2 = r2.e     // Catch: defpackage.aopx -> L5f
            if (r2 != 0) goto L36
            awnc r2 = defpackage.awnc.a     // Catch: defpackage.aopx -> L5f
        L36:
            aopg r3 = defpackage.awpu.b     // Catch: defpackage.aopx -> L5f
            boolean r2 = r2.qn(r3)     // Catch: defpackage.aopx -> L5f
            if (r2 == 0) goto L6c
            awow r0 = r0.c     // Catch: defpackage.aopx -> L5f
            if (r0 != 0) goto L44
            awow r0 = defpackage.awow.a     // Catch: defpackage.aopx -> L5f
        L44:
            aopg r2 = defpackage.awmx.b     // Catch: defpackage.aopx -> L5f
            java.lang.Object r0 = r0.qm(r2)     // Catch: defpackage.aopx -> L5f
            awmx r0 = (defpackage.awmx) r0     // Catch: defpackage.aopx -> L5f
            awnc r0 = r0.e     // Catch: defpackage.aopx -> L5f
            if (r0 != 0) goto L52
            awnc r0 = defpackage.awnc.a     // Catch: defpackage.aopx -> L5f
        L52:
            aopg r2 = defpackage.awpu.b     // Catch: defpackage.aopx -> L5f
            java.lang.Object r0 = r0.qm(r2)     // Catch: defpackage.aopx -> L5f
            awpu r0 = (defpackage.awpu) r0     // Catch: defpackage.aopx -> L5f
            java.lang.String r0 = r0.c     // Catch: defpackage.aopx -> L5f
            r4.bi = r0     // Catch: defpackage.aopx -> L5f
            goto L6a
        L5f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "Error parsing Element ProtoBytes. \n"
            defpackage.zep.c(r2, r0)
            goto L6c
        L6a:
            java.lang.String r1 = r4.bi
        L6c:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L73
            return
        L73:
            avag r0 = defpackage.avag.a
            aopa r0 = r0.createBuilder()
            r0.copyOnWrite()
            aopi r2 = r0.instance
            avag r2 = (defpackage.avag) r2
            r1.getClass()
            int r3 = r2.b
            r3 = r3 | 1
            r2.b = r3
            r2.c = r1
            r0.copyOnWrite()
            aopi r1 = r0.instance
            avag r1 = (defpackage.avag) r1
            int r5 = r5.f
            r1.d = r5
            int r5 = r1.b
            r5 = r5 | 2
            r1.b = r5
            r0.copyOnWrite()
            aopi r5 = r0.instance
            avag r5 = (defpackage.avag) r5
            int r1 = r5.b
            r1 = r1 | 4
            r5.b = r1
            r1 = 0
            r5.e = r1
            r0.copyOnWrite()
            aopi r5 = r0.instance
            avag r5 = (defpackage.avag) r5
            int r2 = r5.b
            r2 = r2 | 8
            r5.b = r2
            r5.f = r1
            aopi r5 = r0.mo39build()
            avag r5 = (defpackage.avag) r5
            avad r0 = new avad
            aopa r5 = r5.mo52toBuilder()
            r0.<init>(r5)
            avaf r5 = r0.b()
            aajl r0 = r4.bb
            aajs r0 = r0.c()
            r0.d(r5)
            aynr r5 = r0.b()
            r5.Q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acke.aN(asux):void");
    }

    @Override // defpackage.abwj
    public final void b(apzg apzgVar) {
        c(true);
        acjs acjsVar = this.aw;
        acjsVar.ao = apzgVar;
        acjsVar.ap = null;
        if (acjsVar.ar()) {
            acjsVar.a.p();
            acjsVar.o();
        }
    }

    @Override // defpackage.abwj
    public final void c(boolean z) {
        this.aH = z;
        View view = this.aw.O;
        if (view != null) {
            view.setAlpha(true != z ? 0.0f : 1.0f);
            zag.o(this.ba, !z);
        }
    }

    @Override // defpackage.abyd
    public final boolean d() {
        return achk.b(this);
    }

    @Override // defpackage.abyf
    public final void g(int i, String str) {
        if (i == 24) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "WARNING: Stream has a CID match, message=".concat(valueOf);
            }
            this.aV.p(str);
            aT(this.aV);
        } else if (i == 25) {
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                "ERROR: Stream has a CID match, message=".concat(valueOf2);
            }
            this.aV.p(str);
            aT(this.aV);
        } else {
            String valueOf3 = String.valueOf(str);
            if (valueOf3.length() != 0) {
                "Stream CID status is OK, message=".concat(valueOf3);
            }
            this.aV.d();
        }
    }

    @Override // defpackage.abyf
    public final void h(int i, arag aragVar) {
        if (i == 35) {
            String.valueOf(String.valueOf(aragVar)).length();
            aR(aafv.a(aragVar, this.b, false));
        } else if (i == 36) {
            String.valueOf(String.valueOf(aragVar)).length();
            aR(aafv.a(aragVar, this.b, false));
        } else {
            String.valueOf(String.valueOf(aragVar)).length();
            this.aV.d();
        }
    }

    @Override // defpackage.acjf, defpackage.dp
    public final void kt(Context context) {
        Bundle bundle = this.m;
        this.bc = bundle.getString("ARG_VIDEO_ID");
        this.aA = bundle.getBoolean("ARG_IS_MIC_ENABLED", false);
        this.aB = bundle.getBoolean("ARG_IS_MIC_SUPPORTED", false);
        this.aC = bundle.getInt("ARG_CAMERA_COUNT");
        this.bd = bundle.getBoolean("ARG_LIVE_STREAM_IS_PORTRAIT");
        this.aF = bundle.getBoolean("ARG_DID_START_BROADCAST", false);
        this.bj = bundle.getBoolean("ARG_IS_COSTREAM", false);
        this.aG = bundle.getBoolean("IS_FLASH_TORCH_ENABLED", false);
        abty.a().b();
        super.kt(context);
        String string = bundle.getString("ARG_STREAM_URL");
        String string2 = bundle.getString("ARG_STREAM_KEY");
        if (bundle.containsKey("ARG_STREAM_RENDERER")) {
            this.aD = (aths) aphq.j(bundle, "ARG_STREAM_RENDERER", aths.a, aoos.b());
        }
        long j = bundle.getLong("ARG_TIMER_START_STREAM");
        long j2 = bundle.getLong("ARG_TIMER_DURATION_STREAM");
        this.bb = this.ao.a(this.an.c());
        this.az = this.aj.a(this, this.bc, this.bd, this.aF, this.bj, null, null, string, string2, j, j2, this.aA, false, false, false, false, true, 0);
    }

    @Override // defpackage.actq
    protected final apzg kw() {
        return null;
    }

    @Override // defpackage.abyf
    public final void l(abyi abyiVar, String str) {
        this.bl = abyiVar;
        this.bm = str;
        aW();
    }

    @Override // defpackage.abyf
    public final void m(String str) {
        this.bh = str;
        StreamStatusView streamStatusView = this.aP;
        if (streamStatusView != null) {
            streamStatusView.c(str);
        }
    }

    @Override // defpackage.dp
    public final void mS() {
        super.mS();
        aK(true);
        aQ(true);
        this.az.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0208  */
    @Override // defpackage.actq, defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mc(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acke.mc(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.dp
    public final void my() {
        super.my();
        aP();
        this.az.r(true);
        aK(false);
        aQ(false);
    }

    @Override // defpackage.abyf
    public final void n(String str, String str2, avjf avjfVar) {
        this.bf = str;
        StreamStatusView streamStatusView = this.aP;
        if (streamStatusView != null) {
            streamStatusView.e(str);
        }
        this.bg = str2;
        StreamStatusView streamStatusView2 = this.aP;
        if (streamStatusView2 != null) {
            streamStatusView2.d(str2);
        }
        if (this.aP != null && avjfVar != null) {
            akfo akfoVar = this.ak;
            akfp a2 = akfoVar.a();
            arag aragVar = avjfVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            a2.c = ajgl.b(aragVar);
            a2.h(2);
            a2.c(2);
            a2.g(avjfVar.i);
            a2.a = this.aP.a;
            a2.l();
            akfoVar.c(a2.a());
        }
        this.bf = str;
        this.bg = str2;
        aS(str, str2);
    }

    @Override // defpackage.actq
    protected final acti oi() {
        return this.c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.O == null) {
            return;
        }
        if (view == this.aQ || view == this.aR) {
            aI();
        } else if (view == this.aP) {
            throw null;
        }
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        aths athsVar = this.aD;
        if (athsVar != null) {
            aphq.m(bundle, "STATE_STREAM_RENDERER", athsVar);
        }
        bundle.putString("STATE_SUPER_CHAT_TOTAL_STRING", this.bh);
        bundle.putString("STATE_VIEWERS_COUNT_STRING", this.bf);
        bundle.putString("STATE_THUMBSUP_COUNT_STRING", this.bg);
        bundle.putBoolean("IS_FLASH_TORCH_ENABLED", this.aG);
        bundle.putBoolean("IS_MIC_ENABLED", this.aA);
        Bundle bundle2 = new Bundle();
        abyk abykVar = this.az;
        bundle2.putString("STATE_STREAM_URL", abykVar.F);
        bundle2.putString("STATE_STREAM_KEY", abykVar.G);
        arag aragVar = abykVar.H;
        if (aragVar != null) {
            aphq.m(bundle2, "ERROR_MESSAGE_FORMATTED_STRING", aragVar);
        }
        Integer num = abykVar.C;
        if (num != null) {
            bundle2.putInt("STATE_WEBRTC_VIDEO_WIDTH", num.intValue());
        }
        Integer num2 = abykVar.D;
        if (num2 != null) {
            bundle2.putInt("STATE_WEBRTC_VIDEO_HEIGHT", num2.intValue());
        }
        bundle2.putString("STATE_LIVESTREAM_DONE_ERROR_MESSAGE", abykVar.I);
        bundle2.putLong("STATE_TIMER_BASE", abykVar.K);
        bundle2.putLong("STATE_TIMER_DURATION", abykVar.L);
        bundle2.putInt("STATE_QUALITY_LEVEL", abykVar.M);
        bundle2.putLong("STATE_SPEED_TEST_BITRATE", abykVar.E);
        bundle2.putBoolean("STATE_DID_STREAM", abykVar.N);
        Bundle bundle3 = new Bundle();
        abyp abypVar = abykVar.j;
        bundle3.putInt("state_machine_state", abypVar.a);
        bundle3.putInt("state_machine_retry_state", abypVar.c);
        bundle3.putInt("state_machine_state_flow", abypVar.b);
        bundle3.putInt("state_machine_error_code", abypVar.d);
        bundle3.putBoolean("state_machine_stream_occurred", abypVar.h);
        bundle3.putBoolean("state_machine_stop_requested", abypVar.f);
        bundle3.putBoolean("state_machine_stop_request_completed", abypVar.e);
        bundle3.putBoolean("state_machine_ingestion_failed", abypVar.g);
        bundle3.putBoolean("state_machine_stream_went_live", abypVar.i);
        bundle3.putBoolean("state_machine_bandwidth_check_pending", abypVar.j);
        bundle2.putBundle("STATE_CONTROLLER_BUNDLE", bundle3);
        bundle.putBundle("STATE_LIVE_STREAM_CONTROLLER_BUNDLE", bundle2);
    }

    @Override // defpackage.actq
    protected final acup p() {
        return acuo.a(26109);
    }

    @Override // defpackage.abyg
    public final void r(int i) {
        StringBuilder sb = new StringBuilder(37);
        sb.append("Create ingestion failure: ");
        sb.append(i);
        zep.b(sb.toString());
        if (achk.b(this)) {
            aO();
            this.e.K(i, null, null, null, this.aF);
            return;
        }
        aO();
    }

    @Override // defpackage.abyg
    public final void s(int i, String str, String str2, aths athsVar) {
        if (!achk.b(this)) {
            return;
        }
        this.aD = athsVar;
        this.e.J(i, str, str2, athsVar);
        aX(athsVar);
    }

    @Override // defpackage.abyg
    public final void t() {
        this.e.ag();
    }

    @Override // defpackage.abyg
    public final void u(int i, athj athjVar, String str, arag aragVar, boolean z) {
        this.e.K(i, athjVar, str, aragVar, z);
    }

    @Override // defpackage.abyg
    public final void v() {
        if (!achk.b(this)) {
            return;
        }
        this.aM.setVisibility(8);
        this.aN.setVisibility(8);
        aM();
        this.e.L();
    }

    @Override // defpackage.abyg
    public final void w() {
        if (!achk.b(this)) {
            return;
        }
        this.aF = true;
        this.aQ.setEnabled(true);
        this.aR.setEnabled(true);
    }

    @Override // defpackage.abyg
    public final void x(long j) {
        if (achk.b(this)) {
            this.aQ.setEnabled(this.aF);
            this.aR.setEnabled(this.aF);
            this.e.O();
            aP();
            acmu acmuVar = this.aU;
            int i = 1;
            if (acmuVar != null && acmuVar.a.b.size() != 0) {
                if (acmuVar.e.getChildCount() <= 0) {
                    int i2 = 0;
                    for (athu athuVar : acmuVar.a.b) {
                        if (athuVar != null && (athuVar.b & i) != 0) {
                            atht athtVar = athuVar.c;
                            if (athtVar == null) {
                                athtVar = atht.a;
                            }
                            atht athtVar2 = athtVar;
                            int dimension = (int) acmuVar.e.getResources().getDimension(R.dimen.lc_24dp_image_button_container_size);
                            acmt acmtVar = new acmt(acmuVar.c, acmuVar.b, athtVar2, acmuVar.f, acmuVar.d, acmuVar.g, dimension, dimension);
                            ViewGroup viewGroup = acmtVar.d;
                            acmuVar.e.addView(viewGroup);
                            int dimension2 = (int) acmuVar.e.getResources().getDimension(R.dimen.lc_24dp_image_button_margin);
                            zgd.u(viewGroup, new usw(13), zgd.b(zgd.s(-2, -2), zgd.m(dimension2, dimension2, dimension2, dimension2)), ViewGroup.MarginLayoutParams.class);
                            athr athrVar = acmtVar.a.d;
                            if (athrVar == null) {
                                athrVar = athr.a;
                            }
                            if (athrVar.b == 142774990 ? ((acke) acmtVar.c).aI : acmtVar.b(acmtVar.b)) {
                                acmtVar.d.setVisibility(0);
                                byte[] bArr = acmtVar.f;
                                if (bArr != null) {
                                    acmtVar.e.u(new acte(bArr), null);
                                }
                                i2++;
                            }
                        }
                        i = 1;
                    }
                    int i3 = i2 - 1;
                    acmuVar.e.setWeightSum(i3);
                    int i4 = 0;
                    for (int i5 = 0; i5 < acmuVar.e.getChildCount(); i5++) {
                        View childAt = acmuVar.e.getChildAt(i5);
                        if (childAt.getVisibility() == 0) {
                            ((LinearLayout.LayoutParams) childAt.getLayoutParams()).weight = i4 == i3 ? 0 : 1;
                            i4++;
                        }
                    }
                }
                acmuVar.e.setVisibility(0);
            }
            this.ap.setAlpha(1.0f);
            byte[] bArr2 = this.aS;
            if (bArr2 != null) {
                this.c.u(new acte(bArr2), null);
            }
            this.aX.setVisibility(8);
            if (this.bo || TextUtils.isEmpty(this.ar.getText())) {
                this.aJ = true;
                Runnable runnable = this.aK;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                this.ar.setVisibility(0);
                this.ar.postDelayed(new acjz(this), TimeUnit.MILLISECONDS.convert(3L, TimeUnit.SECONDS));
                this.bo = true;
            }
            this.e.P(j);
            this.aP.a(j);
            this.aP.f(j);
        }
    }

    @Override // defpackage.abyg
    public final void y(boolean z) {
        if (!achk.b(this)) {
            return;
        }
        if (z) {
            this.bo = false;
            aV(R.string.lc_reconnecting);
            this.e.aG(true != this.aG ? "off" : "torch");
        } else {
            aV(R.string.lc_going_live);
        }
        this.e.L();
    }

    @Override // defpackage.abyg
    public final void z(abxk abxkVar) {
        this.aL = abxkVar;
        aP();
        this.ap.setAlpha(0.0f);
        this.aJ = false;
        this.aM.setVisibility(8);
        this.aN.setVisibility(8);
        this.aX.setVisibility(0);
        this.e.N(true);
    }
}
