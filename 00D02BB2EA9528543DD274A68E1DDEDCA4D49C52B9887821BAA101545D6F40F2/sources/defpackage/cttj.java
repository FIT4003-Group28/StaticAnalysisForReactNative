package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cttj  reason: default package */
/* loaded from: classes5.dex */
public final class cttj {
    static final dyhs<dxwm> a = dyhs.c("google.internal.communications.instantmessaging.v1.tachyonerror-bin", new ctti());
    private static cttj b = null;

    public static cttj a() {
        if (b == null) {
            b = new cttj();
        }
        return b;
    }

    public final int b(Context context, Throwable th) {
        if (!csvw.a(context)) {
            return 6;
        }
        if (th.getCause() instanceof cmra) {
            return 7;
        }
        return th instanceof ctsx ? 8 : 9;
    }

    public final int c(Throwable th) {
        dxwm dxwmVar;
        int a2;
        dyhw d = dyjb.d(th);
        if (d == null || (dxwmVar = (dxwm) d.h(a)) == null || (a2 = eacw.a(dxwmVar.a)) == 0 || a2 == 1) {
            return 2;
        }
        int a3 = eacw.a(dxwmVar.a);
        if (a3 != 0) {
            return a3;
        }
        return 1;
    }
}
