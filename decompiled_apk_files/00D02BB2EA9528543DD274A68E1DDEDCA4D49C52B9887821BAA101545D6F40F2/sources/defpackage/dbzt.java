package defpackage;

import java.io.Serializable;
import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbzt  reason: default package */
/* loaded from: classes5.dex */
public final class dbzt<T> extends dclu<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<T> a;

    public dbzt(Comparator<T> comparator) {
        dbsk.s(comparator);
        this.a = comparator;
    }

    @Override // defpackage.dclu, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.a.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dbzt)) {
            return false;
        }
        return this.a.equals(((dbzt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
