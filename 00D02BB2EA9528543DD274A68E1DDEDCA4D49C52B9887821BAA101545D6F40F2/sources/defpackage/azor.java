package defpackage;

import java.util.concurrent.TimeUnit;
/* renamed from: azor  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class azor implements dbsl {
    static final dbsl a = new azor();

    private azor() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        drjs drjsVar = (drjs) obj;
        dqfu d = batk.d(drjsVar);
        if (d.equals(dqfu.d)) {
            d = batk.c(drjsVar);
        }
        return eapg.a().l().J(TimeUnit.SECONDS.toMillis(d.b));
    }
}
