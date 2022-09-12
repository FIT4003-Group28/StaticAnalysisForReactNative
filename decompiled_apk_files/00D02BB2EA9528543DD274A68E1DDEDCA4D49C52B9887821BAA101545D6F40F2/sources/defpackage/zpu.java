package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zpu  reason: default package */
/* loaded from: classes7.dex */
public final class zpu {
    public final bvsl a;
    private final vtn b;

    public zpu(bvsl bvslVar, vtn vtnVar) {
        this.a = bvslVar;
        this.b = vtnVar;
    }

    public final void a(Context context, dccx<zcg> dccxVar, @dzsi qic qicVar) {
        dgas bK;
        if (qicVar == null) {
            return;
        }
        String b = qicVar.b();
        Drawable drawable = null;
        if (b != null) {
            drawable = this.b.b(b, vtj.TRANSIT_AUTO, null);
        }
        if (drawable != null) {
            drawable.setColorFilter(akm.c(context, R.color.qu_grey_700), PorterDuff.Mode.SRC_IN);
        }
        Resources resources = context.getResources();
        dgas a = qicVar.a();
        dsqp dsqpVar = (dsqp) a.cu(5);
        dsqpVar.bC(a);
        dgar dgarVar = (dgar) dsqpVar;
        if ((a.a & 4) != 0 && bvtb.a(a.d) == 0) {
            if (dgarVar.c) {
                dgarVar.bF();
                dgarVar.c = false;
            }
            dgas dgasVar = (dgas) dgarVar.b;
            dgasVar.a |= 4;
            dgasVar.d = 60;
        }
        if ((a.a & 1) == 0 || bvtb.a(a.b) != 0) {
            bK = dgarVar.bK();
        } else {
            dsqp dsqpVar2 = (dsqp) a.cu(5);
            dsqpVar2.bC(a);
            dgar dgarVar2 = (dgar) dsqpVar2;
            if (dgarVar2.c) {
                dgarVar2.bF();
                dgarVar2.c = false;
            }
            dgas dgasVar2 = (dgas) dgarVar2.b;
            dgasVar2.a |= 1;
            dgasVar2.b = 60;
            bK = dgarVar2.bK();
        }
        CharSequence d = bvtb.d(resources, bK, bvsz.ABBREVIATED, new bvsw());
        zps f = zpt.f();
        f.d(drawable);
        f.c(d);
        ((zgn) f).c = context.getString(R.string.BIKESHARING_X_WALK, d.toString());
        dccxVar.g(f.a());
    }

    public final void b(Context context, dccx<zcg> dccxVar, qib qibVar) {
        String e = qibVar.c().e();
        if (e == null) {
            return;
        }
        String i = qibVar.i();
        Drawable drawable = null;
        if (i != null) {
            drawable = this.b.b(i, vtj.TRANSIT_AUTO, null);
        }
        if (drawable != null) {
            drawable.setColorFilter(akm.c(context, R.color.qu_grey_700), PorterDuff.Mode.SRC_IN);
        }
        zps f = zpt.f();
        f.d(drawable);
        f.c(e);
        dccxVar.g(f.a());
    }

    public final void c(dccx<zcg> dccxVar, amuk amukVar) {
        Drawable b = this.b.b(amukVar.b().a, vtj.TRANSIT_AUTO, null);
        zps f = zpt.f();
        f.d(b);
        f.c(amukVar.a());
        dccxVar.g(f.a());
    }
}
