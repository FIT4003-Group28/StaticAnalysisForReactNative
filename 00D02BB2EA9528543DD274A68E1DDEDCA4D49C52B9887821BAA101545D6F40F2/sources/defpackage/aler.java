package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: aler  reason: default package */
/* loaded from: classes2.dex */
public abstract class aler {
    public final akxa a;
    protected final akvz b;
    private final SparseArray<akuh> c = new SparseArray<>();

    public aler(akpm akpmVar) {
        this.a = new akxa(akpmVar.aj().aF());
        this.b = akpmVar.aj().aE();
    }

    protected abstract akuh a(int i);

    public final akte c(akrk akrkVar, int i) {
        return d(akrkVar, i, 0);
    }

    public final akte d(akrk akrkVar, int i, int i2) {
        return this.a.c(akrkVar.q(), f(i), 0, i2, 2, 2, 1);
    }

    public final void e() {
        for (int i = 0; i < this.c.size(); i++) {
            this.b.j(this.c.valueAt(i));
        }
        this.c.clear();
    }

    public final akuh f(int i) {
        akuh akuhVar = this.c.get(i);
        if (akuhVar == null) {
            akuh a = a(i);
            this.c.put(i, a);
            return a;
        }
        return akuhVar;
    }
}
