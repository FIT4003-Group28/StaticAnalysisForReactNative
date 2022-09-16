package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ciwk  reason: default package */
/* loaded from: classes4.dex */
public final class ciwk extends ry {
    public cqkj ad;
    public cixm ae;

    @dzsi
    private static Date aJ(dpoj dpojVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        try {
            calendar.set(dpojVar.b, dpojVar.c - 1, dpojVar.d);
            return calendar.getTime();
        } catch (ArrayIndexOutOfBoundsException unused) {
            return null;
        }
    }

    @Override // defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.ry, defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        cqkf e = this.ad.e(new cixi());
        chtu chtuVar = (chtu) bvrs.e(this.o, chtu.class, (dssr) chtu.e.cu(7));
        dbsk.s(chtuVar);
        cixm cixmVar = this.ae;
        int i = chtuVar.b;
        dpvw dpvwVar = chtuVar.c;
        if (dpvwVar == null) {
            dpvwVar = dpvw.d;
        }
        int i2 = dpvwVar.b;
        dpvw dpvwVar2 = chtuVar.c;
        if (dpvwVar2 == null) {
            dpvwVar2 = dpvw.d;
        }
        dpoj dpojVar = dpvwVar2.c;
        if (dpojVar == null) {
            dpojVar = dpoj.e;
        }
        Date aJ = aJ(dpojVar);
        cixm.a(cixmVar.a.a(), 1);
        buva a = cixmVar.b.a();
        cixm.a(a, 2);
        Resources a2 = cixmVar.c.a();
        cixm.a(a2, 3);
        dxio a3 = ((dxjh) cixmVar.d).a();
        cixm.a(a3, 4);
        dxio a4 = ((dxjh) cixmVar.e).a();
        cixm.a(a4, 5);
        dxio a5 = ((dxjh) cixmVar.f).a();
        cixm.a(a5, 6);
        dxio a6 = ((dxjh) cixmVar.g).a();
        cixm.a(a6, 7);
        Executor a7 = cixmVar.h.a();
        cixm.a(a7, 8);
        cixm.a(this, 9);
        e.e(new cixl(a, a2, a3, a4, a5, a6, a7, this, i, i2, aJ));
        rx rxVar = new rx(J(), this.b);
        rxVar.setContentView(e.c());
        rxVar.getWindow().setBackgroundDrawableResource(R.color.black_transparent);
        return rxVar;
    }
}
