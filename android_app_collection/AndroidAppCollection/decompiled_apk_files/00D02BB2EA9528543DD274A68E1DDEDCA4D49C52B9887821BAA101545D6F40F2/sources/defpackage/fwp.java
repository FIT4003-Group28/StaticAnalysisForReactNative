package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: fwp  reason: default package */
/* loaded from: classes6.dex */
final class fwp<T> implements dzsj<T> {
    final /* synthetic */ fwq a;

    public fwp(fwq fwqVar) {
        this.a = fwqVar;
    }

    @Override // defpackage.dzsj
    public final T a() {
        fwq fwqVar = this.a;
        Application a = fwqVar.a.a.a();
        dxjg.e(a);
        btvo rp = fwqVar.a.a.rp();
        dxjg.e(rp);
        return (T) new cdha(a, rp);
    }
}
