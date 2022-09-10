package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import com.google.android.apps.maps.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dacn  reason: default package */
/* loaded from: classes5.dex */
public final class dacn extends dabz<AnimatorSet> {
    public static final /* synthetic */ int g = 0;
    private static final Property<dacn, Float> l = new dacj(Float.class);
    private static final Property<dacn, Float> p = new dack(Float.class);
    private static final Property<dacn, Float> q = new dacl(Float.class);
    private static final Property<dacn, Float> r = new dacm(Float.class);
    public float a;
    public float b;
    public float c;
    public float d;
    boolean e;
    azu f;
    private final Context h;
    private final dabi i;
    private AnimatorSet j;
    private int k;

    public dacn(Context context, daco dacoVar) {
        super(2);
        this.e = false;
        this.f = null;
        this.h = context;
        this.i = dacoVar.a;
    }

    private final void n() {
        this.k = 0;
        Arrays.fill(this.o, czxb.c(this.i.c[0], this.m.i));
    }

    @Override // defpackage.dabz
    public final void b() {
        if (this.j == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, l, 0.0f, 1.0f);
            ofFloat.setDuration(750L);
            ofFloat.setInterpolator(AnimationUtils.loadInterpolator(this.h, R.animator.linear_indeterminate_line1_head_interpolator));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, p, 0.0f, 1.0f);
            ofFloat2.setStartDelay(333L);
            ofFloat2.setDuration(850L);
            ofFloat2.setInterpolator(AnimationUtils.loadInterpolator(this.h, R.animator.linear_indeterminate_line1_tail_interpolator));
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, q, 0.0f, 1.0f);
            ofFloat3.setStartDelay(1000L);
            ofFloat3.setDuration(567L);
            ofFloat3.setInterpolator(AnimationUtils.loadInterpolator(this.h, R.animator.linear_indeterminate_line2_head_interpolator));
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, r, 0.0f, 1.0f);
            ofFloat4.setStartDelay(1267L);
            ofFloat4.setDuration(533L);
            ofFloat4.setInterpolator(AnimationUtils.loadInterpolator(this.h, R.animator.linear_indeterminate_line2_tail_interpolator));
            AnimatorSet animatorSet = new AnimatorSet();
            this.j = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            this.j.addListener(new daci(this));
        }
        this.j.start();
    }

    @Override // defpackage.dabz
    public final void c() {
        AnimatorSet animatorSet = this.j;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // defpackage.dabz
    public final void d() {
        if (this.e) {
            return;
        }
        if (!this.m.isVisible()) {
            c();
        } else {
            this.e = true;
        }
    }

    @Override // defpackage.dabz
    public final void e() {
        i();
        n();
    }

    @Override // defpackage.dabz
    public final void f() {
        n();
    }

    @Override // defpackage.dabz
    public final void g(azu azuVar) {
        this.f = azuVar;
    }

    @Override // defpackage.dabz
    public final void h() {
        this.f = null;
    }

    public final void i() {
        j(0.0f);
        k(0.0f);
        l(0.0f);
        m(0.0f);
        int i = this.k;
        int[] iArr = this.i.c;
        int length = (i + 1) % iArr.length;
        this.k = length;
        Arrays.fill(this.o, czxb.c(iArr[length], this.m.i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(float f) {
        this.a = f;
        this.n[3] = f;
        this.m.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(float f) {
        this.b = f;
        this.n[2] = f;
        this.m.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(float f) {
        this.c = f;
        this.n[1] = f;
        this.m.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(float f) {
        this.d = f;
        this.n[0] = f;
        this.m.invalidateSelf();
    }
}
