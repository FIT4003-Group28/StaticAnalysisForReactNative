package defpackage;
/* compiled from: PG */
/* renamed from: dfv  reason: default package */
/* loaded from: classes6.dex */
final class dfv {
    public int a = 1;
    private float b;
    private float c;

    public final void a(float f, float f2) {
        if (this.b == f && this.c == f2) {
            return;
        }
        this.b = f;
        this.c = f2;
        b();
    }

    public final void b() {
        this.a = 1;
    }

    public final boolean c() {
        return this.a == 2;
    }

    public final void d(float f) {
        float f2 = this.b;
        int i = this.a;
        int i2 = i - 1;
        if (i != 0) {
            float f3 = 0.0f;
            int i3 = 2;
            if (i2 != 0) {
                if (i2 == 1) {
                    f3 = this.c;
                } else if (i2 == 2) {
                    f3 = -this.c;
                }
            }
            if (f >= f2 + f3) {
                i3 = 3;
            }
            this.a = i3;
            return;
        }
        throw null;
    }
}
