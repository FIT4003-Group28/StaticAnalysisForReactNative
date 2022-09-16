package defpackage;
/* compiled from: PG */
/* renamed from: aufm  reason: default package */
/* loaded from: classes.dex */
public final class aufm {
    public final dcet<Integer, Integer> a;
    public final dcet<Integer, Integer> b;

    public aufm(btvo btvoVar) {
        int a = dwoh.a(btvoVar.getTripAssistanceNotificationsParameters().a);
        int i = (a == 0 ? 2 : a) - 1;
        dceq a2 = dcet.a();
        if (i == 2) {
            a2.c(Integer.valueOf(dpyv.AREA_TRAFFIC.dm), Integer.valueOf(dpyv.TRAFFIC_TO_PLACE.dm), Integer.valueOf(dpyv.TRANSIT_TO_PLACE.dm));
        }
        dceq a3 = dcet.a();
        if (i == 2) {
            a3.c(Integer.valueOf(dpyv.TRAFFIC_TO_PLACE.dm), Integer.valueOf(dpyv.AREA_TRAFFIC.dm));
            a3.c(Integer.valueOf(dpyv.TRANSIT_TO_PLACE.dm), Integer.valueOf(dpyv.AREA_TRAFFIC.dm));
        }
        this.a = a2.a();
        this.b = a3.a();
    }
}
