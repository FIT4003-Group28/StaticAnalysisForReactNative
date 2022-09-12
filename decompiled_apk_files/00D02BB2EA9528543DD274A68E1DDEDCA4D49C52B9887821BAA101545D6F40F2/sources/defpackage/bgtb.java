package defpackage;

import android.view.ScaleGestureDetector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgtb  reason: default package */
/* loaded from: classes3.dex */
public final class bgtb extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ bgte a;

    public bgtb(bgte bgteVar) {
        this.a = bgteVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ckqg ckqgVar = this.a.e;
        if (ckqgVar != null) {
            cjql e = cjqg.e(ckqgVar);
            if (e == null) {
                return true;
            }
            this.a.c.n(e, new cjte(deaf.PINCH), cjtd.a(dtxs.N));
            return true;
        }
        return false;
    }
}
