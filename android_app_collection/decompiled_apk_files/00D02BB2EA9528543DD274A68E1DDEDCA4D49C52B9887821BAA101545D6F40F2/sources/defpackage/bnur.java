package defpackage;
/* compiled from: PG */
/* renamed from: bnur  reason: default package */
/* loaded from: classes.dex */
public class bnur {
    protected volatile bnuw o;
    protected volatile float[] p;
    public boolean q;

    public bnur() {
        this(0, 0);
    }

    public final void m(float f, float f2, float f3, float f4) {
        this.p = new float[]{f, f2, f3, f4};
    }

    public final int n() {
        return ((bnrc) this.o).a;
    }

    public final int o() {
        return ((bnrc) this.o).b;
    }

    public bnur(int i, int i2) {
        this.o = bnuw.c(0, 0);
        this.p = new float[4];
        this.q = false;
        this.o = bnuw.c(i, i2);
        m(0.0f, 0.0f, 0.0f, 1.0f);
    }
}
