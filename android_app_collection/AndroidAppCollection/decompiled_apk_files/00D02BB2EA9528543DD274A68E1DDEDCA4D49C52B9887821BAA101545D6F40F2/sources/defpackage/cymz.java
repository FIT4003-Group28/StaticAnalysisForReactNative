package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* renamed from: cymz  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cymz implements dewz {
    public static final dewz a = new cymz();

    private cymz() {
    }

    @Override // defpackage.dewz
    public final dyeu a(dewy dewyVar) {
        dywh a2 = dywh.a(dewyVar.l(), dewyVar.m());
        a2.m(dewyVar.d());
        a2.d = dewyVar.c();
        a2.j(dewyVar.k(), TimeUnit.MILLISECONDS);
        ScheduledExecutorService e = dewyVar.e();
        if (e != null) {
            a2.e = e;
        }
        return a2.c();
    }
}
