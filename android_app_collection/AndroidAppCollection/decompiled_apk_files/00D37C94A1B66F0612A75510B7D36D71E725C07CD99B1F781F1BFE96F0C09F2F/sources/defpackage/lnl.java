package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lnl  reason: default package */
/* loaded from: classes3.dex */
public final class lnl implements ltt {
    public final dt a;
    private final fvf b;
    private final gfu c;
    private final yve d;
    private gfs e;

    public lnl(dt dtVar, fvf fvfVar, gfu gfuVar, yve yveVar) {
        dtVar.getClass();
        this.a = dtVar;
        fvfVar.getClass();
        this.b = fvfVar;
        this.c = gfuVar;
        this.e = gfuVar.b();
        this.d = yveVar;
    }

    @Override // defpackage.ltt
    public final void a(gfs gfsVar) {
        fvl b;
        if (Build.VERSION.SDK_INT > 28) {
            if (!((gft) this.d.c()).c) {
                if (this.a.getString(R.string.app_theme_appearance_system).equals(((gft) this.d.c()).f) && this.e != gfsVar) {
                    fvf fvfVar = this.b;
                    gfs gfsVar2 = gfs.LIGHT;
                    int ordinal = gfsVar.ordinal();
                    if (ordinal == 0) {
                        fvg d = fvl.d();
                        d.k(this.a.getString(R.string.auto_switched_to_light_by_device_theme));
                        b = d.b();
                    } else if (ordinal == 1) {
                        fvg d2 = fvl.d();
                        d2.k(this.a.getString(R.string.auto_switched_to_dark_by_device_theme));
                        b = d2.b();
                    } else {
                        throw new AssertionError();
                    }
                    fvfVar.i(b);
                    ylx.n(this.a, this.d.b(lhh.k), lcz.q, ylx.b);
                    this.e = gfsVar;
                }
            }
            if (akzj.f(((gft) this.d.c()).f, this.a.getString(R.string.app_theme_appearance_dark)) && this.c.c() != gfs.DARK && this.c.b() == gfs.DARK && gfsVar == gfs.DARK && !((gft) this.d.c()).d) {
                fvf fvfVar2 = this.b;
                fvg d3 = fvl.d();
                d3.k(this.a.getString(R.string.theme_not_match_with_system_theme));
                d3.m(this.a.getString(R.string.settings_button), new View.OnClickListener() { // from class: lnk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dt dtVar = lnl.this.a;
                        dtVar.startActivity(etk.a(dtVar));
                    }
                });
                fvfVar2.i(d3.b());
                ylx.n(this.a, this.d.b(lhh.l), lcz.r, ylx.b);
            }
            this.e = gfsVar;
        }
    }

    @Override // defpackage.ltt
    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.e = (gfs) gfs.a(bundle.getInt("current_theme")).e(this.e);
        }
    }

    @Override // defpackage.ltt
    public final void c(Bundle bundle) {
        bundle.putInt("current_theme", this.e.c);
    }
}
