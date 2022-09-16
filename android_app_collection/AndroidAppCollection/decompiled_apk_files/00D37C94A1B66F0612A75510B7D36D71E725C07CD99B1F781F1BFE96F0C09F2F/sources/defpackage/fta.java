package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fta  reason: default package */
/* loaded from: classes3.dex */
public final class fta extends fsz {
    private ImageView a;
    private TextView b;
    private final ajxz c;
    private final Context g;

    public fta(ajxz ajxzVar, Context context, View view) {
        super(view);
        this.c = ajxzVar;
        this.g = context;
    }

    public final void a() {
        View view = this.f;
        if (view != null) {
            zag.o(view, false);
        }
    }

    public final void f(atfh atfhVar) {
        if (atfhVar == null) {
            a();
            return;
        }
        View c = c();
        this.a = (ImageView) c.findViewById(R.id.badge_icon);
        this.b = (TextView) c.findViewById(R.id.badge_label);
        zag.o(c, true);
        if ((atfhVar.b & 1) != 0) {
            fzs fzsVar = new fzs(this.g, this.c);
            ImageView imageView = this.a;
            arhs arhsVar = atfhVar.c;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            imageView.setImageResource(fzsVar.a(b));
        }
        zag.o(this.a, 1 == (atfhVar.b & 1));
        zag.m(this.b, atfhVar.e);
        if ((atfhVar.b & 64) == 0) {
            c.setContentDescription(null);
        } else {
            aovr aovrVar = atfhVar.g;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            c.setContentDescription(aovrVar.c);
        }
        View view = this.f;
        if (view == null) {
            return;
        }
        int aH = akel.aH(atfhVar.d);
        if (aH == 0) {
            aH = 1;
        }
        int i = aH - 1;
        if (i == 3) {
            view.setBackground(b(this.g));
            this.b.setTextColor(zhn.j(this.g, R.attr.ytBrandRed).orElse(0));
            kw.h(this.a, zhn.f(this.g, R.attr.ytBrandRed));
        } else if (i != 4) {
            if (i != 6) {
                if (i == 22) {
                    view.setBackground(akf.a(this.g, R.drawable.reel_player_badge_background));
                    this.b.setTextColor(zhn.d(this.g, R.attr.ytOverlayTextPrimary));
                    kw.h(this.a, zhn.f(this.g, R.attr.ytOverlayTextPrimary));
                    return;
                } else if (i == 17) {
                    if (atfhVar.e.isEmpty()) {
                        View view2 = this.f;
                        if (view2 == null) {
                            return;
                        }
                        view2.setBackground(null);
                        view2.setPadding(0, 0, 0, 0);
                        this.b.setTextColor(zhn.d(this.g, R.attr.ytTextSecondary));
                        this.b.setPadding(0, 0, 0, 0);
                        int dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.metadata_badge_premium_icon_size);
                        zgd.t(this.a, zgd.b(zgd.m(0, 0, 0, 0), zgd.s(dimensionPixelSize, dimensionPixelSize)), ViewGroup.MarginLayoutParams.class);
                        return;
                    }
                    View view3 = this.f;
                    if (view3 == null) {
                        return;
                    }
                    view3.setBackground(b(this.g));
                    view3.setPadding(0, 0, 0, 0);
                    this.b.setTextColor(zhn.d(this.g, R.attr.ytTextSecondary));
                    int dimensionPixelSize2 = this.g.getResources().getDimensionPixelSize(R.dimen.metadata_badge_premium_icon_text_margin_start_end);
                    this.b.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
                    int dimensionPixelSize3 = this.g.getResources().getDimensionPixelSize(R.dimen.metadata_badge_premium_padding);
                    int dimensionPixelSize4 = this.g.getResources().getDimensionPixelSize(R.dimen.metadata_badge_premium_icon_size);
                    zgd.t(this.a, zgd.b(zgd.m(dimensionPixelSize3, dimensionPixelSize3, 0, dimensionPixelSize3), zgd.s(dimensionPixelSize4, dimensionPixelSize4)), ViewGroup.MarginLayoutParams.class);
                    return;
                } else if (i != 18) {
                    switch (i) {
                        case 11:
                            TextView textView = this.b;
                            textView.setPaintFlags(textView.getPaintFlags() | 16);
                            view.setBackground(b(this.g));
                            this.b.setTextColor(zhn.j(this.g, R.attr.ytBadgeText1).orElse(0));
                            this.a.setColorFilter(zhn.j(this.g, R.attr.ytBadgeText1).orElse(0));
                            return;
                        case 12:
                            break;
                        case 13:
                            view.setBackground(b(this.g));
                            this.b.setTextColor(zhn.j(this.g, R.attr.ytBrandRed).orElse(0));
                            this.a.setColorFilter(zhn.j(this.g, R.attr.ytBrandRed).orElse(0));
                            return;
                        default:
                            view.setBackground(b(this.g));
                            this.b.setTextColor(zhn.j(this.g, R.attr.ytBadgeText1).orElse(0));
                            this.a.setColorFilter(zhn.j(this.g, R.attr.ytBadgeText1).orElse(0));
                            return;
                    }
                } else {
                    view.setBackgroundResource(R.drawable.duration_background);
                    this.b.setTextColor(zhn.d(this.g, R.attr.ytStaticWhite));
                    kw.h(this.a, zhn.f(this.g, R.attr.ytStaticWhite));
                    return;
                }
            }
            view.setBackground(null);
            this.b.setTextColor(zhn.j(this.g, R.attr.ytBadgeText1).orElse(0));
            kw.h(this.a, zhn.f(this.g, R.attr.ytIconActiveOther));
        } else {
            view.setBackground(b(this.g));
            this.b.setTextColor(ake.d(this.g, R.color.quantum_vanillagreen600));
            this.a.setColorFilter(ake.d(this.g, R.color.quantum_vanillagreen600));
        }
    }

    public fta(ajxz ajxzVar, Context context, ViewStub viewStub) {
        super(viewStub);
        this.c = ajxzVar;
        this.g = context;
    }
}
