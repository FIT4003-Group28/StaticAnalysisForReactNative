package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextView;
import com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CounterfactualRendererOuterClass;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.SubscribeWithContextRendererOuterClass;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: mfs  reason: default package */
/* loaded from: classes3.dex */
public abstract class mfs implements ajru, ajrn {
    public avhn A;
    public fmt B;
    private final ViewStub C;
    private ggm D;
    private jku E;
    private emf F;
    private final jkv a;
    private final ftb b;
    private final kua c;
    private final List d;
    private ftc e;
    private final View f;
    public final Context g;
    public final ajmy h;
    public final View i;
    public final TextView j;
    protected final TextView k;
    public final TextView l;
    protected final TextView m;
    protected final TextView n;
    public TextView o;
    public fmj p;
    public fnb q;
    protected fjz r;
    protected ktz s;
    protected mra t;
    protected mra u;
    protected fta v;
    public mnk w;
    public final ImageView x;
    public final View y;
    public int z;

    public mfs(Context context, ajmy ajmyVar, aafo aafoVar, ajrx ajrxVar, int i, ViewGroup viewGroup, jkv jkvVar, ftb ftbVar, kua kuaVar) {
        this(context, ajmyVar, ajrxVar, LayoutInflater.from(context).inflate(i, viewGroup, false), aafoVar, (ajxz) null, jkvVar, ftbVar, kuaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void C(ajrs ajrsVar, avxe avxeVar) {
        ajrsVar.f("VideoPresenterConstants.VIDEO_ID", avxeVar.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(avhn avhnVar, ajmu ajmuVar) {
        this.h.k(this.x, avhnVar, ajmuVar);
        this.A = avhnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B(CharSequence charSequence) {
        TextView textView = this.j;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(CharSequence charSequence, List list, boolean z) {
        TextView textView = this.m;
        if (textView != null) {
            hqs.m(textView, charSequence);
        }
        boolean z2 = false;
        if (z) {
            zag.o(this.n, false);
            return;
        }
        if (this.m == null && !TextUtils.isEmpty(charSequence)) {
            this.d.add(0, charSequence);
        }
        this.d.addAll(list);
        if (!this.d.isEmpty()) {
            TextView textView2 = this.n;
            if (textView2 instanceof WrappingTextView) {
                ((WrappingTextView) textView2).a(this.d);
                Iterator it = this.d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!TextUtils.isEmpty((CharSequence) it.next())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                zag.o(this.n, z2);
            } else if (!list.isEmpty()) {
                hqs.m(this.n, (CharSequence) list.get(0));
            }
        }
        this.d.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        l(charSequence, Arrays.asList(charSequence2), z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(CharSequence charSequence) {
        hqs.m(this.k, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(CharSequence charSequence, CharSequence charSequence2) {
        hqs.m(this.l, charSequence);
        if (this.l == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.l.setContentDescription(charSequence2);
        TextView textView = this.l;
        if (!(textView instanceof DurationBadgeView)) {
            return;
        }
        ((DurationBadgeView) textView).a();
    }

    @Override // defpackage.ajrn
    public void oq(Map map) {
        ImageView imageView = this.x;
        if (imageView != null) {
            map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", imageView);
            map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", this.A);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(CharSequence charSequence, CharSequence charSequence2, List list, avss avssVar) {
        hqs.p(this.l, charSequence, charSequence2, list, avssVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(CharSequence charSequence, CharSequence charSequence2, avhc[] avhcVarArr, avss avssVar) {
        hqs.p(this.l, charSequence, charSequence2, avhcVarArr == null ? null : Arrays.asList(avhcVarArr), avssVar);
    }

    @Override // defpackage.ajru
    public void qZ(ajsa ajsaVar) {
        View view;
        jku jkuVar = this.E;
        if (jkuVar != null) {
            jkuVar.a();
        }
        fjz fjzVar = this.r;
        if (fjzVar != null && (view = fjzVar.f) != null) {
            view.animate().cancel();
        }
        emf emfVar = this.F;
        if (emfVar != null) {
            emfVar.b.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(atfh atfhVar) {
        fta ftaVar = this.v;
        if (ftaVar == null) {
            return;
        }
        ftaVar.f(atfhVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(ajrs ajrsVar, jlk jlkVar) {
        ViewStub viewStub = this.C;
        if (viewStub == null) {
            return;
        }
        if (this.E == null) {
            this.E = this.a.a(viewStub, jlkVar);
        }
        this.E.b(ajrsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(avha avhaVar) {
        View view = this.f;
        if (view == null) {
            return;
        }
        if (this.D == null) {
            this.D = new ggm((ViewStub) view);
        }
        this.D.a(avhaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(apmh apmhVar) {
        mra mraVar = this.t;
        if (mraVar == null) {
            return;
        }
        mraVar.a(apmhVar);
        TextView textView = this.j;
        if (textView == null) {
            return;
        }
        textView.setMaxLines(apmhVar != null ? this.z - 1 : this.z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(apmi apmiVar) {
        TextView textView;
        ktz ktzVar = this.s;
        if (ktzVar == null) {
            return;
        }
        ktzVar.a(apmiVar);
        if (apmiVar == null || (textView = this.n) == null) {
            return;
        }
        textView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(apmk apmkVar) {
        ftc ftcVar = this.e;
        if (ftcVar == null) {
            return;
        }
        ftcVar.a(apmkVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(aunb aunbVar, ajrs ajrsVar, emg emgVar, ajrb ajrbVar) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3 = null;
        avay avayVar = aunbVar.qn(SubscribeWithContextRendererOuterClass.subscribeWithContextRenderer) ? (avay) aunbVar.qm(SubscribeWithContextRendererOuterClass.subscribeWithContextRenderer) : null;
        if (avayVar != null && this.F == null) {
            KeyEvent.Callback findViewById = this.i.findViewById(R.id.subscribe_section);
            if (findViewById instanceof ViewStub) {
                findViewById = (ViewGroup) ((ViewStub) findViewById).inflate();
            }
            if (findViewById instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) findViewById;
                Context context = (Context) emgVar.a.get();
                context.getClass();
                fmh fmhVar = (fmh) emgVar.b.get();
                fmhVar.getClass();
                fnz fnzVar = (fnz) emgVar.c.get();
                fnzVar.getClass();
                viewGroup.getClass();
                this.F = new emf(context, fmhVar, fnzVar, viewGroup);
            }
        }
        emf emfVar = this.F;
        if (emfVar != null) {
            acti actiVar = ajrsVar.a;
            if (avayVar == null) {
                emfVar.c.setVisibility(8);
            } else {
                aunb aunbVar2 = avayVar.c;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                avaq avaqVar = (avaq) ajjh.l(aunbVar2, SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
                if (avaqVar == null) {
                    emfVar.c.setVisibility(8);
                } else {
                    emfVar.c.setVisibility(0);
                    actiVar.u(new acte(avayVar.g), null);
                    if ((avayVar.b & 2) != 0) {
                        aragVar = avayVar.d;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    emfVar.d = ajgl.d(aragVar, emfVar.a);
                    if ((avayVar.b & 4) != 0) {
                        aragVar2 = avayVar.e;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                    } else {
                        aragVar2 = null;
                    }
                    emfVar.e = ajgl.d(aragVar2, emfVar.a);
                    if ((8 & avayVar.b) != 0 && (aragVar3 = avayVar.f) == null) {
                        aragVar3 = arag.a;
                    }
                    emfVar.f = ajgl.d(aragVar3, emfVar.a);
                    boolean z = avaqVar.l;
                    emfVar.b(z, z, false);
                    emfVar.b.c(emfVar);
                    emfVar.b.i(avaqVar, actiVar);
                }
            }
        }
        if (aunbVar.qn(CounterfactualRendererOuterClass.counterfactualRenderer)) {
            ajrbVar.oK(ajrsVar, (aqio) aunbVar.qm(CounterfactualRendererOuterClass.counterfactualRenderer));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(avgw avgwVar, int i) {
        int i2;
        fmj fmjVar = this.p;
        if (fmjVar == null) {
            return;
        }
        if (fmjVar.b.getResources().getConfiguration().orientation == 2 || avgwVar == null) {
            ViewStub viewStub = fmjVar.d;
            if (viewStub == null) {
                return;
            }
            viewStub.setVisibility(8);
            return;
        }
        ImageView imageView = (ImageView) fmjVar.c();
        arhs arhsVar = avgwVar.c;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        if ((avgwVar.b & 2) != 0) {
            ajxz ajxzVar = fmjVar.a;
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            i2 = ajxzVar.a(b);
        } else {
            i2 = 0;
        }
        if (i2 != 0) {
            imageView.setImageResource(i2);
        } else {
            imageView.setImageDrawable(null);
        }
        imageView.setVisibility(i);
        fmjVar.c = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void z(avhn avhnVar) {
        this.h.h(this.x, avhnVar);
        this.A = avhnVar;
    }

    public mfs(Context context, ajmy ajmyVar, aafo aafoVar, ajrx ajrxVar, int i, jkv jkvVar, kua kuaVar) {
        this(context, ajmyVar, aafoVar, ajrxVar, i, (ViewGroup) null, jkvVar, (ftb) null, kuaVar);
    }

    public mfs(Context context, ajmy ajmyVar, ajrx ajrxVar, View view, aafo aafoVar, jkv jkvVar, ftb ftbVar, kua kuaVar) {
        this(context, ajmyVar, ajrxVar, view, aafoVar, (ajxz) null, jkvVar, ftbVar, kuaVar);
    }

    public mfs(Context context, ajmy ajmyVar, ajrx ajrxVar, View view, aafo aafoVar, ajxz ajxzVar, jkv jkvVar, ftb ftbVar, kua kuaVar) {
        context.getClass();
        this.g = context;
        ajmyVar.getClass();
        this.h = ajmyVar;
        this.a = jkvVar;
        this.b = ftbVar;
        this.c = kuaVar;
        ajrxVar.getClass();
        ajrxVar.c(view);
        view.getClass();
        this.i = view;
        TextView textView = (TextView) view.findViewById(R.id.title);
        this.j = textView;
        this.k = (TextView) view.findViewById(R.id.description);
        this.l = (TextView) view.findViewById(R.id.duration);
        this.m = (TextView) ezv.l(view, R.id.author, TextView.class);
        this.n = (TextView) ezv.l(view, R.id.details, TextView.class);
        this.x = (ImageView) view.findViewById(R.id.thumbnail);
        this.y = view.findViewById(R.id.contextual_menu_anchor);
        this.z = textView == null ? 0 : textView.getMaxLines();
        this.f = view.findViewById(R.id.resume_playback_overlay);
        this.C = (ViewStub) view.findViewById(R.id.offline_badge);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.standalone_ypc_badge);
        fta ftaVar = null;
        this.e = viewStub == null ? null : new ftc(viewStub, 1);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.standalone_red_badge);
        this.s = (viewStub2 == null || kuaVar == null) ? null : kuaVar.a(viewStub2);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.standalone_collection_bottom_badge);
        this.u = viewStub3 == null ? null : new mra(viewStub3, context, aafoVar, ajxzVar);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.text_badge);
        this.r = viewStub4 == null ? null : new fjz(viewStub4);
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.tap_to_watch_overlay);
        this.p = viewStub5 == null ? null : new fmj(viewStub5, context, ajxzVar);
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.view_count_overlay);
        this.q = viewStub6 == null ? null : new fnb(viewStub6, context);
        ViewStub viewStub7 = (ViewStub) view.findViewById(R.id.standalone_collection_badge);
        this.t = viewStub7 == null ? null : new mra(viewStub7, context, aafoVar, ajxzVar);
        ViewStub viewStub8 = (ViewStub) view.findViewById(R.id.privacy_badge);
        this.w = viewStub8 == null ? null : new mnk(viewStub8, context);
        ViewStub viewStub9 = (ViewStub) view.findViewById(R.id.trending_position_overlay);
        this.B = viewStub9 == null ? null : new fmt(viewStub9, aafoVar);
        ViewStub viewStub10 = (ViewStub) view.findViewById(R.id.metadata_badge);
        if (viewStub10 != null && ftbVar != null) {
            ftaVar = ftbVar.b(context, viewStub10);
        }
        this.v = ftaVar;
        this.d = amxp.o();
    }
}
