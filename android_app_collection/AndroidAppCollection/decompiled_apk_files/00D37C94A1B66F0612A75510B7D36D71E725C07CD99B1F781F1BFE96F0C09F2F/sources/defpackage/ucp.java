package defpackage;
/* compiled from: PG */
/* renamed from: ucp  reason: default package */
/* loaded from: classes4.dex */
public final class ucp {
    public final Long a;
    public final String b;
    public final String c;
    public final Long d;
    public final Long e;
    public final ubx f;
    public final Long g;
    public final int h;
    public final Long i;

    public ucp() {
    }

    public ucp(Long l, String str, String str2, Long l2, Long l3, ubx ubxVar, Long l4, int i, Long l5) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        this.f = ubxVar;
        this.g = l4;
        this.h = i;
        this.i = l5;
    }

    public static ucl a() {
        ucl uclVar = new ucl();
        uclVar.c = 0L;
        uclVar.d = 0L;
        uclVar.d(ubx.UNKNOWN_STATUS);
        uclVar.e = 0L;
        uclVar.c(0);
        uclVar.f = 0L;
        return uclVar;
    }

    public final ucl b() {
        return new ucl(this);
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ucp) {
            ucp ucpVar = (ucp) obj;
            Long l = this.a;
            if (l != null ? l.equals(ucpVar.a) : ucpVar.a == null) {
                if (this.b.equals(ucpVar.b) && ((str = this.c) != null ? str.equals(ucpVar.c) : ucpVar.c == null) && this.d.equals(ucpVar.d) && this.e.equals(ucpVar.e) && this.f.equals(ucpVar.f) && this.g.equals(ucpVar.g) && this.h == ucpVar.h && this.i.equals(ucpVar.i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l = this.a;
        int i = 0;
        int hashCode = ((((l == null ? 0 : l.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((((((((hashCode ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("name", this.b);
        return c.toString();
    }
}
