package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.CroppedVideoWithPreviewView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hjh  reason: default package */
/* loaded from: classes3.dex */
public final class hjh implements View.OnTouchListener, vua {
    final GestureDetector a;
    public hje b;
    public CroppedVideoWithPreviewView c;
    public FrameLayout d;
    public View e;
    public View f;
    public boolean g;
    public boolean h;
    private final Context i;

    public hjh(dt dtVar) {
        this.i = dtVar;
        GestureDetector gestureDetector = new GestureDetector(dtVar, new hjg(this));
        this.a = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    @Override // defpackage.vua
    public final void a(Point point) {
    }

    public final void b() {
        int color;
        if (this.h) {
            int round = Math.round(this.c.f());
            if (round <= 0) {
                return;
            }
            this.e.setVisibility(0);
            this.f.setVisibility(0);
            if (!this.g || !this.c.j()) {
                color = this.i.getResources().getColor(R.color.shorts_horizontal_crop_overlay_pan_disabled);
            } else {
                color = this.i.getResources().getColor(R.color.shorts_horizontal_crop_overlay_pan_enabled);
            }
            this.e.setBackgroundColor(color);
            this.f.setBackgroundColor(color);
            this.e.getLayoutParams().width = round;
            this.f.getLayoutParams().width = round;
            this.e.requestLayout();
            this.f.requestLayout();
            return;
        }
        this.e.setVisibility(8);
        this.f.setVisibility(8);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }
}
