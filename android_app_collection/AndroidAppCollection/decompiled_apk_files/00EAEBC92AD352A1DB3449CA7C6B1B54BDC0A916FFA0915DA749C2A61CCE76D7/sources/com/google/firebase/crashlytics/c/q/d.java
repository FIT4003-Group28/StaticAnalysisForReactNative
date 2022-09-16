package com.google.firebase.crashlytics.c.q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import c.e.a.b.g.i;
import c.e.a.b.g.k;
import com.google.firebase.crashlytics.c.h.i0;
import com.google.firebase.crashlytics.c.h.s;
import com.google.firebase.crashlytics.c.h.t;
import com.google.firebase.crashlytics.c.h.v;
import com.google.firebase.crashlytics.c.h.y;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9111a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.q.i.g f9112b;

    /* renamed from: c  reason: collision with root package name */
    private final f f9113c;

    /* renamed from: d  reason: collision with root package name */
    private final s f9114d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.q.a f9115e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.firebase.crashlytics.c.q.j.e f9116f;

    /* renamed from: g  reason: collision with root package name */
    private final t f9117g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicReference<com.google.firebase.crashlytics.c.q.i.e> f9118h = new AtomicReference<>();
    private final AtomicReference<i<com.google.firebase.crashlytics.c.q.i.b>> i = new AtomicReference<>(new i());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c.e.a.b.g.g<Void, Void> {
        a() {
        }

        @Override // c.e.a.b.g.g
        public c.e.a.b.g.h<Void> a(Void r5) {
            JSONObject a2 = d.this.f9116f.a(d.this.f9112b, true);
            if (a2 != null) {
                com.google.firebase.crashlytics.c.q.i.f a3 = d.this.f9113c.a(a2);
                d.this.f9115e.a(a3.d(), a2);
                d.this.a(a2, "Loaded settings: ");
                d dVar = d.this;
                dVar.a(dVar.f9112b.f9149f);
                d.this.f9118h.set(a3);
                ((i) d.this.i.get()).b((i) a3.c());
                i iVar = new i();
                iVar.b((i) a3.c());
                d.this.i.set(iVar);
            }
            return k.a((Object) null);
        }
    }

    d(Context context, com.google.firebase.crashlytics.c.q.i.g gVar, s sVar, f fVar, com.google.firebase.crashlytics.c.q.a aVar, com.google.firebase.crashlytics.c.q.j.e eVar, t tVar) {
        this.f9111a = context;
        this.f9112b = gVar;
        this.f9114d = sVar;
        this.f9113c = fVar;
        this.f9115e = aVar;
        this.f9116f = eVar;
        this.f9117g = tVar;
        this.f9118h.set(b.a(sVar));
    }

    public static d a(Context context, String str, y yVar, com.google.firebase.crashlytics.c.l.c cVar, String str2, String str3, String str4, t tVar) {
        String c2 = yVar.c();
        i0 i0Var = new i0();
        return new d(context, new com.google.firebase.crashlytics.c.q.i.g(str, yVar.d(), yVar.e(), yVar.f(), yVar, com.google.firebase.crashlytics.c.h.h.a(com.google.firebase.crashlytics.c.h.h.e(context), str, str3, str2), str3, str2, v.a(c2).a()), i0Var, new f(i0Var), new com.google.firebase.crashlytics.c.q.a(context), new com.google.firebase.crashlytics.c.q.j.d(str4, String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), cVar), tVar);
    }

    private com.google.firebase.crashlytics.c.q.i.f a(c cVar) {
        com.google.firebase.crashlytics.c.b a2;
        String str;
        com.google.firebase.crashlytics.c.q.i.f fVar = null;
        try {
            if (c.SKIP_CACHE_LOOKUP.equals(cVar)) {
                return null;
            }
            JSONObject a3 = this.f9115e.a();
            if (a3 != null) {
                com.google.firebase.crashlytics.c.q.i.f a4 = this.f9113c.a(a3);
                if (a4 == null) {
                    com.google.firebase.crashlytics.c.b.a().b("Failed to parse cached settings data.", null);
                    return null;
                }
                a(a3, "Loaded cached settings: ");
                long a5 = this.f9114d.a();
                if (!c.IGNORE_CACHE_EXPIRATION.equals(cVar) && a4.a(a5)) {
                    a2 = com.google.firebase.crashlytics.c.b.a();
                    str = "Cached settings have expired.";
                }
                try {
                    com.google.firebase.crashlytics.c.b.a().a("Returning cached settings.");
                    return a4;
                } catch (Exception e2) {
                    e = e2;
                    fVar = a4;
                    com.google.firebase.crashlytics.c.b.a().b("Failed to get cached settings", e);
                    return fVar;
                }
            }
            a2 = com.google.firebase.crashlytics.c.b.a();
            str = "No cached settings data found.";
            a2.a(str);
            return null;
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, String str) {
        com.google.firebase.crashlytics.c.b a2 = com.google.firebase.crashlytics.c.b.a();
        a2.a(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean a(String str) {
        SharedPreferences.Editor edit = com.google.firebase.crashlytics.c.h.h.h(this.f9111a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    private String d() {
        return com.google.firebase.crashlytics.c.h.h.h(this.f9111a).getString("existing_instance_identifier", "");
    }

    @Override // com.google.firebase.crashlytics.c.q.e
    public c.e.a.b.g.h<com.google.firebase.crashlytics.c.q.i.b> a() {
        return this.i.get().a();
    }

    public c.e.a.b.g.h<Void> a(c cVar, Executor executor) {
        com.google.firebase.crashlytics.c.q.i.f a2;
        if (!c() && (a2 = a(cVar)) != null) {
            this.f9118h.set(a2);
            this.i.get().b((i<com.google.firebase.crashlytics.c.q.i.b>) a2.c());
            return k.a((Object) null);
        }
        com.google.firebase.crashlytics.c.q.i.f a3 = a(c.IGNORE_CACHE_EXPIRATION);
        if (a3 != null) {
            this.f9118h.set(a3);
            this.i.get().b((i<com.google.firebase.crashlytics.c.q.i.b>) a3.c());
        }
        return this.f9117g.c().a(executor, new a());
    }

    public c.e.a.b.g.h<Void> a(Executor executor) {
        return a(c.USE_CACHE, executor);
    }

    @Override // com.google.firebase.crashlytics.c.q.e
    public com.google.firebase.crashlytics.c.q.i.e b() {
        return this.f9118h.get();
    }

    boolean c() {
        return !d().equals(this.f9112b.f9149f);
    }
}
