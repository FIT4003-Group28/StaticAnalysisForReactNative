package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kkm  reason: default package */
/* loaded from: classes3.dex */
public final class kkm extends kkn {
    private RatingBar A;
    private TextView x;
    private TextView y;
    private TextView z;

    public kkm(Context context, ajmy ajmyVar, aadd aaddVar) {
        super(context, ajmyVar, aaddVar);
    }

    @Override // defpackage.kkn, defpackage.kkc
    public final void c() {
        arag aragVar;
        arag aragVar2;
        if (this.p == null || this.f == null) {
            return;
        }
        super.c();
        aphm aphmVar = ((aphn) this.p).d;
        if (aphmVar == null) {
            aphmVar = aphm.a;
        }
        int c = aoyt.c(aphmVar.i);
        if (c == 0) {
            c = 1;
        }
        this.v = c;
        aphl aphlVar = ((aphn) this.p).e;
        if (aphlVar == null) {
            aphlVar = aphl.a;
        }
        int c2 = aoyt.c(aphlVar.c);
        if (c2 == 0) {
            c2 = 1;
        }
        this.w = c2;
        this.f.setImageResource(2131230908);
        aphn aphnVar = (aphn) this.p;
        if ((aphnVar.b & 1) != 0) {
            ajmy ajmyVar = this.a;
            ImageView imageView = this.f;
            avhn avhnVar = aphnVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            kkl kklVar = new kkl(this);
            ajmt a = ajmu.a();
            a.d(true);
            a.c = kklVar;
            ajmyVar.k(imageView, avhnVar, a.a());
        }
        float f = aphmVar.f;
        if (f <= 0.0f) {
            this.A.setVisibility(8);
            this.z.setVisibility(8);
        } else {
            float min = Math.min(5.0f, f);
            this.A.setVisibility(0);
            this.A.setRating(min);
            zag.m(this.z, String.format("%1.1f", Float.valueOf(min)));
            this.z.setTextColor(aphmVar.h);
        }
        apok apokVar = aphmVar.c;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        apoj apojVar = apokVar.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        TextView textView = (TextView) this.g;
        arag aragVar3 = null;
        if ((apojVar.b & 256) != 0) {
            aragVar = apojVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = (TextView) this.g;
        apoi apoiVar = apojVar.c == 17 ? (apoi) apojVar.d : apoi.a;
        textView2.setTextColor((apoiVar.b == 118483990 ? (apmy) apoiVar.c : apmy.a).d);
        Drawable background = this.g.getBackground();
        apoi apoiVar2 = apojVar.c == 17 ? (apoi) apojVar.d : apoi.a;
        background.setColorFilter((apoiVar2.b == 118483990 ? (apmy) apoiVar2.c : apmy.a).c, PorterDuff.Mode.SRC);
        TextView textView3 = this.x;
        if ((aphmVar.b & 2) != 0) {
            aragVar2 = aphmVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textView3.setText(ajgl.b(aragVar2));
        this.x.setTextColor(aphmVar.h);
        TextView textView4 = this.y;
        if ((aphmVar.b & 4) != 0 && (aragVar3 = aphmVar.e) == null) {
            aragVar3 = arag.a;
        }
        textView4.setText(ajgl.b(aragVar3));
        this.y.setTextColor(aphmVar.h);
        this.d.getBackground().setColorFilter(aphmVar.g, PorterDuff.Mode.SRC);
        aphl aphlVar2 = ((aphn) this.p).e;
        if (aphlVar2 == null) {
            aphlVar2 = aphl.a;
        }
        apok apokVar2 = aphlVar2.b;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        apoj apojVar2 = apokVar2.c;
        if (apojVar2 == null) {
            apojVar2 = apoj.a;
        }
        Drawable background2 = this.h.getBackground();
        apoi apoiVar3 = apojVar2.c == 17 ? (apoi) apojVar2.d : apoi.a;
        background2.setColorFilter((apoiVar3.b == 118483990 ? (apmy) apoiVar3.c : apmy.a).c, PorterDuff.Mode.SRC);
        if (!((aphn) this.p).h) {
            return;
        }
        this.d.setElevation(10.0f);
        this.e.setZ(10.0f);
        this.f.setZ(10.0f);
        this.h.setZ(10.0f);
    }

    @Override // defpackage.kkn
    protected final void h(View view) {
        this.c = zag.g(view, R.id.app_promo_ad_cta_overlay_stub, R.id.app_promo_ad_cta_overlay);
        this.h = this.c.findViewById(R.id.collapse_cta_container);
        this.e = this.c.findViewById(R.id.expanded_details_container);
        this.d = this.c.findViewById(R.id.expanded_background_container);
        this.f = (ImageView) this.c.findViewById(R.id.app_promo_thumbnail_icon);
        this.g = this.c.findViewById(R.id.expanded_details_cta);
        this.x = (TextView) this.c.findViewById(R.id.expanded_details_title);
        this.y = (TextView) this.c.findViewById(R.id.expanded_details_description);
        this.z = (TextView) this.c.findViewById(R.id.expanded_details_rating_score);
        this.A = (RatingBar) this.c.findViewById(R.id.expanded_details_rating_bar);
        kkk kkkVar = new kkk(this);
        this.g.setOnClickListener(kkkVar);
        this.d.setOnClickListener(kkkVar);
        this.h.setOnClickListener(kkkVar);
        this.f.setOnClickListener(kkkVar);
    }
}
