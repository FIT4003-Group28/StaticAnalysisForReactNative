package defpackage;
/* compiled from: PG */
/* renamed from: audr  reason: default package */
/* loaded from: classes2.dex */
public final class audr implements atnb {
    private final cqtd[] a = new cqtd[16];
    private final int[] b = new int[16];

    public audr(audq audqVar) {
        for (int i = 0; i < 16; i++) {
            cqtd[] cqtdVarArr = this.a;
            cqtd cqtdVar = audqVar.a[i];
            dbsk.s(cqtdVar);
            cqtdVarArr[i] = cqtdVar;
            this.b[i] = audqVar.b[i];
        }
    }

    public static int c(boolean z, boolean z2, boolean z3, boolean z4) {
        int i = 0;
        int i2 = (true != z ? 0 : 8) + (true != z2 ? 0 : 4);
        if (true == z3) {
            i = 2;
        }
        return i2 + i + (z4 ? 1 : 0);
    }

    @Override // defpackage.atnb
    public final cqtd a(boolean z, boolean z2, boolean z3) {
        return this.a[c(z, false, z2, z3)];
    }

    @Override // defpackage.atnb
    public final int b(boolean z, boolean z2, boolean z3) {
        return this.b[c(false, z, z2, z3)];
    }
}
