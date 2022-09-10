package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: axgs  reason: default package */
/* loaded from: classes3.dex */
public final class axgs extends axgu {
    public final List<String> a;
    public final dqac b;

    public axgs(List<String> list, dqac dqacVar) {
        dzvx.c(list, "requestedUsers");
        this.a = list;
        this.b = dqacVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof axgs)) {
                return false;
            }
            axgs axgsVar = (axgs) obj;
            return dzvx.d(this.a, axgsVar.a) && dzvx.d(this.b, axgsVar.b);
        }
        return true;
    }

    public final int hashCode() {
        List<String> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        dqac dqacVar = this.b;
        if (dqacVar != null && (i = dqacVar.bC) == 0) {
            i = dsst.a.b(dqacVar).c(dqacVar);
            dqacVar.bC = i;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Failure(requestedUsers=" + this.a + ", fallbackData=" + this.b + ")";
    }
}
