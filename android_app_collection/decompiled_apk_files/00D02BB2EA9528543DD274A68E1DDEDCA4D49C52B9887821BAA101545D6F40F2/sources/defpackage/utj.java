package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: utj  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class utj implements cqjb {
    static final cqjb a = new utj();

    private utj() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        zbt zbtVar = (zbt) cqkpVar;
        int i = uts.a;
        bvsx bvsxVar = new bvsx(context.getResources());
        bvsu c = bvsxVar.c(R.string.DIRECTIONS_OPTIONS_AVOID_ODD_EVEN_ROADS_OPTION_INFO);
        bvsu c2 = bvsxVar.c(R.string.LEARN_MORE);
        c2.l(irg.r().b(context));
        c.g(c2.c());
        return c.c();
    }
}
