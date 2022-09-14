package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: baw  reason: default package */
/* loaded from: classes3.dex */
public final class baw implements nq {
    final /* synthetic */ ViewPager a;
    private final Rect b = new Rect();

    public baw(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // defpackage.nq
    public final ow a(View view, ow owVar) {
        op omVar;
        ow P = od.P(view, owVar);
        if (P.g()) {
            return P;
        }
        Rect rect = this.b;
        rect.left = P.c();
        rect.top = P.d();
        rect.right = P.e();
        rect.bottom = P.f();
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ow Q = od.Q(this.a.getChildAt(i), P);
            rect.left = Math.min(Q.c(), rect.left);
            rect.top = Math.min(Q.d(), rect.top);
            rect.right = Math.min(Q.e(), rect.right);
            rect.bottom = Math.min(Q.f(), rect.bottom);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            omVar = new oo(P);
        } else if (Build.VERSION.SDK_INT >= 29) {
            omVar = new on(P);
        } else {
            omVar = new om(P);
        }
        ol.b(kd.b(rect), omVar);
        return ol.a(omVar);
    }
}
