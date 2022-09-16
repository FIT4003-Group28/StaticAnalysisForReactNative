package defpackage;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LiveChatMessageBuyFlowRendererOuterClass;
import com.google.protos.youtube.api.innertube.SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint;
import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;
import com.google.protos.youtube.api.innertube.YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abmo  reason: default package */
/* loaded from: classes.dex */
public abstract class abmo implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, View.OnFocusChangeListener, ajru, abrf, akcc, abrd {
    private final ImageView A;
    private final ImageView B;
    private final TextView C;
    private final View D;
    private final View E;
    private final TextView F;
    private final TextView G;
    private final LinearLayout H;
    private final TextView I;

    /* renamed from: J  reason: collision with root package name */
    private final ImageView f23J;
    private final TextView K;
    private final TextView L;
    private final TextView M;
    private final ImageView N;
    private final View O;
    private final View P;
    private final View Q;
    private final ViewGroup R;
    private final ImageView S;
    private final View T;
    private final View U;
    private final TextView V;
    private final ImageView W;
    private final TextView X;
    private final TextView Y;
    private final SeekBar Z;
    protected final View a;
    private final abmn aA;
    private final ajvo aC;
    private final ProgressBar aa;
    private final View ab;
    private final yfp ac;
    private final ajvi ad;
    private final abks ae;
    private final abjx af;
    private final abhz ag;
    private final abiq ah;
    private final abha ai;
    private final yzj aj;
    private final Map ak;
    private final int am;
    private int ao;
    private boolean ap;
    private long aq;
    private String ar;
    private abrj as;
    private apzg at;
    private final abrc au;
    private aqus av;
    private boolean aw;
    private boolean ax;
    private final acti ay;
    private boolean az;
    protected final TextView b;
    protected final ImageView c;
    protected final EditText d;
    protected final Context e;
    protected final Button f;
    protected boolean g;
    protected boolean h;
    public final aafo i;
    public final EditText j;
    public final ajnj k;
    public final ajnj l;
    public yfo m;
    public final abkj n;
    public long o;
    public int p;
    public asrm q;
    private NumberFormat r;
    private acum s;
    private final TextView t;
    private final TextView u;
    private final abkw v;
    private final ajxz w;
    private final TextWatcher x = new abmk(this, 1);
    private final TextWatcher y = new abmk(this);
    private final Runnable z = new abml(this);
    private final StringBuilder al = new StringBuilder();
    private ajrs an = new ajrs();
    private int aB = 1;

    public abmo(Context context, ajmr ajmrVar, abkw abkwVar, aafo aafoVar, ajxz ajxzVar, abkj abkjVar, abks abksVar, abjx abjxVar, abhz abhzVar, ajvm ajvmVar, yfp yfpVar, abiq abiqVar, abha abhaVar, yzj yzjVar) {
        this.e = context;
        this.v = abkwVar;
        this.i = aafoVar;
        this.w = ajxzVar;
        this.n = abkjVar;
        this.ae = abksVar;
        this.af = abjxVar;
        this.ag = abhzVar;
        this.ac = yfpVar;
        this.ah = abiqVar;
        this.ai = abhaVar;
        this.aj = yzjVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.live_chat_purchase_flow_item, (ViewGroup) null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.A = (ImageView) inflate.findViewById(R.id.back_button);
        this.B = (ImageView) inflate.findViewById(R.id.help_button);
        this.f = (Button) inflate.findViewById(R.id.buy_button);
        this.C = (TextView) inflate.findViewById(R.id.message_ticker_duration);
        this.V = (TextView) inflate.findViewById(R.id.character_count);
        this.U = inflate.findViewById(R.id.purchase_flow_input_panel_container);
        this.E = inflate.findViewById(R.id.heading);
        this.F = (TextView) inflate.findViewById(R.id.heading_title);
        this.G = (TextView) inflate.findViewById(R.id.heading_description);
        this.D = inflate.findViewById(R.id.message_header);
        this.O = inflate.findViewById(R.id.purchase_flow_message_settings_container);
        this.P = inflate.findViewById(R.id.purchase_flow_currency_and_price_container);
        this.Q = inflate.findViewById(R.id.message_body);
        this.K = (TextView) inflate.findViewById(R.id.author_name);
        this.L = (TextView) inflate.findViewById(R.id.header_text);
        this.M = (TextView) inflate.findViewById(R.id.header_subtext);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.header_currency_image);
        this.N = imageView;
        EditText editText = (EditText) inflate.findViewById(R.id.edit_message);
        this.d = editText;
        this.H = (LinearLayout) inflate.findViewById(R.id.footer_body);
        this.I = (TextView) inflate.findViewById(R.id.footer_text);
        this.f23J = (ImageView) inflate.findViewById(R.id.footer_icon);
        this.c = (ImageView) inflate.findViewById(R.id.author_image);
        this.Z = (SeekBar) inflate.findViewById(R.id.tier_seek_bar);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.purchase_flow_currency_image);
        this.W = imageView2;
        this.X = (TextView) inflate.findViewById(R.id.currency_symbol);
        this.j = (EditText) inflate.findViewById(R.id.buy_price);
        this.Y = (TextView) inflate.findViewById(R.id.currency_code);
        this.t = (TextView) inflate.findViewById(R.id.error_message);
        this.u = (TextView) inflate.findViewById(R.id.public_disclosure);
        this.aa = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.ab = inflate.findViewById(R.id.buy_frame);
        this.T = inflate.findViewById(R.id.underline);
        this.S = (ImageView) inflate.findViewById(R.id.emoji_picker_icon);
        this.R = (ViewGroup) inflate.findViewById(R.id.emoji_button_container);
        this.ay = abiqVar.p;
        ajvq ajvqVar = new ajvq(inflate);
        this.ad = new ajvi(context, ajxzVar, ajvmVar, true, ajvqVar, false);
        this.aC = new ajvo(context, ajvmVar, true, ajvqVar);
        this.am = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_overlay_action_panel_container_margin_bottom);
        this.k = new ajnj(ajmrVar, imageView2);
        this.l = new ajnj(ajmrVar, imageView);
        this.au = new abrc();
        editText.setFilters(new InputFilter[]{new abkz()});
        editText.addTextChangedListener(new ajvs(editText, context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift)));
        akel.m(inflate, this);
        HashMap hashMap = new HashMap();
        this.ak = hashMap;
        hashMap.put("YpcTransactionListener", new abmm(this));
        this.aA = new abmn(this);
    }

    private final void A(boolean z) {
        int i = ((LinearLayout.LayoutParams) this.U.getLayoutParams()).bottomMargin;
        h(z);
        if (z) {
            if (this.ax) {
                this.O.setVisibility(8);
                i = this.am;
            }
            this.n.f((ViewGroup) this.a, this.av, this.d, this);
        } else {
            this.n.d();
            if (this.ax) {
                this.O.setVisibility(0);
                i = 0;
            }
        }
        zgd.t(this.U, zgd.e(i), ViewGroup.MarginLayoutParams.class);
    }

    private final void B(int i, int i2) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.D.getBackground();
        GradientDrawable gradientDrawable2 = (GradientDrawable) this.Q.getBackground();
        GradientDrawable gradientDrawable3 = (GradientDrawable) this.H.getBackground();
        if (gradientDrawable == null || gradientDrawable2 == null || gradientDrawable3 == null) {
            return;
        }
        abrc abrcVar = this.au;
        if (i == abrcVar.c) {
            return;
        }
        ValueAnimator valueAnimator = abrcVar.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = abrcVar.b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Object[] objArr = new Object[2];
        int i3 = abrcVar.c;
        if (i3 == 0) {
            i3 = i;
        }
        objArr[0] = Integer.valueOf(i3);
        objArr[1] = Integer.valueOf(i);
        abrcVar.a = ValueAnimator.ofObject(argbEvaluator, objArr);
        abrcVar.a.setDuration(250L);
        abrcVar.a.addUpdateListener(new abra(gradientDrawable));
        AnimatorSet animatorSet = new AnimatorSet();
        ArgbEvaluator argbEvaluator2 = new ArgbEvaluator();
        Object[] objArr2 = new Object[2];
        int i4 = abrcVar.d;
        if (i4 == 0) {
            i4 = i2;
        }
        objArr2[0] = Integer.valueOf(i4);
        objArr2[1] = Integer.valueOf(i2);
        abrcVar.b = ValueAnimator.ofObject(argbEvaluator2, objArr2);
        abrcVar.b.setDuration(250L);
        abrcVar.b.addUpdateListener(new abrb(gradientDrawable2, gradientDrawable3));
        animatorSet.play(abrcVar.a).with(abrcVar.b);
        abrcVar.d = i2;
        animatorSet.start();
        abrcVar.c = i;
    }

    private final double r(long j) {
        long j2 = this.aq;
        if (j2 == 0) {
            return 0.0d;
        }
        double d = j - (j % j2);
        Double.isNaN(d);
        return d / 1000000.0d;
    }

    private final asro s() {
        asrm asrmVar = this.q;
        if (asrmVar == null || asrmVar.g.size() == 0 || this.ao > this.q.g.size()) {
            return null;
        }
        asrm asrmVar2 = this.q;
        return (asro) asrmVar2.g.get(this.ao);
    }

    private final String t(long j) {
        return String.format("%s %s", g(j), this.Y.getText());
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u() {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abmo.u():void");
    }

    private final void v(assy assyVar) {
        EditText editText = this.d;
        arag aragVar = assyVar.b;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        editText.setHint(ajgl.b(aragVar));
        asrm asrmVar = this.q;
        boolean z = true;
        if (asrmVar != null) {
            assu assuVar = asrmVar.f;
            if (assuVar == null) {
                assuVar = assu.a;
            }
            if (assuVar.c.size() > 0 && !this.az) {
                assu assuVar2 = this.q.f;
                if (assuVar2 == null) {
                    assuVar2 = assu.a;
                }
                assu assuVar3 = assuVar2;
                arag a = this.n.c.a(assuVar3);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Spanned b = ajgl.b(a);
                spannableStringBuilder.append((CharSequence) b);
                this.aC.g(a, b, spannableStringBuilder, new StringBuilder(), assuVar3, this.d.getId());
                this.d.setText(spannableStringBuilder);
                this.az = true;
            }
        }
        EditText editText2 = this.d;
        int i = assyVar.d;
        if (i != editText2.getCurrentHintTextColor()) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(editText2.getCurrentHintTextColor()), Integer.valueOf(i));
            ofObject.setDuration(250L);
            ofObject.addUpdateListener(new abqy(editText2, 2, null));
            ofObject.start();
        }
        EditText editText3 = this.d;
        final int i2 = assyVar.f;
        final int i3 = assyVar.e;
        editText3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: abmi
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                abmo.this.q(z2, i2, i3);
            }
        });
        q(this.d.hasFocus(), i2, i3);
        this.p = assyVar.g;
        int i4 = assyVar.f;
        double red = Color.red(i4);
        Double.isNaN(red);
        double green = Color.green(i4);
        Double.isNaN(green);
        double d = (red * 0.2126d) + (green * 0.7152d);
        double blue = Color.blue(i4);
        Double.isNaN(blue);
        if (d + (blue * 0.0722d) <= 25.0d) {
            z = false;
        }
        this.aw = z;
        h(this.n.h);
        this.Q.setVisibility(0);
    }

    private final void w() {
        asro s = s();
        if (s != null) {
            int i = s.b & 64;
            arag aragVar = null;
            if (i == 0) {
                this.C.setText((CharSequence) null);
            } else {
                TextView textView = this.C;
                if (i != 0 && (aragVar = s.g) == null) {
                    aragVar = arag.a;
                }
                textView.setText(ajgl.b(aragVar));
            }
            long j = s.e;
            this.o = j;
            o(j == 0 ? 0 : this.n.b(this.d.getText(), this.p), this.o);
        }
    }

    private final void x() {
        asro s = s();
        if (s != null) {
            long j = s.c;
            this.j.setText(g(j));
            this.Z.setContentDescription(t(j));
        }
    }

    private final void y(asrd asrdVar) {
        arag aragVar;
        if (asrdVar == null) {
            return;
        }
        TextView textView = this.I;
        if ((asrdVar.b & 2) != 0) {
            aragVar = asrdVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        if ((asrdVar.b & 1) != 0) {
            ajxz ajxzVar = this.w;
            arhs arhsVar = asrdVar.c;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            int a = ajxzVar.a(b);
            if (a != 0) {
                this.f23J.setImageResource(a);
            }
        }
        this.H.setVisibility(0);
    }

    private final void z(int i) {
        zgd.t(this.I, zgd.p(i), ViewGroup.MarginLayoutParams.class);
        zgd.t(this.f23J, zgd.p(i), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    public abstract void d(avhn avhnVar);

    public abstract void e();

    public final long f(String str) {
        Number parse;
        try {
            if (this.ap) {
                parse = this.as.b.parse(str);
            } else {
                parse = this.r.parse(str);
            }
            return new BigDecimal(parse.doubleValue(), MathContext.DECIMAL64).setScale((int) (Math.log10(1000000.0d) - Math.log10(this.aq)), RoundingMode.HALF_EVEN).scaleByPowerOfTen(6).longValue();
        } catch (ParseException unused) {
            zep.b("Failed to parse buyBucket purchase amount.");
            return 0L;
        }
    }

    public final String g(long j) {
        if (this.ap) {
            abrj abrjVar = this.as;
            String format = abrjVar.b.format(r(j));
            return (!abrjVar.f || !"BYN".equals(abrjVar.a)) ? format : format.replaceAll("(?i)BYR", "BYN");
        }
        return this.r.format(r(j));
    }

    public final void h(boolean z) {
        if (z) {
            this.S.setImageResource(true != this.aw ? 2131231429 : 2131231431);
            this.S.setContentDescription(this.e.getResources().getString(R.string.close_emoji_picker_button_cd));
            return;
        }
        this.S.setImageResource(true != this.aw ? 2131231428 : 2131231430);
        this.S.setContentDescription(this.e.getResources().getString(R.string.open_emoji_picker_button_cd));
    }

    public final void i(CharSequence charSequence) {
        n(false);
        zag.m(this.t, charSequence);
    }

    public final void j() {
        Object c = this.an.c("listenerKey");
        abjx abjxVar = this.af;
        if (abjxVar != null) {
            abjxVar.a(true != this.ax ? 2 : 3, 3);
        }
        if (c instanceof abri) {
            ((abri) c).r();
        }
        for (abko abkoVar : this.ag.a) {
            abkoVar.c();
        }
    }

    @Override // defpackage.abrf
    public final void k() {
        n(false);
    }

    public final void l(String str) {
        asrw asrwVar;
        avhn avhnVar;
        asro s = s();
        if (TextUtils.isEmpty(str) && s != null) {
            str = g(s.c);
        }
        if (TextUtils.isEmpty(str)) {
            this.N.setVisibility(8);
            return;
        }
        if (s == null) {
            avhnVar = null;
        } else {
            asrn asrnVar = s.f;
            if (asrnVar == null) {
                asrnVar = asrn.a;
            }
            if (asrnVar.b == 132496275) {
                asrwVar = (asrw) asrnVar.c;
            } else {
                asrwVar = asrw.a;
            }
            aqjv aqjvVar = asrwVar.j;
            if (aqjvVar == null) {
                aqjvVar = aqjv.a;
            }
            avhnVar = aqjvVar.b;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        }
        if (akel.A(avhnVar)) {
            this.N.setVisibility(0);
            this.l.k(avhnVar);
        } else {
            this.N.setVisibility(8);
        }
        if (!this.ap || TextUtils.isEmpty(this.ar)) {
            this.L.setText(str);
        } else {
            this.L.setText(this.e.getResources().getString(R.string.live_chat_purchase_amount, this.ar, str));
        }
    }

    @Override // defpackage.abrd
    public final void n(boolean z) {
        if (this.aa != null) {
            int i = 0;
            this.f.setVisibility(true != z ? 0 : 8);
            ProgressBar progressBar = this.aa;
            if (true != z) {
                i = 8;
            }
            progressBar.setVisibility(i);
            this.ab.setBackground(z ? this.f.getBackground() : null);
            return;
        }
        this.f.setEnabled(!z);
    }

    @Override // defpackage.akcc
    public final void nb() {
        A(false);
        if (this.d.getVisibility() == 0) {
            this.d.requestFocus();
            zag.p(this.d);
        }
    }

    public final void o(int i, long j) {
        String string = this.e.getResources().getString(R.string.character_count, Integer.valueOf(i), Long.valueOf(j));
        int d = ake.d(this.e, this.v.a(2));
        int d2 = zhn.d(this.e, R.attr.ytTextSecondary);
        this.V.setText(string);
        if (i > this.o) {
            this.V.setTextColor(d);
            this.g = true;
        } else if (this.g) {
            this.V.setTextColor(d2);
            this.g = false;
        }
        e();
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        asrh asrhVar;
        arag aragVar2;
        apoj apojVar;
        int i;
        arag aragVar3;
        apoj apojVar2;
        apoj apojVar3;
        final aqmu aqmuVar;
        asrm asrmVar = (asrm) obj;
        if (ajrsVar != null) {
            this.an = ajrsVar;
        }
        abks abksVar = this.ae;
        if (abksVar != null) {
            this.ax = abksVar.c;
        }
        this.q = asrmVar;
        Iterator it = asrmVar.n.iterator();
        while (true) {
            aragVar = null;
            if (!it.hasNext()) {
                this.av = null;
                break;
            }
            asrr asrrVar = (asrr) it.next();
            if (asrrVar.b == 126326492) {
                this.av = (aqus) asrrVar.c;
                break;
            }
        }
        boolean z = true;
        this.ap = asrmVar.c == 4;
        this.A.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.L.setOnClickListener(this);
        aunb aunbVar = asrmVar.p;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aoqu k = ajjh.k(aunbVar);
        if (k instanceof avwi) {
            if (this.m == null) {
                yfp yfpVar = this.ac;
                ViewStub viewStub = (ViewStub) this.a.findViewById(R.id.balance_stub);
                aafo aafoVar = (aafo) yfpVar.a.get();
                aafoVar.getClass();
                ajmy ajmyVar = (ajmy) yfpVar.b.get();
                ajmyVar.getClass();
                aagi aagiVar = (aagi) yfpVar.c.get();
                aagiVar.getClass();
                viewStub.getClass();
                this.m = new yfo(aafoVar, ajmyVar, aagiVar, viewStub);
            }
            this.m.oK(ajrsVar, (avwi) k);
        }
        this.d.addTextChangedListener(this.x);
        if (this.av == null) {
            this.S.setVisibility(8);
            this.R.setOnClickListener(null);
        } else {
            this.S.setVisibility(0);
            this.R.setOnClickListener(this);
            h(false);
        }
        EditText editText = this.d;
        editText.addTextChangedListener(this.n.c(editText));
        asrm asrmVar2 = this.q;
        if (asrmVar2 != null) {
            asrl asrlVar = asrmVar2.m;
            if (asrlVar == null) {
                asrlVar = asrl.a;
            }
            if (asrlVar.b == 53345347) {
                asrk asrkVar = this.q.l;
                if (asrkVar == null) {
                    asrkVar = asrk.a;
                }
                if (asrkVar.b == 65153809) {
                    apojVar2 = (apoj) asrkVar.c;
                } else {
                    apojVar2 = apoj.a;
                }
                if ((apojVar2.b & 32) != 0) {
                    ajxz ajxzVar = this.w;
                    asrk asrkVar2 = this.q.l;
                    if (asrkVar2 == null) {
                        asrkVar2 = asrk.a;
                    }
                    if (asrkVar2.b == 65153809) {
                        apojVar3 = (apoj) asrkVar2.c;
                    } else {
                        apojVar3 = apoj.a;
                    }
                    arhs arhsVar = apojVar3.g;
                    if (arhsVar == null) {
                        arhsVar = arhs.a;
                    }
                    arhr b = arhr.b(arhsVar.c);
                    if (b == null) {
                        b = arhr.UNKNOWN;
                    }
                    int a = ajxzVar.a(b);
                    if (a != 0) {
                        this.B.setImageResource(a);
                    }
                    asrl asrlVar2 = this.q.m;
                    if (asrlVar2 == null) {
                        asrlVar2 = asrl.a;
                    }
                    if (asrlVar2.b == 53345347) {
                        aqmuVar = (aqmu) asrlVar2.c;
                    } else {
                        aqmuVar = aqmu.a;
                    }
                    this.B.setOnClickListener(new View.OnClickListener() { // from class: abmh
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            abmo abmoVar = abmo.this;
                            aqmu aqmuVar2 = aqmuVar;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            boolean z2 = true;
                            for (arag aragVar4 : aqmuVar2.f) {
                                if (!z2) {
                                    spannableStringBuilder.append((CharSequence) "\n\n");
                                }
                                spannableStringBuilder.append((CharSequence) aafv.a(aragVar4, abmoVar.i, false));
                                z2 = false;
                            }
                            View inflate = View.inflate(abmoVar.e, R.layout.live_chat_simple_text_view, null);
                            Resources resources = abmoVar.e.getResources();
                            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_simple_dialog_text_padding);
                            TextView textView = (TextView) inflate.findViewById(R.id.text);
                            textView.setTextColor(zhn.d(abmoVar.e, R.attr.ytTextSecondary));
                            kz.s(textView, com.google.cardboard.sdk.R.style.TextAppearance_AppCompat_Subhead);
                            textView.setLineSpacing(resources.getDimensionPixelOffset(R.dimen.live_chat_dialog_message_line_spacing_extra), 1.0f);
                            textView.setPaddingRelative(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, 0);
                            textView.setText(spannableStringBuilder);
                            ScrollView scrollView = new ScrollView(abmoVar.e);
                            scrollView.addView(inflate);
                            nw nwVar = new nw(abmoVar.e);
                            nwVar.o(aqmuVar2.d);
                            nwVar.h(17039370, null);
                            nwVar.p(scrollView);
                            nwVar.b().show();
                        }
                    });
                }
            }
        }
        if ((asrmVar.b & 262144) != 0) {
            TextView textView = this.u;
            arag aragVar4 = asrmVar.s;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            textView.setText(ajgl.b(aragVar4));
            this.u.setVisibility(0);
        }
        asrm asrmVar3 = this.q;
        if (asrmVar3 != null) {
            asri asriVar = asrmVar3.k;
            if (asriVar == null) {
                asriVar = asri.a;
            }
            if (asriVar.b == 65153809) {
                asri asriVar2 = this.q.k;
                if (asriVar2 == null) {
                    asriVar2 = asri.a;
                }
                if (asriVar2.b == 65153809) {
                    apojVar = (apoj) asriVar2.c;
                } else {
                    apojVar = apoj.a;
                }
                if (apojVar.c != 1 || (i = akzj.l(((Integer) apojVar.d).intValue())) == 0) {
                    i = 1;
                }
                this.aB = i;
                m();
                apzg apzgVar = apojVar.n;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                this.at = apzgVar;
                Button button = this.f;
                if ((apojVar.b & 256) != 0) {
                    aragVar3 = apojVar.i;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                } else {
                    aragVar3 = null;
                }
                button.setText(ajgl.b(aragVar3));
                acte acteVar = new acte(apojVar.t);
                this.s = acteVar;
                this.ay.n(acteVar);
            }
        }
        this.aq = asrmVar.i;
        if (this.ap) {
            String str = asrmVar.c == 4 ? (String) asrmVar.d : "";
            this.Y.setText(str);
            abrj abrjVar = new abrj(str, asrmVar.h);
            this.as = abrjVar;
            String str2 = abrjVar.e;
            this.ar = str2;
            this.X.setText(str2);
            this.Y.setVisibility(0);
            this.X.setVisibility(0);
            this.W.setVisibility(8);
        } else {
            this.Y.setVisibility(8);
            this.X.setVisibility(8);
            if (asrmVar.c == 21) {
                asrhVar = (asrh) asrmVar.d;
            } else {
                asrhVar = asrh.a;
            }
            aqjv aqjvVar = asrhVar.b;
            if (aqjvVar == null) {
                aqjvVar = aqjv.a;
            }
            avhn avhnVar = aqjvVar.b;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            if (akel.A(avhnVar)) {
                this.k.k(avhnVar);
                this.W.setVisibility(0);
            } else {
                this.W.setVisibility(8);
            }
        }
        TextView textView2 = this.b;
        arag aragVar5 = asrmVar.e;
        if (aragVar5 == null) {
            aragVar5 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar5));
        if (!TextUtils.isEmpty(this.b.getText())) {
            TextView textView3 = this.b;
            textView3.announceForAccessibility(textView3.getText());
        }
        this.ay.u(new acte(asrmVar.q), null);
        if (asrmVar.g.size() > 0) {
            int max = Math.max(0, asrmVar.g.size() - 1);
            this.Z.setMax(max);
            if (s() != null) {
                if (this.ap) {
                    NumberFormat numberFormat = NumberFormat.getInstance(this.as.c);
                    this.r = numberFormat;
                    numberFormat.setCurrency(this.as.d);
                } else {
                    NumberFormat numberFormat2 = NumberFormat.getInstance(Locale.US);
                    this.r = numberFormat2;
                    numberFormat2.setGroupingUsed(false);
                }
                this.r.setMaximumFractionDigits(0);
                x();
                w();
                l(null);
                asrm asrmVar4 = this.q;
                if ((asrmVar4.b & 8192) != 0) {
                    aunb aunbVar2 = asrmVar4.o;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    asrj asrjVar = (asrj) aunbVar2.qm(LiveChatMessageBuyFlowRendererOuterClass.liveChatMessageBuyFlowHeadingRenderer);
                    if (asrjVar != null) {
                        TextView textView4 = this.F;
                        if ((asrjVar.b & 1) != 0) {
                            aragVar2 = asrjVar.c;
                            if (aragVar2 == null) {
                                aragVar2 = arag.a;
                            }
                        } else {
                            aragVar2 = null;
                        }
                        textView4.setText(ajgl.b(aragVar2));
                        int i2 = asrjVar.b & 2;
                        if (i2 != 0) {
                            if (i2 != 0 && (aragVar = asrjVar.d) == null) {
                                aragVar = arag.a;
                            }
                            Spanned c = ajgl.c(aragVar, new ajgf() { // from class: abmj
                                @Override // defpackage.ajgf
                                public final ClickableSpan a(apzg apzgVar2) {
                                    return aaft.a(false).a(abmo.this.i, null, apzgVar2);
                                }
                            });
                            if (!TextUtils.isEmpty(c)) {
                                this.G.setText(c);
                                this.G.setMovementMethod(LinkMovementMethod.getInstance());
                                this.G.setVisibility(0);
                            }
                        }
                        this.E.setVisibility(0);
                    } else {
                        this.E.setVisibility(8);
                    }
                }
                this.Z.setOnSeekBarChangeListener(this);
                p(asrmVar.j);
                u();
                x();
                this.j.setOnFocusChangeListener(this);
                this.j.addTextChangedListener(this.y);
                String format = this.r.format(r(((asro) asrmVar.g.get(max)).d));
                int max2 = Math.max(0, format.length());
                this.al.setLength(0);
                this.al.append("0123456789");
                if (this.ap) {
                    DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(this.as.c);
                    String valueOf = String.valueOf(decimalFormatSymbols.getDecimalSeparator());
                    char groupingSeparator = decimalFormatSymbols.getGroupingSeparator();
                    if (this.as.b.getMinimumFractionDigits() > 0) {
                        this.al.append(valueOf);
                    }
                    if (this.as.b.isGroupingUsed() && format.indexOf(groupingSeparator) >= 0) {
                        this.al.append(groupingSeparator);
                    }
                    this.j.setKeyListener(DigitsKeyListener.getInstance(this.al.toString()));
                    this.j.setFilters(new InputFilter[]{new abnl(valueOf, groupingSeparator, max2, this.as.d.getDefaultFractionDigits())});
                } else {
                    this.j.setKeyListener(DigitsKeyListener.getInstance(this.al.toString()));
                    this.j.setFilters(new InputFilter[]{new InputFilter.LengthFilter(max2)});
                }
            }
        }
        if ((asrmVar.b & 131072) != 0 && asrmVar.r) {
            z = false;
        }
        zag.o(this.P, z);
        zag.o(this.Z, z);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String charSequence;
        if (view == this.A) {
            Object c = this.an.c("listenerKey");
            if (!(c instanceof abri)) {
                return;
            }
            ((abri) c).s();
        } else if (view == this.f) {
            n(true);
            abri abriVar = null;
            if (this.at.qn(SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.sendLiveChatMessageEndpoint)) {
                Object c2 = this.an.c("listenerKey");
                if (c2 instanceof abri) {
                    abriVar = (abri) c2;
                }
                abri abriVar2 = abriVar;
                HashMap hashMap = new HashMap();
                abiq abiqVar = this.ah;
                abha abhaVar = this.ai;
                yzj yzjVar = this.aj;
                abkj abkjVar = this.n;
                ajvj ajvjVar = abkjVar.c;
                assu a = abkjVar.a(this.d.getText());
                SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint = (SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint) this.at.qm(SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.sendLiveChatMessageEndpoint);
                if (sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.d.isEmpty()) {
                    if (Log.isLoggable("LiveChatBuyFlow", 6)) {
                        Log.e("LiveChatBuyFlow", "No client ID prefix provided for message endpoint!");
                    }
                    charSequence = String.valueOf(System.currentTimeMillis());
                } else {
                    charSequence = TextUtils.concat(sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.d, String.valueOf(System.currentTimeMillis())).toString();
                }
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new abjs(abiqVar, abhaVar, yzjVar, ajvjVar, a, charSequence, abriVar2, this, this.t));
                this.i.c(this.at, hashMap);
                return;
            }
            asro s = s();
            if (s == null) {
                return;
            }
            long f = f(this.j.getText().toString());
            if (this.at == null || f <= 0) {
                return;
            }
            this.ay.H(3, this.s, null);
            this.t.setVisibility(8);
            if (!this.n.c.h() || s.e == 0) {
                String text = s.e == 0 ? "" : this.d.getText();
                if (this.at.qn(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)) {
                    aopa mo52toBuilder = ((YpcGetCartEndpoint$YPCGetCartEndpoint) this.at.qm(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)).mo52toBuilder();
                    mo52toBuilder.copyOnWrite();
                    YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint = (YpcGetCartEndpoint$YPCGetCartEndpoint) mo52toBuilder.instance;
                    ypcGetCartEndpoint$YPCGetCartEndpoint.b |= 8;
                    ypcGetCartEndpoint$YPCGetCartEndpoint.f = f;
                    String charSequence2 = text.toString();
                    mo52toBuilder.copyOnWrite();
                    YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint2 = (YpcGetCartEndpoint$YPCGetCartEndpoint) mo52toBuilder.instance;
                    charSequence2.getClass();
                    ypcGetCartEndpoint$YPCGetCartEndpoint2.b |= 16;
                    ypcGetCartEndpoint$YPCGetCartEndpoint2.g = charSequence2;
                    aopc aopcVar = (aopc) this.at.mo52toBuilder();
                    aopcVar.e(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint, (YpcGetCartEndpoint$YPCGetCartEndpoint) mo52toBuilder.mo39build());
                    apzg apzgVar = (apzg) aopcVar.mo39build();
                    this.at = apzgVar;
                    this.i.c(apzgVar, this.ak);
                    return;
                } else if (!this.at.qn(YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.ypcHandleTransactionEndpoint)) {
                    return;
                } else {
                    apzg apzgVar2 = this.at;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("HANDLE_TRANSACTION_CALLBACK", this.aA);
                    hashMap2.put("PURCHASE_PRICE_MICROS", Long.valueOf(f));
                    hashMap2.put("CLIENT_CHAT_MESSAGE_TEXT", text);
                    this.i.c(apzgVar2, hashMap2);
                    return;
                }
            }
            assu a2 = this.n.a(this.d.getText());
            if (this.at.qn(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)) {
                aopa mo52toBuilder2 = ((YpcGetCartEndpoint$YPCGetCartEndpoint) this.at.qm(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)).mo52toBuilder();
                mo52toBuilder2.copyOnWrite();
                YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint3 = (YpcGetCartEndpoint$YPCGetCartEndpoint) mo52toBuilder2.instance;
                ypcGetCartEndpoint$YPCGetCartEndpoint3.b |= 8;
                ypcGetCartEndpoint$YPCGetCartEndpoint3.f = f;
                mo52toBuilder2.copyOnWrite();
                YpcGetCartEndpoint$YPCGetCartEndpoint ypcGetCartEndpoint$YPCGetCartEndpoint4 = (YpcGetCartEndpoint$YPCGetCartEndpoint) mo52toBuilder2.instance;
                a2.getClass();
                ypcGetCartEndpoint$YPCGetCartEndpoint4.h = a2;
                ypcGetCartEndpoint$YPCGetCartEndpoint4.b |= 32;
                aopc aopcVar2 = (aopc) this.at.mo52toBuilder();
                aopcVar2.e(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint, (YpcGetCartEndpoint$YPCGetCartEndpoint) mo52toBuilder2.mo39build());
                apzg apzgVar3 = (apzg) aopcVar2.mo39build();
                this.at = apzgVar3;
                this.i.c(apzgVar3, this.ak);
            } else if (!this.at.qn(YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.ypcHandleTransactionEndpoint)) {
            } else {
                apzg apzgVar4 = this.at;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("HANDLE_TRANSACTION_CALLBACK", this.aA);
                hashMap3.put("PURCHASE_PRICE_MICROS", Long.valueOf(f));
                hashMap3.put("LIVE_CHAT_RICH_MESSAGE_INPUT", a2);
                this.i.c(apzgVar4, hashMap3);
            }
        } else if (view != this.L) {
            if (view != this.R) {
                return;
            }
            A(!this.n.h);
        } else if (this.P.getVisibility() != 0 || this.j.getVisibility() != 0 || !this.j.requestFocus()) {
        } else {
            zag.p(this.j);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        EditText editText = this.j;
        if (view == editText) {
            if (z) {
                editText.getBackground().setColorFilter(zhn.d(this.e, R.attr.ytCallToAction), PorterDuff.Mode.SRC_ATOP);
                this.j.post(this.z);
                return;
            }
            editText.getBackground().setColorFilter(zhn.d(this.e, R.attr.ytTextPrimary), PorterDuff.Mode.SRC_ATOP);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.ao = i;
        if (z) {
            x();
            if (this.ao > 0) {
                this.d.requestFocus();
            }
        }
        w();
        l(null);
        u();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.j.setFocusable(false);
        this.j.setFocusableInTouchMode(false);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        asrw asrwVar;
        this.j.setFocusable(true);
        this.j.setFocusableInTouchMode(true);
        asro s = s();
        if (s != null) {
            asrn asrnVar = s.f;
            if (asrnVar == null) {
                asrnVar = asrn.a;
            }
            if (asrnVar.b == 132496275) {
                asrwVar = (asrw) asrnVar.c;
            } else {
                asrwVar = asrw.a;
            }
            if (asrwVar.c != 6 || !((Boolean) asrwVar.d).booleanValue()) {
                return;
            }
            zag.i(this.d);
        }
    }

    public final void p(long j) {
        asrm asrmVar = this.q;
        if (asrmVar == null || asrmVar.g.size() == 0) {
            return;
        }
        int size = this.q.g.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            asro asroVar = (asro) this.q.g.get(i2);
            if (i2 == 0) {
                if (j < asroVar.c) {
                    this.ao = i;
                    this.Z.setProgress(i);
                    this.Z.setContentDescription(t(j));
                    return;
                }
                i2 = 0;
            }
            if ((i2 == size - 1 && j > asroVar.d) || (j >= asroVar.c && j <= asroVar.d)) {
                i = i2;
                this.ao = i;
                this.Z.setProgress(i);
                this.Z.setContentDescription(t(j));
                return;
            }
            i2++;
        }
    }

    public final void q(boolean z, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.T.getLayoutParams();
        if (z) {
            layoutParams.height = this.T.getResources().getDimensionPixelOffset(R.dimen.live_chat_underline_height_focused);
            this.T.setBackgroundColor(i);
        } else {
            layoutParams.height = this.T.getResources().getDimensionPixelOffset(R.dimen.live_chat_underline_height_unfocused);
            this.T.setBackgroundColor(i2);
        }
        this.T.requestLayout();
    }

    @Override // defpackage.ajru
    public void qZ(ajsa ajsaVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m() {
        Drawable a;
        int i = this.aB;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 4) {
            a = akf.a(this.e, R.drawable.live_chat_action_button_background_grey_dark);
        } else if (i2 == 6) {
            a = akf.a(this.e, R.drawable.live_chat_action_button_background_payment);
        } else {
            a = zhn.g(this.e, R.attr.liveChatActionButtonBackgroundPrimary);
        }
        zag.k(this.f, a);
    }
}
