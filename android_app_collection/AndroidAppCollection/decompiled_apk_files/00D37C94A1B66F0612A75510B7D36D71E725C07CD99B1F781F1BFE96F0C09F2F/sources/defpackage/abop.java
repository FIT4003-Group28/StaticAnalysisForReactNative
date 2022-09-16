package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.TextAppearanceSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.livechat.innertube.CreatorSupportPickerPanelWrapper;
import com.google.android.libraries.youtube.livechat.innertube.ProductPickerPanelWrapper;
import com.google.android.libraries.youtube.livechat.innertube.SupportedPickerPanelWrapper;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: abop  reason: default package */
/* loaded from: classes.dex */
public abstract class abop implements abko, zdx, akcc {
    private static final long w = TimeUnit.SECONDS.toMillis(5);
    private final abjx A;
    private TextWatcher B;
    private int C;
    private ImageView D;
    private ImageView E;
    private ViewGroup F;
    private boolean I;

    /* renamed from: J  reason: collision with root package name */
    private boolean f24J;
    private final abhy K;
    protected final Context a;
    protected final acti b;
    protected final aafo c;
    protected final ajxz d;
    protected final abks e;
    protected final abkj f;
    protected final ajvj g;
    protected final ajsk h;
    protected final boolean j;
    protected final boolean k;
    public abkm l;
    protected aqus m;
    public final akge n;
    public Spanned o;
    public int p;
    public int q;
    protected abkn r;
    public List s;
    public boolean t;
    public boolean u;
    public abiz v;
    private final Context x;
    private final Runnable G = new Runnable() { // from class: abod
        @Override // java.lang.Runnable
        public final void run() {
            abop.this.B(true);
        }
    };
    private final Handler H = new Handler();
    protected final boolean i = true;
    private final TextWatcher y = new abon(this);
    private final InputFilter z = new abkz();

    public abop(Context context, zhf zhfVar, ajxz ajxzVar, aafo aafoVar, acti actiVar, abks abksVar, abkj abkjVar, ajvj ajvjVar, abjx abjxVar, ajsk ajskVar, akge akgeVar, abhy abhyVar, boolean z, boolean z2) {
        this.a = context;
        this.x = new ContextThemeWrapper(context, zhfVar.a);
        this.d = ajxzVar;
        this.c = aafoVar;
        this.b = actiVar;
        this.e = abksVar;
        this.f = abkjVar;
        this.g = ajvjVar;
        this.A = abjxVar;
        this.h = ajskVar;
        this.n = akgeVar;
        this.K = abhyVar;
        this.j = z;
        this.k = z2;
    }

    public static final void K(View view, boolean z) {
        if (view != null) {
            view.setVisibility(true != z ? 8 : 0);
        }
    }

    private final ViewGroup L() {
        if (this.F == null) {
            this.F = (ViewGroup) n().findViewById(R.id.action_pills);
        }
        return this.F;
    }

    private final void M(ViewGroup viewGroup, final asqu asquVar, final SupportedPickerPanelWrapper supportedPickerPanelWrapper) {
        if ((asquVar.b & 2) != 0) {
            arhs arhsVar = asquVar.d;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            View k = k(arhsVar);
            aovs aovsVar = asquVar.f;
            if (aovsVar == null) {
                aovsVar = aovs.a;
            }
            if ((aovsVar.b & 1) != 0) {
                aovs aovsVar2 = asquVar.f;
                if (aovsVar2 == null) {
                    aovsVar2 = aovs.a;
                }
                aovr aovrVar = aovsVar2.c;
                if (aovrVar == null) {
                    aovrVar = aovr.a;
                }
                k.setContentDescription(aovrVar.c);
            }
            final acte acteVar = new acte(asquVar.h);
            this.b.u(acteVar, null);
            if (asquVar.g) {
                k.setOnClickListener(new View.OnClickListener() { // from class: aboj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        zag.r(abop.this.a, asquVar.e, 0);
                    }
                });
            } else if (supportedPickerPanelWrapper != null) {
                k.setOnClickListener(new View.OnClickListener() { // from class: abog
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        abop abopVar = abop.this;
                        SupportedPickerPanelWrapper supportedPickerPanelWrapper2 = supportedPickerPanelWrapper;
                        acte acteVar2 = acteVar;
                        zag.i(abopVar.r());
                        if (abopVar.a instanceof dt) {
                            abopVar.e.c = abopVar.J();
                            abiz abizVar = abopVar.v;
                            if (abizVar != null) {
                                abizVar.a();
                            }
                            abkm abkmVar = abopVar.l;
                            if (abkmVar != null) {
                                abkmVar.d();
                            }
                            abse.e(null, null, supportedPickerPanelWrapper2).qv(((dt) abopVar.a).getSupportFragmentManager(), "purchase_dialog_fragment");
                        }
                        abopVar.n.f();
                        abopVar.b.H(3, acteVar2, null);
                    }
                });
            }
            k.setTag(R.id.live_chat_picker_toggle_button_tag, asquVar.c);
            viewGroup.addView(k);
            ajsk ajskVar = this.h;
            if (ajskVar == null) {
                return;
            }
            ajskVar.a(asquVar, k);
        }
    }

    private final void N() {
        this.f.d();
        t().setAlpha(0.0f);
        t().setVisibility(4);
        s().setAlpha(1.0f);
        s().setVisibility(0);
        s().bringToFront();
    }

    private final void O(boolean z) {
        if (w() == null) {
            return;
        }
        int i = 8;
        r().setVisibility(true != z ? 0 : 8);
        TextView w2 = w();
        if (true == z) {
            i = 0;
        }
        w2.setVisibility(i);
        t().setBackground(z ? null : zag.e(this.a, 0));
        this.I = z;
    }

    private final void P(boolean z) {
        if (this.m == null) {
            if (this.I) {
                return;
            }
            N();
            return;
        }
        G(false);
        o().setOnClickListener(new aboe(this, 2));
        if (this.u || !z) {
            B(false);
        } else {
            this.H.postDelayed(this.G, w);
        }
    }

    private final void Q() {
        K(o(), true);
        zgd.t(r(), zgd.l(0), ViewGroup.MarginLayoutParams.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void A(int i) {
        throw null;
    }

    public final void B(boolean z) {
        if (s().getVisibility() == 0 || t().getVisibility() != 0) {
            if (!z) {
                s().setVisibility(8);
                s().setAlpha(0.0f);
                t().setVisibility(0);
                t().setAlpha(1.0f);
                return;
            }
            s().setVisibility(0);
            t().setVisibility(0);
            t().animate().alpha(1.0f).setListener(null);
            s().animate().alpha(0.0f).setListener(new abom(this)).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void C() {
        Editable h = h();
        if (this.l == null || TextUtils.isEmpty(h)) {
            return;
        }
        if (this.g.h()) {
            this.l.f(this.f.a(h));
        } else {
            this.l.g(h.toString().trim());
        }
        this.A.a(true != J() ? 2 : 3, 2);
        zdg.c(this.a, u(), this.a.getResources().getString(R.string.live_chat_message_sent_accessibility_string));
        x();
        this.f.d();
        G(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(boolean z) {
        zgd.t(l(), zgd.h(z ? this.C : 0), ViewGroup.LayoutParams.class);
    }

    public final void E(int i) {
        ViewGroup L = L();
        if (L != null) {
            for (int i2 = 0; i2 < L.getChildCount(); i2++) {
                View childAt = L.getChildAt(i2);
                if (childAt.getVisibility() != i) {
                    childAt.setVisibility(i);
                    Object tag = childAt.getTag();
                    if (i == 0 && (tag instanceof acte)) {
                        this.b.u((acte) tag, null);
                    }
                }
            }
        }
    }

    public abstract void F(avhn avhnVar);

    protected abstract void G(boolean z);

    protected final void H(boolean z) {
        int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(R.dimen.live_chat_text_field_height);
        View m = m();
        int i = 8;
        m.setVisibility(true != z ? 8 : 0);
        m.setMinimumHeight(dimensionPixelOffset);
        ViewGroup p = p();
        if (true != z) {
            i = 0;
        }
        p.setVisibility(i);
        p.setMinimumHeight(dimensionPixelOffset);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void I() {
        abkj abkjVar = this.f;
        if (!abkjVar.h) {
            abkjVar.f((ViewGroup) n(), this.m, r(), this);
            G(this.f.h);
            B(false);
            return;
        }
        abkjVar.d();
        G(this.f.h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean J() {
        return false;
    }

    @Override // defpackage.abko
    public void c() {
        r().setText("");
    }

    @Override // defpackage.abko
    public void d(assk asskVar) {
        apoj apojVar;
        asqu asquVar;
        SupportedPickerPanelWrapper supportedPickerPanelWrapper;
        assy assyVar;
        D(true);
        p().removeAllViews();
        ViewGroup q = q();
        if (q != null) {
            int childCount = q.getChildCount();
            for (int i = 0; i < childCount; i++) {
                q.getChildAt(i).setOnClickListener(null);
            }
            q.removeAllViews();
        }
        ViewGroup L = L();
        if (L != null) {
            for (int i2 = 0; i2 < L.getChildCount(); i2++) {
                L.getChildAt(i2).setOnClickListener(null);
            }
            L.removeAllViews();
        }
        this.m = null;
        o().setOnClickListener(null);
        m().setOnClickListener(null);
        N();
        this.H.removeCallbacks(this.G);
        int i3 = asskVar.b;
        if (i3 != 121323709) {
            if (i3 == 132498670) {
                y((asss) asskVar.c);
                return;
            } else if (i3 != 58508690) {
                return;
            } else {
                z((atfa) asskVar.c);
                return;
            }
        }
        asrs asrsVar = (asrs) asskVar.c;
        boolean z = this.u;
        EditText r = r();
        Q();
        O(false);
        H(true);
        if (z) {
            B(false);
        } else {
            avhn avhnVar = asrsVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            F(avhnVar);
        }
        if (asrsVar != null && (asrsVar.b & 4) != 0) {
            asrt asrtVar = asrsVar.d;
            if (asrtVar == null) {
                asrtVar = asrt.a;
            }
            if (asrtVar.b == 121291266) {
                assyVar = (assy) asrtVar.c;
            } else {
                assyVar = assy.a;
            }
            arag aragVar = assyVar.b;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            this.o = ajgl.b(aragVar);
            r.getText().clear();
            K(u(), false);
            r.setEnabled(true);
            r.setHint(i());
            this.p = assyVar.c;
            this.q = assyVar.g;
            r.setFilters(new InputFilter[]{this.z});
        }
        aunb aunbVar = asrsVar.h;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        ViewGroup L2 = L();
        if (L2 != null && aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            final apoj apojVar2 = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
            final View inflate = LayoutInflater.from(this.x).inflate(R.layout.live_chat_action_panel_pill, (ViewGroup) null);
            arhs arhsVar = apojVar2.g;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            if ((arhsVar.b & 1) != 0) {
                ajxz ajxzVar = this.d;
                arhs arhsVar2 = apojVar2.g;
                if (arhsVar2 == null) {
                    arhsVar2 = arhs.a;
                }
                arhr b = arhr.b(arhsVar2.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                int a = ajxzVar.a(b);
                if (a != 0) {
                    ((ImageView) inflate.findViewById(R.id.pill_icon)).setImageDrawable(akf.a(this.a, a));
                }
            }
            this.s = apojVar2.q;
            TextView textView = (TextView) inflate.findViewById(R.id.pill_label);
            arag aragVar2 = apojVar2.i;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            textView.setText(ajgl.b(aragVar2));
            inflate.setTag(new acte(apojVar2.t));
            inflate.setOnClickListener(new View.OnClickListener() { // from class: abof
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abop abopVar = abop.this;
                    View view2 = inflate;
                    apoj apojVar3 = apojVar2;
                    abkm abkmVar = abopVar.l;
                    if (abkmVar != null) {
                        abkmVar.d();
                    }
                    Editable h = abopVar.h();
                    amup amupVar = null;
                    assu a2 = !TextUtils.isEmpty(h) ? abopVar.f.a(h) : null;
                    Object tag = view2.getTag();
                    if (tag instanceof acte) {
                        abopVar.b.H(3, (acte) tag, null);
                    }
                    aafo aafoVar = abopVar.c;
                    apzg apzgVar = apojVar3.p;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    if (a2 != null) {
                        amupVar = amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", a2);
                    }
                    aafoVar.c(apzgVar, amupVar);
                }
            });
            inflate.setVisibility(4);
            L2.addView(inflate);
        }
        ViewGroup q2 = q();
        if (q2 != null) {
            q2.removeAllViews();
            if (asrsVar.f.size() != 0 && this.i) {
                for (asrq asrqVar : asrsVar.f) {
                    if (asrqVar.b == 132562777) {
                        arhs arhsVar3 = ((asqu) asrqVar.c).d;
                        if (arhsVar3 == null) {
                            arhsVar3 = arhs.a;
                        }
                        arhr b2 = arhr.b(arhsVar3.c);
                        if (b2 == null) {
                            b2 = arhr.UNKNOWN;
                        }
                        if (b2 != arhr.EMOJI) {
                            if (asrqVar.b == 132562777) {
                                asquVar = (asqu) asrqVar.c;
                            } else {
                                asquVar = asqu.a;
                            }
                            asrr[] asrrVarArr = (asrr[]) asrsVar.e.toArray(new asrr[0]);
                            int length = asrrVarArr.length;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= length) {
                                    supportedPickerPanelWrapper = null;
                                    break;
                                }
                                asrr asrrVar = asrrVarArr[i4];
                                if (asrrVar != null) {
                                    int i5 = asrrVar.b;
                                    if (i5 == 129042058) {
                                        supportedPickerPanelWrapper = new CreatorSupportPickerPanelWrapper((asqj) asrrVar.c);
                                    } else if (i5 == 189846535) {
                                        supportedPickerPanelWrapper = new ProductPickerPanelWrapper((assi) asrrVar.c);
                                    }
                                    if (supportedPickerPanelWrapper == null && (asquVar.b & 1) != 0 && asquVar.c.equals(supportedPickerPanelWrapper.a()) && supportedPickerPanelWrapper.b()) {
                                        break;
                                    }
                                    i4++;
                                }
                                supportedPickerPanelWrapper = null;
                                if (supportedPickerPanelWrapper == null) {
                                }
                                i4++;
                            }
                            M(q2, asquVar, supportedPickerPanelWrapper);
                            K(q2, true);
                        }
                    }
                    if (asrqVar.b == 65153809) {
                        arhs arhsVar4 = ((apoj) asrqVar.c).g;
                        if (arhsVar4 == null) {
                            arhsVar4 = arhs.a;
                        }
                        arhr b3 = arhr.b(arhsVar4.c);
                        if (b3 == null) {
                            b3 = arhr.UNKNOWN;
                        }
                        if (b3 != arhr.EMOJI) {
                            if (asrqVar.b == 65153809) {
                                apojVar = (apoj) asrqVar.c;
                            } else {
                                apojVar = apoj.a;
                            }
                            if ((apojVar.b & 32) != 0) {
                                arhs arhsVar5 = apojVar.g;
                                if (arhsVar5 == null) {
                                    arhsVar5 = arhs.a;
                                }
                                View k = k(arhsVar5);
                                aovs aovsVar = apojVar.s;
                                if (aovsVar == null) {
                                    aovsVar = aovs.a;
                                }
                                if ((aovsVar.b & 1) != 0) {
                                    aovs aovsVar2 = apojVar.s;
                                    if (aovsVar2 == null) {
                                        aovsVar2 = aovs.a;
                                    }
                                    aovr aovrVar = aovsVar2.c;
                                    if (aovrVar == null) {
                                        aovrVar = aovr.a;
                                    }
                                    k.setContentDescription(aovrVar.c);
                                }
                                k.setOnClickListener(new aboh(this, apojVar, 1));
                                q2.addView(k);
                                k.setTag(R.id.live_chat_picker_toggle_button_tag, apojVar.k);
                            }
                        }
                    }
                    K(q2, true);
                }
            }
        }
        Iterator it = asrsVar.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            asrr asrrVar2 = (asrr) it.next();
            if (asrrVar2.b == 126326492) {
                this.m = (aqus) asrrVar2.c;
                break;
            }
        }
        if (this.m != null) {
            t().setImageResource(2131231434);
        }
        P(true);
        if (this.g.h()) {
            TextWatcher c = this.f.c(r());
            r().removeTextChangedListener(c);
            r().addTextChangedListener(c);
        }
        if (this.k) {
            return;
        }
        this.h.a(asrsVar, r());
    }

    @Override // defpackage.abko
    public final void e() {
        if (this.f24J) {
            return;
        }
        EditText r = r();
        r.setRawInputType(1);
        r.setOnEditorActionListener(new aboo(this));
        r.addTextChangedListener(this.y);
        r.setMaxLines(1);
        ajvs ajvsVar = new ajvs(r, this.a.getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) this.a.getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift));
        this.B = ajvsVar;
        r.addTextChangedListener(ajvsVar);
        u().setOnClickListener(new aboe(this, 1));
        ViewGroup L = L();
        if (L != null) {
            L.setOnClickListener(new aboe(this));
        }
        this.C = l().getLayoutParams().height;
        D(false);
        this.f.d();
        this.f24J = true;
    }

    @Override // defpackage.abko
    public void f() {
        ViewGroup q = q();
        if (q != null) {
            q.removeAllViews();
        }
        D(false);
        K(u(), false);
        if (w() != null) {
            w().setText((CharSequence) null);
        }
    }

    public abstract int g(arhr arhrVar, boolean z);

    public final Editable h() {
        return r().getText();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Spanned i() {
        return this.o;
    }

    @Override // defpackage.zdx
    public final void j() {
        throw null;
    }

    public abstract View k(arhs arhsVar);

    public abstract View l();

    public abstract View m();

    public abstract View n();

    @Override // defpackage.akcc
    public final void nb() {
        this.f.d();
        r().requestFocus();
        zag.p(r());
        P(false);
    }

    public abstract View o();

    public abstract ViewGroup p();

    public abstract ViewGroup q();

    public abstract EditText r();

    /* JADX INFO: Access modifiers changed from: protected */
    public final ImageView s() {
        if (this.D == null) {
            this.D = (ImageView) n().findViewById(R.id.user_thumbnail);
        }
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ImageView t() {
        if (this.E == null) {
            this.E = (ImageView) n().findViewById(R.id.emoji_picker_icon);
        }
        return this.E;
    }

    public abstract ImageView u();

    /* JADX INFO: Access modifiers changed from: protected */
    public TextView v() {
        throw null;
    }

    public abstract TextView w();

    public abstract void x();

    /* JADX INFO: Access modifiers changed from: protected */
    public void y(final asss asssVar) {
        arag aragVar;
        apoj apojVar;
        SupportedPickerPanelWrapper supportedPickerPanelWrapper;
        TextView w2 = w();
        if (w2 == null) {
            return;
        }
        O(true);
        if ((asssVar.b & 2) != 0) {
            aragVar = asssVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) ajgl.b(aragVar));
        if ((asssVar.b & 4) != 0) {
            aunb aunbVar = asssVar.e;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            apoj apojVar2 = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
            arag aragVar2 = apojVar2.i;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            if (aragVar2.c.size() > 0) {
                arag aragVar3 = apojVar2.i;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
                Spanned b = ajgl.b(ajgl.g(((arai) aragVar3.c.get(0)).c.replace(" ", " ")));
                apzg apzgVar = apojVar2.p;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                amup k = amup.k("engagement_panel_id_key", "live-chat-item-section");
                append.append((CharSequence) "  •  ").append((CharSequence) b).setSpan(new aaft(this.c, k, apzgVar, false), append.length() - b.length(), append.length(), 33);
                append.setSpan(new TextAppearanceSpan(this.a, R.style.live_chat_members_only_upsell_button_style), append.length() - b.length(), append.length(), 33);
                w().setMovementMethod(LinkMovementMethod.getInstance());
                lj.M(w(), new abol(this, apzgVar, k));
            }
        }
        w2.setText(append);
        arhs arhsVar = asssVar.c;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        if ((arhsVar.b & 1) != 0) {
            Context context = this.a;
            ajxz ajxzVar = this.d;
            arhs arhsVar2 = asssVar.c;
            if (arhsVar2 == null) {
                arhsVar2 = arhs.a;
            }
            arhr b2 = arhr.b(arhsVar2.c);
            if (b2 == null) {
                b2 = arhr.UNKNOWN;
            }
            Drawable l = iy.l(po.b(context, ajxzVar.a(b2)));
            l.setTint(zhn.d(this.a, R.attr.ytIconDisabled));
            t().setImageDrawable(l);
            Q();
            B(false);
        }
        H(true);
        if ((asssVar.b & 8) != 0) {
            o().setClickable(false);
            m().setOnClickListener(new View.OnClickListener() { // from class: abok
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    abop abopVar = abop.this;
                    asss asssVar2 = asssVar;
                    abkm abkmVar = abopVar.l;
                    apzg apzgVar2 = asssVar2.f;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    abkmVar.h(apzgVar2);
                }
            });
        }
        K(u(), false);
        aopu<assr> aopuVar = asssVar.g;
        ViewGroup q = q();
        for (assr assrVar : aopuVar) {
            int i = assrVar.b;
            if (i == 65153809) {
                abhy abhyVar = this.K;
                Context context2 = (Context) abhyVar.a.get();
                context2.getClass();
                akbn akbnVar = (akbn) abhyVar.b.get();
                akbnVar.getClass();
                abhx abhxVar = new abhx(context2, akbnVar);
                if (assrVar.b == 65153809) {
                    apojVar = (apoj) assrVar.c;
                } else {
                    apojVar = apoj.a;
                }
                abhxVar.oK(new ajrs(), apojVar);
                TextView textView = abhxVar.a;
                if ((apojVar.b & 32) != 0) {
                    textView.setTag(R.id.live_chat_picker_toggle_button_tag, apojVar.k);
                    arhs arhsVar3 = apojVar.g;
                    if (arhsVar3 == null) {
                        arhsVar3 = arhs.a;
                    }
                    arhr b3 = arhr.b(arhsVar3.c);
                    if (b3 == null) {
                        b3 = arhr.UNKNOWN;
                    }
                    int g = g(b3, false);
                    Drawable drawable = abhxVar.a.getCompoundDrawables()[0];
                    if (drawable != null) {
                        yzh.e(drawable, g, PorterDuff.Mode.SRC_IN);
                    }
                }
                textView.setOnClickListener(new aboh(this, apojVar));
                q.addView(textView);
            } else if (i == 132562777 && this.i) {
                asqu asquVar = (asqu) assrVar.c;
                if ((asquVar.b & 2) != 0) {
                    arhs arhsVar4 = asquVar.d;
                    if (arhsVar4 == null) {
                        arhsVar4 = arhs.a;
                    }
                    arhr b4 = arhr.b(arhsVar4.c);
                    if (b4 == null) {
                        b4 = arhr.UNKNOWN;
                    }
                    if (b4 != arhr.UNKNOWN) {
                        asst[] asstVarArr = (asst[]) asssVar.h.toArray(new asst[0]);
                        int length = asstVarArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                supportedPickerPanelWrapper = null;
                                break;
                            }
                            asst asstVar = asstVarArr[i2];
                            if (asstVar != null) {
                                int i3 = asstVar.b;
                                if (i3 == 129042058) {
                                    supportedPickerPanelWrapper = new CreatorSupportPickerPanelWrapper((asqj) asstVar.c);
                                } else if (i3 == 189846535) {
                                    supportedPickerPanelWrapper = new ProductPickerPanelWrapper((assi) asstVar.c);
                                }
                                if (supportedPickerPanelWrapper == null && (asquVar.b & 1) != 0 && asquVar.c.equals(supportedPickerPanelWrapper.a()) && supportedPickerPanelWrapper.b()) {
                                    break;
                                }
                                i2++;
                            }
                            supportedPickerPanelWrapper = null;
                            if (supportedPickerPanelWrapper == null) {
                            }
                            i2++;
                        }
                        M(q, asquVar, supportedPickerPanelWrapper);
                        K(q, true);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z(atfa atfaVar) {
        arag aragVar;
        H(false);
        O(false);
        apok apokVar = atfaVar.h;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) != 0) {
            LayoutInflater from = LayoutInflater.from(this.a);
            ViewGroup p = p();
            Button button = (Button) from.inflate(R.layout.live_chat_action_button_grey_dark, p, false);
            apok apokVar2 = atfaVar.h;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            if ((apojVar.b & 16384) != 0) {
                final apzg apzgVar = apojVar.o;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                button.setOnClickListener(new View.OnClickListener() { // from class: aboi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        abop abopVar = abop.this;
                        abopVar.l.h(apzgVar);
                    }
                });
            }
            if ((apojVar.b & 256) != 0) {
                aragVar = apojVar.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            button.setText(ajgl.b(aragVar));
            p.addView(button, -1, this.a.getResources().getDimensionPixelOffset(R.dimen.live_chat_button_height));
            atfd atfdVar = atfaVar.f;
            if (atfdVar == null) {
                atfdVar = atfd.a;
            }
            atfc atfcVar = atfdVar.c;
            if (atfcVar == null) {
                atfcVar = atfc.a;
            }
            if ((atfcVar.b & 1) == 0) {
                return;
            }
            atfd atfdVar2 = atfaVar.f;
            if (atfdVar2 == null) {
                atfdVar2 = atfd.a;
            }
            atfc atfcVar2 = atfdVar2.c;
            if (atfcVar2 == null) {
                atfcVar2 = atfc.a;
            }
            arag aragVar2 = atfcVar2.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            Spanned b = ajgl.b(aragVar2);
            TextView textView = (TextView) from.inflate(R.layout.live_chat_button_subtext_light, p, false);
            textView.setText(b);
            p.addView(textView);
        }
    }
}
