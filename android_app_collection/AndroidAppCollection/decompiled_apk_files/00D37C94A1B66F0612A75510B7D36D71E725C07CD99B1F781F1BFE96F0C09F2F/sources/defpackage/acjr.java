package defpackage;

import android.view.ScaleGestureDetector;
/* compiled from: PG */
/* renamed from: acjr  reason: default package */
/* loaded from: classes.dex */
final class acjr extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ acjs a;

    public acjr(acjs acjsVar) {
        this.a = acjsVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        acjp acjpVar = this.a.ak;
        if (acjpVar != null) {
            ((acke) acjpVar).e.aN(scaleGestureDetector.getScaleFactor());
            return true;
        }
        return true;
    }
}
