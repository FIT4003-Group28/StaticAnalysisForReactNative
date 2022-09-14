package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: bafw  reason: default package */
/* loaded from: classes3.dex */
final class bafw implements Comparator<bayj> {
    private final Comparator<bayj> a;

    public bafw(Comparator<bayj> comparator) {
        this.a = comparator;
    }

    @dzsi
    private static dndr a(bayj bayjVar) {
        if (bayjVar instanceof bayu) {
            return ((bayu) bayjVar).w();
        }
        if (!(bayjVar instanceof bayx)) {
            return null;
        }
        return ((bayx) bayjVar).u();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(bayj bayjVar, bayj bayjVar2) {
        bayj bayjVar3 = bayjVar;
        bayj bayjVar4 = bayjVar2;
        dndr a = a(bayjVar3);
        dndr a2 = a(bayjVar4);
        if (a != dndr.HOME) {
            if (a2 == dndr.HOME) {
                return 1;
            }
            if (a != dndr.WORK) {
                if (a2 != dndr.WORK) {
                    return this.a.compare(bayjVar3, bayjVar4);
                }
                return 1;
            }
        }
        return -1;
    }
}
