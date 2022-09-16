package defpackage;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acxd  reason: default package */
/* loaded from: classes.dex */
public final class acxd implements acxq {
    private static final String a = zep.a("MDX.BackgroundDeviceLogger");
    private static final int b = (int) TimeUnit.MINUTES.toSeconds(5);
    private static final int c = (int) TimeUnit.MINUTES.toSeconds(5);

    @Override // defpackage.acxq
    public final ankt a() {
        acxs a2 = acxt.a();
        a2.b(true);
        a2.c(10);
        a2.d(b);
        a2.e(c);
        return anlz.q(a2.a());
    }

    @Override // defpackage.acxq
    public final String b() {
        return "background-logger";
    }

    @Override // defpackage.acxq
    public final void c(amuk amukVar) {
        zep.h(a, String.format(Locale.US, "discovered %d devices", Integer.valueOf(amukVar.size())));
        int size = amukVar.size();
        for (int i = 0; i < size; i++) {
            String.format(Locale.US, "route: %s", ((bhc) amukVar.get(i)).d);
        }
    }

    @Override // defpackage.acxq
    public final void d() {
        zep.h(a, "wifi network disconnected");
    }

    @Override // defpackage.acxq
    public final void h() {
    }
}
