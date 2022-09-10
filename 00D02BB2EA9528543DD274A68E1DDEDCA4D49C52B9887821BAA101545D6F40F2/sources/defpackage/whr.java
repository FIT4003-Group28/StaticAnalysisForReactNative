package defpackage;

import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: whr  reason: default package */
/* loaded from: classes7.dex */
public class whr implements whc {
    public final whq b;
    public final dxio<whv> c;
    @dzsi
    public wgj d;
    private final wgi g;
    private final Executor h;
    private final WeakReference<gga> i;
    private final boolean j;
    private final dxio<wdt> k;
    private static final whp e = whp.e(2131232305, ibm.l(), R.string.SAVED_TRIPS_PIN_SPECIFIC_ROUTE_BUTTON, R.string.SAVED_TRIPS_PIN_BUTTON);
    private static final whp f = whp.e(2131232304, ibm.x(), R.string.SAVED_TRIPS_UNPIN_SPECIFIC_ROUTE_BUTTON, R.string.SAVED_TRIPS_UNPIN_BUTTON);
    public static final dcza a = dczq.a;

    public whr(cqhn cqhnVar, Executor executor, gga ggaVar, dxio<whv> dxioVar, dxio<wdt> dxioVar2, wgi wgiVar, boolean z, whq whqVar) {
        this.g = wgiVar;
        this.h = executor;
        this.i = new WeakReference<>(ggaVar);
        this.c = dxioVar;
        this.k = dxioVar2;
        this.b = whqVar;
        this.j = z;
        deha.q(wgiVar.a(), new whn(this), executor);
    }

    @Override // defpackage.whc
    public Boolean a() {
        wgj wgjVar = this.d;
        return Boolean.valueOf(wgjVar != null ? wgjVar.a() : this.j);
    }

    @Override // defpackage.whc
    public cqtd b() {
        whd whdVar = (whd) (a().booleanValue() ? f : e);
        return cqrt.i(cqrt.f(whdVar.a), whdVar.b);
    }

    @Override // defpackage.whc
    public String c() {
        whp whpVar = a().booleanValue() ? f : e;
        gga ggaVar = this.i.get();
        dbsk.s(ggaVar);
        return ggaVar.getString(((whd) whpVar).d);
    }

    @Override // defpackage.whc
    public cqkl d() {
        wgj wgjVar = this.d;
        if (wgjVar == null) {
            return cqkl.a;
        }
        boolean h = this.k.a().h();
        boolean z = true;
        boolean z2 = !wgjVar.a();
        if (!z2 || h) {
            z = false;
        }
        deha.q(z2 ? wgjVar.d() : wgjVar.e(), new who(this, z), this.h);
        return cqkl.a;
    }

    @Override // defpackage.whc
    public cjtd e() {
        cjta b = cjtd.b();
        b.d = a().booleanValue() ? dtyb.al : dtyb.aj;
        wgj wgjVar = this.d;
        if (wgjVar != null) {
            ddes bZ = ddet.D.bZ();
            ddiq bZ2 = ddir.d.bZ();
            long c = a.a(wgjVar.b(), Charset.forName("UTF-8")).c();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddir ddirVar = (ddir) bZ2.b;
            ddirVar.a |= 1;
            ddirVar.b = c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddet ddetVar = (ddet) bZ.b;
            ddir bK = bZ2.bK();
            bK.getClass();
            ddetVar.C = bK;
            ddetVar.b |= 64;
            b.s(bZ.bK());
        }
        return b.a();
    }

    @Override // defpackage.whc
    public String f() {
        whp whpVar = a().booleanValue() ? f : e;
        gga ggaVar = this.i.get();
        dbsk.s(ggaVar);
        return ggaVar.getString(((whd) whpVar).c);
    }
}
