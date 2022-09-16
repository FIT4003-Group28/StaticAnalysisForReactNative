package defpackage;

import android.os.Bundle;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: aggz  reason: default package */
/* loaded from: classes.dex */
public final class aggz implements yjo {
    private final azqb a;
    private final azqb b;
    private final agsd c;
    private final ampq d;
    private final aadd e;

    public aggz(azqb azqbVar, azqb azqbVar2, agsd agsdVar, ampq ampqVar, aadd aaddVar) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = agsdVar;
        this.d = ampqVar;
        this.e = aaddVar;
    }

    private final int b(agvx agvxVar) {
        try {
            HashSet<String> hashSet = new HashSet();
            for (agqv agqvVar : (Collection) agvxVar.m().i().get(1L, TimeUnit.MINUTES)) {
                if (agqvVar.p()) {
                    hashSet.add(agqvVar.m());
                }
            }
            for (String str : hashSet) {
                agsd agsdVar = this.c;
                aopa createBuilder = atrf.a.createBuilder();
                createBuilder.copyOnWrite();
                atrf atrfVar = (atrf) createBuilder.instance;
                atrfVar.c = 3;
                atrfVar.b |= 1;
                String f = aakj.f(((Integer) ((ampv) this.d).a).intValue(), str);
                createBuilder.copyOnWrite();
                atrf atrfVar2 = (atrf) createBuilder.instance;
                f.getClass();
                atrfVar2.b |= 2;
                atrfVar2.d = f;
                agsdVar.d((atrf) createBuilder.mo39build());
            }
            return 0;
        } catch (agse | InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e.getMessage());
            zep.c("offline", valueOf.length() != 0 ? "[Offline] Couldn't refresh: ".concat(valueOf) : new String("[Offline] Couldn't refresh: "));
            return 1;
        }
    }

    @Override // defpackage.yjo
    public final int a(Bundle bundle) {
        agvx g;
        String string = bundle.getString("identityId");
        if (string == null || (g = aggw.g((agrf) this.a.get(), string)) == null) {
            return 1;
        }
        aadd aaddVar = this.e;
        if (aaddVar != null && aaddVar.a() != null && (aaddVar.a().b & 512) != 0) {
            atqv atqvVar = aaddVar.a().g;
            if (atqvVar == null) {
                atqvVar = atqv.a;
            }
            if (atqvVar.u) {
                return b(g);
            }
        }
        ((aguu) this.b.get()).c(string, g);
        return aggw.f(0);
    }
}
