package defpackage;
/* compiled from: PG */
/* renamed from: ki  reason: default package */
/* loaded from: classes3.dex */
public final class ki {
    private int a;
    private int b;

    public final int a() {
        return this.a | this.b;
    }

    public final void b(int i, int i2) {
        if (i2 == 1) {
            this.b = i;
        } else {
            this.a = i;
        }
    }

    public final void c(int i) {
        if (i == 1) {
            this.b = 0;
        } else {
            this.a = 0;
        }
    }

    public final void d(int i) {
        b(i, 0);
    }
}
