package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: fxf  reason: default package */
/* loaded from: classes6.dex */
final class fxf<T> implements dzsj<T> {
    final /* synthetic */ fxg a;

    public fxf(fxg fxgVar) {
        this.a = fxgVar;
    }

    @Override // defpackage.dzsj
    public final T a() {
        fxg fxgVar = this.a;
        dzsj<Application> m = fxgVar.a.m();
        fyu fyuVar = fxgVar.a;
        dzsj dzsjVar = fyuVar.ex;
        if (dzsjVar == null) {
            dzsjVar = new fxy(fyuVar, 757);
            fyuVar.ex = dzsjVar;
        }
        dzsj c = dxjh.c(dzsjVar);
        dzsj c2 = dxjh.c(fxgVar.a.ax());
        fyu fyuVar2 = fxgVar.a;
        dzsj dzsjVar2 = fyuVar2.ey;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fxy(fyuVar2, 758);
            fyuVar2.ey = dzsjVar2;
        }
        return (T) new bzvy(m, c, c2, dzsjVar2);
    }
}
