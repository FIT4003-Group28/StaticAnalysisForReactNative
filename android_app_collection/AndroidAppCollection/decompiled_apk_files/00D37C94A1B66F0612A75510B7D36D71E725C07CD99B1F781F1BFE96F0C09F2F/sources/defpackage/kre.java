package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.playlist.PlaylistHeaderActionBarView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: kre  reason: default package */
/* loaded from: classes3.dex */
public final class kre implements ajru, ynl {
    final LinearLayout A;
    final ViewStub B;
    final TextView C;
    public aucu D;
    public apzg E;
    public Boolean F;
    private final Activity G;
    private final yni H;
    private final ajmy I;

    /* renamed from: J  reason: collision with root package name */
    private final fzx f219J;
    private final akbj K;
    private final fly L;
    private final ajxz M;
    private final fcl N;
    private final jol O;
    private final azqb P;
    private final acus Q;
    private final jlj R;
    private final fcg S;
    private final int T;
    private final akbm U;
    private final fmr V;
    private final List W;
    private final ged X;
    private final fmr Y;
    private final TextView Z;
    public final aafo a;
    private final FrameLayout aa;
    private final PlaylistHeaderActionBarView ab;
    private final fta ac;
    private flx ad;
    private jli ae;
    private gae af;
    final akbm b;
    final fmr c;
    public final frj d;
    final ViewGroup e;
    final LinearLayout f;
    final TextView g;
    final TextView h;
    final TextView i;
    final TextView j;
    final TextView k;
    final LinearLayout l;
    final TextView m;
    final ImageView n;
    final ImageView o;
    final ImageView p;
    final ImageView q;
    final ImageView r;
    final ImageView s;
    final ImageView t;
    final OfflineArrowView u;
    final ViewGroup v;
    final View.OnLayoutChangeListener w;
    final TextView x;
    final TextView y;
    final FrameLayout z;

    public kre(Activity activity, yni yniVar, ajmy ajmyVar, final aafo aafoVar, final ksj ksjVar, fzx fzxVar, fly flyVar, fms fmsVar, akbn akbnVar, akbk akbkVar, ajxz ajxzVar, fcl fclVar, jol jolVar, final ahce ahceVar, azqb azqbVar, gee geeVar, acus acusVar, jlj jljVar, fcg fcgVar, ftb ftbVar) {
        this.G = activity;
        this.H = yniVar;
        this.I = ajmyVar;
        this.a = aafoVar;
        this.f219J = fzxVar;
        this.L = flyVar;
        this.M = ajxzVar;
        this.N = fclVar;
        this.O = jolVar;
        this.P = azqbVar;
        this.Q = acusVar;
        this.R = jljVar;
        this.S = fcgVar;
        ViewGroup viewGroup = (ViewGroup) View.inflate(activity, R.layout.playlist_header, null);
        this.e = viewGroup;
        this.v = (ViewGroup) viewGroup.findViewById(R.id.sort_playlist_container);
        this.f = (LinearLayout) viewGroup.findViewById(R.id.playlist_data);
        TextView textView = (TextView) viewGroup.findViewById(R.id.playlist_title);
        this.g = textView;
        this.h = (TextView) viewGroup.findViewById(R.id.playlist_subtitle);
        this.i = (TextView) viewGroup.findViewById(R.id.seasons);
        this.k = (TextView) viewGroup.findViewById(R.id.playlist_tvshow_metadata);
        this.j = (TextView) viewGroup.findViewById(R.id.playlist_channel);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.playlist_description);
        this.x = textView2;
        this.l = (LinearLayout) viewGroup.findViewById(R.id.sub_header_row);
        this.m = (TextView) viewGroup.findViewById(R.id.playlist_size);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.share_button);
        this.n = imageView;
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.edit_button);
        this.o = imageView2;
        ImageView imageView3 = (ImageView) viewGroup.findViewById(R.id.shuffle_button);
        this.p = imageView3;
        this.q = (ImageView) viewGroup.findViewById(R.id.private_playlist_indicator);
        this.u = (OfflineArrowView) viewGroup.findViewById(R.id.offline_button);
        this.r = (ImageView) viewGroup.findViewById(R.id.hero_image);
        this.s = (ImageView) viewGroup.findViewById(R.id.channel_avatar);
        this.t = (ImageView) viewGroup.findViewById(R.id.expand_button);
        PlaylistHeaderActionBarView playlistHeaderActionBarView = (PlaylistHeaderActionBarView) viewGroup.findViewById(R.id.actions_bar);
        this.ab = playlistHeaderActionBarView;
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.action_button);
        this.Z = textView3;
        TextView textView4 = (TextView) viewGroup.findViewById(R.id.offline_sync_button);
        this.C = textView4;
        this.aa = (FrameLayout) viewGroup.findViewById(R.id.footer);
        TextView textView5 = (TextView) viewGroup.findViewById(R.id.primary_button_label);
        this.y = textView5;
        this.z = (FrameLayout) viewGroup.findViewById(R.id.primary_button_container);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.secondary_button_container);
        this.A = linearLayout;
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.metadata_badge);
        this.B = viewStub;
        ImageView imageView4 = (ImageView) viewGroup.findViewById(R.id.save_button);
        this.ac = ftbVar.b(activity, viewStub);
        fzxVar.b(viewGroup.findViewById(R.id.like_button));
        this.U = akbnVar.a(textView3);
        this.b = akbnVar.a(textView5);
        fmr a = fmsVar.a(linearLayout);
        this.c = a;
        a.c = (TextView) linearLayout.findViewById(R.id.secondary_toggle_button_text);
        a.b = (ImageView) linearLayout.findViewById(R.id.secondary_toggle_button_icon);
        fmr a2 = fmsVar.a(imageView4);
        this.Y = a2;
        a2.b = imageView4;
        this.X = geeVar.a((FloatingActionButton) viewGroup.findViewById(R.id.playlist_fab));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: kqv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                kre kreVar = kre.this;
                aafo aafoVar2 = aafoVar;
                ksj ksjVar2 = ksjVar;
                aucu aucuVar = kreVar.D;
                if (aucuVar == null) {
                    return;
                }
                if (kre.l(aucuVar)) {
                    aucv aucvVar = kreVar.D.I;
                    if (aucvVar == null) {
                        aucvVar = aucv.a;
                    }
                    apoj apojVar = aucvVar.b;
                    if (apojVar == null) {
                        apojVar = apoj.a;
                    }
                    apzg apzgVar = apojVar.o;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar2.a(apzgVar);
                } else if (!kre.m(kreVar.D)) {
                } else {
                    aucu aucuVar2 = kreVar.D;
                    String str2 = aucuVar2.h;
                    if ((aucuVar2.b & 2048) != 0) {
                        arag aragVar = aucuVar2.n;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                        str = ajgl.b(aragVar).toString();
                    } else {
                        str = null;
                    }
                    ksjVar2.d(str2, str);
                }
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: kqu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kre kreVar = kre.this;
                aafo aafoVar2 = aafoVar;
                apzg apzgVar = kreVar.E;
                if (apzgVar != null) {
                    aafoVar2.c(apzgVar, null);
                }
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: kqw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kre kreVar = kre.this;
                ahce ahceVar2 = ahceVar;
                aucu aucuVar = kreVar.D;
                if (aucuVar != null) {
                    ahceVar2.f(aucuVar.h, ahbt.a(false));
                }
            }
        });
        this.K = akbkVar.a(imageView3);
        Resources resources = activity.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.T = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
        this.V = fmsVar.a(playlistHeaderActionBarView.findViewById(R.id.toggle_button_icon));
        this.d = new frj(textView2, resources.getInteger(R.integer.playlist_header_description_lines_collapsed), resources.getInteger(R.integer.playlist_header_description_lines_expanded));
        final kqt kqtVar = new kqt(this, 1);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: kqx
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                kre kreVar = kre.this;
                View.OnClickListener onClickListener = kqtVar;
                if (kreVar.d.d()) {
                    if (kreVar.f.hasOnClickListeners()) {
                        return;
                    }
                    kreVar.f.setOnClickListener(onClickListener);
                    zag.k(kreVar.f, null);
                    kreVar.f.setClickable(true);
                } else if (!kreVar.f.hasOnClickListeners()) {
                } else {
                    kreVar.f.setOnClickListener(null);
                    kreVar.f.setBackground(null);
                    kreVar.f.setClickable(false);
                }
            }
        };
        this.w = onLayoutChangeListener;
        textView2.addOnLayoutChangeListener(onLayoutChangeListener);
        textView.addOnLayoutChangeListener(onLayoutChangeListener);
        this.W = new ArrayList();
    }

    public static boolean l(aucu aucuVar) {
        aucv aucvVar = aucuVar.I;
        if (aucvVar == null) {
            aucvVar = aucv.a;
        }
        apoj apojVar = aucvVar.b;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        return (apojVar.b & 16384) != 0;
    }

    public static boolean m(aucu aucuVar) {
        aucw aucwVar = aucuVar.x;
        if (aucwVar == null) {
            aucwVar = aucw.a;
        }
        return aucwVar.b;
    }

    private final void n(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int marginStart = marginLayoutParams.getMarginStart();
            marginLayoutParams.setMarginStart(this.G.getResources().getDimensionPixelSize(i));
            this.W.add(new krc(view, ampq.j(Integer.valueOf(marginStart)), amon.a));
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e;
    }

    public final int d() {
        if (this.N.i(this.D.h)) {
            return ((agrf) this.P.get()).a().i().a(this.D.h);
        }
        return 0;
    }

    public final void e() {
        int d = d();
        zag.m(this.C, d > 0 ? this.G.getResources().getQuantityString(R.plurals.download_new_videos_button_text, d, Integer.valueOf(d)) : null);
        jli jliVar = this.ae;
        if (jliVar != null) {
            jliVar.a();
        }
    }

    public final void g() {
        zag.o(this.t, this.d.d());
        this.t.setRotation(true != this.d.d ? 360.0f : 180.0f);
    }

    public final void h(aucu aucuVar) {
        apok apokVar = aucuVar.E;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 2) == 0) {
            this.V.a();
            return;
        }
        fmr fmrVar = this.V;
        apos aposVar = apokVar.d;
        if (aposVar == null) {
            aposVar = apos.a;
        }
        fmrVar.b(aposVar);
    }

    public final void i(aucu aucuVar) {
        fxy fxyVar;
        if ((aucuVar.c & 524288) != 0) {
            aucq aucqVar = aucuVar.K;
            if (aucqVar == null) {
                aucqVar = aucq.a;
            }
            arfu arfuVar = aucqVar.c;
            if (arfuVar == null) {
                arfuVar = arfu.a;
            }
            fxyVar = new fxy(arfuVar);
        } else {
            fxyVar = null;
        }
        this.X.a(fxyVar);
    }

    public final void j(gae gaeVar) {
        aucu aucuVar = this.D;
        if (aucuVar == null || gaeVar == null || !TextUtils.equals(aucuVar.h, gaeVar.b())) {
            this.af = null;
            return;
        }
        this.f219J.f(gaeVar.a());
        if (!this.Y.e()) {
            boolean z = gaeVar.a() == aspb.LIKE;
            fmr fmrVar = this.Y;
            if (fmrVar.d.e != z) {
                fmrVar.c();
            }
        }
        this.af = gaeVar;
    }

    public final void k(aucu aucuVar) {
        CharSequence charSequence;
        if (aucuVar.w.size() == 0) {
            arag aragVar = aucuVar.s;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            charSequence = ajgl.b(aragVar);
        } else {
            aopu<arag> aopuVar = aucuVar.w;
            CharSequence spannedString = new SpannedString("");
            for (arag aragVar2 : aopuVar) {
                Spanned b = ajgl.b(aragVar2);
                if (spannedString.length() == 0) {
                    spannedString = TextUtils.concat(b);
                } else {
                    spannedString = TextUtils.concat(spannedString, " · ", b);
                }
            }
            charSequence = spannedString;
        }
        zag.m(this.m, charSequence);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        auel auelVar;
        apoj apojVar;
        apoj apojVar2;
        int i;
        attp attpVar;
        attp attpVar2;
        apoj apojVar3;
        arag aragVar;
        auxr auxrVar;
        aopc aopcVar;
        apoj apojVar4;
        aucu aucuVar = (aucu) obj;
        this.H.g(this);
        aucu aucuVar2 = this.D;
        this.D = aucuVar;
        acti actiVar = ajrsVar.a;
        this.d.b();
        if (ajrsVar.j("nested_fragment_key", false)) {
            LinearLayout linearLayout = this.f;
            int paddingStart = linearLayout.getPaddingStart();
            linearLayout.setPaddingRelative(this.G.getResources().getDimensionPixelSize(R.dimen.start_end_padding), linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
            this.W.add(new krc(linearLayout, amon.a, ampq.j(Integer.valueOf(paddingStart))));
            n(this.ab, R.dimen.playlist_header_action_bar_start_padding_compact);
            n(this.k, R.dimen.start_end_padding);
            n(this.x, R.dimen.start_end_padding);
            n(this.Z, R.dimen.start_end_padding);
            n(this.aa, R.dimen.start_end_padding);
            n(this.z, R.dimen.start_end_padding);
        }
        ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
        aucu aucuVar3 = this.D;
        if ((aucuVar3.b & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0) {
            auco aucoVar = aucuVar3.z;
            if (aucoVar == null) {
                aucoVar = auco.a;
            }
            auelVar = aucoVar.b;
            if (auelVar == null) {
                auelVar = auel.a;
            }
        } else {
            auelVar = null;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || auelVar == null || (auelVar.b & 1) == 0) {
            this.r.setVisibility(8);
        } else {
            this.r.setVisibility(0);
            zgd.t(this.r, zgd.h((int) (this.T * auelVar.d)), ViewGroup.LayoutParams.class);
            ajmy ajmyVar = this.I;
            ImageView imageView = this.r;
            avhn avhnVar = auelVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
        }
        zag.o(this.s, (this.D.b & 16384) != 0);
        ajmy ajmyVar2 = this.I;
        ImageView imageView2 = this.s;
        avhn avhnVar2 = this.D.q;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        ajmyVar2.h(imageView2, avhnVar2);
        apok apokVar = this.D.B;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) != 0) {
            apok apokVar2 = this.D.B;
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
        this.U.b(apojVar, actiVar);
        aucu aucuVar4 = this.D;
        if ((aucuVar4.b & 64) != 0) {
            aunb aunbVar = aucuVar4.j;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            apojVar2 = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar2 = null;
        }
        this.b.b(apojVar2, actiVar);
        this.z.setVisibility(this.y.getVisibility());
        this.z.setFocusable(this.y.isFocusable());
        this.z.setClickable(this.y.isClickable());
        this.z.setEnabled(this.y.isEnabled());
        this.z.setContentDescription(this.y.getContentDescription());
        this.y.setClickable(false);
        this.y.setFocusable(false);
        this.y.setContentDescription(null);
        Drawable background = this.y.getBackground();
        this.y.setBackground(null);
        this.z.setBackground(background);
        this.z.setOnClickListener(new kqt(this));
        aucu aucuVar5 = this.D;
        if ((aucuVar5.b & 128) == 0) {
            this.c.a();
        } else {
            aunb aunbVar2 = aucuVar5.k;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            this.c.b((apos) aunbVar2.qm(ButtonRendererOuterClass.toggleButtonRenderer));
        }
        aucu aucuVar6 = this.D;
        String str = aucuVar6.h;
        jlj jljVar = this.R;
        OfflineArrowView offlineArrowView = this.u;
        auct auctVar = aucuVar6.D;
        if (auctVar == null) {
            auctVar = auct.a;
        }
        if (auctVar.b == 65153809) {
            i = 2;
        } else {
            auct auctVar2 = this.D.D;
            if (auctVar2 == null) {
                auctVar2 = auct.a;
            }
            if (auctVar2.b == 60572968) {
                auct auctVar3 = this.D.D;
                if (auctVar3 == null) {
                    auctVar3 = auct.a;
                }
                if (auctVar3.b == 60572968) {
                    attpVar = (attp) auctVar3.c;
                } else {
                    attpVar = attp.a;
                }
                if (attpVar.c) {
                    i = 1;
                }
            }
            i = 3;
        }
        fcg fcgVar = this.S;
        auct auctVar4 = this.D.D;
        if (auctVar4 == null) {
            auctVar4 = auct.a;
        }
        if (auctVar4.b == 60572968) {
            auct auctVar5 = this.D.D;
            if (auctVar5 == null) {
                auctVar5 = auct.a;
            }
            if (auctVar5.b == 60572968) {
                attpVar2 = (attp) auctVar5.c;
            } else {
                attpVar2 = attp.a;
            }
        } else {
            attpVar2 = null;
        }
        auct auctVar6 = this.D.D;
        if (auctVar6 == null) {
            auctVar6 = auct.a;
        }
        if (auctVar6.b == 65153809) {
            auct auctVar7 = this.D.D;
            if (auctVar7 == null) {
                auctVar7 = auct.a;
            }
            if (auctVar7.b == 65153809) {
                apojVar4 = (apoj) auctVar7.c;
            } else {
                apojVar4 = apoj.a;
            }
            apojVar3 = apojVar4;
        } else {
            apojVar3 = null;
        }
        this.ae = jljVar.a(str, offlineArrowView, i, fcgVar.a(str, attpVar2, apojVar3, new kra(this), new kra(this, 1), actiVar));
        if (this.N.i(str)) {
            this.O.c(str, yit.c(this.G, new krd(this, str)));
        }
        aucu aucuVar7 = this.D;
        if (aucuVar7 != aucuVar2) {
            asow asowVar = aucuVar7.A;
            if (asowVar == null) {
                asowVar = asow.a;
            }
            if ((asowVar.b & 1) != 0) {
                asow asowVar2 = this.D.A;
                if (asowVar2 == null) {
                    asowVar2 = asow.a;
                }
                asov asovVar = asowVar2.c;
                if (asovVar == null) {
                    asovVar = asov.a;
                }
                aopcVar = (aopc) asovVar.mo52toBuilder();
            } else {
                aopcVar = null;
            }
            this.f219J.i(aopcVar);
            if (aopcVar != null) {
                aopa mo52toBuilder = this.D.mo52toBuilder();
                asow asowVar3 = this.D.A;
                if (asowVar3 == null) {
                    asowVar3 = asow.a;
                }
                aopa mo52toBuilder2 = asowVar3.mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                asow asowVar4 = (asow) mo52toBuilder2.instance;
                asov asovVar2 = (asov) aopcVar.mo39build();
                asovVar2.getClass();
                asowVar4.c = asovVar2;
                asowVar4.b |= 1;
                mo52toBuilder.copyOnWrite();
                aucu aucuVar8 = (aucu) mo52toBuilder.instance;
                asow asowVar5 = (asow) mo52toBuilder2.mo39build();
                asowVar5.getClass();
                aucuVar8.A = asowVar5;
                aucuVar8.c |= 4;
                this.D = (aucu) mo52toBuilder.mo39build();
            }
        }
        this.B.setVisibility(8);
        Iterator it = this.D.N.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            aunb aunbVar3 = (aunb) it.next();
            if (aunbVar3.qn(MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
                this.ac.f((atfh) aunbVar3.qm(MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
                this.B.setVisibility(0);
                break;
            }
        }
        TextView textView = this.g;
        arag aragVar2 = this.D.n;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar2));
        TextView textView2 = this.x;
        arag aragVar3 = this.D.t;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        zag.m(textView2, ajgl.r(aragVar3));
        TextView textView3 = this.h;
        arag aragVar4 = this.D.o;
        if (aragVar4 == null) {
            aragVar4 = arag.a;
        }
        zag.m(textView3, ajgl.b(aragVar4));
        TextView textView4 = this.k;
        arag aragVar5 = this.D.p;
        if (aragVar5 == null) {
            aragVar5 = arag.a;
        }
        zag.m(textView4, ajgl.b(aragVar5));
        TextView textView5 = this.j;
        arag aragVar6 = this.D.u;
        if (aragVar6 == null) {
            aragVar6 = arag.a;
        }
        zag.m(textView5, ajgl.b(aragVar6));
        aucu aucuVar9 = this.D;
        aucn aucnVar = aucuVar9.f116J;
        if (aucnVar == null) {
            aucnVar = aucn.a;
        }
        aqrd aqrdVar = aucnVar.b;
        if (aqrdVar == null) {
            aqrdVar = aqrd.a;
        }
        if (aqrdVar.c.size() == 0) {
            zag.o(this.i, false);
        } else {
            aucn aucnVar2 = aucuVar9.f116J;
            if (aucnVar2 == null) {
                aucnVar2 = aucn.a;
            }
            aqrd aqrdVar2 = aucnVar2.b;
            if (aqrdVar2 == null) {
                aqrdVar2 = aqrd.a;
            }
            aopu aopuVar = aqrdVar2.c;
            fkp fkpVar = new fkp(this.G);
            for (int i2 = 0; i2 < aopuVar.size(); i2++) {
                final aqrf aqrfVar = ((aqra) aopuVar.get(i2)).e;
                if (aqrfVar == null) {
                    aqrfVar = aqrf.a;
                }
                if ((aqrfVar.b & 1) != 0) {
                    aragVar = aqrfVar.e;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                final Spanned b = ajgl.b(aragVar);
                if (aqrfVar.f) {
                    zag.m(this.i, b);
                }
                if (b != null) {
                    fkpVar.b(b.toString(), new fko() { // from class: kqy
                        @Override // defpackage.fko
                        public final void a(Object obj2) {
                            kre kreVar = kre.this;
                            Spanned spanned = b;
                            aqrf aqrfVar2 = aqrfVar;
                            aucu aucuVar10 = (aucu) obj2;
                            zag.m(kreVar.i, spanned);
                            if (aqrfVar2.f || aqrfVar2.c != 5) {
                                return;
                            }
                            kreVar.a.c((apzg) aqrfVar2.d, null);
                        }
                    });
                }
            }
            fkr.a(fkpVar, this.i, aucuVar9);
        }
        this.v.removeAllViews();
        aucr aucrVar = aucuVar.L;
        if (aucrVar == null) {
            aucrVar = aucr.a;
        }
        if (aucrVar.b == 76818770) {
            aucr aucrVar2 = aucuVar.L;
            if (aucrVar2 == null) {
                aucrVar2 = aucr.a;
            }
            if (aucrVar2.b == 76818770) {
                auxrVar = (auxr) aucrVar2.c;
            } else {
                auxrVar = auxr.a;
            }
        } else {
            auxrVar = null;
        }
        this.v.setVisibility(8);
        if (auxrVar != null) {
            if (this.ad == null) {
                this.ad = this.L.d(this.e, R.layout.playlist_sort_menu_header, R.layout.playlist_sort_menu_spinner_contents);
            }
            this.ad.oK(ajrsVar, auxrVar);
            this.v.addView(this.ad.c, -2, -2);
            this.v.setVisibility(0);
        }
        this.n.setVisibility(true != (l(this.D) || m(this.D)) ? 8 : 0);
        int bX = awwc.bX(this.D.C);
        if (bX == 0) {
            bX = 1;
        }
        int i3 = bX - 1;
        if (i3 == 1) {
            this.q.setImageResource(2131233374);
            this.q.setVisibility(0);
            this.q.setContentDescription(this.G.getString(R.string.accessibility_playlist_public));
        } else if (i3 != 2) {
            this.q.setImageResource(2131233415);
            this.q.setVisibility(0);
            this.q.setContentDescription(this.G.getString(R.string.accessibility_playlist_private));
        } else {
            this.q.setImageResource(2131233406);
            this.q.setVisibility(0);
            this.q.setContentDescription(this.G.getString(R.string.accessibility_playlist_unlisted));
        }
        h(this.D);
        i(this.D);
        k(this.D);
        apzg apzgVar = this.D.i;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        this.E = apzgVar;
        this.o.setVisibility((apzgVar == null || !apzgVar.qn(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint)) ? 8 : 0);
        aucu aucuVar10 = this.D;
        if (aucuVar10.f != 64) {
            this.p.setVisibility(8);
        } else {
            apoj apojVar5 = (apoj) ((aunb) aucuVar10.g).qm(ButtonRendererOuterClass.buttonRenderer);
            if ((apojVar5.b & 32) != 0) {
                ajxz ajxzVar = this.M;
                arhs arhsVar = apojVar5.g;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b2 = arhr.b(arhsVar.c);
                if (b2 == null) {
                    b2 = arhr.UNKNOWN;
                }
                if (ajxzVar.a(b2) != 0) {
                    ImageView imageView3 = this.p;
                    ajxz ajxzVar2 = this.M;
                    arhs arhsVar2 = apojVar5.g;
                    if (arhsVar2 == null) {
                        arhsVar2 = arhs.a;
                    }
                    arhr b3 = arhr.b(arhsVar2.c);
                    if (b3 == null) {
                        b3 = arhr.UNKNOWN;
                    }
                    imageView3.setImageResource(ajxzVar2.a(b3));
                    HashMap hashMap = new HashMap();
                    hashMap.put("START_SHUFFLED", true);
                    this.K.a(apojVar5, ajrsVar.a, hashMap);
                    this.p.setVisibility(0);
                }
            }
            this.p.setVisibility(8);
        }
        View view = null;
        View view2 = null;
        for (int i4 = 0; i4 < this.l.getChildCount(); i4++) {
            View childAt = this.l.getChildAt(i4);
            if (childAt.getId() == R.id.divider) {
                if (view2 == null || i4 == this.l.getChildCount() - 1) {
                    childAt.setVisibility(8);
                } else {
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    view = childAt;
                }
            } else if (childAt.getVisibility() == 0) {
                if (view != null) {
                    view.setVisibility(0);
                }
                view2 = childAt;
                view = null;
            }
        }
        if (view != null) {
            view.setVisibility(8);
        }
        e();
        aucu aucuVar11 = this.D;
        apon aponVar = aucuVar11.H;
        if (aponVar == null) {
            aponVar = apon.a;
        }
        if ((aponVar.b & 1) == 0) {
            this.Y.a();
        } else {
            fmr fmrVar = this.Y;
            apon aponVar2 = aucuVar11.H;
            if (aponVar2 == null) {
                aponVar2 = apon.a;
            }
            apos aposVar = aponVar2.c;
            if (aposVar == null) {
                aposVar = apos.a;
            }
            fmrVar.b(aposVar);
        }
        j(this.af);
        this.x.post(new Runnable() { // from class: kqz
            @Override // java.lang.Runnable
            public final void run() {
                kre.this.g();
            }
        });
        if (this.Q.b(this.D)) {
            this.Q.d(actiVar, this.D);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.H.m(this);
        for (krc krcVar : this.W) {
            if (krcVar.b.h()) {
                ViewGroup.LayoutParams layoutParams = krcVar.a.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(((Integer) krcVar.b.c()).intValue());
                }
            }
            if (krcVar.c.h()) {
                krcVar.a.setPaddingRelative(((Integer) krcVar.c.c()).intValue(), krcVar.a.getPaddingTop(), krcVar.a.getPaddingEnd(), krcVar.a.getPaddingBottom());
            }
        }
        this.W.clear();
        this.ae = null;
        this.F = null;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        aucu aucuVar;
        switch (i) {
            case -1:
                return new Class[]{gae.class, abbh.class, agnl.class, agnm.class, agnn.class, agnp.class, agnq.class, agnr.class, agns.class};
            case 0:
                j((gae) obj);
                return null;
            case 1:
                abbh abbhVar = (abbh) obj;
                asat asatVar = abbhVar.b;
                if ((4 & asatVar.b) == 0) {
                    return null;
                }
                asau asauVar = asatVar.d;
                if (asauVar == null) {
                    asauVar = asau.a;
                }
                if (asauVar.b == 53272665) {
                    asau asauVar2 = abbhVar.b.d;
                    if (asauVar2 == null) {
                        asauVar2 = asau.a;
                    }
                    if (asauVar2.b == 53272665) {
                        aucuVar = (aucu) asauVar2.c;
                    } else {
                        aucuVar = aucu.a;
                    }
                } else {
                    aucuVar = null;
                }
                if (aucuVar == null) {
                    return null;
                }
                h(aucuVar);
                i(aucuVar);
                k(aucuVar);
                return null;
            case 2:
                if (!((agnl) obj).a.equals(this.D.h)) {
                    return null;
                }
                e();
                return null;
            case 3:
                if (!((agnm) obj).a.equals(this.D.h)) {
                    return null;
                }
                e();
                return null;
            case 4:
                if (!((agnn) obj).a.equals(this.D.h)) {
                    return null;
                }
                e();
                return null;
            case 5:
                if (!((agnp) obj).a.d().equals(this.D.h)) {
                    return null;
                }
                e();
                return null;
            case 6:
                if (!((agnq) obj).a.equals(this.D.h)) {
                    return null;
                }
                e();
                return null;
            case 7:
                if (!((agnr) obj).a.d().equals(this.D.h)) {
                    return null;
                }
                e();
                return null;
            case 8:
                if (!((agns) obj).a.equals(this.D.h)) {
                    return null;
                }
                e();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
