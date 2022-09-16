package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ixm  reason: default package */
/* loaded from: classes.dex */
final class ixm implements axvp {
    final /* synthetic */ ixn a;

    public ixm(ixn ixnVar) {
        this.a = ixnVar;
    }

    @Override // defpackage.axvp
    public final void E(boolean z, @dzsi azvc azvcVar, Context context) {
        if (azvcVar == null) {
            return;
        }
        dbsk.s(this.a.c);
        ilo c = this.a.c.c();
        dbsk.s(c);
        azva azvaVar = ((azvd) azvcVar).a;
        ixn ixnVar = this.a;
        Long l = azvaVar.b;
        dndr dndrVar = azvaVar.a;
        String str = azvaVar.f;
        dndi bZ = dndj.e.bZ();
        dndk bZ2 = dndl.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dndl dndlVar = (dndl) bZ2.b;
        dndlVar.b = dndrVar.h;
        dndlVar.a |= 1;
        String f = decu.f(l.longValue());
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dndl dndlVar2 = (dndl) bZ2.b;
        f.getClass();
        dndlVar2.a |= 2;
        dndlVar2.c = f;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dndj dndjVar = (dndj) bZ.b;
        dndl bK = bZ2.bK();
        bK.getClass();
        dndjVar.b = bK;
        dndjVar.a |= 1;
        String str2 = null;
        if (dndrVar == dndr.NICKNAME && str != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dndj dndjVar2 = (dndj) bZ.b;
            str.getClass();
            dndjVar2.a |= 2;
            dndjVar2.c = str;
        } else if (dndrVar == dndr.HOME) {
            str2 = ixnVar.a.getString(R.string.HOME_LOCATION);
        } else if (dndrVar == dndr.WORK) {
            str2 = ixnVar.a.getString(R.string.WORK_LOCATION);
        }
        decq bm = c.bm();
        if (bm != null) {
            int i = bm.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dndj dndjVar3 = (dndj) bZ.b;
            dndjVar3.a |= 16;
            dndjVar3.d = i;
        }
        ily g = c.g();
        dvya bZ3 = dvyw.bv.bZ();
        bZ3.bC(c.h());
        dndm bZ4 = dndn.c.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dndn dndnVar = (dndn) bZ4.b;
        dndj bK2 = bZ.bK();
        bK2.getClass();
        dndnVar.b = bK2;
        dndnVar.a |= 1;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvyw dvywVar = (dvyw) bZ3.b;
        dndn bK3 = bZ4.bK();
        bK3.getClass();
        dvywVar.ah = bK3;
        dvywVar.b |= 4194304;
        g.E(bZ3.bK());
        g.t = str2;
        ilo d = g.d();
        bwrs<ilo> bwrsVar = this.a.c;
        dbsk.s(bwrsVar);
        bwrsVar.d(d);
    }
}
