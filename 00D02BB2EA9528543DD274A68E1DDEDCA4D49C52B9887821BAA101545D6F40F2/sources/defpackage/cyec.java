package defpackage;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientId;
import com.google.android.libraries.social.populous.core.Experiments;
import com.google.android.libraries.social.populous.core.SessionContextRuleSet;
import com.google.android.libraries.social.populous.core.SocialAffinityAllEventSource;
/* compiled from: PG */
/* renamed from: cyec  reason: default package */
/* loaded from: classes5.dex */
public final class cyec {
    public int A;
    public int B;
    private Boolean C;
    private ClientId D;
    private Integer E;
    private dhdj F;
    private dbsg<dued> G;
    private duey H;
    private dcep<cydt> I;
    private Boolean J;
    private Long K;
    private cygp L;
    private Boolean M;
    private cyeh N;
    private Boolean O;
    private Experiments P;
    public dued a;
    public Boolean b;
    public Boolean c;
    public Long d;
    public Boolean e;
    public dcep<dhdf> f;
    public Boolean g;
    public SocialAffinityAllEventSource h;
    public cyfk i;
    public cyfk j;
    public dcep<cyfk> k;
    public Boolean l;
    public Boolean m;
    public cyei n;
    public Boolean o;
    public cygp p;
    public Boolean q;
    public Boolean r;
    public SessionContextRuleSet s;
    public dcep<dhfr> t;
    public Boolean u;
    public boolean v;
    public dcep<dhew> w;
    public boolean x;
    public boolean y;
    public boolean z;

    public cyec() {
        this.G = dbpy.a;
        this.v = false;
        this.x = false;
        this.z = false;
    }

    public cyec(ClientConfigInternal clientConfigInternal) {
        this.G = dbpy.a;
        this.v = false;
        this.x = false;
        this.z = false;
        this.C = Boolean.valueOf(clientConfigInternal.d);
        this.D = clientConfigInternal.e;
        this.E = Integer.valueOf(clientConfigInternal.f);
        this.F = clientConfigInternal.g;
        this.a = clientConfigInternal.h;
        this.G = clientConfigInternal.i;
        this.H = clientConfigInternal.j;
        this.b = Boolean.valueOf(clientConfigInternal.k);
        this.I = clientConfigInternal.l;
        this.J = Boolean.valueOf(clientConfigInternal.m);
        this.c = Boolean.valueOf(clientConfigInternal.n);
        this.d = Long.valueOf(clientConfigInternal.o);
        this.K = Long.valueOf(clientConfigInternal.p);
        this.e = Boolean.valueOf(clientConfigInternal.q);
        this.f = clientConfigInternal.r;
        this.g = Boolean.valueOf(clientConfigInternal.s);
        this.A = clientConfigInternal.S;
        this.h = clientConfigInternal.t;
        this.i = clientConfigInternal.u;
        this.j = clientConfigInternal.v;
        this.k = clientConfigInternal.w;
        this.l = Boolean.valueOf(clientConfigInternal.x);
        this.m = Boolean.valueOf(clientConfigInternal.y);
        this.n = clientConfigInternal.z;
        this.o = Boolean.valueOf(clientConfigInternal.A);
        this.L = clientConfigInternal.B;
        this.p = clientConfigInternal.C;
        this.M = Boolean.valueOf(clientConfigInternal.D);
        this.N = clientConfigInternal.E;
        this.q = Boolean.valueOf(clientConfigInternal.F);
        this.O = Boolean.valueOf(clientConfigInternal.G);
        this.r = Boolean.valueOf(clientConfigInternal.H);
        this.s = clientConfigInternal.I;
        this.P = clientConfigInternal.J;
        this.t = clientConfigInternal.K;
        this.u = Boolean.valueOf(clientConfigInternal.L);
        this.B = clientConfigInternal.T;
        this.v = clientConfigInternal.M;
        this.w = clientConfigInternal.N;
        this.x = clientConfigInternal.O;
        this.y = clientConfigInternal.P;
        this.z = clientConfigInternal.Q;
    }

    final dbsg<Experiments> a() {
        Experiments experiments = this.P;
        return experiments == null ? dbpy.a : dbsg.i(experiments);
    }

    public final void c(Experiments experiments) {
        cyfd cyfdVar;
        if (!a().a()) {
            cyfdVar = Experiments.c();
        } else {
            cyfd c = Experiments.c();
            c.b(a().b());
            cyfdVar = c;
        }
        cyfdVar.b(experiments);
        this.P = cyfdVar.a();
    }

    public final void d(dcep<cydt> dcepVar) {
        dbsk.s(dcepVar);
        this.I = dcepVar;
    }

    public final void e(long j) {
        this.K = Long.valueOf(j);
    }

    public final void f(ClientId clientId) {
        dbsk.s(clientId);
        this.D = clientId;
    }

    public final void g(cygp cygpVar) {
        dbsk.s(cygpVar);
        this.L = cygpVar;
    }

    public final void h(int i) {
        this.E = Integer.valueOf(i);
    }

    public final void i(cyeh cyehVar) {
        dbsk.s(cyehVar);
        this.N = cyehVar;
    }

    public final void j(duey dueyVar) {
        dbsk.s(dueyVar);
        this.H = dueyVar;
    }

    public final void k(dhdj dhdjVar) {
        dbsk.s(dhdjVar);
        this.F = dhdjVar;
    }

    public final void l(boolean z) {
        this.O = Boolean.valueOf(z);
    }

    public final void m(boolean z) {
        this.J = Boolean.valueOf(z);
    }

    public final void n(boolean z) {
        this.C = Boolean.valueOf(z);
    }

    public final void o(boolean z) {
        this.M = Boolean.valueOf(z);
    }

    public final ClientConfigInternal b() {
        String str = this.C == null ? " shouldFormatPhoneNumbers" : "";
        if (this.D == null) {
            str = str.concat(" clientId");
        }
        if (this.E == null) {
            str = String.valueOf(str).concat(" maxAutocompletions");
        }
        if (this.F == null) {
            str = String.valueOf(str).concat(" peopleApiAutocompleteClientId");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" affinityType");
        }
        if (this.H == null) {
            str = String.valueOf(str).concat(" peopleApiAppType");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" shouldFilterIantsByAppType");
        }
        if (this.I == null) {
            str = String.valueOf(str).concat(" autocompletionCategories");
        }
        if (this.J == null) {
            str = String.valueOf(str).concat(" returnContactsWithProfileIdOnly");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" shouldCreateSeparateInAppNotificationTargetResults");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" cacheRefreshWindowMs");
        }
        if (this.K == null) {
            str = String.valueOf(str).concat(" cacheInvalidateTimeMs");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" needWarmUpStarlightCache");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" peopleRequestsExtensions");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" requestPeopleSMimeInfo");
        }
        if (this.A == 0) {
            str = String.valueOf(str).concat(" socialAffinityApplication");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" socialAffinityAllEventSource");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" clearcutLogSource");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" metricClearcutLogSource");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" additionalPhenotypeLogSources");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" returnServerContactsOnly");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" useLiveAutocomplete");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" minimumTopNCacheCallbackStatus");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" shouldMixServerAndDeviceContacts");
        }
        if (this.L == null) {
            str = String.valueOf(str).concat(" emptyQueryResultGroupingOption");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" nonEmptyQueryResultGroupingOption");
        }
        if (this.M == null) {
            str = String.valueOf(str).concat(" shouldLogActionAfterAutocompleteSessionClosedException");
        }
        if (this.N == null) {
            str = String.valueOf(str).concat(" metadataFieldOrderingConvention");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" shouldFilterOwnerFields");
        }
        if (this.O == null) {
            str = String.valueOf(str).concat(" requireExactMatch");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" livePeopleApiLoaderEnabled");
        }
        if (this.s == null) {
            str = String.valueOf(str).concat(" sessionContextRuleSet");
        }
        if (this.P == null) {
            str = String.valueOf(str).concat(" internalBuilderExperiments");
        }
        if (this.t == null) {
            str = String.valueOf(str).concat(" requestMaskIncludeContainers");
        }
        if (this.u == null) {
            str = String.valueOf(str).concat(" shouldEnablePrivateNames");
        }
        if (this.B == 0) {
            str = String.valueOf(str).concat(" cacheKey");
        }
        if (this.w == null) {
            str = String.valueOf(str).concat(" includedProfileStates");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new ClientConfigInternal(this.C.booleanValue(), this.D, this.E.intValue(), this.F, this.a, this.G, this.H, this.b.booleanValue(), this.I, this.J.booleanValue(), this.c.booleanValue(), this.d.longValue(), this.K.longValue(), this.e.booleanValue(), this.f, this.g.booleanValue(), this.A, this.h, this.i, this.j, this.k, this.l.booleanValue(), this.m.booleanValue(), this.n, this.o.booleanValue(), this.L, this.p, this.M.booleanValue(), this.N, this.q.booleanValue(), this.O.booleanValue(), this.r.booleanValue(), this.s, this.P, this.t, this.u.booleanValue(), this.B, this.v, this.w, this.x, this.y, this.z);
    }
}
