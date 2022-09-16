package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: etn  reason: default package */
/* loaded from: classes3.dex */
public final class etn implements acuw {
    public long a = -1;
    public long b = -1;
    private final yni c;
    private final azqb d;

    public etn(azqb azqbVar, yni yniVar) {
        this.c = yniVar;
        this.d = azqbVar;
    }

    public final void a() {
        this.b = -2L;
    }

    public final void b(long j, long j2, boolean z, boolean z2) {
        ylr.c();
        this.a = j2;
        this.c.f(new evi(j, z, z2));
    }

    @Override // defpackage.acuw
    public final void c() {
        a();
        this.c.f(new eve());
    }

    public final void d() {
        this.c.d(new evv());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return this.b >= 0 && this.a >= 0;
    }

    public final void f(Application application) {
        acux acuxVar = (acux) this.d.get();
        if (acuxVar.g()) {
            acuxVar.d().h(efx.j).U(new ayqb() { // from class: etl
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    etn.this.c();
                }
            }, dzq.i);
        }
        application.registerActivityLifecycleCallbacks(new etm(this));
    }
}
