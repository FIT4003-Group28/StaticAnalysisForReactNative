package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bon  reason: default package */
/* loaded from: classes2.dex */
public final class bon extends AnimatorListenerAdapter {
    final /* synthetic */ boq a;

    public bon(boq boqVar) {
        this.a = boqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList = new ArrayList(this.a.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bol) arrayList.get(i)).a();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ArrayList arrayList = new ArrayList(this.a.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bol bolVar = (bol) arrayList.get(i);
        }
    }
}
