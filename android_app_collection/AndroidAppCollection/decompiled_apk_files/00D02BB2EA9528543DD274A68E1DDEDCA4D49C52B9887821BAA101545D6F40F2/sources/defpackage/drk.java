package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: drk  reason: default package */
/* loaded from: classes6.dex */
public final class drk extends drj implements aa<dyf> {
    @dzsi
    private String f;
    @dzsi
    private dxr g;

    public drk(Resources resources, dpw dpwVar, dbsg<dsf> dbsgVar, dhm dhmVar) {
        super(resources, dpwVar, dbsgVar, dhmVar);
    }

    private final void f(ilo iloVar, dxr dxrVar) {
        this.b.a(iloVar);
        d(dxrVar.k());
    }

    @Override // defpackage.drj
    public final void b(ilo iloVar) {
        this.d = iloVar;
        dxr dxrVar = this.g;
        if (dxrVar == null) {
            return;
        }
        f(iloVar, dxrVar);
    }

    @Override // defpackage.drj
    public final String e(float f) {
        return dbsj.d(this.f) ? super.e(f) : this.f;
    }

    @Override // defpackage.aa
    public final /* bridge */ /* synthetic */ void m(dyf dyfVar) {
        ilo iloVar;
        dyf dyfVar2 = dyfVar;
        bvrj.UI_THREAD.c();
        this.f = dyfVar2.c() == dye.UP ? this.a.getString(R.string.LH_PLACE_CARD_LEVEL_CHANGE_INSTRUCTION_UP, dyfVar2.b().g()) : dyfVar2.c() == dye.DOWN ? this.a.getString(R.string.LH_PLACE_CARD_LEVEL_CHANGE_INSTRUCTION_DOWN, dyfVar2.b().g()) : null;
        if (this.g == null && (iloVar = this.d) != null) {
            f(iloVar, dyfVar2.b());
        }
        this.g = dyfVar2.b();
    }
}
