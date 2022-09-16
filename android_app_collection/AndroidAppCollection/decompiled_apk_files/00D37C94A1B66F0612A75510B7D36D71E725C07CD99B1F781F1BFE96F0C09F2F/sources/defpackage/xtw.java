package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xtw  reason: default package */
/* loaded from: classes4.dex */
public final class xtw {
    public final Context a;
    public final xxx b;
    public final aafo c;
    public final xno d;
    public final akfc e;
    public boolean f;
    public ViewTreeObserver.OnScrollChangedListener g;
    private final ajmy h;

    public xtw(Context context, xxx xxxVar, aafo aafoVar, ajmy ajmyVar, xno xnoVar, akfc akfcVar) {
        context.getClass();
        this.a = context;
        xxxVar.getClass();
        this.b = xxxVar;
        aafoVar.getClass();
        this.c = aafoVar;
        ajmyVar.getClass();
        this.h = ajmyVar;
        xnoVar.getClass();
        this.d = xnoVar;
        akfcVar.getClass();
        this.e = akfcVar;
    }

    public static final void c(ImageView imageView, ViewGroup viewGroup, ImageView imageView2, ImageView imageView3, aqji aqjiVar) {
        aovs aovsVar = aqjiVar.l;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        e(viewGroup, aovsVar);
        viewGroup.setVisibility(0);
        imageView.setVisibility(0);
        imageView2.setVisibility(8);
        imageView3.setVisibility(8);
    }

    public static final void d(ImageView imageView, ViewGroup viewGroup, ImageView imageView2, ImageView imageView3, aqji aqjiVar) {
        aovs aovsVar = aqjiVar.k;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        e(viewGroup, aovsVar);
        viewGroup.setVisibility(0);
        imageView2.setVisibility(0);
        imageView3.setVisibility(0);
        imageView.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final android.view.View r17, final android.widget.ImageView r18, final android.view.ViewGroup r19, final android.widget.ImageView r20, final android.widget.ImageView r21, final java.lang.String r22, final defpackage.apzk r23, final defpackage.acti r24, final java.util.Map r25, final boolean r26) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xtw.a(android.view.View, android.widget.ImageView, android.view.ViewGroup, android.widget.ImageView, android.widget.ImageView, java.lang.String, apzk, acti, java.util.Map, boolean):void");
    }

    public final void b(ImageView imageView, ImageView imageView2, aqji aqjiVar) {
        apmy apmyVar;
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.comment_heart_creator_avatar_width);
        imageView.getLayoutParams().width = dimensionPixelSize;
        imageView.getLayoutParams().height = dimensionPixelSize;
        imageView.setImageBitmap(null);
        avhn avhnVar = aqjiVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        Uri s = akel.s(avhnVar, dimensionPixelSize);
        if (s != null) {
            imageView.setTag(s);
            this.h.g(imageView, s);
            int orElse = zhn.j(this.a, R.attr.ytIconInactive).orElse(0);
            aqjg aqjgVar = aqjiVar.d;
            if (aqjgVar == null) {
                aqjgVar = aqjg.a;
            }
            if (aqjgVar.b == 118483990) {
                aqjg aqjgVar2 = aqjiVar.d;
                if (aqjgVar2 == null) {
                    aqjgVar2 = aqjg.a;
                }
                if (aqjgVar2.b == 118483990) {
                    apmyVar = (apmy) aqjgVar2.c;
                } else {
                    apmyVar = apmy.a;
                }
                orElse = apmyVar.d;
            }
            Drawable drawable = this.a.getResources().getDrawable(2131231446);
            drawable.mutate();
            drawable.setColorFilter(new ColorMatrixColorFilter(new float[]{Color.red(orElse) / 255.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, Color.green(orElse) / 255.0f, -1.0f, 0.0f, 255.0f, -1.0f, 0.0f, Color.blue(orElse) / 255.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, Color.alpha(orElse) / 255.0f, 0.0f}));
            imageView2.setImageDrawable(drawable);
        }
    }

    private static final void e(View view, aovs aovsVar) {
        if (aovsVar == null || (aovsVar.b & 1) == 0) {
            view.setContentDescription("");
            return;
        }
        aovr aovrVar = aovsVar.c;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        view.setContentDescription(aovrVar.c);
    }
}
