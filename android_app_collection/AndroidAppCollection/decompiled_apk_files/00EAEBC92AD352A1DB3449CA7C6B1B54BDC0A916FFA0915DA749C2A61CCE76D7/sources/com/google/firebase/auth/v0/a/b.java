package com.google.firebase.auth.v0.a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.firebase.auth.v0.a.d;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public abstract class b<T extends d> {

    /* renamed from: b  reason: collision with root package name */
    private static com.google.android.gms.common.l.a f8452b = new com.google.android.gms.common.l.a("BiChannelGoogleApi", "FirebaseAuth: ");

    /* renamed from: a  reason: collision with root package name */
    private a<T> f8453a;

    private final com.google.android.gms.common.api.e<T> a(String str) {
        a<T> c2 = c();
        if (c2.f8450c.a(str)) {
            com.google.android.gms.common.l.a aVar = f8452b;
            String valueOf = String.valueOf(c2.f8449b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("getGoogleApiForMethod() returned Fallback: ");
            sb.append(valueOf);
            aVar.b(sb.toString(), new Object[0]);
            return c2.f8449b;
        }
        com.google.android.gms.common.l.a aVar2 = f8452b;
        String valueOf2 = String.valueOf(c2.f8448a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
        sb2.append("getGoogleApiForMethod() returned Gms: ");
        sb2.append(valueOf2);
        aVar2.b(sb2.toString(), new Object[0]);
        return c2.f8448a;
    }

    private static <ResultT> c.e.a.b.g.h<ResultT> b() {
        return c.e.a.b.g.k.a((Exception) a2.a(new Status(17499, "Unable to connect to GoogleApi instance - Google Play Services may be unavailable")));
    }

    private final a<T> c() {
        a<T> aVar;
        synchronized (this) {
            if (this.f8453a == null) {
                try {
                    this.f8453a = a().get();
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    throw new RuntimeException(valueOf.length() != 0 ? "There was an error while initializing the connection to Google Play Services: ".concat(valueOf) : new String("There was an error while initializing the connection to Google Play Services: "));
                }
            }
            aVar = this.f8453a;
        }
        return aVar;
    }

    public final <ResultT, A extends a.b> c.e.a.b.g.h<ResultT> a(e<A, ResultT> eVar) {
        com.google.android.gms.common.api.e<T> a2 = a(eVar.f());
        if (a2 == null) {
            return b();
        }
        if (a2.c().f8459b) {
            eVar.k();
        }
        return (c.e.a.b.g.h<ResultT>) a2.a((com.google.android.gms.common.api.internal.n<A, ResultT>) eVar.j());
    }

    abstract Future<a<T>> a();

    public final <ResultT, A extends a.b> c.e.a.b.g.h<ResultT> b(e<A, ResultT> eVar) {
        com.google.android.gms.common.api.e<T> a2 = a(eVar.f());
        if (a2 == null) {
            return b();
        }
        if (a2.c().f8459b) {
            eVar.k();
        }
        return (c.e.a.b.g.h<ResultT>) a2.b((com.google.android.gms.common.api.internal.n<A, ResultT>) eVar.j());
    }
}
