package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.Calendar;
/* compiled from: PG */
/* renamed from: nkz  reason: default package */
/* loaded from: classes7.dex */
public final class nkz {
    private final dbty<Calendar> a;

    public nkz(dbty<Calendar> dbtyVar) {
        this.a = dbtyVar;
    }

    @dzsi
    public final azva a(dcdc<azva> dcdcVar, dndr dndrVar, @dzsi GmmLocation gmmLocation) {
        azva azvaVar;
        Calendar a;
        int i;
        int i2;
        dbsk.s(dcdcVar);
        int i3 = 0;
        dbsk.a(dndrVar == dndr.HOME || dndrVar == dndr.WORK);
        int size = dcdcVar.size();
        while (true) {
            if (i3 >= size) {
                azvaVar = null;
                break;
            }
            azvaVar = dcdcVar.get(i3);
            i3++;
            if (dndrVar == azvaVar.a) {
                break;
            }
        }
        if (azvaVar == null) {
            return null;
        }
        if (gmmLocation != null) {
            akqq akqqVar = azvaVar.e;
            dbsk.s(akqqVar);
            double F = gmmLocation.F(akqqVar);
            if (F < 500.0d || F > 1500000.0d) {
                return null;
            }
        }
        if (dndrVar == dndr.WORK && ((i = (a = this.a.a()).get(7)) == 7 || i == 1 || (i2 = a.get(11)) < 4 || i2 >= 12)) {
            return null;
        }
        return azvaVar;
    }
}
