package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: rfg  reason: default package */
/* loaded from: classes4.dex */
public final class rfg {
    private static rfg b;
    public final Context a;
    private final boolean c = true;

    public rfg(Context context) {
        this.a = context;
    }

    public static synchronized rfg a(Context context) {
        rfg rfgVar;
        synchronized (rfg.class) {
            Context o = qnm.o(context);
            rfg rfgVar2 = b;
            if (rfgVar2 == null || rfgVar2.a != o) {
                b = new rfg(o);
            } else {
                boolean z = rfgVar2.c;
            }
            rfgVar = b;
        }
        return rfgVar;
    }
}
