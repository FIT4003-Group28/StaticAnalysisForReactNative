package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: amsb  reason: default package */
/* loaded from: classes.dex */
public final class amsb extends amxr implements Serializable {
    private static final long serialVersionUID = 0;
    final ampg a;
    final amxr b;

    public amsb(ampg ampgVar, amxr amxrVar) {
        this.a = ampgVar;
        this.b = amxrVar;
    }

    @Override // defpackage.amxr, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.b.compare(this.a.apply(obj), this.a.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amsb) {
            amsb amsbVar = (amsb) obj;
            if (this.a.equals(amsbVar.a) && this.b.equals(amsbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
