package defpackage;

import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: bav  reason: default package */
/* loaded from: classes3.dex */
public final class bav implements Runnable {
    final /* synthetic */ ViewPager a;

    public bav(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(0);
        this.a.l();
    }
}
