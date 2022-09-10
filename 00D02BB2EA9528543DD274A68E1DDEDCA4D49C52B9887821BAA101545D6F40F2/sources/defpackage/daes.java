package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
/* compiled from: PG */
/* renamed from: daes  reason: default package */
/* loaded from: classes5.dex */
final class daes implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            daff daffVar = (daff) message.obj;
            daffVar.e.d = new daey(daffVar);
            if (daffVar.e.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = daffVar.e.getLayoutParams();
                if (layoutParams instanceof ajl) {
                    ajl ajlVar = (ajl) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    baseTransientBottomBar$Behavior.g.a = daffVar.m;
                    baseTransientBottomBar$Behavior.f = new dafa(daffVar);
                    ajlVar.a(baseTransientBottomBar$Behavior);
                    ajlVar.g = 80;
                }
                daffVar.a();
                daffVar.e.setVisibility(4);
                daffVar.c.addView(daffVar.e);
            }
            if (od.ae(daffVar.e)) {
                daffVar.g();
            } else {
                daffVar.e.c = new daez(daffVar);
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            daff daffVar2 = (daff) message.obj;
            int i2 = message.arg1;
            if (!daffVar2.k() || daffVar2.e.getVisibility() != 0) {
                daffVar2.m();
            } else if (daffVar2.e.a == 1) {
                ValueAnimator h = daffVar2.h(1.0f, 0.0f);
                h.setDuration(75L);
                h.addListener(new dael(daffVar2, i2));
                h.start();
            } else {
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(0, daffVar2.i());
                valueAnimator.setInterpolator(czum.b);
                valueAnimator.setDuration(250L);
                valueAnimator.addListener(new daeq(daffVar2, i2));
                valueAnimator.addUpdateListener(new daer(daffVar2));
                valueAnimator.start();
            }
            return true;
        }
    }
}
