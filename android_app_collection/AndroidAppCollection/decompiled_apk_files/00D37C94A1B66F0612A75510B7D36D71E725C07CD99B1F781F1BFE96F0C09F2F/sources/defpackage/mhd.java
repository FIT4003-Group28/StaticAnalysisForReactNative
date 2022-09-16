package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.IconBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: mhd  reason: default package */
/* loaded from: classes3.dex */
public final class mhd extends ajsl implements lou, yff {
    public final acti a;
    public low b;
    public ajrs c;
    public aqdr d;
    public apzg e;
    public byte[] f;
    private final Context g;
    private final ajrx h;
    private final ajmy i;
    private final akfb j;
    private final faq k;
    private final akem l;
    private final yfk m;
    private final View n;
    private final TextView o;
    private final ajxz p;
    private final ColorStateList q;
    private final zap r;
    private TextView s;
    private TintableImageView t;
    private apzg u;
    private yfj v;
    private arhm x;

    public mhd(Context context, ajmy ajmyVar, ajxz ajxzVar, final aafo aafoVar, gem gemVar, akfb akfbVar, faq faqVar, akem akemVar, yfk yfkVar, acth acthVar) {
        this.g = context;
        this.h = gemVar;
        ajxzVar.getClass();
        this.p = ajxzVar;
        aafoVar.getClass();
        ajmyVar.getClass();
        this.i = ajmyVar;
        this.j = akfbVar;
        this.k = faqVar;
        this.l = akemVar;
        this.m = yfkVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_link, (ViewGroup) null);
        this.n = inflate;
        this.o = (TextView) inflate.findViewById(R.id.title);
        this.r = zap.b((ViewStub) inflate.findViewById(R.id.thumbnail), TintableImageView.class);
        this.q = zhn.f(context, R.attr.ytTextPrimary);
        this.a = acthVar.oi();
        gemVar.c(inflate);
        gemVar.d(new View.OnClickListener() { // from class: mhc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acti actiVar;
                mhd mhdVar = mhd.this;
                aafo aafoVar2 = aafoVar;
                low lowVar = mhdVar.b;
                if (lowVar != null) {
                    lowVar.b(mhdVar, mhdVar.d);
                }
                byte[] bArr = mhdVar.f;
                if (bArr.length > 0 && (actiVar = mhdVar.a) != null) {
                    actiVar.H(3, new acte(bArr), null);
                }
                if (mhdVar.e != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.rendering.presenter.PresentContext", mhdVar.c);
                    if (mhdVar.e.qn(SignInEndpointOuterClass.signInEndpoint)) {
                        hashMap.put("FromTopBarMenu", true);
                    }
                    aafoVar2.c(mhdVar.e, hashMap);
                }
            }
        });
    }

    private final void f(boolean z) {
        if (z) {
            this.v.oK(this.c, this.x);
            zgd.v(this.n, -1, -2);
            this.n.setVisibility(0);
            return;
        }
        zgd.v(this.n, 0, 0);
        this.n.setVisibility(8);
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.h).b;
    }

    @Override // defpackage.lou
    public final void c(boolean z) {
        elk.g(this.g, this.c, this.h, z);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        yfj yfjVar;
        int i;
        apzg apzgVar;
        acti actiVar;
        View view;
        argj argjVar;
        arhs arhsVar;
        aqdr aqdrVar = (aqdr) obj;
        this.c = ajrsVar;
        this.d = aqdrVar;
        ampq a = low.a(ajrsVar);
        if (a.h()) {
            low lowVar = (low) a.c();
            this.b = lowVar;
            lowVar.c(this, aqdrVar);
        } else {
            this.b = null;
        }
        TextView textView = this.o;
        if ((aqdrVar.b & 16) != 0) {
            aragVar = aqdrVar.j;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        if ((aqdrVar.b & 32) != 0) {
            aragVar2 = aqdrVar.k;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b = ajgl.b(aragVar2);
        if (!TextUtils.isEmpty(b) && this.s == null) {
            this.s = (TextView) ((ViewStub) this.n.findViewById(R.id.subtitle)).inflate().findViewById(R.id.subtitle);
        }
        TextView textView2 = this.s;
        if (textView2 != null) {
            zag.m(textView2, b);
        }
        int i2 = aqdrVar.b;
        boolean z = false;
        if ((i2 & 2) != 0) {
            aunb aunbVar = aqdrVar.h;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            arhm arhmVar = (arhm) ajjh.l(aunbVar, IconBadgeRendererOuterClass.iconBadgeRenderer);
            this.x = arhmVar;
            if (arhmVar != null) {
                if (this.v == null) {
                    this.v = this.m.a((ViewStub) this.n.findViewById(R.id.icon_badge));
                }
                this.v.h(this.x);
                if (!this.x.c.isEmpty()) {
                    this.v.j(this);
                }
                f(this.x.f);
            }
        } else if ((i2 & 1) != 0) {
            ajxz ajxzVar = this.p;
            arhs arhsVar2 = aqdrVar.g;
            if (arhsVar2 == null) {
                arhsVar2 = arhs.a;
            }
            arhr b2 = arhr.b(arhsVar2.c);
            if (b2 == null) {
                b2 = arhr.UNKNOWN;
            }
            int a2 = ajxzVar.a(b2);
            this.i.e((ImageView) this.r.a());
            if (!this.r.c() || a2 != 0) {
                ((TintableImageView) this.r.a()).setImageResource(a2);
                ((TintableImageView) this.r.a()).setVisibility(0);
                ((TintableImageView) this.r.a()).a(aqdrVar.o ? this.q : null);
            } else {
                ((TintableImageView) this.r.a()).setImageDrawable(null);
                ((TintableImageView) this.r.a()).setVisibility(8);
                ((TintableImageView) this.r.a()).a(null);
            }
        } else if ((i2 & 4) != 0) {
            ajmy ajmyVar = this.i;
            ImageView imageView = (ImageView) this.r.a();
            avhn avhnVar = aqdrVar.i;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
            ((TintableImageView) this.r.a()).setImageTintList(null);
            ((TintableImageView) this.r.a()).setVisibility(0);
        }
        if ((aqdrVar.b & 2) != 0 && this.r.c()) {
            ((TintableImageView) this.r.a()).setVisibility(8);
        } else if ((aqdrVar.b & 2) == 0 && (yfjVar = this.v) != null) {
            yfjVar.g();
        }
        if (aqdrVar.c != 7) {
            TintableImageView tintableImageView = this.t;
            if (tintableImageView != null) {
                tintableImageView.setVisibility(8);
            }
        } else {
            if (this.t == null) {
                this.t = (TintableImageView) ((ViewStub) this.n.findViewById(R.id.secondary_icon)).inflate().findViewById(R.id.secondary_icon);
            }
            ajxz ajxzVar2 = this.p;
            if (aqdrVar.c == 7) {
                arhsVar = (arhs) aqdrVar.d;
            } else {
                arhsVar = arhs.a;
            }
            arhr b3 = arhr.b(arhsVar.c);
            if (b3 == null) {
                b3 = arhr.UNKNOWN;
            }
            int a3 = ajxzVar2.a(b3);
            if (a3 == 0) {
                this.t.setImageDrawable(null);
                this.t.setVisibility(8);
                this.t.a(null);
            } else {
                this.t.setImageResource(a3);
                this.t.setVisibility(0);
                this.t.a(this.q);
            }
        }
        aqdq aqdqVar = aqdrVar.m;
        if (aqdqVar == null) {
            aqdqVar = aqdq.a;
        }
        if (aqdqVar.b == 102716411) {
            if (!this.r.c() || ((TintableImageView) this.r.a()).getVisibility() != 0) {
                if (this.o.getVisibility() == 0) {
                    view = this.o;
                } else {
                    TextView textView3 = this.s;
                    view = (textView3 == null || textView3.getVisibility() != 0) ? this.n : this.s;
                }
            } else {
                view = this.r.a();
            }
            akfb akfbVar = this.j;
            aqdq aqdqVar2 = aqdrVar.m;
            if (aqdqVar2 == null) {
                aqdqVar2 = aqdq.a;
            }
            if (aqdqVar2.b == 102716411) {
                argjVar = (argj) aqdqVar2.c;
            } else {
                argjVar = argj.a;
            }
            akfbVar.b(argjVar, view, aqdrVar, this.a);
        }
        int i3 = aqdrVar.e;
        if (i3 == 4) {
            apzgVar = (apzg) aqdrVar.f;
            i = 4;
        } else {
            i = i3;
            apzgVar = null;
        }
        this.e = apzgVar;
        this.u = i == 9 ? (apzg) aqdrVar.f : null;
        byte[] I = aqdrVar.n.I();
        this.f = I;
        if (I.length > 0 && (actiVar = this.a) != null) {
            actiVar.u(new acte(I), null);
        }
        ajrx ajrxVar = this.h;
        if (this.e != null || this.u != null) {
            z = true;
        }
        ajrxVar.b(z);
        this.k.b(this, aqdrVar.e == 4 ? (apzg) aqdrVar.f : null);
        this.h.e(ajrsVar);
        this.l.b(a(), this.l.a(a(), null));
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqdr) obj).n.I();
    }

    @Override // defpackage.yff
    public final void n(arhk arhkVar) {
        yfj yfjVar;
        if (this.x == null || (yfjVar = this.v) == null || !yfjVar.m(arhkVar)) {
            return;
        }
        f(arhkVar.getIsVisible().booleanValue());
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.k.c(this);
        low lowVar = this.b;
        if (lowVar != null) {
            lowVar.d(this);
        }
        yfj yfjVar = this.v;
        if (yfjVar != null) {
            yfjVar.qZ(ajsaVar);
            this.v.d.a.remove(this);
        }
    }
}
