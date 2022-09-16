package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rop  reason: default package */
/* loaded from: classes7.dex */
public final class rop implements rot {
    private static final eaow h = eaow.a(90);
    private static final long i;
    private final Application a;
    private final auhi b;
    private final auhj c;
    private final bvjj d;
    private final btvo e;
    private final qjk f;
    private final cqat g;

    static {
        eatp eatpVar = eaul.j;
        if (!eatpVar.d) {
            eatpVar = new eatp(eatpVar.a, eatpVar.b, eatpVar.c, true, eatpVar.e, null);
        }
        i = eatpVar.k("2018-05-01T00:00:00Z").a;
    }

    public rop(Application application, qjk qjkVar, auhj auhjVar, auhi auhiVar, btvo btvoVar, bvjj bvjjVar, cqat cqatVar) {
        this.a = application;
        this.c = auhjVar;
        this.b = auhiVar;
        this.d = bvjjVar;
        this.f = qjkVar;
        this.e = btvoVar;
        this.g = cqatVar;
    }

    @Override // defpackage.rot
    public final void a() {
        roo rooVar;
        if (!b() || new eapd(this.d.w(bvjk.iB, i)).e(h).I(this.g.b())) {
            return;
        }
        domy f = this.f.f();
        aujb h2 = this.b.h(dpyv.UPDATE_COMMUTE_TRAVEL_MODE.dm);
        dbsk.s(h2);
        augc b = this.c.b(dpyv.UPDATE_COMMUTE_TRAVEL_MODE.dm, h2);
        Resources resources = this.a.getResources();
        Application application = this.a;
        Intent putExtra = new Intent().setComponent(new ComponentName(application, String.valueOf(application.getPackageName()).concat(".StartCommuteSetupActivity"))).putExtra("StartCommuteSetupExitIfNoChangesMade", true);
        Resources resources2 = this.a.getResources();
        domy domyVar = domy.UNKNOWN_TRAVEL_MODE;
        int ordinal = f.ordinal();
        int i2 = 2;
        if (ordinal == 1) {
            rooVar = new roo(this.a.getString(R.string.NOTIFICATION_TITLE_DRIVE), this.a.getString(R.string.NOTIFICATION_SUBTEXT_SPECIFIC));
        } else if (ordinal == 2) {
            rooVar = new roo(resources2.getString(R.string.NOTIFICATION_TITLE_TRANSIT), resources2.getString(R.string.NOTIFICATION_SUBTEXT_SPECIFIC));
        } else {
            rooVar = new roo(this.a.getString(R.string.NOTIFICATION_TITLE_GENERIC), this.a.getString(R.string.NOTIFICATION_SUBTEXT_GENERIC));
        }
        b.f = rooVar.a;
        b.g = rooVar.b;
        b.w(2131232589);
        b.C(true);
        b.D(resources.getColor(R.color.qu_daynight_google_blue_500));
        b.E(putExtra, auhw.ACTIVITY);
        ddzf bZ = ddzg.t.bZ();
        ddik bZ2 = ddil.e.bZ();
        int ordinal2 = f.ordinal();
        if (ordinal2 != 1) {
            i2 = ordinal2 != 2 ? ordinal2 != 3 ? ordinal2 != 4 ? ordinal2 != 5 ? 1 : 4 : 5 : 6 : 3;
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddil ddilVar = (ddil) bZ2.b;
        ddilVar.b = i2 - 1;
        ddilVar.a = 1 | ddilVar.a;
        ddil bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ.b;
        bK.getClass();
        ddzgVar.f = bK;
        ddzgVar.a |= 16777216;
        b.J = bZ.bK();
        this.b.j(b.a());
        this.d.Z(bvjk.iB, this.g.b());
    }

    @Override // defpackage.rot
    public final boolean b() {
        return this.e.getCommuteSetupParameters().h;
    }
}
