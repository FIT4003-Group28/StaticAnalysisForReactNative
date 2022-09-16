package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lal  reason: default package */
/* loaded from: classes3.dex */
public abstract class lal implements ajru {
    protected final View a;
    protected final TextView b;
    protected final ImageView c;
    protected final TextView d;
    protected final Context e;
    public apzg f = null;
    private final TextView g;
    private final ViewGroup h;
    private final ViewStub i;
    private final TextView j;
    private final View k;
    private final View.OnClickListener l;
    private final ajmy m;
    private final akep n;
    private final akbm o;
    private final ajxz p;
    private final fta q;
    private final fmg r;
    private final fny s;

    public lal(Context context, final aafo aafoVar, ajmy ajmyVar, akep akepVar, akbn akbnVar, ajxz ajxzVar, fmh fmhVar, fnz fnzVar, akem akemVar, int i, ViewGroup viewGroup) {
        this.e = context;
        ajmyVar.getClass();
        this.m = ajmyVar;
        this.p = ajxzVar;
        this.n = akepVar;
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.a = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.b = (TextView) inflate.findViewById(R.id.subtitle);
        this.c = (ImageView) inflate.findViewById(R.id.avatar);
        this.g = (TextView) inflate.findViewById(R.id.avatar_text);
        this.h = (ViewGroup) inflate.findViewById(R.id.badge_layout);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.title_badge);
        this.i = viewStub;
        TextView textView = (TextView) inflate.findViewById(R.id.subscribe_button);
        this.j = textView;
        View findViewById = inflate.findViewById(R.id.subscription_notification_view);
        this.k = findViewById;
        this.l = new View.OnClickListener() { // from class: lak
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lal lalVar = lal.this;
                aafo aafoVar2 = aafoVar;
                apzg apzgVar = lalVar.f;
                if (apzgVar != null) {
                    aafoVar2.c(apzgVar, null);
                }
            }
        };
        this.o = akbnVar.a((TextView) inflate.findViewById(R.id.action_button));
        this.q = new fta(ajxzVar, context, viewStub);
        fny a = findViewById != null ? fnzVar.a(findViewById) : null;
        this.s = a;
        this.r = fmhVar.a(textView, a);
        if (akemVar.d()) {
            akemVar.c(inflate, akemVar.a(inflate, null));
        } else {
            zav.d(inflate, zag.e(context, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(awdt awdtVar) {
        aunb aunbVar = awdtVar.l;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        int aH = akel.aH(((atfh) aunbVar.qm(MetadataBadgeRendererOuterClass.metadataBadgeRenderer)).d);
        return aH != 0 && aH == 17;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    protected abstract void d(awdt awdtVar);

    @Override // defpackage.ajru
    /* renamed from: e */
    public final void oK(ajrs ajrsVar, awdt awdtVar) {
        apzg apzgVar;
        arag aragVar;
        atfh atfhVar;
        avhn avhnVar;
        apoj apojVar;
        avhn avhnVar2;
        apmy apmyVar;
        apmy apmyVar2;
        apmy apmyVar3;
        View a;
        avaq avaqVar = null;
        if ((awdtVar.b & 2) != 0) {
            apzgVar = awdtVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        this.f = apzgVar;
        this.a.setOnClickListener(this.l);
        TextView textView = this.d;
        if ((awdtVar.b & 1) != 0) {
            aragVar = awdtVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        aunb aunbVar = awdtVar.l;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
            aunb aunbVar2 = awdtVar.l;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            atfhVar = (atfh) aunbVar2.qm(MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
        } else {
            atfhVar = null;
        }
        if (f(awdtVar)) {
            zai zaiVar = new zai(zhn.d(this.e, R.attr.ytVerifiedBadgeBackground));
            zaiVar.b(6, 2, zai.a(this.d.getTextSize(), 2) + 4, 2);
            this.d.setBackground(zaiVar);
            this.i.setVisibility(8);
        } else {
            this.d.setBackground(null);
            this.d.setPadding(0, 0, 0, 0);
            this.q.f(atfhVar);
        }
        this.c.setVisibility(8);
        this.g.setVisibility(8);
        this.o.b(null, null);
        Spanned b = ajgl.b(awdtVar.c == 9 ? (arag) awdtVar.d : null);
        if (!TextUtils.isEmpty(b)) {
            this.g.setVisibility(0);
            this.g.setText(b);
        } else {
            if (awdtVar.c == 5) {
                avhnVar = (avhn) awdtVar.d;
            } else {
                avhnVar = avhn.a;
            }
            if (!akel.A(avhnVar)) {
                if (awdtVar.c == 10) {
                    akbm akbmVar = this.o;
                    apok apokVar = (apok) awdtVar.d;
                    if ((apokVar.b & 1) != 0) {
                        apojVar = apokVar.c;
                        if (apojVar == null) {
                            apojVar = apoj.a;
                        }
                    } else {
                        apojVar = null;
                    }
                    akbmVar.b(apojVar, ajrsVar.a);
                }
            } else {
                ajmy ajmyVar = this.m;
                ImageView imageView = this.c;
                if (awdtVar.c == 5) {
                    avhnVar2 = (avhn) awdtVar.d;
                } else {
                    avhnVar2 = avhn.a;
                }
                ajmyVar.h(imageView, avhnVar2);
                this.c.setVisibility(0);
            }
        }
        awdf[] awdfVarArr = (awdf[]) awdtVar.h.toArray(new awdf[0]);
        zag.o(this.h, awdfVarArr != null && awdfVarArr.length > 0);
        pns.j(this.e, this.h, this.p, Arrays.asList(awdfVarArr), true);
        aunb aunbVar3 = awdtVar.k;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        if (aunbVar3.qn(SubscribeButtonRendererOuterClass.subscribeButtonRenderer)) {
            aunb aunbVar4 = awdtVar.k;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            avaqVar = (avaq) aunbVar4.qm(SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
        }
        if (avaqVar == null) {
            this.s.f();
        } else {
            avaqVar = (avaq) fyv.c(this.e, avaqVar.mo52toBuilder(), this.d.getText()).mo39build();
        }
        this.r.i(avaqVar, ajrsVar.a);
        fny fnyVar = this.s;
        if (fnyVar != null && (a = fnyVar.a()) != null) {
            a.setPaddingRelative(a.getPaddingStart(), 0, 0, 0);
        }
        awcy awcyVar = awdtVar.j;
        if (awcyVar == null) {
            awcyVar = awcy.a;
        }
        int i = awcyVar.b;
        awcy awcyVar2 = awdtVar.i;
        if (awcyVar2 == null) {
            awcyVar2 = awcy.a;
        }
        int i2 = awcyVar2.b;
        if (i == 118483990) {
            if (i2 == 118483990) {
                awcy awcyVar3 = awdtVar.j;
                if (awcyVar3 == null) {
                    awcyVar3 = awcy.a;
                }
                if (awcyVar3.b == 118483990) {
                    apmyVar2 = (apmy) awcyVar3.c;
                } else {
                    apmyVar2 = apmy.a;
                }
                awcy awcyVar4 = awdtVar.i;
                if (awcyVar4 == null) {
                    awcyVar4 = awcy.a;
                }
                if (awcyVar4.b == 118483990) {
                    apmyVar3 = (apmy) awcyVar4.c;
                } else {
                    apmyVar3 = apmy.a;
                }
                this.d.setTextColor(this.n.a(apmyVar3.d, apmyVar2.d));
                this.b.setTextColor(this.n.a(apmyVar3.e, apmyVar2.e));
                this.g.setTextColor(this.n.a(apmyVar3.d, apmyVar2.d));
                this.a.setBackgroundColor(this.n.a(apmyVar3.c, apmyVar2.c));
            }
            this.d.setTextColor(zhn.j(this.e, R.attr.ytTextPrimary).orElse(0));
            this.b.setTextColor(zhn.j(this.e, R.attr.ytTextSecondary).orElse(0));
            this.g.setTextColor(zhn.j(this.e, R.attr.ytTextPrimary).orElse(0));
            this.a.setBackgroundColor(zhn.j(this.e, R.attr.ytGeneralBackgroundB).orElse(0));
        } else {
            if (i2 == 118483990) {
                awcy awcyVar5 = awdtVar.i;
                if (awcyVar5 == null) {
                    awcyVar5 = awcy.a;
                }
                if (awcyVar5.b == 118483990) {
                    apmyVar = (apmy) awcyVar5.c;
                } else {
                    apmyVar = apmy.a;
                }
                this.d.setTextColor(apmyVar.d);
                this.b.setTextColor(apmyVar.e);
                this.g.setTextColor(apmyVar.d);
                this.a.setBackgroundColor(apmyVar.c);
            }
            this.d.setTextColor(zhn.j(this.e, R.attr.ytTextPrimary).orElse(0));
            this.b.setTextColor(zhn.j(this.e, R.attr.ytTextSecondary).orElse(0));
            this.g.setTextColor(zhn.j(this.e, R.attr.ytTextPrimary).orElse(0));
            this.a.setBackgroundColor(zhn.j(this.e, R.attr.ytGeneralBackgroundB).orElse(0));
        }
        d(awdtVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.r.d();
    }
}
