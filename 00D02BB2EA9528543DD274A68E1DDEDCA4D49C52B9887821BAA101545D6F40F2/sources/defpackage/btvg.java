package defpackage;

import android.content.SharedPreferences;
import java.net.URL;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: btvg  reason: default package */
/* loaded from: classes.dex */
public final class btvg implements SharedPreferences.OnSharedPreferenceChangeListener {
    final btrm a;
    final btvf b;
    URL c;
    protected final btuw f;
    private final AtomicBoolean g = new AtomicBoolean(false);
    @dzsi
    btve d = null;
    public final deig<Void> e = deig.d();

    public btvg(URL url, btvf btvfVar, btrm btrmVar, btuw btuwVar) {
        this.c = url;
        this.b = btvfVar;
        this.a = btrmVar;
        this.f = btuwVar;
    }

    public final void a() {
        if (!this.g.getAndSet(true)) {
            btrm btrmVar = this.a;
            dceq a = dcet.a();
            a.b(btwe.class, new btvh(btwe.class, this));
            btrmVar.g(this, a.a());
        }
    }

    public final synchronized URL b() {
        return this.c;
    }

    public final synchronized btve c() {
        btve btveVar;
        if (this.d == null) {
            e();
        }
        btveVar = this.d;
        dbsk.s(btveVar);
        return btveVar;
    }

    public final dehn<Void> d() {
        return deha.o(this.e);
    }

    public final void e() {
        synchronized (this) {
            btve b = this.b.b(this.c);
            this.d = b;
            dbsk.s(b);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
    }
}
