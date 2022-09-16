package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: zyx  reason: default package */
/* loaded from: classes7.dex */
final class zyx implements egq {
    final /* synthetic */ zyy a;

    public zyx(zyy zyyVar) {
        this.a = zyyVar;
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        akyc i;
        View b = this.a.af.b();
        if (b != null) {
            Rect rect = new Rect();
            rect.left = (int) b.getX();
            rect.right = rect.left + b.getWidth();
            rect.top = (int) b.getY();
            rect.bottom = rect.top + b.getHeight();
            i = akyt.j(this.a.aj.i(), this.a.c.a().p().k, rect);
        } else {
            i = akyt.i(this.a.aj.i(), this.a.c.a().p().k);
        }
        this.a.b.p(i);
    }
}
