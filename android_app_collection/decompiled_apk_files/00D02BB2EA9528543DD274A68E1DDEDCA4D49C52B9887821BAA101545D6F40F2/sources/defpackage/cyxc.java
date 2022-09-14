package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cyxc  reason: default package */
/* loaded from: classes5.dex */
public final class cyxc {
    public final cyfn<cygg, cywi> a = new cyfn<>(24, TimeUnit.HOURS);
    public final cyfo<cygg> b = new cyfo<>(TimeUnit.MINUTES);
    public final cyan c;

    public cyxc(cyan cyanVar) {
        this.c = cyanVar;
    }

    public final void a(cygg cyggVar, cywi cywiVar) {
        for (cyvy cyvyVar : cywiVar.p()) {
            this.a.b(cyvyVar.j(), cywiVar);
        }
        this.a.b(cyggVar, cywiVar);
    }
}
