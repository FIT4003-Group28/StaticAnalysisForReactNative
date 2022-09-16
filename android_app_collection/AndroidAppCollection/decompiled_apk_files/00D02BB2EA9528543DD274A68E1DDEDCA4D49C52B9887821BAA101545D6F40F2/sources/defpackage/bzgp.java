package defpackage;

import android.app.Service;
/* compiled from: PG */
/* renamed from: bzgp  reason: default package */
/* loaded from: classes4.dex */
public final class bzgp {
    public final Service a;
    public final cqat b;
    public final bzgl c;
    @dzsi
    public final cref d;
    public final byzi e;
    public final bzem f;
    public final bzgj g = new bzgj();
    public boolean h;
    public boolean i;
    public byzg j;

    public bzgp(bzem bzemVar, Service service, cqat cqatVar, bzgl bzglVar, dzsj<cref> dzsjVar, byzi byziVar) {
        this.a = service;
        this.b = cqatVar;
        this.c = bzglVar;
        this.e = byziVar;
        this.f = bzemVar;
        boolean z = true;
        if (bzglVar.b() && !bzglVar.a()) {
            z = false;
        }
        dbsk.l(z);
        this.d = bzglVar.a() ? dzsjVar.a() : null;
    }

    @dzsi
    public static eaow c(bzdg bzdgVar, eapd eapdVar, int i) {
        eapd k = bzdgVar.k(i, eapdVar);
        if (k == null) {
            return null;
        }
        return new eaow(eapdVar, k);
    }

    public static String f(@dzsi String str) {
        return str == null ? "" : str;
    }

    public final void a(String str) {
        crfj d = crfj.d(crfi.OTHER, str);
        cref crefVar = this.d;
        dbsk.s(crefVar);
        crefVar.b(d, crej.TRANSIT_GUIDANCE, null);
    }

    @dzsi
    public final String b(bzdg bzdgVar) {
        eapd eapdVar = new eapd(this.b.b());
        eapd l = bzdgVar.l(eapdVar);
        if (l == null) {
            return null;
        }
        return d(new eaow(eapdVar, l));
    }

    public final String d(eaow eaowVar) {
        return bvtb.e(this.a.getResources(), (int) eaowVar.g(), bvsz.EXTENDED).toString();
    }

    public final String e(int i, Object... objArr) {
        return String.valueOf(this.a.getResources().getString(i, objArr)).concat(". ");
    }
}
