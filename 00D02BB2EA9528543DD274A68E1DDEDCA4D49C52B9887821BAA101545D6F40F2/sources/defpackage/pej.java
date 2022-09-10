package defpackage;

import android.os.Bundle;
import android.util.Base64;
/* compiled from: PG */
/* renamed from: pej  reason: default package */
/* loaded from: classes7.dex */
public final class pej implements pai {
    private final dxio<azfb> a;

    public pej(dxio<azfb> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.pai
    public final boolean a(Bundle bundle) {
        if (!bundle.containsKey("social_planning")) {
            return false;
        }
        String string = bundle.getString("social_planning");
        dbsk.s(string);
        try {
            dliz dlizVar = (dliz) dsqw.cq(dliz.b, Base64.decode(string, 1));
            dpov dpovVar = dpov.f;
            dpov dpovVar2 = dlizVar.a;
            if (dpovVar2 == null) {
                dpovVar2 = dpov.f;
            }
            if (dpovVar.equals(dpovVar2)) {
                return false;
            }
            azfb a = this.a.a();
            dpov dpovVar3 = dlizVar.a;
            if (dpovVar3 == null) {
                dpovVar3 = dpov.f;
            }
            a.b(dpovVar3);
            return true;
        } catch (dsrm unused) {
            return false;
        }
    }
}
