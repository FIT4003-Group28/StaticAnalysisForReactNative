package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.IconTextBadgeRendererOuterClass;
/* compiled from: PG */
/* renamed from: mws  reason: default package */
/* loaded from: classes3.dex */
public final class mws extends mxg {
    private final TextView A;
    private final RatingBar B;
    private final TextView C;
    private final View D;
    private final View E;
    private final ImageView F;
    private final TextView G;

    public mws(ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, fjn fjnVar, akem akemVar) {
        super(ajmyVar, ajxzVar, ajycVar, view, view2, false, fjnVar, akemVar);
        this.A = (TextView) view2.findViewById(R.id.rating_text);
        this.B = (RatingBar) view2.findViewById(R.id.rating_bar);
        this.C = (TextView) view2.findViewById(R.id.price_text);
        View findViewById = view2.findViewById(R.id.icon_text_badge_layout);
        this.D = findViewById;
        View findViewById2 = findViewById.findViewById(R.id.icon_text_badge);
        this.E = findViewById2;
        this.F = (ImageView) findViewById2.findViewById(R.id.icon_text_badge_icon);
        this.G = (TextView) findViewById2.findViewById(R.id.icon_text_badge_text);
    }

    @Override // defpackage.mxg, defpackage.mxf, defpackage.mxd
    public final void c(acti actiVar, Object obj, auhs auhsVar) {
        arag aragVar;
        super.c(actiVar, obj, auhsVar);
        float f = auhsVar.f;
        int i = auhsVar.g;
        int i2 = auhsVar.h;
        arht arhtVar = null;
        if ((auhsVar.b & 8192) != 0) {
            aragVar = auhsVar.p;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        aunb aunbVar = auhsVar.i;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(IconTextBadgeRendererOuterClass.iconTextBadgeRenderer)) {
            aunb aunbVar2 = auhsVar.i;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            arhtVar = (arht) aunbVar2.qm(IconTextBadgeRendererOuterClass.iconTextBadgeRenderer);
        }
        nfj.e(this.A, this.B, f, i, i2);
        nfj.f(this.C, b);
        if (arhtVar == null) {
            this.D.setVisibility(8);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            return;
        }
        this.D.setVisibility(0);
        Drawable background = this.E.getBackground();
        if (background instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) background.getCurrent().mutate();
            int i3 = arhtVar.e;
            if (i3 != 0) {
                gradientDrawable.setColor(i3);
            } else {
                gradientDrawable.setColor(this.E.getResources().getColor(R.color.icon_text_badge_background_color));
            }
        }
        if ((arhtVar.b & 1) != 0) {
            arag aragVar2 = arhtVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            if (aragVar2.c.size() > 0) {
                ImageView imageView = this.F;
                arag aragVar3 = arhtVar.d;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
                imageView.setColorFilter(((arai) aragVar3.c.get(0)).i);
            }
            ImageView imageView2 = this.F;
            ajxz ajxzVar = this.n;
            arhs arhsVar = arhtVar.c;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b2 = arhr.b(arhsVar.c);
            if (b2 == null) {
                b2 = arhr.UNKNOWN;
            }
            imageView2.setImageResource(ajxzVar.a(b2));
            this.F.setVisibility(0);
        } else {
            this.F.setVisibility(8);
        }
        arag aragVar4 = arhtVar.d;
        if (aragVar4 == null) {
            aragVar4 = arag.a;
        }
        Spanned b3 = ajgl.b(aragVar4);
        if (TextUtils.isEmpty(b3)) {
            this.G.setVisibility(8);
            return;
        }
        this.G.setVisibility(0);
        this.G.setText(b3);
        arag aragVar5 = arhtVar.d;
        if (aragVar5 == null) {
            aragVar5 = arag.a;
        }
        if (aragVar5.c.size() <= 0) {
            return;
        }
        TextView textView = this.G;
        arag aragVar6 = arhtVar.d;
        if (aragVar6 == null) {
            aragVar6 = arag.a;
        }
        textView.setTextColor(((arai) aragVar6.c.get(0)).i);
    }
}
