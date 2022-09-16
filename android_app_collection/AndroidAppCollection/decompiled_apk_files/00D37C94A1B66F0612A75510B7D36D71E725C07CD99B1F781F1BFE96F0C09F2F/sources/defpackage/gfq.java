package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: gfq  reason: default package */
/* loaded from: classes3.dex */
public final class gfq implements gfr {
    private final tdb a;
    private final Map b = new ConcurrentHashMap();
    private aypg c;

    public gfq(tdb tdbVar) {
        this.a = tdbVar;
    }

    @Override // defpackage.gfr
    public final void a() {
        if (this.c != null) {
            return;
        }
        this.c = this.a.a("Egl0aGVtZS1zZXQgSygB").X(aypa.a()).I(efx.m).i(aynq.LATEST).C(gam.d).C(gam.e).Z(new ayqb() { // from class: gfp
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                gfq gfqVar = gfq.this;
                avgi avgiVar = (avgi) obj;
                if ((avgiVar.b & 2) == 0 || Collections.unmodifiableMap(avgiVar.d).isEmpty()) {
                    return;
                }
                gfqVar.c(avgiVar);
            }
        });
    }

    @Override // defpackage.gfr
    public final void b() {
        aypg aypgVar = this.c;
        if (aypgVar != null) {
            azof.f((AtomicReference) aypgVar);
            this.c = null;
        }
    }

    public final void c(avgi avgiVar) {
        amum h = amup.h();
        int[] iArr = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i];
            if (i2 != 1) {
                String a = aphq.a(i2);
                if (i2 != 0) {
                    String str = (String) Collections.unmodifiableMap(avgiVar.d).get(a);
                    if (str != null) {
                        ampq ampqVar = (ampq) this.a.a(str).aw();
                        if (ampqVar.h()) {
                            h.f(a, (byte[]) ampqVar.c());
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        this.b.put(avgiVar.c, h.b());
    }

    @Override // defpackage.gfr
    public final void d(avgi avgiVar, int i) {
        c(avgiVar);
        e(i);
    }

    @Override // defpackage.gfr
    public final void e(int i) {
        for (String str : this.b.keySet()) {
            if (this.b.get(str) != null) {
                amup amupVar = (amup) this.b.get(str);
                String a = aphq.a(i);
                if (i == 0) {
                    throw null;
                }
                if (amupVar.containsKey(a)) {
                    this.a.b(str, (byte[]) ((amup) this.b.get(str)).get(aphq.a(i)));
                }
            }
        }
    }
}
