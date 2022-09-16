package defpackage;
/* compiled from: PG */
/* renamed from: azob  reason: default package */
/* loaded from: classes2.dex */
public class azob extends aznz {
    private static final long serialVersionUID = -2151279923272604993L;
    protected final bame f;
    protected Object g;

    public azob(bame bameVar) {
        this.f = bameVar;
    }

    @Override // defpackage.ayrn
    public final void d() {
        lazySet(32);
        this.g = null;
    }

    public final void g(Object obj) {
        int i = get();
        while (i != 8) {
            if ((i & (-3)) != 0) {
                return;
            }
            if (i != 2) {
                this.g = obj;
                if (compareAndSet(0, 1)) {
                    return;
                }
                i = get();
                if (i == 4) {
                    this.g = null;
                    return;
                }
            } else {
                lazySet(3);
                bame bameVar = this.f;
                bameVar.c(obj);
                if (get() == 4) {
                    return;
                }
                bameVar.sm();
                return;
            }
        }
        this.g = obj;
        lazySet(16);
        bame bameVar2 = this.f;
        bameVar2.c(obj);
        if (get() != 4) {
            bameVar2.sm();
        }
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return get() != 16;
    }

    public void si() {
        set(4);
        this.g = null;
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        if ((i & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        if (get() == 16) {
            lazySet(32);
            Object obj = this.g;
            this.g = null;
            return obj;
        }
        return null;
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        Object obj;
        if (azof.h(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.g) == null) {
                        return;
                    }
                    this.g = null;
                    bame bameVar = this.f;
                    bameVar.c(obj);
                    if (get() == 4) {
                        return;
                    }
                    bameVar.sm();
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
