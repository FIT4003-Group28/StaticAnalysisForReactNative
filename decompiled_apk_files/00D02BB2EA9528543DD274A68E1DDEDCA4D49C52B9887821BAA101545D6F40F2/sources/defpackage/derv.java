package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: derv  reason: default package */
/* loaded from: classes6.dex */
public final class derv {
    private final dela a;
    private final derx b;
    private final cnmk c;
    private final desq<devr> d;
    private final desq<derf> e;
    private final desz f;

    public derv(dela delaVar, derx derxVar, desq<devr> desqVar, desq<derf> desqVar2, desz deszVar) {
        cnmk cnmkVar = new cnmk(delaVar.a());
        this.a = delaVar;
        this.b = derxVar;
        this.c = cnmkVar;
        this.d = desqVar;
        this.e = desqVar2;
        this.f = deszVar;
    }

    private final String c() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.a.b().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public final cpcq<Bundle> a(String str, String str2, String str3, final Bundle bundle) {
        int a;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.a.c().b);
        bundle.putString("gmsv", Integer.toString(this.b.e()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.c());
        bundle.putString("app_ver_name", this.b.d());
        bundle.putString("firebase-app-name-hash", c());
        try {
            String a2 = ((detf) cpda.d(this.f.i())).a();
            if (!TextUtils.isEmpty(a2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a2);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString("cliv", "fiid-21.0.1");
        derf a3 = this.e.a();
        devr a4 = this.d.a();
        if (a3 != null && a4 != null && (a = a3.a("fire-iid")) != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(dere.a(a)));
            bundle.putString("Firebase-Client", a4.a());
        }
        final cnmk cnmkVar = this.c;
        if (cnmkVar.d.b() < 12000000) {
            if (cnmkVar.d.a() == 0) {
                return cpda.b(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            return cnmkVar.c(bundle).h(cnmk.a, new cpbu(cnmkVar, bundle) { // from class: cnme
                private final cnmk a;
                private final Bundle b;

                {
                    this.a = cnmkVar;
                    this.b = bundle;
                }

                @Override // defpackage.cpbu
                public final Object a(cpcq cpcqVar) {
                    return (cpcqVar.b() && cnmk.b((Bundle) cpcqVar.d())) ? this.a.c(this.b).j(cnmk.a, cnmh.a) : cpcqVar;
                }
            });
        }
        cnmb a5 = cnmb.a(cnmkVar.c);
        return a5.b(new cnma(a5.c(), bundle)).g(cnmk.a, cnmd.a);
    }

    public final cpcq<String> b(cpcq<Bundle> cpcqVar) {
        return cpcqVar.g(dero.a, new cpbu() { // from class: deru
            @Override // defpackage.cpbu
            public final Object a(cpcq cpcqVar2) {
                TResult tresult;
                synchronized (((cpcx) cpcqVar2).a) {
                    ((cpcx) cpcqVar2).v();
                    ((cpcx) cpcqVar2).w();
                    if (!IOException.class.isInstance(((cpcx) cpcqVar2).f)) {
                        Exception exc = ((cpcx) cpcqVar2).f;
                        if (exc == null) {
                            tresult = ((cpcx) cpcqVar2).e;
                        } else {
                            throw new cpco(exc);
                        }
                    } else {
                        throw ((Throwable) IOException.class.cast(((cpcx) cpcqVar2).f));
                    }
                }
                Bundle bundle = (Bundle) tresult;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 == null) {
                    String valueOf = String.valueOf(bundle);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("Unexpected response: ");
                    sb.append(valueOf);
                    sb.toString();
                    new Throwable();
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                throw new IOException(string2);
            }
        });
    }
}
