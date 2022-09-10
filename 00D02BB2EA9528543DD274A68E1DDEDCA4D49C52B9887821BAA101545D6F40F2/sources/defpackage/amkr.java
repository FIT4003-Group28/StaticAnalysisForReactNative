package defpackage;
/* compiled from: PG */
/* renamed from: amkr  reason: default package */
/* loaded from: classes2.dex */
final class amkr implements Comparable<amkr> {
    public eaol a = new eaol(0);
    public final akra b;
    private final akqi c;

    public amkr(akqi akqiVar, akra akraVar) {
        this.c = akqiVar;
        this.b = akraVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(amkr amkrVar) {
        return this.a.compareTo(amkrVar.a);
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof amkr)) {
            return false;
        }
        if (obj != this) {
            return this.c.equals(((amkr) obj).c);
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
