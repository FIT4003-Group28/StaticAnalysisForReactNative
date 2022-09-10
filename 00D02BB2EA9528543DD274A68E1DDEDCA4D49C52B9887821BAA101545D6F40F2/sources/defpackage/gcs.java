package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: gcs  reason: default package */
/* loaded from: classes6.dex */
public final class gcs implements bzml {
    private final Activity a;
    private final dxio<bzmm> b;
    private final dxio<gcg> c;
    private final dxio<gce> d;
    private final dxio<aedv> e;
    private final cqat f;
    private final dxio<cjnf> g;

    public gcs(Activity activity, dxio<bzmm> dxioVar, dxio<gcg> dxioVar2, dxio<gce> dxioVar3, dxio<aedv> dxioVar4, cqat cqatVar, dxio<cjnf> dxioVar5) {
        this.a = activity;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
        this.e = dxioVar4;
        this.f = cqatVar;
        this.g = dxioVar5;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.DARK_MODE_USER_EDUCATION_TOOLTIP;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return this.c.a().a() && this.d.a().h() && this.e.a().f() == dktk.EXPLORE;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (this.b.a().d(dqkc.DARK_MODE_USER_EDUCATION_TOOLTIP) >= 2) {
            return bzmk.NONE;
        }
        long c = this.b.a().c(dqkc.DARK_MODE_USER_EDUCATION_TOOLTIP);
        if (c == -1) {
            return bzmk.VISIBLE;
        }
        if (new eapd(c).x(new eapd(this.f.b() - TimeUnit.DAYS.toMillis(1L)))) {
            return bzmk.VISIBLE;
        }
        return bzmk.NONE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        View findViewById;
        if (bzmkVar != bzmk.VISIBLE || (findViewById = this.a.findViewById(R.id.search_omnibox_one_google_account_disc)) == null) {
            return false;
        }
        cjnd i = cjne.i();
        i.d(findViewById);
        i.c(R.string.DARK_MODE_TOOLTIP_TEXT);
        i.b(true);
        ((cjnb) i).b = cjtd.a(dtxn.i);
        this.g.a().a(i.a());
        return true;
    }
}
