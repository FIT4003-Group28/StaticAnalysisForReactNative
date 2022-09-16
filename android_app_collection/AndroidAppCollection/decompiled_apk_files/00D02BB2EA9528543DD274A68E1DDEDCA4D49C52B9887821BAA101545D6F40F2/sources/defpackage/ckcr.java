package defpackage;
/* compiled from: PG */
/* renamed from: ckcr  reason: default package */
/* loaded from: classes.dex */
public final class ckcr {
    @dzsi
    public final cnkq a;

    public ckcr() {
        this(null);
    }

    public ckcr(@dzsi cnkq cnkqVar) {
        this.a = cnkqVar;
    }

    public final ckcq a() {
        cnkq cnkqVar = this.a;
        if (cnkqVar != null) {
            return new ckcq(new cnkp(cnkqVar, cnkqVar));
        }
        return new ckcq(null);
    }

    public final String toString() {
        cnkq cnkqVar = this.a;
        return cnkqVar == null ? "" : cnkqVar.toString();
    }
}
