package defpackage;
/* compiled from: PG */
/* renamed from: tkf  reason: default package */
/* loaded from: classes7.dex */
final class tkf extends tke {
    private volatile transient int e;
    private volatile transient boolean f;
    private volatile transient dbsg<djiq> g;
    private volatile transient amve h;
    private volatile transient boolean i;
    private volatile transient boolean j;

    public tkf(btlu btluVar, tlv tlvVar, int i, tkn tknVar) {
        super(btluVar, tlvVar, i, tknVar);
    }

    @Override // defpackage.tkj
    public final int e() {
        if (!this.f) {
            synchronized (this) {
                if (!this.f) {
                    this.e = this.b.x(this.c).b().intValue();
                    this.f = true;
                }
            }
        }
        return this.e;
    }

    @Override // defpackage.tkj
    public final dbsg<djiq> f() {
        dbsg<djiq> dbsgVar;
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    if ((this.b.t().a().a & 64) != 0) {
                        djiq djiqVar = this.b.t().a().e;
                        if (djiqVar == null) {
                            djiqVar = djiq.d;
                        }
                        dbsgVar = dbsg.i(djiqVar);
                    } else {
                        dbsgVar = dbpy.a;
                    }
                    this.g = dbsgVar;
                    if (this.g == null) {
                        throw new NullPointerException("promotedPinAdsResponse() cannot return null");
                    }
                }
            }
        }
        return this.g;
    }

    @Override // defpackage.tkj
    public final amve g() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    amve amveVar = this.b.g().get(Integer.valueOf(this.c));
                    dbsk.s(amveVar);
                    this.h = amveVar;
                    if (this.h == null) {
                        throw new NullPointerException("selectedTrip() cannot return null");
                    }
                }
            }
        }
        return this.h;
    }

    @Override // defpackage.tkj
    public final boolean h() {
        if (!this.j) {
            synchronized (this) {
                if (!this.j) {
                    this.i = this.b.s();
                    this.j = true;
                }
            }
        }
        return this.i;
    }
}
