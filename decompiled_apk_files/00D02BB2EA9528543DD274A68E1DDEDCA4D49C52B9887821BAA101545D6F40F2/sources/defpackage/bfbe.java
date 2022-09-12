package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfbe  reason: default package */
/* loaded from: classes3.dex */
public class bfbe implements bfat, bzml, jkk {
    private final Activity b;
    private final bfaq c;
    private final bdwr d;
    private final dxio<bzmm> f;
    private final dxio<cjqq> g;
    private final cpv h;
    public boolean a = false;
    private int i = 0;
    private final cjtd e = cjtd.a(dtxy.nf);

    public bfbe(Activity activity, cqhn cqhnVar, cqhu cqhuVar, bfaq bfaqVar, bdwr bdwrVar, dxio<bzmm> dxioVar, dxio<cjqq> dxioVar2, cpv cpvVar) {
        this.b = activity;
        this.c = bfaqVar;
        this.d = bdwrVar;
        this.f = dxioVar;
        this.g = dxioVar2;
        this.h = cpvVar;
    }

    @Override // defpackage.bzml
    public dqkc a() {
        return dqkc.LOCAL_FOLLOW_WELCOME_OFFER_SCROLL_TOAST;
    }

    @Override // defpackage.bzml
    public bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public boolean d() {
        return this.c.a() && !this.a && this.f.a().d(a()) < 3;
    }

    @Override // defpackage.bzml
    public bzmk e() {
        return this.a ? bzmk.NONE : bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public boolean f(bzmk bzmkVar) {
        View o;
        View a;
        bzmk bzmkVar2 = bzmk.UNKNOWN_VISIBILITY;
        if (bzmkVar.ordinal() != 3) {
            return false;
        }
        this.a = true;
        this.g.a().g().d(this.e);
        if (this.h.e(this.b) && (o = cqkx.o(this)) != null && (a = cqhu.a(o, bfap.a)) != null) {
            czue.b(a);
        }
        cqkx.p(this);
        bdwr bdwrVar = this.d;
        bdwrVar.a.a(bdwrVar);
        return true;
    }

    @Override // defpackage.jkk
    public void g(int i) {
        if (i != this.i) {
            this.i = i;
            cqkx.p(this);
        }
    }

    @Override // defpackage.bfat
    public Boolean h() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.bfat
    public String i() {
        return this.b.getString(R.string.WELCOME_OFFER_SCROLL_TOOLTIP_TEXT);
    }

    @Override // defpackage.bfat
    public cjtd j() {
        return this.e;
    }

    @Override // defpackage.bfat
    public Integer k() {
        return Integer.valueOf(this.i);
    }

    @Override // defpackage.bfat
    public cqkl l() {
        n();
        this.f.a().f(a());
        return cqkl.a;
    }

    @Override // defpackage.bfat
    public String m() {
        return this.b.getString(R.string.WELCOME_OFFER_SCROLL_TOOLTIP_DESCRIPTION);
    }

    public void n() {
        View o;
        if (!this.a || (o = cqkx.o(this)) == null) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new bfbd(this));
        o.startAnimation(alphaAnimation);
    }
}
