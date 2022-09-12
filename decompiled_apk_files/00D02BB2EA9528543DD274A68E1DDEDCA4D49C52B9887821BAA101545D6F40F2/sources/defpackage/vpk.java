package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: vpk  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class vpk implements cqjb {
    static final cqjb a = new vpk();

    private vpk() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        vqv vqvVar = (vqv) cqkpVar;
        int i = vpu.a;
        bvsx bvsxVar = new bvsx(context.getResources());
        bvsu c = bvsxVar.c(R.string.ODD_EVEN_LICENSE_RESTRICTION_PROMO_BODY);
        c.g("  •  ");
        bvsu c2 = bvsxVar.c(R.string.LEARN_MORE);
        c2.l(ibm.w().b(context));
        c.g(c2.c());
        return c.c();
    }
}
