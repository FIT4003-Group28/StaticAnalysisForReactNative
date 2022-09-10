package defpackage;

import com.google.android.apps.gmm.location.mapinfo.NetworkLocationEvent;
/* compiled from: PG */
/* renamed from: ahpi  reason: default package */
/* loaded from: classes2.dex */
public final class ahpi<T> extends btrh<T> {
    public ahpi(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ahpc ahpcVar = (ahpc) this.a;
        NetworkLocationEvent networkLocationEvent = (NetworkLocationEvent) obj;
        if (networkLocationEvent.getAccuracy() > 25.0f) {
            int i = ahpe.q;
            return;
        }
        int i2 = ahpe.q;
        networkLocationEvent.getLatitude();
        networkLocationEvent.getLongitude();
        networkLocationEvent.getAccuracy();
        ahpe ahpeVar = ahpcVar.a;
        amvs amvsVar = new amvs();
        amvsVar.A(networkLocationEvent.getRelativeTime());
        amvsVar.v(networkLocationEvent.getLatitude(), networkLocationEvent.getLongitude());
        amvsVar.n(networkLocationEvent.getAccuracy());
        ahpeVar.j = amvsVar.d();
    }
}
