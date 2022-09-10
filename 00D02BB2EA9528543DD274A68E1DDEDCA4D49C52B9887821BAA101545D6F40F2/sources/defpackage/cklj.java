package defpackage;

import java.util.Collection;
/* compiled from: PG */
/* renamed from: cklj  reason: default package */
/* loaded from: classes4.dex */
public final class cklj {
    private static final dcqe e = dcqe.c("cklj");
    public final int a;
    public final int b;
    private final cqiv f;
    private final dzjw g = new dzjw();
    public final zx c = new cklh(this);
    public final abp d = new ckli(this);
    private int h = 0;

    public cklj(cqiv cqivVar, int i, int i2) {
        this.f = cqivVar;
        this.a = i;
        this.b = i2;
    }

    private final <T extends cqkp> void e(cqiw<? super T> cqiwVar, T t, int i) {
        this.g.b(i);
        this.f.a(cqiwVar, t);
    }

    public final <T extends cqkp> void a(cqiw<? super T> cqiwVar, T t) {
        e(cqiwVar, t, this.h);
        this.h++;
    }

    public final <T extends cqkp> void b(cqiw<T> cqiwVar, Collection<? extends T> collection) {
        for (T t : collection) {
            a(cqiwVar, t);
        }
    }

    public final int c(int i) {
        dzjw dzjwVar = this.g;
        if (dzjwVar.b <= i) {
            bvoo.h("Failed to get a grid position for item @ %d but the layout only have %d items.", Integer.valueOf(i), Integer.valueOf(this.g.b));
            return 0;
        }
        return dzjwVar.get(i).intValue();
    }

    public final <T extends cqkp> void d(cqiw<? super T> cqiwVar, T t) {
        e(cqiwVar, t, -1);
        this.h = 0;
    }
}
