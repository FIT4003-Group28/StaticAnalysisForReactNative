package com.google.android.apps.youtube.app.mdx;

import android.app.Activity;
import android.view.MenuItem;
import com.google.android.apps.youtube.app.mdx.WatchOnTvMenuItem;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class WatchOnTvMenuItem implements fry, f {
    public boolean a;
    public MenuItem b;
    private final Activity c;
    private final gfu d;
    private final acwn e;
    private aypg f = n();

    public WatchOnTvMenuItem(Activity activity, gfu gfuVar, acwn acwnVar) {
        this.c = activity;
        this.d = gfuVar;
        this.e = acwnVar;
    }

    private final aypg n() {
        return this.e.j().X(aypa.a()).as(new ayqb() { // from class: iwf
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                WatchOnTvMenuItem watchOnTvMenuItem = WatchOnTvMenuItem.this;
                Boolean bool = (Boolean) obj;
                watchOnTvMenuItem.a = bool.booleanValue();
                MenuItem menuItem = watchOnTvMenuItem.b;
                if (menuItem != null) {
                    menuItem.setVisible(bool.booleanValue());
                }
            }
        });
    }

    @Override // defpackage.fry
    public final int g() {
        return R.id.menu_watch_on_tv;
    }

    @Override // defpackage.fry
    public final int h() {
        return R.menu.menu_watch_on_tv;
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
        if (this.b == menuItem) {
            return;
        }
        this.b = menuItem;
        menuItem.setVisible(this.a);
    }

    @Override // defpackage.fry
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.fry
    public final boolean l() {
        return true;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.fry
    public final boolean m() {
        Activity activity = this.c;
        activity.startActivity(adih.d(activity, this.d.a() == gfs.DARK));
        return true;
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        ayqi.c((AtomicReference) this.f);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        if (this.f.e()) {
            this.f = n();
        }
    }
}
