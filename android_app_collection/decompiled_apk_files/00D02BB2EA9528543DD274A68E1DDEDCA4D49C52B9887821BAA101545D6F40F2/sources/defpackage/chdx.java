package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
/* renamed from: chdx  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class chdx implements cqjb {
    static final cqjb a = new chdx();

    private chdx() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        final chmi chmiVar = (chmi) cqkpVar;
        return new cqfc(chmiVar) { // from class: chdy
            private final chmi a;

            {
                this.a = chmiVar;
            }

            @Override // defpackage.cqfc
            public final void a(View view, boolean z) {
                final chmi chmiVar2 = this.a;
                if (chmiVar2.a().booleanValue()) {
                    return;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof ScrollView)) {
                    return;
                }
                ScrollView scrollView = (ScrollView) parent;
                scrollView.setScrollY(0);
                int max = Math.max(scrollView.getMeasuredHeight(), 1);
                int measuredHeight = view.getMeasuredHeight() - max;
                long min = Math.min(2000L, ((measuredHeight * 100) / max) + 500);
                ObjectAnimator.ofInt(scrollView, "scrollY", measuredHeight).setDuration(min).start();
                chmiVar2.getClass();
                view.postDelayed(new Runnable(chmiVar2) { // from class: chdz
                    private final chmi a;

                    {
                        this.a = chmiVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                }, min);
            }
        };
    }
}
