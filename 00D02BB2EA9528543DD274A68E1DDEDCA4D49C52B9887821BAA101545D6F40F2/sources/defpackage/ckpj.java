package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ckpj  reason: default package */
/* loaded from: classes.dex */
public final class ckpj {
    public static final /* synthetic */ int b = 0;
    private static final Map<ddhp, ckph> c;
    final ckox a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(dtxj.z, ckph.ADD_A_PLACE);
        hashMap.put(dtxn.cl, ckph.DIRECTIONS);
        hashMap.put(dtxn.dQ, ckph.TRANSIT_TRIP);
        hashMap.put(dtyc.bS, ckph.AGENCY_INFO);
        hashMap.put(dtxy.ft, ckph.AROUND_ME);
        hashMap.put(dtxw.R, ckph.NAVIGATION_ARRIVAL);
        hashMap.put(dtxp.aE, ckph.FREE_NAV);
        hashMap.put(dtxy.ej, ckph.PLACE_LIST);
        hashMap.put(dtxo.u, ckph.EDIT_PHOTO);
        hashMap.put(dtyb.dN, ckph.START_SCREEN);
        hashMap.put(dtyc.bv, ckph.TRAFFIC_INCIDENT);
        hashMap.put(dtyd.bT, ckph.CONTRIBUTIONS);
        hashMap.put(dtxr.as, ckph.HOME_SCREEN);
        hashMap.put(dtxl.bw, ckph.COMMUTE_DRIVING_IMMERSIVE);
        hashMap.put(dtyc.cn, ckph.TRANSIT_COMMUTE_BOARD);
        hashMap.put(dtyc.fk, ckph.TRANSIT_STATION_PAGE);
        hashMap.put(dtyc.dp, ckph.TRANSIT_LINE_PAGE);
        hashMap.put(dtxs.y, ckph.INBOX_PAGE);
        c = Collections.unmodifiableMap(hashMap);
    }

    public ckpj(ckox ckoxVar) {
        this.a = ckoxVar;
    }

    @dzsi
    private final synchronized ckoy d(@dzsi ddhp ddhpVar, dbrn<ckpi, ckpa> dbrnVar) {
        Map<ddhp, ckph> map = c;
        if (map.get(ddhpVar) == null) {
            return null;
        }
        ckph ckphVar = map.get(ddhpVar);
        return this.a.b(dbrnVar.a(ckphVar.x), ckphVar.w, ckow.SELF_MANAGED, true, true, false, true);
    }

    @dzsi
    public final synchronized ckoy a(@dzsi ddhp ddhpVar) {
        return d(ddhpVar, new ckpg());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final synchronized ckoy b(@dzsi ddhp ddhpVar) {
        return d(ddhpVar, ckpe.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final synchronized ckoy c(@dzsi ddhp ddhpVar) {
        return d(ddhpVar, ckpf.a);
    }
}
