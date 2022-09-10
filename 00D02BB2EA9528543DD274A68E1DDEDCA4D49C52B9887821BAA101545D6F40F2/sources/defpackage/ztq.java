package defpackage;
/* compiled from: PG */
/* renamed from: ztq  reason: default package */
/* loaded from: classes7.dex */
public final class ztq {
    private static final dcqe c = dcqe.c("ztq");
    private static final float[] d = new float[0];
    protected float[] a = d;
    protected int b = 0;

    public final void a(int i, float f) {
        if (i < 0 || i > b()) {
            bvoo.h("Expected stopId in range (0 ... %d), but was %d", Integer.valueOf(b()), Integer.valueOf(i));
        } else {
            this.a[i] = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int b() {
        return this.b - 1;
    }
}
