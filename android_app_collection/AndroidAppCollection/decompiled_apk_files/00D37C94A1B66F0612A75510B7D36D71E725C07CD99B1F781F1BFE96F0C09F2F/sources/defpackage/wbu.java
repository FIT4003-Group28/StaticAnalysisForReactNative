package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.libraries.youtube.account.identity.C$AutoValue_AccountIdentity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AccountsListRenderer;
/* compiled from: PG */
/* renamed from: wbu  reason: default package */
/* loaded from: classes4.dex */
public final class wbu extends ajsl implements wdl {
    public final Context a;
    public final Resources b;
    public final wbc c;
    public final View d;
    public final TextView e;
    public final TextView f;
    private AccountIdentity g;
    private final akbm h;
    private final Handler i;
    private final wdm j;
    private final wea k;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final TextView o;
    private Long p;

    public wbu(Context context, wdm wdmVar, Activity activity, akbn akbnVar, Handler handler, wbc wbcVar, wea weaVar, ViewGroup viewGroup) {
        this.a = context;
        this.b = activity.getResources();
        this.c = wbcVar;
        this.i = handler;
        this.j = wdmVar;
        this.k = weaVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.modal_unicorn_password_auth_layout, viewGroup, false);
        this.d = inflate;
        inflate.findViewById(R.id.close_button).setOnClickListener(new wbk(wbcVar, 2));
        this.l = (TextView) inflate.findViewById(R.id.title);
        this.m = (TextView) inflate.findViewById(R.id.description);
        this.e = (TextView) inflate.findViewById(R.id.password_title);
        TextView textView = (TextView) inflate.findViewById(R.id.password_field);
        this.n = textView;
        this.o = (TextView) inflate.findViewById(R.id.account_email_field);
        this.f = (TextView) inflate.findViewById(R.id.error_message_field);
        akbm a = akbnVar.a((TextView) inflate.findViewById(R.id.confirm_button));
        this.h = a;
        a.d = new akbi() { // from class: wbs
            @Override // defpackage.akbi
            public final void oL(aopc aopcVar) {
                wbu.this.f();
            }
        };
        textView.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: wbp
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView2, int i, KeyEvent keyEvent) {
                wbu wbuVar = wbu.this;
                if (i == 6) {
                    wbuVar.f();
                    return true;
                }
                return false;
            }
        });
    }

    private final void m() {
        this.e.setTextColor(zhn.j(this.a, R.attr.ytThemedBlue).orElse(0));
        this.n.setText("");
        zag.o(this.f, false);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        final aqyo aqyoVar = (aqyo) obj;
        aunb aunbVar = aqyoVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aowy aowyVar = (aowy) aunbVar.qm(AccountsListRenderer.accountItemRenderer);
        apwe apweVar = aqyoVar.c;
        if (apweVar == null) {
            apweVar = apwe.b;
        }
        this.g = AccountIdentity.m(apweVar);
        if ((aqyoVar.b & 8) == 0) {
            this.d.setVisibility(0);
        } else {
            this.p = Long.valueOf(aqyoVar.e);
            ylx.k(anii.h(this.k.d.a(), new wdx(((C$AutoValue_AccountIdentity) this.g).a, 2), anjk.a), anjk.a, new ylv() { // from class: wbq
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    wbu.this.d.setVisibility(0);
                }
            }, new ylw() { // from class: wbr
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj2) {
                    wbu wbuVar = wbu.this;
                    aqyo aqyoVar2 = aqyoVar;
                    Long l = (Long) obj2;
                    if (l == null || aqyoVar2.e != l.longValue()) {
                        wbuVar.d.setVisibility(0);
                    } else {
                        wbuVar.c.j(1);
                    }
                }
            });
        }
        TextView textView = this.l;
        arag aragVar = aowyVar.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.m;
        arag aragVar2 = aowyVar.e;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        aopc aopcVar = (aopc) apoj.a.createBuilder();
        aopc aopcVar2 = (aopc) arag.a.createBuilder();
        aopcVar2.copyOnWrite();
        arag aragVar3 = (arag) aopcVar2.instance;
        aragVar3.b |= 1;
        aragVar3.d = "Confirm";
        arag aragVar4 = (arag) aopcVar2.mo39build();
        aopcVar.copyOnWrite();
        apoj apojVar = (apoj) aopcVar.instance;
        aragVar4.getClass();
        apojVar.i = aragVar4;
        apojVar.b |= 256;
        aopcVar.copyOnWrite();
        apoj apojVar2 = (apoj) aopcVar.instance;
        apojVar2.d = 2;
        apojVar2.c = 1;
        this.h.b((apoj) aopcVar.mo39build(), null);
        m();
        TextView textView3 = this.o;
        arag aragVar5 = aowyVar.e;
        if (aragVar5 == null) {
            aragVar5 = arag.a;
        }
        textView3.setText(ajgl.b(aragVar5));
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        aqyo aqyoVar = (aqyo) obj;
        return null;
    }

    public final void f() {
        String charSequence = this.n.getText().toString();
        if (charSequence.length() > 0) {
            this.j.a(charSequence, this.g, this);
        }
        this.n.setText("");
    }

    @Override // defpackage.wdl
    public final void g() {
        this.c.j(2);
    }

    @Override // defpackage.wdl
    public final void h() {
        this.i.post(new Runnable() { // from class: wbt
            @Override // java.lang.Runnable
            public final void run() {
                wbu wbuVar = wbu.this;
                wbuVar.e.setTextColor(zhn.j(wbuVar.a, R.attr.ytBrandRed).orElse(0));
                zag.m(wbuVar.f, wbuVar.b.getString(R.string.retry_password));
            }
        });
    }

    @Override // defpackage.wdl
    public final void j() {
    }

    @Override // defpackage.wdl
    public final void k() {
        this.c.j(1);
        Long l = this.p;
        if (l != null) {
            ylx.i(this.k.d.b(new wdy(((C$AutoValue_AccountIdentity) this.g).a, l.longValue()), anjk.a), lgj.i);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        m();
        zag.o(this.f, false);
    }
}
