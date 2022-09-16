package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: afho  reason: default package */
/* loaded from: classes.dex */
public abstract class afho extends afhm {
    private final gga a;
    public final afhe b;
    public final dxio<afwr> c;
    public final eeu d;
    @dzsi
    public final afia e;

    public afho(Intent intent, @dzsi String str, afid afidVar, gga ggaVar, eeu eeuVar, afih afihVar, afhe afheVar, dxio<afwr> dxioVar) {
        super(intent, str, afidVar, ggaVar);
        this.b = afheVar;
        this.a = ggaVar;
        this.d = eeuVar;
        this.c = dxioVar;
        this.e = afihVar.b(intent, str);
    }

    public static boolean h(Intent intent) {
        return "android.intent.action.VIEW".equals(intent.getAction()) || "android.nfc.action.NDEF_DISCOVERED".equals(intent.getAction());
    }

    @Override // defpackage.afhx
    public void a() {
        final Uri data = this.f.getData();
        if (data == null) {
            return;
        }
        afia afiaVar = this.e;
        if (afiaVar != null) {
            afiaVar.f();
        }
        if (this.e == null) {
            return;
        }
        Runnable runnable = new Runnable(this, data) { // from class: afhn
            private final afho a;
            private final Uri b;

            {
                this.a = this;
                this.b = data;
            }

            @Override // java.lang.Runnable
            public final void run() {
                afho afhoVar = this.a;
                Uri uri = this.b;
                afia afiaVar2 = afhoVar.e;
                dbsk.s(afiaVar2);
                if (afiaVar2.a == afib.INVALID) {
                    return;
                }
                String str = afhoVar.b.a(uri.toString(), afhoVar.g, afhoVar.e).a;
                afhoVar.e.f();
                afia afiaVar3 = afhoVar.e;
                bvrj.UI_THREAD.c();
                if (!afhoVar.d.b()) {
                    return;
                }
                afhoVar.d.d(afiaVar3.M);
                afib afibVar = afiaVar3.a;
                afhoVar.e(afiaVar3, str);
                Boolean bool = afiaVar3.n;
                if (bool != null) {
                    afhoVar.c.a().l().c(afwm.TRAFFIC, bool.booleanValue());
                }
                Boolean bool2 = afiaVar3.o;
                if (bool2 != null) {
                    afhoVar.c.a().l().c(afwm.TRANSIT, bool2.booleanValue());
                }
                Boolean bool3 = afiaVar3.p;
                if (bool3 != null) {
                    afhoVar.c.a().l().c(afwm.BICYCLING, bool3.booleanValue());
                }
                Boolean bool4 = afiaVar3.q;
                if (bool4 != null) {
                    afhoVar.c.a().l().c(afwm.SATELLITE, bool4.booleanValue());
                }
                Boolean bool5 = afiaVar3.r;
                if (bool5 == null) {
                    return;
                }
                afhoVar.c.a().l().c(afwm.TERRAIN, bool5.booleanValue());
            }
        };
        if (afhg.d(this.f)) {
            if (d()) {
                this.a.A();
            }
            runnable.run();
        } else if (d()) {
            this.a.B(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        afia afiaVar = this.e;
        return afiaVar == null ? durz.EIT_UNKNOWN : afiaVar.a();
    }

    protected boolean d() {
        return true;
    }

    public abstract void e(afia afiaVar, String str);

    @Override // defpackage.afhx
    @dzsi
    public final afib f() {
        afia afiaVar = this.e;
        if (afiaVar == null) {
            return null;
        }
        return afiaVar.a;
    }

    @Override // defpackage.afhx
    public final boolean g() {
        return false;
    }
}
