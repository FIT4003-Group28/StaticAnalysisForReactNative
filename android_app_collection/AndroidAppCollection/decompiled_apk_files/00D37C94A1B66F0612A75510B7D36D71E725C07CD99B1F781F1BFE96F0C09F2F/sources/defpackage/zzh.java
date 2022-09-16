package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zzh  reason: default package */
/* loaded from: classes4.dex */
public final class zzh implements aaan {
    private final ajmy a;

    public zzh(ajmy ajmyVar) {
        ajmyVar.getClass();
        this.a = ajmyVar;
    }

    private static final zzf c(View view) {
        if (view == null) {
            return null;
        }
        zzf zzfVar = new zzf();
        zzfVar.a = view;
        zzfVar.b = view.findViewById(R.id.sponsored_region);
        zzfVar.c = (TextView) zzfVar.b.findViewById(R.id.sponsored_text);
        zzfVar.d = (TextView) view.findViewById(R.id.title);
        zzfVar.e = (TextView) view.findViewById(R.id.price);
        zzfVar.f = (TextView) view.findViewById(R.id.merchant);
        zzfVar.g = (ImageView) view.findViewById(R.id.image);
        zzfVar.h = (RatingBar) view.findViewById(R.id.rating);
        zzfVar.i = (TextView) view.findViewById(R.id.review_text);
        zzfVar.j = new wzi(view, null);
        return zzfVar;
    }

    @Override // defpackage.aaan
    public final yo a(Context context, ViewGroup viewGroup, zyz zyzVar, boolean z) {
        return new zzg(LayoutInflater.from(context).inflate(z ? R.layout.info_card_shopping : R.layout.info_card_shopping_container_watch_next, viewGroup, false), z);
    }

    @Override // defpackage.aaan
    public final void b(Context context, zza zzaVar, yo yoVar, aaar aaarVar) {
        zzf zzfVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        zzf zzfVar2;
        zzg zzgVar = (zzg) yoVar;
        arjf c = zzaVar.c();
        arje arjeVar = c.n;
        if (arjeVar == null) {
            arjeVar = arje.a;
        }
        int U = akel.U(arjeVar.b);
        if (U == 0) {
            U = 2;
        }
        View view = yoVar.a;
        if (zzgVar.t) {
            if (zzgVar.v == null) {
                zzgVar.v = c(view);
            }
            zzfVar = zzgVar.v;
        } else if (U == 3) {
            if (zzgVar.u == null) {
                zzgVar.u = c(zag.g(view, R.id.product_card_stub, R.id.product_card));
                RatingBar ratingBar = zzgVar.u.h;
                if (ratingBar != null) {
                    LayerDrawable layerDrawable = (LayerDrawable) ratingBar.getProgressDrawable();
                    Drawable l = iy.l(layerDrawable.findDrawableByLayerId(16908301));
                    l.setTint(context.getResources().getColor(R.color.info_card_shopping_star_orange));
                    layerDrawable.setDrawableByLayerId(16908301, l);
                    Drawable l2 = iy.l(layerDrawable.findDrawableByLayerId(16908288));
                    l2.setTint(zhn.j(context, R.attr.ytIcon1).orElse(0));
                    layerDrawable.setDrawableByLayerId(16908288, l2);
                    layerDrawable.setDrawableByLayerId(16908303, l2);
                }
            }
            zzfVar = zzgVar.u;
        } else {
            if (zzgVar.v == null) {
                zzgVar.v = c(zag.g(view, R.id.shopping_card_stub, R.id.shopping_card));
            }
            zzfVar = zzgVar.v;
        }
        if (U != 3 || (zzfVar2 = zzgVar.v) == null) {
            zzf zzfVar3 = zzgVar.u;
            if (zzfVar3 != null) {
                zzfVar3.a.setVisibility(8);
            }
        } else {
            zzfVar2.a.setVisibility(8);
        }
        zzfVar.a.setVisibility(0);
        TextView textView = zzfVar.d;
        arag aragVar5 = null;
        if ((c.b & 8) != 0) {
            aragVar = c.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = zzfVar.e;
        if ((c.b & 16) != 0) {
            aragVar2 = c.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        TextView textView3 = zzfVar.f;
        if ((c.b & 32) != 0) {
            aragVar3 = c.h;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        zag.m(textView3, ajgl.b(aragVar3));
        if ((c.b & 4) != 0) {
            ajmy ajmyVar = this.a;
            ImageView imageView = zzfVar.g;
            avhn avhnVar = c.e;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
        }
        if (zzfVar.h != null) {
            if (Float.compare(c.l, 0.0f) > 0) {
                zzfVar.h.setVisibility(0);
                zzfVar.h.setRating(c.l);
                zzfVar.h.setContentDescription(String.format("%.1f", Float.valueOf(c.l)));
                TextView textView4 = zzfVar.i;
                if ((c.b & 2048) != 0) {
                    aragVar4 = c.m;
                    if (aragVar4 == null) {
                        aragVar4 = arag.a;
                    }
                } else {
                    aragVar4 = null;
                }
                zag.m(textView4, ajgl.b(aragVar4));
            } else {
                zzfVar.h.setVisibility(8);
                zzfVar.i.setVisibility(8);
            }
        }
        if ((c.b & 1) != 0 && (aragVar5 = c.c) == null) {
            aragVar5 = arag.a;
        }
        Spanned b = ajgl.b(aragVar5);
        zag.m(zzfVar.c, b);
        if (TextUtils.isEmpty(b)) {
            zzfVar.b.setVisibility(4);
        } else {
            zzfVar.b.setVisibility(0);
            zzfVar.b.setOnClickListener(new zze(c, zzfVar, aaarVar, 1));
        }
        view.setOnClickListener(new zze(c, aaarVar, zzfVar));
    }
}
