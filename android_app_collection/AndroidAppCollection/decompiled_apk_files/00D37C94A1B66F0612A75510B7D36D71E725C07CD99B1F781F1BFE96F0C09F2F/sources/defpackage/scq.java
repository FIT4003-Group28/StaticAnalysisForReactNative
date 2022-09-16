package defpackage;
/* compiled from: PG */
/* renamed from: scq  reason: default package */
/* loaded from: classes4.dex */
public final class scq {
    public int a;
    public int[] b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public boolean h;

    public scq(int i) {
        this.a = 0;
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.b = new int[i];
        this.c = new int[i];
        this.d = new int[i];
        this.e = new int[i];
    }

    public scq(scr scrVar) {
        this.a = 0;
        this.h = false;
        this.b = scrVar.a;
        int i = scrVar.b;
        this.f = i;
        this.g = i;
    }

    public final void a(int i, int i2, int i3) {
        sho.c(!b(), "Attempt to add target after animation is complete.");
        int[] iArr = this.b;
        int i4 = this.f;
        iArr[i4] = i2;
        this.d[i4] = i;
        this.e[i4] = i3;
        this.h = (i != i2) | this.h;
        this.c[i4] = i;
        this.f = i4 + 1;
        if (i3 != 0) {
            this.g++;
        }
    }

    public final boolean b() {
        return this.c == null;
    }

    public final void c() {
        this.a = 0;
        if (!b()) {
            System.arraycopy(this.d, 0, this.c, 0, this.f);
        }
    }
}
