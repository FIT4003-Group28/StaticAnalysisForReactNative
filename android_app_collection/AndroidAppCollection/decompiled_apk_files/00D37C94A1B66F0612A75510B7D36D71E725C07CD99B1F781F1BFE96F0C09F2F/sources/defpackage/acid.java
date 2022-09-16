package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.MultiMessageConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.OpenDialogCommandOuterClass$OpenDialogCommand;
import com.google.protos.youtube.api.innertube.StartStreamEndpointOuterClass$StartStreamEndpoint;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: acid  reason: default package */
/* loaded from: classes.dex */
public final class acid extends aciz implements View.OnClickListener, acnr, abvz, abzi {
    public acti a;
    private NetworkOperationView aA;
    private ImageButton aB;
    private ImageButton aC;
    private ImageButton aD;
    private View aE;
    private WaitingIndicatorView aF;
    private View aG;
    private TextView aH;
    private TextView aI;
    private View aJ;
    private TextView aK;
    private ProgressBar aL;
    private ImageButton aM;
    private TextView aN;
    private TextView aO;
    private ImageButton aP;
    private Button aQ;
    private Button aR;
    private View aS;
    private Button aT;
    private ViewGroup aU;
    private ImageView aV;
    private TextView aW;
    private ViewGroup aX;
    private ImageView aY;
    private TextView aZ;
    public abzn ae;
    public acic af;
    public abtc ag;
    public ajmy ah;
    public ajzv ai;
    public abzc aj;
    public aayl ak;
    public achk al;
    public akfo am;
    public SharedPreferences an;
    public acgf ao;
    public View ap;
    public ImageView aq;
    public TextView ar;
    public String as;
    public Bitmap at;
    public Bitmap au;
    public boolean av;
    public String ax;
    private FrameLayout ay;
    private RelativeLayout az;
    public Handler b;
    private ImageButton ba;
    private Executor bb;
    private ankt bc;
    private ankt bd;
    private boolean be;
    private int bf;
    private CharSequence bg;
    private atgl bh;
    private apzg bi;
    private boolean bj;
    private afzf bk;
    private int bm;
    private boolean bn;
    public aafo c;
    public Executor d;
    public ache e;
    public int aw = 0;
    private final Runnable bl = new achv(this, 2);
    private int bo = 0;

    private static String aU(apoj apojVar) {
        apzg apzgVar = apojVar.n;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        if (apzgVar.qn(StartStreamEndpointOuterClass$StartStreamEndpoint.startStreamEndpoint)) {
            apzg apzgVar2 = apojVar.n;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            StartStreamEndpointOuterClass$StartStreamEndpoint startStreamEndpointOuterClass$StartStreamEndpoint = (StartStreamEndpointOuterClass$StartStreamEndpoint) apzgVar2.qm(StartStreamEndpointOuterClass$StartStreamEndpoint.startStreamEndpoint);
            if (TextUtils.isEmpty(startStreamEndpointOuterClass$StartStreamEndpoint.b)) {
                return null;
            }
            return startStreamEndpointOuterClass$StartStreamEndpoint.b;
        }
        return null;
    }

    private final void aW() {
        this.av = true;
        final dt mJ = mJ();
        this.d.execute(new Runnable() { // from class: achp
            @Override // java.lang.Runnable
            public final void run() {
                acid acidVar = acid.this;
                Activity activity = mJ;
                Bitmap a = acidVar.ag.a(acidVar.as);
                if (a == null) {
                    acidVar.av = false;
                    return;
                }
                synchronized (acidVar) {
                    acidVar.au = a;
                    acidVar.at = a;
                }
                activity.runOnUiThread(new achv(acidVar, 1));
            }
        });
    }

    private final void aX() {
        if (!TextUtils.isEmpty(this.as)) {
            this.aF.b(3);
            this.b.postDelayed(new achv(this), 300L);
        }
    }

    private final void aY() {
        if (this.aC == null || TextUtils.isEmpty(this.bg)) {
            return;
        }
        this.aC.setContentDescription(this.bg);
    }

    private final void aZ() {
        if (!bh() || TextUtils.isEmpty(this.ax)) {
            return;
        }
        this.ar.setText(this.ax);
        this.ar.setVisibility(0);
    }

    private final void ba() {
        apzg apzgVar;
        amup k;
        this.bj = false;
        Object tag = this.aQ.getTag();
        if (tag instanceof apoj) {
            apoj apojVar = (apoj) tag;
            int i = apojVar.b;
            if ((i & 8192) != 0) {
                apzgVar = apojVar.n;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            } else if ((i & 16384) != 0) {
                apzgVar = apojVar.o;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            } else {
                apzgVar = apojVar.p;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            }
        } else {
            apzgVar = null;
        }
        if (apzgVar != null) {
            this.a.D(new acte(apzgVar.c));
            atgl atglVar = this.bh;
            Boolean valueOf = Boolean.valueOf(this.bn);
            int i2 = abwr.b;
            if (atglVar.q) {
                k = amup.l("com.google.android.libraries.youtube.innertube.endpoint.tag", atglVar, "ARG_IS_PORTRAIT", valueOf);
            } else {
                k = amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", atglVar);
            }
            this.c.c(apzgVar, k);
            return;
        }
        acic acicVar = this.af;
        if (acicVar == null) {
            return;
        }
        acicVar.aD();
    }

    private final void bb(boolean z) {
        this.bn = z;
        bc(this.aU, this.aW, this.aV, !z);
        bc(this.aX, this.aZ, this.aY, z);
    }

    private final void bc(ViewGroup viewGroup, TextView textView, ImageView imageView, boolean z) {
        int color = rb().getResources().getColor(z ? R.color.lc_button_style_orientation_background : R.color.lc_button_style_orientation_background_selected);
        textView.setTextColor(color);
        imageView.setColorFilter(color);
        viewGroup.setSelected(z);
    }

    private final void bd() {
        this.bo = 2;
        this.aA.a(2);
        this.aA.setVisibility(8);
        this.az.setVisibility(0);
    }

    private final void be() {
        if (this.aS != null) {
            this.aE.setVisibility(8);
            this.aG.setVisibility(8);
            this.aS.setVisibility(0);
            this.bj = true;
        }
    }

    private final boolean bf() {
        return rh().getConfiguration().orientation == 2;
    }

    private final boolean bg() {
        int b = this.aj.b();
        if (this.bh.r) {
            if (b <= 0) {
                return this.aj.j();
            }
            if (this.bm < b) {
                return true;
            }
        }
        return false;
    }

    private final boolean bh() {
        return (this.bh.b & 65536) != 0;
    }

    private static final apoj bi(atgl atglVar) {
        atglVar.getClass();
        atgj atgjVar = atglVar.i;
        if (atgjVar == null) {
            atgjVar = atgj.a;
        }
        apoj apojVar = atgjVar.b;
        return apojVar == null ? apoj.a : apojVar;
    }

    private final View bj(ViewGroup viewGroup) {
        atgk atgkVar;
        arag aragVar;
        apoj apojVar;
        atep atepVar;
        arag aragVar2;
        int i;
        arag aragVar3;
        int i2;
        boolean z = false;
        View inflate = mJ().getLayoutInflater().inflate(true != this.bh.q ? R.layout.lc_choose_thumbnail_fragment : R.layout.lc_screencast_choose_thumbnail_fragment, viewGroup, false);
        this.az = (RelativeLayout) inflate.findViewById(R.id.choose_thumbnail_content);
        this.aA = (NetworkOperationView) inflate.findViewById(R.id.choose_thumbnail_network_operation);
        if ((this.bh.b & 1) != 0) {
            TextView textView = (TextView) inflate.findViewById(R.id.thumbnail_capture_text_view);
            arag aragVar4 = this.bh.c;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            textView.setText(ajgl.b(aragVar4));
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.stream_orientation_text_view);
        int i3 = 8;
        arag aragVar5 = null;
        if (this.bh.q) {
            textView2.setVisibility(8);
            View inflate2 = ((ViewStub) inflate.findViewById(R.id.orientation_selector)).inflate();
            inflate2.setVisibility(0);
            this.aU = (ViewGroup) inflate2.findViewById(R.id.landscape_button);
            this.aX = (ViewGroup) inflate2.findViewById(R.id.portrait_button);
            this.aV = (ImageView) inflate2.findViewById(R.id.landscape_button_icon);
            this.aY = (ImageView) inflate2.findViewById(R.id.portrait_button_icon);
            this.aW = (TextView) inflate2.findViewById(R.id.landscape_button_text);
            this.aZ = (TextView) inflate2.findViewById(R.id.portrait_button_text);
            this.aU.setOnClickListener(this);
            this.aX.setOnClickListener(this);
            this.ba = (ImageButton) inflate2.findViewById(R.id.help_button);
            bb(this.bn);
            atgl atglVar = this.bh;
            if ((atglVar.b & 16777216) != 0) {
                aunb aunbVar = atglVar.s;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                    aunb aunbVar2 = this.bh.s;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    apoj apojVar2 = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
                    int i4 = apojVar2.b;
                    if ((i4 & 32768) != 0 || (i4 & 16384) != 0 || (i4 & 8192) != 0) {
                        this.ba.setVisibility(0);
                        this.ba.setTag(apojVar2);
                        this.ba.setOnClickListener(this);
                    }
                }
            }
        } else if (!bg()) {
            int i5 = this.bh.b;
            if ((i5 & 8) != 0 || (i5 & 4) != 0) {
                if (bf()) {
                    atgkVar = this.bh.f;
                    if (atgkVar == null) {
                        atgkVar = atgk.a;
                    }
                } else {
                    atgkVar = this.bh.e;
                    if (atgkVar == null) {
                        atgkVar = atgk.a;
                    }
                }
                if (atgkVar != null) {
                    int i6 = atgkVar.b & 1;
                    if (i6 != 0) {
                        if (i6 != 0) {
                            aragVar = atgkVar.c;
                            if (aragVar == null) {
                                aragVar = arag.a;
                            }
                        } else {
                            aragVar = null;
                        }
                        textView2.setText(ajgl.b(aragVar));
                        textView2.setVisibility(0);
                    }
                    if ((atgkVar.b & 2) != 0) {
                        ache acheVar = this.e;
                        arhs arhsVar = atgkVar.d;
                        if (arhsVar == null) {
                            arhsVar = arhs.a;
                        }
                        arhr b = arhr.b(arhsVar.c);
                        if (b == null) {
                            b = arhr.UNKNOWN;
                        }
                        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(akf.a(mJ(), acheVar.a(b)), (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
            }
        }
        this.aB = (ImageButton) inflate.findViewById(R.id.back_arrow_button);
        this.aC = (ImageButton) inflate.findViewById(R.id.switch_camera_button);
        this.aD = (ImageButton) inflate.findViewById(R.id.share_event_button);
        this.aB.setOnClickListener(this);
        this.aC.setOnClickListener(this);
        aY();
        this.aE = inflate.findViewById(R.id.thumbnail_capture_root);
        this.ap = inflate.findViewById(R.id.viewport_container);
        WaitingIndicatorView waitingIndicatorView = (WaitingIndicatorView) inflate.findViewById(R.id.countdown_view);
        this.aF = waitingIndicatorView;
        waitingIndicatorView.c = this;
        View findViewById = inflate.findViewById(R.id.stream_schedule_info_container);
        this.aH = (TextView) inflate.findViewById(R.id.schedule_header);
        this.aI = (TextView) inflate.findViewById(R.id.schedule_info);
        if ((this.bh.b & 2) != 0) {
            findViewById.setVisibility(0);
            TextView textView3 = this.aH;
            arag aragVar6 = this.bh.d;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
            textView3.setText(ajgl.b(aragVar6));
            this.aH.setVisibility(0);
        }
        if ((this.bh.b & 65536) != 0) {
            findViewById.setVisibility(0);
            TextView textView4 = this.aI;
            arag aragVar7 = this.bh.o;
            if (aragVar7 == null) {
                aragVar7 = arag.a;
            }
            textView4.setText(ajgl.b(aragVar7));
            this.aI.setVisibility(0);
            atgl atglVar2 = this.bh;
            if ((atglVar2.b & 131072) != 0) {
                ache acheVar2 = this.e;
                arhs arhsVar2 = atglVar2.p;
                if (arhsVar2 == null) {
                    arhsVar2 = arhs.a;
                }
                arhr b2 = arhr.b(arhsVar2.c);
                if (b2 == null) {
                    b2 = arhr.UNKNOWN;
                }
                int a = acheVar2.a(b2);
                if (a != 0) {
                    Resources rh = rh();
                    int dimensionPixelSize = rh.getDimensionPixelSize(R.dimen.lc_thumbnail_schedule_info_drawable_dimensions);
                    this.aI.setCompoundDrawablesRelativeWithIntrinsicBounds(new BitmapDrawable(rh, Bitmap.createScaledBitmap(BitmapFactory.decodeResource(rh, a), dimensionPixelSize, dimensionPixelSize, true)), (Drawable) null, (Drawable) null, (Drawable) null);
                }
            }
        }
        this.aG = inflate.findViewById(R.id.thumbnail_preview_root);
        this.aq = (ImageView) inflate.findViewById(R.id.thumbnail_preview);
        this.aN = (TextView) inflate.findViewById(R.id.thumbnail_title);
        atgl atglVar3 = this.bh;
        if ((atglVar3.b & 16384) != 0) {
            arag aragVar8 = atglVar3.m;
            if (aragVar8 == null) {
                aragVar8 = arag.a;
            }
            Spanned b3 = ajgl.b(aragVar8);
            this.aN.setText(b3);
            this.aN.setContentDescription(O(R.string.lc_title_cd, b3.toString()));
        }
        this.aO = (TextView) inflate.findViewById(R.id.thumbnail_channel);
        atgl atglVar4 = this.bh;
        if ((atglVar4.b & 32768) != 0) {
            TextView textView5 = this.aO;
            arag aragVar9 = atglVar4.n;
            if (aragVar9 == null) {
                aragVar9 = arag.a;
            }
            textView5.setText(ajgl.b(aragVar9));
        }
        this.aJ = inflate.findViewById(R.id.thumbnail_overlay);
        this.aK = (TextView) inflate.findViewById(R.id.thumbnail_uploading_title);
        this.aL = (ProgressBar) inflate.findViewById(R.id.thumbnail_uploading_spinner);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.thumbnail_reupload_button);
        this.aM = imageButton;
        imageButton.setOnClickListener(this);
        this.aP = (ImageButton) inflate.findViewById(R.id.edit_menu_button);
        atgl atglVar5 = this.bh;
        if ((atglVar5.b & 64) != 0) {
            aunb aunbVar3 = atglVar5.g;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            apojVar = (apoj) aunbVar3.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        atgl atglVar6 = this.bh;
        if ((atglVar6.b & 128) != 0) {
            aunb aunbVar4 = atglVar6.h;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            atepVar = (atep) aunbVar4.qm(MenuRendererOuterClass.menuRenderer);
        } else {
            atepVar = null;
        }
        if (apojVar != null && atepVar != null) {
            if ((apojVar.b & 32) != 0) {
                this.aP.setVisibility(0);
                if ((apojVar.b & 65536) != 0) {
                    ImageButton imageButton2 = this.aP;
                    aovr aovrVar = apojVar.r;
                    if (aovrVar == null) {
                        aovrVar = aovr.a;
                    }
                    imageButton2.setContentDescription(aovrVar.c);
                }
                this.a.n(new acte(apojVar.t));
                ache acheVar3 = this.e;
                arhs arhsVar3 = apojVar.g;
                if (arhsVar3 == null) {
                    arhsVar3 = arhs.a;
                }
                arhr b4 = arhr.b(arhsVar3.c);
                if (b4 == null) {
                    b4 = arhr.UNKNOWN;
                }
                int a2 = acheVar3.a(b4);
                if (a2 != 0) {
                    this.aP.setImageResource(a2);
                    this.ai.d(this.aP, atepVar, this, this.a);
                }
            }
            aunb aunbVar5 = this.bh.k;
            if (aunbVar5 == null) {
                aunbVar5 = aunb.a;
            }
            if (aunbVar5.qn(ButtonRendererOuterClass.buttonRenderer)) {
                aunb aunbVar6 = this.bh.k;
                if (aunbVar6 == null) {
                    aunbVar6 = aunb.a;
                }
                apoj apojVar3 = (apoj) aunbVar6.qm(ButtonRendererOuterClass.buttonRenderer);
                this.a.u(new acte(apojVar3.t), null);
                if ((apojVar3.b & 65536) != 0) {
                    ImageButton imageButton3 = this.aD;
                    aovr aovrVar2 = apojVar3.r;
                    if (aovrVar2 == null) {
                        aovrVar2 = aovr.a;
                    }
                    imageButton3.setContentDescription(aovrVar2.c);
                }
                int i7 = apojVar3.b;
                if ((i7 & 8192) != 0 || (i7 & 16384) != 0) {
                    this.aD.setOnClickListener(this);
                    this.aD.setTag(apojVar3);
                }
                if ((apojVar3.b & 32) != 0) {
                    ache acheVar4 = this.e;
                    arhs arhsVar4 = apojVar3.g;
                    if (arhsVar4 == null) {
                        arhsVar4 = arhs.a;
                    }
                    arhr b5 = arhr.b(arhsVar4.c);
                    if (b5 == null) {
                        b5 = arhr.UNKNOWN;
                    }
                    this.aD.setImageResource(acheVar4.a(b5));
                    this.aD.setVisibility(0);
                }
            }
        }
        this.aR = (Button) inflate.findViewById(R.id.finish_scheduling_button);
        apoj bi = bi(this.bh);
        this.a.u(new acte(bi.t), null);
        this.aQ = (Button) inflate.findViewById(R.id.start_stream_button);
        if (!this.bh.q || (acly.d() && this.al.d())) {
            Button button = this.aQ;
            if ((bi.b & 256) != 0) {
                aragVar2 = bi.i;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            button.setText(ajgl.b(aragVar2));
            Context rb = rb();
            Button button2 = this.aQ;
            if (bi.c != 1 || (i = akzj.l(((Integer) bi.d).intValue())) == 0) {
                i = 1;
            }
            acly.a(rb, button2, i);
            this.aQ.setTag(bi);
            this.aQ.setOnClickListener(this);
            this.aQ.setVisibility(0);
        } else {
            this.aQ.setVisibility(8);
        }
        this.ar = (TextView) inflate.findViewById(R.id.viewers_waiting_text_view);
        aZ();
        aunb aunbVar7 = this.bh.j;
        if (aunbVar7 == null) {
            aunbVar7 = aunb.a;
        }
        if (aunbVar7.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar8 = this.bh.j;
            if (aunbVar8 == null) {
                aunbVar8 = aunb.a;
            }
            apoj apojVar4 = (apoj) aunbVar8.qm(ButtonRendererOuterClass.buttonRenderer);
            this.a.u(new acte(apojVar4.t), null);
            Button button3 = this.aR;
            if ((apojVar4.b & 256) != 0) {
                aragVar3 = apojVar4.i;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            button3.setText(ajgl.b(aragVar3));
            Context rb2 = rb();
            Button button4 = this.aR;
            if (apojVar4.c != 1 || (i2 = akzj.l(((Integer) apojVar4.d).intValue())) == 0) {
                i2 = 1;
            }
            acly.a(rb2, button4, i2);
            this.aR.setTag(apojVar4);
            this.aR.setOnClickListener(this);
            this.aR.setVisibility(0);
            this.aQ.setEnabled(true);
        }
        if (bg()) {
            this.aS = inflate.findViewById(R.id.confirm_portrait_root);
            this.aT = (Button) inflate.findViewById(R.id.confirm_portrait_button);
            TextView textView6 = (TextView) inflate.findViewById(R.id.rotate_device_text_view);
            if (textView6 != null) {
                atgl atglVar7 = this.bh;
                if ((atglVar7.b & 4) != 0) {
                    atgk atgkVar2 = atglVar7.e;
                    if (atgkVar2 == null) {
                        atgkVar2 = atgk.a;
                    }
                    if ((atgkVar2.b & 1) != 0) {
                        atgk atgkVar3 = this.bh.e;
                        if (atgkVar3 == null) {
                            atgkVar3 = atgk.a;
                        }
                        aragVar5 = atgkVar3.c;
                        if (aragVar5 == null) {
                            aragVar5 = arag.a;
                        }
                    }
                    textView6.setText(ajgl.b(aragVar5));
                }
            }
            Button button5 = this.aT;
            if (button5 != null) {
                button5.setOnClickListener(this);
                acly.a(rb(), this.aT, 14);
            }
        }
        ImageButton imageButton4 = this.aC;
        if (!this.bh.q && this.bf > 1) {
            i3 = 0;
        }
        imageButton4.setVisibility(i3);
        this.aA.c(new achr(this, 1));
        this.aA.b(new achr(this));
        aP(this.aw);
        View findViewById2 = inflate.findViewById(R.id.orientation_text);
        if (this.aj.i()) {
            aotz a3 = this.ao.a();
            if (a3 != null) {
                z = a3.f;
            }
        } else {
            z = this.an.getBoolean("PREF_HAS_SEEN_ORIENTATION_TOOLTIP", false);
        }
        boolean z2 = !z;
        if (aR() && z2) {
            akfo akfoVar = this.am;
            akfp a4 = akfoVar.a();
            a4.c = N(R.string.lc_hint_orientation);
            a4.h(1);
            a4.c(2);
            a4.g(0.6f);
            a4.a = findViewById2;
            a4.l();
            a4.f = new achx(this);
            akfoVar.c(a4.a());
        }
        return inflate;
    }

    public static acid n(atgl atglVar, String str, int i, boolean z, int i2) {
        acid acidVar = new acid();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_GO_LIVE_SCREEN_RENDERER", new ParcelableMessageLite(atglVar));
        bundle.putString("ARG_VIDEO_ID", str);
        bundle.putInt("ARG_CAMERA_COUNT", i);
        bundle.putBoolean("ARG_NEEDS_THUMBNAIL", z);
        bundle.putInt("ARG_PORTRAIT_STREAM_COUNT", i2);
        acidVar.ae(bundle);
        return acidVar;
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        this.bj = false;
        this.b.removeCallbacks(this.bl);
        aK();
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        aF();
        aO();
        achk.a(mJ());
    }

    @Override // defpackage.abvz
    public final void a(String str) {
        if (str != null) {
            this.as = str;
        }
        acic acicVar = this.af;
        if (acicVar != null) {
            acicVar.E(this.as);
        }
    }

    public final void aE() {
        if (this.at != null || this.be) {
            return;
        }
        this.aF.a();
        acic acicVar = this.af;
        if (acicVar != null) {
            acicVar.az(this.ap);
        }
        this.be = true;
    }

    public final void aF() {
        aP(this.aw);
        if (this.bh.q) {
            bd();
            aN();
            return;
        }
        aV();
        aZ();
    }

    public final void aG() {
        if (!TextUtils.isEmpty(this.as)) {
            bd();
            if (!at()) {
                return;
            }
            aE();
            aX();
        }
    }

    public final void aH() {
        if (this.bj) {
            this.bj = false;
            aN();
            return;
        }
        acic acicVar = this.af;
        if (acicVar != null) {
            acicVar.v(this.bh.q);
        }
        aK();
        acic acicVar2 = this.af;
        if (acicVar2 == null) {
            return;
        }
        acicVar2.aC();
    }

    public final void aI(final Bitmap bitmap) {
        if (!achk.b(this)) {
            return;
        }
        this.at = bitmap;
        if (this.bh.q) {
            this.aC.setVisibility(8);
        }
        this.af.v(this.bh.q);
        aK();
        aN();
        aQ(abtc.f(bitmap));
        ankt anktVar = this.bc;
        if (anktVar != null) {
            anktVar.cancel(false);
        }
        ankt anktVar2 = this.bd;
        if (anktVar2 != null) {
            anktVar2.cancel(false);
        }
        this.bc = anlz.v(new aniq() { // from class: achu
            @Override // defpackage.aniq
            public final ankt a() {
                acid acidVar = acid.this;
                Bitmap bitmap2 = bitmap;
                acidVar.au = null;
                if (acidVar.ag.e(bitmap2, acidVar.as)) {
                    acidVar.au = bitmap2;
                }
                return null;
            }
        }, this.bb);
    }

    @Override // defpackage.acnr
    public final void aJ() {
        if (this.O == null || !at()) {
            return;
        }
        int[] iArr = new int[2];
        this.ap.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        this.O.getLocationInWindow(iArr2);
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        this.ap.getWidth();
        if (!this.af.aL(i - i2, i3 - i4, this.ap.getHeight(), new achs(this))) {
            zep.b("Failed to capture thumbnail.");
            if (achk.b(this)) {
                aP(1);
                this.af.v(this.bh.q);
                aK();
                aN();
            }
            zag.q(mJ(), R.string.lc_thumbnail_capture_fail, 0);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new acib(this));
        this.ap.startAnimation(alphaAnimation);
    }

    public final void aK() {
        this.aF.c();
        this.be = false;
    }

    public final void aL(String str) {
        this.bg = str;
        aY();
    }

    public final void aM() {
        this.bo = 0;
        this.aA.a(0);
        this.aA.setVisibility(8);
        this.az.setVisibility(0);
        acic acicVar = this.af;
        if (acicVar != null) {
            acicVar.az(this.ap);
        }
    }

    public final void aN() {
        this.aF.c();
        this.aE.setVisibility(8);
        View view = this.aS;
        if (view != null) {
            view.setVisibility(8);
        }
        this.aG.setVisibility(0);
        Bitmap bitmap = this.at;
        if (bitmap != null) {
            this.aq.setImageBitmap(bitmap);
        } else {
            avhn avhnVar = this.bh.l;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            if (akel.A(avhnVar)) {
                avhn avhnVar2 = this.bh.l;
                if (avhnVar2 == null) {
                    avhnVar2 = avhn.a;
                }
                final Uri q = akel.q(avhnVar2);
                this.d.execute(new Runnable() { // from class: achq
                    @Override // java.lang.Runnable
                    public final void run() {
                        acid acidVar = acid.this;
                        acidVar.ag.d(acidVar.as, acidVar.ah, q, abww.a, new acia(acidVar));
                    }
                });
            }
        }
        String string = this.m.getString("ARG_TITLE");
        if (!TextUtils.isEmpty(string)) {
            this.aN.setText(string);
        }
    }

    public final void aO() {
        if (!bh() || TextUtils.isEmpty(this.as) || !achk.b(this)) {
            return;
        }
        aayk a = this.ak.a();
        a.u();
        a.t(this.as);
        a.v();
        if (this.bk == null) {
            this.bk = new achw(this);
        }
        aayl aaylVar = this.ak;
        aaylVar.a.e(a, this.bk);
        this.b.removeCallbacks(this.bl);
        this.b.postDelayed(this.bl, 5000L);
    }

    public final void aP(int i) {
        this.aw = i;
        acic acicVar = this.af;
        if (acicVar != null) {
            acicVar.aj(i);
        }
        if (!achk.b(this)) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        rh().getValue(R.dimen.lc_thumbnail_preview_uploading_overlay_opacity, typedValue, true);
        float f = typedValue.getFloat();
        if (i == 1) {
            this.aO.setVisibility(0);
            this.aN.setVisibility(0);
            this.aJ.setAlpha(1.0f);
            this.aJ.setVisibility(0);
            this.aM.setVisibility(8);
            this.aP.setVisibility(8);
            this.aL.setVisibility(8);
            this.aK.setVisibility(8);
            this.aQ.setEnabled(true);
            this.aR.setEnabled(true);
        } else if (i == 3 || (this.bh.q && i == 0)) {
            this.aQ.setEnabled(true);
            this.aR.setEnabled(true);
            this.aO.setVisibility(0);
            this.aN.setVisibility(0);
            this.aJ.setVisibility(8);
            this.aM.setVisibility(8);
            this.aP.setVisibility(0);
            this.aL.setVisibility(8);
            this.aK.setVisibility(8);
        } else if (i == 0) {
            this.aO.setVisibility(0);
            this.aN.setVisibility(0);
            this.aJ.setVisibility(8);
            this.aM.setVisibility(8);
            this.aP.setVisibility(8);
            this.aL.setVisibility(8);
            this.aK.setVisibility(8);
        } else if (i == 2) {
            this.aJ.setAlpha(f);
            this.aJ.setVisibility(0);
            this.aM.setVisibility(8);
            this.aP.setVisibility(8);
            this.aK.setText(N(R.string.lc_thumbnail_preview_uploading_title));
            this.aK.setVisibility(0);
            this.aL.setVisibility(0);
            this.aO.setVisibility(8);
            this.aN.setVisibility(8);
            if (this.aR.getVisibility() == 0) {
                this.aR.setEnabled(false);
            } else {
                this.aQ.setEnabled(false);
            }
        } else if (i != 4) {
        } else {
            this.aJ.setAlpha(f);
            this.aJ.setVisibility(0);
            this.aM.setVisibility(0);
            this.aP.setVisibility(8);
            this.aL.setVisibility(8);
            this.aK.setText(N(R.string.lc_thumbnail_upload_failed));
            this.aK.setVisibility(0);
            this.aO.setVisibility(8);
            this.aN.setVisibility(8);
            this.aQ.setEnabled(true);
            this.aR.setEnabled(true);
        }
    }

    final void aQ(byte[] bArr) {
        aP(2);
        this.ae.l(this.ae.m(this.as, null, null, null, null, null, null, null, null, 0, 0, abzd.a, null, abzd.a, bArr), new achy(this));
    }

    public final boolean aR() {
        return this.bh.q;
    }

    @Override // defpackage.abvz
    public final void b(String str) {
        if (str != null) {
            this.as = str;
        }
        if (this.bf > 1) {
            this.aC.setVisibility(0);
        }
        aP(0);
        this.at = null;
        s();
        this.aq.setImageBitmap(null);
        this.aG.setVisibility(8);
        this.aE.setVisibility(0);
        acic acicVar = this.af;
        if (acicVar != null) {
            acicVar.az(this.ap);
        }
        this.aF.a();
        aX();
    }

    @Override // defpackage.abzi
    public final void c(arsp arspVar) {
        if (!achk.b(this)) {
            return;
        }
        this.af.D(arspVar);
    }

    @Override // defpackage.abzi
    public final void d(int i, aqft aqftVar, asug asugVar) {
        if (!achk.b(this)) {
            return;
        }
        Toast.makeText(mJ(), (int) R.string.lc_error_load_broadcast, 0).show();
    }

    @Override // defpackage.actq
    protected final apzg kw() {
        return null;
    }

    @Override // defpackage.dp
    public final void lU() {
        super.lU();
        this.af = null;
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.bb = anlz.g(this.d);
        Bundle bundle2 = this.m;
        this.bf = bundle2.getInt("ARG_CAMERA_COUNT");
        this.bm = bundle2.getInt("ARG_PORTRAIT_STREAM_COUNT", 0);
        ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite) bundle2.getParcelable("ARG_GO_LIVE_SCREEN_RENDERER");
        if (parcelableMessageLite != null) {
            this.bh = (atgl) parcelableMessageLite.a(atgl.a);
        }
        if (!bundle2.getBoolean("ARG_NEEDS_THUMBNAIL", true)) {
            this.aw = 3;
            this.bo = 2;
        }
        this.as = bundle2.getString("ARG_VIDEO_ID");
        if (bh() || this.as == null) {
            apoj bi = bi(this.bh);
            String aU = aU(bi);
            if (aU == null) {
                apzg apzgVar = bi.p;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                if (apzgVar.qn(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)) {
                    apzg apzgVar2 = bi.p;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    OpenDialogCommandOuterClass$OpenDialogCommand openDialogCommandOuterClass$OpenDialogCommand = (OpenDialogCommandOuterClass$OpenDialogCommand) apzgVar2.qm(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand);
                    if ((1 & openDialogCommandOuterClass$OpenDialogCommand.b) != 0) {
                        aunb aunbVar = openDialogCommandOuterClass$OpenDialogCommand.c;
                        if (aunbVar == null) {
                            aunbVar = aunb.a;
                        }
                        if (aunbVar.qn(MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer)) {
                            aunb aunbVar2 = openDialogCommandOuterClass$OpenDialogCommand.c;
                            if (aunbVar2 == null) {
                                aunbVar2 = aunb.a;
                            }
                            atit atitVar = (atit) aunbVar2.qm(MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer);
                            if ((atitVar.b & 2) != 0) {
                                aunb aunbVar3 = atitVar.d;
                                if (aunbVar3 == null) {
                                    aunbVar3 = aunb.a;
                                }
                                if (aunbVar3.qn(ButtonRendererOuterClass.buttonRenderer)) {
                                    aunb aunbVar4 = atitVar.d;
                                    if (aunbVar4 == null) {
                                        aunbVar4 = aunb.a;
                                    }
                                    aU = aU((apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer));
                                }
                            }
                        }
                    }
                }
                aU = null;
            }
            this.as = aU;
        }
        if (bundle2.getBoolean("ARG_RESUME_PREVIOUS_STREAM") && bundle == null) {
            ParcelableMessageLite parcelableMessageLite2 = (ParcelableMessageLite) bundle2.getParcelable("ARG_NAVIGATION_ENDPOINT");
            if (parcelableMessageLite2 != null) {
                this.bi = (apzg) parcelableMessageLite2.a(apzg.a);
            }
            this.aw = bundle2.getInt("ARG_UPLOAD_THUMBNAIL_STATUS", 0);
            this.bo = 2;
            aW();
        } else if (bundle == null) {
        } else {
            this.as = bundle.getString("STATE_VIDEO_ID");
            ParcelableMessageLite parcelableMessageLite3 = (ParcelableMessageLite) bundle.getParcelable("SHARE_NAVIGATION_ENDPOINT");
            if (parcelableMessageLite3 != null) {
                this.bi = (apzg) parcelableMessageLite3.a(apzg.a);
            }
            this.aw = bundle.getInt("STATE_UPLOAD_THUMBNAIL_STATUS", 0);
            this.bo = bundle.getInt("NETWORK_OPERATION_MODE");
            if (bundle.getBoolean("THUMBNAIL_SAVED")) {
                aW();
            }
            this.ax = bundle.getString("STATE_VIEWERS_WAITING", null);
            this.bn = bundle.getBoolean("STATE_IS_PORTRAIT");
        }
    }

    @Override // defpackage.actq, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        FrameLayout frameLayout = new FrameLayout(mJ());
        this.ay = frameLayout;
        this.ay.addView(bj(frameLayout));
        return this.ay;
    }

    @Override // defpackage.actq
    protected final acti oi() {
        return this.a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apzg apzgVar;
        apzg apzgVar2;
        if (this.O == null) {
            return;
        }
        if (view == this.aB) {
            aH();
            return;
        }
        ImageButton imageButton = this.aC;
        if (view == imageButton) {
            acic acicVar = this.af;
            if (acicVar == null) {
                return;
            }
            acicVar.aE(imageButton);
            return;
        }
        ImageButton imageButton2 = this.aD;
        if (view == imageButton2) {
            Object tag = imageButton2.getTag();
            if (!(tag instanceof apoj)) {
                return;
            }
            apoj apojVar = (apoj) tag;
            if ((apojVar.b & 16384) != 0) {
                apzgVar2 = apojVar.o;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
            } else {
                apzgVar2 = apojVar.n;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
            }
            this.c.c(apzgVar2, null);
            if ((apojVar.b & 1048576) == 0) {
                return;
            }
            this.a.H(3, new acte(apojVar.t), null);
        } else if (view == this.aQ) {
            if (bf() || !bg()) {
                ba();
            } else {
                be();
            }
        } else if (view != this.aT || !bg()) {
            if (view == this.aR) {
                acic acicVar2 = this.af;
                if (acicVar2 == null) {
                    return;
                }
                acicVar2.ah();
            } else if (view == this.aM) {
                aQ(abtc.f(this.at));
            } else if (view == this.aU) {
                bb(false);
            } else if (view == this.aX) {
                bb(true);
            } else {
                ImageButton imageButton3 = this.ba;
                if (view != imageButton3) {
                    return;
                }
                apoj apojVar2 = (apoj) imageButton3.getTag();
                int i = apojVar2.b;
                if ((32768 & i) != 0) {
                    apzgVar = apojVar2.p;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                } else if ((i & 16384) != 0) {
                    apzgVar = apojVar2.o;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                } else {
                    apzgVar = apojVar2.n;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                }
                this.c.c(apzgVar, null);
            }
        } else {
            ba();
        }
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aK();
        if (!this.bj || !bf()) {
            View bj = bj(this.ay);
            this.ay.removeAllViews();
            this.ay.addView(bj);
            if (!at()) {
                return;
            }
            aV();
            this.ai.h();
            return;
        }
        this.aS.setVisibility(8);
        ba();
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        Bitmap bitmap;
        bundle.putString("STATE_VIDEO_ID", this.as);
        apzg apzgVar = this.bi;
        if (apzgVar != null) {
            bundle.putParcelable("SHARE_NAVIGATION_ENDPOINT", new ParcelableMessageLite(apzgVar));
        }
        bundle.putInt("NETWORK_OPERATION_MODE", this.bo);
        boolean z = false;
        if (this.av || ((bitmap = this.at) != null && this.au == bitmap)) {
            z = true;
        }
        bundle.putBoolean("THUMBNAIL_SAVED", z);
        bundle.putInt("STATE_UPLOAD_THUMBNAIL_STATUS", this.aw);
        bundle.putString("STATE_VIEWERS_WAITING", this.ax);
        bundle.putBoolean("STATE_IS_PORTRAIT", this.bn);
    }

    @Override // defpackage.actq
    protected final acup p() {
        if (this.bh.q) {
            return acuo.a(66881);
        }
        return acuo.a(26110);
    }

    public final void s() {
        this.bd = anlz.v(new aniq() { // from class: acht
            @Override // defpackage.aniq
            public final ankt a() {
                acid acidVar = acid.this;
                try {
                    abtc abtcVar = acidVar.ag;
                    String str = acidVar.as;
                    ylr.b();
                    try {
                        abtcVar.b(str).delete();
                        return null;
                    } catch (SecurityException e) {
                        zep.d("Failed to delete thumbnail.", e);
                        return null;
                    }
                } catch (Exception e2) {
                    zep.d("Failed to delete thumbnail due to exception.", e2);
                    return null;
                }
            }
        }, this.bb);
    }

    private final void aV() {
        int i;
        int i2 = this.bo;
        if (i2 == 1) {
            this.bo = 1;
            this.aA.a(1);
            this.aA.setVisibility(0);
            this.az.setVisibility(8);
            acic acicVar = this.af;
            if (acicVar == null) {
                return;
            }
            acicVar.v(this.bh.q);
        } else if (i2 == 2) {
            bd();
            synchronized (this) {
                if (this.av) {
                    this.aE.setVisibility(8);
                } else {
                    if (this.at == null && (i = this.aw) != 1 && i != 3) {
                        if (i == 0) {
                            aE();
                            aX();
                        }
                    }
                    if (!this.bj || bf()) {
                        aN();
                    } else {
                        be();
                    }
                }
            }
        } else {
            aM();
            aK();
            aE();
            aG();
        }
    }
}
