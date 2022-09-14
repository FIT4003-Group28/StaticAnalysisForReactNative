package defpackage;
/* compiled from: PG */
/* renamed from: axgz  reason: default package */
/* loaded from: classes3.dex */
public final class axgz extends axhd {
    public final dqac a;

    public axgz(dqac dqacVar) {
        dzvx.c(dqacVar, "peopleFollowInfo");
        this.a = dqacVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof axgz) && dzvx.d(this.a, ((axgz) obj).a);
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
        return "UpdatePeopleFollowInfoEvent(peopleFollowInfo=" + this.a + ")";
    }
}
