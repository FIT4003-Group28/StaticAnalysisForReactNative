package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ahrm  reason: default package */
/* loaded from: classes.dex */
public final class ahrm {
    public static final long a = TimeUnit.MINUTES.toMillis(10);
    public final ahki b;
    public final cqat c;
    public boolean e;
    public long l;
    public float m;
    public Float n;
    private int p;
    private int q;
    public final WeakHashMap<ahkh, Object> d = new WeakHashMap<>();
    public int f = -1;
    public float g = Float.NaN;
    private float o = Float.NaN;
    public float h = -1.0f;
    public float i = -1000.0f;
    public float j = -1.0f;
    public float k = Float.MAX_VALUE;

    public ahrm(ahki ahkiVar, cqat cqatVar) {
        dbsk.s(ahkiVar);
        this.b = ahkiVar;
        dbsk.s(cqatVar);
        this.c = cqatVar;
    }

    public static boolean f(duwy duwyVar) {
        return duwyVar.d;
    }

    public final void a(float f) {
        if (Float.isNaN(this.o) || Math.abs(f - this.o) > 10.0f || ahkk.a((int) f) >= 3) {
            this.f = ahkk.a((int) f);
            c();
            this.o = f;
        }
        this.g = f;
    }

    public final void b() {
        this.g = Float.NaN;
    }

    public final void c() {
        for (ahkh ahkhVar : this.d.keySet()) {
            ahkhVar.a(this.f);
        }
    }

    public final void d() {
        for (ahkh ahkhVar : this.d.keySet()) {
            ahkhVar.b(this.h, this.i, this.j);
        }
    }

    public final GmmLocation e() {
        return this.b.a();
    }

    public final void g(int i, int i2) {
        this.p = i;
        this.q = i2;
    }
}
