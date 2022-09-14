package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: pyo  reason: default package */
/* loaded from: classes7.dex */
public final class pyo extends prh<bzns> {
    private final cqkj h;
    private final bzgl i;
    private final Activity j;
    private final bvjj k;

    public pyo(Activity activity, jdj jdjVar, cjqy cjqyVar, cjqq cjqqVar, cqkj cqkjVar, bzmm bzmmVar, bzmi bzmiVar, bzgl bzglVar, bvjj bvjjVar) {
        super(cjqyVar, cjqqVar, bzmmVar, bzmiVar, cjtd.a(dtyc.dh));
        this.h = cqkjVar;
        this.i = bzglVar;
        this.j = activity;
        this.k = bvjjVar;
    }

    @Override // defpackage.prh, defpackage.bzml
    public final dqkc a() {
        return dqkc.TRANSIT_TRIP_VOICE_GUIDANCE;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.HIGH;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        if (!n()) {
            return false;
        }
        amub m = m();
        return this.i.b() && zpk.g(this.j, m != null && this.i.h(m)).booleanValue() && !this.k.i(bvjk.dk);
    }

    @Override // defpackage.prh
    protected final cqkf<bzns> g() {
        return this.h.c(new bznm(), null);
    }

    @Override // defpackage.prh
    protected final bzns h(jdi jdiVar) {
        return new bznp(jdiVar, cqrt.l(R.string.TRANSIT_TRIP_VOICE_GUIDANCE_PROMO_BODY));
    }

    @Override // defpackage.prh
    protected final ddho i() {
        return dtyc.dg;
    }

    @Override // defpackage.prh
    protected final int j() {
        return 4;
    }

    @Override // defpackage.prh
    protected final jdo k() {
        return jdo.TOP;
    }

    @Override // defpackage.prh
    @dzsi
    protected final View l(View view) {
        return cqkx.d(view, gwu.b);
    }

    @Override // defpackage.prh
    protected final int q(gga ggaVar) {
        Resources resources = ggaVar.getResources();
        DisplayMetrics displayMetrics = ggaVar.getResources().getDisplayMetrics();
        return (resources.getString(R.string.TRANSIT_TRIP_VOICE_GUIDANCE_PROMO_TITLE).length() > 25 || resources.getString(R.string.TRANSIT_TRIP_VOICE_GUIDANCE_PROMO_BODY).length() > 60 || ((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) < 360) ? 220 : 154;
    }

    @Override // defpackage.prh
    protected final boolean r(vnk vnkVar, @dzsi int i, @dzsi jjn jjnVar) {
        return dqvj.TRANSIT.equals(vnkVar.g()) && i == 1 && qbs.TRANSIT_TRIP_DETAILS.equals(vnkVar.t()) && jjnVar != null && !jjnVar.b();
    }
}
