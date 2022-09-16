package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: amyj  reason: default package */
/* loaded from: classes.dex */
final class amyj extends amxr implements Serializable {
    private static final long serialVersionUID = 0;
    final amxr a;

    public amyj(amxr amxrVar) {
        this.a = amxrVar;
    }

    @Override // defpackage.amxr
    public final amxr a() {
        return this.a;
    }

    @Override // defpackage.amxr, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof amyj)) {
            return false;
        }
        return this.a.equals(((amyj) obj).a);
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
