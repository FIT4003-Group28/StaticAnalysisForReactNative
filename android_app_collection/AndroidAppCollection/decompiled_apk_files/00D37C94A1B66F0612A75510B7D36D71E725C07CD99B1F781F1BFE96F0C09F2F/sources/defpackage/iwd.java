package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MenuItem;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iwd  reason: default package */
/* loaded from: classes3.dex */
public final class iwd implements fry {
    private final Context a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final acyz e;
    private final aczd f;
    private final adhf g;
    private final adoa h;
    private final eo i;
    private final boolean j;
    private final adhh k;

    public iwd(Context context, eo eoVar, acyz acyzVar, aczd aczdVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, adhh adhhVar, adhf adhfVar, adoa adoaVar, acwu acwuVar) {
        this.a = context;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
        this.e = acyzVar;
        this.f = aczdVar;
        this.k = adhhVar;
        this.g = adhfVar;
        this.h = adoaVar;
        this.i = eoVar;
        this.j = acwuVar.q;
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.menu_cast_overflow;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.menu_cast_overflow;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
        if (this.j) {
            menuItem.setVisible(true);
            return;
        }
        bhd bhdVar = (bhd) this.d.get();
        menuItem.setVisible(bhd.k((bgo) this.b.get(), 1));
    }

    @Override // defpackage.fry
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.fry
    public final boolean l() {
        return false;
    }

    @Override // defpackage.fry
    public final boolean m() {
        ylr.c();
        if (!this.f.b()) {
            this.f.a((Activity) this.a);
        } else {
            bhd bhdVar = (bhd) this.d.get();
            bhc j = bhd.j();
            if (this.h.e() == null && ((adgc) this.c.get()).T(j)) {
                bhd.o(1);
            }
            if (!this.e.e()) {
                this.e.b();
            }
            if (!this.k.a(this.i)) {
                if (this.h.e() == null || this.h.e().a() == 2) {
                    bew c = adhf.c((bgo) this.b.get(), null);
                    c.qv(this.i, c.getClass().getCanonicalName());
                } else {
                    bfm b = this.g.b();
                    b.qv(this.i, b.getClass().getCanonicalName());
                }
            }
        }
        return true;
    }
}
