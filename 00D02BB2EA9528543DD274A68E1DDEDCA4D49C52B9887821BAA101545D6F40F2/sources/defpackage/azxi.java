package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: azxi  reason: default package */
/* loaded from: classes3.dex */
public final class azxi extends azwm<azxi> {
    private static final dcdn<dprc, Integer> b = dcdn.m(dprc.FAVORITES_ENTITY_LIST, Integer.valueOf((int) R.string.DEFAULT_LIST_FAVORITES), dprc.STARRED_ENTITY_LIST, Integer.valueOf((int) R.string.DEFAULT_LIST_STARRED), dprc.WANT_TO_GO_ENTITY_LIST, Integer.valueOf((int) R.string.DEFAULT_LIST_WANT_TO_GO));
    public final dcdc<azxg> a;
    private final bvrt<dolo> c;

    public azxi(azxh azxhVar) {
        super(azxhVar);
        this.c = bvrt.b(azxhVar.a);
        this.a = azxhVar.b;
    }

    public static int g(dprc dprcVar) {
        dprc dprcVar2 = dprc.UNKNOWN_ENTITY_LIST_TYPE;
        int ordinal = dprcVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return baam.b(baab.FAVORITES);
            }
            if (ordinal == 3) {
                return baam.b(baab.WANT_TO_GO);
            }
            if (ordinal == 4) {
                return baam.b(baab.STARRED_PLACES);
            }
            return 0;
        }
        return baam.b(baab.CUSTOM);
    }

    @Override // defpackage.azwm
    public final String e(@dzsi Context context) {
        dprc c = k().c(dprc.UNKNOWN_ENTITY_LIST_TYPE);
        dcdn<dprc, Integer> dcdnVar = b;
        if (dcdnVar.containsKey(c)) {
            dbsk.s(context);
            Integer num = dcdnVar.get(c);
            dbsk.s(num);
            return context.getString(num.intValue());
        }
        dpot dpotVar = j().b;
        if (dpotVar == null) {
            dpotVar = dpot.m;
        }
        return dpotVar.f;
    }

    @Override // defpackage.azwm
    @dzsi
    public final azxm<azxi> h() {
        return azxm.j;
    }

    public final dolo j() {
        return this.c.e((dssr) dolo.d.cu(7), dolo.d);
    }

    public final dbsg<dprc> k() {
        dolo j = j();
        dpot dpotVar = j.b;
        if (dpotVar == null) {
            dpotVar = dpot.m;
        }
        dpov dpovVar = dpotVar.b;
        if (dpovVar == null) {
            dpovVar = dpov.f;
        }
        if ((dpovVar.a & 2) != 0) {
            dpot dpotVar2 = j.b;
            if (dpotVar2 == null) {
                dpotVar2 = dpot.m;
            }
            dpov dpovVar2 = dpotVar2.b;
            if (dpovVar2 == null) {
                dpovVar2 = dpov.f;
            }
            dprc b2 = dprc.b(dpovVar2.c);
            if (b2 == null) {
                b2 = dprc.UNKNOWN_ENTITY_LIST_TYPE;
            }
            return dbsg.i(b2);
        }
        return dbpy.a;
    }

    public final List<dppz> l() {
        dpot dpotVar = j().b;
        if (dpotVar == null) {
            dpotVar = dpot.m;
        }
        dpov dpovVar = dpotVar.b;
        if (dpovVar == null) {
            dpovVar = dpov.f;
        }
        return dpovVar.d;
    }

    public final dbsg<dpqj> m() {
        dolo j = j();
        dpot dpotVar = j.b;
        if (dpotVar == null) {
            dpotVar = dpot.m;
        }
        dpov dpovVar = dpotVar.b;
        if (dpovVar == null) {
            dpovVar = dpov.f;
        }
        if ((dpovVar.a & 4) != 0) {
            dpot dpotVar2 = j.b;
            if (dpotVar2 == null) {
                dpotVar2 = dpot.m;
            }
            dpov dpovVar2 = dpotVar2.b;
            if (dpovVar2 == null) {
                dpovVar2 = dpov.f;
            }
            dpqj b2 = dpqj.b(dpovVar2.e);
            if (b2 == null) {
                b2 = dpqj.UNKNOWN_ENTITY_LIST_NAMESPACE;
            }
            return dbsg.i(b2);
        }
        return dbpy.a;
    }

    public final dbsg<String> n() {
        dpot dpotVar = j().b;
        if (dpotVar == null) {
            dpotVar = dpot.m;
        }
        dpov dpovVar = dpotVar.b;
        if (dpovVar == null) {
            dpovVar = dpov.f;
        }
        if ((dpovVar.a & 1) == 0) {
            azwl azwlVar = this.j;
            dbsk.s(azwlVar);
            if (dbsj.d(azwlVar.b)) {
                return dbpy.a;
            }
            azwl azwlVar2 = this.j;
            dbsk.s(azwlVar2);
            String str = azwlVar2.b;
            dbsk.s(str);
            return dbsg.i(str);
        }
        dpot dpotVar2 = j().b;
        if (dpotVar2 == null) {
            dpotVar2 = dpot.m;
        }
        dpov dpovVar2 = dpotVar2.b;
        if (dpovVar2 == null) {
            dpovVar2 = dpov.f;
        }
        dbsk.b(!dpovVar2.b.isEmpty(), "List id should not be empty string.");
        dpot dpotVar3 = j().b;
        if (dpotVar3 == null) {
            dpotVar3 = dpot.m;
        }
        dpov dpovVar3 = dpotVar3.b;
        if (dpovVar3 == null) {
            dpovVar3 = dpov.f;
        }
        return dbsg.i(dpovVar3.b);
    }

    public final dpov o() {
        dpot dpotVar = j().b;
        if (dpotVar == null) {
            dpotVar = dpot.m;
        }
        dpov dpovVar = dpotVar.b;
        return dpovVar == null ? dpov.f : dpovVar;
    }

    public final dpri v() {
        dpot dpotVar = j().b;
        if (dpotVar == null) {
            dpotVar = dpot.m;
        }
        dpri dpriVar = dpotVar.d;
        return dpriVar == null ? dpri.f : dpriVar;
    }

    public final dpqw w() {
        dpot dpotVar = j().b;
        if (dpotVar == null) {
            dpotVar = dpot.m;
        }
        dpqw b2 = dpqw.b(dpotVar.c);
        return b2 == null ? dpqw.UNKNOWN_ENTITY_LIST_ROLE : b2;
    }

    @Override // defpackage.azwm
    /* renamed from: x */
    public final azxh i() {
        return new azxh(this);
    }
}
