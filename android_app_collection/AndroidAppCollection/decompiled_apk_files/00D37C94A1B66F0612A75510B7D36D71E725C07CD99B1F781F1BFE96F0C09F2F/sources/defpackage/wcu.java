package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AccountsListRenderer;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;
/* compiled from: PG */
/* renamed from: wcu  reason: default package */
/* loaded from: classes4.dex */
public final class wcu extends ajsl implements wdl {
    private final Spanned A;
    private final View B;
    private final ImageView C;
    private final TextView D;
    public final Context a;
    public final Resources b;
    public final wbc c;
    public final Handler d;
    public final ImageView e;
    public final View f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public int j;
    public boolean k;
    private AccountIdentity l;
    private final akbm m;
    private final aafo n;
    private final afvn o;
    private final wal p;
    private final ajmy q;
    private final wbg r;
    private final TextView s;
    private final TextView t;
    private final TextView u;
    private final TextView v;
    private final TextView x;
    private final CheckBox y;
    private final Spanned z;

    public wcu(Context context, final wdm wdmVar, afvn afvnVar, wal walVar, ajmy ajmyVar, wbg wbgVar, Activity activity, akbn akbnVar, aafo aafoVar, Handler handler, wbc wbcVar, ViewGroup viewGroup) {
        this.a = context;
        this.b = activity.getResources();
        this.c = wbcVar;
        this.l = (AccountIdentity) afvnVar.c();
        this.d = handler;
        this.o = afvnVar;
        this.p = walVar;
        this.q = ajmyVar;
        this.r = wbgVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_password_auth_layout, viewGroup, false);
        this.f = inflate;
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.reauth_opt_out);
        this.y = checkBox;
        checkBox.setOnCheckedChangeListener(new wcs(wbcVar));
        inflate.findViewById(R.id.close_button).setOnClickListener(new wbk(wbcVar, 5));
        this.s = (TextView) inflate.findViewById(R.id.title);
        this.t = (TextView) inflate.findViewById(R.id.description);
        this.u = (TextView) inflate.findViewById(R.id.other_methods_field);
        this.g = (TextView) inflate.findViewById(R.id.password_title);
        TextView textView = (TextView) inflate.findViewById(R.id.password_field);
        this.h = textView;
        this.v = (TextView) inflate.findViewById(R.id.account_email_field);
        this.x = (TextView) inflate.findViewById(R.id.forgot_password_field);
        this.B = inflate.findViewById(R.id.account_container);
        this.C = (ImageView) inflate.findViewById(R.id.account_thumbnail);
        this.D = (TextView) inflate.findViewById(R.id.email);
        this.e = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.i = (TextView) inflate.findViewById(R.id.error_message_field);
        akbm a = akbnVar.a((TextView) inflate.findViewById(R.id.confirm_button));
        this.m = a;
        a.d = new akbi() { // from class: wcp
            @Override // defpackage.akbi
            public final void oL(aopc aopcVar) {
                wcu.this.f(wdmVar);
            }
        };
        textView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: wcn
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i, KeyEvent keyEvent) {
                wcu wcuVar = wcu.this;
                wdm wdmVar2 = wdmVar;
                if (i == 6) {
                    wcuVar.f(wdmVar2);
                    return true;
                }
                return false;
            }
        });
        this.n = aafoVar;
        this.z = o(R.string.other_methods_suffix);
        this.A = o(R.string.use_fingerprint_suffix);
    }

    private final Spanned o(int i) {
        String string = this.b.getString(i);
        String string2 = this.b.getString(R.string.password_other_methods_prefix, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string2);
        spannableStringBuilder.setSpan(new wct(this, i), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    private final void p() {
        this.g.setTextColor(zhn.j(this.a, R.attr.ytThemedBlue).orElse(0));
        this.h.setText("");
        zag.o(this.i, false);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        n((PasswordAuthRendererOuterClass$PasswordAuthRenderer) obj);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((PasswordAuthRendererOuterClass$PasswordAuthRenderer) obj).i.I();
    }

    public final void f(wdm wdmVar) {
        String charSequence = this.h.getText().toString();
        if (charSequence.length() > 0) {
            wdmVar.a(charSequence, this.l, this);
        }
    }

    @Override // defpackage.wdl
    public final void g() {
        this.c.j(2);
    }

    @Override // defpackage.wdl
    public final void h() {
        this.d.post(new Runnable() { // from class: wcq
            @Override // java.lang.Runnable
            public final void run() {
                wcu wcuVar = wcu.this;
                if (!wcuVar.k || wcuVar.j > 0) {
                    wcuVar.g.setTextColor(zhn.j(wcuVar.a, R.attr.ytBrandRed).orElse(0));
                    wcuVar.h.setText("");
                    zag.m(wcuVar.i, wcuVar.b.getString(R.string.retry_password));
                    if (!wcuVar.k) {
                        return;
                    }
                    wcuVar.j--;
                    return;
                }
                wcuVar.c.j(2);
            }
        });
    }

    @Override // defpackage.wdl
    public final void j() {
    }

    @Override // defpackage.wdl
    public final void k() {
        this.c.j(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(final PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer) {
        wbg wbgVar = this.r;
        int r = akpq.r(passwordAuthRendererOuterClass$PasswordAuthRenderer.m);
        if (r == 0) {
            r = 1;
        }
        ankt a = wbgVar.a(r);
        if (a != null) {
            ylx.k(a, anjk.a, ngc.f, new ylw() { // from class: wco
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    final wcu wcuVar = wcu.this;
                    final PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer2 = passwordAuthRendererOuterClass$PasswordAuthRenderer;
                    final AccountIdentity accountIdentity = (AccountIdentity) obj;
                    wcuVar.d.post(new Runnable() { // from class: wcr
                        @Override // java.lang.Runnable
                        public final void run() {
                            wcu.this.m(passwordAuthRendererOuterClass$PasswordAuthRenderer2, accountIdentity);
                        }
                    });
                }
            });
        } else {
            m(passwordAuthRendererOuterClass$PasswordAuthRenderer, null);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        p();
        zag.o(this.i, false);
        this.j = 0;
    }

    public final void m(PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer, AccountIdentity accountIdentity) {
        AccountIdentity accountIdentity2;
        arag aragVar;
        arag aragVar2;
        SpannableStringBuilder spannableStringBuilder;
        arag aragVar3;
        aowy aowyVar;
        String str;
        aalc aalcVar;
        if (accountIdentity != null) {
            accountIdentity2 = accountIdentity;
        } else if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 256) != 0) {
            apwe apweVar = passwordAuthRendererOuterClass$PasswordAuthRenderer.k;
            if (apweVar == null) {
                apweVar = apwe.b;
            }
            accountIdentity2 = AccountIdentity.m(apweVar);
        } else {
            accountIdentity2 = (AccountIdentity) this.o.c();
        }
        this.l = accountIdentity2;
        waj b = this.p.b(accountIdentity2);
        if (b == null) {
            b = waj.a;
        }
        TextView textView = this.s;
        avhn avhnVar = null;
        if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 1) != 0) {
            aragVar = passwordAuthRendererOuterClass$PasswordAuthRenderer.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        CheckBox checkBox = this.y;
        if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 128) != 0) {
            aragVar2 = passwordAuthRendererOuterClass$PasswordAuthRenderer.j;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(checkBox, aafv.a(aragVar2, this.n, false));
        TextView textView2 = this.t;
        aopu<arag> aopuVar = passwordAuthRendererOuterClass$PasswordAuthRenderer.d;
        if (!aopuVar.isEmpty()) {
            spannableStringBuilder = new SpannableStringBuilder();
            boolean z = true;
            for (arag aragVar4 : aopuVar) {
                if (!z) {
                    spannableStringBuilder.append((CharSequence) System.getProperty("line.separator"));
                }
                spannableStringBuilder.append((CharSequence) aafv.a(aragVar4, this.n, true));
                z = false;
            }
        } else {
            spannableStringBuilder = null;
        }
        zag.m(textView2, spannableStringBuilder);
        TextView textView3 = this.x;
        if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 8) != 0) {
            aragVar3 = passwordAuthRendererOuterClass$PasswordAuthRenderer.g;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        zag.m(textView3, aafv.a(aragVar3, this.n, false));
        this.j = passwordAuthRendererOuterClass$PasswordAuthRenderer.e - 1;
        this.k = (passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 2) != 0;
        arag aragVar5 = passwordAuthRendererOuterClass$PasswordAuthRenderer.h;
        if (aragVar5 == null) {
            aragVar5 = arag.a;
        }
        aopc aopcVar = (aopc) apoj.a.createBuilder();
        aopcVar.copyOnWrite();
        apoj apojVar = (apoj) aopcVar.instance;
        aragVar5.getClass();
        apojVar.i = aragVar5;
        apojVar.b |= 256;
        aopcVar.copyOnWrite();
        apoj apojVar2 = (apoj) aopcVar.instance;
        apojVar2.d = 2;
        apojVar2.c = 1;
        this.m.b((apoj) aopcVar.mo39build(), null);
        p();
        if ((passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 512) != 0) {
            aunb aunbVar = passwordAuthRendererOuterClass$PasswordAuthRenderer.l;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            aowyVar = (aowy) aunbVar.qm(AccountsListRenderer.accountItemRenderer);
        } else {
            aowyVar = null;
        }
        if (aowyVar != null) {
            arag aragVar6 = aowyVar.d;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
            str = ajgl.b(aragVar6).toString();
        } else {
            str = b.b;
        }
        this.v.setText(str);
        avhn e = ((accountIdentity == null && (passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 256) == 0) || (aalcVar = b.e) == null || !aalcVar.f()) ? null : b.e.e();
        if (e != null) {
            avhnVar = e;
        } else if (aowyVar != null && (avhnVar = aowyVar.f) == null) {
            avhnVar = avhn.a;
        }
        if (avhnVar != null) {
            this.q.h(this.C, avhnVar);
            this.D.setText(str);
            zag.o(this.B, true);
            zag.o(this.v, false);
        }
        if (this.c.l()) {
            zag.m(this.u, passwordAuthRendererOuterClass$PasswordAuthRenderer.f ? this.z : this.A);
        } else if (accountIdentity != null || (passwordAuthRendererOuterClass$PasswordAuthRenderer.b & 256) != 0 || avhnVar != null) {
            zag.o(this.u, false);
        } else {
            zag.m(this.u, this.b.getString(R.string.use_password_only));
        }
    }
}
