package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agqu  reason: default package */
/* loaded from: classes.dex */
public final class agqu {
    private static final long f = TimeUnit.HOURS.toMillis(12);
    private static final long g = TimeUnit.DAYS.toMillis(30);
    public final String a;
    public final atse b;
    public final long c;
    public final long d;
    public final snc e;

    public agqu(String str, atse atseVar, long j, long j2, snc sncVar) {
        str.getClass();
        this.a = str;
        atseVar.getClass();
        this.b = atseVar;
        this.c = j;
        this.d = j2;
        this.e = sncVar;
    }

    public final long a() {
        return this.b.g;
    }

    public final long b() {
        return this.d + (this.b.g * 1000);
    }

    public final Object c() {
        atse atseVar = this.b;
        if (atseVar.c == 7) {
            atsd atsdVar = (atsd) atseVar.d;
            int i = atsdVar.b;
            if (i == 53345347) {
                return (aqmu) atsdVar.c;
            }
            if (i != 64099105) {
                return null;
            }
            if (atsdVar.b == 64099105) {
                return (aqft) atsdVar.c;
            }
            return aqft.a;
        }
        return null;
    }

    public final String d() {
        atse atseVar = this.b;
        if ((atseVar.b & 1) != 0) {
            return atseVar.e;
        }
        return null;
    }

    public final boolean e() {
        if (!g()) {
            return false;
        }
        return b() <= this.e.c() || this.e.c() < this.d - f;
    }

    public final boolean f() {
        return e() && b() + g <= this.e.c();
    }

    public final boolean g() {
        int ak;
        int ak2 = akel.ak(this.b.h);
        if (ak2 != 0 && ak2 == 3) {
            return false;
        }
        int ak3 = akel.ak(this.b.h);
        return ((ak3 != 0 && ak3 == 4) || (ak = akel.ak(this.b.h)) == 0 || ak == 1) ? false : true;
    }

    public final boolean h() {
        return g() && !e();
    }
}
