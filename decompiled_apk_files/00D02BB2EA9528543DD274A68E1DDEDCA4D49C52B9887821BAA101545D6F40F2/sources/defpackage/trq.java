package defpackage;

import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
/* compiled from: PG */
/* renamed from: trq  reason: default package */
/* loaded from: classes7.dex */
final class trq extends trp {
    private volatile transient dbsg<tlv> c;
    private volatile transient boolean d;
    private volatile transient boolean e;
    private volatile transient dbsg<uco> f;

    public trq(btlu btluVar, dbsg<tmd> dbsgVar, dbsg<FetchState> dbsgVar2, boolean z) {
        super(btluVar, dbsgVar, dbsgVar2, z);
    }

    @Override // defpackage.trv
    public final dbsg<tlv> e() {
        dbsg<tlv> dbsgVar;
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    if (this.a.a() && !g().a()) {
                        dbsgVar = dbsg.i(this.a.b().g().get(0));
                    } else {
                        dbsgVar = dbpy.a;
                    }
                    this.c = dbsgVar;
                    if (this.c == null) {
                        throw new NullPointerException("groupToRender() cannot return null");
                    }
                }
            }
        }
        return this.c;
    }

    @Override // defpackage.trv
    public final boolean f() {
        if (!this.e) {
            synchronized (this) {
                if (!this.e) {
                    boolean z = false;
                    if (this.b.a() && this.b.b().a().a().equals(tgk.IN_PROGRESS)) {
                        z = true;
                    }
                    this.d = z;
                    this.e = true;
                }
            }
        }
        return this.d;
    }

    @Override // defpackage.trv
    public final dbsg<uco> g() {
        dbsg<uco> dbsgVar;
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    dbsg dbsgVar2 = dbpy.a;
                    if (this.b.a()) {
                        dbsgVar2 = dbsg.i(this.b.b().a());
                    }
                    if (dbsgVar2.a() && ((FetchState.Fetch) dbsgVar2.b()).b().a()) {
                        dbsgVar = dbsg.i(uco.NO_CONNECTION);
                    } else {
                        if (this.a.a()) {
                            dovb s = this.a.b().c().e().s();
                            if (s == dovb.WAYPOINT_FAILURE) {
                                dbsgVar = dbsg.i(uco.NO_WAYPOINT_FOUND);
                            } else if (s == dovb.NO_ROUTES_FOUND) {
                                dbsgVar = dbsg.i(uco.NO_ROUTES_FOUND);
                            }
                        }
                        dbsgVar = dbpy.a;
                    }
                    this.f = dbsgVar;
                    if (this.f == null) {
                        throw new NullPointerException("errorState() cannot return null");
                    }
                }
            }
        }
        return this.f;
    }
}
