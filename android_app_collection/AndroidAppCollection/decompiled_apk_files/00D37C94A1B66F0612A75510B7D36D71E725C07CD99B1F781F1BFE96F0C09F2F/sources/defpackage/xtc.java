package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xtc  reason: default package */
/* loaded from: classes4.dex */
public final class xtc implements ajru, xmf, xxw {
    private final ajyc A;
    private final ajxz B;
    private final xmh C;
    private final xxx D;
    private final xxp E;
    private final xtw F;
    private final xlw G;
    private final int H;
    private final int I;

    /* renamed from: J  reason: collision with root package name */
    private final int f271J;
    private final int K;
    private final int L;
    private final int M;
    private final int N;
    private final int O;
    private final int P;
    private final int Q;
    private final int R;
    private final int S;
    private final int T;
    private final int U;
    private final int V;
    private final int W;
    private final FrameLayout X;
    public final Context a;
    private ViewGroup aA;
    private ViewGroup aB;
    private View aC;
    private View aD;
    private FrameLayout aE;
    private FrameLayout aF;
    private FrameLayout aG;
    private FrameLayout aH;
    private TextView aI;
    private TextView aJ;
    private View aK;
    private final xxf aL;
    private final xxg aM;
    private View.OnAttachStateChangeListener aN;
    private final ajvq aO;
    private final SpannableStringBuilder aP;
    private final StringBuilder aQ;
    private ajrs aR;
    private final xyd aS;
    private final ajvo aT;
    private Animator aa;
    private final xtb ab;
    private final xtb ac;
    private final xtb ad;
    private View ae;
    private ImageView af;
    private xta ag;
    private TextView ah;
    private ViewGroup ai;
    private TextView aj;
    private ImageView ak;
    private TextView al;
    private TextView am;
    private ImageView an;
    private View ao;
    private ImageView ap;
    private TextView aq;
    private FrameLayout ar;
    private TextView as;
    private View at;
    private TextView au;
    private TextView av;
    private TextView aw;
    private View ax;
    private ImageView ay;
    private TextView az;
    public final xno b;
    public final akfc c;
    public final aafo d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public ViewTreeObserver.OnPreDrawListener l;
    public View m;
    public View n;
    public View o;
    public TextView p;
    public TextView q;
    public ViewGroup r;
    public ImageView s;
    public ImageView t;
    public ImageView u;
    public ImageView v;
    public ViewTreeObserver.OnScrollChangedListener w;
    public boolean x;
    public aqav y;
    private final ajmy z;
    public int j = 5;
    private boolean Y = false;
    private boolean Z = false;
    public boolean k = false;

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, ajsa] */
    public xtc(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, ajyi ajyiVar, xno xnoVar, akfc akfcVar, ajxz ajxzVar, xmh xmhVar, xxx xxxVar, xxp xxpVar, xtw xtwVar, xlw xlwVar, xxg xxgVar, xxt xxtVar, ajvm ajvmVar, zhe zheVar, xyd xydVar) {
        ajvq ajvqVar = new ajvq();
        this.aO = ajvqVar;
        this.aP = new SpannableStringBuilder();
        this.aQ = new StringBuilder();
        context.getClass();
        this.a = context;
        ajmyVar.getClass();
        this.z = ajmyVar;
        this.A = ajycVar;
        aafoVar.getClass();
        this.d = aafoVar;
        xnoVar.getClass();
        this.b = xnoVar;
        akfcVar.getClass();
        this.c = akfcVar;
        xmhVar.getClass();
        this.C = xmhVar;
        xxxVar.getClass();
        this.D = xxxVar;
        this.G = xlwVar;
        this.B = ajxzVar;
        xxgVar.getClass();
        this.aM = xxgVar;
        xxtVar.getClass();
        this.E = xxpVar;
        this.F = xtwVar;
        xydVar.getClass();
        this.aS = xydVar;
        xxpVar.a = aafoVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        LayoutInflater from = LayoutInflater.from(context);
        xtb D = D(from.inflate(R.layout.comment_infoline_above, (ViewGroup) frameLayout, false));
        this.ab = D;
        xtb D2 = D(from.inflate(R.layout.comment_infoline_below, (ViewGroup) frameLayout, false));
        this.ac = D2;
        xtb D3 = D(from.inflate(R.layout.backstage_post, (ViewGroup) frameLayout, false));
        this.ad = D3;
        this.aL = new xxf(context, ajyiVar.get());
        this.aT = new ajvo(context, ajvmVar, true, ajvqVar);
        Resources resources = context.getResources();
        TypedValue typedValue = new TypedValue();
        this.H = (context.getTheme() == null || !context.getTheme().resolveAttribute(16842829, typedValue, true) || typedValue.type != 5) ? 0 : (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        this.I = resources.getDimensionPixelSize(R.dimen.comment_layout_margin_left);
        this.f271J = resources.getDimensionPixelSize(R.dimen.reply_layout_margin_left);
        this.K = resources.getDimensionPixelSize(R.dimen.reply_layout_indented_margin_left);
        this.L = resources.getDimensionPixelSize(R.dimen.comment_action_button_tap_target_padding_x);
        this.e = resources.getDimensionPixelSize(R.dimen.comment_action_button_tap_target_padding_y);
        this.f = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_left);
        this.h = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_left_postv21);
        this.g = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_right);
        this.i = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_right_postv21);
        this.M = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_left_indented);
        this.N = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_right_indented);
        this.O = resources.getDimensionPixelSize(R.dimen.comment_avatar_size);
        this.P = resources.getDimensionPixelSize(R.dimen.reply_avatar_size);
        this.Q = resources.getDimensionPixelSize(R.dimen.comment_author_badge_size);
        this.R = resources.getDimensionPixelSize(R.dimen.comment_layout_padding_top);
        this.S = resources.getDimensionPixelSize(R.dimen.comment_layout_padding_top_highlighted_reply);
        this.T = zhn.j(context, R.attr.cmtBgStyleDefault).orElse(0);
        this.U = zhn.j(context, R.attr.cmtBgStyleGrey).orElse(0);
        this.V = zhn.j(context, zheVar.a).orElse(0);
        this.W = zhn.j(context, R.attr.ytTextSecondary).orElse(0);
        m(D, false);
        m(D2, false);
        m(D3, true);
    }

    private static final String A(aqav aqavVar) {
        apzl apzlVar = aqavVar.t;
        if (apzlVar == null) {
            apzlVar = apzl.a;
        }
        apzk apzkVar = apzlVar.c;
        if (apzkVar == null) {
            apzkVar = apzk.a;
        }
        aqjj aqjjVar = apzkVar.f;
        if (aqjjVar == null) {
            aqjjVar = aqjj.a;
        }
        aqji aqjiVar = aqjjVar.c;
        if (aqjiVar == null) {
            aqjiVar = aqji.a;
        }
        if (!aqjiVar.g || aqjiVar.h) {
            return "";
        }
        aovs aovsVar = aqjiVar.k;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        if ((aovsVar.b & 1) == 0) {
            return "";
        }
        aovs aovsVar2 = aqjiVar.k;
        if (aovsVar2 == null) {
            aovsVar2 = aovs.a;
        }
        aovr aovrVar = aovsVar2.c;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        return aovrVar.c;
    }

    private static final aqap B(aqav aqavVar) {
        aqaq aqaqVar = aqavVar.v;
        if (aqaqVar == null) {
            aqaqVar = aqaq.a;
        }
        if ((aqaqVar.b & 1) != 0) {
            aqaq aqaqVar2 = aqavVar.v;
            if (aqaqVar2 == null) {
                aqaqVar2 = aqaq.a;
            }
            aqap aqapVar = aqaqVar2.c;
            return aqapVar == null ? aqap.a : aqapVar;
        }
        return null;
    }

    private static final apoj C(aqav aqavVar) {
        apzl apzlVar = aqavVar.t;
        if (apzlVar == null) {
            apzlVar = apzl.a;
        }
        apzk apzkVar = apzlVar.c;
        if (apzkVar == null) {
            apzkVar = apzk.a;
        }
        apok apokVar = apzkVar.e;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) != 0) {
            apok apokVar2 = apzkVar.e;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar = apokVar2.c;
            return apojVar == null ? apoj.a : apojVar;
        }
        return null;
    }

    private static final xtb D(View view) {
        xtb xtbVar = new xtb();
        xtbVar.a = view;
        xtbVar.g = (TextView) view.findViewById(R.id.comment_author);
        xtbVar.d = view.findViewById(R.id.left_margin);
        xtbVar.e = (ImageView) view.findViewById(R.id.comment_avatar);
        xtbVar.h = (TextView) view.findViewById(R.id.comment_content);
        xtbVar.i = (TextView) view.findViewById(R.id.comment_expand_button);
        xtbVar.j = (ViewGroup) view.findViewById(R.id.action_toolbar);
        xtbVar.l = (ViewGroup) view.findViewById(R.id.moderation_toolbar);
        xtbVar.m = (ImageView) view.findViewById(R.id.comment_approve_button);
        xtbVar.n = (ImageView) view.findViewById(R.id.comment_remove_button);
        xtbVar.o = (ImageView) view.findViewById(R.id.comment_report_button);
        xtbVar.p = (ImageView) view.findViewById(R.id.comment_ban_button);
        xtbVar.q = (TextView) view.findViewById(R.id.comment_timestamp);
        xtbVar.r = (ImageView) view.findViewById(R.id.pinned_comment_icon);
        xtbVar.s = (TextView) view.findViewById(R.id.pinned_comment_label);
        xtbVar.t = (TextView) view.findViewById(R.id.linked_comment_badge);
        xtbVar.u = (ImageView) view.findViewById(R.id.comment_sponsor_badge);
        xtbVar.v = view.findViewById(R.id.sponsors_only_badge);
        xtbVar.x = (TextView) view.findViewById(R.id.sponsors_only_badge_text);
        xtbVar.w = (ImageView) view.findViewById(R.id.sponsors_only_badge_icon);
        xtbVar.M = (FrameLayout) view.findViewById(R.id.backstage_image);
        xtbVar.N = (FrameLayout) view.findViewById(R.id.backstage_playlist);
        xtbVar.O = (FrameLayout) view.findViewById(R.id.backstage_video);
        xtbVar.P = (FrameLayout) view.findViewById(R.id.creator_reply);
        xtbVar.L = (TextView) view.findViewById(R.id.replies_metadata);
        xtbVar.k = (TextView) view.findViewById(R.id.creator_stories_reply);
        xtbVar.y = (FrameLayout) view.findViewById(R.id.comment_poll);
        xtbVar.H = (ViewGroup) view.findViewById(R.id.comment_info_line);
        xtbVar.I = (ViewGroup) view.findViewById(R.id.comment_poll_info_line);
        xtbVar.z = (TextView) view.findViewById(R.id.comment_poll_author);
        xtbVar.A = view.findViewById(R.id.poll_info_line_separator);
        xtbVar.D = (TextView) view.findViewById(R.id.comment_poll_timestamp);
        xtbVar.B = (TextView) view.findViewById(R.id.comment_poll_votes_total);
        xtbVar.C = (TextView) view.findViewById(R.id.comment_poll_voting_status);
        xtbVar.E = view.findViewById(R.id.sponsors_only_badge_poll);
        xtbVar.G = (TextView) view.findViewById(R.id.sponsors_only_badge_text_poll);
        xtbVar.F = (ImageView) view.findViewById(R.id.sponsors_only_badge_icon_poll);
        xtbVar.K = view.findViewById(R.id.comment_poll_separator2);
        xtbVar.f270J = view.findViewById(R.id.comment_info_line_separator);
        xtbVar.Q = view.findViewById(R.id.comment_divider);
        xtbVar.b = view.findViewById(R.id.action_menu_anchor);
        xtbVar.c = view.findViewById(R.id.top_action_menu_anchor);
        return xtbVar;
    }

    private final void E(aqav aqavVar, boolean z) {
        aufe aufeVar;
        boolean z2;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        aufe aufeVar2;
        this.ar.removeAllViews();
        xxx xxxVar = this.D;
        aplq aplqVar = aqavVar.B;
        if (aplqVar == null) {
            aplqVar = aplq.a;
        }
        if (aplqVar.b == 99391126) {
            aplq aplqVar2 = aqavVar.B;
            if (aplqVar2 == null) {
                aplqVar2 = aplq.a;
            }
            if (aplqVar2.b == 99391126) {
                aufeVar2 = (aufe) aplqVar2.c;
            } else {
                aufeVar2 = aufe.a;
            }
            aufeVar = aufeVar2;
        } else {
            aufeVar = null;
        }
        aufe aufeVar3 = aufeVar == null ? null : (aufe) xxxVar.e(xxx.n(aqavVar.i), aufeVar, aufe.class, aufeVar.k, z);
        int i = 8;
        if (aufeVar3 != null) {
            this.ar.addView(this.aL.c(this.aL.d(this.aR), aufeVar3));
            TextView textView = this.av;
            if ((aufeVar3.b & 64) != 0) {
                aragVar = aufeVar3.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
            TextView textView2 = this.au;
            if ((aufeVar3.b & 32) != 0) {
                aragVar2 = aufeVar3.h;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            textView2.setText(ajgl.b(aragVar2));
            TextView textView3 = this.aw;
            if ((aqavVar.b & 262144) != 0) {
                aragVar3 = aqavVar.r;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            textView3.setText(ajgl.b(aragVar3));
            if ((aqavVar.b & 32) != 0) {
                aragVar4 = aqavVar.k;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
            } else {
                aragVar4 = null;
            }
            Spanned b = ajgl.b(aragVar4);
            if (TextUtils.isEmpty(b)) {
                this.as.setText("");
                this.as.setVisibility(8);
                View view = this.at;
                if (view != null) {
                    view.setVisibility(8);
                }
            } else {
                this.as.setText(b);
                this.as.setVisibility(0);
                apzp apzpVar = aqavVar.w;
                if (apzpVar == null) {
                    apzpVar = apzp.a;
                }
                apzn apznVar = apzpVar.d;
                if (apznVar == null) {
                    apznVar = apzn.a;
                }
                if ((apznVar.b & 1) != 0) {
                    arhs arhsVar = apznVar.c;
                    if (arhsVar == null) {
                        arhsVar = arhs.a;
                    }
                    arhr b2 = arhr.b(arhsVar.c);
                    if (b2 == null) {
                        b2 = arhr.UNKNOWN;
                    }
                    if (b2 != arhr.CHECK) {
                        Resources resources = this.a.getResources();
                        ajxz ajxzVar = this.B;
                        arhs arhsVar2 = apznVar.c;
                        if (arhsVar2 == null) {
                            arhsVar2 = arhs.a;
                        }
                        arhr b3 = arhr.b(arhsVar2.c);
                        if (b3 == null) {
                            b3 = arhr.UNKNOWN;
                        }
                        Drawable drawable = resources.getDrawable(ajxzVar.a(b3));
                        drawable.setBounds(0, 0, 50, 50);
                        this.as.setCompoundDrawablesRelative(null, null, drawable, null);
                        this.as.setCompoundDrawablePadding(this.a.getResources().getDimensionPixelSize(R.dimen.comment_author_text_icon_gap));
                    }
                }
                View view2 = this.at;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
            View view3 = this.aD;
            if (view3 != null) {
                view3.setVisibility(this.av.getText().length() > 0 ? 0 : 8);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        FrameLayout frameLayout = this.ar;
        int i2 = true != z2 ? 8 : 0;
        frameLayout.setVisibility(i2);
        this.aB.setVisibility(i2);
        ViewGroup viewGroup = this.aA;
        if (true != z2) {
            i = 0;
        }
        viewGroup.setVisibility(i);
    }

    private static final boolean G(ajrs ajrsVar) {
        return !ajrsVar.j("ignoreIndentedComment", false) && ajrsVar.j("indentedComment", false);
    }

    private static final String H(aqav aqavVar) {
        apoj C = C(aqavVar);
        if (C != null) {
            arag aragVar = C.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            arah arahVar = aragVar.f;
            if (arahVar == null) {
                arahVar = arah.a;
            }
            aovr aovrVar = arahVar.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            return aovrVar.c;
        }
        return "";
    }

    private final String k(aqav aqavVar) {
        apzp apzpVar = aqavVar.w;
        if (apzpVar == null) {
            apzpVar = apzp.a;
        }
        apzn apznVar = apzpVar.d;
        if (apznVar == null) {
            apznVar = apzn.a;
        }
        arag aragVar = apznVar.e;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        arah arahVar = aragVar.f;
        if (arahVar == null) {
            arahVar = arah.a;
        }
        if ((arahVar.b & 1) != 0) {
            apzp apzpVar2 = aqavVar.w;
            if (apzpVar2 == null) {
                apzpVar2 = apzp.a;
            }
            apzn apznVar2 = apzpVar2.d;
            if (apznVar2 == null) {
                apznVar2 = apzn.a;
            }
            arag aragVar2 = apznVar2.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            arah arahVar2 = aragVar2.f;
            if (arahVar2 == null) {
                arahVar2 = arah.a;
            }
            aovr aovrVar = arahVar2.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            return aovrVar.c;
        }
        return this.ah.getText().toString();
    }

    private final void l(StringBuilder sb, aqav aqavVar) {
        aufe aufeVar;
        arag aragVar;
        aplq aplqVar = aqavVar.B;
        if (aplqVar == null) {
            aplqVar = aplq.a;
        }
        if (aplqVar.b == 99391126) {
            aplq aplqVar2 = aqavVar.B;
            if (aplqVar2 == null) {
                aplqVar2 = aplq.a;
            }
            if (aplqVar2.b == 99391126) {
                aufeVar = (aufe) aplqVar2.c;
            } else {
                aufeVar = aufe.a;
            }
            sb.append(this.au.getText().toString());
            sb.append(". ");
            for (aufc aufcVar : aufeVar.f) {
                arag aragVar2 = null;
                if ((aufcVar.b & 1) != 0) {
                    aragVar = aufcVar.c;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                sb.append((CharSequence) ajgl.b(aragVar));
                sb.append(". ");
                if ((aufcVar.b & 32) != 0 && (aragVar2 = aufcVar.g) == null) {
                    aragVar2 = arag.a;
                }
                Spanned b = ajgl.b(aragVar2);
                if (!TextUtils.isEmpty(b)) {
                    sb.append((CharSequence) b);
                    sb.append(". ");
                }
            }
        }
    }

    private final void m(xtb xtbVar, boolean z) {
        View view = xtbVar.a;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new xsv(this, xtbVar, z, view));
    }

    private final void n(aqav aqavVar, acti actiVar, Map map, boolean z) {
        apzk apzkVar;
        int i;
        Map map2;
        TextView textView;
        ImageView imageView;
        aqav aqavVar2;
        xxp xxpVar;
        ImageView imageView2;
        apos aposVar;
        ImageView imageView3;
        arag aragVar;
        apzl apzlVar = aqavVar.t;
        if (apzlVar == null) {
            apzlVar = apzl.a;
        }
        if ((apzlVar.b & 1) == 0 || B(aqavVar) != null) {
            this.ai.setVisibility(8);
            return;
        }
        apzl apzlVar2 = aqavVar.t;
        if (apzlVar2 == null) {
            apzlVar2 = apzl.a;
        }
        apzk apzkVar2 = apzlVar2.c;
        if (apzkVar2 == null) {
            apzkVar2 = apzk.a;
        }
        apzk apzkVar3 = apzkVar2;
        t(apzkVar3, map);
        xxp xxpVar2 = this.E;
        aqav aqavVar3 = this.y;
        xta xtaVar = this.ag;
        ImageView imageView4 = (ImageView) xtaVar.b;
        ImageView imageView5 = (ImageView) xtaVar.d;
        TextView textView2 = xtaVar.c;
        Map map3 = this.Y ? xxpVar2.f : xxpVar2.e;
        apos b = xxpVar2.b.b(aqavVar3.i, apzkVar3, z);
        apos a = xxpVar2.b.a(aqavVar3.i, apzkVar3, z);
        if (b == null || a == null) {
            apzkVar = apzkVar3;
            imageView4.setVisibility(4);
            imageView4.setClickable(false);
            textView2.setVisibility(4);
            imageView5.setVisibility(4);
            imageView5.setClickable(false);
        } else {
            xxp.c(b, imageView4, textView2, map3);
            xxp.a(a, imageView5, map3);
            if ((b.b & 1024) != 0) {
                if ((aqavVar3.b & 2097152) != 0) {
                    aragVar = aqavVar3.s;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                textView2.setText(ajgl.b(aragVar));
                imageView4.setOnClickListener(new xxn(xxpVar2, b, map, 1));
                aposVar = a;
                map2 = map3;
                textView = textView2;
                imageView = imageView5;
                imageView2 = imageView4;
                aqavVar2 = aqavVar3;
                xxpVar = xxpVar2;
                apzkVar = apzkVar3;
            } else {
                map2 = map3;
                textView = textView2;
                imageView = imageView5;
                aqavVar2 = aqavVar3;
                xxpVar = xxpVar2;
                apzkVar = apzkVar3;
                imageView2 = imageView4;
                imageView2.setOnClickListener(new xxm(xxpVar2, aqavVar3, apzkVar3, z, actiVar, map, imageView4, textView, map2, imageView, 1));
                aposVar = a;
            }
            if ((aposVar.b & 1024) == 0) {
                imageView3 = imageView;
                imageView3.setOnClickListener(new xxm(xxpVar, aqavVar2, apzkVar, z, actiVar, map, imageView2, textView, map2, imageView));
            } else {
                ImageView imageView6 = imageView;
                imageView6.setOnClickListener(new xxn(xxpVar, aposVar, map));
                imageView3 = imageView6;
            }
            imageView2.setVisibility(0);
            textView.setVisibility(0);
            imageView3.setVisibility(0);
        }
        if (!aqavVar.I) {
            xtw xtwVar = this.F;
            View view = this.m;
            xta xtaVar2 = this.ag;
            xtwVar.a(view, xtaVar2.f, xtaVar2.e, xtaVar2.g, xtaVar2.h, aqavVar.i, apzkVar, actiVar, map, z);
        }
        s(apzkVar, actiVar, map);
        int i2 = 0;
        while (true) {
            if (i2 >= this.ai.getChildCount()) {
                i = 8;
                break;
            } else if (this.ai.getChildAt(i2).getVisibility() == 0) {
                i = 0;
                break;
            } else {
                i2++;
            }
        }
        this.ai.setVisibility(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o(defpackage.aqav r11, final defpackage.acti r12, java.lang.Object r13) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L1c
            ates r1 = r11.u
            if (r1 != 0) goto L9
            ates r1 = defpackage.ates.a
        L9:
            int r1 = r1.b
            r1 = r1 & 1
            if (r1 == 0) goto L1c
            ates r11 = r11.u
            if (r11 != 0) goto L15
            ates r11 = defpackage.ates.a
        L15:
            atep r11 = r11.c
            if (r11 != 0) goto L1d
            atep r11 = defpackage.atep.a
            goto L1d
        L1c:
            r11 = r0
        L1d:
            boolean r1 = r10.k
            r2 = 8
            if (r1 == 0) goto L2b
            android.view.View r1 = r10.o
            android.view.View r3 = r10.n
            r3.setVisibility(r2)
            goto L34
        L2b:
            android.view.View r1 = r10.n
            android.view.View r3 = r10.o
            if (r3 == 0) goto L34
            r3.setVisibility(r2)
        L34:
            r6 = r1
            r1 = 3
            r3 = 2131427742(0x7f0b019e, float:1.8477109E38)
            zfx r1 = defpackage.zgd.d(r1, r3)
            java.lang.Class<android.widget.RelativeLayout$LayoutParams> r3 = android.widget.RelativeLayout.LayoutParams.class
            defpackage.zgd.t(r6, r1, r3)
            if (r11 != 0) goto L45
            goto L46
        L45:
            r2 = 0
        L46:
            r6.setVisibility(r2)
            if (r11 != 0) goto L4e
            r11 = r0
            r1 = r11
            goto L54
        L4e:
            aovs r1 = r11.i
            if (r1 != 0) goto L54
            aovs r1 = defpackage.aovs.a
        L54:
            F(r6, r1)
            ajyc r4 = r10.A
            android.view.View r5 = r10.m
            r7 = r11
            r8 = r13
            r9 = r12
            r4.e(r5, r6, r7, r8, r9)
            boolean r13 = r10.x
            if (r13 == 0) goto L71
            android.view.View r11 = r10.m
            android.view.ViewTreeObserver r11 = r11.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r12 = r10.w
            r11.removeOnScrollChangedListener(r12)
            return
        L71:
            if (r11 == 0) goto L8e
            int r13 = r11.b
            r13 = r13 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L8e
            atel r13 = r11.h
            if (r13 != 0) goto L7f
            atel r13 = defpackage.atel.a
        L7f:
            int r0 = r13.b
            r1 = 102716411(0x61f53fb, float:2.9966275E-35)
            if (r0 != r1) goto L8c
            java.lang.Object r13 = r13.c
            r0 = r13
            argj r0 = (defpackage.argj) r0
            goto L8e
        L8c:
            argj r0 = defpackage.argj.a
        L8e:
            if (r0 != 0) goto L91
            goto La7
        L91:
            xsu r13 = new xsu
            r13.<init>()
            r10.w = r13
            boolean r11 = r10.x
            if (r11 != 0) goto La7
            android.view.View r11 = r10.m
            android.view.ViewTreeObserver r11 = r11.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r12 = r10.w
            r11.addOnScrollChangedListener(r12)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xtc.o(aqav, acti, java.lang.Object):void");
    }

    private final void p(aqav aqavVar) {
        arag aragVar;
        apzo apzoVar;
        arag aragVar2;
        arag aragVar3;
        apmy apmyVar;
        Drawable drawable;
        TextView textView = this.aj;
        apzs apzsVar = null;
        if ((aqavVar.b & 262144) != 0) {
            aragVar = aqavVar.r;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        if ((aqavVar.b & 32) == 0) {
            this.ah.setVisibility(8);
            View view = this.aC;
            if (view != null) {
                view.setVisibility(8);
            }
        } else {
            TextView textView2 = this.ah;
            aqav aqavVar2 = this.y;
            if ((aqavVar2.b & 32) != 0) {
                aragVar2 = aqavVar2.k;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            textView2.setText(ajgl.b(aragVar2));
            this.ah.setTextColor(this.W);
            this.ah.setBackgroundColor(this.T);
            this.ah.setBackgroundDrawable(null);
            this.ah.setPadding(0, 0, 0, 0);
            this.ah.setCompoundDrawablePadding(0);
            kz.u(this.ah, null, null, null);
            apzp apzpVar = aqavVar.w;
            if (apzpVar == null) {
                apzpVar = apzp.a;
            }
            if ((apzpVar.b & 2) != 0) {
                apzp apzpVar2 = aqavVar.w;
                if (apzpVar2 == null) {
                    apzpVar2 = apzp.a;
                }
                apzn apznVar = apzpVar2.d;
                if (apznVar == null) {
                    apznVar = apzn.a;
                }
                if ((apznVar.b & 8) != 0) {
                    aragVar3 = apznVar.e;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                } else {
                    aragVar3 = null;
                }
                Spanned b = ajgl.b(aragVar3);
                if (!TextUtils.isEmpty(b)) {
                    this.ah.setText(b);
                }
                int i = apznVar.b;
                if ((i & 32) != 0) {
                    zai zaiVar = new zai(zhn.d(this.a, R.attr.ytVerifiedBadgeBackground));
                    zaiVar.b(4, 1, zai.a(this.ah.getTextSize(), 1) + 4, 1);
                    this.ah.setBackground(zaiVar);
                    this.ah.setTextColor(zhn.d(this.a, R.attr.ytTextPrimary));
                } else if ((i & 4) != 0) {
                    apzo apzoVar2 = apznVar.d;
                    if (apzoVar2 == null) {
                        apzoVar2 = apzo.a;
                    }
                    if (apzoVar2.b == 118483990) {
                        apmyVar = (apmy) apzoVar2.c;
                    } else {
                        apmyVar = apmy.a;
                    }
                    Drawable drawable2 = this.a.getResources().getDrawable(R.drawable.comment_author_highlight);
                    drawable2.setColorFilter(apmyVar.c, PorterDuff.Mode.SRC_IN);
                    this.ah.setBackgroundDrawable(drawable2);
                    this.ah.setTextColor(apmyVar.d);
                }
                int currentTextColor = this.ah.getCurrentTextColor();
                if ((apznVar.b & 1) != 0) {
                    arhs arhsVar = apznVar.c;
                    if (arhsVar == null) {
                        arhsVar = arhs.a;
                    }
                    arhr b2 = arhr.b(arhsVar.c);
                    if (b2 == null) {
                        b2 = arhr.UNKNOWN;
                    }
                    arhr arhrVar = arhr.CHECK;
                    int i2 = R.dimen.comment_author_text_verified_icon_gap;
                    if (b2 == arhrVar) {
                        drawable = this.a.getResources().getDrawable(2131231374);
                    } else {
                        arhs arhsVar2 = apznVar.c;
                        if (arhsVar2 == null) {
                            arhsVar2 = arhs.a;
                        }
                        arhr b3 = arhr.b(arhsVar2.c);
                        if (b3 == null) {
                            b3 = arhr.UNKNOWN;
                        }
                        if (b3 == arhr.CHECK_CIRCLE_THICK) {
                            drawable = this.a.getResources().getDrawable(2131232420);
                        } else {
                            Resources resources = this.a.getResources();
                            ajxz ajxzVar = this.B;
                            arhs arhsVar3 = apznVar.c;
                            if (arhsVar3 == null) {
                                arhsVar3 = arhs.a;
                            }
                            arhr b4 = arhr.b(arhsVar3.c);
                            if (b4 == null) {
                                b4 = arhr.UNKNOWN;
                            }
                            drawable = resources.getDrawable(ajxzVar.a(b4));
                            i2 = R.dimen.comment_author_text_icon_gap;
                        }
                    }
                    int i3 = this.Q;
                    drawable.setBounds(0, 0, i3, i3);
                    if (currentTextColor != -16777216) {
                        drawable.setColorFilter(currentTextColor, PorterDuff.Mode.SRC_IN);
                    }
                    this.ah.setCompoundDrawablesRelative(null, null, drawable, null);
                    this.ah.setCompoundDrawablePadding(this.a.getResources().getDimensionPixelSize(i2));
                }
            }
            this.ah.setVisibility(0);
            View view2 = this.aC;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        this.an.setVisibility(8);
        apzp apzpVar3 = aqavVar.y;
        if (apzpVar3 == null) {
            apzpVar3 = apzp.a;
        }
        if ((apzpVar3.b & 4) != 0) {
            apzp apzpVar4 = aqavVar.y;
            if (apzpVar4 == null) {
                apzpVar4 = apzp.a;
            }
            apzr apzrVar = apzpVar4.e;
            if (apzrVar == null) {
                apzrVar = apzr.a;
            }
            int i4 = apzrVar.c;
            if (i4 == 4) {
                ImageView imageView = this.an;
                imageView.setColorFilter((ColorFilter) null);
                this.z.e(imageView);
                this.z.h(imageView, (avhn) apzrVar.d);
            } else {
                ImageView imageView2 = this.an;
                arhs arhsVar4 = i4 == 1 ? (arhs) apzrVar.d : null;
                if ((apzrVar.b & 8) != 0) {
                    apzoVar = apzrVar.f;
                    if (apzoVar == null) {
                        apzoVar = apzo.a;
                    }
                } else {
                    apzoVar = null;
                }
                v(imageView2, arhsVar4, apzoVar, R.attr.cmtSponsorBadgeBackground);
            }
            this.an.setVisibility(0);
        }
        apzp apzpVar5 = aqavVar.z;
        if (apzpVar5 == null) {
            apzpVar5 = apzp.a;
        }
        if ((apzpVar5.b & 8) != 0) {
            apzp apzpVar6 = aqavVar.z;
            if (apzpVar6 == null) {
                apzpVar6 = apzp.a;
            }
            apzsVar = apzpVar6.f;
            if (apzsVar == null) {
                apzsVar = apzs.a;
            }
        }
        y(apzsVar, this.ao, this.aq, this.ap);
        y(apzsVar, this.ax, this.az, this.ay);
    }

    private final void q(aqav aqavVar, boolean z) {
        arag aragVar = aqavVar.p;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        Spanned a = aafv.a(aragVar, this.d, false);
        if (!TextUtils.isEmpty(a) || (aqavVar.c & 256) == 0) {
            this.p.setVisibility(0);
            this.aP.clear();
            this.aQ.setLength(0);
            if (TextUtils.isEmpty(a)) {
                this.p.setText((CharSequence) null);
            } else {
                this.aP.append((CharSequence) a);
                this.aQ.append((CharSequence) a);
                ajvo ajvoVar = this.aT;
                arag aragVar2 = aqavVar.p;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                ajvoVar.g(aragVar2, a, this.aP, this.aQ, aqavVar, this.p.getId());
                this.p.setText(this.aP);
            }
            this.p.setMaxLines(z ? this.j : Integer.MAX_VALUE);
            return;
        }
        this.p.setVisibility(8);
    }

    private final void r(aqav aqavVar) {
        if (this.aS.a(aqavVar) == null) {
            this.aH.setVisibility(8);
            if (C(aqavVar) == null) {
                return;
            }
            x(true);
            return;
        }
        aqav a = this.aS.a(aqavVar);
        ajrs d = this.aL.d(this.aR);
        d.f("creatorReplyParentComment", this.y);
        d.f("indentedComment", true);
        this.aH.addView(this.aL.c(d, a), 0);
        this.aH.setVisibility(0);
        x(false);
    }

    private final void s(apzk apzkVar, acti actiVar, Map map) {
        if ((apzkVar.b & 32768) != 0) {
            aunb aunbVar = apzkVar.g;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            apoj apojVar = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
            View view = this.ag.k;
            aovs aovsVar = apojVar.s;
            if (aovsVar == null) {
                aovsVar = aovs.a;
            }
            F(view, aovsVar);
            if (this.k) {
                TextView textView = (TextView) this.ag.k.findViewById(R.id.comment_action_toolbar_create_story_text);
                arag aragVar = apojVar.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                textView.setText(ajgl.b(aragVar));
            }
            this.ag.k.setOnClickListener(new xsp(this, apojVar, actiVar, map, 1));
            this.ag.k.setVisibility(0);
            actiVar.n(new acte(apojVar.t));
        }
    }

    private final void t(apzk apzkVar, final Map map) {
        final apoj apojVar;
        CharSequence charSequence;
        apok apokVar = apzkVar.e;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        arag aragVar = null;
        if ((apokVar.b & 1) != 0) {
            apok apokVar2 = apzkVar.e;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
        } else {
            apojVar = null;
        }
        if (apojVar == null) {
            x(false);
            return;
        }
        TextView textView = this.ag.j;
        String str = "";
        if (textView != null) {
            int i = apojVar.b & 256;
            if (i != 0) {
                if (i != 0 && (aragVar = apojVar.i) == null) {
                    aragVar = arag.a;
                }
                charSequence = ajgl.b(aragVar);
            } else {
                charSequence = str;
            }
            textView.setText(charSequence);
        }
        View view = this.ag.i;
        if ((apojVar.b & 65536) != 0) {
            aovr aovrVar = apojVar.r;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            str = aovrVar.c;
        }
        view.setContentDescription(str);
        this.ag.i.setOnClickListener(new View.OnClickListener() { // from class: xsq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                xtc xtcVar = xtc.this;
                apoj apojVar2 = apojVar;
                Map map2 = map;
                if ((apojVar2.b & 16384) != 0) {
                    aafo aafoVar = xtcVar.d;
                    apzg apzgVar = apojVar2.o;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, map2);
                }
            }
        });
        x(true);
    }

    private final void u() {
        View view;
        ViewGroup viewGroup;
        TextView textView = this.p;
        if (textView != null) {
            textView.setText((CharSequence) null);
            if (this.l != null) {
                this.p.getViewTreeObserver().removeOnPreDrawListener(this.l);
                this.l = null;
            }
        }
        TextView textView2 = this.q;
        if (textView2 != null) {
            textView2.setOnClickListener(null);
        }
        xta xtaVar = this.ag;
        if (xtaVar != null && (viewGroup = xtaVar.a) != null) {
            viewGroup.setVisibility(8);
        }
        View view2 = this.o;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        xta xtaVar2 = this.ag;
        if (xtaVar2 == null || (view = xtaVar2.k) == null) {
            return;
        }
        view.setVisibility(8);
    }

    private final void v(ImageView imageView, arhs arhsVar, apzo apzoVar, int i) {
        arhr arhrVar;
        int orElse;
        if (arhsVar != null) {
            arhrVar = arhr.b(arhsVar.c);
            if (arhrVar == null) {
                arhrVar = arhr.UNKNOWN;
            }
        } else {
            arhrVar = arhr.SPONSORSHIPS;
        }
        imageView.setImageResource(this.B.a(arhrVar));
        if (apzoVar == null || apzoVar.b != 118483990) {
            orElse = zhn.j(this.a, i).orElse(0);
        } else {
            orElse = ((apmy) apzoVar.c).e;
        }
        imageView.setColorFilter(orElse);
    }

    private final void w() {
        TextView textView = this.ag.j;
        if (textView != null && textView.getVisibility() != 0) {
            this.ag.j.setVisibility(4);
        }
        View view = this.ag.d;
        int i = this.f;
        int i2 = this.e;
        yce.f(view, i, i2, this.g, i2);
    }

    private final void x(boolean z) {
        int i = true != z ? 4 : 0;
        View view = this.ag.i;
        view.setVisibility(i);
        view.setClickable(z);
        TextView textView = this.ag.j;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    private final void y(apzs apzsVar, final View view, TextView textView, ImageView imageView) {
        arag aragVar;
        arhs arhsVar;
        apzo apzoVar;
        if (view == null) {
            return;
        }
        if (apzsVar == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        arag aragVar2 = null;
        if ((apzsVar.b & 2) != 0) {
            aragVar = apzsVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        if ((apzsVar.b & 1) != 0) {
            arhsVar = apzsVar.c;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
        } else {
            arhsVar = null;
        }
        if ((apzsVar.b & 4) != 0) {
            apzoVar = apzsVar.e;
            if (apzoVar == null) {
                apzoVar = apzo.a;
            }
        } else {
            apzoVar = null;
        }
        v(imageView, arhsVar, apzoVar, R.attr.cmtSponsorsOnlyBadge);
        view.setOnClickListener(null);
        if ((apzsVar.b & 2) != 0 && (aragVar2 = apzsVar.d) == null) {
            aragVar2 = arag.a;
        }
        view.setContentDescription(ajgl.i(aragVar2));
        if ((apzsVar.b & 8) == 0) {
            return;
        }
        arag aragVar3 = apzsVar.f;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        final String obj = ajgl.b(aragVar3).toString();
        if (((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: xst
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                xtc xtcVar = xtc.this;
                String str = obj;
                View view3 = view;
                xtcVar.b.a(str, zhn.j(xtcVar.a, R.attr.cmtCreatorHeartTooltipBg).orElse(0), view3);
            }
        });
    }

    private final boolean z(apok apokVar, ImageView imageView, acti actiVar, Map map) {
        apoj apojVar = apokVar.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        if ((apojVar.b & 32) == 0) {
            imageView.setVisibility(4);
            imageView.setOnClickListener(null);
            return false;
        }
        Resources resources = this.a.getResources();
        ajxz ajxzVar = this.B;
        arhs arhsVar = apojVar.g;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        arhr b = arhr.b(arhsVar.c);
        if (b == null) {
            b = arhr.UNKNOWN;
        }
        Drawable drawable = resources.getDrawable(ajxzVar.a(b));
        boolean z = apojVar.h;
        drawable.setTint(zhn.j(this.a, z ? R.attr.ytTextDisabled : R.attr.ytTextPrimary).orElse(0));
        imageView.setImageDrawable(drawable);
        imageView.setEnabled(!z);
        imageView.setVisibility(0);
        aovs aovsVar = apojVar.s;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        F(imageView, aovsVar);
        imageView.setOnClickListener(new xsp(this, apojVar, actiVar, map));
        return true;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.X;
    }

    @Override // defpackage.xmf
    public final void d(aqav aqavVar) {
        this.aL.e(this.aH);
        r(aqavVar);
    }

    final void e(aqav aqavVar) {
        this.Y = false;
        this.Z = false;
        this.X.removeAllViews();
        xtb xtbVar = this.ac;
        if (aqavVar.L.size() > 0) {
            for (aqau aqauVar : aqavVar.L) {
                int i = alwb.i(aqauVar.b);
                if (i == 0) {
                    i = 1;
                }
                int i2 = i - 1;
                if (i2 == 1) {
                    this.Y = true;
                    xtbVar = this.ad;
                } else if (i2 == 5) {
                    this.Z = true;
                    xtbVar = this.ab;
                }
            }
        }
        View view = xtbVar.a;
        this.ag = new xta();
        if (aqavVar != null && (aqavVar.c & 1048576) != 0) {
            aqay aqayVar = aqavVar.f93J;
            if (aqayVar == null) {
                aqayVar = aqay.a;
            }
            int f = aqgn.f(aqayVar.b);
            if (f != 0 && f == 7) {
                this.k = true;
                if (view.findViewById(R.id.action_toolbar_with_labels) == null) {
                    ViewStub viewStub = (ViewStub) view.findViewById(R.id.action_toolbar_with_labels_stub);
                    viewStub.setLayoutResource(R.layout.comment_action_toolbar_with_labels);
                    viewStub.inflate();
                }
                View findViewById = view.findViewById(R.id.action_toolbar_with_labels);
                this.ag.a = (ViewGroup) view.findViewById(R.id.action_toolbar_with_labels);
                this.ag.b = view.findViewById(R.id.comment_action_toolbar_like);
                this.ag.c = (TextView) view.findViewById(R.id.comment_action_toolbar_like_text);
                this.ag.d = view.findViewById(R.id.comment_action_toolbar_dislike);
                this.ag.e = (ViewGroup) findViewById.findViewById(R.id.comment_action_toolbar_creator_heart);
                this.ag.f = (ImageView) findViewById.findViewById(R.id.comment_heart_button);
                this.ag.g = (ImageView) findViewById.findViewById(R.id.comment_creator_hearted_badge_avatar);
                this.ag.h = (ImageView) findViewById.findViewById(R.id.comment_avatar_heart_overlay);
                this.ag.i = view.findViewById(R.id.comment_action_toolbar_reply);
                this.ag.j = (TextView) view.findViewById(R.id.comment_action_toolbar_reply_text);
                this.ag.k = view.findViewById(R.id.comment_action_toolbar_create_story);
                xtbVar.f = this.ag;
                m(xtbVar, this.Y);
                this.m = xtbVar.a;
                this.af = xtbVar.e;
                this.ah = xtbVar.g;
                this.ae = xtbVar.d;
                this.p = xtbVar.h;
                this.q = xtbVar.i;
                this.aI = xtbVar.k;
                this.ai = xtbVar.j;
                this.r = xtbVar.l;
                this.s = xtbVar.m;
                this.t = xtbVar.n;
                this.u = xtbVar.o;
                this.v = xtbVar.p;
                this.aj = xtbVar.q;
                this.ak = xtbVar.r;
                this.al = xtbVar.s;
                this.am = xtbVar.t;
                this.an = xtbVar.u;
                this.ao = xtbVar.v;
                this.aq = xtbVar.x;
                this.ap = xtbVar.w;
                this.aE = xtbVar.M;
                this.aF = xtbVar.N;
                this.aG = xtbVar.O;
                this.aH = xtbVar.P;
                this.ar = xtbVar.y;
                this.as = xtbVar.z;
                this.at = xtbVar.A;
                this.aA = xtbVar.H;
                this.aB = xtbVar.I;
                this.aw = xtbVar.D;
                this.au = xtbVar.B;
                this.av = xtbVar.C;
                this.ax = xtbVar.E;
                this.ay = xtbVar.F;
                this.az = xtbVar.G;
                this.aD = xtbVar.K;
                this.aC = xtbVar.f270J;
                this.aJ = xtbVar.L;
                this.aK = xtbVar.Q;
                this.n = xtbVar.b;
                this.o = xtbVar.c;
                this.X.addView(this.m);
            }
        }
        this.k = false;
        xta xtaVar = this.ag;
        xtaVar.a = xtbVar.j;
        xtaVar.b = view.findViewById(R.id.comment_like_button);
        this.ag.c = (TextView) view.findViewById(R.id.comment_like_count);
        this.ag.d = view.findViewById(R.id.comment_dislike_button);
        this.ag.e = (ViewGroup) view.findViewById(R.id.comment_creator_heart);
        this.ag.f = (ImageView) view.findViewById(R.id.comment_heart_button);
        this.ag.g = (ImageView) view.findViewById(R.id.comment_creator_hearted_badge_avatar);
        this.ag.h = (ImageView) view.findViewById(R.id.comment_avatar_heart_overlay);
        this.ag.i = view.findViewById(R.id.comment_reply_button);
        this.ag.j = (TextView) view.findViewById(R.id.comment_reply_count);
        this.ag.k = view.findViewById(R.id.create_story_reply_button);
        xtbVar.f = this.ag;
        m(xtbVar, this.Y);
        this.m = xtbVar.a;
        this.af = xtbVar.e;
        this.ah = xtbVar.g;
        this.ae = xtbVar.d;
        this.p = xtbVar.h;
        this.q = xtbVar.i;
        this.aI = xtbVar.k;
        this.ai = xtbVar.j;
        this.r = xtbVar.l;
        this.s = xtbVar.m;
        this.t = xtbVar.n;
        this.u = xtbVar.o;
        this.v = xtbVar.p;
        this.aj = xtbVar.q;
        this.ak = xtbVar.r;
        this.al = xtbVar.s;
        this.am = xtbVar.t;
        this.an = xtbVar.u;
        this.ao = xtbVar.v;
        this.aq = xtbVar.x;
        this.ap = xtbVar.w;
        this.aE = xtbVar.M;
        this.aF = xtbVar.N;
        this.aG = xtbVar.O;
        this.aH = xtbVar.P;
        this.ar = xtbVar.y;
        this.as = xtbVar.z;
        this.at = xtbVar.A;
        this.aA = xtbVar.H;
        this.aB = xtbVar.I;
        this.aw = xtbVar.D;
        this.au = xtbVar.B;
        this.av = xtbVar.C;
        this.ax = xtbVar.E;
        this.ay = xtbVar.F;
        this.az = xtbVar.G;
        this.aD = xtbVar.K;
        this.aC = xtbVar.f270J;
        this.aJ = xtbVar.L;
        this.aK = xtbVar.Q;
        this.n = xtbVar.b;
        this.o = xtbVar.c;
        this.X.addView(this.m);
    }

    public final void f(View view) {
        if (view.getVisibility() == 0) {
            int i = this.L;
            int i2 = this.e;
            yce.f(view, i, i2, i, i2);
        }
    }

    public final void g(aqav aqavVar) {
        q(aqavVar, false);
        this.q.setVisibility(8);
        i(false);
    }

    public final void h(apoj apojVar, acti actiVar, Map map) {
        apzg apzgVar;
        int i = apojVar.b;
        if ((i & 16384) != 0) {
            apzgVar = apojVar.o;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else if ((i & 32768) == 0) {
            return;
        } else {
            apzgVar = apojVar.p;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        }
        if ((apojVar.b & 1048576) != 0) {
            actiVar.H(3, new acte(apojVar.t), null);
        }
        if (map != null) {
            map.put("com.google.android.libraries.youtube.comment.action_tag", "");
        }
        this.d.c(apzgVar, map);
    }

    public final void i(boolean z) {
        TextView textView = this.aJ;
        if (textView != null) {
            zgd.t(this.aJ, zgd.p(textView.getResources().getDimensionPixelOffset(true != z ? R.dimen.comment_replies_metadata_top_margin : R.dimen.comment_replies_metadata_top_margin_with_read_more)), ViewGroup.MarginLayoutParams.class);
        }
    }

    @Override // defpackage.xxw
    public final /* bridge */ /* synthetic */ void j(Object obj) {
        aqav aqavVar;
        aufe aufeVar = (aufe) obj;
        aplq aplqVar = this.y.B;
        if (aplqVar == null) {
            aplqVar = aplq.a;
        }
        if (aplqVar.b == 99391126) {
            xmd xmdVar = (xmd) this.aR.c("commentThreadMutator");
            aopa createBuilder = aplq.a.createBuilder();
            createBuilder.copyOnWrite();
            aplq aplqVar2 = (aplq) createBuilder.instance;
            aufeVar.getClass();
            aplqVar2.c = aufeVar;
            aplqVar2.b = 99391126;
            aplq aplqVar3 = (aplq) createBuilder.mo39build();
            aopa mo52toBuilder = this.y.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            aqav aqavVar2 = (aqav) mo52toBuilder.instance;
            aplqVar3.getClass();
            aqavVar2.B = aplqVar3;
            aqavVar2.c |= 256;
            aqav aqavVar3 = (aqav) mo52toBuilder.mo39build();
            if (!this.aS.f(this.y) && aqavVar3.G.size() > 0) {
                this.aS.b(aqavVar3);
            }
            if (this.aS.e(this.y) != aqavVar3.N) {
                xyd xydVar = this.aS;
                xydVar.d(aqavVar3, xydVar.e(this.y));
            }
            aqav a = this.aS.a(this.y);
            aqax aqaxVar = aqavVar3.E;
            if (aqaxVar == null) {
                aqaxVar = aqax.a;
            }
            if (aqaxVar.b == 62285947) {
                aqavVar = (aqav) aqaxVar.c;
            } else {
                aqavVar = aqav.a;
            }
            if (!akzj.f(a, aqavVar)) {
                xyd xydVar2 = this.aS;
                xydVar2.c(aqavVar3, xydVar2.a(this.y));
            }
            this.y = aqavVar3;
            E(aqavVar3, xmdVar.h());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x029a, code lost:
        if (r2.i.equals(r12.i) != false) goto L427;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x08d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:445:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r30, java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 2528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xtc.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.aT.e();
        this.m.setClickable(false);
        xmh xmhVar = this.C;
        aqav aqavVar = this.y;
        zew.N(xmhVar.b, aqavVar, this);
        zew.P(xmhVar.b, aqavVar);
        this.D.g(this);
        u();
        ViewGroup viewGroup = this.ai;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.r;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        TextView textView = this.aI;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.aL.e(this.aE);
        this.aL.e(this.aF);
        this.aL.e(this.aG);
        this.aL.e(this.ar);
        this.aL.e(this.aH);
        this.aK.setVisibility(8);
        Animator animator = this.aa;
        if (animator != null && animator.isRunning()) {
            this.aa.end();
        }
        this.aa = null;
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.aN;
        if (onAttachStateChangeListener != null) {
            this.X.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.aN = null;
        }
    }

    private static final void F(View view, aovs aovsVar) {
        if (aovsVar == null || (aovsVar.b & 1) == 0) {
            view.setContentDescription("");
            return;
        }
        aovr aovrVar = aovsVar.c;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        view.setContentDescription(aovrVar.c);
    }
}
