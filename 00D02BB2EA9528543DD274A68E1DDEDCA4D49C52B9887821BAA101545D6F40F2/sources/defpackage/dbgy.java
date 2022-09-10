package defpackage;

import com.google.ar.core.Plane;
import com.google.ar.core.TrackingState;
import com.google.ar.sceneform.rendering.Material;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: dbgy  reason: default package */
/* loaded from: classes5.dex */
public final class dbgy implements dbdx {
    private final Plane c;
    private final dbhq d;
    private dbhl i;
    private final ArrayList<dbih> j;
    private final ArrayList<Integer> k;
    private final dbhi l;
    private dbhh m;
    private dbhh n;
    private final dbdz e = new dbdz();
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    public boolean a = false;
    public dbgt b = null;

    public dbgy(Plane plane, dbhq dbhqVar) {
        ArrayList<dbih> arrayList = new ArrayList<>();
        this.j = arrayList;
        this.k = new ArrayList<>();
        this.c = plane;
        this.d = dbhqVar;
        dbhf a = dbhi.a();
        a.a = arrayList;
        this.l = a.a();
    }

    public final void a(boolean z) {
        if (this.g != z) {
            this.g = z;
            e();
        }
    }

    public final void b(boolean z) {
        if (this.h != z) {
            this.h = z;
            e();
        }
    }

    public final void c(Material material) {
        dbhh dbhhVar = this.n;
        if (dbhhVar == null) {
            dbhg a = dbhh.a();
            a.a = this.k;
            a.b = material;
            this.n = a.a();
        } else {
            dbhhVar.b = material;
        }
        if (this.b != null) {
            f();
        }
    }

    public final void d(Material material) {
        dbhh dbhhVar = this.m;
        if (dbhhVar == null) {
            dbhg a = dbhh.a();
            a.a = this.k;
            a.b = material;
            this.m = a.a();
        } else {
            dbhhVar.b = material;
        }
        if (this.b != null) {
            f();
        }
    }

    public final void e() {
        dbhl dbhlVar;
        if (this.g && (this.a || this.h)) {
            if (this.c.getTrackingState() != TrackingState.TRACKING) {
                g();
                return;
            }
            short s = 0;
            this.c.getCenterPose().toMatrix(this.e.b, 0);
            FloatBuffer polygon = this.c.getPolygon();
            if (polygon != null) {
                polygon.rewind();
                int limit = polygon.limit() / 2;
                if (limit != 0) {
                    this.j.clear();
                    this.j.ensureCapacity(limit + limit);
                    int i = limit - 2;
                    this.k.clear();
                    this.k.ensureCapacity((limit * 6) + (i * 3));
                    dbeb p = dbeb.p();
                    while (polygon.hasRemaining()) {
                        float f = polygon.get();
                        float f2 = polygon.get();
                        ArrayList<dbih> arrayList = this.j;
                        dbif a = dbih.a();
                        a.b(new dbeb(f, 0.0f, f2));
                        a.b = p;
                        arrayList.add(a.a());
                    }
                    polygon.rewind();
                    while (polygon.hasRemaining()) {
                        float f3 = polygon.get();
                        float f4 = polygon.get();
                        float hypot = (float) Math.hypot(f3, f4);
                        float min = hypot != 0.0f ? 1.0f - Math.min(0.2f / hypot, 0.2f) : 0.8f;
                        ArrayList<dbih> arrayList2 = this.j;
                        dbif a2 = dbih.a();
                        a2.b(new dbeb(f3 * min, 1.0f, f4 * min));
                        a2.b = p;
                        arrayList2.add(a2.a());
                    }
                    short s2 = (short) limit;
                    for (int i2 = 0; i2 < i; i2++) {
                        this.k.add(Integer.valueOf(s2));
                        int i3 = s2 + i2;
                        this.k.add(Integer.valueOf(i3 + 1));
                        this.k.add(Integer.valueOf(i3 + 2));
                    }
                    while (s < limit) {
                        int i4 = s + 1;
                        int i5 = i4 % limit;
                        this.k.add(Integer.valueOf(s));
                        ArrayList<Integer> arrayList3 = this.k;
                        Integer valueOf = Integer.valueOf(i5);
                        arrayList3.add(valueOf);
                        ArrayList<Integer> arrayList4 = this.k;
                        Integer valueOf2 = Integer.valueOf(s + s2);
                        arrayList4.add(valueOf2);
                        this.k.add(valueOf2);
                        this.k.add(valueOf);
                        this.k.add(Integer.valueOf(i5 + s2));
                        s = i4;
                    }
                    f();
                    if (this.f || (dbhlVar = this.i) == null) {
                        return;
                    }
                    this.d.f(dbhlVar);
                    this.f = true;
                    return;
                }
            }
            g();
            return;
        }
        g();
    }

    final void f() {
        dbhh dbhhVar;
        dbhh dbhhVar2;
        List<dbhh> list = this.l.c;
        list.clear();
        if (this.a && (dbhhVar2 = this.m) != null) {
            list.add(dbhhVar2);
        }
        if (this.h && (dbhhVar = this.n) != null) {
            list.add(dbhhVar);
        }
        if (list.isEmpty()) {
            g();
            return;
        }
        dbgt dbgtVar = this.b;
        if (dbgtVar == null) {
            try {
                dbgt dbgtVar2 = dbgt.c().d(this.l).g().get();
                this.b = dbgtVar2;
                dbgtVar2.g(false);
                this.i = this.b.j(this);
            } catch (InterruptedException | ExecutionException unused) {
                throw new AssertionError("Unable to create plane renderable.");
            }
        } else {
            dbgtVar.k(this.l);
        }
        if (this.i == null || list.size() <= 1) {
            return;
        }
        this.i.g(0, 0);
        this.i.g(1, 1);
    }

    public final void g() {
        dbhl dbhlVar;
        if (!this.f || (dbhlVar = this.i) == null) {
            return;
        }
        this.d.g(dbhlVar);
        this.f = false;
    }

    @Override // defpackage.dbdx
    public final dbdz w() {
        return this.e;
    }
}
