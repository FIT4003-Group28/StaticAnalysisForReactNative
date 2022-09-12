package defpackage;
/* compiled from: PG */
/* renamed from: deik  reason: default package */
/* loaded from: classes6.dex */
public final class deik<L> extends deim<L> {
    private final Object[] b;

    public deik() {
        dbsk.b(true, "Stripes must be <= 2^30)");
        this.b = new Object[this.a + 1];
        int i = 0;
        while (true) {
            Object[] objArr = this.b;
            if (i < objArr.length) {
                objArr[i] = deij.b();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dein
    public final L a(int i) {
        return (L) this.b[i];
    }

    @Override // defpackage.dein
    public final int b() {
        return this.b.length;
    }
}
