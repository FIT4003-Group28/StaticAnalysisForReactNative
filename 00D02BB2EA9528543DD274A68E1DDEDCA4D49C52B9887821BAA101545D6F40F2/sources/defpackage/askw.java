package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: askw  reason: default package */
/* loaded from: classes2.dex */
public final class askw {
    public final akzr b;
    private final btvo c;
    private final asku d;
    private final akza e;
    public final akse a = new akse(0.0f, 0.0f);
    private final float[] f = new float[8];

    public askw(btvo btvoVar, asku askuVar, akza akzaVar) {
        dbsk.s(btvoVar);
        this.c = btvoVar;
        dbsk.s(askuVar);
        this.d = askuVar;
        dbsk.s(akzaVar);
        this.e = akzaVar;
        this.b = new akzr(new amkz(0.0f, 0.0f, 0.0f, 0.0f), akrk.e(dchl.b(new akra(0, 0))));
    }

    private final dvdi c(dvdo dvdoVar) {
        dvdi dvdiVar = this.c.getNavigationParameters().y(this.d.a(), this.d.b(), this.d.c(), dvdoVar).c;
        return dvdiVar == null ? dvdi.d : dvdiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public final akzh a(@dzsi akra akraVar, @dzsi akra akraVar2, @dzsi akru[] akruVarArr, Rect rect, dvdo dvdoVar, int i, int i2, int i3, int i4, float f, float f2) {
        akra akraVar3;
        akra akraVar4;
        if (akraVar != null) {
            akraVar3 = akraVar;
        } else if (akruVarArr == null || (r9 = akruVarArr.length) == 0) {
            return null;
        } else {
            akraVar3 = new akra();
            for (akru akruVar : akruVarArr) {
                akraVar3.X(akruVar.b(0));
            }
            akraVar3.Z(1.0f / akruVarArr.length);
        }
        if (akraVar2 != null) {
            akraVar4 = akraVar2;
        } else if (akruVarArr == null || (r9 = akruVarArr.length) == 0) {
            return null;
        } else {
            akra akraVar5 = new akra();
            for (akru akruVar2 : akruVarArr) {
                akraVar5.X(akruVar2.b(akruVar2.a() - 1));
            }
            akraVar5.Z(1.0f / akruVarArr.length);
            akraVar4 = akraVar5;
        }
        int max = Math.max(i3, ((int) (25.0f * f2)) + (i2 - rect.bottom));
        float exactCenterX = rect.exactCenterX();
        alae alaeVar = new alae(((exactCenterX + exactCenterX) / i) - 1.0f, 1.0f - ((max + max) / i2));
        float b = b(dvdoVar);
        float f3 = this.e.f(b);
        alaa a = alad.a();
        a.d(akraVar3);
        a.c = b;
        a.d = Math.min(f3, c(dvdoVar).b);
        a.e = akrb.e(akraVar3, akraVar4);
        a.f = alaeVar;
        alad a2 = a.a();
        if (!Float.isNaN(f)) {
            alaa b2 = alad.b(a2);
            b2.e = f;
            a2 = b2.a();
        }
        akzh akzhVar = new akzh(a2, i, i2, f2);
        if (akruVarArr != null && (r2 = akruVarArr.length) > 0) {
            akra akraVar6 = new akra();
            for (akru akruVar3 : akruVarArr) {
                int i5 = 1;
                int max2 = Math.max(akruVar3.a() / 10, 1);
                if (max2 != 0) {
                    i5 = max2;
                }
                for (int i6 = 0; i6 < akruVar3.a(); i6 += i5) {
                    akruVar3.c(i6, akraVar6);
                    akyx.u(akzhVar, this.e, akraVar6, rect, i4, this.f);
                }
            }
        }
        akyx.u(akzhVar, this.e, akraVar4, rect, i4, this.f);
        return akzhVar;
    }

    public final float b(dvdo dvdoVar) {
        return c(dvdoVar).c;
    }
}
