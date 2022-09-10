package defpackage;

import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: alem  reason: default package */
/* loaded from: classes2.dex */
public final class alem implements alde {
    public final Map<dpen, akuh> a;
    public final akuh b;
    public final Map<dpen, akuh> c;
    public final akuh d;
    public final Map<dpen, akuh> e;
    public final akuh f;
    public final akvz g;

    public alem(akvz akvzVar) {
        EnumMap enumMap = new EnumMap(dpen.class);
        this.a = enumMap;
        EnumMap enumMap2 = new EnumMap(dpen.class);
        this.c = enumMap2;
        EnumMap enumMap3 = new EnumMap(dpen.class);
        this.e = enumMap3;
        akuh a = akvzVar.a(dmqc.LEGEND_STYLE_PRIMARY_ROUTE);
        enumMap.put((EnumMap) dpen.UNKNOWN_STYLE, (dpen) a);
        enumMap.put((EnumMap) dpen.TRAFFIC_JAM, (dpen) akvzVar.a(dmqc.LEGEND_STYLE_PRIMARY_ROUTE_STOP_AND_GO));
        enumMap.put((EnumMap) dpen.SLOWER_TRAFFIC, (dpen) akvzVar.a(dmqc.LEGEND_STYLE_PRIMARY_ROUTE_SLOW));
        this.b = a;
        akuh a2 = akvzVar.a(dmqc.LEGEND_STYLE_PRIMARY_ROUTE_INACTIVE);
        enumMap2.put((EnumMap) dpen.UNKNOWN_STYLE, (dpen) a2);
        enumMap2.put((EnumMap) dpen.TRAFFIC_JAM, (dpen) akvzVar.a(dmqc.LEGEND_STYLE_PRIMARY_ROUTE_INACTIVE_STOP_AND_GO));
        enumMap2.put((EnumMap) dpen.SLOWER_TRAFFIC, (dpen) akvzVar.a(dmqc.LEGEND_STYLE_PRIMARY_ROUTE_INACTIVE_SLOW));
        this.d = a2;
        akuh a3 = akvzVar.a(dmqc.LEGEND_STYLE_SECONDARY_ROUTE);
        enumMap3.put((EnumMap) dpen.UNKNOWN_STYLE, (dpen) a3);
        enumMap3.put((EnumMap) dpen.TRAFFIC_JAM, (dpen) akvzVar.a(dmqc.LEGEND_STYLE_SECONDARY_ROUTE_STOP_AND_GO));
        enumMap3.put((EnumMap) dpen.SLOWER_TRAFFIC, (dpen) akvzVar.a(dmqc.LEGEND_STYLE_SECONDARY_ROUTE_SLOW));
        this.f = a3;
        dbsk.s(akvzVar);
        this.g = akvzVar;
    }

    @Override // defpackage.alde
    public final aleh a(aldc aldcVar) {
        return new alel(this, aldcVar.a);
    }
}
