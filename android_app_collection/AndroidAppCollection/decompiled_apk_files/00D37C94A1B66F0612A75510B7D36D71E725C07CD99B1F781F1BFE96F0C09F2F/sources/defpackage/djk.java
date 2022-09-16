package defpackage;

import android.view.ViewTreeObserver;
import com.facebook.yoga.YogaDirection;
/* compiled from: PG */
/* renamed from: djk  reason: default package */
/* loaded from: classes3.dex */
final class djk implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ djl a;
    final /* synthetic */ YogaDirection b;
    final /* synthetic */ dmm c;

    public djk(djl djlVar, dmm dmmVar, YogaDirection yogaDirection, byte[] bArr) {
        this.a = djlVar;
        this.c = dmmVar;
        this.b = yogaDirection;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        int i = this.c.a;
        if (i == -1) {
            if (this.b == YogaDirection.RTL) {
                this.a.fullScroll(66);
            }
            this.c.a = this.a.getScrollX();
            return true;
        }
        this.a.setScrollX(i);
        return true;
    }
}
