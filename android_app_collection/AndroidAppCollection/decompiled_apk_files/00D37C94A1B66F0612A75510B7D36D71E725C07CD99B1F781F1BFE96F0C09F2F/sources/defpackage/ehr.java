package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ehr  reason: default package */
/* loaded from: classes3.dex */
public final class ehr implements egu {
    public final axnm a;
    public final aadd b;
    public final ayoi c;
    public final ayoi d;

    public ehr(axnm axnmVar, aadd aaddVar, aacz aaczVar, final ayor ayorVar) {
        this.a = axnmVar;
        this.b = aaddVar;
        final ayoi B = aaddVar.a.V(dzy.f).B();
        final ehh ehhVar = (ehh) axnmVar.get();
        final ayoi m = ayoi.m(ehhVar.g(), ehhVar.c.a, new aypx() { // from class: ehg
            @Override // defpackage.aypx
            public final Object a(Object obj, Object obj2) {
                egw egwVar = (egw) obj;
                boolean z = false;
                if (ehh.k((arhd) obj2, ehh.this.b.c().g()) && egwVar.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        if (eog.av(aaczVar)) {
            this.c = ayoi.T(false).v(ayoi.z(new Callable() { // from class: ehp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ayoi ayoiVar = ayoi.this;
                    ayoi ayoiVar2 = m;
                    return ehr.b(ayoiVar, ayoiVar2).ae(ayorVar);
                }
            }));
        } else {
            this.c = b(B, m);
        }
        if (eog.aw(aaczVar)) {
            if (eog.av(aaczVar)) {
                this.d = ayoi.T(false).v(ayoi.z(new Callable() { // from class: ehq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ehr ehrVar = ehr.this;
                        return ehrVar.a().ae(ayorVar);
                    }
                }));
                return;
            } else {
                this.d = a();
                return;
            }
        }
        this.d = ayoi.T(false);
    }

    public static final ayoi b(ayoi ayoiVar, ayoi ayoiVar2) {
        return ayoi.m(ayoiVar, ayoiVar2, eho.a).B();
    }

    public final ayoi a() {
        return ayoi.m(this.c, ((ehh) this.a.get()).g().V(dzy.e), eho.c).B();
    }
}
