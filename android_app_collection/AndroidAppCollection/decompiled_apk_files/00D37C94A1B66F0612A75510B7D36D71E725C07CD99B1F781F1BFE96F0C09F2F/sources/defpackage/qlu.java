package defpackage;

import android.content.Context;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.List;
/* compiled from: PG */
/* renamed from: qlu  reason: default package */
/* loaded from: classes4.dex */
public final class qlu {
    public final Context a;
    public final String b;
    public final CastOptions c;
    public final qll d;
    public final qmg e;

    public qlu(Context context, CastOptions castOptions, qmg qmgVar) {
        String u;
        if (castOptions.a().isEmpty()) {
            u = tfo.t(castOptions.a);
        } else {
            String str = castOptions.a;
            List a = castOptions.a();
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (a == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            u = tfo.u(str, a);
        }
        this.d = new qll(this);
        qnm.b(context);
        this.a = context.getApplicationContext();
        qnm.l(u);
        this.b = u;
        this.c = castOptions;
        this.e = qmgVar;
    }
}
