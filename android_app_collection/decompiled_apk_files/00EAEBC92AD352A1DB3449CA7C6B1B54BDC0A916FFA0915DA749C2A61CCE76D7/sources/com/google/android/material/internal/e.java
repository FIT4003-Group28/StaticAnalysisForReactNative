package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f8134a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private b f8135b = null;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f8136c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f8137d = new a();

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e eVar = e.this;
            if (eVar.f8136c == animator) {
                eVar.f8136c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final int[] f8139a;

        /* renamed from: b  reason: collision with root package name */
        final ValueAnimator f8140b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f8139a = iArr;
            this.f8140b = valueAnimator;
        }
    }

    private void a(b bVar) {
        this.f8136c = bVar.f8140b;
        this.f8136c.start();
    }

    private void b() {
        ValueAnimator valueAnimator = this.f8136c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8136c = null;
        }
    }

    public void a() {
        ValueAnimator valueAnimator = this.f8136c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f8136c = null;
        }
    }

    public void a(int[] iArr) {
        b bVar;
        int size = this.f8134a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f8134a.get(i);
            if (StateSet.stateSetMatches(bVar.f8139a, iArr)) {
                break;
            }
            i++;
        }
        b bVar2 = this.f8135b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f8135b = bVar;
        if (bVar == null) {
            return;
        }
        a(bVar);
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f8137d);
        this.f8134a.add(bVar);
    }
}
