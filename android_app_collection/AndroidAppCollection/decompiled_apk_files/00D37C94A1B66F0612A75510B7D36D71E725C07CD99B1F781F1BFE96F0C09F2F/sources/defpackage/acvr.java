package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
@Deprecated
/* renamed from: acvr  reason: default package */
/* loaded from: classes.dex */
public final class acvr implements dvl {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final afvn f;
    private volatile aqju g;

    public acvr(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, afvn afvnVar, azqb azqbVar5) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        azqbVar3.getClass();
        this.c = azqbVar3;
        this.e = azqbVar4;
        afvnVar.getClass();
        this.f = afvnVar;
        azqbVar5.getClass();
        this.d = azqbVar5;
    }

    private static aqju b(aadd aaddVar) {
        arhd a = aaddVar.a();
        if (a != null && (a.b & 524288) != 0) {
            asvx asvxVar = a.m;
            if (asvxVar == null) {
                asvxVar = asvx.a;
            }
            if ((asvxVar.b & 4) != 0) {
                asvx asvxVar2 = a.m;
                if (asvxVar2 == null) {
                    asvxVar2 = asvx.a;
                }
                aqju aqjuVar = asvxVar2.d;
                return aqjuVar == null ? aqju.a : aqjuVar;
            }
        }
        return aqju.a;
    }

    @Override // defpackage.dvl
    public final void a(String str, Map map) {
        if (this.g == null) {
            this.g = b((aadd) this.d.get());
        }
        if (this.g.c && map != null && "process".equals(map.get("action"))) {
            return;
        }
        zgp b = zgp.b(Uri.parse(ehi.d(str, map)));
        ((afst) this.c.get()).d(b);
        b.h("proc", String.valueOf(zgd.z()));
        String uri = b.a().toString();
        if (this.g == null) {
            this.g = b((aadd) this.d.get());
        }
        acvq acvqVar = new acvq(uri, this.g.d ? ytz.LOW : ytz.NORMAL, (Set) this.e.get(), this.f.c(), afzr.a);
        if (!((yrj) this.b.get()).o()) {
            return;
        }
        String valueOf = String.valueOf(acvqVar.d);
        if (valueOf.length() != 0) {
            "Pinging ".concat(valueOf);
        }
        ((yqw) this.a.get()).a(acvqVar);
    }
}
