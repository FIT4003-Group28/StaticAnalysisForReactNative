package defpackage;
/* compiled from: PG */
/* renamed from: ea  reason: default package */
/* loaded from: classes6.dex */
public final class ea {
    public float d;
    public int h;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public final float[] e = new float[6];
    dv[] f = new dv[8];
    int g = 0;

    public ea(int i) {
        this.h = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(dv dvVar) {
        int i = 0;
        for (int i2 = 0; i2 < this.g; i2++) {
            if (this.f[i2] == dvVar) {
                while (true) {
                    int i3 = this.g;
                    if (i >= (i3 - i2) - 1) {
                        this.g = i3 - 1;
                        return;
                    }
                    dv[] dvVarArr = this.f;
                    int i4 = i2 + i;
                    dvVarArr[i4] = dvVarArr[i4 + 1];
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
        return "" + ((String) null);
    }
}