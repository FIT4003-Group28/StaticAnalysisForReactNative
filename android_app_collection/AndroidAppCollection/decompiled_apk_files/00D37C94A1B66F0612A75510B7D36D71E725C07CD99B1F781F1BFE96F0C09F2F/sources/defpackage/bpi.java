package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: bpi  reason: default package */
/* loaded from: classes2.dex */
public final class bpi implements kj {
    final /* synthetic */ ViewPager a;
    private final Rect b = new Rect();

    public bpi(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // defpackage.kj
    public final mb a(View view, mb mbVar) {
        mb t = lj.t(view, mbVar);
        if (t.x()) {
            return t;
        }
        Rect rect = this.b;
        rect.left = t.d();
        rect.top = t.f();
        rect.right = t.e();
        rect.bottom = t.c();
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            mb r = lj.r(this.a.getChildAt(i), t);
            rect.left = Math.min(r.d(), rect.left);
            rect.top = Math.min(r.f(), rect.top);
            rect.right = Math.min(r.e(), rect.right);
            rect.bottom = Math.min(r.c(), rect.bottom);
        }
        lr lrVar = new lr(t);
        lrVar.c(gz.c(rect));
        return lrVar.a();
    }
}
