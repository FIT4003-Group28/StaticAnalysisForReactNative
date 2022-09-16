package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: xko  reason: default package */
/* loaded from: classes7.dex */
final class xko extends xkv {
    private final Set<String> a;
    private final akte b;
    private final List<akta> c;

    public xko(Set<String> set, akte akteVar, List<akta> list) {
        this.a = set;
        if (akteVar != null) {
            this.b = akteVar;
            if (list != null) {
                this.c = list;
                return;
            }
            throw new NullPointerException("Null measles");
        }
        throw new NullPointerException("Null polyline");
    }

    @Override // defpackage.xkv
    public final Set<String> a() {
        return this.a;
    }

    @Override // defpackage.xkv
    public final akte b() {
        return this.b;
    }

    @Override // defpackage.xkv
    public final List<akta> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xkv) {
            xkv xkvVar = (xkv) obj;
            if (this.a.equals(xkvVar.a()) && this.b.equals(xkvVar.b()) && this.c.equals(xkvVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 57 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DrawnLeadingPolyline{vehicleTokens=");
        sb.append(valueOf);
        sb.append(", polyline=");
        sb.append(valueOf2);
        sb.append(", measles=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
