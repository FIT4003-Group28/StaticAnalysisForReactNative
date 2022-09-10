package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iwa  reason: default package */
/* loaded from: classes.dex */
public final class iwa implements Runnable, cqfc {
    final /* synthetic */ iwb a;

    public iwa(iwb iwbVar) {
        this.a = iwbVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        ViewGroup viewGroup = (ViewGroup) view;
        if (!this.a.d || viewGroup.getChildCount() <= 1) {
            return;
        }
        this.a.c.end();
        this.a.c = new AnimatorSet();
        this.a.c.setStartDelay(500L);
        AnimatorSet animatorSet = this.a.c;
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount() - 1;
        arrayList.add(iwb.f(viewGroup.getChildAt(childCount)));
        for (int i = 0; i < childCount; i++) {
            arrayList.add(iwb.e(viewGroup.getChildAt(i)));
            ObjectAnimator f = iwb.f(viewGroup.getChildAt(i));
            f.setStartDelay(1000L);
            arrayList.add(f);
        }
        arrayList.add(iwb.e(viewGroup.getChildAt(childCount)));
        animatorSet.playSequentially(arrayList);
        iwb iwbVar = this.a;
        iwbVar.a.k(this, iwbVar.b, bvkw.ON_STARTUP_FULLY_COMPLETE);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.c.isStarted()) {
            this.a.c.start();
        }
    }
}
