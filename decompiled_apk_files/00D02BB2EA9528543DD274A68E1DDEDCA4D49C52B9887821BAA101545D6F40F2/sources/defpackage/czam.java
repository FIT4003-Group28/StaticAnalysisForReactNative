package defpackage;

import android.content.Context;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: czam  reason: default package */
/* loaded from: classes5.dex */
public final class czam implements czar {
    public final Context a;
    public final ExecutorService b;
    public final cyhd c;
    public final dehn<cych> d;
    public final ClientVersion e;
    public final cyph f;
    public final ClientConfigInternal g;
    private final cyuj h;

    public czam(Context context, ClientVersion clientVersion, dehn<cych> dehnVar, Locale locale, cyhd cyhdVar, ExecutorService executorService, cyph cyphVar, ClientConfigInternal clientConfigInternal) {
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

    public static final long c(@dzsi cyka cykaVar) {
        cylg cylgVar;
        if (cykaVar == null || (cylgVar = cykaVar.b) == null) {
            return 0L;
        }
        return cylgVar.b;
    }

    public static final long d(@dzsi cyka cykaVar) {
        cylg cylgVar;
        if (cykaVar == null || (cylgVar = cykaVar.b) == null) {
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

    public final czav b(cyka cykaVar) {
        dccx F = dcdc.F();
        for (Map.Entry entry : Collections.unmodifiableMap(cykaVar.a).entrySet()) {
            czap czapVar = new czap();
            String str = (String) entry.getKey();
            if (str != null) {
                czapVar.a = str;
                cylo cyloVar = ((cyjy) entry.getValue()).a;
                if (cyloVar == null) {
                    cyloVar = cylo.k;
                }
                cywi b = cymy.b(cyloVar, this.g, 8, this.h);
                if (b != null) {
                    czapVar.b = b;
                    czapVar.c = 0;
                    String str2 = czapVar.a == null ? " personId" : "";
                    if (czapVar.b == null) {
                        str2 = str2.concat(" person");
                    }
                    if (czapVar.c == null) {
                        str2 = String.valueOf(str2).concat(" status");
                    }
                    if (!str2.isEmpty()) {
                        String valueOf = String.valueOf(str2);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                    }
                    F.g(new czaq(czapVar.a, czapVar.b, czapVar.c.intValue()));
                } else {
                    throw new NullPointerException("Null person");
                }
            } else {
                throw new NullPointerException("Null personId");
            }
        }
        czas c = czav.c();
        c.b(F.f());
        c.c(cyes.SUCCESS);
        return c.a();
    }
}
