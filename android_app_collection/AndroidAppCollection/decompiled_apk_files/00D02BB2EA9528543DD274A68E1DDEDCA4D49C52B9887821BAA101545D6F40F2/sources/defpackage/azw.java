package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azw  reason: default package */
/* loaded from: classes.dex */
public final class azw extends AnimatorListenerAdapter {
    final /* synthetic */ azz a;

    public azw(azz azzVar) {
        this.a = azzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList = new ArrayList(this.a.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((azu) arrayList.get(i)).b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ArrayList arrayList = new ArrayList(this.a.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((azu) arrayList.get(i)).c();
        }
    }
}
