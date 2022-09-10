package defpackage;

import java.util.Calendar;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: ackh  reason: default package */
/* loaded from: classes2.dex */
public class ackh extends acrp implements bega {
    private final cqat e;
    @dzsi
    private ilo f;

    public ackh(cqkj cqkjVar, cqhn cqhnVar, cqat cqatVar, cjqy cjqyVar, bvjj bvjjVar, ff ffVar, gce gceVar, btvo btvoVar) {
        super(cqkjVar, cqhnVar, ffVar, cjqyVar, gceVar, btvoVar.getEnableFeatureParameters().U);
        this.e = cqatVar;
    }

    @dzsi
    public Integer a() {
        ilo iloVar = this.f;
        if (iloVar != null) {
            return Integer.valueOf(iloVar.al().a(this.e).get(11));
        }
        return null;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        dpol dpolVar;
        ilo c = bwrsVar.c();
        this.f = c;
        if (c == null) {
            return;
        }
        dvvo dvvoVar = c.h().w;
        if (dvvoVar == null) {
            dvvoVar = dvvo.e;
        }
        ilo iloVar = this.f;
        if (iloVar != null) {
            byee al = iloVar.al();
            if (al.d()) {
                dpolVar = bvtb.r(al.e(this.e).a.h);
            } else {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(this.e.b());
                ilo iloVar2 = this.f;
                dbsk.s(iloVar2);
                calendar.setTimeZone(TimeZone.getTimeZone(iloVar2.h().ad));
                dpolVar = bvtb.r(calendar.get(7));
            }
        } else {
            dpolVar = dpol.MONDAY;
        }
        i(dvvoVar, dpolVar, a());
    }

    @Override // defpackage.bega
    public void u() {
    }

    @Override // defpackage.bega
    public Boolean w() {
        ilo iloVar = this.f;
        boolean z = false;
        if (iloVar != null && (iloVar.h().a & 131072) != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
