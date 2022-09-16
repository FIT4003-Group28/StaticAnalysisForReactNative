package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
/* compiled from: PG */
/* renamed from: alnt  reason: default package */
/* loaded from: classes.dex */
final class alnt implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            aloe aloeVar = (aloe) message.obj;
            int i2 = message.arg1;
            if (!aloeVar.j() || aloeVar.e.getVisibility() != 0) {
                aloeVar.k();
            } else if (aloeVar.e.a == 1) {
                ValueAnimator c = aloeVar.c(1.0f, 0.0f);
                c.setDuration(75L);
                c.addListener(new alnp(aloeVar));
                c.start();
            } else {
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setIntValues(0, aloeVar.b());
                valueAnimator.setInterpolator(alhv.b);
                valueAnimator.setDuration(250L);
                valueAnimator.addListener(new alns(aloeVar));
                valueAnimator.addUpdateListener(new alnq(aloeVar, 3));
                valueAnimator.start();
            }
            return true;
        }
        aloe aloeVar2 = (aloe) message.obj;
        aloeVar2.e.d = new alny(aloeVar2);
        if (aloeVar2.e.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = aloeVar2.e.getLayoutParams();
            if (layoutParams instanceof ajf) {
                ajf ajfVar = (ajf) layoutParams;
                BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = aloeVar2.k;
                if (baseTransientBottomBar$Behavior == null) {
                    baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                }
                baseTransientBottomBar$Behavior.g.a = aloeVar2.m;
                baseTransientBottomBar$Behavior.f = new aloa(aloeVar2);
                ajfVar.b(baseTransientBottomBar$Behavior);
                ajfVar.g = 80;
            }
            aloeVar2.i();
            aloeVar2.e.setVisibility(4);
            aloeVar2.c.addView(aloeVar2.e);
        }
        if (lj.al(aloeVar2.e)) {
            aloeVar2.h();
        } else {
            aloeVar2.e.c = new alnz(aloeVar2);
        }
        return true;
    }
}
