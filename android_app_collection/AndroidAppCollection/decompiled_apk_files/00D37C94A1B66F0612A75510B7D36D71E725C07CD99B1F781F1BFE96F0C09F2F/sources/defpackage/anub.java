package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: anub  reason: default package */
/* loaded from: classes.dex */
public final class anub {
    public static final anub a;
    public static final anub b;
    public static final anub c;
    public static final anub d;
    public static final anub e;
    public static final anub f;
    public static final anub g;
    private static final Logger h = Logger.getLogger(anub.class.getName());
    private static final List i;
    private static final boolean j;
    private final anud k;

    static {
        if (anoq.b()) {
            i = b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            j = false;
        } else if (amnt.k()) {
            i = b("GmsCore_OpenSSL", "AndroidOpenSSL");
            j = true;
        } else {
            i = new ArrayList();
            j = true;
        }
        a = new anub(new anuc(1));
        b = new anub(new anuc(4));
        c = new anub(new anuc(6));
        d = new anub(new anuc(5));
        e = new anub(new anuc());
        f = new anub(new anuc(3));
        g = new anub(new anuc(2));
    }

    public anub(anud anudVar) {
        this.k = anudVar;
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                h.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        Exception exc = null;
        for (Provider provider : i) {
            try {
                return this.k.a(str, provider);
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (j) {
            return this.k.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
