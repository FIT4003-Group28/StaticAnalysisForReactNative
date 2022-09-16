package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zmf  reason: default package */
/* loaded from: classes4.dex */
public abstract class zmf implements zlz {
    public final zmb a;
    public final View b;
    public final acti c;
    public final asjj d;

    public zmf(zmb zmbVar, View view, acti actiVar, asjj asjjVar) {
        zmbVar.getClass();
        this.a = zmbVar;
        zmbVar.j(this);
        view.getClass();
        this.b = view;
        view.setOnClickListener(new zme(this));
        actiVar.getClass();
        this.c = actiVar;
        this.d = asjjVar;
    }

    private final void k() {
        this.b.setEnabled(false);
    }

    @Override // defpackage.zlz
    public final void a() {
        k();
    }

    @Override // defpackage.zlz
    public final void b() {
        if (this.a.F()) {
            this.b.setEnabled(true);
            g(this.a.E(), false, false);
            return;
        }
        k();
    }

    @Override // defpackage.zlz
    public final void d() {
    }

    public abstract void g(boolean z, boolean z2, boolean z3);

    public final void h() {
        this.a.o(this);
    }

    public final void i(boolean z) {
        View view = this.b;
        view.getClass();
        if (!zdg.e(view.getContext())) {
            return;
        }
        zdg.c(this.b.getContext(), this.b, this.b.getContext().getString(true != z ? R.string.accessibility_flashlight_turned_off : R.string.accessibility_flashlight_turned_on));
    }

    public final void j(int i, int i2) {
        View view = this.b;
        if (!(view instanceof ImageView)) {
            return;
        }
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable(view.getResources().getDrawable(i));
        Drawable drawable = imageView.getDrawable();
        if (!(drawable instanceof Animatable2)) {
            return;
        }
        Animatable2 animatable2 = (Animatable2) drawable;
        animatable2.registerAnimationCallback(new zmd(this, imageView, i2));
        animatable2.start();
    }

    @Override // defpackage.zlz
    public final void mi() {
    }

    @Override // defpackage.zlz
    public final void mm() {
    }

    @Override // defpackage.zlz
    public final void mn() {
    }
}
