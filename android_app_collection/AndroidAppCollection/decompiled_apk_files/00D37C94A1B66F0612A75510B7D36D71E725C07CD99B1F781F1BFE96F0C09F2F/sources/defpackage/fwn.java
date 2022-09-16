package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fwn  reason: default package */
/* loaded from: classes3.dex */
public final class fwn extends LinearLayout {
    private final ImageView A;
    private final YouTubeTextView B;
    public Drawable a;
    public Drawable b;
    public final ImageView c;
    public final ImageView d;
    public fwm e;
    public int f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private Drawable y;
    private Drawable z;

    public fwn(Context context) {
        this(context, true);
    }

    private static void h(Drawable drawable, int i) {
        drawable.mutate().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    private final void i(boolean z) {
        Typeface c;
        int i;
        fwm fwmVar = this.e;
        fwmVar.getClass();
        YouTubeTextView youTubeTextView = this.B;
        if (fwmVar.e) {
            c = ajgo.ROBOTO_MEDIUM.c(getContext());
        } else {
            c = ajgo.ROBOTO_REGULAR.c(getContext());
        }
        youTubeTextView.setTypeface(c);
        YouTubeTextView youTubeTextView2 = this.B;
        fwm fwmVar2 = this.e;
        if (z) {
            i = fwmVar2.d ? fwmVar2.o : 0;
        } else {
            i = fwmVar2.m;
        }
        lj.Y(youTubeTextView2, i, youTubeTextView2.getPaddingTop(), this.e.n, this.B.getPaddingBottom());
    }

    public final fwl a() {
        fwl fwlVar = new fwl(null);
        fwlVar.f(false);
        fwlVar.d(false);
        fwlVar.b(true);
        fwlVar.x(false);
        fwlVar.k(0);
        fwlVar.m(R.attr.colorControlHighlight);
        fwlVar.u(R.attr.colorControlHighlight);
        fwlVar.h(this.p);
        fwlVar.a = Integer.valueOf(this.r);
        fwlVar.q(this.r);
        fwlVar.r(this.s);
        fwlVar.j(this.n);
        fwlVar.c(this.v);
        fwlVar.p(false);
        fwlVar.o(false);
        fwlVar.i(0);
        fwlVar.w(false);
        fwlVar.s(17);
        return fwlVar;
    }

    public final void b(apvg apvgVar) {
        Spanned spanned;
        this.e.getClass();
        zgd.v(this, -2, -2);
        setOrientation(0);
        setMinimumHeight(this.u);
        setMinimumWidth(this.e.p);
        setClickable(this.e.g);
        int i = 1;
        this.B.setSingleLine(!this.e.i);
        this.B.setGravity(this.e.r);
        fwm fwmVar = this.e;
        fwmVar.getClass();
        if (fwmVar.b) {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.A.setVisibility(0);
            i(true);
            this.e.getClass();
            this.z = getResources().getDrawable(2131232414);
            this.y = getResources().getDrawable(2131232415);
            if (this.e.w.h()) {
                h(this.z, ((Integer) this.e.w.c()).intValue());
                h(this.y, ((Integer) this.e.w.c()).intValue());
            }
        } else if (fwmVar.c) {
            this.c.setVisibility(8);
            this.d.setVisibility(0);
            this.A.setVisibility(8);
            i(true);
        } else if (fwmVar.a) {
            this.c.setVisibility(0);
            this.d.setVisibility(8);
            this.A.setVisibility(8);
            i(true);
        } else {
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.A.setVisibility(8);
            i(false);
        }
        if (true != apvgVar.i) {
            i = 2;
        }
        e(i, this.g);
        if ((apvgVar.b & 2) != 0) {
            arag aragVar = apvgVar.f;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            spanned = ajgl.b(aragVar);
        } else {
            spanned = null;
        }
        this.B.setText(spanned);
        aovs aovsVar = apvgVar.h;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        aovr aovrVar = aovsVar.c;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        if ((aovrVar.b & 2) != 0) {
            aovs aovsVar2 = apvgVar.h;
            if (aovsVar2 == null) {
                aovsVar2 = aovs.a;
            }
            aovr aovrVar2 = aovsVar2.c;
            if (aovrVar2 == null) {
                aovrVar2 = aovr.a;
            }
            if (!aovrVar2.c.isEmpty()) {
                aovs aovsVar3 = apvgVar.h;
                if (aovsVar3 == null) {
                    aovsVar3 = aovs.a;
                }
                aovr aovrVar3 = aovsVar3.c;
                if (aovrVar3 == null) {
                    aovrVar3 = aovr.a;
                }
                setContentDescription(aovrVar3.c);
                return;
            }
        }
        setContentDescription(null);
    }

    public final void c(apvg apvgVar) {
        fwl a = a();
        g(a, apvgVar);
        this.e = a.a();
        b(apvgVar);
    }

    public final void d(int i) {
        this.e.getClass();
        e(i, true);
    }

    public final void e(int i, boolean z) {
        this.e.getClass();
        this.f = i;
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        setSelected(z2);
        if (this.e.h) {
            setBackground(zhn.g(getContext(), R.attr.ytTouchFeedbackCircle));
        } else {
            setTouchDelegate(null);
            fwm fwmVar = this.e;
            setBackgroundResource(isSelected() ? fwmVar.u : fwmVar.v);
            if (z) {
                Context context = getContext();
                fwm fwmVar2 = this.e;
                setBackground(new RippleDrawable(zhn.f(context, isSelected() ? fwmVar2.x : fwmVar2.y), getBackground(), null));
            } else {
                akej a = akej.a(getContext());
                a.b = getBackground();
                a.c(this.e.q);
                setBackground(a.b());
            }
        }
        YouTubeTextView youTubeTextView = this.B;
        fwm fwmVar3 = this.e;
        youTubeTextView.setTextColor(isSelected() ? fwmVar3.s : fwmVar3.t);
        if (this.e.b) {
            this.A.setImageDrawable(isSelected() ? this.y : this.z);
        }
        fwm fwmVar4 = this.e;
        fwmVar4.getClass();
        if (!fwmVar4.c || this.a == null || this.b == null) {
            this.d.setVisibility(8);
            return;
        }
        this.d.setVisibility(0);
        this.d.setImageDrawable(isSelected() ? this.a : this.b);
    }

    public final void f(int i) {
        this.B.setMinimumWidth(i);
        this.B.setMaxWidth(Integer.MAX_VALUE);
    }

    public final void g(fwl fwlVar, apvg apvgVar) {
        int i = 0;
        fwlVar.e(false);
        fwlVar.d(apvgVar.c == 6);
        fwlVar.f(apvgVar.c == 7);
        arag aragVar = apvgVar.f;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        fwlVar.g(!TextUtils.isEmpty(ajgl.b(aragVar)));
        apvi apviVar = apvgVar.e;
        if (apviVar == null) {
            apviVar = apvi.a;
        }
        apvh b = apvh.b(apviVar.c);
        if (b == null) {
            b = apvh.STYLE_UNKNOWN;
        }
        if (b != apvh.STYLE_RELATED) {
            apvi apviVar2 = apvgVar.e;
            if (apviVar2 == null) {
                apviVar2 = apvi.a;
            }
            apvh b2 = apvh.b(apviVar2.c);
            if (b2 == null) {
                b2 = apvh.STYLE_UNKNOWN;
            }
            if (b2 != apvh.STYLE_HOME_FILTER) {
                apvi apviVar3 = apvgVar.e;
                if (apviVar3 == null) {
                    apviVar3 = apvi.a;
                }
                apvh b3 = apvh.b(apviVar3.c);
                if (b3 == null) {
                    b3 = apvh.STYLE_UNKNOWN;
                }
                if (b3 != apvh.STYLE_PREMIUM_CHIP) {
                    apvi apviVar4 = apvgVar.e;
                    if (apviVar4 == null) {
                        apviVar4 = apvi.a;
                    }
                    apvh b4 = apvh.b(apviVar4.c);
                    if (b4 == null) {
                        b4 = apvh.STYLE_UNKNOWN;
                    }
                    if (b4 != apvh.STYLE_DEFAULT) {
                        apvi apviVar5 = apvgVar.e;
                        if (apviVar5 == null) {
                            apviVar5 = apvi.a;
                        }
                        apvh b5 = apvh.b(apviVar5.c);
                        if (b5 == null) {
                            b5 = apvh.STYLE_UNKNOWN;
                        }
                        if (b5 != apvh.STYLE_EXPLORE_LAUNCHER_CHIP) {
                            apvi apviVar6 = apvgVar.e;
                            if (apviVar6 == null) {
                                apviVar6 = apvi.a;
                            }
                            apvh b6 = apvh.b(apviVar6.c);
                            if (b6 == null) {
                                b6 = apvh.STYLE_UNKNOWN;
                            }
                            if (b6 != apvh.STYLE_SHORTS_CHIP) {
                                apvi apviVar7 = apvgVar.e;
                                if (apviVar7 == null) {
                                    apviVar7 = apvi.a;
                                }
                                apvh b7 = apvh.b(apviVar7.c);
                                if (b7 == null) {
                                    b7 = apvh.STYLE_UNKNOWN;
                                }
                                if (b7 == apvh.STYLE_REFRESH_TO_NOVEL_CHIP) {
                                    fwlVar.t(R.drawable.chip_cloud_chip_r2n_unselected_background);
                                    fwlVar.v(this.k);
                                    fwlVar.l(R.drawable.chip_cloud_chip_r2n_selected_background);
                                    fwlVar.n(this.k);
                                    return;
                                }
                                fwlVar.t(R.drawable.chip_cloud_chip_default_background);
                                fwlVar.v(this.h);
                                fwlVar.l(R.drawable.chip_cloud_chip_primary_background);
                                fwlVar.n(this.i);
                                return;
                            }
                        }
                        fwlVar.t(R.drawable.chip_cloud_chip_launcher);
                        fwlVar.l(R.drawable.chip_cloud_chip_launcher);
                        fwlVar.v(this.k);
                        fwlVar.n(this.k);
                        fwlVar.u(R.attr.ytTouchResponse);
                        fwlVar.m(R.attr.ytTouchResponseInverse);
                        fwlVar.j(this.o);
                        fwlVar.r(this.t);
                        fwlVar.c(this.w);
                        fwlVar.h(this.q);
                        fwlVar.p(true);
                        if ((apvgVar.b & 2) == 0) {
                            fwlVar.q(0);
                            fwlVar.i(this.o);
                            apvi apviVar8 = apvgVar.e;
                            if (apviVar8 == null) {
                                apviVar8 = apvi.a;
                            }
                            apvh b8 = apvh.b(apviVar8.c);
                            if (b8 == null) {
                                b8 = apvh.STYLE_UNKNOWN;
                            }
                            if (b8 == apvh.STYLE_EXPLORE_LAUNCHER_CHIP) {
                                fwlVar.x(true);
                            }
                        }
                        apvi apviVar9 = apvgVar.e;
                        if (apviVar9 == null) {
                            apviVar9 = apvi.a;
                        }
                        apvh b9 = apvh.b(apviVar9.c);
                        if (b9 == null) {
                            b9 = apvh.STYLE_UNKNOWN;
                        }
                        if (b9 != apvh.STYLE_SHORTS_CHIP) {
                            return;
                        }
                        if (apvgVar.c == 7) {
                            arhr b10 = arhr.b(((arhs) apvgVar.d).c);
                            if (b10 == null) {
                                b10 = arhr.UNKNOWN;
                            }
                            if (b10 == arhr.PLAY_ARROW) {
                                fwlVar.b = ampq.j(Integer.valueOf(this.m));
                                return;
                            }
                        }
                        fwlVar.o(true);
                        return;
                    }
                }
            }
            boolean z = (apvgVar.b & 2) == 0 && apvgVar.c != 7;
            fwlVar.b(!z);
            if (z) {
                i = this.x;
            }
            fwlVar.k(i);
            fwlVar.t(true != z ? R.drawable.chip_cloud_chip_filter_unselected_background : R.drawable.chip_cloud_chip_filter_ghost_background);
            fwlVar.v(this.k);
            fwlVar.l(R.drawable.chip_cloud_chip_filter_selected_background);
            fwlVar.n(this.l);
            fwlVar.u(R.attr.ytTouchResponse);
            fwlVar.m(R.attr.ytTouchResponseInverse);
            return;
        }
        fwlVar.t(R.drawable.chip_cloud_chip_disabled_background);
        fwlVar.v(this.j);
        fwlVar.l(R.drawable.chip_cloud_chip_primary_background);
        fwlVar.n(this.i);
    }

    public fwn(Context context, boolean z) {
        super(context, null);
        this.g = z;
        Resources resources = getResources();
        this.v = getResources().getDimensionPixelSize(R.dimen.cloud_chip_corner_radius);
        this.w = getResources().getDimensionPixelSize(R.dimen.launcher_chip_corner_radius);
        this.n = resources.getDimensionPixelOffset(R.dimen.cloud_chip_icon_start_margin);
        this.o = resources.getDimensionPixelOffset(R.dimen.launcher_chip_icon_start_margin);
        this.p = resources.getDimensionPixelOffset(R.dimen.cloud_chip_icon_height);
        this.q = resources.getDimensionPixelOffset(R.dimen.cloud_chip_icon_height_launcher);
        this.r = resources.getDimensionPixelOffset(R.dimen.cloud_chip_text_padding);
        this.s = resources.getDimensionPixelOffset(R.dimen.cloud_chip_title_start_padding_with_image);
        this.t = resources.getDimensionPixelOffset(R.dimen.launcher_chip_text_start_padding);
        resources.getDimensionPixelOffset(R.dimen.cloud_chip_text_end_padding_with_multiselect_circle);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.cloud_chip_height);
        this.u = dimensionPixelSize;
        this.x = resources.getDimensionPixelSize(R.dimen.cloud_chip_ghost_width);
        this.h = zhn.d(context, R.attr.ytThemedBlue);
        this.i = zhn.d(context, R.attr.ytFilledButtonText);
        this.j = zhn.d(context, R.attr.ytIconActiveOther);
        this.k = zhn.d(context, R.attr.ytTextPrimary);
        this.l = zhn.d(context, R.attr.ytTextPrimaryInverse);
        this.m = zhn.d(context, R.attr.ytBrandRed);
        View.inflate(context, R.layout.chip_cloud_chip, this);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setMinimumHeight(dimensionPixelSize);
        setOrientation(0);
        this.c = (ImageView) findViewById(R.id.avatar);
        this.d = (ImageView) findViewById(R.id.icon);
        this.A = (ImageView) findViewById(R.id.checkbox_icon);
        this.B = (YouTubeTextView) findViewById(R.id.text);
    }
}
