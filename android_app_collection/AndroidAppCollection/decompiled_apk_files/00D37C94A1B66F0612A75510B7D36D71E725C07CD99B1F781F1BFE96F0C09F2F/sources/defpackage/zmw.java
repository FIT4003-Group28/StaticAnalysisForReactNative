package defpackage;

import android.view.ScaleGestureDetector;
/* compiled from: PG */
/* renamed from: zmw  reason: default package */
/* loaded from: classes4.dex */
public final class zmw extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    private final zmv a;

    public zmw(zmv zmvVar) {
        zmvVar.getClass();
        this.a = zmvVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.a.mj(scaleGestureDetector.getScaleFactor());
        return true;
    }
}
