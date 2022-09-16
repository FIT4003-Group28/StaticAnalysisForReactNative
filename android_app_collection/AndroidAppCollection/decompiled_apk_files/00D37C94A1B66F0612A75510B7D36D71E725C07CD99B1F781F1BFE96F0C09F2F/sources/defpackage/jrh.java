package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: jrh  reason: default package */
/* loaded from: classes3.dex */
public final class jrh implements ynl {
    static final View.AccessibilityDelegate a = new jrf();
    private final Context A;
    private final azqb B;
    private final azqb C;
    private final jkz D;
    private final jkg E;
    private final acth F;
    private final fbx G;
    private final snc H;
    private final ImageView I;

    /* renamed from: J  reason: collision with root package name */
    private final OfflineArrowView f216J;
    private final View K;
    private final View L;
    public final fcl b;
    public final yni c;
    public final ajrq d;
    public final ajrp e;
    public final azqb f;
    public final fcd g;
    public final fbr h;
    public final jpd i;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final ViewGroup n;
    public final OfflineArrowView o;
    public final View p;
    public ajrs u;
    public ajrx v;
    public aqfa w;
    public String x;
    public ajrp y;
    public jkj z;
    public final jrg j = new jrg(this);
    public final fcc q = new fcc() { // from class: jre
        @Override // defpackage.fcc
        public final void a() {
            jrh.this.a();
        }
    };
    public final fbq r = new fbq() { // from class: jrd
        @Override // defpackage.fbq
        public final void a(agog agogVar) {
            jrh jrhVar = jrh.this;
            if (amps.e(jrhVar.x) || !jrhVar.x.equals(agogVar.a.m())) {
                return;
            }
            jrhVar.a();
        }
    };
    public final int s = c(R.attr.ytTextPrimary);
    public final int t = c(R.attr.ytTextSecondary);

    public jrh(Context context, fcl fclVar, azqb azqbVar, azqb azqbVar2, jkz jkzVar, yni yniVar, ajrq ajrqVar, jkg jkgVar, azqb azqbVar3, acth acthVar, fcd fcdVar, fbr fbrVar, jpd jpdVar, fbx fbxVar, snc sncVar, View view, ajrp ajrpVar) {
        this.A = context;
        this.b = fclVar;
        this.B = azqbVar;
        this.C = azqbVar2;
        this.D = jkzVar;
        this.c = yniVar;
        this.d = ajrqVar;
        this.e = ajrpVar;
        this.E = jkgVar;
        this.f = azqbVar3;
        this.F = acthVar;
        this.g = fcdVar;
        this.h = fbrVar;
        this.i = jpdVar;
        this.G = fbxVar;
        this.H = sncVar;
        this.k = (TextView) view.findViewById(R.id.title);
        this.l = (TextView) view.findViewById(R.id.author);
        this.m = (TextView) view.findViewById(R.id.details);
        this.I = (ImageView) view.findViewById(R.id.thumbnail);
        this.f216J = (OfflineArrowView) view.findViewById(R.id.offline_arrow);
        this.p = view.findViewById(R.id.contextual_menu_anchor);
        this.n = (ViewGroup) view.findViewById(R.id.offline_candidate_layout);
        this.o = (OfflineArrowView) view.findViewById(R.id.offline_candidate_arrow);
        this.K = view.findViewById(R.id.duration);
        this.L = view.findViewById(R.id.resume_playback_inflated_overlay);
    }

    private final int c(int i) {
        TypedValue typedValue = new TypedValue();
        if (this.A.getTheme().resolveAttribute(i, typedValue, true)) {
            return this.A.getResources().getColor(typedValue.resourceId);
        }
        return -1;
    }

    private final void d(boolean z) {
        aqfa aqfaVar;
        if (this.L == null || (aqfaVar = this.w) == null) {
            return;
        }
        avha f = ohn.f(aqfaVar.x);
        boolean z2 = false;
        if (z && f != null && f.c > 0) {
            z2 = true;
        }
        zag.o(this.L, z2);
    }

    private final boolean e() {
        ajrs ajrsVar = this.u;
        return ajrsVar != null && TextUtils.equals("downloads_page_recommendations_item_section_identifier", ajrsVar.k("downloads_page_section_key"));
    }

    private final void g(agqv agqvVar, int i) {
        String m = agqvVar.m();
        attp j = agqvVar.j();
        aopa createBuilder = OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.a.createBuilder();
        createBuilder.copyOnWrite();
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.instance;
        m.getClass();
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c = 1;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint.d = m;
        createBuilder.copyOnWrite();
        OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint2 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.instance;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.f = i - 1;
        offlineVideoEndpointOuterClass$OfflineVideoEndpoint2.b |= 8;
        if (i == 2) {
            if (j != null) {
                aopa mo52toBuilder = j.mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                attp attpVar = (attp) mo52toBuilder.instance;
                attpVar.b &= -129;
                attpVar.i = attp.a.i;
                aopc aopcVar = (aopc) aunb.a.createBuilder();
                aopcVar.e(OfflineabilityRendererOuterClass.offlineabilityRenderer, (attp) mo52toBuilder.mo39build());
                createBuilder.copyOnWrite();
                OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint3 = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.instance;
                aunb aunbVar = (aunb) aopcVar.mo39build();
                aunbVar.getClass();
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint3.g = aunbVar;
                offlineVideoEndpointOuterClass$OfflineVideoEndpoint3.b |= 32;
            }
            final aopc aopcVar2 = (aopc) apzg.a.createBuilder();
            aopcVar2.e(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint, (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) createBuilder.mo39build());
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", this.F.oi());
            this.o.setOnClickListener(new View.OnClickListener() { // from class: jrc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    jrh jrhVar = jrh.this;
                    aopc aopcVar3 = aopcVar2;
                    ((aafo) jrhVar.f.get()).c((apzg) aopcVar3.mo39build(), hashMap);
                }
            });
            this.o.setContentDescription(this.A.getString(R.string.accessibility_offline_button_save));
            return;
        }
        this.o.setOnClickListener(new jrb(this));
    }

    public final void a() {
        arag aragVar;
        String str = this.x;
        if (!amps.e(str)) {
            agqv e = ((agrf) this.B.get()).a().m().e(str);
            if (e == null || (e.i() != agqp.CANDIDATE && (e.i() != agqp.PLAYABLE || nni.t(this.G, e.j)))) {
                if (!e() && (e == null || (!e.v() && (!nni.t(this.G, e.j) || nni.i(e.j, this.H) == 0)))) {
                    this.k.setTextColor(zhn.j(this.A, R.attr.ytTextDisabled).orElse(0));
                } else {
                    this.k.setTextColor(zhn.j(this.A, R.attr.ytTextPrimary).orElse(0));
                }
                jjj c = this.D.c(!e(), e);
                StringBuilder sb = new StringBuilder();
                int i = 0;
                while (true) {
                    String[] strArr = c.c;
                    if (i >= strArr.length) {
                        break;
                    }
                    sb.append(strArr[i]);
                    if (i < c.c.length - 1) {
                        sb.append('\n');
                        i = 0;
                    }
                    i++;
                }
                zag.m(this.m, sb.toString());
                int length = c.c.length;
                this.m.setSingleLine(length <= 1);
                this.m.setMaxLines(length);
                this.m.setTextColor(zhn.j(this.A, c.a).orElse(0));
                TextView textView = this.m;
                textView.setTypeface(textView.getTypeface(), 0);
            } else {
                this.k.setTextColor(zhn.j(this.A, R.attr.ytTextPrimary).orElse(0));
                zag.o(this.m, false);
            }
            if (e == null || !e.v() || e()) {
                zag.o(this.l, true);
                aqfa aqfaVar = this.w;
                aqfaVar.getClass();
                TextView textView2 = this.l;
                if ((aqfaVar.b & 16) != 0) {
                    aragVar = aqfaVar.f;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                textView2.setText(ajgl.b(aragVar));
            } else {
                zag.o(this.l, false);
            }
            agqp i2 = e == null ? agqp.DELETED : e.i();
            if (i2 == agqp.PLAYABLE || e()) {
                b();
            } else if (i2.x || i2 == agqp.TRANSFER_PENDING_USER_APPROVAL) {
                boolean z = e == null || e.y();
                this.I.setAlpha(0.2f);
                zag.o(this.f216J, true);
                zag.o(this.K, false);
                View view = this.L;
                if (view != null) {
                    zag.o(view, false);
                }
                this.f216J.k();
                int ordinal = i2.ordinal();
                if (ordinal == 0) {
                    this.f216J.b(2131231736);
                } else if (ordinal == 5) {
                    this.f216J.c(2131231739);
                } else if (z) {
                    this.f216J.b(2131231736);
                } else {
                    this.f216J.b(2131231720);
                }
            } else {
                e.getClass();
                this.I.setAlpha(0.2f);
                zag.o(this.f216J, true);
                zag.o(this.K, false);
                View view2 = this.L;
                if (view2 != null) {
                    zag.o(view2, false);
                }
                OfflineArrowView offlineArrowView = this.f216J;
                offlineArrowView.d = 2;
                offlineArrowView.i(e.c());
                if (e.v()) {
                    this.I.setAlpha(1.0f);
                    this.f216J.f();
                    zag.o(this.K, true);
                    d(e.q((adzz) this.C.get()));
                } else {
                    int ordinal2 = e.i().ordinal();
                    if (ordinal2 == 3) {
                        this.f216J.g();
                    } else if (ordinal2 == 4 || ordinal2 == 6 || ordinal2 == 8) {
                        this.f216J.h();
                    } else if (ordinal2 == 10) {
                        this.f216J.b(2131231727);
                        this.f216J.k();
                    } else {
                        this.f216J.e();
                    }
                }
            }
            if (e == null || !e()) {
                zag.o(this.p, true);
                zag.o(this.o, false);
                return;
            }
            zag.o(this.p, false);
            zag.o(this.n, true);
            this.n.setImportantForAccessibility(2);
            this.o.setAccessibilityDelegate(null);
            if (this.z == null) {
                jkg jkgVar = this.E;
                String m = e.m();
                OfflineArrowView offlineArrowView2 = this.o;
                axxh axxhVar = (axxh) jkgVar.a.get();
                axxhVar.getClass();
                fcl fclVar = (fcl) jkgVar.b.get();
                fclVar.getClass();
                azqb azqbVar = jkgVar.c;
                nni nniVar = (nni) jkgVar.d.get();
                offlineArrowView2.getClass();
                this.z = new jkf(axxhVar, fclVar, azqbVar, 0, m, offlineArrowView2, null);
            }
            this.z.b(jjk.b(e));
            agqp i3 = e.i();
            int ordinal3 = i3.ordinal();
            if (ordinal3 == 2) {
                g(e, 2);
            } else if (ordinal3 == 3) {
                g(e, 4);
            } else if (ordinal3 != 10) {
                if (!i3.x || !e.y()) {
                    this.o.setAccessibilityDelegate(a);
                } else {
                    g(e, 5);
                }
            } else {
                g(e, 6);
            }
            this.n.setOnClickListener(new jrb(this, 1));
        }
    }

    public final void b() {
        this.I.setAlpha(1.0f);
        zag.o(this.f216J, false);
        zag.o(this.K, true);
        d(true);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                ypy ypyVar = (ypy) obj;
                a();
                return null;
            } else if (i == 1) {
                agnj agnjVar = (agnj) obj;
                a();
                return null;
            } else if (i == 2) {
                agnz agnzVar = (agnz) obj;
                if (amps.e(this.x) || !this.x.equals(agnzVar.a.m())) {
                    return null;
                }
                a();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ypy.class, agnj.class, agnz.class};
    }
}
