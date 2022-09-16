package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ahuz  reason: default package */
/* loaded from: classes.dex */
public class ahuz extends ajbg implements View.OnClickListener {
    private static final int[] j = {R.attr.selectableItemBackgroundBorderless};
    public final Context a;
    public final aqvc b;
    public final CreatorEndscreenOverlayPresenter c;
    public final ahuy d;
    public TextView e;
    public final float f;
    public final Animation.AnimationListener g;
    public final AlphaAnimation h;
    public final AlphaAnimation i;
    private FrameLayout k;
    private FrameLayout r;
    private ImageView s;

    public ahuz(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aqvc aqvcVar) {
        super(aqvcVar.l, aqvcVar.m, 1, 1, null);
        ahux ahuxVar = new ahux(this);
        this.g = ahuxVar;
        this.a = context;
        aqvcVar.getClass();
        this.b = aqvcVar;
        this.c = creatorEndscreenOverlayPresenter;
        this.d = creatorEndscreenOverlayPresenter;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.h = alphaAnimation;
        alphaAnimation.setDuration(context.getResources().getInteger(R.integer.endscreen_hovercard_fade_in_duration_ms));
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.i = alphaAnimation2;
        alphaAnimation2.setDuration(context.getResources().getInteger(R.integer.endscreen_hovercard_fade_in_duration_ms));
        alphaAnimation2.setAnimationListener(ahuxVar);
        this.f = context.getResources().getDimension(R.dimen.endscreen_element_text_size) * 6.0f;
    }

    public static void e(FrameLayout frameLayout) {
        TypedArray obtainStyledAttributes = frameLayout.getContext().obtainStyledAttributes(j);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        frameLayout.setForeground(drawable);
    }

    @Override // defpackage.ajbg
    protected final void a() {
        this.d.k(this);
    }

    @Override // defpackage.ajbg
    public final void b(boolean z, boolean z2, boolean z3) {
        this.d.r(this);
    }

    public View c() {
        arag aragVar;
        if (this.k == null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.a).inflate(R.layout.endscreen_element_layout_video, (ViewGroup) this.c.g, false);
            this.k = frameLayout;
            frameLayout.setOnClickListener(this);
            this.r = (FrameLayout) this.k.findViewById(R.id.image_container);
            ImageView d = d();
            int a = aqvb.a(this.b.c);
            if (a == 0 || a != 6) {
                d.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                d.setScaleType(ImageView.ScaleType.FIT_CENTER);
                d.setBackgroundColor(zhn.j(this.a, R.attr.ytStaticWhite).orElse(0));
            }
            this.r.addView(d, -1, -1);
            e(this.r);
            TextView textView = (TextView) this.k.findViewById(R.id.title_text);
            this.e = textView;
            aqvc aqvcVar = this.b;
            if ((aqvcVar.b & 4096) != 0) {
                aragVar = aqvcVar.n;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            zag.m(textView, ajgl.b(aragVar));
            f(this.k);
        }
        return this.k;
    }

    public ImageView d() {
        if (this.s == null) {
            this.s = new ImageView(this.a);
        }
        return this.s;
    }

    public void f(View view) {
        arag aragVar;
        aqvc aqvcVar = this.b;
        arag aragVar2 = null;
        if ((aqvcVar.b & 4096) != 0) {
            aragVar = aqvcVar.n;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        CharSequence i = ajgl.i(aragVar);
        if (i == null) {
            aqvc aqvcVar2 = this.b;
            if ((aqvcVar2.b & 4096) != 0 && (aragVar2 = aqvcVar2.n) == null) {
                aragVar2 = arag.a;
            }
            i = ajgl.b(aragVar2);
        }
        view.setContentDescription(i);
    }

    public void g(ahvk ahvkVar) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        TextView textView = ahvkVar.f;
        aqvc aqvcVar = this.b;
        arag aragVar4 = null;
        if ((aqvcVar.b & 4096) != 0) {
            aragVar = aqvcVar.n;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = ahvkVar.g;
        aqvc aqvcVar2 = this.b;
        if ((aqvcVar2.b & 8192) != 0) {
            aragVar2 = aqvcVar2.o;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        TextView textView3 = ahvkVar.h;
        aqvc aqvcVar3 = this.b;
        if ((aqvcVar3.b & 131072) != 0) {
            aragVar3 = aqvcVar3.r;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        textView3.setText(ajgl.b(aragVar3));
        TextView textView4 = ahvkVar.i;
        aqvc aqvcVar4 = this.b;
        if ((aqvcVar4.b & 262144) != 0 && (aragVar4 = aqvcVar4.s) == null) {
            aragVar4 = arag.a;
        }
        textView4.setText(ajgl.b(aragVar4));
        int a = aqvb.a(this.b.c);
        if (a != 0 && a == 6) {
            ahvkVar.d.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public void h(ajmy ajmyVar) {
        ImageView d = d();
        avhn avhnVar = this.b.d;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(d, avhnVar);
    }

    public boolean i() {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == c()) {
            this.d.o(this);
        }
    }
}
