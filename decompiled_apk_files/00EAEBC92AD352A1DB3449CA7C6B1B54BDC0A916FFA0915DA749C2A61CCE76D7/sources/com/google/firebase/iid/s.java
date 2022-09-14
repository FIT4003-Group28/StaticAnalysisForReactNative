package com.google.firebase.iid;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import c.e.b.m.c;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final c.e.b.d f9285a;

    /* renamed from: b  reason: collision with root package name */
    private final f0 f9286b;

    /* renamed from: c  reason: collision with root package name */
    private final p0 f9287c;

    /* renamed from: d  reason: collision with root package name */
    private final c.e.b.p.h f9288d;

    /* renamed from: e  reason: collision with root package name */
    private final c.e.b.m.c f9289e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.firebase.installations.h f9290f;

    public s(c.e.b.d dVar, f0 f0Var, c.e.b.p.h hVar, c.e.b.m.c cVar, com.google.firebase.installations.h hVar2) {
        this(dVar, f0Var, new p0(dVar.b(), f0Var), hVar, cVar, hVar2);
    }

    s(c.e.b.d dVar, f0 f0Var, p0 p0Var, c.e.b.p.h hVar, c.e.b.m.c cVar, com.google.firebase.installations.h hVar2) {
        this.f9285a = dVar;
        this.f9286b = f0Var;
        this.f9287c = p0Var;
        this.f9288d = hVar;
        this.f9289e = cVar;
        this.f9290f = hVar2;
    }

    private Bundle a(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f9285a.d().b());
        bundle.putString("gmsv", Integer.toString(this.f9286b.c()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f9286b.a());
        bundle.putString("app_ver_name", this.f9286b.b());
        bundle.putString("firebase-app-name-hash", a());
        try {
            String a2 = ((com.google.firebase.installations.m) c.e.a.b.g.k.a((c.e.a.b.g.h<Object>) this.f9290f.a(false))).a();
            if (!TextUtils.isEmpty(a2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a2);
            } else {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e2);
        }
        bundle.putString("cliv", "20.2.3".length() != 0 ? "fiid-".concat("20.2.3") : new String("fiid-"));
        c.a a3 = this.f9289e.a("fire-iid");
        if (a3 != c.a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a3.a()));
            bundle.putString("Firebase-Client", this.f9288d.a());
        }
        return bundle;
    }

    private String a() {
        try {
            return a(MessageDigest.getInstance("SHA-1").digest(this.f9285a.c().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            }
            if (string3 != null) {
                throw new IOException(string3);
            }
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Unexpected response: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    private static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private c.e.a.b.g.h<String> b(c.e.a.b.g.h<Bundle> hVar) {
        return hVar.a(h.a(), new c.e.a.b.g.a(this) { // from class: com.google.firebase.iid.r

            /* renamed from: a  reason: collision with root package name */
            private final s f9277a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9277a = this;
            }

            @Override // c.e.a.b.g.a
            public final Object a(c.e.a.b.g.h hVar2) {
                return this.f9277a.a(hVar2);
            }
        });
    }

    private c.e.a.b.g.h<Bundle> b(String str, String str2, String str3, Bundle bundle) {
        a(str, str2, str3, bundle);
        return this.f9287c.a(bundle);
    }

    public c.e.a.b.g.h<?> a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return b(b(str, str2, str3, bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String a(c.e.a.b.g.h hVar) {
        return a((Bundle) hVar.a(IOException.class));
    }

    public c.e.a.b.g.h<String> b(String str, String str2, String str3) {
        return b(b(str, str2, str3, new Bundle()));
    }

    public c.e.a.b.g.h<?> c(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        String valueOf2 = String.valueOf(str3);
        return b(b(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }

    public c.e.a.b.g.h<?> d(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String valueOf = String.valueOf(str3);
        bundle.putString("gcm.topic", valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/"));
        bundle.putString("delete", "1");
        String valueOf2 = String.valueOf(str3);
        return b(b(str, str2, valueOf2.length() != 0 ? "/topics/".concat(valueOf2) : new String("/topics/"), bundle));
    }
}
