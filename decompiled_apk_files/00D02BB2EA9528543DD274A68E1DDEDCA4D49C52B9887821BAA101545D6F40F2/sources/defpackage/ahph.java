package defpackage;

import com.google.android.apps.gmm.location.mapinfo.GpsStatusEvent;
/* compiled from: PG */
/* renamed from: ahph  reason: default package */
/* loaded from: classes2.dex */
public final class ahph<T> extends btrh<T> {
    public ahph(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ahpb ahpbVar = (ahpb) this.a;
        GpsStatusEvent gpsStatusEvent = (GpsStatusEvent) obj;
        int i = ahpe.q;
        gpsStatusEvent.getTopSnr();
        float topSnr = gpsStatusEvent.getTopSnr();
        Long valueOf = Long.valueOf(ahpbVar.a.a.e());
        ahpe ahpeVar = ahpbVar.a;
        if (topSnr <= ahpeVar.n) {
            ahpeVar.p.add(dbsi.a(ardn.INDOOR, valueOf));
        } else {
            ahpeVar.p.add(dbsi.a(ardn.OUTDOOR, valueOf));
        }
        ahpbVar.a.o = topSnr;
    }
}
