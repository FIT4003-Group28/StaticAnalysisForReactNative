package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: blc  reason: default package */
/* loaded from: classes3.dex */
public abstract class blc<K, A> {
    public bpv<A> d;
    private final List<? extends bpt<K>> e;
    private bpt<K> f;
    private bpt<K> g;
    final List<blb> a = new ArrayList(1);
    public boolean b = false;
    public float c = 0.0f;
    private float h = -1.0f;
    private A i = null;
    private float j = -1.0f;
    private float k = -1.0f;

    public blc(List<? extends bpt<K>> list) {
        this.e = list;
    }

    private final float j() {
        float f = this.j;
        if (f == -1.0f) {
            f = this.e.isEmpty() ? 0.0f : this.e.get(0).b();
            this.j = f;
        }
        return f;
    }

    public final void a(blb blbVar) {
        this.a.add(blbVar);
    }

    public void b(float f) {
        if (this.e.isEmpty()) {
            return;
        }
        bpt<K> d = d();
        if (f < j()) {
            f = j();
        } else if (f > g()) {
            f = g();
        }
        if (f == this.c) {
            return;
        }
        this.c = f;
        bpt<K> d2 = d();
        if (d == d2 && d2.d()) {
            return;
        }
        c();
    }

    public void c() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    public final bpt<K> d() {
        List<? extends bpt<K>> list;
        bpt<K> bptVar = this.f;
        if (bptVar == null || !bptVar.e(this.c)) {
            bpt<K> bptVar2 = this.e.get(list.size() - 1);
            if (this.c < bptVar2.b()) {
                int size = this.e.size();
                do {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    bptVar2 = this.e.get(size);
                } while (!bptVar2.e(this.c));
            }
            this.f = bptVar2;
            bim.a();
            return bptVar2;
        }
        bim.a();
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float e() {
        if (this.b) {
            return 0.0f;
        }
        bpt<K> d = d();
        if (!d.d()) {
            return (this.c - d.b()) / (d.c() - d.b());
        }
        return 0.0f;
    }

    public final float f() {
        bpt<K> d = d();
        if (d.d()) {
            return 0.0f;
        }
        return d.d.getInterpolation(e());
    }

    public float g() {
        float f = this.k;
        if (f == -1.0f) {
            if (this.e.isEmpty()) {
                f = 1.0f;
            } else {
                List<? extends bpt<K>> list = this.e;
                f = list.get(list.size() - 1).c();
            }
            this.k = f;
        }
        return f;
    }

    public A h() {
        bpt<K> d = d();
        float f = f();
        if (this.d == null && d == this.g && this.h == f) {
            return this.i;
        }
        this.g = d;
        this.h = f;
        A i = i(d, f);
        this.i = i;
        return i;
    }

    public abstract A i(bpt<K> bptVar, float f);
}
