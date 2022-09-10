package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: buhl  reason: default package */
/* loaded from: classes4.dex */
public final class buhl implements buae<String> {
    public final btrm a;
    public volatile dbsg<btlu> c;
    @dzsi
    private deig<buab<String>> e;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public volatile Map<btlu, btue> d = new HashMap();

    public buhl(btrm btrmVar, @dzsi btlu btluVar) {
        this.a = btrmVar;
        this.c = dbsg.j(btluVar);
    }

    private final void f(String str) {
        deig<buab<String>> deigVar;
        synchronized (this) {
            deigVar = this.e;
            if (deigVar != null) {
                this.e = null;
            } else {
                deigVar = null;
            }
        }
        if (deigVar != null) {
            deigVar.j(buab.c("Authorization", str));
        }
    }

    @Override // defpackage.buae
    public final synchronized dehn<buab<String>> a() {
        dehn<buab<String>> o;
        btue btueVar;
        buab<String> b = b();
        if (b != null) {
            return deha.a(b);
        }
        if (this.c.a() && (btueVar = this.d.get(this.c.b())) != null) {
            btueVar.d();
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = deig.d();
            }
            o = deha.o(this.e);
        }
        return o;
    }

    @dzsi
    public final buab<String> b() {
        btue btueVar;
        String i;
        if (!this.b.getAndSet(true)) {
            btrm btrmVar = this.a;
            dceq a = dcet.a();
            a.b(gdp.class, new buhn(0, gdp.class, this));
            a.b(btuc.class, new buhn(1, btuc.class, this));
            btrmVar.g(this, a.a());
        }
        synchronized (this) {
            if (!this.c.a() || (btueVar = this.d.get(this.c.b())) == null || (i = btueVar.i()) == null) {
                return null;
            }
            return buab.c("Authorization", i);
        }
    }

    public final synchronized void c(@dzsi btue btueVar) {
        if (btueVar != null) {
            if (this.c.a()) {
                String f = dbsj.f(btueVar.e());
                if (f == null) {
                    return;
                }
                f(f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final synchronized btlu d() {
        if (this.c.a()) {
            return this.c.b();
        }
        return null;
    }

    public final synchronized void e() {
        btue btueVar;
        String i;
        if (!this.c.a() || (btueVar = this.d.get(this.c.b())) == null || (i = btueVar.i()) == null) {
            return;
        }
        f(i);
    }
}
