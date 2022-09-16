package b.a.a.a.a.g;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DefaultSettingsController.java */
/* loaded from: classes.dex */
public class j implements s {

    /* renamed from: a  reason: collision with root package name */
    private final w f1212a;

    /* renamed from: b  reason: collision with root package name */
    private final v f1213b;

    /* renamed from: c  reason: collision with root package name */
    private final b.a.a.a.a.b.k f1214c;

    /* renamed from: d  reason: collision with root package name */
    private final g f1215d;
    private final x e;
    private final b.a.a.a.i f;
    private final b.a.a.a.a.f.c g;

    public j(b.a.a.a.i iVar, w wVar, b.a.a.a.a.b.k kVar, v vVar, g gVar, x xVar) {
        this.f = iVar;
        this.f1212a = wVar;
        this.f1214c = kVar;
        this.f1213b = vVar;
        this.f1215d = gVar;
        this.e = xVar;
        this.g = new b.a.a.a.a.f.d(this.f);
    }

    @Override // b.a.a.a.a.g.s
    public t a() {
        return a(r.USE_CACHE);
    }

    @Override // b.a.a.a.a.g.s
    public t a(r rVar) {
        JSONObject a2;
        t tVar = null;
        try {
            if (!b.a.a.a.c.i() && !d()) {
                tVar = b(rVar);
            }
            if (tVar == null && (a2 = this.e.a(this.f1212a)) != null) {
                t a3 = this.f1213b.a(this.f1214c, a2);
                try {
                    this.f1215d.a(a3.g, a2);
                    a(a2, "Loaded settings: ");
                    a(b());
                    tVar = a3;
                } catch (Exception e) {
                    e = e;
                    tVar = a3;
                    b.a.a.a.c.h().e("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e);
                    return tVar;
                }
            }
            if (tVar == null) {
                return b(r.IGNORE_CACHE_EXPIRATION);
            }
        } catch (Exception e2) {
            e = e2;
        }
        return tVar;
    }

    private t b(r rVar) {
        t tVar = null;
        try {
            if (!r.SKIP_CACHE_LOOKUP.equals(rVar)) {
                JSONObject a2 = this.f1215d.a();
                if (a2 != null) {
                    t a3 = this.f1213b.a(this.f1214c, a2);
                    if (a3 != null) {
                        a(a2, "Loaded cached settings: ");
                        long a4 = this.f1214c.a();
                        if (!r.IGNORE_CACHE_EXPIRATION.equals(rVar) && a3.a(a4)) {
                            b.a.a.a.c.h().a("Fabric", "Cached settings have expired.");
                        }
                        try {
                            b.a.a.a.c.h().a("Fabric", "Returning cached settings.");
                            tVar = a3;
                        } catch (Exception e) {
                            e = e;
                            tVar = a3;
                            b.a.a.a.c.h().e("Fabric", "Failed to get cached settings", e);
                            return tVar;
                        }
                    } else {
                        b.a.a.a.c.h().e("Fabric", "Failed to transform cached settings data.", null);
                    }
                } else {
                    b.a.a.a.c.h().a("Fabric", "No cached settings data found.");
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return tVar;
    }

    private void a(JSONObject jSONObject, String str) {
        b.a.a.a.l h = b.a.a.a.c.h();
        h.a("Fabric", str + jSONObject.toString());
    }

    String b() {
        return b.a.a.a.a.b.i.a(b.a.a.a.a.b.i.m(this.f.getContext()));
    }

    String c() {
        return this.g.a().getString("existing_instance_identifier", "");
    }

    @SuppressLint({"CommitPrefEdits"})
    boolean a(String str) {
        SharedPreferences.Editor b2 = this.g.b();
        b2.putString("existing_instance_identifier", str);
        return this.g.a(b2);
    }

    boolean d() {
        return !c().equals(b());
    }
}
