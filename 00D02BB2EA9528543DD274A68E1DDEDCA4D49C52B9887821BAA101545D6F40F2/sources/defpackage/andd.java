package defpackage;

import android.location.Address;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: andd  reason: default package */
/* loaded from: classes2.dex */
public final class andd {
    public final isr a;
    public final akzy b;
    public final Runnable c;
    public andb d;
    private final bzgj e;
    private final Handler f;
    private final Runnable g;
    private final bzgf h;
    private final andc<akqq> i;
    private final anda<Boolean> j;
    @dzsi
    private akqq k;

    public andd(isr isrVar, Executor executor, andc<akqq> andcVar, anda<Boolean> andaVar, Runnable runnable) {
        bzgj bzgjVar = new bzgj();
        this.e = bzgjVar;
        this.f = new Handler(Looper.getMainLooper());
        this.g = new Runnable(this) { // from class: ancx
            private final andd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        };
        this.b = new akzy(this) { // from class: ancy
            private final andd a;

            {
                this.a = this;
            }

            @Override // defpackage.akzy
            public final void a(alad aladVar) {
                this.a.a();
            }
        };
        bzgf bzgfVar = new bzgf(this) { // from class: ancz
            private final andd a;

            {
                this.a = this;
            }

            @Override // defpackage.bzgf
            public final void a() {
                andd anddVar = this.a;
                isq c = anddVar.a.c();
                Address address = c == null ? null : ((isk) c).b;
                if (address == null || address.getAddressLine(0) == null) {
                    anddVar.d = andb.c(1, null);
                } else {
                    anddVar.d = andb.c(3, address.getAddressLine(0));
                }
                anddVar.c.run();
            }
        };
        this.h = bzgfVar;
        this.k = null;
        this.d = andb.c(1, null);
        this.i = andcVar;
        this.j = andaVar;
        this.a = isrVar;
        this.c = runnable;
        isrVar.d(bzgfVar, bzgjVar, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (!this.j.a().booleanValue()) {
            akqq a = this.i.a();
            akqq akqqVar = this.k;
            if (akqqVar != null && a != null && akqqVar.equals(a)) {
                b();
            } else {
                this.k = a;
                this.f.removeCallbacks(this.g);
                this.f.postDelayed(this.g, 100L);
                return;
            }
        }
        akqq a2 = this.i.a();
        if (a2 != null && this.a.a(a2)) {
            int i = ((anby) this.d).b - 1;
            if (i == 0) {
                this.d = andb.c(2, null);
                this.c.run();
            } else if (i != 2) {
            } else {
                this.d = andb.c(4, null);
                this.c.run();
            }
        }
    }

    public final void b() {
        this.f.removeCallbacks(this.g);
        this.f.postDelayed(this.g, 1000L);
    }

    public final void c() {
        this.e.b();
        isr isrVar = this.a;
        isrVar.b.removeCallbacks(isrVar.d);
        isrVar.c = true;
    }
}
