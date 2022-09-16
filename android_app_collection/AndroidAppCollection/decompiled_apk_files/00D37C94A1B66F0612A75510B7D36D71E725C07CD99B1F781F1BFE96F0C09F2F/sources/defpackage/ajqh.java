package defpackage;
/* compiled from: PG */
/* renamed from: ajqh  reason: default package */
/* loaded from: classes.dex */
public final class ajqh extends ajqd {
    public final ajqm a;
    public int b;

    public ajqh(ajqm ajqmVar) {
        ajqmVar.getClass();
        this.a = ajqmVar;
        this.b = Integer.MAX_VALUE;
        ajqmVar.lT(new ajqg(this));
    }

    @Override // defpackage.ajqm
    public final int a() {
        return Math.min(this.b, ((ync) this.a).size());
    }

    @Override // defpackage.ajqm
    public final long b(int i) {
        if (i < 0 || i >= a()) {
            return 0L;
        }
        return i;
    }

    @Override // defpackage.ajqm
    public final Object c(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return ((ync) this.a).get(i);
    }

    @Override // defpackage.ajqm
    public final boolean contains(Object obj) {
        throw null;
    }

    public final void h(int i) {
        ylr.c();
        if (this.b != i) {
            int size = ((ync) this.a).size();
            int min = Math.min(this.b, size);
            int min2 = Math.min(i, size);
            this.b = i;
            if (min == min2) {
                return;
            }
            if (min2 > min) {
                y(min, min2 - min);
            } else {
                z(min2, min - min2);
            }
        }
    }

    @Override // defpackage.ajqm
    public final boolean isEmpty() {
        return a() == 0;
    }
}
