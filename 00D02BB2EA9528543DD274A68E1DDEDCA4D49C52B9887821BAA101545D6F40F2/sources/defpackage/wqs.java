package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wqs  reason: default package */
/* loaded from: classes7.dex */
public class wqs implements wpo {
    private static final cjtd c;
    private static final cjtd d;
    public final qdi a;
    public final akqi b;
    private final Context e;
    private final zef f;
    private final cjtd g;
    private final cjtd h;
    @dzsi
    private final cqkn<wpo> i;
    private boolean j = false;

    static {
        cjta b = cjtd.b();
        b.d = dtyc.eX;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = deaa.TOGGLE_ON;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        c = b.a();
        cjta b2 = cjtd.b();
        b2.d = dtyc.eX;
        ddzy bZ2 = deab.c.bZ();
        deaa deaaVar2 = deaa.TOGGLE_OFF;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        deab deabVar2 = (deab) bZ2.b;
        deabVar2.b = deaaVar2.d;
        deabVar2.a |= 1;
        b2.a = bZ2.bK();
        d = b2.a();
    }

    public wqs(Context context, zef zefVar, dopk dopkVar, akqi akqiVar, int i, @dzsi cqkn<wpo> cqknVar) {
        dbsk.s(context);
        this.e = context;
        this.f = zefVar;
        this.b = akqiVar;
        this.a = qdi.a(zefVar.e().c());
        cjta c2 = cjtd.c(c);
        wse.b(c2, dopkVar);
        c2.i(i);
        this.g = c2.a();
        cjta c3 = cjtd.c(d);
        wse.b(c3, dopkVar);
        c3.i(i);
        this.h = c3.a();
        this.i = cqknVar;
    }

    public static String h(String str, boolean z, Context context) {
        zbd zbdVar = new zbd(context);
        zbdVar.b(str);
        zbdVar.c(context.getString(true != z ? R.string.abc_capital_off : R.string.abc_capital_on));
        return zbdVar.toString();
    }

    @Override // defpackage.wpo
    @dzsi
    public zvb a() {
        return this.f.l();
    }

    @Override // defpackage.wpo
    @dzsi
    public jhk b() {
        return this.f.j();
    }

    @Override // defpackage.wpo
    public Boolean c() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.wpo
    @dzsi
    public String d() {
        String f = this.f.f();
        if (f == null) {
            jhk j = this.f.j();
            f = (j == null || !j.c.a()) ? null : j.c.b();
        }
        if (f == null) {
            return null;
        }
        return h(f, this.j, this.e);
    }

    @Override // defpackage.wpo
    @dzsi
    public cqkn<wpo> e() {
        return this.i;
    }

    @Override // defpackage.wpo
    public cjtd f() {
        return this.j ? this.g : this.h;
    }

    public zef g() {
        return this.f;
    }

    public boolean i(boolean z) {
        boolean z2 = this.j != z;
        this.j = z;
        return z2;
    }
}
