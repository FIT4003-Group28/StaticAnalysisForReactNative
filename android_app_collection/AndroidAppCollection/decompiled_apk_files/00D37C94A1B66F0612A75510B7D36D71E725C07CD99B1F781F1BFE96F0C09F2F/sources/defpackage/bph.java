package defpackage;

import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: bph  reason: default package */
/* loaded from: classes2.dex */
public final class bph implements Runnable {
    final /* synthetic */ ViewPager a;

    public bph(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.q(0);
        this.a.h();
    }
}
