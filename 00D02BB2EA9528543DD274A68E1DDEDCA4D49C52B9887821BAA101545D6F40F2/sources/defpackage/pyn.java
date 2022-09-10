package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: pyn  reason: default package */
/* loaded from: classes7.dex */
public final class pyn extends prh<bzns> {
    private final cqkj h;
    private final bzgl i;

    public pyn(jdj jdjVar, cjqy cjqyVar, cjqq cjqqVar, cqkj cqkjVar, bzmm bzmmVar, bzmi bzmiVar, bzgl bzglVar) {
        super(cjqyVar, cjqqVar, bzmmVar, bzmiVar, cjtd.a(dtyc.cZ));
        this.h = cqkjVar;
        this.i = bzglVar;
    }

    @Override // defpackage.prh, defpackage.bzml
    public final dqkc a() {
        return dqkc.TRANSIT_TRIP_START_FOOTER;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.LOW;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        amub m;
        return n() && (m = m()) != null && this.i.e(m);
    }

    @Override // defpackage.prh
    protected final cqkf<bzns> g() {
        return this.h.c(new bznk(), null);
    }

    @Override // defpackage.prh
    protected final bzns h(jdi jdiVar) {
        return new bznp(jdiVar, cqrt.l(R.string.TRANSIT_TRIP_START_FOOTER_PROMO_BODY));
    }

    @Override // defpackage.prh
    protected final ddho i() {
        return dtyc.cY;
    }

    @Override // defpackage.prh
    protected final int j() {
        return 4;
    }

    @Override // defpackage.prh
    protected final jdo k() {
        return jdo.BOTTOM;
    }

    @Override // defpackage.prh
    @dzsi
    protected final View l(View view) {
        return view.findViewById(R.id.start_button);
    }

    @Override // defpackage.prh
    protected final int q(gga ggaVar) {
        Resources resources = ggaVar.getResources();
        DisplayMetrics displayMetrics = ggaVar.getResources().getDisplayMetrics();
        return (resources.getString(R.string.TRANSIT_TRIP_START_FOOTER_PROMO_TITLE).length() > 25 || resources.getString(R.string.TRANSIT_TRIP_START_FOOTER_PROMO_BODY).length() > 60 || ((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) < 360) ? 220 : 154;
    }

    @Override // defpackage.prh
    protected final boolean r(vnk vnkVar, @dzsi int i, @dzsi jjn jjnVar) {
        return dqvj.TRANSIT.equals(vnkVar.g()) && i == 1 && qbs.TRANSIT_TRIP_DETAILS.equals(vnkVar.t());
    }
}
