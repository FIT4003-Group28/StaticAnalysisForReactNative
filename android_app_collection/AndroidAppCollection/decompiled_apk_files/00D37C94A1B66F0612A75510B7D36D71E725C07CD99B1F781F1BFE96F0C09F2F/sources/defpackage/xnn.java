package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: xnn  reason: default package */
/* loaded from: classes4.dex */
final class xnn implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ akfl a;
    final /* synthetic */ View b;
    final /* synthetic */ xno c;

    public xnn(xno xnoVar, akfl akflVar, View view) {
        this.c = xnoVar;
        this.a = akflVar;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.a.f()) {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        int[] iArr = this.c.a;
        int i = iArr[0];
        int i2 = iArr[1];
        this.b.getLocationOnScreen(iArr);
        int[] iArr2 = this.c.a;
        if (i != iArr2[0] || i2 != iArr2[1]) {
            this.a.e();
        }
        return true;
    }
}
