package b.a.a.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import b.a.a.a.a.g.n;
import b.a.a.a.a.g.q;
import b.a.a.a.a.g.t;
import b.a.a.a.a.g.y;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Onboarding.java */
/* loaded from: classes.dex */
public class m extends i<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private final b.a.a.a.a.e.e f1271a = new b.a.a.a.a.e.b();

    /* renamed from: b  reason: collision with root package name */
    private PackageManager f1272b;

    /* renamed from: c  reason: collision with root package name */
    private String f1273c;

    /* renamed from: d  reason: collision with root package name */
    private PackageInfo f1274d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private final Future<Map<String, k>> j;
    private final Collection<i> k;

    @Override // b.a.a.a.i
    public String getIdentifier() {
        return "io.fabric.sdk.android:fabric";
    }

    @Override // b.a.a.a.i
    public String getVersion() {
        return "1.4.3.25";
    }

    public m(Future<Map<String, k>> future, Collection<i> collection) {
        this.j = future;
        this.k = collection;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b.a.a.a.i
    public boolean onPreExecute() {
        try {
            this.g = getIdManager().i();
            this.f1272b = getContext().getPackageManager();
            this.f1273c = getContext().getPackageName();
            this.f1274d = this.f1272b.getPackageInfo(this.f1273c, 0);
            this.e = Integer.toString(this.f1274d.versionCode);
            this.f = this.f1274d.versionName == null ? "0.0" : this.f1274d.versionName;
            this.h = this.f1272b.getApplicationLabel(getContext().getApplicationInfo()).toString();
            this.i = Integer.toString(getContext().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            c.h().e("Fabric", "Failed init", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b.a.a.a.i
    /* renamed from: a */
    public Boolean mo24doInBackground() {
        Map<String, k> hashMap;
        boolean a2;
        String k = b.a.a.a.a.b.i.k(getContext());
        t c2 = c();
        if (c2 != null) {
            try {
                if (this.j != null) {
                    hashMap = this.j.get();
                } else {
                    hashMap = new HashMap<>();
                }
                a2 = a(k, c2.f1241a, a(hashMap, this.k).values());
            } catch (Exception e) {
                c.h().e("Fabric", "Error performing auto configuration.", e);
            }
            return Boolean.valueOf(a2);
        }
        a2 = false;
        return Boolean.valueOf(a2);
    }

    private t c() {
        try {
            q.a().a(this, this.idManager, this.f1271a, this.e, this.f, b()).c();
            return q.a().b();
        } catch (Exception e) {
            c.h().e("Fabric", "Error dealing with settings", e);
            return null;
        }
    }

    Map<String, k> a(Map<String, k> map, Collection<i> collection) {
        for (i iVar : collection) {
            if (!map.containsKey(iVar.getIdentifier())) {
                map.put(iVar.getIdentifier(), new k(iVar.getIdentifier(), iVar.getVersion(), "binary"));
            }
        }
        return map;
    }

    private boolean a(String str, b.a.a.a.a.g.e eVar, Collection<k> collection) {
        if ("new".equals(eVar.f1206b)) {
            if (b(str, eVar, collection)) {
                return q.a().d();
            }
            c.h().e("Fabric", "Failed to create app with Crashlytics service.", null);
            return false;
        } else if ("configured".equals(eVar.f1206b)) {
            return q.a().d();
        } else {
            if (eVar.f) {
                c.h().a("Fabric", "Server says an update is required - forcing a full App update.");
                c(str, eVar, collection);
            }
            return true;
        }
    }

    private boolean b(String str, b.a.a.a.a.g.e eVar, Collection<k> collection) {
        return new b.a.a.a.a.g.h(this, b(), eVar.f1207c, this.f1271a).a(a(n.a(getContext(), str), collection));
    }

    private boolean c(String str, b.a.a.a.a.g.e eVar, Collection<k> collection) {
        return a(eVar, n.a(getContext(), str), collection);
    }

    private boolean a(b.a.a.a.a.g.e eVar, n nVar, Collection<k> collection) {
        return new y(this, b(), eVar.f1207c, this.f1271a).a(a(nVar, collection));
    }

    private b.a.a.a.a.g.d a(n nVar, Collection<k> collection) {
        Context context = getContext();
        return new b.a.a.a.a.g.d(new b.a.a.a.a.b.g().a(context), getIdManager().c(), this.f, this.e, b.a.a.a.a.b.i.a(b.a.a.a.a.b.i.m(context)), this.h, b.a.a.a.a.b.l.a(this.g).a(), this.i, "0", nVar, collection);
    }

    String b() {
        return b.a.a.a.a.b.i.b(getContext(), "com.crashlytics.ApiEndpoint");
    }
}
