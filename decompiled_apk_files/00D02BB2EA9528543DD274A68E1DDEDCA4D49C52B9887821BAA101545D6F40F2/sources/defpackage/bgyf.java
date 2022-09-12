package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.google.android.gms.location.FusedLocationProviderApi;
/* compiled from: PG */
/* renamed from: bgyf  reason: default package */
/* loaded from: classes3.dex */
public final class bgyf implements cqfc {
    static final Interpolator a = pq.a(0.5f, 0.0f, 0.0f, 1.0f);
    public static final /* synthetic */ int d = 0;
    public final bgye b;
    public final benx c;
    private final cqjg e;
    private final cqjg f;

    public bgyf(bgye bgyeVar, cqjg cqjgVar, cqjg cqjgVar2, benx benxVar) {
        this.b = bgyeVar;
        this.e = cqjgVar;
        this.f = cqjgVar2;
        this.c = benxVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        View a2 = cqhu.a(view, this.e);
        View a3 = cqhu.a(view, this.f);
        if (a2 == null || a3 == null) {
            return;
        }
        float f = 0.0f;
        RotateAnimation rotateAnimation = new RotateAnimation(this.b == bgye.EXPAND ? -180.0f : 180.0f, 0.0f, a2.getWidth() / 2.0f, a2.getHeight() / 2.0f);
        long j = 233;
        rotateAnimation.setDuration(this.b == bgye.EXPAND ? 267L : 233L);
        Interpolator interpolator = a;
        rotateAnimation.setInterpolator(interpolator);
        rotateAnimation.setAnimationListener(new bgyc(this));
        a2.startAnimation(rotateAnimation);
        if (a3.getMeasuredHeight() == 0) {
            a3.measure(-1, -2);
        }
        bgyd bgydVar = new bgyd(this, a3.getMeasuredHeight(), a3);
        bgydVar.setDuration(this.b == bgye.EXPAND ? 267L : 233L);
        bgydVar.setInterpolator(interpolator);
        a3.startAnimation(bgydVar);
        float f2 = this.b == bgye.EXPAND ? 1.0f : 0.0f;
        if (this.b != bgye.EXPAND) {
            f = 1.0f;
        }
        a3.setAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a3, "alpha", f2);
        if (this.b == bgye.EXPAND) {
            j = 267;
        }
        ofFloat.setDuration(j).setInterpolator(new LinearInterpolator());
        ofFloat.start();
        if (this.b != bgye.EXPAND) {
            return;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, FusedLocationProviderApi.EXTRA_KEY_ELEVATION_WGS84_M, 0.0f, 1.0f);
        ofFloat2.setDuration(267L).setInterpolator(interpolator);
        ofFloat2.start();
    }
}
