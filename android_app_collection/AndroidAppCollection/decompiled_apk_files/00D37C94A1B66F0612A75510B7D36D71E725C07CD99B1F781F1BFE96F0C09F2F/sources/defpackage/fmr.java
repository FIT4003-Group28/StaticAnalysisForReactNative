package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fmr  reason: default package */
/* loaded from: classes3.dex */
public final class fmr implements View.OnClickListener {
    public final View a;
    public ImageView b;
    public TextView c;
    public apos d;
    public fmq e;
    private final aafo f;
    private final ajxz g;
    private final yrj h;
    private final ajsk i;
    private final int j;
    private final int k;

    public fmr(aafo aafoVar, ajxz ajxzVar, yrj yrjVar, ajsk ajskVar, View view) {
        this.f = aafoVar;
        this.g = ajxzVar;
        this.a = view;
        this.h = yrjVar;
        this.i = ajskVar;
        this.b = (ImageView) view.findViewById(R.id.toggle_button_icon);
        this.c = (TextView) view.findViewById(R.id.toggle_button_text);
        view.setOnClickListener(this);
        this.j = view.getResources().getDimensionPixelSize(R.dimen.button_corner_radius);
        this.k = view.getResources().getDimensionPixelSize(R.dimen.button_outline_width);
    }

    private final GradientDrawable f(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.j);
        gradientDrawable.setStroke(this.k, i2);
        return gradientDrawable;
    }

    private final int g() {
        apot apotVar;
        int K;
        apos aposVar = this.d;
        if (aposVar.e) {
            apot apotVar2 = aposVar.q;
            if (apotVar2 == null) {
                apotVar2 = apot.a;
            }
            K = almu.K(apotVar2.b);
            if (K == 0) {
                return 1;
            }
        } else {
            if (aposVar.c == 1) {
                apotVar = (apot) aposVar.d;
            } else {
                apotVar = apot.a;
            }
            K = almu.K(apotVar.b);
            if (K == 0) {
                return 1;
            }
        }
        return K;
    }

    public final void a() {
        this.a.setVisibility(8);
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void b(apos aposVar) {
        this.d = aposVar;
        d();
        this.i.a(this.d, this.a);
    }

    public final void c() {
        if (e()) {
            return;
        }
        aopa mo52toBuilder = this.d.mo52toBuilder();
        boolean z = this.d.e;
        mo52toBuilder.copyOnWrite();
        apos aposVar = (apos) mo52toBuilder.instance;
        aposVar.b |= 8;
        aposVar.e = !z;
        apos aposVar2 = (apos) mo52toBuilder.mo39build();
        this.d = aposVar2;
        fmq fmqVar = this.e;
        if (fmqVar != null) {
            fmqVar.a(aposVar2.e);
        }
        d();
    }

    public final boolean e() {
        apos aposVar = this.d;
        return aposVar == null || aposVar.f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apzg apzgVar;
        apos aposVar = this.d;
        if (aposVar == null) {
            return;
        }
        if (aposVar.e) {
            apzgVar = aposVar.p;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = aposVar.k;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        }
        this.f.c(apzgVar, actk.f(this.d));
        if (!this.h.o()) {
            return;
        }
        c();
    }

    public final void d() {
        arhs arhsVar;
        arag aragVar;
        Spanned b;
        arag aragVar2;
        if (!e()) {
            GradientDrawable gradientDrawable = null;
            if (this.c != null) {
                apos aposVar = this.d;
                if (aposVar.e) {
                    if ((aposVar.b & 4096) != 0) {
                        aragVar2 = aposVar.n;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                    } else {
                        aragVar2 = null;
                    }
                    b = ajgl.b(aragVar2);
                } else {
                    if ((aposVar.b & 64) != 0) {
                        aragVar = aposVar.h;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    b = ajgl.b(aragVar);
                }
                zag.m(this.c, b);
            }
            int g = g() - 1;
            if (g == 12) {
                this.c.setTextColor(zhn.d(this.a.getContext(), R.attr.ytCallToAction));
            } else if (g == 13) {
                this.c.setTextColor(zhn.d(this.a.getContext(), R.attr.ytTextSecondary));
            } else if (g == 15) {
                this.c.setTextColor(zhn.d(this.a.getContext(), R.attr.ytOverlayTextPrimary));
            }
            ImageView imageView = this.b;
            if (imageView != null) {
                apos aposVar2 = this.d;
                boolean z = aposVar2.e;
                boolean z2 = true;
                if (!z ? (aposVar2.b & 32) == 0 : (aposVar2.b & 2048) == 0) {
                    z2 = false;
                }
                if (!z2) {
                    imageView.setVisibility(8);
                } else {
                    if (z) {
                        arhsVar = aposVar2.m;
                        if (arhsVar == null) {
                            arhsVar = arhs.a;
                        }
                    } else {
                        arhsVar = aposVar2.g;
                        if (arhsVar == null) {
                            arhsVar = arhs.a;
                        }
                    }
                    ImageView imageView2 = this.b;
                    ajxz ajxzVar = this.g;
                    arhr b2 = arhr.b(arhsVar.c);
                    if (b2 == null) {
                        b2 = arhr.UNKNOWN;
                    }
                    imageView2.setImageResource(ajxzVar.a(b2));
                    ImageView imageView3 = this.b;
                    apos aposVar3 = this.d;
                    imageView3.setContentDescription(aposVar3.e ? aposVar3.o : aposVar3.i);
                    if (this.c != null) {
                        ImageView imageView4 = this.b;
                        Drawable drawable = imageView4.getDrawable();
                        yzh.e(drawable, this.c.getCurrentTextColor(), PorterDuff.Mode.SRC_IN);
                        imageView4.setImageDrawable(drawable);
                    }
                    this.b.setVisibility(0);
                }
            }
            int g2 = g() - 1;
            if (g2 == 12) {
                gradientDrawable = f(0, zhn.d(this.a.getContext(), R.attr.ytCallToAction));
            } else if (g2 == 13) {
                gradientDrawable = f(0, zhn.d(this.a.getContext(), R.attr.ytTextSecondary));
            } else if (g2 == 15) {
                gradientDrawable = f(zhn.d(this.a.getContext(), R.attr.ytOverlayButtonPrimary), 0);
            }
            if (gradientDrawable != null) {
                zag.l(this.a, gradientDrawable, 0);
            }
            this.a.setVisibility(0);
            return;
        }
        a();
    }
}
