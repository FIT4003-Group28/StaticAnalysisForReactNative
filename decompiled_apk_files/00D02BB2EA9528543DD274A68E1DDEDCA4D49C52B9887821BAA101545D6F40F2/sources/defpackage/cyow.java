package defpackage;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import com.google.android.libraries.social.populous.core.Experiments;
import com.google.android.libraries.social.populous.core.SessionContext;
import com.google.android.libraries.social.populous.core.SocialAffinityAllEventSource;
/* compiled from: PG */
/* renamed from: cyow  reason: default package */
/* loaded from: classes5.dex */
public abstract class cyow {
    public static cyow p(String str, ClientConfigInternal clientConfigInternal, ClientVersion clientVersion, SessionContext sessionContext) {
        cyok cyokVar = new cyok();
        String str2 = "";
        cyokVar.a = str == null ? str2 : str;
        cyokVar.i = clientConfigInternal.S;
        cyokVar.b = clientConfigInternal.u;
        cyokVar.c = clientConfigInternal.v;
        SocialAffinityAllEventSource socialAffinityAllEventSource = clientConfigInternal.t;
        cyokVar.j = socialAffinityAllEventSource.b;
        cyokVar.k = socialAffinityAllEventSource.e;
        cyokVar.l = socialAffinityAllEventSource.a;
        cyokVar.m = socialAffinityAllEventSource.d;
        cyokVar.n = socialAffinityAllEventSource.c;
        cyokVar.o = socialAffinityAllEventSource.f;
        cyokVar.d = clientVersion;
        cyokVar.e = clientConfigInternal.J;
        cyokVar.f = clientConfigInternal.B;
        cyokVar.g = clientConfigInternal.C;
        if (sessionContext != null) {
            cyokVar.h = sessionContext;
            if (cyokVar.a == null) {
                str2 = " accountName";
            }
            if (cyokVar.b == null) {
                str2 = str2.concat(" clearcutLogSource");
            }
            if (cyokVar.c == null) {
                str2 = String.valueOf(str2).concat(" metricLogSource");
            }
            if (cyokVar.j == 0) {
                str2 = String.valueOf(str2).concat(" suggestionPersonEventSource");
            }
            if (cyokVar.k == 0) {
                str2 = String.valueOf(str2).concat(" suggestionFieldEventSource");
            }
            if (cyokVar.l == 0) {
                str2 = String.valueOf(str2).concat(" autocompletePersonEventSource");
            }
            if (cyokVar.m == 0) {
                str2 = String.valueOf(str2).concat(" autocompleteFieldEventSource");
            }
            if (cyokVar.n == 0) {
                str2 = String.valueOf(str2).concat(" externalPersonEventSource");
            }
            if (cyokVar.o == 0) {
                str2 = String.valueOf(str2).concat(" externalFieldEventSource");
            }
            if (cyokVar.d == null) {
                str2 = String.valueOf(str2).concat(" clientVersion");
            }
            if (cyokVar.e == null) {
                str2 = String.valueOf(str2).concat(" experiments");
            }
            if (cyokVar.f == null) {
                str2 = String.valueOf(str2).concat(" emptyQueryResultGroupingOption");
            }
            if (cyokVar.g == null) {
                str2 = String.valueOf(str2).concat(" nonEmptyQueryResultGroupingOption");
            }
            if (cyokVar.h == null) {
                str2 = String.valueOf(str2).concat(" sessionContext");
            }
            if (str2.isEmpty()) {
                return new cyol(cyokVar.a, cyokVar.i, cyokVar.b, cyokVar.c, cyokVar.j, cyokVar.k, cyokVar.l, cyokVar.m, cyokVar.n, cyokVar.o, cyokVar.d, cyokVar.e, cyokVar.f, cyokVar.g, cyokVar.h);
            }
            String valueOf = String.valueOf(str2);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        throw new NullPointerException("Null sessionContext");
    }

    public abstract String a();

    public abstract cyfk b();

    public abstract cyfk c();

    public abstract ClientVersion d();

    public abstract Experiments e();

    public abstract cygp f();

    public abstract cygp g();

    public abstract SessionContext h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();
}
