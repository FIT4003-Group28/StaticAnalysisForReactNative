package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyjo  reason: default package */
/* loaded from: classes6.dex */
public final class dyjo extends dyeq {
    public static final Logger a = Logger.getLogger(dyjo.class.getName());
    private static final dyjm e;
    private static final Class<? extends dblv> f;
    final dblv b;
    public dyhw c;
    public Map<String, List<String>> d;
    private final boolean g;

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:2|3)|(2:5|6)|7|8|9|10|11|12|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        defpackage.dyjo.a.logp(java.util.logging.Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadGoogleCredentialsClass", "Failed to load GoogleCredentials", (java.lang.Throwable) r0);
     */
    static {
        /*
            java.lang.Class<dyjo> r0 = defpackage.dyjo.class
            java.lang.String r1 = r0.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            defpackage.dyjo.a = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            java.lang.String r2 = "com.google.auth.oauth2.ServiceAccountCredentials"
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r3, r0)     // Catch: java.lang.ClassNotFoundException -> L2f
            dyjm r3 = new dyjm     // Catch: java.lang.NoSuchMethodException -> L1e java.lang.ClassNotFoundException -> L20
            r3.<init>(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L1e java.lang.ClassNotFoundException -> L20
            goto L30
        L1e:
            r0 = move-exception
            goto L21
        L20:
            r0 = move-exception
        L21:
            r7 = r0
            java.util.logging.Logger r2 = defpackage.dyjo.a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r4 = "io.grpc.auth.GoogleAuthLibraryCallCredentials"
            java.lang.String r5 = "createJwtHelperOrNull"
            java.lang.String r6 = "Failed to create JWT helper. This is unexpected"
            r2.logp(r3, r4, r5, r6, r7)
        L2f:
            r3 = r1
        L30:
            defpackage.dyjo.e = r3
            java.lang.String r0 = "dbly"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L3f
            java.lang.Class<dblv> r1 = defpackage.dblv.class
            java.lang.Class r1 = r0.asSubclass(r1)
            goto L4e
        L3f:
            r0 = move-exception
            r7 = r0
            java.util.logging.Logger r2 = defpackage.dyjo.a
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            java.lang.String r4 = "io.grpc.auth.GoogleAuthLibraryCallCredentials"
            java.lang.String r5 = "loadGoogleCredentialsClass"
            java.lang.String r6 = "Failed to load GoogleCredentials"
            r2.logp(r3, r4, r5, r6, r7)
        L4e:
            defpackage.dyjo.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyjo.<clinit>():void");
    }

    public dyjo(dblv dblvVar) {
        dyjm dyjmVar = e;
        dbsk.t(dblvVar, "creds");
        Class<? extends dblv> cls = f;
        boolean isInstance = cls != null ? cls.isInstance(dblvVar) : false;
        if (dyjmVar != null && dyjmVar.a.isInstance(dblvVar)) {
            try {
                dblv cast = dyjmVar.a.cast(dblvVar);
                try {
                    if (((Collection) dyjmVar.d.invoke(cast, new Object[0])).size() != 0) {
                        dblvVar = cast;
                    } else {
                        Object invoke = dyjmVar.b.invoke(null, new Object[0]);
                        for (dyjn dyjnVar : dyjmVar.e) {
                            dyjnVar.b.invoke(invoke, dyjnVar.a.invoke(cast, new Object[0]));
                        }
                        dblvVar = (dblv) dyjmVar.c.invoke(invoke, new Object[0]);
                    }
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    e = e2;
                    dblvVar = cast;
                    a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", e);
                    this.g = isInstance;
                    this.b = dblvVar;
                }
            } catch (IllegalAccessException e3) {
                e = e3;
            } catch (InvocationTargetException e4) {
                e = e4;
            }
        }
        this.g = isInstance;
        this.b = dblvVar;
    }

    private static URI c(URI uri) {
        try {
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e2) {
            throw dyjb.i.g("Unable to construct service URI after removing port").f(e2).l();
        }
    }

    @Override // defpackage.dyeq
    public final void a(dyen dyenVar, Executor executor, dyep dyepVar) {
        dylb dylbVar = (dylb) dyenVar;
        dyiu dyiuVar = (dyiu) dbsc.a((dyiu) dylbVar.b.a.l().a(dyop.a), dyiu.NONE);
        if (!this.g || dyiuVar == dyiu.PRIVACY_AND_INTEGRITY) {
            try {
                this.b.b(b((String) dbsc.a(null, dylbVar.b.b), ((dylb) dyenVar).a), executor, new dyjl(this, dyepVar));
                return;
            } catch (dyjc e2) {
                dyepVar.b(e2.a);
                return;
            }
        }
        dyjb dyjbVar = dyjb.i;
        String valueOf = String.valueOf(dyiuVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 96);
        sb.append("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: ");
        sb.append(valueOf);
        dyepVar.b(dyjbVar.g(sb.toString()));
    }

    private static URI b(String str, dyib<?, ?> dyibVar) {
        String valueOf = String.valueOf(dyibVar.c);
        try {
            URI uri = new URI("https", str, valueOf.length() != 0 ? "/".concat(valueOf) : new String("/"), null, null);
            return uri.getPort() == 443 ? c(uri) : uri;
        } catch (URISyntaxException e2) {
            throw dyjb.i.g("Unable to construct service URI for auth").f(e2).l();
        }
    }
}
