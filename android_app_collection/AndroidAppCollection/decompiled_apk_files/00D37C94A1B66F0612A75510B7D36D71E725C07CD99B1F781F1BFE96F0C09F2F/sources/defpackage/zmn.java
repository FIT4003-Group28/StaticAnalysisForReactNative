package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.provider.Settings;
import android.util.Property;
import android.view.OrientationEventListener;
/* compiled from: PG */
/* renamed from: zmn  reason: default package */
/* loaded from: classes4.dex */
final class zmn extends OrientationEventListener {
    final /* synthetic */ zmp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmn(zmp zmpVar, Context context) {
        super(context);
        this.a = zmpVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        int i2 = -1;
        if (i == -1 || this.a.ae.H() || this.a.af.getHeight() == 0 || Settings.System.getInt(this.a.af.getContext().getContentResolver(), "accelerometer_rotation", 0) != 1) {
            return;
        }
        int i3 = (i + this.a.at) % 360;
        int[] iArr = zmp.a;
        int i4 = 0;
        while (true) {
            if (i4 >= 3) {
                break;
            }
            int i5 = iArr[i4];
            int abs = Math.abs(i3 - i5);
            if (abs > 180) {
                abs = 360 - abs;
            }
            if (abs < 20) {
                i2 = i5;
                break;
            }
            i4++;
        }
        if (i2 < 0) {
            return;
        }
        zmp zmpVar = this.a;
        if (i2 == zmpVar.ar) {
            return;
        }
        zmpVar.ar = i2;
        zmpVar.r(zmpVar.d.c());
        int i6 = zmpVar.ar;
        float f = 360.0f - i6;
        if (f > 180.0f) {
            f = -i6;
        }
        zmpVar.ai.animate().rotation(f).setDuration(300L).start();
        int i7 = zmpVar.an.a;
        Property p = zmp.p(i7);
        float n = zmpVar.n(i7, false);
        Property p2 = zmp.p(zmpVar.ar);
        float n2 = zmpVar.n(zmpVar.ar, false);
        float n3 = zmpVar.n(zmpVar.ar, true);
        AnimatorSet animatorSet = zmpVar.aj;
        if (animatorSet != null && animatorSet.isRunning()) {
            zmpVar.aj.cancel();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zmpVar.an, p.getName(), ((Float) p.get(zmpVar.an)).floatValue(), n);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zmpVar.an, p2.getName(), n2, n3);
        ofFloat2.addListener(new zml(zmpVar, p, p2, n2));
        ofFloat2.addUpdateListener(new zmh(zmpVar, 1));
        zmpVar.aj = new AnimatorSet();
        zmpVar.aj.playSequentially(ofFloat, ofFloat2);
        zmpVar.aj.start();
    }
}
