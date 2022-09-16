package defpackage;

import java.io.Serializable;
import java.util.Map;
/* compiled from: PG */
/* renamed from: eape  reason: default package */
/* loaded from: classes6.dex */
public final class eape extends eaqi implements Serializable, eaps {
    private static final long serialVersionUID = 4922451897541386752L;

    public eape(long j, long j2) {
        super(j, j2, null);
    }

    public final eape a(eaps eapsVar) {
        Map<String, eaou> map = eaor.a;
        if (!j(eapsVar)) {
            return null;
        }
        eaqi eaqiVar = (eaqi) eapsVar;
        return new eape(Math.max(this.b, eaqiVar.b), Math.min(this.c, eaqiVar.c), this.a);
    }

    public final boolean b(eaps eapsVar) {
        eaqi eaqiVar = (eaqi) eapsVar;
        return eaqiVar.c == this.b || this.c == eaqiVar.b;
    }

    public eape(long j, long j2, eaok eaokVar) {
        super(j, j2, eaokVar);
    }

    public eape(eapr eaprVar, eapq eapqVar) {
        super(eaprVar, eapqVar);
    }

    public eape(eapr eaprVar, eapr eaprVar2) {
        super(eaprVar, eaprVar2);
    }
}
