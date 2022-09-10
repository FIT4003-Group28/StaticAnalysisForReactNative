package defpackage;

import defpackage.aob;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: aob  reason: default package */
/* loaded from: classes2.dex */
public abstract class aob<T extends aob<T>> implements ann {
    public static final aoa a = new ans();
    public static final aoa b = new ant();
    public static final aoa c = new anu();
    public static final aoa d = new anv();
    public static final aoa e = new anw();
    public static final aoa f = new anr();
    public final Object j;
    final aoc k;
    public final float m;
    float g = 0.0f;
    public float h = Float.MAX_VALUE;
    public boolean i = false;
    public boolean l = false;
    private long n = 0;
    private final ArrayList<any> o = new ArrayList<>();
    private final ArrayList<anz> p = new ArrayList<>();

    public <K> aob(K k, aoc<K> aocVar) {
        this.j = k;
        this.k = aocVar;
        this.m = (aocVar == c || aocVar == d || aocVar == e) ? 0.1f : aocVar == f ? 0.00390625f : (aocVar == a || aocVar == b) ? 0.002f : 1.0f;
    }

    private static <T> void e(ArrayList<T> arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ann
    public final void a(long j) {
        long j2 = this.n;
        if (j2 == 0) {
            this.n = j;
            c(this.h);
            return;
        }
        this.n = j;
        boolean b2 = b(j - j2);
        float min = Math.min(this.h, Float.MAX_VALUE);
        this.h = min;
        float max = Math.max(min, -3.4028235E38f);
        this.h = max;
        c(max);
        if (!b2) {
            return;
        }
        d();
    }

    public abstract boolean b(long j);

    final void c(float f2) {
        ((dabt) this.j).b(f2 / 10000.0f);
        for (int i = 0; i < this.p.size(); i++) {
            if (this.p.get(i) != null) {
                this.p.get(i).a();
            }
        }
        e(this.p);
    }

    public final void d() {
        this.l = false;
        anq a2 = anq.a();
        a2.a.remove(this);
        int indexOf = a2.b.indexOf(this);
        if (indexOf >= 0) {
            a2.b.set(indexOf, null);
            a2.f = true;
        }
        this.n = 0L;
        this.i = false;
        for (int i = 0; i < this.o.size(); i++) {
            if (this.o.get(i) != null) {
                this.o.get(i).a();
            }
        }
        e(this.o);
    }
}
