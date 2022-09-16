package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: cjzo  reason: default package */
/* loaded from: classes4.dex */
public class cjzo {
    private static final dbty<cqiw<cjyw>> d;
    public final dcou<dtig, dtle, cjzm<?>> a = dcbv.j();
    private final Map<dtic, dbty<cqiw<cjyw>>> c = dcjz.d();
    public cjyy b = new cjzn();

    static {
        dtij bZ = dtik.e.bZ();
        bZ.b(dtle.PROFILE_ACTIVITY_OPTIONAL_RATING);
        bZ.a(dtig.PROFILE_ACTIVITY_ITEM_DATA);
        dcdc.f(bZ.bK());
        d = new cjzl();
    }

    public final <T extends cqkp> void a(nxf nxfVar, dbty<cqiw<T>> dbtyVar, cjyu<T> cjyuVar) {
        b(nxfVar, dbtyVar, cjzk.a, cjyuVar);
    }

    public final <T extends cqkp> void b(nxf nxfVar, dbty<cqiw<T>> dbtyVar, cjzk cjzkVar, cjyu<T> cjyuVar) {
        if (nxfVar.aI) {
            if (this.a.e(nxfVar.aG, nxfVar.aH, new cjzm<>(dbtyVar, cjzkVar, cjyuVar)) == null) {
                return;
            }
            dtig dtigVar = nxfVar.aG;
            dtle dtleVar = nxfVar.aH;
        }
    }

    public final void c(dtic dticVar, dbty<cqiw<cjyw>> dbtyVar) {
        this.c.put(dticVar, dbtyVar);
    }

    @dzsi
    public final dbsi<dtig, dtlf> d(dtkx dtkxVar) {
        dtig dtigVar;
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        int i = dtkuVar.a;
        if ((i & 1) != 0) {
            dtigVar = dtig.GENERIC_ITEM_DATA;
        } else if ((i & 2) != 0) {
            dtigVar = dtig.TILED_ITEM_DATA;
        } else if ((i & 64) != 0) {
            dtigVar = dtig.PROFILE_SUMMARY_ITEM_DATA;
        } else if ((i & 128) != 0) {
            dtigVar = dtig.PROFILE_ACTIVITY_ITEM_DATA;
        } else if ((i & 4) != 0) {
            dtigVar = dtig.PLACE_ITEM_DATA;
        } else if ((i & 8) != 0) {
            dtigVar = dtig.DIRECTIONS_ITEM_DATA;
        } else if ((i & 32) != 0) {
            dtigVar = dtig.TRANSIT_TRIP_ITEM_DATA;
        } else if ((i & 16) != 0) {
            dtigVar = dtig.NEARBY_STATION_ITEM_DATA;
        } else if ((i & 1024) != 0) {
            dtigVar = dtig.TRANSIT_ALERT_ITEM_DATA;
        } else if ((i & 2048) != 0) {
            dtigVar = dtig.TRANSIT_SCHEMATIC_MAP_ITEM_DATA;
        } else if ((i & 4096) != 0) {
            dtigVar = dtig.PHOTOS_ITEM_DATA;
        } else if ((i & 8192) != 0) {
            dtigVar = dtig.USER_FACTUAL_EDIT_ITEM_DATA;
        } else if ((32768 & i) != 0) {
            dtigVar = dtig.OFFERING_EDIT_ITEM_DATA;
        } else {
            if ((i & 512) != 0) {
                dtlj dtljVar = dtkuVar.j;
                if (dtljVar == null) {
                    dtljVar = dtlj.b;
                }
                if (dtljVar.a.size() != 0) {
                    if ((dtljVar.a.get(0).a & 1) == 0) {
                        if ((dtljVar.a.get(0).a & 4) != 0) {
                            dtigVar = dtig.LIST_PLACE_ITEM_DATA;
                        }
                    } else {
                        dtigVar = dtig.LIST_GENERIC_ITEM_DATA;
                    }
                }
                dtigVar = null;
            }
            if ((dtkuVar.a & 16384) != 0) {
                dtigVar = dtig.KNOWLEDGE_ENTITY_EDIT_ITEM_DATA;
            }
            dtigVar = null;
        }
        if (dtigVar == null) {
            return null;
        }
        for (dtlf dtlfVar : dtkxVar.c) {
            dcou<dtig, dtle, cjzm<?>> dcouVar = this.a;
            dtle b = dtle.b(dtlfVar.b);
            if (b == null) {
                b = dtle.INVALID_STYLE;
            }
            if (dcouVar.a(dtigVar, b)) {
                return dbsi.a(dtigVar, dtlfVar);
            }
        }
        return null;
    }

    @dzsi
    public final dtlf e(dtkx dtkxVar) {
        dbsi<dtig, dtlf> d2 = d(dtkxVar);
        if (d2 == null) {
            return null;
        }
        return d2.b;
    }

    public final cqiw<cjyw> f(dtic dticVar) {
        dbty<cqiw<cjyw>> dbtyVar = this.c.get(dticVar);
        if (dbtyVar == null) {
            dbtyVar = d;
        }
        return dbtyVar.a();
    }
}
