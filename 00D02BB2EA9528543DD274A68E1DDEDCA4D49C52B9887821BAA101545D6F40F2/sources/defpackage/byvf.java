package defpackage;

import com.google.android.apps.gmm.transit.TransitStationService;
/* compiled from: PG */
/* renamed from: byvf  reason: default package */
/* loaded from: classes.dex */
public final class byvf<T> extends btrh<T> {
    public byvf(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        byve byveVar = (byve) this.a;
        boolean a = ((ahjx) obj).a.a();
        if (byveVar.a || !a) {
            return;
        }
        TransitStationService.p(byveVar.b);
    }
}
