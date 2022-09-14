package defpackage;

import android.app.Application;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: arlp  reason: default package */
/* loaded from: classes2.dex */
public final class arlp extends prh<arlz> {
    public final Application h;
    public final dbsg<arkb> i;
    public final Executor j;
    public boolean k;
    private final cqkj l;

    public arlp(Application application, jdj jdjVar, cjqy cjqyVar, cjqq cjqqVar, cqkj cqkjVar, bzmm bzmmVar, dbsg<arkb> dbsgVar, Executor executor) {
        super(jdjVar, cjqyVar, cjqqVar, bzmmVar);
        this.k = false;
        this.h = application;
        this.l = cqkjVar;
        this.i = dbsgVar;
        this.j = executor;
    }

    @Override // defpackage.prh, defpackage.bzml
    public final dqkc a() {
        return dqkc.ARWN_ONE_DIRECTION_OTHER_TRAVEL_MODE_PROMO;
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
        amub m;
        return this.k && psq.a(this.c, dqvj.WALK) && n() && (m = m()) != null && TimeUnit.SECONDS.toMinutes((long) m.z()) <= 30;
    }

    @Override // defpackage.prh
    protected final cqkf<arlz> g() {
        return this.l.e(new arlu());
    }

    @Override // defpackage.prh
    protected final /* bridge */ /* synthetic */ arlz h(jdi jdiVar) {
        return new arma(this.h, jdiVar, cqrt.l(R.string.ARWN_ONE_DIRECTION_OTHER_TRAVEL_MODE_PROMO_TITLE_LIVE_VIEW), cqrt.l(R.string.ARWN_ONE_DIRECTION_OTHER_TRAVEL_MODE_PROMO_DESCRIPTION));
    }

    @Override // defpackage.prh
    @dzsi
    protected final ddho i() {
        return dtxj.bT;
    }

    @Override // defpackage.prh
    protected final int j() {
        return -15;
    }

    @Override // defpackage.prh
    protected final jdo k() {
        return jdo.TOP;
    }

    @Override // defpackage.prh
    @dzsi
    protected final View l(View view) {
        return psq.b(this.c, view, dqvj.WALK);
    }

    @Override // defpackage.prh
    protected final boolean r(vnk vnkVar, @dzsi int i, @dzsi jjn jjnVar) {
        return !dqvj.WALK.equals(vnkVar.g()) && i == 3 && jjn.COLLAPSED.equals(jjnVar);
    }

    @Override // defpackage.prh
    public final void s(ges gesVar, vnk vnkVar, @dzsi int i, @dzsi jjn jjnVar, View view) {
        super.s(gesVar, vnkVar, i, jjnVar, view);
    }
}
