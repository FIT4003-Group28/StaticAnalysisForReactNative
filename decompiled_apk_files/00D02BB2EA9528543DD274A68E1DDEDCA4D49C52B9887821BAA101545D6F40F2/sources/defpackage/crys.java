package defpackage;

import java.util.Comparator;
/* renamed from: crys  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class crys implements Comparator {
    static final Comparator a = new crys();

    private crys() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        crym crymVar = (crym) obj;
        crym crymVar2 = (crym) obj2;
        return dbzx.b.a(crymVar.a(), crymVar2.a()).e(crymVar2.b(), crymVar.b()).i();
    }
}
