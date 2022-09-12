package defpackage;

import androidx.viewpager.widget.ViewPager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bcrv  reason: default package */
/* loaded from: classes3.dex */
public final class bcrv extends cqmt {
    final /* synthetic */ cqiw a;

    public bcrv(cqiw cqiwVar) {
        this.a = cqiwVar;
    }

    @Override // defpackage.cqmt
    protected final cqmr a(cqjz cqjzVar) {
        cqkj g = cqjzVar.g.g();
        ViewPager viewPager = (ViewPager) cqjzVar.i(ViewPager.class);
        if (viewPager == null) {
            bvoo.h("lazyViewPagerAdapter property not bound to a ViewPager", new Object[0]);
            return new cqmr();
        }
        return new bcru(this, viewPager, g);
    }
}
