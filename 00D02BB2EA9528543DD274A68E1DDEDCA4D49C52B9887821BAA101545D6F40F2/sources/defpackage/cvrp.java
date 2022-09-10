package defpackage;

import java.util.Calendar;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cvrp  reason: default package */
/* loaded from: classes5.dex */
public final class cvrp implements cvro {
    private final cqat a;
    private final Map<dsfq, cvro> b;

    public cvrp(cqat cqatVar, Map<dsfq, cvro> map) {
        this.a = cqatVar;
        this.b = map;
    }

    @Override // defpackage.cvro
    public final boolean a(dsfr dsfrVar) {
        cvro cvroVar;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        for (dsew dsewVar : dsfrVar.c) {
            if (dsek.a(dsewVar, calendar)) {
                return false;
            }
        }
        if (!dsfq.a(dsfrVar.a).equals(dsfq.TYPE_NOT_SET) && (cvroVar = this.b.get(dsfq.a(dsfrVar.a))) != null) {
            return cvroVar.a(dsfrVar);
        }
        return true;
    }
}
