package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amsz  reason: default package */
/* loaded from: classes.dex */
public abstract class amsz implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable b;

    public amsz(Comparable comparable) {
        this.b = comparable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amsz f(Comparable comparable) {
        return new amsy(comparable);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(amsz amszVar) {
        if (amszVar != amsx.a) {
            if (amszVar == amsv.a) {
                return -1;
            }
            int b = amxt.b(this.b, amszVar.b);
            return b != 0 ? b : anhh.b(this instanceof amsw, amszVar instanceof amsw);
        }
        return 1;
    }

    public Comparable b() {
        return this.b;
    }

    public abstract void c(StringBuilder sb);

    public abstract void d(StringBuilder sb);

    public abstract boolean e(Comparable comparable);

    public final boolean equals(Object obj) {
        if (obj instanceof amsz) {
            try {
                if (compareTo((amsz) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
