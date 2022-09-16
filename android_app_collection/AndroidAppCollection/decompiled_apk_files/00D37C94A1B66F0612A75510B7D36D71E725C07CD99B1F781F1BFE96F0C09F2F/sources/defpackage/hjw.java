package defpackage;

import android.view.animation.AnimationUtils;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;
/* compiled from: PG */
/* renamed from: hjw  reason: default package */
/* loaded from: classes3.dex */
public final class hjw implements Runnable {
    public float a;
    public long b;
    public long c;
    public final /* synthetic */ ShortsVideoTrimView2 d;
    public int e;

    public hjw(ShortsVideoTrimView2 shortsVideoTrimView2) {
        this.d = shortsVideoTrimView2;
        aqxo.p(true);
        aqxo.p(true);
        this.e = 1;
    }

    public final void a() {
        this.e = 1;
        this.d.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        vqp vqpVar;
        hkc hkcVar = hkc.BEGIN;
        int i = this.e;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                a();
                return;
            } else if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float f = (float) (currentAnimationTimeMillis - this.b);
                this.c = this.c + (this.d.t == null ? 0L : Math.signum((float) vqpVar.e(0.0f)) * 10000.0f * f);
                vqr vqrVar = this.d.u;
                if (vqrVar != null) {
                    vqrVar.r(hkc.BOTH.e);
                }
                this.d.d(this.c, true);
                vqr vqrVar2 = this.d.u;
                if (vqrVar2 != null) {
                    vqrVar2.s(hkc.BOTH.e);
                }
                if (this.d.D() || this.d.C()) {
                    this.e = 3;
                } else {
                    this.e = 1;
                }
                this.b = currentAnimationTimeMillis;
                this.d.postOnAnimation(this);
                return;
            } else {
                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float f2 = (float) (currentAnimationTimeMillis2 - this.b);
                float f3 = (-Math.signum(this.a)) * 80.0f * f2;
                this.c += (this.a * f2) + (f3 * f2 * 0.5f);
                vqr vqrVar3 = this.d.u;
                if (vqrVar3 != null) {
                    vqrVar3.r(hkc.BOTH.e);
                }
                long d = this.d.d(this.c, true);
                vqr vqrVar4 = this.d.u;
                if (vqrVar4 != null) {
                    vqrVar4.s(hkc.BOTH.e);
                }
                if (Math.abs(this.a) <= f2 * 80.0f || Math.abs(d) < Math.abs(this.c)) {
                    this.e = 1;
                    if (this.d.D() || this.d.C()) {
                        this.e = 3;
                    }
                } else {
                    this.e = 2;
                    this.a += f3;
                }
                this.b = currentAnimationTimeMillis2;
                this.d.postOnAnimation(this);
                return;
            }
        }
        throw null;
    }
}
