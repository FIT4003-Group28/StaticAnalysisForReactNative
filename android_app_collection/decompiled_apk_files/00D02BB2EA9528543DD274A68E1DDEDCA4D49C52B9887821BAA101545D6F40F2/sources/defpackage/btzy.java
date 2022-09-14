package defpackage;

import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: btzy  reason: default package */
/* loaded from: classes4.dex */
public final class btzy {
    public static final btzy a = new btzy(bttq.HTTP_UNKNOWN_STATUS_CODE);
    public static final btzy b = new btzy(bttq.REQUEST_TIMEOUT);
    public static final btzy c = new btzy(bttq.IO_ERROR);
    public static final btzy d = new btzy(bttq.CANCELED);
    public static final btzy e = new btzy(bttq.PROTOCOL_ERROR_INVALID_CONTENT_TYPE);
    public static final btzy f = new btzy(bttq.PROTOCOL_ERROR_VERSION_MISMATCH);
    public static final btzy g = new btzy(bttq.MALFORMED_MESSAGE);
    public static final btzy h = new btzy(bttq.HTTP_BAD_REQUEST);
    public static final btzy i = new btzy(bttq.INVALID_API_TOKEN);
    public static final btzy j = new btzy(bttq.HTTP_SERVER_ERROR);
    public static final btzy k = new btzy(bttq.NO_CONNECTIVITY);
    public static final btzy l = new btzy(bttq.UNSUPPORTED_REQUEST_TYPE);
    public static final btzy m = new btzy(bttq.HTTP_NOT_FOUND);
    public static final btzy n = new btzy(bttq.INVALID_GAIA_AUTH_TOKEN);
    public static final btzy o = new btzy(bttq.CANNOT_CREATE_REQUEST);
    private static final dcdn<Integer, ckjk> u;
    public final bttq p;
    @dzsi
    public final String q;
    @dzsi
    public final Throwable r;
    @dzsi
    public final Integer s;
    public final Map<String, dspd> t;

    static {
        dcdg p = dcdn.p();
        p.f(3, ckjk.INVALID_ARGUMENT);
        p.f(9, ckjk.FAILED_PRECONDITION);
        p.f(11, ckjk.OUT_OF_RANGE);
        p.f(13, ckjk.INTERNAL);
        p.f(14, ckjk.UNAVAILABLE);
        p.f(4, ckjk.DEADLINE_EXCEEDED);
        p.f(7, ckjk.PERMISSION_DENIED);
        p.f(16, ckjk.UNAUTHENTICATED);
        u = p.b();
    }

    private btzy(bttq bttqVar) {
        this(bttqVar, null, null, null, dcmn.a);
    }

    public static btzy a(Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (!(th2 instanceof TimeoutException)) {
                if (!(th2 instanceof btzz)) {
                    if (!(th2 instanceof CancellationException)) {
                        if (th2 instanceof SecurityException) {
                            return b.b(th);
                        }
                    } else {
                        return d.b(th);
                    }
                } else {
                    return ((btzz) th2).a;
                }
            } else {
                return b.b(th);
            }
        }
        return a.b(th);
    }

    public static btzy e(int i2) {
        if (i2 != 400) {
            if (i2 == 401) {
                return n;
            }
            if (i2 == 403) {
                return i;
            }
            if (i2 == 404) {
                return m;
            }
            if (i2 != 500) {
                if (i2 == 501) {
                    return f;
                }
                if (i2 != 503) {
                    return a;
                }
            }
            return j;
        }
        return h;
    }

    public static btzy f(@dzsi bttq bttqVar) {
        int ordinal = bttqVar.ordinal();
        if (ordinal != 13) {
            if (ordinal == 15) {
                return d;
            }
            switch (ordinal) {
                case 0:
                    return e;
                case 1:
                    return f;
                case 2:
                    return h;
                case 3:
                    return m;
                case 4:
                    return j;
                case 5:
                    return f;
                case 6:
                    return c;
                case 7:
                    return k;
                case 8:
                    return i;
                case 9:
                    return n;
                case 10:
                    return g;
                default:
                    return a;
            }
        }
        return b;
    }

    public final btzy b(Throwable th) {
        return dbsd.a(this.r, th) ? this : new btzy(this.p, this.q, th, this.s, this.t);
    }

    public final btzy c(String str) {
        return dbsd.a(this.q, str) ? this : new btzy(this.p, str, this.r, this.s, this.t);
    }

    public final ckjk d() {
        dcdn<Integer, ckjk> dcdnVar = u;
        if (dcdnVar.containsKey(this.s)) {
            return dcdnVar.get(this.s);
        }
        bttq bttqVar = bttq.PROTOCOL_ERROR_INVALID_CONTENT_TYPE;
        switch (this.p.ordinal()) {
            case 0:
                return ckjk.PROTOCOL_ERROR_INVALID_CONTENT_TYPE;
            case 1:
                return ckjk.PROTOCOL_ERROR_VERSION_MISMATCH;
            case 2:
                return ckjk.HTTP_BAD_REQUEST;
            case 3:
                return ckjk.HTTP_NOT_FOUND;
            case 4:
                return ckjk.HTTP_SERVER_ERROR;
            case 5:
            case 11:
            case 12:
            case 14:
            default:
                return ckjk.HTTP_UNKNOWN_STATUS_CODE;
            case 6:
                return ckjk.IO_ERROR;
            case 7:
                return ckjk.NO_CONNECTIVITY;
            case 8:
                return ckjk.INVALID_API_TOKEN;
            case 9:
                return ckjk.INVALID_GAIA_AUTH_TOKEN;
            case 10:
                return ckjk.MALFORMED_MESSAGE;
            case 13:
                return ckjk.REQUEST_TIMEOUT;
            case 15:
                return ckjk.CANCELED;
            case 16:
                return ckjk.UNSUPPORTED_REQUEST_TYPE;
            case 17:
                return ckjk.CANNOT_CREATE_REQUEST;
        }
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj != null && (obj instanceof btzy)) {
            return ((btzy) obj).p.equals(this.p);
        }
        return false;
    }

    public final int hashCode() {
        return this.p.hashCode();
    }

    public final String toString() {
        dbsb b2 = dbsc.b(this);
        b2.b("errorCode", this.p);
        b2.b("description", this.q);
        Throwable th = this.r;
        b2.b("cause", th == null ? "" : dbue.g(th));
        b2.b("errorDetails", dbrz.f(',').l().a(this.t));
        return b2.toString();
    }

    public btzy(bttq bttqVar, @dzsi String str, @dzsi Throwable th, @dzsi Integer num, Map<String, dspd> map) {
        dbsk.s(bttqVar);
        this.p = bttqVar;
        this.q = str;
        this.r = th;
        this.s = num;
        this.t = map;
    }
}
