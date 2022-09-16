package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ird  reason: default package */
/* loaded from: classes.dex */
public final class ird extends cqsg {
    @dzsi
    private static ird a;
    @dzsi
    private static ird b;
    private final boolean c;

    private ird(boolean z) {
        super(new Object[]{Boolean.valueOf(z)});
        this.c = z;
    }

    public static ird b() {
        if (a == null) {
            a = new ird(false);
        }
        return a;
    }

    public static ird c() {
        if (b == null) {
            b = new ird(true);
        }
        return b;
    }

    @Override // defpackage.cqtv
    public final float a(Context context) {
        int g;
        dbsg<cjmt> wp = ((cjms) btsq.c(cjms.class, context)).wp();
        if (!wp.a()) {
            return 0.0f;
        }
        cjmt b2 = wp.b();
        if (this.c) {
            g = b2.h();
        } else {
            g = b2.g();
        }
        return g;
    }
}
