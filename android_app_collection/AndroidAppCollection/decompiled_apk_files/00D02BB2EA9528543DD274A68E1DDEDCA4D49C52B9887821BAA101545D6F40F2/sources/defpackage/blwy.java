package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: blwy  reason: default package */
/* loaded from: classes3.dex */
public class blwy {
    private static final dcdc<dgjw> e = dcdc.g(dgjw.ANY_TIME, dgjw.AFTER_ANSWERING);
    public final dxio<akfa> a;
    public final bvrb b;
    public final blpg c;
    @dzsi
    public blvw d;
    private final Set<dgjw> f = new HashSet(e);
    private final dxio<btvo> g;

    public blwy(dxio<akfa> dxioVar, bvrb bvrbVar, blpg blpgVar, dxio<btvo> dxioVar2) {
        this.a = dxioVar;
        this.b = bvrbVar;
        this.c = blpgVar;
        this.g = dxioVar2;
    }

    public final synchronized void a() {
        this.f.clear();
        this.f.addAll(e);
    }

    public final synchronized void b() {
        c(true);
    }

    public final synchronized void c(boolean z) {
        if (z) {
            if (!this.g.a().getEnableFeatureParameters().ag) {
                this.f.add(dgjw.AFTER_RATING_OR_REVIEW);
            }
            this.f.remove(dgjw.BEFORE_RATING_OR_REVIEW);
            return;
        }
        this.f.remove(dgjw.AFTER_RATING_OR_REVIEW);
        this.f.add(dgjw.BEFORE_RATING_OR_REVIEW);
    }

    public final synchronized void d(@dzsi blvw blvwVar) {
        this.d = blvwVar;
    }

    public final synchronized dcdc<blvu> e() {
        if (this.d == null) {
            return dcdc.e();
        }
        dccx dccxVar = new dccx();
        dcdc<blvu> dcdcVar = this.d.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            blvu blvuVar = dcdcVar.get(i);
            if (this.f.contains(blvuVar.e)) {
                dccxVar.g(blvuVar);
            }
        }
        return dccxVar.f();
    }

    public final synchronized void f() {
        this.f.add(dgjw.AFTER_PHONE_CALL);
    }
}
