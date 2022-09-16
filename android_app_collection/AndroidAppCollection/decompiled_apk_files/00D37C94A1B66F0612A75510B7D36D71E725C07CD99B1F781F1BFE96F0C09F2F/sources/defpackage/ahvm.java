package defpackage;

import android.content.Context;
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
/* renamed from: ahvm  reason: default package */
/* loaded from: classes.dex */
public final class ahvm implements View.OnClickListener {
    public final ViewGroup a;
    public final ahvk b;
    public ahuz c;
    public final Animation d;
    public final Animation e;
    public aijs f;
    private final CreatorEndscreenOverlayPresenter g;
    private final ahvl h;
    private final int i;

    public ahvm(Context context, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, ViewGroup viewGroup) {
        context.getClass();
        this.g = creatorEndscreenOverlayPresenter;
        viewGroup.getClass();
        this.a = viewGroup;
        this.h = creatorEndscreenOverlayPresenter;
        ahvk ahvkVar = new ahvk();
        this.b = ahvkVar;
        ahvkVar.a = (FrameLayout) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.endscreen_hovercard_layout, (ViewGroup) creatorEndscreenOverlayPresenter.g, false);
        ahvkVar.a.setOnClickListener(this);
        ahvkVar.a.findViewById(R.id.background_tint);
        ahvkVar.b = ahvkVar.a.findViewById(R.id.hovercard_layout);
        ahvkVar.c = ahvkVar.b.findViewById(R.id.hovercard_info_view);
        ahvkVar.c.setOnClickListener(this);
        ahvkVar.d = (ImageView) ahvkVar.a.findViewById(R.id.hovercard_thumbnail);
        ahvkVar.e = (ImageView) ahvkVar.a.findViewById(R.id.hovercard_thumbnail_circular);
        ahvkVar.f = (TextView) ahvkVar.a.findViewById(R.id.hovercard_title);
        ahvkVar.g = (TextView) ahvkVar.a.findViewById(R.id.hovercard_details);
        ahvkVar.h = (TextView) ahvkVar.a.findViewById(R.id.hovercard_watch_button);
        ahvkVar.j = (TextView) ahvkVar.a.findViewById(R.id.hovercard_price_label);
        ahvkVar.k = (TextView) ahvkVar.a.findViewById(R.id.hovercard_additional_fees_label);
        ahvkVar.l = (TextView) ahvkVar.a.findViewById(R.id.hovercard_additional_info_label);
        ViewGroup viewGroup2 = (ViewGroup) ahvkVar.b.findViewById(R.id.thumbnail_container);
        ahvkVar.i = (TextView) ahvkVar.a.findViewById(R.id.hovercard_cancel_button);
        ahvkVar.h.setOnClickListener(this);
        ahvkVar.i.setOnClickListener(this);
        ahvkVar.m = (FrameLayout) ahvkVar.b.findViewById(R.id.hovercard_subscribe_container);
        this.i = zew.i(context.getResources().getDisplayMetrics(), 400);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.d = alphaAnimation;
        alphaAnimation.setDuration(context.getResources().getInteger(R.integer.endscreen_hovercard_fade_in_duration_ms));
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.e = alphaAnimation2;
        alphaAnimation2.setDuration(context.getResources().getInteger(R.integer.endscreen_hovercard_fade_in_duration_ms));
        alphaAnimation2.setAnimationListener(new ahvj(this));
    }

    public final void a(boolean z) {
        if (!z) {
            b();
        } else if (this.b.a == null) {
        } else {
            if (this.e.hasStarted() && !this.e.hasEnded()) {
                return;
            }
            this.b.a.clearAnimation();
            this.d.reset();
            this.b.a.startAnimation(this.e);
        }
    }

    public final void b() {
        FrameLayout frameLayout = this.b.a;
        if (frameLayout == null || frameLayout.getParent() == null) {
            return;
        }
        this.a.removeView(this.b.a);
    }

    public final void c() {
        float f = this.f == aijs.FULLSCREEN ? 0.6f : 0.9f;
        if (this.b.b == null) {
            return;
        }
        zgd.t(this.b.b, zgd.r(Math.min(this.i, (int) (this.a.getWidth() * f))), ViewGroup.LayoutParams.class);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.hovercard_watch_button || view.getId() == R.id.hovercard_info_view) {
            this.h.n(this.c);
        } else if (view.getId() != R.id.hovercard_cancel_button && view.getId() != R.id.background) {
        } else {
            this.h.m();
        }
    }
}
