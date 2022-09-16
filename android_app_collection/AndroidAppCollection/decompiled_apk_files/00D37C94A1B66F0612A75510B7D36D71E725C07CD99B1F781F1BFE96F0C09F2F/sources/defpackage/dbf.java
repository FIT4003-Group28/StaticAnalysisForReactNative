package defpackage;

import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: dbf  reason: default package */
/* loaded from: classes3.dex */
public final class dbf implements Runnable {
    final /* synthetic */ ViewPager a;
    final /* synthetic */ dbg b;
    private final /* synthetic */ int c;

    public dbf(ViewPager viewPager, dbg dbgVar, int i) {
        this.c = i;
        this.a = viewPager;
        this.b = dbgVar;
    }

    public dbf(dbg dbgVar, ViewPager viewPager) {
        this.b = dbgVar;
        this.a = viewPager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.j(this.b);
        } else {
            this.a.e(this.b);
        }
    }
}
