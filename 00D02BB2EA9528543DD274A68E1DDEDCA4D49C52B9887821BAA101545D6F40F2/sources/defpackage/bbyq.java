package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.view.MotionEvent;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbyq  reason: default package */
/* loaded from: classes3.dex */
public final class bbyq implements View.OnTouchListener {
    final /* synthetic */ bbyy a;

    public bbyq(bbyy bbyyVar) {
        this.a = bbyyVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Camera.Parameters c;
        if (motionEvent.getAction() != 0) {
            return false;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float w = bbyy.w(width, x);
        float w2 = bbyy.w(height, y);
        bbwn bbwnVar = (bbwn) this.a.h;
        Camera camera = bbwnVar.h;
        if (camera != null && (c = bbwnVar.c()) != null) {
            RectF rectF = new RectF(Math.max(w - 0.1f, -1.0f), Math.max((-0.1f) + w2, -1.0f), Math.min(w + 0.1f, 1.0f), Math.min(w2 + 0.1f, 1.0f));
            bbwnVar.f.mapRect(rectF);
            dcdc f = dcdc.f(new Camera.Area(new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom)), 1));
            if (c.getMaxNumFocusAreas() > 0) {
                c.setFocusAreas(f);
            }
            if (c.getMaxNumMeteringAreas() > 0) {
                c.setMeteringAreas(f);
            }
            camera.setParameters(c);
            bbwnVar.g.e(camera, null);
        }
        return true;
    }
}
