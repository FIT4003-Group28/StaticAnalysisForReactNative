package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zzy  reason: default package */
/* loaded from: classes4.dex */
public final class zzy extends aizc implements ValueAnimator.AnimatorUpdateListener, aaam {
    public float a;
    public aaak b;
    private final Resources c;
    private final View d;
    private final View e;
    private final View f;
    private final View g;
    private final TouchImageView h;
    private final TextView i;
    private final TouchImageView j;
    private final zzx k;
    private final alxt l;
    private final boolean m;
    private boolean n;
    private ValueAnimator o;
    private final ValueAnimator p;
    private final Handler q;
    private final Runnable r;
    private float s;
    private float t;
    private boolean u;
    private final PointF v;
    private Vibrator w;

    public zzy(Context context, boolean z) {
        super(context);
        this.m = z;
        this.c = context.getResources();
        LayoutInflater from = LayoutInflater.from(context);
        from.inflate(R.layout.info_cards_teaser_overlay, this);
        View findViewById = findViewById(R.id.info_card_teaser_overlay);
        findViewById.getClass();
        this.d = findViewById;
        View findViewById2 = findViewById(R.id.info_card_teaser_wrapper);
        findViewById2.getClass();
        this.e = findViewById2;
        View findViewById3 = findViewById(R.id.info_card_teaser_content);
        findViewById3.getClass();
        this.f = findViewById3;
        View findViewById4 = findViewById(R.id.info_card_teaser_background);
        findViewById4.getClass();
        this.g = findViewById4;
        TouchImageView touchImageView = (TouchImageView) findViewById(R.id.info_card_teaser_icon);
        touchImageView.getClass();
        this.h = touchImageView;
        View findViewById5 = findViewById3.findViewById(R.id.info_card_teaser_message);
        findViewById5.getClass();
        this.i = (TextView) findViewById5;
        this.v = new PointF(0.0f, 0.0f);
        if (z) {
            ValueAnimator duration = ValueAnimator.ofFloat(new float[0]).setDuration(100L);
            this.o = duration;
            duration.addUpdateListener(this);
        }
        ValueAnimator duration2 = ValueAnimator.ofFloat(new float[0]).setDuration(580L);
        this.p = duration2;
        duration2.addUpdateListener(this);
        Handler handler = new Handler();
        this.q = handler;
        this.r = new zzr(this);
        TouchImageView touchImageView2 = (TouchImageView) from.inflate(R.layout.info_card_button, (ViewGroup) null);
        this.j = touchImageView2;
        m(false);
        touchImageView2.setVisibility(8);
        findViewById2.setVisibility(0);
        this.k = new zzx(new zzs(this), handler);
        findViewById2.setOnClickListener(new zzt(this));
        alxt alxtVar = new alxt(findViewById2, new zzu(this));
        this.l = alxtVar;
        findViewById2.setOnTouchListener(alxtVar);
        i();
    }

    @Override // defpackage.aaam
    public final TouchImageView a() {
        return this.j;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.aaam
    public final Boolean d(arji arjiVar, long j, long j2) {
        int width;
        this.u = lj.e(this.d) == 1;
        if (this.m) {
            ViewGroup viewGroup = (ViewGroup) this.j.getParent();
            if (viewGroup == null || viewGroup.getParent() == null) {
                return false;
            }
            if (this.u) {
                width = viewGroup.getLeft();
            } else {
                width = ((ViewGroup) viewGroup.getParent()).getWidth() - viewGroup.getRight();
            }
            this.v.set(width, ((RelativeLayout.LayoutParams) viewGroup.getLayoutParams()).topMargin);
        }
        TextView textView = this.i;
        arag aragVar = arjiVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
        this.p.setFloatValues(this.t, 580.0f);
        this.p.start();
        this.q.removeCallbacks(this.r);
        this.q.postDelayed(this.r, j);
        if (j2 > 0) {
            boolean z = this.k.b;
        }
        if (zdg.e(getContext())) {
            if (this.w == null) {
                this.w = (Vibrator) getContext().getSystemService("vibrator");
            }
            if (this.w.hasVibrator()) {
                this.w.vibrate(this.c.getInteger(R.integer.info_card_accessibility_teaser_vibrate_duration_ms));
            }
        }
        h();
        return true;
    }

    @Override // defpackage.aaam
    public final void e() {
        if (this.m) {
            float f = this.s;
            if (f < 1.0E-5f) {
                return;
            }
            this.o.setFloatValues(f, 0.0f);
            this.o.start();
            h();
        }
    }

    @Override // defpackage.aaam
    public final void f() {
        if (!this.m) {
            return;
        }
        float f = this.s;
        if (f > 0.99999f) {
            return;
        }
        this.o.setFloatValues(f, 1.0f);
        this.o.start();
        h();
    }

    @Override // defpackage.aaam
    public final void g(boolean z) {
        this.q.removeCallbacks(this.r);
        if (z) {
            this.p.setFloatValues(this.t, 0.0f);
            this.p.start();
        } else {
            this.p.cancel();
            this.t = 0.0f;
        }
        h();
    }

    public final void h() {
        lj.Y(this.e, 0, (int) this.v.y, (int) (this.v.x * this.s), 0);
        float max = Math.max(aakx.c(0.0f, 250.0f, this.t), this.a);
        this.h.setAlpha(max);
        this.j.setAlpha(1.0f - max);
        this.j.setVisibility((!this.n || !this.m) ? 8 : 0);
        float c = aakx.c(250.0f, 580.0f, this.t);
        lj.Z(this.g, c);
        float width = (this.g.getWidth() / 2.0f) * (1.0f - c);
        if (this.u) {
            lj.ab(this.g, -width);
        } else {
            lj.ab(this.g, width);
        }
        this.g.setAlpha(c);
        float c2 = aakx.c(415.0f, 580.0f, this.t);
        this.i.setAlpha(c2);
        if (Math.abs(c2) < 1.0E-5f) {
            if (this.i.getVisibility() != 8) {
                this.i.setVisibility(8);
                aaak aaakVar = this.b;
                if (aaakVar != null) {
                    aaakVar.c();
                }
            }
        } else if (this.i.getVisibility() != 0) {
            this.i.setVisibility(0);
        }
        if (Math.abs(max) < 1.0E-5f) {
            if (getVisibility() == 8) {
                return;
            }
            setVisibility(8);
            aaak aaakVar2 = this.b;
            if (aaakVar2 == null) {
                return;
            }
            aaakVar2.a.g(true);
        } else if (getVisibility() == 0) {
        } else {
            setVisibility(0);
        }
    }

    @Override // defpackage.aaam
    public final void i() {
        if (this.m) {
            this.o.cancel();
        }
        this.p.cancel();
        this.q.removeCallbacks(this.r);
        this.s = 0.0f;
        this.t = 0.0f;
        zzx zzxVar = this.k;
        zzxVar.f.cancel();
        zzxVar.a.removeCallbacks(zzxVar.d);
        zzxVar.c = false;
        zzxVar.e = false;
        zzxVar.g.a(0.0f);
        j(false);
        h();
    }

    @Override // defpackage.aaam
    public final void j(boolean z) {
        this.n = z;
        boolean z2 = this.k.b;
        h();
    }

    @Override // defpackage.aaam
    public final void l() {
        setVisibility(0);
    }

    @Override // defpackage.aaam
    public final void m(boolean z) {
        if (z) {
            this.j.setContentDescription(getResources().getString(R.string.accessibility_annotation_overlay_info_cards_drawer_dismiss));
        } else {
            this.j.setContentDescription(getResources().getString(R.string.accessibility_info_cards));
        }
    }

    @Override // defpackage.aaam
    public final void o(aaak aaakVar) {
        this.b = aaakVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (valueAnimator == this.o) {
            this.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        } else if (valueAnimator == this.p) {
            this.t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
        h();
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        lj.Y(this.f, i / 10, 0, 0, 0);
    }
}
