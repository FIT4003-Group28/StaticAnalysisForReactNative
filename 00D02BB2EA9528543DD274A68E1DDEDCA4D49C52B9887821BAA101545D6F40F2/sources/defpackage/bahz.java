package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bahz  reason: default package */
/* loaded from: classes3.dex */
public class bahz implements baet {
    public final baez a;
    public final Executor b;
    public final gga c;
    public final bwqv d;
    public final dxio<axwi> e;
    public final baib f;
    public final bbat g;
    public final bbca h;
    public bahy<bayk> i;
    public bahy<bayj> j;
    private final btvo k;

    public bahz(baez baezVar, Executor executor, gga ggaVar, bwqv bwqvVar, dxio<axwi> dxioVar, baib baibVar, bbat bbatVar, bbca bbcaVar, btvo btvoVar) {
        this.a = baezVar;
        this.b = executor;
        this.c = ggaVar;
        this.d = bwqvVar;
        this.e = dxioVar;
        this.f = baibVar;
        this.g = bbatVar;
        this.h = bbcaVar;
        this.k = btvoVar;
        this.i = baibVar.a(dcdc.e(), bahx.OWNED, false);
        this.j = baibVar.a(dcdc.e(), bahx.FOLLOWED, false);
    }

    public static dcdc<bayk> f(dcdc<bayk> dcdcVar, bayk baykVar) {
        dcdc w = dcdc.w(dclu.d(new bahu()).c(), dcdcVar);
        dccx F = dcdc.F();
        boolean z = false;
        for (int i = 0; i < w.size(); i++) {
            bayk baykVar2 = (bayk) w.get(i);
            if (!z && (baykVar2.i() < baykVar.i() || i >= 3)) {
                F.g(baykVar);
                z = true;
            }
            F.g(baykVar2);
        }
        if (!z) {
            F.g(baykVar);
        }
        return F.f();
    }

    @Override // defpackage.baet
    public cjtd a() {
        return cjtd.a(dtxy.ak);
    }

    @Override // defpackage.baet
    public View.OnClickListener b() {
        return new View.OnClickListener(this) { // from class: bahq
            private final bahz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bahz bahzVar = this.a;
                bahzVar.c.D(ayrr.g(bahzVar.d, bwrs.a(bahzVar.e.a().a(""))));
            }
        };
    }

    @Override // defpackage.baet
    public baes c() {
        return this.i;
    }

    @Override // defpackage.baet
    public baes d() {
        return this.j;
    }

    @Override // defpackage.baet
    public int e() {
        return this.k.getPlaceListsParameters().o ? R.string.SAVED_TAB_SAVED_LISTS_MODULE_TITLE : R.string.SAVED_TAB_FOLLOWED_LISTS_MODULE_TITLE;
    }
}
