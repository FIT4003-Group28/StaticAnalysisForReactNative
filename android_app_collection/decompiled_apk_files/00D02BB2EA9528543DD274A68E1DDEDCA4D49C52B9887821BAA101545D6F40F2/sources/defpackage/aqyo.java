package defpackage;

import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqyo  reason: default package */
/* loaded from: classes.dex */
public final class aqyo implements aqzz {
    public final btrm a;
    public final gcg b;
    public final dxio<gce> c;
    public final aufc d;
    public final Executor e;
    @dzsi
    public amzi f;
    public boolean g;
    public final crzp<aufb> h = new aqyl(this);
    public final crzp<Boolean> i = new aqym(this);
    public final aqyn j = new aqyn(this);
    private final arbu k;
    private final akpm l;

    public aqyo(btrm btrmVar, arbu arbuVar, akpm akpmVar, gcg gcgVar, dxio<gce> dxioVar, aufc aufcVar, Executor executor) {
        this.a = btrmVar;
        this.k = arbuVar;
        this.l = akpmVar;
        this.b = gcgVar;
        this.c = dxioVar;
        this.d = aufcVar;
        this.e = executor;
    }

    public static void e(amzi amziVar, boolean z) {
        amziVar.setNorthDrawableId(z ? R.drawable.ic_mod_compass_north_night : R.drawable.ic_mod_compass_north);
        amziVar.setNeedleDrawableId(true != z ? R.drawable.ic_mod_compass_needle : R.drawable.ic_mod_compass_needle_night);
        amziVar.setBackgroundDrawableId(true != z ? R.drawable.button_compass_selector : R.drawable.button_compass_night_selector);
        amziVar.setIsNightMode(z);
    }

    @Override // defpackage.aqzz
    public final void a(amzi amziVar) {
        this.f = amziVar;
        e(amziVar, f());
        amziVar.setVisibilityMode(d());
        amziVar.setDisplayMode(amzf.AUTO);
    }

    @Override // defpackage.aqzz
    public final void b() {
        amzi amziVar = this.f;
        if (amziVar != null) {
            amziVar.setNorthDrawableId(-1);
            this.f.setNeedleDrawableId(-1);
            this.f.setBackgroundDrawableId(-1);
            this.f = null;
        }
    }

    @Override // defpackage.aqzz
    public final void c() {
        amwd i = this.k.i();
        alad n = this.l.n();
        amwd amwdVar = amwd.OFF;
        int ordinal = i.ordinal();
        if (ordinal == 0) {
            akpm akpmVar = this.l;
            alaa alaaVar = new alaa(n);
            alaaVar.d = 0.0f;
            alaaVar.e = 0.0f;
            akpmVar.q(akyt.e(alaaVar.a()), null);
        } else if (ordinal != 1 && ordinal != 2) {
        } else {
            arbu arbuVar = this.k;
            alaf a = alai.a();
            a.f = alah.LOCATION_ONLY;
            a.b = n.k;
            a.c = 0.0f;
            a.d = 0.0f;
            a.e = n.n;
            arbuVar.j(a.a(), false);
        }
    }

    public final amzh d() {
        if (this.g) {
            return amzh.ALWAYS_OFF;
        }
        return amzh.OFF_IF_NORTH_UP_TOP_DOWN;
    }

    public final boolean f() {
        if (!this.d.b()) {
            return this.b.a() && this.c.a().h();
        }
        return true;
    }
}
