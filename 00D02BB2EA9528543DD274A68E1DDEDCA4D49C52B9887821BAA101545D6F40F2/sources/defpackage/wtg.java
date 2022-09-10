package defpackage;

import java.util.Map;
/* renamed from: wtg  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class wtg implements dbrn {
    public static final dbrn a = new wtg();

    private wtg() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        Map map = (Map) obj;
        dcen N = dcep.N();
        if (map != null) {
            for (bxzt bxztVar : map.values()) {
                if (bxztVar.b() == bxzs.CONSENT_STATUS_ACCEPTED) {
                    N.b(bxztVar.a());
                }
            }
        }
        return N.f();
    }
}
