package defpackage;

import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arzl  reason: default package */
/* loaded from: classes2.dex */
final class arzl {
    final /* synthetic */ arzn a;

    public arzl(arzn arznVar) {
        this.a = arznVar;
    }

    public final void a(crhp crhpVar) {
        int b = crhpVar.d() ? crhpVar.e().g().b() : -1;
        arzn arznVar = this.a;
        arznVar.b.o = b;
        arzg arzgVar = arznVar.c;
        if (crhpVar.b()) {
            crhpVar.d();
        }
        cmz cmzVar = null;
        if (!crhpVar.d()) {
            if (arzgVar.g != null && crhpVar.f() && (((asio) arzgVar.c).b || ((mwo) arzgVar.d).a)) {
                arzgVar.b.a();
            }
            arzgVar.g = null;
            arzgVar.f = null;
        }
        if (crhpVar.d()) {
            arzgVar.g = crhpVar.e().g();
            if (arzgVar.k != arzgVar.g.b) {
                arzgVar.j = 0L;
            }
            arzd arzdVar = arzgVar.b;
            crqf e = crhpVar.e();
            boolean b2 = arzgVar.b();
            boolean d = arzgVar.d();
            long j = arzgVar.j;
            cray crayVar = arzgVar.g;
            amut amutVar = arzgVar.f;
            boolean z = true;
            if (!((asio) arzgVar.c).b && !((mwo) arzgVar.d).a) {
                z = false;
            }
            arzz a = arzdVar.d.a(e);
            if (z) {
                cmzVar = new cmz();
                cmzVar.b();
                cmzVar.b = a.k.toString();
                if (e.g().b == null) {
                    cmzVar.c = " ";
                    cmzVar.d = " ";
                } else {
                    cmzVar.c = a.j.toString();
                    cmzVar.d = a.g;
                    amuo amuoVar = e.g().b;
                    dbsk.s(amuoVar);
                    cmzVar.e = asaa.a(amuoVar, e.d(), 256);
                }
            }
            arzdVar.r = new arzb(arzdVar, a.a(), arzdVar.c.getString(R.string.DA_EXIT_NAVIGATION), new aryz(arzdVar, cmzVar, a.k, a.d, a.c, a.f, a.l, a.j, a.a, a.a()));
            arzdVar.d(b2, d, j, crayVar, amutVar);
        } else if (crhpVar.f()) {
            arzd arzdVar2 = arzgVar.b;
            crqd g = crhpVar.g();
            arzu arzuVar = arzdVar2.e;
            arzv arzvVar = new arzv();
            String str = g.b;
            if (!TextUtils.isEmpty(str)) {
                arzvVar.a = str;
            } else {
                arzvVar.a = arzuVar.a.c(R.string.DRIVING_MODE_NOTIFICATION_DRIVING_WITH_NO_CURRENT_ROAD).c();
            }
            arzdVar2.r = new arzb(arzdVar2, null, arzdVar2.c.getString(R.string.DRIVING_MODE_NOTIFICATION_STOP_DRIVING), new aryy(arzdVar2, arzvVar.a));
            arzdVar2.d(false, false, 0L, null, null);
        } else {
            arzgVar.b.a();
        }
    }
}
