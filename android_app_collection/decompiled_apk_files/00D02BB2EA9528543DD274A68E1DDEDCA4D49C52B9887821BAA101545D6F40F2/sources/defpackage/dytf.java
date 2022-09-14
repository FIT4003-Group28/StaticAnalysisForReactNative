package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dytf  reason: default package */
/* loaded from: classes6.dex */
public final class dytf extends dygz {
    public final dyet a;
    public final dyhw b;
    public final dyib<?, ?> c;

    public dytf(dyib<?, ?> dyibVar, dyhw dyhwVar, dyet dyetVar) {
        dbsk.t(dyibVar, "method");
        this.c = dyibVar;
        dbsk.t(dyhwVar, "headers");
        this.b = dyhwVar;
        dbsk.t(dyetVar, "callOptions");
        this.a = dyetVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dytf dytfVar = (dytf) obj;
            if (dbsd.a(this.a, dytfVar.a) && dbsd.a(this.b, dytfVar.b) && dbsd.a(this.c, dytfVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.a);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 31 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("[method=");
        sb.append(valueOf);
        sb.append(" headers=");
        sb.append(valueOf2);
        sb.append(" callOptions=");
        sb.append(valueOf3);
        sb.append("]");
        return sb.toString();
    }
}
