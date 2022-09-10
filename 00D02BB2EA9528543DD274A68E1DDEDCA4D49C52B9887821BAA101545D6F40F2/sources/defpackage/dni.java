package defpackage;

import android.text.TextUtils;
import com.google.ar.core.Session;
/* compiled from: PG */
/* renamed from: dni  reason: default package */
/* loaded from: classes6.dex */
public final class dni {
    public static dflw a(@dzsi btlu btluVar, boolean z) {
        char c;
        btlu q = btlu.q(btluVar);
        if (q.l()) {
            c = 2;
        } else {
            c = q.m() ? (char) 3 : (char) 1;
        }
        String t = q.t();
        if (c == 3) {
            return dflw.d;
        }
        if (!z) {
            return dflw.b;
        }
        if (c != 2 || TextUtils.isEmpty(t)) {
            return dflw.c;
        }
        final String format = String.format("rule=gaia,account=%1$s,udc=waa;rule=zwieback", t);
        return new dflw(format) { // from class: dfls
            private final String a;

            {
                this.a = format;
            }

            @Override // defpackage.dflw
            public final void a(Session session) {
                session.setAnalyticsPolicy(this.a);
            }
        };
    }
}
