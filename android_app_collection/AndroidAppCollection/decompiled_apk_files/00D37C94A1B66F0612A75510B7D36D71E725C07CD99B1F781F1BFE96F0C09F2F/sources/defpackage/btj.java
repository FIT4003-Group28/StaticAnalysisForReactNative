package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: btj  reason: default package */
/* loaded from: classes2.dex */
public final class btj {
    private static btj e;
    public final bsz a;
    public final bta b;
    public final bth c;
    public final bti d;

    private btj(Context context, bwn bwnVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = new bsz(applicationContext, bwnVar);
        this.b = new bta(applicationContext, bwnVar);
        this.c = new bth(applicationContext, bwnVar);
        this.d = new bti(applicationContext, bwnVar);
    }

    public static synchronized btj a(Context context, bwn bwnVar) {
        btj btjVar;
        synchronized (btj.class) {
            if (e == null) {
                e = new btj(context, bwnVar);
            }
            btjVar = e;
        }
        return btjVar;
    }
}
