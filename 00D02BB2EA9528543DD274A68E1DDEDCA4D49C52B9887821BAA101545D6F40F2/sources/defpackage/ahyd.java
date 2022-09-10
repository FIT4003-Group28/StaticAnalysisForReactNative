package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ahyd  reason: default package */
/* loaded from: classes2.dex */
public final class ahyd {
    private final gga a;
    private final awnm b;

    public ahyd(gga ggaVar, awnm awnmVar) {
        this.a = ggaVar;
        dbsk.s(awnmVar);
        this.b = awnmVar;
    }

    public final void a(@dzsi btlu btluVar) {
        if (btsj.b(this.a)) {
            Intent intent = new Intent("com.google.android.gms.location.settings.LOCATION_SHARING");
            intent.setPackage("com.google.android.gms");
            String t = btlu.q(btluVar).t();
            if (t != null) {
                ahyc.b(intent, t);
            }
            awnm awnmVar = this.b;
            dbsk.l(ahyc.a(intent));
            awnmVar.e(intent, new ahyl());
            return;
        }
        cnmq cnmqVar = cnmq.a;
        gga ggaVar = this.a;
        cnmqVar.h(ggaVar, btsj.c(ggaVar), awnn.GMSCORE_REPAIR.ordinal(), null);
    }
}
