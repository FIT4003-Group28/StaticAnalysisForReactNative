package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
/* compiled from: PG */
/* renamed from: lbt  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lbt implements Runnable {
    public final /* synthetic */ lbx a;
    private final /* synthetic */ int b;

    public /* synthetic */ lbt(lbx lbxVar, int i) {
        this.b = i;
        this.a = lbxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.c();
        } else if (i == 1) {
            this.a.d();
        } else if (i == 2) {
            lbx lbxVar = this.a;
            lbxVar.e();
            lbxVar.l.removeView(lbxVar.m);
            lbxVar.o = 0;
        } else {
            lbx lbxVar2 = this.a;
            SlimStatusBar slimStatusBar = lbxVar2.m;
            int i2 = lbxVar2.b;
            int i3 = lbxVar2.c;
            AnimatorSet animatorSet = new AnimatorSet();
            Animator d = lmr.d(slimStatusBar, i2, i3, 400L);
            Animator d2 = lmr.d(slimStatusBar, i3, i2, 400L);
            d2.setStartDelay(200L);
            animatorSet.playSequentially(d, d2);
            lbxVar2.k = animatorSet;
            lbxVar2.k.start();
        }
    }
}
