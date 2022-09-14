package defpackage;

import android.content.Intent;
import java.util.ArrayList;
/* renamed from: aukx  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aukx implements dbrn {
    static final dbrn a = new aukx();

    private aukx() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dbsg<dlgf> f = aulh.f(((cvkg) obj).l());
        if (f.a()) {
            dplx dplxVar = f.b().f;
            if (dplxVar == null) {
                dplxVar = dplx.g;
            }
            return auhz.a(dplxVar, new ArrayList());
        }
        return new Intent();
    }
}
