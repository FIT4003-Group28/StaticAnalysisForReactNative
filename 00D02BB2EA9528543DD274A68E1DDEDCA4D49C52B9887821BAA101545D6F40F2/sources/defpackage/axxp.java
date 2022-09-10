package defpackage;

import java.lang.ref.WeakReference;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axxp  reason: default package */
/* loaded from: classes3.dex */
public final class axxp<T> implements alwb {
    public final dxio<akty> b;
    public final alwc c;
    public final Executor d;
    public final akpq e;
    public final alvb f;
    public alwn i;
    public final axxm<T> l;
    private final Object n;
    private final btrm o;
    private final axxn p;
    public final dcdc<T> a = dcdc.e();
    public final Object k = new Object();
    public final Map<T, aktd> m = new IdentityHashMap();
    public final btnc<alyh, List<T>> h = new btnc<>(30, btmz.PERSONAL_PLACE_LABEL_GENERATOR, null);
    public List<azwv> j = dcdc.e();
    public final axxo g = new axxo(this);

    public axxp(Object obj, dxio<akty> dxioVar, btrm btrmVar, alwc alwcVar, dehq dehqVar, akpq akpqVar, WeakReference<akzh> weakReference, alvb alvbVar, axxm<T> axxmVar) {
        this.n = obj;
        this.b = dxioVar;
        this.o = btrmVar;
        this.c = alwcVar;
        this.d = dehqVar;
        this.p = new axxn(weakReference, this);
        this.e = akpqVar;
        this.f = alvbVar;
        this.l = axxmVar;
        this.i = alwcVar.l();
    }

    public final synchronized void a() {
        if (this.g.b(true)) {
            btrm btrmVar = this.o;
            dceq a = dcet.a();
            a.b(azre.class, new axxq(azre.class, this));
            btrmVar.g(this, a.a());
            this.c.d(this);
            this.e.a(this.p);
            this.e.b(this.p);
        }
    }

    public final synchronized void b() {
        if (this.g.b(false)) {
            this.e.c(this.p);
            this.o.a(this);
            this.c.e(this);
        }
    }

    @Override // defpackage.alwb
    public final void e(alwa alwaVar) {
        if (alwaVar.a != this.n) {
            return;
        }
        this.g.a();
    }
}
