package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: kkq  reason: default package */
/* loaded from: classes3.dex */
public final class kkq extends kkn {
    private fjm A;
    private fjm B;
    private final fjn x;
    private TextView y;
    private TextView z;

    public kkq(Context context, ajmy ajmyVar, fjn fjnVar, aadd aaddVar) {
        super(context, ajmyVar, aaddVar);
        this.x = fjnVar;
    }

    @Override // defpackage.kkn, defpackage.kkc
    public final void c() {
        arag aragVar;
        if (this.p == null || this.f == null) {
            return;
        }
        super.c();
        apzb apzbVar = ((apza) this.p).d;
        if (apzbVar == null) {
            apzbVar = apzb.a;
        }
        int c = aoyt.c(apzbVar.g);
        if (c == 0) {
            c = 1;
        }
        this.v = c;
        apyz apyzVar = ((apza) this.p).e;
        if (apyzVar == null) {
            apyzVar = apyz.a;
        }
        int c2 = aoyt.c(apyzVar.c);
        if (c2 == 0) {
            c2 = 1;
        }
        this.w = c2;
        this.f.setImageResource(2131233185);
        apza apzaVar = (apza) this.p;
        if ((apzaVar.b & 1) != 0) {
            ajmy ajmyVar = this.a;
            ImageView imageView = this.f;
            avhn avhnVar = apzaVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            kkp kkpVar = new kkp(this);
            ajmt a = ajmu.a();
            a.d(true);
            a.c = kkpVar;
            ajmyVar.k(imageView, avhnVar, a.a());
        }
        TextView textView = this.y;
        apzb apzbVar2 = ((apza) this.p).d;
        if (apzbVar2 == null) {
            apzbVar2 = apzb.a;
        }
        arag aragVar2 = null;
        if ((apzbVar2.b & 2) != 0) {
            apzb apzbVar3 = ((apza) this.p).d;
            if (apzbVar3 == null) {
                apzbVar3 = apzb.a;
            }
            aragVar = apzbVar3.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.z;
        apzb apzbVar4 = ((apza) this.p).d;
        if (apzbVar4 == null) {
            apzbVar4 = apzb.a;
        }
        if ((apzbVar4.b & 4) != 0) {
            apzb apzbVar5 = ((apza) this.p).d;
            if (apzbVar5 == null) {
                apzbVar5 = apzb.a;
            }
            aragVar2 = apzbVar5.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        }
        textView2.setText(ajgl.b(aragVar2));
        apzb apzbVar6 = ((apza) this.p).d;
        if (apzbVar6 == null) {
            apzbVar6 = apzb.a;
        }
        aunb aunbVar = apzbVar6.c;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            this.A.e(true);
            fjm fjmVar = this.A;
            apzb apzbVar7 = ((apza) this.p).d;
            if (apzbVar7 == null) {
                apzbVar7 = apzb.a;
            }
            aunb aunbVar2 = apzbVar7.c;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            fjmVar.c((aoyl) aunbVar2.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer));
        }
        apyz apyzVar2 = ((apza) this.p).e;
        if (apyzVar2 == null) {
            apyzVar2 = apyz.a;
        }
        aunb aunbVar3 = apyzVar2.b;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        if (aunbVar3.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
            this.B.e(true);
            fjm fjmVar2 = this.B;
            apyz apyzVar3 = ((apza) this.p).e;
            if (apyzVar3 == null) {
                apyzVar3 = apyz.a;
            }
            aunb aunbVar4 = apyzVar3.b;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            fjmVar2.c((aoyl) aunbVar4.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer));
        }
        Drawable background = this.d.getBackground();
        apzb apzbVar8 = ((apza) this.p).d;
        if (apzbVar8 == null) {
            apzbVar8 = apzb.a;
        }
        background.setColorFilter(apzbVar8.f, PorterDuff.Mode.SRC);
        if (!((apza) this.p).h) {
            return;
        }
        this.d.setElevation(10.0f);
        this.e.setZ(10.0f);
        this.f.setZ(10.0f);
        this.h.setZ(10.0f);
    }

    @Override // defpackage.kkn, defpackage.kkc
    public final void d() {
        super.d();
        fjm fjmVar = this.A;
        if (fjmVar != null) {
            fjmVar.d();
            this.A.e(false);
        }
        fjm fjmVar2 = this.B;
        if (fjmVar2 != null) {
            fjmVar2.d();
            this.B.e(false);
        }
    }

    @Override // defpackage.kkn
    protected final void h(View view) {
        this.c = zag.g(view, R.id.collapsible_ad_cta_overlay_stub, R.id.collapsible_ad_cta_overlay);
        this.d = this.c.findViewById(R.id.expanded_background_container);
        this.e = this.c.findViewById(R.id.expanded_metadata_container);
        this.f = (ImageView) this.c.findViewById(R.id.thumbnail_icon);
        this.y = (TextView) this.c.findViewById(R.id.expanded_title);
        this.z = (TextView) this.c.findViewById(R.id.expanded_description);
        fjm a = this.x.a(this, this.c.findViewById(R.id.expanded_cta_button));
        this.A = a;
        this.g = a.a;
        fjm a2 = this.x.a(this, this.c.findViewById(R.id.collapsed_cta_button));
        this.B = a2;
        this.h = a2.a;
        this.d.setOnClickListener(new kko(this, 1));
        this.f.setOnClickListener(new kko(this));
    }
}
