package defpackage;

import java.util.List;
/* renamed from: cqyb  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cqyb implements dbrn {
    static final dbrn a = new cqyb();

    private cqyb() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dcen N = dcep.N();
        for (dsyl dsylVar : (List) obj) {
            if (dsylVar != null) {
                N.b(dsylVar);
            }
        }
        return N.f();
    }
}
