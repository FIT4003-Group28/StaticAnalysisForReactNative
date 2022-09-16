package defpackage;
/* compiled from: PG */
/* renamed from: dcqk  reason: default package */
/* loaded from: classes.dex */
final class dcqk extends dcrp {
    public Object[] a = new Object[8];
    public int b = 0;

    @Override // defpackage.dcrp
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dcrp
    public final dcqy<?> b(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException();
        }
        return (dcqy) this.a[i + i];
    }

    @Override // defpackage.dcrp
    public final Object c(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException();
        }
        return this.a[i + i + 1];
    }

    public final int d(dcqy<?> dcqyVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(dcqyVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.dcrp
    public final <T> T e(dcqy<T> dcqyVar) {
        int d = d(dcqyVar);
        if (d != -1) {
            return dcqyVar.c(this.a[d + d + 1]);
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(b(i));
            sb.append("': ");
            sb.append(c(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
