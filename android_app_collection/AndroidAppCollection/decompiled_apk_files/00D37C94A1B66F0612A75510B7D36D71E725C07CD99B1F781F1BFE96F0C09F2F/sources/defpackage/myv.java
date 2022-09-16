package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: myv  reason: default package */
/* loaded from: classes3.dex */
public final class myv extends mxg {
    private final ImageView A;
    private final TextView B;
    private final TextView C;
    private final RatingBar D;
    private final ImageView E;
    private final TextView F;

    public myv(Context context, ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, boolean z, boolean z2, fjn fjnVar, akem akemVar) {
        super(context, ajmyVar, ajxzVar, ajycVar, view, view2, z, z2, fjnVar, akemVar);
        this.A = (ImageView) view2.findViewById(R.id.second_thumbnail);
        this.B = (TextView) view2.findViewById(R.id.app_store_text);
        this.C = (TextView) view2.findViewById(R.id.rating_text);
        this.D = (RatingBar) view2.findViewById(R.id.rating);
        this.E = (ImageView) view2.findViewById(R.id.rating_star);
        this.F = (TextView) view2.findViewById(R.id.price);
    }

    private final void w(int i, int i2) {
        u(this.d, i);
        u(this.e, i2);
        u(this.B, i2);
        u(this.C, i2);
        u(this.D, i2);
        u(this.F, i2);
    }

    @Override // defpackage.mxg, defpackage.mxf
    public final void l(acti actiVar, Object obj, auil auilVar, atng atngVar, Integer num) {
        avhn avhnVar;
        avhn avhnVar2;
        arag aragVar;
        super.l(actiVar, obj, auilVar, atngVar, num);
        arag aragVar2 = null;
        if ((auilVar.b & 1) != 0) {
            avhnVar = auilVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        if ((auilVar.b & 2) != 0) {
            avhnVar2 = auilVar.d;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
        } else {
            avhnVar2 = null;
        }
        if ((auilVar.b & 32) != 0) {
            aragVar = auilVar.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        float f = auilVar.i;
        if ((auilVar.b & 256) != 0 && (aragVar2 = auilVar.j) == null) {
            aragVar2 = arag.a;
        }
        Spanned b2 = ajgl.b(aragVar2);
        boolean z = auilVar.z;
        if (avhnVar == null && avhnVar2 == null) {
            ImageView imageView = this.y;
            imageView.setImageDrawable(akf.a(imageView.getContext(), z ? 2131232191 : 2131232192));
            this.y.setVisibility(0);
        } else if (avhnVar == null) {
            this.y.setVisibility(8);
        }
        if (avhnVar2 != null) {
            this.m.h(this.A, avhnVar2);
            this.A.setVisibility(0);
        } else {
            this.A.setVisibility(8);
        }
        if (z) {
            q();
            w(2, 1);
            t(16);
        } else {
            s();
            w(1, 2);
            r();
        }
        TextView textView = this.B;
        if (textView != null) {
            zag.m(textView, b);
        }
        if (f > 0.0f) {
            if (f > 5.0f) {
                f = 5.0f;
            }
            this.C.setText(String.format("%1.1f", Float.valueOf(f)));
            this.C.setVisibility(0);
            RatingBar ratingBar = this.D;
            if (ratingBar != null) {
                ratingBar.setRating(f);
                this.D.setVisibility(0);
            }
            ImageView imageView2 = this.E;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else {
            this.C.setVisibility(8);
            RatingBar ratingBar2 = this.D;
            if (ratingBar2 != null) {
                ratingBar2.setVisibility(8);
            }
            ImageView imageView3 = this.E;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
        }
        zag.m(this.F, b2);
    }

    public final void v(acti actiVar, Object obj, auil auilVar, atng atngVar) {
        l(actiVar, obj, auilVar, atngVar, null);
    }

    public myv(ajmy ajmyVar, ajxz ajxzVar, ajyc ajycVar, View view, View view2, boolean z, fjn fjnVar, akem akemVar) {
        this(null, ajmyVar, ajxzVar, ajycVar, view, view2, z, false, fjnVar, akemVar);
    }
}
