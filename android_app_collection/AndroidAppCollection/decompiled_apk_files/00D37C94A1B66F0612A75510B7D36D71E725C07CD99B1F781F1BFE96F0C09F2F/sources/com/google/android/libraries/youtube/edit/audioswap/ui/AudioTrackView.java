package com.google.android.libraries.youtube.edit.audioswap.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AudioTrackView extends FrameLayout implements vqm, vqs {
    public final vvy a;
    public final Paint b;
    public vqr c;
    public vqp d;
    public zku e;
    public zkx f;
    public boolean g;
    public boolean h;
    public acti i;
    private final int j;
    private final int k;
    private final YouTubeTextView l;
    private Rect m;
    private int n;
    private long o;
    private int p;
    private float q;
    private ViewPropertyAnimator r;
    private boolean s;
    private boolean t;

    public AudioTrackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = true;
        this.h = false;
        this.t = false;
        Resources resources = context.getResources();
        this.j = ViewConfiguration.get(context).getScaledTouchSlop();
        this.l = (YouTubeTextView) LayoutInflater.from(context).inflate(R.layout.audio_swap_audio_track_view, (ViewGroup) this, true).findViewById(R.id.audio_swap_audio_track_view_scroll_hint);
        this.a = new vvy(context);
        this.k = akf.a(context, R.drawable.trim_handle_left).getIntrinsicWidth() / 2;
        float dimension = resources.getDimension(R.dimen.video_trim_view_container_border_width);
        Paint paint = new Paint();
        this.b = paint;
        paint.setColor(resources.getColor(R.color.video_trim_view_container_border));
        paint.setStrokeWidth((int) dimension);
        setWillNotDraw(false);
    }

    private final void e(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(!z);
        }
    }

    private final void g() {
        if (this.s) {
            this.s = false;
            acti actiVar = this.i;
            if (actiVar != null) {
                if (!this.t) {
                    actiVar.n(new acte(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_WAVEFORM));
                    this.t = true;
                }
                this.i.H(3, new acte(actj.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_WAVEFORM), null);
            }
        }
        e(true);
    }

    @Override // defpackage.vqm
    public final void H() {
    }

    @Override // defpackage.vqm
    public final void J() {
    }

    @Override // defpackage.vqs
    public final void a(vqr vqrVar, Set set) {
    }

    @Override // defpackage.vqs
    public final void b(vqr vqrVar, int i) {
        postInvalidate();
    }

    @Override // defpackage.vqs
    public final void c(vqr vqrVar, Set set) {
    }

    public final void d() {
        vqr vqrVar = this.c;
        if (vqrVar != null) {
            vqrVar.u(this);
            this.c = null;
        }
        vqp vqpVar = this.d;
        if (vqpVar != null) {
            vqpVar.h(this);
        }
        zku zkuVar = this.e;
        if (zkuVar != null) {
            zkuVar.setCallback(null);
            this.e = null;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.r;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.r = null;
        }
        this.a.a = null;
        requestLayout();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c == null) {
            return;
        }
        zku zkuVar = this.e;
        if (zkuVar != null) {
            zkuVar.a = this.n;
            zkuVar.setBounds(this.m);
            this.e.draw(canvas);
        }
        int width = this.m.width();
        int i = this.n;
        float f = width - (i + i);
        float b = this.m.left + this.n + (this.d.b(this.c.n()) * f);
        float b2 = this.m.left + this.n + (this.d.b(this.c.l()) * f);
        if (this.g) {
            this.a.setBounds(this.m);
            vvy vvyVar = this.a;
            vvyVar.b = b;
            vvyVar.c = b2;
            vvyVar.draw(canvas);
        }
        canvas.drawLine(b, this.m.top, b, this.m.bottom, this.b);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r3 != 6) goto L10;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            r0 = 0
            int r1 = r12.getPointerId(r0)
            float r2 = r12.getX(r0)
            int r3 = r12.getActionMasked()
            r4 = 1
            if (r3 == 0) goto Lbb
            if (r3 == r4) goto Lb3
            r12 = 2
            if (r3 == r12) goto L22
            r12 = 3
            if (r3 == r12) goto L1d
            r12 = 6
            if (r3 == r12) goto Lb3
            goto Lcd
        L1d:
            r11.g()
            goto Lcd
        L22:
            int r12 = r11.p
            if (r12 != r1) goto Lcd
            boolean r12 = r11.s
            if (r12 != 0) goto L3d
            float r12 = r11.q
            float r12 = r12 - r2
            float r12 = java.lang.Math.abs(r12)
            int r1 = r11.j
            float r1 = (float) r1
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 <= 0) goto L3d
            r11.s = r4
            r11.e(r0)
        L3d:
            boolean r12 = r11.s
            if (r12 == 0) goto Lcd
            float r12 = r11.q
            android.graphics.Rect r0 = r11.m
            int r0 = r0.width()
            vqp r1 = r11.d
            float r2 = r2 - r12
            float r12 = (float) r0
            float r2 = r2 / r12
            long r0 = r1.d(r2)
            long r2 = r11.o
            long r2 = r2 + r0
            zkx r12 = r11.f
            otb r0 = r12.b
            r5 = 0
            if (r0 == 0) goto L66
            long r0 = r0.d()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r7
            goto L67
        L66:
            r0 = r5
        L67:
            long r7 = r12.d()
            int r12 = r12.c()
            long r9 = (long) r12
            long r7 = r7 * r9
            long r0 = java.lang.Math.max(r7, r0)
            vqr r12 = r11.c
            long r7 = r12.l()
            vqr r12 = r11.c
            long r9 = r12.n()
            long r7 = r7 - r9
            long r7 = r7 - r0
            long r0 = java.lang.Math.max(r7, r2)
            long r0 = java.lang.Math.min(r5, r0)
            vqr r12 = r11.c
            r12.w(r0)
            android.view.ViewPropertyAnimator r12 = r11.r
            if (r12 != 0) goto Lcd
            com.google.android.libraries.youtube.common.ui.YouTubeTextView r12 = r11.l
            android.view.ViewPropertyAnimator r12 = r12.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r12 = r12.alpha(r0)
            android.content.res.Resources r0 = r11.getResources()
            r1 = 2131492872(0x7f0c0008, float:1.8609208E38)
            int r0 = r0.getInteger(r1)
            long r0 = (long) r0
            android.view.ViewPropertyAnimator r12 = r12.setDuration(r0)
            r11.r = r12
            goto Lcd
        Lb3:
            int r12 = r11.p
            if (r12 != r1) goto Lcd
            r11.g()
            goto Lcd
        Lbb:
            int r12 = r12.getPointerCount()
            if (r12 != r4) goto Lcd
            vqr r12 = r11.c
            long r5 = r12.g()
            r11.o = r5
            r11.p = r1
            r11.q = r2
        Lcd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.edit.audioswap.ui.AudioTrackView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.vqm
    public final void r(vqp vqpVar) {
        f();
        postInvalidate();
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e;
    }

    private final void f() {
        vqp vqpVar = this.d;
        if (vqpVar == null) {
            return;
        }
        int i = 0;
        int i2 = (vqpVar.c || this.h) ? 0 : this.k;
        this.m = new Rect(getPaddingLeft() + i2, getPaddingTop(), (getWidth() - getPaddingRight()) - i2, getHeight() - getPaddingBottom());
        if (this.d.c) {
            i = this.k;
        }
        this.n = i;
    }
}
