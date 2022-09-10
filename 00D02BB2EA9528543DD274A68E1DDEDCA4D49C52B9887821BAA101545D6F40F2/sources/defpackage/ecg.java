package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ecg  reason: default package */
/* loaded from: classes6.dex */
public final class ecg implements ebm {
    private final Resources a;
    private final dcdc<ebn> b;
    private final dbsg<ebn> c;

    public ecg(Resources resources, eco ecoVar, final cavs cavsVar, boolean z, boolean z2, final cawy cawyVar) {
        dbsg<ebn> dbsgVar;
        this.a = resources;
        dkfx dkfxVar = cawyVar.e;
        dkfxVar = dkfxVar == null ? dkfx.d : dkfxVar;
        if ((dkfxVar.a & 1) != 0) {
            dkfv dkfvVar = dkfxVar.c;
            dbsgVar = dbsg.i(ecoVar.a(dkfvVar == null ? dkfv.f : dkfvVar, new Runnable(cavsVar, cawyVar) { // from class: ecf
                private final cavs a;
                private final cawy b;

                {
                    this.a = cavsVar;
                    this.b = cawyVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f(this.b);
                }
            }));
        } else {
            dbsgVar = dbpy.a;
        }
        this.c = dbsgVar;
        dccx F = dcdc.F();
        if (z && (dkfxVar.a & 1) != 0) {
            F.g(dbsgVar.b());
        }
        for (dkfv dkfvVar2 : dkfxVar.b) {
            if (!z2) {
                dkgl dkglVar = dkfvVar2.d;
                if ((dkglVar == null ? dkgl.d : dkglVar).a > 0) {
                }
            }
            F.g(ecoVar.a(dkfvVar2, null));
        }
        this.b = F.f();
    }

    @Override // defpackage.ebm
    public CharSequence a() {
        return this.a.getString(R.string.BADGES_EARNED_TITLE);
    }

    @Override // defpackage.ebm
    public List<ebn> b() {
        return this.b;
    }

    @Override // defpackage.ebm
    @dzsi
    public ebn c() {
        return this.c.f();
    }

    public void d(Runnable runnable) {
        dbsg.i(runnable);
    }
}
