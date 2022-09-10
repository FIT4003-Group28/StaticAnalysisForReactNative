package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: crlr  reason: default package */
/* loaded from: classes5.dex */
public final class crlr implements crgy {
    public final btrm a;
    public final HashMap<crjv, crjr> b = new HashMap<>();
    @dzsi
    public crjy c;
    public boolean d;

    public crlr(btrm btrmVar) {
        this.a = btrmVar;
    }

    private final void d() {
        this.c = null;
        if (this.d) {
            this.d = false;
            this.a.a(this);
            this.b.clear();
        }
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        d();
    }

    public final void c(crjy crjyVar, GmmLocation gmmLocation, @dzsi crjv crjvVar) {
        bvrj.NAVIGATION_INTERNAL.c();
        if (crjvVar != null) {
            this.b.remove(crjvVar);
        }
        for (Map.Entry<crjv, crjr> entry : this.b.entrySet()) {
            crjyVar.c(entry.getKey(), entry.getValue(), gmmLocation);
        }
        d();
    }
}
