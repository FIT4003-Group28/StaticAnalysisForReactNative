package defpackage;
/* compiled from: PG */
/* renamed from: anad  reason: default package */
/* loaded from: classes.dex */
final class anad extends anbj {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a(anas anasVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(anasVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.anbj
    public final int b() {
        return this.b;
    }

    @Override // defpackage.anbj
    public final anas c(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException();
        }
        return (anas) this.a[i + i];
    }

    @Override // defpackage.anbj
    public final Object d(anas anasVar) {
        int a = a(anasVar);
        if (a != -1) {
            return anasVar.d(this.a[a + a + 1]);
        }
        return null;
    }

    @Override // defpackage.anbj
    public final Object e(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException();
        }
        return this.a[i + i + 1];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(c(i));
            sb.append("': ");
            sb.append(e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
