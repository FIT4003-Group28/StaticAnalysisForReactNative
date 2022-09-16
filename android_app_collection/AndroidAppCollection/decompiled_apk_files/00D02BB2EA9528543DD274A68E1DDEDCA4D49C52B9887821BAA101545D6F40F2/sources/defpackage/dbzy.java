package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbzy  reason: default package */
/* loaded from: classes5.dex */
public final class dbzy<T> extends dclu<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<? super T>[] a;

    public dbzy(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.a = new Comparator[]{comparator, comparator2};
    }

    @Override // defpackage.dclu, java.util.Comparator
    public final int compare(T t, T t2) {
        for (int i = 0; i < 2; i++) {
            int compare = this.a[i].compare(t, t2);
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dbzy)) {
            return false;
        }
        return Arrays.equals(this.a, ((dbzy) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 19);
        sb.append("Ordering.compound(");
        sb.append(arrays);
        sb.append(")");
        return sb.toString();
    }
}
