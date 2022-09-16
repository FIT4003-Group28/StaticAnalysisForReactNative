package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agrr  reason: default package */
/* loaded from: classes.dex */
public final class agrr implements yjo {
    private final agrs a;
    private final agsd b;

    public agrr(agrs agrsVar, agsd agsdVar) {
        this.a = agrsVar;
        this.b = agsdVar;
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        amvn g;
        agrs agrsVar = this.a;
        afvm c = agrsVar.g.c();
        if (c.z()) {
            g = amyg.a;
        } else {
            aahe a = ((aahf) agrsVar.c.get()).a(c);
            aahn aahnVar = (aahn) agrsVar.d.get();
            ArrayList arrayList = new ArrayList();
            aahp.c(agni.c, 4, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(agrsVar.e.c())), aahnVar, arrayList);
            amuk amukVar = (amuk) a.e(aahp.b(aahnVar, arrayList)).U();
            amvl i = amvn.i();
            int size = amukVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = (String) amukVar.get(i2);
                amvn amvnVar = (amvn) a.a(str).U();
                if (amvnVar == null || amvnVar.isEmpty()) {
                    String valueOf = String.valueOf(str);
                    zep.b(valueOf.length() != 0 ? "[Offline] Couldn't find parent key for refreshEntity: ".concat(valueOf) : new String("[Offline] Couldn't find parent key for refreshEntity: "));
                } else {
                    i.j(amvnVar);
                }
            }
            g = i.g();
        }
        amzs it = g.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            aopa createBuilder = atrf.a.createBuilder();
            createBuilder.copyOnWrite();
            atrf atrfVar = (atrf) createBuilder.instance;
            str2.getClass();
            atrfVar.b |= 2;
            atrfVar.d = str2;
            createBuilder.copyOnWrite();
            atrf atrfVar2 = (atrf) createBuilder.instance;
            atrfVar2.c = 3;
            atrfVar2.b |= 1;
            try {
                ((agsd) agrsVar.f.get()).d((atrf) createBuilder.mo39build());
            } catch (agse e) {
                String format = String.format("Refresh error. Msg: %s", e.getMessage());
                zep.d(format, e);
                afus.c(2, 28, format, e);
            }
        }
        try {
            ankt anktVar = ((agsj) this.b.a.get()).a;
            if (anktVar == null) {
                anktVar = ankq.a;
            }
            anktVar.get();
            agrs agrsVar2 = this.a;
            if (agrsVar2.j.a().booleanValue()) {
                agrsVar2.c(agrsVar2.a());
            }
            return 0;
        } catch (InterruptedException | ExecutionException unused) {
            return 1;
        }
    }
}
