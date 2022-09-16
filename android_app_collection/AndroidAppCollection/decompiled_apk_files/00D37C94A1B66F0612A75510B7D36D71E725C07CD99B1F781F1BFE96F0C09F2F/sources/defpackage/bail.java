package defpackage;
/* compiled from: PG */
/* renamed from: bail  reason: default package */
/* loaded from: classes2.dex */
public abstract class bail implements baih {
    @Override // defpackage.baih
    public final int a(bahx bahxVar) {
        int a = e().a(bahxVar);
        if (a == -1) {
            return 0;
        }
        return b(a);
    }

    @Override // defpackage.baih
    public final int c() {
        return e().b();
    }

    @Override // defpackage.baih
    public final bahx d(int i) {
        return e().b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof baih)) {
            return false;
        }
        baih baihVar = (baih) obj;
        if (c() != baihVar.c()) {
            return false;
        }
        int c = c();
        for (int i = 0; i < c; i++) {
            if (b(i) != baihVar.b(i) || d(i) != baihVar.d(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int c = c();
        int i = 17;
        for (int i2 = 0; i2 < c; i2++) {
            i = (((i * 27) + b(i2)) * 27) + d(i2).hashCode();
        }
        return i;
    }

    public final String toString() {
        return banl.g().a(this);
    }
}
