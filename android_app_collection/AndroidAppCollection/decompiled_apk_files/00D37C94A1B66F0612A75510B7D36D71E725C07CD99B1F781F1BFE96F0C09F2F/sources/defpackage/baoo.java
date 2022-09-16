package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
/* compiled from: PG */
/* renamed from: baoo  reason: default package */
/* loaded from: classes2.dex */
public final class baoo extends SurfaceView implements SurfaceHolder.Callback, VideoSink, baoc {
    public final baof a;
    public int b;
    public int c;
    private final String d;
    private final baod e;

    public baoo(Context context) {
        super(context);
        this.e = new baod();
        String b = b();
        this.d = b;
        baof baofVar = new baof(b);
        this.a = baofVar;
        getHolder().addCallback(this);
        getHolder().addCallback(baofVar);
    }

    private final String b() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException unused) {
            return "";
        }
    }

    public final void a() {
        bapa.d();
        getHolder().setSizeFromLayout();
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        this.a.onFrame(videoFrame);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        bapa.d();
        baof baofVar = this.a;
        float f = (i3 - i) / (i4 - i2);
        StringBuilder sb = new StringBuilder(37);
        sb.append("setLayoutAspectRatio: ");
        sb.append(f);
        baofVar.b(sb.toString());
        synchronized (baofVar.m) {
            baofVar.n = f;
        }
        a();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onMeasure(int i, int i2) {
        Point point;
        bapa.d();
        baod baodVar = this.e;
        int i3 = this.b;
        int i4 = this.c;
        int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i);
        int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i2);
        if (i3 == 0 || i4 == 0 || defaultSize == 0 || defaultSize2 == 0) {
            point = new Point(defaultSize, defaultSize2);
        } else {
            float f = i3 / i4;
            float f2 = defaultSize;
            float f3 = defaultSize2;
            float f4 = f2 / f3;
            boolean z = false;
            boolean z2 = f > 1.0f;
            if (f4 > 1.0f) {
                z = true;
            }
            if (z2 != z) {
                float f5 = baodVar.b;
            } else {
                float f6 = baodVar.a;
            }
            if (f == 0.0f) {
                point = new Point(defaultSize, defaultSize2);
            } else {
                point = new Point(Math.min(defaultSize, Math.round((f3 / 0.5625f) * f)), Math.min(defaultSize2, Math.round((f2 / 0.5625f) / f)));
            }
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                point.x = defaultSize;
            }
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                point.y = defaultSize2;
            }
        }
        setMeasuredDimension(point.x, point.y);
        int i5 = point.x;
        int i6 = point.y;
        StringBuilder sb = new StringBuilder(46);
        sb.append("onMeasure(). New size: ");
        sb.append(i5);
        sb.append("x");
        sb.append(i6);
        String sb2 = sb.toString();
        String str = this.d;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(sb2).length());
        sb3.append(str);
        sb3.append(": ");
        sb3.append(sb2);
        Logging.a("SurfaceViewRenderer", sb3.toString());
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        bapa.d();
        a();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
