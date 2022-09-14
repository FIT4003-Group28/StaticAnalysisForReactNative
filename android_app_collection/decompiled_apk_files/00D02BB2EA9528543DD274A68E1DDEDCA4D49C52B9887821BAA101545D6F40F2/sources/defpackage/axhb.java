package defpackage;
/* compiled from: PG */
/* renamed from: axhb  reason: default package */
/* loaded from: classes3.dex */
public final class axhb extends axhd {
    public final dqac a;

    public axhb(dqac dqacVar) {
        dzvx.c(dqacVar, "peopleFollowInfo");
        this.a = dqacVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof axhb) && dzvx.d(this.a, ((axhb) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        dqac dqacVar = this.a;
        if (dqacVar != null) {
            int i = dqacVar.bC;
            if (i != 0) {
                return i;
            }
            int c = dsst.a.b(dqacVar).c(dqacVar);
            dqacVar.bC = c;
            return c;
        }
        return 0;
    }

    public final String toString() {
        return "WarmUpPeopleFollowInfoEvent(peopleFollowInfo=" + this.a + ")";
    }
}
