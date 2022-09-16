package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: ejp  reason: default package */
/* loaded from: classes6.dex */
final class ejp<T> implements dzsj<T> {
    final /* synthetic */ ejq a;

    public ejp(ejq ejqVar) {
        this.a = ejqVar;
    }

    @Override // defpackage.dzsj
    public final T a() {
        ejq ejqVar = this.a;
        Application a = ejqVar.a.a.a();
        dxjg.e(a);
        ahth cd = ejqVar.a.cd();
        bvrb tn = ejqVar.a.a.tn();
        dxjg.e(tn);
        fyu fyuVar = ejqVar.a;
        dzsj dzsjVar = fyuVar.eb;
        if (dzsjVar == null) {
            dzsjVar = new fxy(fyuVar, 743);
            fyuVar.eb = dzsjVar;
        }
        return (T) new asbb(a, cd, tn, dzsjVar, ejqVar.a.dV(), ejqVar.b());
    }
}
