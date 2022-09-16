package defpackage;

import android.os.Bundle;
import java.util.Map;
/* compiled from: PG */
/* renamed from: riu  reason: default package */
/* loaded from: classes4.dex */
public final class riu extends riv {
    public final Map a;
    public final Map b;
    public long c;

    public riu(rlx rlxVar) {
        super(rlxVar);
        this.b = new afw();
        this.a = new afw();
    }

    public final void a(String str, long j) {
        if (str == null || str.length() == 0) {
            aG().c.a("Ad unit id must be a non-empty string");
        } else {
            aH().g(new ris(this, str, j, 1));
        }
    }

    public final void b(String str, long j) {
        if (str == null || str.length() == 0) {
            aG().c.a("Ad unit id must be a non-empty string");
        } else {
            aH().g(new ris(this, str, j));
        }
    }

    public final void c(long j, rnm rnmVar) {
        if (rnmVar == null) {
            aG().k.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            aG().k.b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            rps.E(rnmVar, bundle, true);
            j().u("am", "_xa", bundle);
        }
    }

    public final void d(String str, long j, rnm rnmVar) {
        if (rnmVar == null) {
            aG().k.a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            aG().k.b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            rps.E(rnmVar, bundle, true);
            j().u("am", "_xu", bundle);
        }
    }

    public final void e(long j) {
        rnm f = k().f();
        for (String str : this.a.keySet()) {
            d(str, j - ((Long) this.a.get(str)).longValue(), f);
        }
        if (!this.a.isEmpty()) {
            c(j - this.c, f);
        }
        f(j);
    }

    public final void f(long j) {
        for (String str : this.a.keySet()) {
            this.a.put(str, Long.valueOf(j));
        }
        if (!this.a.isEmpty()) {
            this.c = j;
        }
    }
}
