package defpackage;
/* compiled from: PG */
/* renamed from: azvg  reason: default package */
/* loaded from: classes2.dex */
public abstract class azvg extends azur {
    private long b;
    public azxl d;
    private boolean e;

    private static final long k(boolean z) {
        return z ? 4294967296L : 1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Thread c();

    public final void e(azvb azvbVar) {
        azxl azxlVar = this.d;
        if (azxlVar == null) {
            azxlVar = new azxl();
            this.d = azxlVar;
        }
        Object[] objArr = azxlVar.a;
        int i = azxlVar.c;
        objArr[i] = azvbVar;
        int length = objArr.length;
        int i2 = (i + 1) & (length - 1);
        azxlVar.c = i2;
        int i3 = azxlVar.b;
        if (i2 == i3) {
            Object[] objArr2 = new Object[length + length];
            azqn.h(objArr, objArr2, 0, i3, 0, 10);
            Object[] objArr3 = azxlVar.a;
            int length2 = objArr3.length;
            int i4 = azxlVar.b;
            azqn.h(objArr3, objArr2, length2 - i4, 0, i4, 4);
            azxlVar.a = objArr2;
            azxlVar.b = 0;
            azxlVar.c = length;
        }
    }

    public final void f(boolean z) {
        this.b += k(z);
        if (!z) {
            this.e = true;
        }
    }

    protected void g() {
        throw null;
    }

    public final boolean h() {
        return this.b >= k(true);
    }

    public final void j() {
        long k = this.b - k(true);
        this.b = k;
        if (k > 0) {
            return;
        }
        boolean z = azuy.a;
        if (!this.e) {
            return;
        }
        g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    public final boolean i() {
        azxl azxlVar = this.d;
        if (azxlVar == null) {
            return false;
        }
        int i = azxlVar.b;
        azvb azvbVar = null;
        if (i != azxlVar.c) {
            ?? r3 = azxlVar.a;
            ?? r6 = r3[i];
            r3[i] = 0;
            azxlVar.b = (i + 1) & (r3.length - 1);
            if (r6 == 0) {
                throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
            azvbVar = r6;
        }
        azvb azvbVar2 = azvbVar;
        if (azvbVar2 == null) {
            return false;
        }
        azvbVar2.run();
        return true;
    }
}
