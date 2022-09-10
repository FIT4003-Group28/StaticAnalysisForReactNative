package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: atev  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class atev implements cqjb {
    static final cqjb a = new atev();

    private atev() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int e;
        if (((atna) cqkpVar).ak().booleanValue()) {
            e = cqrp.f(80.0d).e(context);
        } else if (cqhl.b(context)) {
            e = cqrt.d(R.dimen.navigation_header_with_grippy_height_port).e(context);
        } else {
            e = cqrt.d(R.dimen.navigation_header_with_grippy_height_land).e(context);
        }
        return Integer.valueOf(e);
    }
}
