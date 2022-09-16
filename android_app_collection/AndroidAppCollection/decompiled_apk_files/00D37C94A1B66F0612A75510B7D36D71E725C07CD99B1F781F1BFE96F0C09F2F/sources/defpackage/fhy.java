package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.support.rastermill.FrameSequenceDrawable;
import android.util.Log;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: fhy  reason: default package */
/* loaded from: classes3.dex */
final class fhy extends AnimatorListenerAdapter {
    final /* synthetic */ fib a;

    public fhy(fib fibVar) {
        this.a = fibVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte[] bArr;
        super.onAnimationEnd(animator);
        fib fibVar = this.a;
        fibVar.c = 1.0f;
        afts aftsVar = fibVar.o;
        if (aftsVar != null && (bArr = fibVar.q) != null && fibVar.p != null) {
            try {
                Drawable drawable = (Drawable) aftsVar.b(bArr);
                if (drawable instanceof FrameSequenceDrawable) {
                    fibVar.setImageDrawable(drawable);
                    fibVar.p.b((FrameSequenceDrawable) drawable);
                    fibVar.p.c();
                }
            } catch (IOException | zhy e) {
                Log.e("ImageZoomView", "Failed converting bytes to drawable", e);
            }
        }
        Dialog dialog = this.a.f;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
