package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
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
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: krp  reason: default package */
/* loaded from: classes3.dex */
public final class krp implements ajru, ynl {
    final FrameLayout A;
    final ViewStub B;
    final TextView C;
    public aucu D;
    public apzg E;
    public Boolean F;
    private final Activity G;
    private final yni H;
    private final ajmy I;

    /* renamed from: J  reason: collision with root package name */
    private final fzx f220J;
    private final fly K;
    private final fcl L;
    private final jol M;
    private final azqb N;
    private final acus O;
    private final jlj P;
    private final fcg Q;
    private final int R;
    private final akbm S;
    private final fmr T;
    private final List U;
    private final fmr V;
    private final TextView W;
    private final FrameLayout X;
    private final PlaylistHeaderActionBarView Y;
    private final fta Z;
    public final aafo a;
    private final ImageView aa;
    private flx ab;
    private jli ac;
    private gae ad;
    final akbm b;
    final akbm c;
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
    final OfflineArrowView t;
    final ViewGroup u;
    final View.OnLayoutChangeListener v;
    final TextView w;
    final TextView x;
    final TextView y;
    final FrameLayout z;

    public krp(Activity activity, yni yniVar, ajmy ajmyVar, final aafo aafoVar, final ksj ksjVar, fzx fzxVar, fly flyVar, fms fmsVar, akbn akbnVar, fcl fclVar, jol jolVar, final ahce ahceVar, azqb azqbVar, acus acusVar, jlj jljVar, fcg fcgVar, ftb ftbVar) {
        this.G = activity;
        this.H = yniVar;
        this.I = ajmyVar;
        this.a = aafoVar;
        this.f220J = fzxVar;
        this.K = flyVar;
        this.L = fclVar;
        this.M = jolVar;
        this.N = azqbVar;
        this.O = acusVar;
        this.P = jljVar;
        this.Q = fcgVar;
        ViewGroup viewGroup = (ViewGroup) View.inflate(activity, R.layout.playlist_header_v2, null);
        this.e = viewGroup;
        this.u = (ViewGroup) viewGroup.findViewById(R.id.sort_playlist_container);
        this.f = (LinearLayout) viewGroup.findViewById(R.id.playlist_data);
        TextView textView = (TextView) viewGroup.findViewById(R.id.playlist_title);
        this.g = textView;
        this.h = (TextView) viewGroup.findViewById(R.id.playlist_subtitle);
        this.i = (TextView) viewGroup.findViewById(R.id.seasons);
        this.k = (TextView) viewGroup.findViewById(R.id.playlist_tvshow_metadata);
        this.j = (TextView) viewGroup.findViewById(R.id.playlist_channel);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.playlist_description);
        this.w = textView2;
        this.l = (LinearLayout) viewGroup.findViewById(R.id.sub_header_row);
        this.m = (TextView) viewGroup.findViewById(R.id.playlist_size);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.share_button);
        this.n = imageView;
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.edit_button);
        this.o = imageView2;
        this.p = (ImageView) viewGroup.findViewById(R.id.private_playlist_indicator);
        this.t = (OfflineArrowView) viewGroup.findViewById(R.id.offline_button);
        this.q = (ImageView) viewGroup.findViewById(R.id.hero_image);
        this.r = (ImageView) viewGroup.findViewById(R.id.channel_avatar);
        this.s = (ImageView) viewGroup.findViewById(R.id.expand_button);
        PlaylistHeaderActionBarView playlistHeaderActionBarView = (PlaylistHeaderActionBarView) viewGroup.findViewById(R.id.actions_bar);
        this.Y = playlistHeaderActionBarView;
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.action_button);
        this.W = textView3;
        TextView textView4 = (TextView) viewGroup.findViewById(R.id.offline_sync_button);
        this.C = textView4;
        this.X = (FrameLayout) viewGroup.findViewById(R.id.footer);
        TextView textView5 = (TextView) viewGroup.findViewById(R.id.play_button_label);
        this.x = textView5;
        this.z = (FrameLayout) viewGroup.findViewById(R.id.play_button_container);
        this.A = (FrameLayout) viewGroup.findViewById(R.id.shuffle_button_container);
        TextView textView6 = (TextView) viewGroup.findViewById(R.id.shuffle_button_label);
        this.y = textView6;
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.metadata_badge);
        this.B = viewStub;
        ImageView imageView3 = (ImageView) viewGroup.findViewById(R.id.save_button);
        this.aa = imageView3;
        this.Z = ftbVar.b(activity, viewStub);
        fzxVar.b(viewGroup.findViewById(R.id.like_button));
        this.S = akbnVar.a(textView3);
        this.b = akbnVar.a(textView5);
        this.c = akbnVar.a(textView6);
        fmr a = fmsVar.a(imageView3);
        this.V = a;
        a.b = imageView3;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: krh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                krp krpVar = krp.this;
                aafo aafoVar2 = aafoVar;
                ksj ksjVar2 = ksjVar;
                if (krp.k(krpVar.D)) {
                    aucv aucvVar = krpVar.D.I;
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
                } else if (!krp.l(krpVar.D)) {
                } else {
                    aucu aucuVar = krpVar.D;
                    String str2 = aucuVar.h;
                    if ((aucuVar.b & 2048) != 0) {
                        arag aragVar = aucuVar.n;
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
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: krg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                krp krpVar = krp.this;
                aafo aafoVar2 = aafoVar;
                apzg apzgVar = krpVar.E;
                if (apzgVar != null) {
                    aafoVar2.a(apzgVar);
                }
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: kri
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                krp krpVar = krp.this;
                ahce ahceVar2 = ahceVar;
                aucu aucuVar = krpVar.D;
                if (aucuVar != null) {
                    ahceVar2.f(aucuVar.h, ahbt.a(false));
                }
            }
        });
        Resources resources = activity.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.R = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
        this.T = fmsVar.a(playlistHeaderActionBarView.findViewById(R.id.toggle_button_icon));
        this.d = new frj(textView2, resources.getInteger(R.integer.playlist_header_description_lines_collapsed), resources.getInteger(R.integer.playlist_header_description_lines_expanded));
        final krf krfVar = new krf(this, 2);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: krj
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                krp krpVar = krp.this;
                View.OnClickListener onClickListener = krfVar;
                if (krpVar.d.d()) {
                    if (krpVar.f.hasOnClickListeners()) {
                        return;
                    }
                    krpVar.f.setOnClickListener(onClickListener);
                    zag.k(krpVar.f, null);
                    krpVar.f.setClickable(true);
                } else if (!krpVar.f.hasOnClickListeners()) {
                } else {
                    krpVar.f.setOnClickListener(null);
                    krpVar.f.setBackground(null);
                    krpVar.f.setClickable(false);
                }
            }
        };
        this.v = onLayoutChangeListener;
        textView2.addOnLayoutChangeListener(onLayoutChangeListener);
        textView.addOnLayoutChangeListener(onLayoutChangeListener);
        this.U = new ArrayList();
    }

    public static boolean k(aucu aucuVar) {
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

    public static boolean l(aucu aucuVar) {
        aucw aucwVar = aucuVar.x;
        if (aucwVar == null) {
            aucwVar = aucw.a;
        }
        return aucwVar.b;
    }

    private final void m(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int marginStart = marginLayoutParams.getMarginStart();
            marginLayoutParams.setMarginStart(this.G.getResources().getDimensionPixelSize(i));
            this.U.add(new krn(view, ampq.j(Integer.valueOf(marginStart)), amon.a));
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e;
    }

    public final int d() {
        if (this.L.i(this.D.h)) {
            return ((agrf) this.N.get()).a().i().a(this.D.h);
        }
        return 0;
    }

    public final void e() {
        int d = d();
        zag.m(this.C, d > 0 ? this.G.getResources().getQuantityString(R.plurals.download_new_videos_button_text, d, Integer.valueOf(d)) : null);
        this.ac.a();
    }

    public final void g() {
        zag.o(this.s, this.d.d());
        this.s.setRotation(true != this.d.d ? 360.0f : 180.0f);
    }

    public final void h(aucu aucuVar) {
        apok apokVar = aucuVar.E;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 2) == 0) {
            this.T.b(null);
            return;
        }
        fmr fmrVar = this.T;
        apos aposVar = apokVar.d;
        if (aposVar == null) {
            aposVar = apos.a;
        }
        fmrVar.b(aposVar);
    }

    public final void i(gae gaeVar) {
        aucu aucuVar = this.D;
        if (aucuVar == null || gaeVar == null || !TextUtils.equals(aucuVar.h, gaeVar.b())) {
            this.ad = null;
            return;
        }
        this.f220J.f(gaeVar.a());
        if (!this.V.e()) {
            boolean z = gaeVar.a() == aspb.LIKE;
            fmr fmrVar = this.V;
            if (fmrVar.d.e != z) {
                fmrVar.c();
            }
        }
        this.ad = gaeVar;
    }

    public final void j(aucu aucuVar) {
        CharSequence charSequence;
        if (aucuVar.w.size() == 0) {
            arag aragVar = aucuVar.s;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            charSequence = ajgl.b(aragVar);
        } else {
            aopu<arag> aopuVar = aucuVar.w;
            if (aopuVar.isEmpty()) {
                charSequence = "";
            } else {
                CharSequence charSequence2 = null;
                for (arag aragVar2 : aopuVar) {
                    Spanned b = ajgl.b(aragVar2);
                    if (charSequence2 == null) {
                        charSequence2 = TextUtils.concat(b);
                    } else {
                        charSequence2 = TextUtils.concat(charSequence2, " · ", b);
                    }
                }
                charSequence = charSequence2;
            }
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
        attp attpVar3;
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
            this.U.add(new krn(linearLayout, amon.a, ampq.j(Integer.valueOf(paddingStart))));
            m(this.Y, R.dimen.playlist_header_action_bar_start_padding_compact);
            m(this.k, R.dimen.start_end_padding);
            m(this.w, R.dimen.start_end_padding);
            m(this.W, R.dimen.start_end_padding);
            m(this.X, R.dimen.start_end_padding);
            m(this.z, R.dimen.start_end_padding);
        }
        ViewGroup.LayoutParams layoutParams = this.q.getLayoutParams();
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
            this.q.setVisibility(8);
        } else {
            this.q.setVisibility(0);
            zgd.t(this.q, zgd.h((int) (this.R * auelVar.d)), ViewGroup.LayoutParams.class);
            ajmy ajmyVar = this.I;
            ImageView imageView = this.q;
            avhn avhnVar = auelVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
        }
        zag.o(this.r, (this.D.b & 16384) != 0);
        ajmy ajmyVar2 = this.I;
        ImageView imageView2 = this.r;
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
        this.S.b(apojVar, actiVar);
        aucu aucuVar4 = this.D;
        this.b.b(aucuVar4.d == 63 ? (apoj) ((aunb) aucuVar4.e).qm(ButtonRendererOuterClass.buttonRenderer) : null, actiVar);
        Drawable background = this.x.getBackground();
        this.x.setBackground(null);
        this.z.setBackground(background);
        this.z.setOnClickListener(new krf(this, 1));
        aucu aucuVar5 = this.D;
        if (aucuVar5.f != 64) {
            this.A.setVisibility(8);
            this.y.setVisibility(8);
            apojVar2 = null;
        } else {
            apojVar2 = (apoj) ((aunb) aucuVar5.g).qm(ButtonRendererOuterClass.buttonRenderer);
            this.A.setVisibility(0);
            this.y.setVisibility(0);
        }
        this.c.b(apojVar2, actiVar);
        Drawable background2 = this.y.getBackground();
        this.y.setBackground(null);
        this.A.setBackground(background2);
        this.A.setOnClickListener(new krf(this));
        aucu aucuVar6 = this.D;
        String str = aucuVar6.h;
        jlj jljVar = this.P;
        OfflineArrowView offlineArrowView = this.t;
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
        fcg fcgVar = this.Q;
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
                attpVar3 = (attp) auctVar5.c;
            } else {
                attpVar3 = attp.a;
            }
            attpVar2 = attpVar3;
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
        this.ac = jljVar.a(str, offlineArrowView, i, fcgVar.a(str, attpVar2, apojVar3, new krm(this, 1), new krm(this), actiVar));
        if (this.L.i(str)) {
            this.M.c(str, yit.c(this.G, new kro(this, str)));
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
            this.f220J.i(aopcVar);
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
            aunb aunbVar = (aunb) it.next();
            if (aunbVar.qn(MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
                this.Z.f((atfh) aunbVar.qm(MetadataBadgeRendererOuterClass.metadataBadgeRenderer));
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
        TextView textView2 = this.w;
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
                    fkpVar.b(b.toString(), new fko() { // from class: krk
                        @Override // defpackage.fko
                        public final void a(Object obj2) {
                            krp krpVar = krp.this;
                            Spanned spanned = b;
                            aqrf aqrfVar2 = aqrfVar;
                            aucu aucuVar10 = (aucu) obj2;
                            zag.m(krpVar.i, spanned);
                            if (aqrfVar2.f || aqrfVar2.c != 5) {
                                return;
                            }
                            krpVar.a.a((apzg) aqrfVar2.d);
                        }
                    });
                }
            }
            fkr.a(fkpVar, this.i, aucuVar9);
        }
        this.u.removeAllViews();
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
        this.u.setVisibility(8);
        if (auxrVar != null) {
            if (this.ab == null) {
                this.ab = this.K.d(this.e, R.layout.playlist_sort_menu_header, R.layout.playlist_sort_menu_spinner_contents);
            }
            this.ab.oK(ajrsVar, auxrVar);
            this.u.addView(this.ab.c, -2, -2);
            this.u.setVisibility(0);
        }
        this.n.setVisibility(true != (k(this.D) || l(this.D)) ? 8 : 0);
        int bX = awwc.bX(this.D.C);
        if (bX == 0) {
            bX = 1;
        }
        int i3 = bX - 1;
        if (i3 == 1) {
            this.p.setImageResource(2131233374);
            this.p.setVisibility(0);
            this.p.setContentDescription(this.G.getString(R.string.accessibility_playlist_public));
        } else if (i3 != 2) {
            this.p.setImageResource(2131233415);
            this.p.setVisibility(0);
            this.p.setContentDescription(this.G.getString(R.string.accessibility_playlist_private));
        } else {
            this.p.setImageResource(2131233406);
            this.p.setVisibility(0);
            this.p.setContentDescription(this.G.getString(R.string.accessibility_playlist_unlisted));
        }
        h(this.D);
        j(this.D);
        apzg apzgVar = this.D.i;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        this.E = apzgVar;
        this.o.setVisibility((apzgVar == null || !apzgVar.qn(PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint)) ? 8 : 0);
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
        aucu aucuVar10 = this.D;
        apon aponVar = aucuVar10.H;
        if (aponVar == null) {
            aponVar = apon.a;
        }
        if ((aponVar.b & 1) == 0) {
            this.V.b(null);
        } else {
            fmr fmrVar = this.V;
            apon aponVar2 = aucuVar10.H;
            if (aponVar2 == null) {
                aponVar2 = apon.a;
            }
            apos aposVar = aponVar2.c;
            if (aposVar == null) {
                aposVar = apos.a;
            }
            fmrVar.b(aposVar);
        }
        i(this.ad);
        this.w.post(new Runnable() { // from class: krl
            @Override // java.lang.Runnable
            public final void run() {
                krp.this.g();
            }
        });
        if (this.O.b(this.D)) {
            this.O.d(actiVar, this.D);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.H.m(this);
        for (krn krnVar : this.U) {
            if (krnVar.b.h()) {
                ViewGroup.LayoutParams layoutParams = krnVar.a.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(((Integer) krnVar.b.c()).intValue());
                }
            }
            if (krnVar.c.h()) {
                krnVar.a.setPaddingRelative(((Integer) krnVar.c.c()).intValue(), krnVar.a.getPaddingTop(), krnVar.a.getPaddingEnd(), krnVar.a.getPaddingBottom());
            }
        }
        this.U.clear();
        this.ac = null;
        this.F = null;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        aucu aucuVar;
        switch (i) {
            case -1:
                return new Class[]{gae.class, abbh.class, agnl.class, agnm.class, agnn.class, agnp.class, agnq.class, agnr.class, agns.class};
            case 0:
                i((gae) obj);
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
                h(aucuVar);
                j(aucuVar);
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
