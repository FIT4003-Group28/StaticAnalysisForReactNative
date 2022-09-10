package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abug  reason: default package */
/* loaded from: classes2.dex */
public class abug implements ablx {
    private static final dcdn<drcq, Integer> b = dcdn.m(drcq.WANT_TO_GO, Integer.valueOf((int) R.string.DEFAULT_LIST_WANT_TO_GO), drcq.FAVORITES, Integer.valueOf((int) R.string.DEFAULT_LIST_FAVORITES), drcq.STARRED, Integer.valueOf((int) R.string.DEFAULT_LIST_STARRED));
    private final Activity c;
    private final dvyw d;
    private final abms e;
    private final drcq f;

    public abug(Activity activity, abuo abuoVar, dvyw dvywVar, ddho ddhoVar, ddet ddetVar, acwt acwtVar) {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        this.c = activity;
        this.d = dvywVar;
        this.e = abuoVar.a(dvywVar, acwtVar, ddhoVar, ddetVar);
        if ((dvywVar.b & 2048) != 0) {
            dnwf dnwfVar = dvywVar.Y;
            dnwfVar = dnwfVar == null ? dnwf.r : dnwfVar;
            if (!dnwfVar.c.isEmpty()) {
                dodg dodgVar = dnwfVar.c.get(0);
                if ((dodgVar.a & 1) != 0) {
                    dnzn dnznVar = dodgVar.b;
                    dbsgVar2 = dbsg.i(dnznVar == null ? dnzn.d : dnznVar);
                } else {
                    dbsgVar2 = dbpy.a;
                }
            } else {
                dbsgVar2 = dnwfVar.d.isEmpty() ? dbpy.a : dbsg.i(dnwfVar.d.get(0));
            }
            if (!dbsgVar2.a()) {
                dbsgVar = dbpy.a;
            } else {
                if ((((dnzn) dbsgVar2.b()).a & 2) != 0) {
                    drco drcoVar = ((dnzn) dbsgVar2.b()).b;
                    drcoVar = drcoVar == null ? drco.d : drcoVar;
                    if ((drcoVar.a & 1) != 0) {
                        drcq b2 = drcq.b(drcoVar.b);
                        dbsgVar = dbsg.i(b2 == null ? drcq.UNKNOWN_PLACE_LIST_TYPE : b2);
                    }
                }
                dbsgVar = dbpy.a;
            }
        } else {
            dbsgVar = dbpy.a;
        }
        this.f = (drcq) dbsgVar.c(drcq.UNKNOWN_PLACE_LIST_TYPE);
    }

    @Override // defpackage.ablx
    public String a() {
        dnwf dnwfVar = this.d.Y;
        if (dnwfVar == null) {
            dnwfVar = dnwf.r;
        }
        dnzn dnznVar = dnwfVar.c.get(0).b;
        if (dnznVar == null) {
            dnznVar = dnzn.d;
        }
        String str = dnznVar.c;
        dcdn<drcq, Integer> dcdnVar = b;
        if (dcdnVar.containsKey(this.f)) {
            str = this.c.getString(dcdnVar.get(this.f).intValue());
        }
        return this.c.getString(R.string.SAVED_IN_LIST, new Object[]{dbsj.e(str)});
    }

    @Override // defpackage.ablx
    public jic b() {
        int i;
        cqss c;
        ckqc ckqcVar = ckqc.FULLY_QUALIFIED;
        drcq drcqVar = this.f;
        drcq drcqVar2 = drcq.UNKNOWN_PLACE_LIST_TYPE;
        int ordinal = drcqVar.ordinal();
        if (ordinal == 1) {
            i = 2131231630;
        } else if (ordinal == 2) {
            i = 2131231623;
        } else if (ordinal == 3) {
            i = 2131232750;
        } else if (ordinal != 4) {
            String valueOf = String.valueOf(drcqVar.name());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid list type: ".concat(valueOf) : new String("Invalid list type: "));
        } else {
            i = 2131231730;
        }
        drcq drcqVar3 = this.f;
        int ordinal2 = drcqVar3.ordinal();
        if (ordinal2 == 1) {
            c = cqrt.c(R.color.place_list_favorites);
        } else if (ordinal2 == 2) {
            c = cqrt.c(R.color.place_list_want_to_go);
        } else if (ordinal2 == 3) {
            c = cqrt.c(R.color.place_list_custom);
        } else if (ordinal2 == 4) {
            c = cqrt.c(R.color.place_list_starred);
        } else {
            String valueOf2 = String.valueOf(drcqVar3.name());
            throw new IllegalArgumentException(valueOf2.length() != 0 ? "Invalid list type: ".concat(valueOf2) : new String("Invalid list type: "));
        }
        return new jic((String) null, ckqcVar, cqrt.g(i, c), 0);
    }

    @Override // defpackage.ablx
    public boolean c() {
        return !drcq.UNKNOWN_PLACE_LIST_TYPE.equals(this.f);
    }

    @Override // defpackage.abms
    public jic d(int i) {
        return this.e.d(0);
    }

    @Override // defpackage.abms
    public String e() {
        return this.e.e();
    }

    @Override // defpackage.abms
    public Integer f() {
        return this.e.f();
    }

    @Override // defpackage.abms
    @dzsi
    public String g() {
        return this.e.g();
    }

    @Override // defpackage.abms
    @dzsi
    public String h() {
        return this.e.h();
    }

    @Override // defpackage.abms
    @dzsi
    public Float i() {
        return this.e.i();
    }

    @Override // defpackage.abms
    @dzsi
    public String j() {
        return this.e.j();
    }

    @Override // defpackage.abms
    public String k() {
        return this.e.k();
    }

    @Override // defpackage.abms
    public String l() {
        return this.e.l();
    }

    @Override // defpackage.abms
    public cqkl m(cjqm cjqmVar) {
        return this.e.m(cjqmVar);
    }

    @Override // defpackage.abms
    public cjtd n() {
        return this.e.n();
    }
}
