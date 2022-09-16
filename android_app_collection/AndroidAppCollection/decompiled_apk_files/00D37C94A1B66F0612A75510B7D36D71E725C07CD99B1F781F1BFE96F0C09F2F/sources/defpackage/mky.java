package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.RippleDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsContainer;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsHorizontalSurvey;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ExpandableSurveyRenderer;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction;
import com.google.protos.youtube.api.innertube.SurveyRenderer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: mky  reason: default package */
/* loaded from: classes3.dex */
public final class mky extends ajsl implements fzq, geq, ajrm, ynl {
    private final ImageView A;
    private final TextView B;
    private final TextView C;
    private final TextView D;
    private final ImageView E;
    private final LinearLayout F;
    private final LinearLayout G;
    private final ajmy H;
    private final fjy I;

    /* renamed from: J  reason: collision with root package name */
    private final ajsa f229J;
    private final HatsContainer K;
    private final LinearLayout L;
    private final int M;
    private final int N;
    private final int O;
    private final int P;
    private final int Q;
    private Object R;
    private ajrp S;
    private ajru T;
    private ajru U;
    private ajru V;
    private TextView W;
    private ChipCloudView X;
    private apzg Y;
    private AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand Z;
    public final aafo a;
    private int aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private mkx[] ae;
    private final ajru af;
    private ggt ag;
    public final ajxz b;
    public final LinearLayout c;
    public final yni d;
    public final Context e;
    public final int f;
    public apzg g;
    public arkf i;
    public View j;
    public final RelativeLayout k;
    public Button l;
    public Button m;
    public LinearLayout n;
    public LinearLayout o;
    public LinearLayout p;
    public TextView q;
    public Spanned t;
    final View v;
    private acti x;
    private final View y;
    private final gem z;
    private int ah = 1;
    public CharSequence r = "";
    public int s = -1;
    public List u = null;
    public final Map h = new HashMap();

    public mky(Context context, aafo aafoVar, gem gemVar, yni yniVar, ajxz ajxzVar, fjy fjyVar, mkm mkmVar, ajmy ajmyVar, ajsa ajsaVar) {
        this.e = context;
        this.a = aafoVar;
        this.z = gemVar;
        this.d = yniVar;
        this.b = ajxzVar;
        this.I = fjyVar;
        this.H = ajmyVar;
        this.f229J = ajsaVar;
        this.af = mkmVar.a(false);
        this.M = context.getResources().getDimensionPixelSize(R.dimen.inline_survey_between_button_margin);
        this.N = context.getResources().getDimensionPixelSize(R.dimen.inline_survey_first_primary_button_start_margin);
        this.O = context.getResources().getDimensionPixelSize(R.dimen.inline_survey_button_min_width);
        this.f = zhn.j(context, R.attr.ytCallToAction).orElse(0);
        this.P = zhn.j(context, R.attr.ytBorderedButtonChipBackground).orElse(0);
        this.Q = zhn.j(context, R.attr.ytBrandBackgroundSolid).orElse(0);
        LayoutInflater from = LayoutInflater.from(context);
        View inflate = from.inflate(R.layout.inline_survey_layout, (ViewGroup) null);
        this.y = inflate;
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.video_layout);
        this.G = linearLayout;
        this.c = (LinearLayout) inflate.findViewById(R.id.full_size_video_layout);
        this.v = from.inflate(R.layout.in_card_video_layout, (ViewGroup) linearLayout, false);
        this.A = (ImageView) inflate.findViewById(R.id.icon);
        this.B = (TextView) inflate.findViewById(R.id.title);
        this.C = (TextView) inflate.findViewById(R.id.subtitle);
        this.D = (TextView) inflate.findViewById(R.id.tap_suppressed_message);
        this.E = (ImageView) inflate.findViewById(R.id.close_button);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.survey_responses);
        this.F = linearLayout2;
        this.K = (HatsContainer) LayoutInflater.from(context).inflate(R.layout.hats_survey_container, (ViewGroup) linearLayout2, false);
        this.L = (LinearLayout) from.inflate(R.layout.inline_survey_buttons, (ViewGroup) linearLayout2, false);
        this.k = (RelativeLayout) inflate.findViewById(R.id.survey_layout);
        gemVar.c(inflate);
        inflate.setBackground(new frf(zhn.j(context, R.attr.yt10PercentLayer).orElse(0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
    }

    public static boolean p(arkf arkfVar) {
        int aK = awwc.aK(arkfVar.n);
        return aK != 0 && aK == 4;
    }

    public static boolean q(arkf arkfVar) {
        int aK = awwc.aK(arkfVar.n);
        return aK != 0 && aK == 2;
    }

    private static String r(arag aragVar) {
        if (aragVar != null) {
            arah arahVar = aragVar.f;
            if (arahVar == null) {
                arahVar = arah.a;
            }
            if ((arahVar.b & 1) == 0) {
                return null;
            }
            arah arahVar2 = aragVar.f;
            if (arahVar2 == null) {
                arahVar2 = arah.a;
            }
            aovr aovrVar = arahVar2.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            return aovrVar.c;
        }
        return null;
    }

    private final void s(byte[] bArr) {
        acti actiVar = this.x;
        if (actiVar == null || bArr == null) {
            return;
        }
        actiVar.D(new acte(bArr));
    }

    private final void t(byte[] bArr) {
        acti actiVar = this.x;
        if (actiVar == null || bArr == null) {
            return;
        }
        actiVar.u(new acte(bArr), null);
    }

    private final void u(View view) {
        view.setBackground(new RippleDrawable(zhn.f(this.e, R.attr.colorControlHighlight), view.getBackground(), null));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.z.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        int i;
        arag aragVar;
        arag aragVar2;
        apoj apojVar;
        int l;
        apzg apzgVar;
        arag aragVar3;
        arag aragVar4;
        LinearLayout linearLayout;
        arkf arkfVar = (arkf) obj;
        this.R = arkfVar;
        this.x = ajrsVar.a;
        this.h.put("com.google.android.libraries.youtube.innertube.endpoint.tag", arkfVar);
        for (apzg apzgVar2 : arkfVar.l) {
            this.a.c(apzgVar2, this.h);
        }
        TextView textView = this.B;
        arag aragVar5 = arkfVar.f;
        if (aragVar5 == null) {
            aragVar5 = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar5));
        TextView textView2 = this.B;
        arag aragVar6 = arkfVar.f;
        if (aragVar6 == null) {
            aragVar6 = arag.a;
        }
        textView2.setContentDescription(r(aragVar6));
        TextView textView3 = this.C;
        arag aragVar7 = arkfVar.g;
        if (aragVar7 == null) {
            aragVar7 = arag.a;
        }
        zag.m(textView3, ajgl.b(aragVar7));
        TextView textView4 = this.C;
        arag aragVar8 = arkfVar.g;
        if (aragVar8 == null) {
            aragVar8 = arag.a;
        }
        textView4.setContentDescription(r(aragVar8));
        if ((arkfVar.b & 1) == 0) {
            this.A.setVisibility(8);
        } else {
            ImageView imageView = this.A;
            ajxz ajxzVar = this.b;
            arhs arhsVar = arkfVar.c;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            imageView.setImageResource(ajxzVar.a(b));
            this.A.setVisibility(0);
        }
        if ((arkfVar.b & 2) != 0) {
            ImageView imageView2 = this.E;
            ajxz ajxzVar2 = this.b;
            arhs arhsVar2 = arkfVar.d;
            if (arhsVar2 == null) {
                arhsVar2 = arhs.a;
            }
            arhr b2 = arhr.b(arhsVar2.c);
            if (b2 == null) {
                b2 = arhr.UNKNOWN;
            }
            imageView2.setImageResource(ajxzVar2.a(b2));
        }
        if ((arkfVar.b & 4) != 0) {
            apzg apzgVar3 = arkfVar.e;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            this.g = apzgVar3;
            this.E.setVisibility(0);
            this.E.setOnClickListener(new mkp(this, 1));
        } else {
            this.E.setVisibility(8);
            this.E.setOnClickListener(null);
        }
        this.i = arkfVar;
        this.G.removeAllViews();
        if (this.c.getChildCount() > 1) {
            this.c.removeViews(1, linearLayout.getChildCount() - 1);
        }
        this.ab = false;
        this.ac = false;
        this.ad = false;
        zag.o(this.G, false);
        zag.o(this.c, false);
        if ((arkfVar.b & 128) != 0) {
            i = awwc.aE(arkfVar.i);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 0;
        }
        this.ah = i;
        if ((arkfVar.b & 64) != 0) {
            arke arkeVar = arkfVar.h;
            if (arkeVar == null) {
                arkeVar = arke.a;
            }
            int i2 = arkeVar.b;
            if (i2 == 125014205) {
                arkd arkdVar = (arkd) arkeVar.c;
                t(arkdVar.g.I());
                this.ab = true;
                ImageView imageView3 = (ImageView) this.v.findViewById(R.id.thumbnail);
                TextView textView5 = (TextView) this.v.findViewById(R.id.video_title);
                TextView textView6 = (TextView) this.v.findViewById(R.id.video_details);
                ajrp ajrpVar = new ajrp(this.a, this.v, this);
                this.S = ajrpVar;
                acti actiVar = ajrsVar.a;
                if ((arkdVar.b & 8) != 0) {
                    apzgVar = arkdVar.f;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                } else {
                    apzgVar = null;
                }
                ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
                this.G.addView(this.v);
                zag.o(this.G, true);
                ajmy ajmyVar = this.H;
                avhn avhnVar = arkdVar.c;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
                ajmyVar.h(imageView3, avhnVar);
                if ((arkdVar.b & 2) != 0) {
                    aragVar3 = arkdVar.d;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                } else {
                    aragVar3 = null;
                }
                zag.m(textView5, ajgl.b(aragVar3));
                if ((arkdVar.b & 4) != 0) {
                    aragVar4 = arkdVar.e;
                    if (aragVar4 == null) {
                        aragVar4 = arag.a;
                    }
                } else {
                    aragVar4 = null;
                }
                zag.m(textView6, ajgl.b(aragVar4));
            } else if (i2 == 50630979) {
                aqfa aqfaVar = (aqfa) arkeVar.c;
                t(aqfaVar.y.I());
                this.ab = true;
                if (this.T == null) {
                    ampq i3 = akel.i(this.f229J, aqfaVar, this.G);
                    if (i3.h()) {
                        this.T = (ajru) i3.c();
                    }
                }
                ajrsVar.getClass();
                ajrsVar.f("yt_click_intercept_tag", this);
                this.T.oK(ajrsVar, aqfaVar);
                this.G.addView(this.T.a());
                zag.o(this.G, true);
            } else if (i2 == 60373625) {
                arfe arfeVar = (arfe) arkeVar.c;
                s(arfeVar.z.I());
                t(arfeVar.z.I());
                this.ac = true;
                if (this.U == null) {
                    ampq i4 = akel.i(this.f229J, arfeVar, this.G);
                    if (i4.h()) {
                        this.U = (ajru) i4.c();
                    }
                }
                this.U.oK(ajrsVar, arfeVar);
                this.c.addView(this.U.a());
                zag.o(this.c, true);
                this.d.g(this);
            } else if (i2 == 89018663) {
                awbh awbhVar = (awbh) arkeVar.c;
                s(awbhVar.q.I());
                t(awbhVar.q.I());
                this.ac = true;
                if (this.V == null) {
                    ampq i5 = akel.i(this.f229J, awbhVar, this.G);
                    if (i5.h()) {
                        this.V = (ajru) i5.c();
                    }
                }
                this.V.oK(ajrsVar, awbhVar);
                this.c.addView(this.V.a());
                zag.o(this.c, true);
                this.d.g(this);
            } else if (i2 == 83537025) {
                this.ad = true;
                zag.o(this.c, true);
                this.ag = eog.bm(arkfVar);
                this.c.addView(((mkl) this.af).b);
                this.af.oK(ajrsVar, this.ag);
                this.d.g(this);
            }
        }
        int aD = awwc.aD(arkfVar.k);
        if (aD == 0) {
            aD = 1;
        }
        if (aD == 3) {
            this.y.findViewById(R.id.bottom_divider).setVisibility(0);
            this.k.setBackgroundColor(this.P);
            this.F.setBackgroundColor(this.P);
            this.B.setTextColor(this.f);
            this.C.setTextColor(this.f);
            if (this.A.getDrawable() != null) {
                this.A.getDrawable().mutate().setColorFilter(this.f, PorterDuff.Mode.SRC_IN);
            }
            if (this.E.getDrawable() != null) {
                this.E.getDrawable().mutate().setColorFilter(this.f, PorterDuff.Mode.SRC_IN);
            }
            if (this.ab) {
                LinearLayout linearLayout2 = (LinearLayout) this.y.findViewById(R.id.video_info_view);
                if (linearLayout2 != null) {
                    linearLayout2.setPadding(0, 0, 0, 0);
                    linearLayout2.setBackgroundColor(zhn.j(this.e, R.attr.ytBrandBackgroundSolid).orElse(0));
                    zgd.t(linearLayout2.findViewById(R.id.thumbnail_layout), zgd.b(zgd.p(0), zgd.e(0)), ViewGroup.MarginLayoutParams.class);
                }
                zgd.t(this.G, zgd.l(this.e.getResources().getDimensionPixelOffset(R.dimen.start_end_padding)), ViewGroup.MarginLayoutParams.class);
            } else if (this.ac) {
                this.y.findViewById(R.id.bottom_divider).setVisibility(8);
                this.c.setBackgroundColor(this.Q);
            } else if (this.ad) {
                this.y.findViewById(R.id.bottom_divider).setVisibility(8);
            }
        } else {
            this.y.findViewById(R.id.bottom_divider).setVisibility(8);
        }
        zag.o(this.k, true);
        arkg arkgVar = arkfVar.j;
        if (arkgVar == null) {
            arkgVar = arkg.a;
        }
        this.F.removeAllViews();
        zag.o(this.F, true);
        if (arkgVar != null && arkgVar.b == 116011845) {
            aopu aopuVar = ((arkc) arkgVar.c).b;
            this.L.removeAllViews();
            int i6 = 0;
            while (i6 < aopuVar.size()) {
                fjx a = this.I.a(null, this.h);
                if ((((apok) aopuVar.get(i6)).b & 1) != 0) {
                    apojVar = ((apok) aopuVar.get(i6)).c;
                    if (apojVar == null) {
                        apojVar = apoj.a;
                    }
                } else {
                    apojVar = null;
                }
                a.oK(ajrsVar, apojVar);
                TextView textView7 = a.b;
                textView7.setMinimumWidth(this.O);
                this.L.addView(textView7);
                textView7.setTextAlignment(4);
                if (i6 == 0) {
                    apoj apojVar2 = ((apok) aopuVar.get(0)).c;
                    if (apojVar2 == null) {
                        apojVar2 = apoj.a;
                    }
                    if (apojVar2.c == 1 && (l = akzj.l(((Integer) apojVar2.d).intValue())) != 0 && l == 3) {
                        int i7 = this.N;
                        if (textView7 != null && (textView7.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                            ((ViewGroup.MarginLayoutParams) textView7.getLayoutParams()).setMarginStart(i7);
                            textView7.requestLayout();
                        }
                    }
                    i6 = 0;
                }
                int i8 = this.M;
                if (textView7 != null && (textView7.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    ((ViewGroup.MarginLayoutParams) textView7.getLayoutParams()).setMarginEnd(i8);
                    textView7.requestLayout();
                }
                i6++;
            }
            this.F.addView(this.L);
            this.F.setVisibility(0);
        } else if (arkgVar != null && arkgVar.b == 171694596) {
            aopu<avdr> aopuVar2 = ((arkb) arkgVar.c).b;
            HatsHorizontalSurvey b3 = this.K.a().b();
            b3.f(null, null);
            b3.d(null);
            ArrayList arrayList = new ArrayList(aopuVar2.size());
            for (avdr avdrVar : aopuVar2) {
                final avdp avdpVar = avdrVar.b == 84469192 ? (avdp) avdrVar.c : null;
                if (avdpVar != null) {
                    View f = hxb.f(this.e, null, false);
                    hxb.i(f, avdpVar, this.b, new View.OnClickListener() { // from class: mkt
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            mky mkyVar = mky.this;
                            avdp avdpVar2 = avdpVar;
                            aafo aafoVar = mkyVar.a;
                            apzg apzgVar4 = avdpVar2.e;
                            if (apzgVar4 == null) {
                                apzgVar4 = apzg.a;
                            }
                            aafoVar.c(apzgVar4, mkyVar.h);
                        }
                    });
                    arrayList.add(f);
                }
            }
            b3.e(arrayList);
            b3.b(hxb.h(aopuVar2));
            b3.a(hxb.g(aopuVar2));
            this.K.f(b3);
            HatsContainer hatsContainer = this.K;
            hatsContainer.g = false;
            hatsContainer.c();
            this.K.setPadding(0, 0, 0, 0);
            zag.o(this.K, true);
            this.F.addView(this.K);
            this.F.setVisibility(0);
        } else if (arkgVar == null || arkgVar.b != 195864971) {
            zag.o(this.F, false);
            View view = this.y;
            view.getClass();
            view.post(new gys(view, 5));
        } else {
            aqwz aqwzVar = (aqwz) arkgVar.c;
            t(aqwzVar.e.I());
            if (this.u == null) {
                this.u = new ArrayList();
            }
            this.E.setOnClickListener(new mkp(this));
            LayoutInflater from = LayoutInflater.from(this.e);
            if (q(this.i)) {
                aragVar = null;
                this.j = from.inflate(R.layout.expandable_survey_replace_with_follow_up_layout, (ViewGroup) null);
            } else {
                aragVar = null;
                this.j = from.inflate(R.layout.expandable_survey_layout, (ViewGroup) null);
            }
            this.q = (TextView) this.j.findViewById(R.id.rating_description);
            this.W = (TextView) this.j.findViewById(R.id.follow_up_text);
            this.n = (LinearLayout) this.j.findViewById(R.id.star_container);
            LinearLayout linearLayout3 = (LinearLayout) this.j.findViewById(R.id.follow_up_container);
            this.o = linearLayout3;
            this.p = (LinearLayout) linearLayout3.findViewById(R.id.rating_selection);
            Button button = (Button) this.j.findViewById(R.id.btn_not_sure_undo);
            this.l = button;
            u(button);
            Button button2 = (Button) this.j.findViewById(R.id.btn_submit);
            this.m = button2;
            u(button2);
            ChipCloudView chipCloudView = (ChipCloudView) this.j.findViewById(R.id.follow_up_cloud);
            this.X = chipCloudView;
            chipCloudView.b(this.e.getResources().getInteger(R.integer.inline_survey_max_follow_up_question_rows));
            aunb aunbVar = aqwzVar.b;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            aqxb aqxbVar = (aqxb) aunbVar.qm(ExpandableSurveyRenderer.ratingSurveyRenderer);
            t(aqxbVar.c.I());
            this.ae = new mkx[aqxbVar.b.size()];
            this.aa = this.e.getResources().getDimensionPixelOffset(R.dimen.inline_survey_star_padding);
            for (int i9 = 0; i9 < aqxbVar.b.size(); i9++) {
                if (((aunb) aqxbVar.b.get(i9)).qn(ExpandableSurveyRenderer.ratingSurveyOptionRenderer)) {
                    final aqxa aqxaVar = (aqxa) ((aunb) aqxbVar.b.get(i9)).qm(ExpandableSurveyRenderer.ratingSurveyOptionRenderer);
                    t(aqxaVar.h.I());
                    arag aragVar9 = aqxaVar.c;
                    if (aragVar9 == null) {
                        aragVar9 = arag.a;
                    }
                    final Spanned b4 = ajgl.b(aragVar9);
                    final ImageView imageView4 = new ImageView(this.e);
                    int i10 = this.aa;
                    imageView4.setPadding(i10, i10, i10, i10);
                    imageView4.setContentDescription(b4);
                    u(imageView4);
                    final int i11 = i9 + 1;
                    imageView4.setOnTouchListener(new View.OnTouchListener() { // from class: mkv
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            mky mkyVar = mky.this;
                            int i12 = i11;
                            CharSequence charSequence = b4;
                            ImageView imageView5 = imageView4;
                            if (motionEvent.getAction() == 0) {
                                mkyVar.o(i12);
                                mkyVar.q.setText(charSequence);
                            } else if (motionEvent.getAction() == 3) {
                                mkyVar.o(mkyVar.s);
                                mkyVar.q.setText(mkyVar.r);
                            } else if (motionEvent.getAction() != 1) {
                                return false;
                            } else {
                                imageView5.performClick();
                                return false;
                            }
                            return true;
                        }
                    });
                    imageView4.setOnClickListener(new View.OnClickListener() { // from class: mks
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            apzg apzgVar4;
                            AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand;
                            mky mkyVar = mky.this;
                            aqxa aqxaVar2 = aqxaVar;
                            int i12 = i11;
                            CharSequence charSequence = b4;
                            mkyVar.m(aqxaVar2.h.I());
                            if ((aqxaVar2.b & 16) != 0) {
                                apzg apzgVar5 = aqxaVar2.g;
                                if (apzgVar5 == null) {
                                    apzgVar5 = apzg.a;
                                }
                                apzgVar4 = apzgVar5;
                            } else {
                                apzgVar4 = null;
                            }
                            apzg apzgVar6 = aqxaVar2.f;
                            if (apzgVar6 == null) {
                                apzgVar6 = apzg.a;
                            }
                            if (!apzgVar6.qn(AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.addFollowUpSurveyCommand)) {
                                addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand = null;
                            } else {
                                apzg apzgVar7 = aqxaVar2.f;
                                if (apzgVar7 == null) {
                                    apzgVar7 = apzg.a;
                                }
                                addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand = (AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand) apzgVar7.qm(AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.addFollowUpSurveyCommand);
                            }
                            mkyVar.n(false, i12, charSequence, apzgVar4, addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand, aqxaVar2);
                            if (mky.q(mkyVar.i)) {
                                zag.o(mkyVar.k, false);
                                zag.o(mkyVar.n, false);
                                zag.o(mkyVar.m, true);
                                LinearLayout linearLayout4 = (LinearLayout) mkyVar.j.findViewById(R.id.mini_star_container);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    ImageView imageView5 = new ImageView(mkyVar.e);
                                    ajxz ajxzVar3 = mkyVar.b;
                                    arhs arhsVar3 = aqxaVar2.d;
                                    if (arhsVar3 == null) {
                                        arhsVar3 = arhs.a;
                                    }
                                    arhr b5 = arhr.b(arhsVar3.c);
                                    if (b5 == null) {
                                        b5 = arhr.UNKNOWN;
                                    }
                                    int a2 = ajxzVar3.a(b5);
                                    ajxz ajxzVar4 = mkyVar.b;
                                    arhs arhsVar4 = aqxaVar2.e;
                                    if (arhsVar4 == null) {
                                        arhsVar4 = arhs.a;
                                    }
                                    arhr b6 = arhr.b(arhsVar4.c);
                                    if (b6 == null) {
                                        b6 = arhr.UNKNOWN;
                                    }
                                    mkx mkxVar = new mkx(mkyVar, imageView5, a2, ajxzVar4.a(b6));
                                    mkxVar.c();
                                    mkxVar.a();
                                    linearLayout4.addView(imageView5, mkyVar.e.getResources().getDimensionPixelSize(R.dimen.mini_star_icon_height_width_dp), mkyVar.e.getResources().getDimensionPixelSize(R.dimen.mini_star_icon_height_width_dp));
                                }
                                zag.o(linearLayout4, true);
                            }
                        }
                    });
                    this.n.addView(imageView4);
                    mkx[] mkxVarArr = this.ae;
                    ajxz ajxzVar3 = this.b;
                    arhs arhsVar3 = aqxaVar.d;
                    if (arhsVar3 == null) {
                        arhsVar3 = arhs.a;
                    }
                    arhr b5 = arhr.b(arhsVar3.c);
                    if (b5 == null) {
                        b5 = arhr.UNKNOWN;
                    }
                    int a2 = ajxzVar3.a(b5);
                    ajxz ajxzVar4 = this.b;
                    arhs arhsVar4 = aqxaVar.e;
                    if (arhsVar4 == null) {
                        arhsVar4 = arhs.a;
                    }
                    arhr b6 = arhr.b(arhsVar4.c);
                    if (b6 == null) {
                        b6 = arhr.UNKNOWN;
                    }
                    mkxVarArr[i9] = new mkx(this, imageView4, a2, ajxzVar4.a(b6));
                    this.ae[i9].b();
                }
            }
            aunb aunbVar2 = aqwzVar.c;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            final apoj apojVar3 = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
            if ((apojVar3.b & 256) != 0) {
                aragVar2 = apojVar3.i;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = aragVar;
            }
            Spanned b7 = ajgl.b(aragVar2);
            this.t = b7;
            this.l.setText(b7);
            this.l.setOnClickListener(new View.OnClickListener() { // from class: mkr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand;
                    mky mkyVar = mky.this;
                    apoj apojVar4 = apojVar3;
                    if (mkyVar.s != -1) {
                        mkyVar.s = -1;
                        mkyVar.o(-1);
                        mkyVar.n.setVisibility(0);
                        mkyVar.q.setPadding(0, 0, 0, 0);
                        mkyVar.l.setText(mkyVar.t);
                        mkyVar.o.setVisibility(8);
                        if (mky.q(mkyVar.i)) {
                            zag.o(mkyVar.m, false);
                            zag.o(mkyVar.k, true);
                            LinearLayout linearLayout4 = (LinearLayout) mkyVar.j.findViewById(R.id.mini_star_container);
                            linearLayout4.removeAllViews();
                            zag.o(linearLayout4, false);
                            return;
                        } else if (!mky.p(mkyVar.i)) {
                            return;
                        } else {
                            mkyVar.p.removeAllViews();
                            zag.o(mkyVar.p, false);
                            return;
                        }
                    }
                    mkyVar.m(apojVar4.t.I());
                    Spanned spanned = mkyVar.t;
                    apzg apzgVar4 = apojVar4.n;
                    if (apzgVar4 == null) {
                        apzgVar4 = apzg.a;
                    }
                    apzg apzgVar5 = apzgVar4;
                    apzg apzgVar6 = apojVar4.p;
                    if (apzgVar6 == null) {
                        apzgVar6 = apzg.a;
                    }
                    if (apzgVar6.qn(AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.addFollowUpSurveyCommand)) {
                        apzg apzgVar7 = apojVar4.p;
                        if (apzgVar7 == null) {
                            apzgVar7 = apzg.a;
                        }
                        addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand = (AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand) apzgVar7.qm(AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.addFollowUpSurveyCommand);
                    } else {
                        addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand = null;
                    }
                    mkyVar.n(false, 0, spanned, apzgVar5, addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand, null);
                    if (!mky.q(mkyVar.i)) {
                        return;
                    }
                    zag.o(mkyVar.k, false);
                    zag.o(mkyVar.m, true);
                }
            });
            aunb aunbVar3 = aqwzVar.d;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            final aopc aopcVar = (aopc) ((apoj) aunbVar3.qm(ButtonRendererOuterClass.buttonRenderer)).mo52toBuilder();
            apoj apojVar4 = (apoj) aopcVar.instance;
            if ((apojVar4.b & 256) != 0) {
                Button button3 = this.m;
                arag aragVar10 = apojVar4.i;
                if (aragVar10 == null) {
                    aragVar10 = arag.a;
                }
                button3.setText(ajgl.b(aragVar10));
            }
            this.m.setOnClickListener(new View.OnClickListener() { // from class: mkq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i12;
                    HashMap hashMap;
                    mky mkyVar = mky.this;
                    aopc aopcVar2 = aopcVar;
                    mkyVar.m(((apoj) aopcVar2.instance).t.I());
                    mkyVar.m.setEnabled(false);
                    if (!mkyVar.u.isEmpty()) {
                        apzg apzgVar4 = (apzg) mkyVar.u.get(0);
                        if (!apzgVar4.qn(FeedbackEndpointOuterClass.feedbackEndpoint) || mkyVar.u.size() <= 1) {
                            hashMap = null;
                        } else {
                            hashMap = new HashMap();
                            ArrayList arrayList2 = new ArrayList(mkyVar.u.size() - 1);
                            for (int i13 = 1; i13 < mkyVar.u.size(); i13++) {
                                arrayList2.add(((aqyh) ((apzg) mkyVar.u.get(i13)).qm(FeedbackEndpointOuterClass.feedbackEndpoint)).e);
                            }
                            hashMap.put("feedback_merge_token", true);
                            hashMap.put("feedback_token", arrayList2);
                        }
                        mkyVar.a.c(apzgVar4, hashMap);
                    }
                    apzg apzgVar5 = ((apoj) aopcVar2.instance).p;
                    if (apzgVar5 == null) {
                        apzgVar5 = apzg.a;
                    }
                    ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction replaceEnclosingActionOuterClass$ReplaceEnclosingAction = (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) apzgVar5.qm(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction);
                    if (apzgVar5.qn(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction)) {
                        aunk aunkVar = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.c;
                        if (aunkVar == null) {
                            aunkVar = aunk.a;
                        }
                        if ((aunkVar.b & 32) != 0 && (i12 = mkyVar.s) < 3 && i12 != 0) {
                            aunk aunkVar2 = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.c;
                            if (aunkVar2 == null) {
                                aunkVar2 = aunk.a;
                            }
                            arkf arkfVar2 = aunkVar2.h;
                            if (arkfVar2 == null) {
                                arkfVar2 = arkf.a;
                            }
                            aopa mo52toBuilder = arkfVar2.mo52toBuilder();
                            mo52toBuilder.copyOnWrite();
                            arkf arkfVar3 = (arkf) mo52toBuilder.instance;
                            arkfVar3.h = null;
                            arkfVar3.b &= -65;
                            arkf arkfVar4 = (arkf) mo52toBuilder.mo39build();
                            aunk aunkVar3 = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.c;
                            if (aunkVar3 == null) {
                                aunkVar3 = aunk.a;
                            }
                            aopa mo52toBuilder2 = aunkVar3.mo52toBuilder();
                            mo52toBuilder2.copyOnWrite();
                            aunk aunkVar4 = (aunk) mo52toBuilder2.instance;
                            arkfVar4.getClass();
                            aunkVar4.h = arkfVar4;
                            aunkVar4.b |= 32;
                            aunk aunkVar5 = (aunk) mo52toBuilder2.mo39build();
                            aopa mo52toBuilder3 = replaceEnclosingActionOuterClass$ReplaceEnclosingAction.mo52toBuilder();
                            mo52toBuilder3.copyOnWrite();
                            ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction replaceEnclosingActionOuterClass$ReplaceEnclosingAction2 = (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) mo52toBuilder3.instance;
                            aunkVar5.getClass();
                            replaceEnclosingActionOuterClass$ReplaceEnclosingAction2.c = aunkVar5;
                            replaceEnclosingActionOuterClass$ReplaceEnclosingAction2.b |= 1;
                            aopc aopcVar3 = (aopc) apzgVar5.mo52toBuilder();
                            aopcVar3.e(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction, (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction) mo52toBuilder3.mo39build());
                            apzgVar5 = (apzg) aopcVar3.mo39build();
                        }
                    }
                    aopcVar2.copyOnWrite();
                    apoj apojVar5 = (apoj) aopcVar2.instance;
                    apzgVar5.getClass();
                    apojVar5.p = apzgVar5;
                    apojVar5.b |= 32768;
                    aafo aafoVar = mkyVar.a;
                    apzg apzgVar6 = apojVar5.p;
                    if (apzgVar6 == null) {
                        apzgVar6 = apzg.a;
                    }
                    aafoVar.c(apzgVar6, mkyVar.h);
                    mkyVar.s = -1;
                }
            });
            this.F.addView(this.j);
            this.F.setVisibility(0);
            int i12 = this.s;
            if (i12 == -1) {
                return;
            }
            n(true, i12, this.r, this.Y, this.Z, i12 == 0 ? aragVar : (aqxa) ((aunb) aqxbVar.b.get(i12 - 1)).qm(ExpandableSurveyRenderer.ratingSurveyOptionRenderer));
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arkf) obj).m.I();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ajru, fzq] */
    @Override // defpackage.fzq
    public final View g() {
        return this.af.g();
    }

    @Override // defpackage.ajrm
    public final boolean h(View view) {
        int i = this.ah;
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            k();
            return false;
        }
        this.D.setVisibility(0);
        TextView textView = this.D;
        textView.announceForAccessibility(textView.getText());
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ajru, fzq] */
    @Override // defpackage.fzq
    public final void i(boolean z) {
        this.af.i(z);
    }

    @Override // defpackage.fzq
    public final /* synthetic */ mct j() {
        return null;
    }

    public final void k() {
        apzg apzgVar = this.g;
        if (apzgVar != null) {
            this.a.c(apzgVar, this.h);
        }
        this.d.d(new ajym(this.i));
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                isw iswVar = (isw) obj;
                zag.o(this.c, false);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{isw.class};
    }

    public final void m(byte[] bArr) {
        acti actiVar = this.x;
        if (actiVar == null || bArr == null) {
            return;
        }
        actiVar.H(3, new acte(bArr), null);
    }

    public final void n(boolean z, int i, CharSequence charSequence, apzg apzgVar, AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand, aqxa aqxaVar) {
        arag aragVar;
        Spanned b;
        arag aragVar2;
        final apzg apzgVar2;
        if (this.s != i || z) {
            this.D.setVisibility(8);
            this.s = i;
            if (!z) {
                this.u.clear();
                this.u.add(apzgVar);
            }
            aopu<aunb> aopuVar = addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand == null ? null : addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.c;
            this.X.removeAllViews();
            boolean z2 = false;
            if (aopuVar == null || aopuVar.isEmpty()) {
                this.X.setVisibility(8);
            } else {
                this.X.setVisibility(0);
                for (aunb aunbVar : aopuVar) {
                    if (aunbVar.qn(SurveyRenderer.checkboxSurveyOptionRenderer)) {
                        avdg avdgVar = (avdg) aunbVar.qm(SurveyRenderer.checkboxSurveyOptionRenderer);
                        if ((avdgVar.b & 1) != 0) {
                            aragVar2 = avdgVar.c;
                            if (aragVar2 == null) {
                                aragVar2 = arag.a;
                            }
                        } else {
                            aragVar2 = null;
                        }
                        Spanned b2 = ajgl.b(aragVar2);
                        if ((avdgVar.b & 2) != 0) {
                            apzgVar2 = avdgVar.d;
                            if (apzgVar2 == null) {
                                apzgVar2 = apzg.a;
                            }
                        } else {
                            apzgVar2 = null;
                        }
                        final byte[] I = avdgVar.e.I();
                        final fwn fwnVar = new fwn(this.e);
                        aopa createBuilder = apvg.a.createBuilder();
                        String[] strArr = new String[1];
                        String charSequence2 = b2.toString();
                        char c = z2 ? 1 : 0;
                        char c2 = z2 ? 1 : 0;
                        char c3 = z2 ? 1 : 0;
                        char c4 = z2 ? 1 : 0;
                        strArr[c] = charSequence2;
                        arag g = ajgl.g(strArr);
                        createBuilder.copyOnWrite();
                        apvg apvgVar = (apvg) createBuilder.instance;
                        g.getClass();
                        apvgVar.f = g;
                        apvgVar.b |= 2;
                        createBuilder.copyOnWrite();
                        apvg apvgVar2 = (apvg) createBuilder.instance;
                        apvgVar2.b |= 256;
                        apvgVar2.i = z2;
                        aopa createBuilder2 = apvi.a.createBuilder();
                        apvh apvhVar = apvh.STYLE_UNKNOWN;
                        createBuilder2.copyOnWrite();
                        apvi apviVar = (apvi) createBuilder2.instance;
                        apviVar.c = apvhVar.p;
                        apviVar.b |= 1;
                        createBuilder.copyOnWrite();
                        apvg apvgVar3 = (apvg) createBuilder.instance;
                        apvi apviVar2 = (apvi) createBuilder2.mo39build();
                        apviVar2.getClass();
                        apvgVar3.e = apviVar2;
                        apvgVar3.b |= 1;
                        apvg apvgVar4 = (apvg) createBuilder.mo39build();
                        DisplayMetrics displayMetrics = this.e.getResources().getDisplayMetrics();
                        int i2 = this.f;
                        fwl a = fwnVar.a();
                        a.e(true);
                        arag aragVar3 = apvgVar4.f;
                        if (aragVar3 == null) {
                            aragVar3 = arag.a;
                        }
                        a.g(!TextUtils.isEmpty(ajgl.b(aragVar3)));
                        a.c = ampq.j(Integer.valueOf(i2));
                        a.t(R.drawable.chip_cloud_chip_checkbox_background);
                        a.v(i2);
                        a.n(i2);
                        a.l(R.drawable.chip_cloud_chip_checkbox_background);
                        a.w(true);
                        a.s(8388627);
                        fwnVar.e = a.a();
                        fwnVar.b(apvgVar4);
                        fwnVar.setMinimumHeight(this.e.getResources().getDimensionPixelSize(R.dimen.inline_survey_chip_height));
                        fwnVar.f(zew.i(displayMetrics, 48));
                        fwnVar.setAccessibilityDelegate(new mkw(fwnVar));
                        fwnVar.setOnClickListener(new View.OnClickListener() { // from class: mku
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                mky mkyVar = mky.this;
                                byte[] bArr = I;
                                fwn fwnVar2 = fwnVar;
                                apzg apzgVar3 = apzgVar2;
                                mkyVar.m(bArr);
                                int i3 = 1;
                                if (true == fwnVar2.isSelected()) {
                                    i3 = 2;
                                }
                                fwnVar2.d(i3);
                                if (fwnVar2.isSelected()) {
                                    mkyVar.u.add(apzgVar3);
                                } else {
                                    mkyVar.u.remove(apzgVar3);
                                }
                            }
                        });
                        t(avdgVar.e.I());
                        this.X.addView(fwnVar);
                        if (z) {
                            for (apzg apzgVar3 : this.u) {
                                if ((avdgVar.b & 2) != 0) {
                                    apzg apzgVar4 = avdgVar.d;
                                    if (apzgVar4 == null) {
                                        apzgVar4 = apzg.a;
                                    }
                                    if (apzgVar4.equals(apzgVar3)) {
                                        fwnVar.d(1);
                                    }
                                }
                            }
                        }
                        z2 = false;
                    }
                }
            }
            o(this.s);
            int dimensionPixelOffset = q(this.i) ? 0 : this.e.getResources().getDimensionPixelOffset(R.dimen.inline_survey_rating_desc_padding);
            if (this.s == 0) {
                this.n.setVisibility(8);
                this.q.setPadding(0, dimensionPixelOffset, 0, 0);
            }
            if (aqxaVar != null && p(this.i)) {
                ImageView imageView = new ImageView(this.e);
                int dimensionPixelOffset2 = this.e.getResources().getDimensionPixelOffset(R.dimen.inline_survey_rating_selection_padding);
                imageView.setPadding(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
                ajxz ajxzVar = this.b;
                arhs arhsVar = aqxaVar.d;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b3 = arhr.b(arhsVar.c);
                if (b3 == null) {
                    b3 = arhr.UNKNOWN;
                }
                int a2 = ajxzVar.a(b3);
                ajxz ajxzVar2 = this.b;
                arhs arhsVar2 = aqxaVar.e;
                if (arhsVar2 == null) {
                    arhsVar2 = arhs.a;
                }
                arhr b4 = arhr.b(arhsVar2.c);
                if (b4 == null) {
                    b4 = arhr.UNKNOWN;
                }
                mkx mkxVar = new mkx(this, imageView, a2, ajxzVar2.a(b4));
                mkxVar.b();
                mkxVar.a();
                this.p.addView(imageView);
                zag.o(this.p, true);
                this.q.setPadding(0, dimensionPixelOffset, 0, 0);
                zag.o(this.n, false);
            }
            this.r = charSequence;
            this.Y = apzgVar;
            this.Z = addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand;
            if (addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand == null) {
                b = null;
            } else {
                if ((addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.b & 1) != 0) {
                    aragVar = addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.d;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                b = ajgl.b(aragVar);
            }
            zag.m(this.q, charSequence);
            zag.m(this.W, b);
            this.l.setText(this.e.getResources().getString(R.string.inline_surveys_undo_selection));
            this.o.setVisibility(0);
            if (!z) {
                return;
            }
            zag.o(this.o, true);
            zag.o(this.p, true);
            if (!p(this.i)) {
                return;
            }
            zag.o(this.n, false);
        }
    }

    public final void o(int i) {
        if (i < 0) {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.ae[i2].c();
        }
        while (true) {
            mkx[] mkxVarArr = this.ae;
            if (i < mkxVarArr.length) {
                mkxVarArr[i].b();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.geq
    public final boolean oJ(geq geqVar) {
        return (geqVar instanceof mky) && ((mky) geqVar).R == this.R;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        ajrp ajrpVar = this.S;
        if (ajrpVar != null) {
            ajrpVar.c();
        }
        ajru ajruVar = this.T;
        if (ajruVar != null) {
            akel.k(ajruVar, ajsaVar);
            this.T = null;
        }
        ajru ajruVar2 = this.U;
        if (ajruVar2 != null) {
            akel.k(ajruVar2, ajsaVar);
            this.U = null;
        }
        ajru ajruVar3 = this.V;
        if (ajruVar3 != null) {
            akel.k(ajruVar3, ajsaVar);
            this.V = null;
        }
        this.af.qZ(ajsaVar);
        this.d.m(this);
        this.ag = null;
        this.R = null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ajru, geq] */
    @Override // defpackage.geq
    public final aynr oI(int i) {
        if (this.ag == null) {
            return aynr.f();
        }
        return this.af.oI(i);
    }
}
