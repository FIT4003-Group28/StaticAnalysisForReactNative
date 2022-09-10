package defpackage;

import android.app.Application;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: auog  reason: default package */
/* loaded from: classes2.dex */
public final class auog {
    public final Application a;
    public final aunx b;
    public final pas c;
    public final dlfv d;
    public final dlgn e;
    private final auhz f;
    @dzsi
    private final String g;

    public auog(Application application, aunx aunxVar, auhz auhzVar, @dzsi String str, pas pasVar, dlfv dlfvVar) {
        this.a = application;
        this.b = aunxVar;
        this.f = auhzVar;
        this.g = str;
        this.c = pasVar;
        this.d = dlfvVar;
        dlgn dlgnVar = dlfvVar.g;
        this.e = dlgnVar == null ? dlgn.G : dlgnVar;
    }

    public final CharSequence a() {
        pas pasVar = this.c;
        if ((pasVar.a & 1) != 0) {
            pap papVar = pasVar.b;
            if (papVar == null) {
                papVar = pap.d;
            }
            if ((papVar.a & 1) == 0) {
                return "";
            }
            pap papVar2 = this.c.b;
            if (papVar2 == null) {
                papVar2 = pap.d;
            }
            return papVar2.b;
        }
        return "";
    }

    public final CharSequence b() {
        pas pasVar = this.c;
        if ((pasVar.a & 1) != 0) {
            pap papVar = pasVar.b;
            if (papVar == null) {
                papVar = pap.d;
            }
            if ((papVar.a & 2) == 0) {
                return "";
            }
            pap papVar2 = this.c.b;
            if (papVar2 == null) {
                papVar2 = pap.d;
            }
            return papVar2.c;
        }
        return "";
    }

    public final Intent c() {
        String str;
        auhz auhzVar = this.f;
        dlgn dlgnVar = this.e;
        boolean z = (dlgnVar.a & 8192) != 0;
        dplx dplxVar = dlgnVar.r;
        if (dplxVar == null) {
            dplxVar = dplx.g;
        }
        Intent b = auhzVar.b(z, dplxVar, this.d.c, this.e.s);
        return (!this.e.n || (str = this.g) == null) ? b : afja.e(this.a, str, b);
    }

    public final dbsg<dlir> d() {
        dlgn dlgnVar = this.e;
        if (dlgnVar.c == 24) {
            dlir b = dlir.b(((dliv) dlgnVar.d).g);
            if (b == null) {
                b = dlir.UNKNOWN;
            }
            return dbsg.i(b);
        }
        return dbpy.a;
    }
}
