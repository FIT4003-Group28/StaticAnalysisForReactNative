package defpackage;

import java.util.Calendar;
/* compiled from: PG */
/* renamed from: cvrn  reason: default package */
/* loaded from: classes5.dex */
public final class cvrn implements cvql {
    private final cqat a;

    public cvrn(cqat cqatVar) {
        this.a = cqatVar;
    }

    @Override // defpackage.cvql
    public final float a(dsfz dsfzVar) {
        dsfm dsfmVar = dsfzVar.b;
        if (dsfmVar == null) {
            dsfmVar = dsfm.c;
        }
        return dsfmVar.a;
    }

    @Override // defpackage.cvql
    public final dbsg<Float> b(dsfz dsfzVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        dsfm dsfmVar = dsfzVar.b;
        if (dsfmVar == null) {
            dsfmVar = dsfm.c;
        }
        dsfa dsfaVar = dsfmVar.b;
        if (dsfaVar == null) {
            dsfaVar = dsfa.b;
        }
        for (dsez dsezVar : dsfaVar.a) {
            dsew dsewVar = dsezVar.a;
            if (dsewVar == null) {
                dsewVar = dsew.d;
            }
            if (dsek.a(dsewVar, calendar)) {
                cvlw.a("WeekTimeWeightedFeatureEval", "Probability found (calendar == %s).", calendar);
                return dbsg.i(Float.valueOf(dsezVar.b));
            }
        }
        cvlw.a("WeekTimeWeightedFeatureEval", "Probability not found (calendar == %s).", calendar);
        return dbpy.a;
    }
}
