package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfaw  reason: default package */
/* loaded from: classes6.dex */
public final class dfaw extends dyeu {
    private final dewu a;
    private final dewj b;
    private final Object c = new Object();
    private final ConcurrentHashMap<dfav, dyeu> d = new ConcurrentHashMap<>();

    public dfaw(dewu dewuVar, dewj dewjVar) {
        this.a = dewuVar;
        this.b = dewjVar;
    }

    private static final URI c(String str) {
        try {
            URI uri = new URI(null, str, null, null, null);
            return uri.getPort() != -1 ? uri : new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), 443, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw new IllegalStateException("Malformed endpoint authority", e);
        }
    }

    @Override // defpackage.dyeu
    public final <RequestT, ResponseT> dyex<RequestT, ResponseT> a(dyib<RequestT, ResponseT> dyibVar, dyet dyetVar) {
        dewj dewjVar = this.b;
        String str = (String) dyetVar.e(dewv.a);
        if (str == null) {
            str = b();
        }
        URI c = c(str);
        dbsk.m(!TextUtils.isEmpty(c.getAuthority()), "Could not parse channel authority");
        dezx dezxVar = new dezx(c, this.b.n().a().longValue(), (Integer) dyetVar.e(dewq.a), (Integer) dyetVar.e(dewq.b));
        dyeu dyeuVar = this.d.get(dezxVar);
        if (dyeuVar == null) {
            synchronized (this.c) {
                if (!this.d.containsKey(dezxVar)) {
                    dbty<Boolean> b = dbud.b(false);
                    dewg dewgVar = new dewg();
                    dewgVar.a(b);
                    Context a = dewjVar.a();
                    if (a != null) {
                        dewgVar.a = a;
                        dewgVar.b = dezxVar.a;
                        dewgVar.i = dezxVar.c;
                        dewgVar.j = dezxVar.d;
                        dewgVar.k = Long.valueOf(dezxVar.b);
                        Executor f = dewjVar.f();
                        if (f != null) {
                            dewgVar.c = f;
                            Executor d = dewjVar.d();
                            if (d != null) {
                                dewgVar.d = d;
                                dewgVar.e = dewjVar.g();
                                dewgVar.f = dewjVar.j();
                                dewgVar.a(dewjVar.k());
                                dewgVar.h = dewjVar.p();
                                String str2 = " applicationContext";
                                if (dewgVar.a != null) {
                                    str2 = "";
                                }
                                if (dewgVar.b == null) {
                                    str2 = str2.concat(" uri");
                                }
                                if (dewgVar.c == null) {
                                    str2 = String.valueOf(str2).concat(" networkExecutor");
                                }
                                if (dewgVar.d == null) {
                                    str2 = String.valueOf(str2).concat(" transportExecutor");
                                }
                                if (dewgVar.g == null) {
                                    str2 = String.valueOf(str2).concat(" recordNetworkMetricsToPrimes");
                                }
                                if (dewgVar.k == null) {
                                    str2 = String.valueOf(str2).concat(" grpcIdleTimeoutMillis");
                                }
                                if (!str2.isEmpty()) {
                                    String valueOf = String.valueOf(str2);
                                    throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                                }
                                this.d.put(dezxVar, new dfal(dewjVar.c(), new dewh(dewgVar.a, dewgVar.b, dewgVar.c, dewgVar.d, dewgVar.e, dewgVar.f, dewgVar.g, dewgVar.h, dewgVar.i, dewgVar.j, dewgVar.k.longValue()), dewjVar.e()));
                            } else {
                                throw new NullPointerException("Null transportExecutor");
                            }
                        } else {
                            throw new NullPointerException("Null networkExecutor");
                        }
                    } else {
                        throw new NullPointerException("Null applicationContext");
                    }
                }
                dyeuVar = this.d.get(dezxVar);
            }
        }
        return dyeuVar.a(dyibVar, dyetVar);
    }

    @Override // defpackage.dyeu
    public final String b() {
        return this.a.a().a;
    }
}
