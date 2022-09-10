package defpackage;

import com.google.android.libraries.social.populous.core.AffinityContext;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import java.util.Map;
import java.util.UUID;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: czey  reason: default package */
/* loaded from: classes5.dex */
public final class czey extends czdw {
    public UUID a;
    private AffinityContext b;
    private dcdc<cyxj> c;
    private dcdc<cywi> d;
    private dcet<String, InAppNotificationTarget> e;
    private Long f;
    private Long g;
    private Long h;
    private cyes i;
    private Boolean j;
    private dcdn<cygg, cywi> k;
    private dcdn<String, cywi> l;
    private Boolean m;
    private int n;

    @Override // defpackage.czdw
    public final void b(AffinityContext affinityContext) {
        if (affinityContext != null) {
            this.b = affinityContext;
            return;
        }
        throw new NullPointerException("Null affinityContext");
    }

    @Override // defpackage.czdw
    public final void c(long j) {
        this.h = Long.valueOf(j);
    }

    @Override // defpackage.czdw
    public final void d(long j) {
        this.g = Long.valueOf(j);
    }

    @Override // defpackage.czdw
    public final void e() {
        this.j = false;
    }

    @Override // defpackage.czdw
    public final void f(cyes cyesVar) {
        if (cyesVar != null) {
            this.i = cyesVar;
            return;
        }
        throw new NullPointerException("Null dataSourceResponseStatus");
    }

    @Override // defpackage.czdw
    public final void g(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    @Override // defpackage.czdw
    public final void h(dcet<String, InAppNotificationTarget> dcetVar) {
        if (dcetVar != null) {
            this.e = dcetVar;
            return;
        }
        throw new NullPointerException("Null fieldInAppNotificationTargetMap");
    }

    @Override // defpackage.czdw
    public final void i(Map<String, cywi> map) {
        this.l = dcdn.r(map);
    }

    @Override // defpackage.czdw
    public final void j(dcdc<cywi> dcdcVar) {
        if (dcdcVar != null) {
            this.d = dcdcVar;
            return;
        }
        throw new NullPointerException("Null items");
    }

    @Override // defpackage.czdw
    public final void k(long j) {
        this.f = Long.valueOf(j);
    }

    @Override // defpackage.czdw
    public final void l(dcdn<cygg, cywi> dcdnVar) {
        if (dcdnVar != null) {
            this.k = dcdnVar;
            return;
        }
        throw new NullPointerException("Null personMap");
    }

    @Override // defpackage.czdw
    public final void m(dcdc<cyxj> dcdcVar) {
        if (dcdcVar != null) {
            this.c = dcdcVar;
            return;
        }
        throw new NullPointerException("Null scoringParams");
    }

    @Override // defpackage.czdw
    public final void n(int i) {
        this.n = i;
    }

    @Override // defpackage.czdw
    public final czdx a() {
        String str = this.b == null ? " affinityContext" : "";
        if (this.c == null) {
            str = str.concat(" scoringParams");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" items");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" fieldInAppNotificationTargetMap");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" lastUpdated");
        }
        if (this.n == 0) {
            str = String.valueOf(str).concat(" requestType");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" cacheRefreshWindowMsec");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" cacheInvalidateTimeMsec");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" dataSourceResponseStatus");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" containsPartialResults");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" personMap");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" groupMap");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" emptyResponse");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new czez(this.b, this.c, this.d, this.e, this.f.longValue(), this.n, this.g.longValue(), this.h.longValue(), this.i, this.j.booleanValue(), this.k, this.l, this.m.booleanValue(), this.a);
    }
}
