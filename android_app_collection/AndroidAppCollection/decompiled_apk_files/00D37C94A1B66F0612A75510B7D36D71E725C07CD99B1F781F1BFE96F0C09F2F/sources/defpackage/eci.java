package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: eci  reason: default package */
/* loaded from: classes3.dex */
public final class eci {
    public final wlz a;
    public final Set b = new HashSet();
    public ajsf c;
    public lg d;

    public eci(wlz wlzVar) {
        this.a = wlzVar;
    }

    public final void a(Object obj) {
        aozc aozcVar = aozc.a;
        if ((obj instanceof ajhh) && (aozcVar = ((ajhh) obj).b().f) == null) {
            aozcVar = aozc.a;
        }
        int i = aozcVar.b;
        if (((i & 1) == 0 && (i & 2) == 0) || this.b.contains(aozcVar)) {
            return;
        }
        wlz wlzVar = this.a;
        apan apanVar = aozcVar.c;
        if (apanVar == null) {
            apanVar = apan.a;
        }
        aoyz aoyzVar = aozcVar.d;
        if (aoyzVar == null) {
            aoyzVar = aoyz.a;
        }
        wlzVar.a(apanVar, aoyzVar);
        this.b.add(aozcVar);
    }
}
