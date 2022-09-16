package defpackage;

import com.google.android.apps.gmm.transit.TransitStationService;
/* compiled from: PG */
/* renamed from: byvt  reason: default package */
/* loaded from: classes4.dex */
public final class byvt<T> extends btrh<T> {
    private final int d;

    public byvt(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            ((TransitStationService) this.a).n = ((byze) obj).a();
            return;
        }
        ((TransitStationService) this.a).m = ((crhp) obj).b();
    }
}
