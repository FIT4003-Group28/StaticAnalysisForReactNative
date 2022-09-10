package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: PG */
/* renamed from: bgym  reason: default package */
/* loaded from: classes3.dex */
public class bgym {
    public final Activity a;
    public final dxio<gce> b;
    float c;
    float d;

    public bgym(Activity activity, dxio<gce> dxioVar) {
        this.a = activity;
        this.b = dxioVar;
    }

    public final void a(LottieAnimationView lottieAnimationView, final cqss cqssVar) {
        lottieAnimationView.d(new bly("**"), bjv.B, new bpx(this, cqssVar) { // from class: bgyl
            private final bgym a;
            private final cqss b;

            {
                this.a = this;
                this.b = cqssVar;
            }

            @Override // defpackage.bpx
            public final Object a(bpu bpuVar) {
                return new PorterDuffColorFilter(this.b.b(this.a.a), PorterDuff.Mode.SRC_ATOP);
            }
        });
    }
}
