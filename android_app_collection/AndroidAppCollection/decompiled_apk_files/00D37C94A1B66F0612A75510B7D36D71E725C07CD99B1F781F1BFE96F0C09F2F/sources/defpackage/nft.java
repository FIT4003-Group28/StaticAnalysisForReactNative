package defpackage;

import android.animation.Animator;
import android.view.View;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;
/* compiled from: PG */
/* renamed from: nft  reason: default package */
/* loaded from: classes3.dex */
public final class nft implements Animator.AnimatorListener {
    public View a;
    public int b;
    final /* synthetic */ SwipeToContainerFrameLayout c;
    private boolean d;

    public nft(SwipeToContainerFrameLayout swipeToContainerFrameLayout) {
        this.c = swipeToContainerFrameLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.d = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        acti r;
        View view = this.a;
        if (view == null || this.d) {
            return;
        }
        view.setVisibility(8);
        SwipeToContainerFrameLayout swipeToContainerFrameLayout = this.c;
        int i = this.b;
        swipeToContainerFrameLayout.c = i;
        this.a = null;
        nfr nfrVar = swipeToContainerFrameLayout.f;
        if (nfrVar == null) {
            return;
        }
        if (i == 1) {
            int i2 = swipeToContainerFrameLayout.d;
            nfq nfqVar = (nfq) nfrVar;
            nfqVar.n = true;
            nfqVar.q(i2, 1.0f);
            if (nfqVar.o == null) {
                nfp nfpVar = nfqVar.j;
                hml hmlVar = nfpVar.e.q;
                if (hmlVar != null) {
                    hmlVar.av.a();
                } else {
                    nfpVar.b = true;
                }
            }
            nfqVar.i.c(new sev(0));
            nfqVar.h.o(2);
            return;
        }
        nfq nfqVar2 = (nfq) nfrVar;
        nfqVar2.n = false;
        nfqVar2.e.m(2);
        if (nfqVar2.q != null) {
            ex l = nfqVar2.c.l();
            l.m(nfqVar2.q);
            l.a();
            if (!nfqVar2.p && (r = nfqVar2.q.av.a.r()) != null) {
                r.H(3, new acte(acuo.b(53010)), null);
            }
        }
        nfqVar2.j.a();
        nfqVar2.b.i(0);
        nfqVar2.t.d(nfqVar2.r);
        nfqVar2.q = null;
        nfqVar2.i.c(new sev(1));
        nfqVar2.h.g();
        nfqVar2.p = false;
        nfqVar2.o = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d = false;
    }
}
