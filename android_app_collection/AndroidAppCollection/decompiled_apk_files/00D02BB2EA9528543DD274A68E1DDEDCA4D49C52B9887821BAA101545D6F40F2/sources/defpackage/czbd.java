package defpackage;

import android.content.Context;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: czbd  reason: default package */
/* loaded from: classes5.dex */
public final class czbd implements czbj {
    public final Context a;
    public final ExecutorService b;
    public final cyhd c;
    public final dehn<cych> d;
    public final ClientVersion e;
    public final cyph f;
    public final ClientConfigInternal g;
    private final cyuj h;

    public czbd(Context context, ClientVersion clientVersion, dehn<cych> dehnVar, Locale locale, cyhd cyhdVar, ExecutorService executorService, cyph cyphVar, ClientConfigInternal clientConfigInternal) {
        this.a = context;
        dbsk.s(dehnVar);
        this.d = dehnVar;
        this.b = executorService;
        this.h = new cyuj(locale);
        this.c = cyhdVar;
        this.e = clientVersion;
        dbsk.s(cyphVar);
        this.f = cyphVar;
        this.g = clientConfigInternal;
    }

    public static final long c(@dzsi cykt cyktVar) {
        cylg cylgVar;
        if (cyktVar == null || (cylgVar = cyktVar.c) == null) {
            return 0L;
        }
        return cylgVar.b;
    }

    public static final long d(@dzsi cykt cyktVar) {
        cylg cylgVar;
        if (cyktVar == null || (cylgVar = cyktVar.c) == null) {
            return 0L;
        }
        return cylgVar.c;
    }

    public final cyes a(@dzsi Object obj) {
        if (!cyui.a(this.a)) {
            return cyes.FAILED_NETWORK;
        }
        if (obj == null) {
            return cyes.FAILED_PEOPLE_API_RESPONSE_EMPTY;
        }
        return cyes.SUCCESS;
    }

    public final czbn b(cykt cyktVar) {
        dccx F = dcdc.F();
        for (cykr cykrVar : cyktVar.a) {
            czbg czbgVar = new czbg();
            String str = cykrVar.a;
            if (str != null) {
                czbgVar.a = str;
                dcdc<String> r = dcdc.r(cykrVar.b);
                if (r != null) {
                    czbgVar.b = r;
                    String str2 = czbgVar.a == null ? " lookupId" : "";
                    if (czbgVar.b == null) {
                        str2 = str2.concat(" personIds");
                    }
                    if (!str2.isEmpty()) {
                        String valueOf = String.valueOf(str2);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                    }
                    F.g(new czbh(czbgVar.a, czbgVar.b));
                } else {
                    throw new NullPointerException("Null personIds");
                }
            } else {
                throw new NullPointerException("Null lookupId");
            }
        }
        dcdg p = dcdn.p();
        for (Map.Entry entry : Collections.unmodifiableMap(cyktVar.b).entrySet()) {
            p.f((String) entry.getKey(), cymy.b((cylo) entry.getValue(), this.g, 8, this.h));
        }
        czbk d = czbn.d();
        d.b(F.f());
        d.c(p.b());
        d.d(cyes.SUCCESS);
        return d.a();
    }
}
