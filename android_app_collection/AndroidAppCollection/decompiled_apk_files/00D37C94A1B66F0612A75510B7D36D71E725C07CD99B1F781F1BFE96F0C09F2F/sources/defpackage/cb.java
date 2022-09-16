package defpackage;
/* compiled from: PG */
/* renamed from: cb  reason: default package */
/* loaded from: classes2.dex */
public final class cb {
    public float d;
    public int h;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public final float[] e = new float[6];
    bw[] f = new bw[8];
    int g = 0;

    public cb(int i) {
        this.h = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(bw bwVar) {
        int i = 0;
        for (int i2 = 0; i2 < this.g; i2++) {
            if (this.f[i2] == bwVar) {
                while (true) {
                    int i3 = this.g;
                    if (i >= (i3 - i2) - 1) {
                        this.g = i3 - 1;
                        return;
                    }
                    bw[] bwVarArr = this.f;
                    int i4 = i2 + i;
                    bwVarArr[i4] = bwVarArr[i4 + 1];
                    i++;
                }
            }
        }
    }

    public final void b() {
        this.h = 5;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.g = 0;
    }

    public final String toString() {
        return "null";
    }
}
