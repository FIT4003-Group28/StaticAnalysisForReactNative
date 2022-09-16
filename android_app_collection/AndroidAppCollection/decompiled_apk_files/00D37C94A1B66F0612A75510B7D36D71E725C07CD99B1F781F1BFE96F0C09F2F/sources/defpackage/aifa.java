package defpackage;
/* compiled from: PG */
/* renamed from: aifa  reason: default package */
/* loaded from: classes.dex */
public final class aifa extends aiel {
    private final aiez a = new aiez(this);
    private final int[] b;
    private aiev c;

    public aifa() {
        int[] iArr = aiev.d;
        this.b = new int[3];
    }

    public final synchronized int a() {
        int[] iArr;
        iArr = this.b;
        int[] iArr2 = aiev.d;
        return iArr[2];
    }

    public final synchronized int b(int i, int i2) {
        return this.b[i] + i2;
    }

    public final synchronized void c(aiev aievVar) {
        aiev aievVar2 = this.c;
        if (aievVar2 == aievVar) {
            return;
        }
        if (aievVar2 != null) {
            aievVar2.j(this.a);
            int a = a();
            if (a > 0) {
                this.a.e(0, a);
            }
        }
        this.c = aievVar;
        d();
        if (this.c == null) {
            return;
        }
        int a2 = a();
        if (a2 > 0) {
            this.a.d(0, a2);
        }
        this.c.e(this.a);
    }

    public final synchronized void d() {
        int[] iArr = aiev.d;
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = iArr[i2];
            aiev aievVar = this.c;
            i += aievVar != null ? aievVar.b(i3) : 0;
            this.b[i3 + 1] = i;
        }
    }

    @Override // defpackage.ymz
    public final void h(int i, int i2) {
        throw null;
    }
}
