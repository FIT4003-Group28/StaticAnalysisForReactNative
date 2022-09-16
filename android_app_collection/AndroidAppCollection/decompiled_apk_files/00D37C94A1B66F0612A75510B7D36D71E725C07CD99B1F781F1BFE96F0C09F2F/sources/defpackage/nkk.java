package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.AdThumbnailDetailsButtonRendererOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: nkk  reason: default package */
/* loaded from: classes3.dex */
public final class nkk implements nlx {
    public final aafo a;
    public final wxc b;
    public final apdm c;
    private final Context d;
    private final ajmy e;
    private final acti f;
    private final ajgj g;
    private final fjn h;
    private View i;
    private ImageView j;
    private View k;
    private TextView l;
    private View m;
    private View n;

    public nkk(Context context, ajmy ajmyVar, aafo aafoVar, wxc wxcVar, fjn fjnVar, acti actiVar, apdm apdmVar) {
        this.d = context;
        this.e = ajmyVar;
        this.a = aafoVar;
        this.b = wxcVar;
        this.f = actiVar;
        this.c = apdmVar;
        this.h = fjnVar;
        ajgi a = ajgj.a();
        a.a = context;
        this.g = a.a();
    }

    private final void m() {
        if (this.i != null) {
            return;
        }
        boolean z = false;
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.ad_compact_engagement_panel_header, (ViewGroup) null, false);
        this.i = inflate;
        inflate.setOnClickListener(new View.OnClickListener() { // from class: nki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nkk nkkVar = nkk.this;
                apdm apdmVar = nkkVar.c;
                if ((apdmVar.b & 64) == 0 || nkkVar.b.d(apdmVar)) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", nkkVar.c);
                aafo aafoVar = nkkVar.a;
                apzg apzgVar = nkkVar.c.i;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, hashMap);
            }
        });
        View view = this.i;
        if ((this.c.b & 64) != 0) {
            z = true;
        }
        view.setClickable(z);
        this.j = (ImageView) this.i.findViewById(R.id.primary_image);
        this.k = this.i.findViewById(R.id.ad_badge);
        this.l = (TextView) this.i.findViewById(R.id.primary_text);
        this.m = this.i.findViewById(R.id.cta_button);
        this.n = this.i.findViewById(R.id.close_button);
    }

    @Override // defpackage.nlx
    public final View a() {
        return null;
    }

    @Override // defpackage.nlx
    public final View b() {
        m();
        return this.i;
    }

    @Override // defpackage.nlx
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.nlx
    public final void d() {
        arag aragVar;
        m();
        this.f.n(new acte(this.c.j));
        Drawable background = this.i.getBackground();
        if (background != null && (background.getCurrent() instanceof GradientDrawable)) {
            GradientDrawable gradientDrawable = (GradientDrawable) background.getCurrent().mutate();
            gradientDrawable.setColor(this.c.c);
            this.i.setBackground(gradientDrawable);
        }
        apdm apdmVar = this.c;
        if ((apdmVar.b & 2) == 0) {
            this.j.setVisibility(8);
        } else {
            ajmy ajmyVar = this.e;
            ImageView imageView = this.j;
            avhn avhnVar = apdmVar.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            nct nctVar = new nct(2);
            ajmt a = ajmu.a();
            a.d(true);
            a.c = nctVar;
            ajmyVar.k(imageView, avhnVar, a.a());
        }
        zag.o(this.k, !this.c.e);
        TextView textView = this.l;
        apdm apdmVar2 = this.c;
        if ((apdmVar2.b & 8) != 0) {
            aragVar = apdmVar2.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.d(aragVar, this.g));
        aunb aunbVar = this.c.g;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            fjm a2 = this.h.a(new nkj(this), this.m);
            aunb aunbVar2 = this.c.g;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            a2.c((aoyl) aunbVar2.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer));
        } else {
            this.m.setVisibility(8);
        }
        aunb aunbVar3 = this.c.h;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        if (aunbVar3.qn(AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer)) {
            fjs fjsVar = new fjs(this.n, this.e, new nkj(this, 1));
            aunb aunbVar4 = this.c.h;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            fjsVar.a((apau) aunbVar4.qm(AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer), null);
            return;
        }
        this.n.setVisibility(8);
    }

    @Override // defpackage.nlx
    public final void e(boolean z) {
    }

    @Override // defpackage.nlx
    public final void f(auxr auxrVar) {
    }

    @Override // defpackage.nlx
    public final void g(nma nmaVar) {
    }

    @Override // defpackage.nlx
    public final void h(nly nlyVar) {
    }

    @Override // defpackage.nlx
    public final void i(CharSequence charSequence) {
    }

    @Override // defpackage.nlx
    public final void j(CharSequence charSequence) {
    }

    @Override // defpackage.nlx
    public final boolean k() {
        return false;
    }

    @Override // defpackage.nlx
    public final void l(nmn nmnVar) {
    }
}
