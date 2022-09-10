package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: fws  reason: default package */
/* loaded from: classes6.dex */
final class fws<T> implements dzsj<T> {
    final /* synthetic */ fwt a;

    public fws(fwt fwtVar) {
        this.a = fwtVar;
    }

    @Override // defpackage.dzsj
    public final T a() {
        fwt fwtVar = this.a;
        Application a = fwtVar.a.a.a();
        dxjg.e(a);
        btvo rp = fwtVar.a.a.rp();
        dxjg.e(rp);
        return (T) new cdha(a, rp);
    }
}
