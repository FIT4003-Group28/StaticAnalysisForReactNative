package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: lbf  reason: default package */
/* loaded from: classes3.dex */
public final class lbf {
    private final aadd a;
    private final Context b;
    private final azqb c;
    private final aakt d;

    public lbf(aadd aaddVar, Context context, azqb azqbVar, aakt aaktVar) {
        this.a = aaddVar;
        this.b = context;
        this.c = azqbVar;
        this.d = aaktVar;
    }

    public final int a() {
        if (!eog.Q(this.a)) {
            return -1;
        }
        return zew.i(this.b.getResources().getDisplayMetrics(), eog.n(this.a) == 4 ? 36 : 32);
    }

    public final int b() {
        if (!eog.Q(this.a)) {
            return -1;
        }
        return zew.i(this.b.getResources().getDisplayMetrics(), eog.n(this.a) == 4 ? 64 : 56);
    }

    public final boolean c() {
        atnw b;
        return (!eog.Q(this.a) || this.d.a() || (b = ((akpu) this.c.get()).b()) == atnw.EFFECTIVE_CONNECTION_TYPE_SLOW_2G || b == atnw.EFFECTIVE_CONNECTION_TYPE_2G || b == atnw.EFFECTIVE_CONNECTION_TYPE_3G || b == atnw.EFFECTIVE_CONNECTION_TYPE_OFFLINE) ? false : true;
    }
}
