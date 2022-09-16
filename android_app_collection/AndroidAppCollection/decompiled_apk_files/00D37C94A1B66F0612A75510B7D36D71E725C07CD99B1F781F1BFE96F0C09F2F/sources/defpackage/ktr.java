package defpackage;

import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import com.google.android.apps.youtube.app.red.presenter.NavigationDropdownView;
/* compiled from: PG */
/* renamed from: ktr  reason: default package */
/* loaded from: classes3.dex */
public final class ktr implements bnj {
    final /* synthetic */ long a;
    final /* synthetic */ NavigationDropdownView b;

    public ktr(NavigationDropdownView navigationDropdownView, long j) {
        this.b = navigationDropdownView;
        this.a = j;
    }

    @Override // defpackage.bnj
    public final void a(bnk bnkVar) {
        if (this.b.f.getRotation() == 360.0f) {
            this.b.f.setRotation(0.0f);
        }
    }

    @Override // defpackage.bnj
    public final void b() {
    }

    @Override // defpackage.bnj
    public final void c() {
    }

    @Override // defpackage.bnj
    public final void d() {
    }

    @Override // defpackage.bnj
    public final void e() {
        NavigationDropdownView navigationDropdownView = this.b;
        long j = this.a;
        if (navigationDropdownView.i == null) {
            navigationDropdownView.i = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(0.0f), Float.valueOf(1.0f));
            if (j > 0) {
                navigationDropdownView.i.setDuration(j);
            }
            if (navigationDropdownView.j == null) {
                navigationDropdownView.j = new ktu(navigationDropdownView);
            }
            navigationDropdownView.i.addUpdateListener(navigationDropdownView.j);
            navigationDropdownView.i.addListener(navigationDropdownView.j);
        }
        navigationDropdownView.i.start();
    }
}
