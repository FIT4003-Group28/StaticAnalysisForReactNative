package defpackage;

import android.hardware.Camera;
import android.os.Handler;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsZoomSlider;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ShortsRecordButtonView;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gxz  reason: default package */
/* loaded from: classes3.dex */
public final class gxz implements hoq {
    public final hor a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final gyq e;
    private final View f;
    private final boolean g;
    private final int h;
    private final int i;
    private final Runnable j;
    private final Handler k = new Handler();
    private boolean l;
    private float m;
    private final gxc n;

    public gxz(final gxc gxcVar, final gyq gyqVar, View view, boolean z) {
        this.n = gxcVar;
        this.e = gyqVar;
        this.a = new hor(this, view, true, true);
        this.f = view;
        this.g = z;
        this.h = view.getResources().getDimensionPixelSize(R.dimen.shorts_record_button_zoom_in_slop_threshold);
        this.i = view.getResources().getDimensionPixelSize(R.dimen.shorts_record_button_zoom_out_slop_threshold);
        this.j = new Runnable() { // from class: gxy
            @Override // java.lang.Runnable
            public final void run() {
                gxz gxzVar = gxz.this;
                gyq gyqVar2 = gyqVar;
                gxc gxcVar2 = gxcVar;
                gxzVar.b = true;
                gyqVar2.a(actj.SHORTS_CREATION_RECORD_BUTTON).i(1025);
                ShortsZoomSlider shortsZoomSlider = gxcVar2.a.aI;
                if (shortsZoomSlider != null) {
                    shortsZoomSlider.d(true);
                }
            }
        };
    }

    private final void f() {
        this.k.removeCallbacks(this.j);
        this.b = false;
    }

    private final void g() {
        gxk gxkVar = this.n.a;
        if (gxkVar.bh == 1 && gxkVar.ay != null) {
            gxkVar.aB.f();
            gxkVar.bh = 2;
            gxkVar.aS(0);
            gxkVar.aE();
        }
        this.c = false;
    }

    @Override // defpackage.hoq
    public final void mf() {
        f();
        if (this.c) {
            g();
            return;
        }
        this.l = false;
        gxc gxcVar = this.n;
        gxk gxkVar = gxcVar.a;
        if (gxkVar.bh == 0) {
            gxkVar.aA.n();
            gxk gxkVar2 = gxcVar.a;
            gxkVar2.aQ(gxkVar2.aq.a(), false);
        }
        this.c = true;
        this.k.postDelayed(this.j, ViewConfiguration.getLongPressTimeout());
    }

    @Override // defpackage.hoq
    public final void mg() {
        f();
        if (this.c) {
            this.e.a(actj.SHORTS_CREATION_RECORD_BUTTON).f();
            g();
        }
    }

    @Override // defpackage.hoq
    public final void mh() {
        if (this.b) {
            g();
        } else {
            if (this.c) {
                gxc gxcVar = this.n;
                gxcVar.a.aB.e();
                ShortsZoomSlider shortsZoomSlider = gxcVar.a.aI;
                if (shortsZoomSlider != null) {
                    shortsZoomSlider.e(false, 0);
                }
            }
            this.e.a(actj.SHORTS_CREATION_RECORD_BUTTON).b();
        }
        f();
    }

    @Override // defpackage.hoq
    public final void mk(float f, float f2) {
        float max;
        Camera.Parameters j;
        if (this.c) {
            ShortsRecordButtonView shortsRecordButtonView = this.n.a.aB;
            shortsRecordButtonView.h.setTranslationX(f);
            shortsRecordButtonView.h.setTranslationY(f2);
            float hypot = (float) Math.hypot(f, f2);
            float f3 = shortsRecordButtonView.f;
            if (hypot >= f3 && !shortsRecordButtonView.p) {
                ShortsRecordButtonView.a(shortsRecordButtonView.g, 0.0f, 0.0f);
                shortsRecordButtonView.p = true;
            } else if (hypot < f3) {
                if (shortsRecordButtonView.p) {
                    ShortsRecordButtonView.a(shortsRecordButtonView.g, f, f2);
                    shortsRecordButtonView.p = false;
                } else {
                    shortsRecordButtonView.g.setTranslationX(f);
                    shortsRecordButtonView.g.setTranslationY(f2);
                }
            }
            if (!this.g) {
                return;
            }
            if (!this.l) {
                float f4 = -this.h;
                if (f2 <= f4) {
                    this.l = true;
                    this.m = f4;
                } else if (f2 < this.i || !this.b) {
                    return;
                } else {
                    this.l = true;
                    this.m = f2;
                }
            }
            float f5 = this.m;
            if (f2 <= f5) {
                max = Math.min(1.0f, Math.max(0.0f, (-(f2 - f5)) / (this.f.getTop() - this.f.getHeight())));
            } else {
                float f6 = ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).bottomMargin;
                max = Math.max(-1.0f, Math.min(0.0f, (-(f2 - f5)) / Math.max(f6, ((this.f.getHeight() / 2.0f) + f6) - this.m)));
            }
            this.e.a(actj.SHORTS_CREATION_ZOOM_BUTTON).f();
            CameraView cameraView = this.n.a.aA;
            Camera a = cameraView.A.a();
            if (a == null || (j = cameraView.A.j(a)) == null || !j.isZoomSupported()) {
                return;
            }
            if (cameraView.k < 0) {
                cameraView.k = j.getZoom();
            }
            int maxZoom = j.getMaxZoom();
            cameraView.w(a, j, CameraView.f(max, max >= 0.0f ? maxZoom : Math.max(Math.round(maxZoom * 0.15f), cameraView.k), cameraView.k), maxZoom, false);
        }
    }

    @Override // defpackage.hoq
    public final void ml(float f) {
        if (!this.g) {
            this.e.a(actj.SHORTS_CREATION_ZOOM_BUTTON).f();
            this.n.a.aA.p(f);
        }
    }
}
