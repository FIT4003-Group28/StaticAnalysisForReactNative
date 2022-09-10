package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: cqbw  reason: default package */
/* loaded from: classes5.dex */
public final class cqbw {
    private final cqby a;
    private final Integer b;
    private final dsmh c;
    private final cnjz d;
    private final dskf e;

    public cqbw(cqby cqbyVar, Integer num, dsmh dsmhVar, cnjz cnjzVar, dskf dskfVar) {
        this.a = cqbyVar;
        this.b = num;
        this.c = dsmhVar;
        this.d = cnjzVar;
        this.e = dskfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(dsks dsksVar) {
        dskk dskkVar = dsksVar.c;
        if (dskkVar == null) {
            dskkVar = dskk.d;
        }
        if ((dskkVar.a & 1) != 0) {
            dskk dskkVar2 = dsksVar.c;
            if (dskkVar2 == null) {
                dskkVar2 = dskk.d;
            }
            dsmh b = dsmh.b(dskkVar2.b);
            if (b == null) {
                b = dsmh.UNKNOWN;
            }
            boolean equals = b.equals(this.c);
            dsmh dsmhVar = this.c;
            dskk dskkVar3 = dsksVar.c;
            if (dskkVar3 == null) {
                dskkVar3 = dskk.d;
            }
            dsmh b2 = dsmh.b(dskkVar3.b);
            if (b2 == null) {
                b2 = dsmh.UNKNOWN;
            }
            dbsk.j(equals, "This ClearcutHelper has been instantiated with the %s UI flow ID but the given event has %s instead.", dsmhVar, b2);
        }
        cqby cqbyVar = this.a;
        int i = this.c.aj;
        int a = dski.a(dsksVar.b);
        if (a == 0) {
            a = 1;
        }
        cqbyVar.b.a().a(Integer.valueOf(i), Integer.toString(a - 1), Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(this.e.w));
        cnjz cnjzVar = this.d;
        dsma bZ = dsmd.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsmd dsmdVar = (dsmd) bZ.b;
        dsksVar.getClass();
        dsmdVar.c = dsksVar;
        dsmdVar.b = 1;
        dsmdVar.a |= 64;
        dsmdVar.d = 1;
        cnjv d = cnjzVar.d(bZ.bK().bS());
        d.e(this.b.intValue());
        d.a();
    }

    public final void b(int i) {
        dskg bZ = dsks.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsks dsksVar = (dsks) bZ.b;
        dsksVar.b = i - 1;
        dsksVar.a |= 1;
        a(bZ.bK());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i) {
        dskg bZ = dsks.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsks dsksVar = (dsks) bZ.b;
        dsksVar.b = 6;
        int i2 = dsksVar.a | 1;
        dsksVar.a = i2;
        dsksVar.f = i - 1;
        dsksVar.a = i2 | 16;
        a(bZ.bK());
    }
}
