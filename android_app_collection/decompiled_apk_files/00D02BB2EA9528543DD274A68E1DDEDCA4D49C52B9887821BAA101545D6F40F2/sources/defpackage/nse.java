package defpackage;
/* compiled from: PG */
/* renamed from: nse  reason: default package */
/* loaded from: classes7.dex */
final class nse {
    final cqtv a;
    final cqtv b;
    @dzsi
    final nse c;
    private final int d;

    public nse(cqtv cqtvVar, int i, @dzsi nse nseVar) {
        if (nseVar != null) {
            dbsk.m(i > nseVar.d, "targetScreenSizeDp values for a list of FlexDimensionNode must be strictly ascending");
        }
        this.a = cqtvVar;
        this.d = i;
        this.b = cqrp.d(i);
        this.c = nseVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(@dzsi nse nseVar) {
        if (nseVar == null || !this.a.equals(nseVar.a) || !this.b.equals(nseVar.b)) {
            return false;
        }
        nse nseVar2 = this.c;
        nse nseVar3 = nseVar.c;
        if (nseVar2 != null) {
            return nseVar2.a(nseVar3);
        }
        return nseVar3 == null;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof nse)) {
            return false;
        }
        return a((nse) obj);
    }

    public final int hashCode() {
        int hashCode = ((cqrp) this.b).a + this.a.hashCode();
        nse nseVar = this.c;
        return nseVar == null ? hashCode : (hashCode * 31) + nseVar.hashCode();
    }
}
