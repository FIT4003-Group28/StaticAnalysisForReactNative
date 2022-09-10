package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: pxl  reason: default package */
/* loaded from: classes7.dex */
public final class pxl extends prh<bzns> {
    private final cqkj h;
    private final bvjj i;

    public pxl(jdj jdjVar, cjqy cjqyVar, cjqq cjqqVar, cqkj cqkjVar, bzmm bzmmVar, bvjj bvjjVar) {
        super(jdjVar, cjqyVar, cjqqVar, bzmmVar);
        this.h = cqkjVar;
        this.i = bvjjVar;
    }

    @Override // defpackage.prh, defpackage.bzml
    public final dqkc a() {
        return dqkc.PARKING_PLANNER_SEARCH_STEP_BY_STEP;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.LOW;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        vnk vnkVar = this.c;
        amvh d = vnkVar != null ? vnkVar.d() : null;
        if (d == null) {
            return false;
        }
        dpbl x = d.x();
        return !this.i.m(bvjk.hp, false) && d.m == dntm.HARD && n() && x != null && x.a && x.b && vyr.h(d) != dpzh.HAS_PARKING;
    }

    @Override // defpackage.prh
    protected final cqkf<bzns> g() {
        return this.h.c(new bzne(), null);
    }

    @Override // defpackage.prh
    protected final bzns h(jdi jdiVar) {
        return new bznp(jdiVar, cqrt.l(R.string.PARKING_PLANNER_STEP_BY_STEP_PROMO_BODY));
    }

    @Override // defpackage.prh
    protected final ddho i() {
        return dtxn.cu;
    }

    @Override // defpackage.prh
    protected final int j() {
        return -7;
    }

    @Override // defpackage.prh
    protected final jdo k() {
        return jdo.BOTTOM;
    }

    @Override // defpackage.prh
    protected final View l(View view) {
        return view;
    }

    @Override // defpackage.prh
    protected final boolean r(vnk vnkVar, @dzsi int i, @dzsi jjn jjnVar) {
        return dqvj.DRIVE.equals(vnkVar.g()) && i == 3 && jjn.COLLAPSED.equals(jjnVar);
    }
}
