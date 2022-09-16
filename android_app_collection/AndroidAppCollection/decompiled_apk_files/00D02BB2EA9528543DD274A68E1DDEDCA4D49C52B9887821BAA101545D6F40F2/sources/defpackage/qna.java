package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: qna  reason: default package */
/* loaded from: classes7.dex */
public final class qna {
    public static qcx a(Context context, qco qcoVar) {
        qcw x = qcx.x();
        x.s(dqvj.TRANSIT);
        x.r(amvh.i(context));
        x.u(b(context, qcoVar.c()));
        if (qcoVar.g().a()) {
            x.v(qcoVar.g().b());
        }
        return x.a();
    }

    public static amvh b(Context context, qcl qclVar) {
        amvg P = amvh.P();
        dndr a = qclVar.a();
        dpjs g = amvj.g(a);
        if (amvj.h(g)) {
            P.a = g;
        }
        if (qclVar.b() != null) {
            P.c = qclVar.b();
        }
        if (qclVar.c() != null) {
            P.d = qclVar.c();
        }
        if (!TextUtils.isEmpty(qclVar.e())) {
            P.j = qclVar.e();
        } else if (a != null) {
            if (a.equals(dndr.HOME)) {
                P.j = context.getString(R.string.HOME_LOCATION);
            } else if (a.equals(dndr.WORK)) {
                P.j = context.getString(R.string.WORK_LOCATION);
            }
        }
        return P.a();
    }
}
