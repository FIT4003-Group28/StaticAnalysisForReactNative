package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ayag  reason: default package */
/* loaded from: classes2.dex */
public final class ayag {
    public final axzz a;
    public final ayiv b;
    public final axzs c;
    public final ayef d;
    final ayeg e;
    public ayia f;
    public boolean g;
    public boolean h;
    aybw i;
    public final /* synthetic */ ayji j;

    public ayag() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ayag(ayji ayjiVar, axzz axzzVar, ayiv ayivVar) {
        this();
        this.j = ayjiVar;
        this.a = axzzVar;
        this.b = ayivVar;
        axzs b = axzs.b("Subchannel", ayjiVar.b());
        this.c = b;
        long a = ayjiVar.n.a();
        String valueOf = String.valueOf(axzzVar.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("Subchannel for ");
        sb.append(valueOf);
        ayeg ayegVar = new ayeg(b, a, sb.toString());
        this.e = ayegVar;
        this.d = new ayef(ayegVar, ayjiVar.n);
    }

    public final void a() {
        this.j.o.d();
        aqxo.z(this.g, "not started");
        this.f.a();
    }

    public final void b() {
        aybw aybwVar;
        this.j.o.d();
        if (this.f == null) {
            this.h = true;
            return;
        }
        if (!this.h) {
            this.h = true;
        } else if (!this.j.C || (aybwVar = this.i) == null) {
            return;
        } else {
            aybwVar.a();
            this.i = null;
        }
        ayji ayjiVar = this.j;
        if (!ayjiVar.C) {
            this.i = ayjiVar.o.a(new ayid(new ayjg(this)), 5L, TimeUnit.SECONDS, this.j.j.b());
        } else {
            this.f.g(ayji.d);
        }
    }

    public final String toString() {
        return this.c.toString();
    }
}
