package com.facebook.react;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f5814a;

    /* renamed from: b  reason: collision with root package name */
    private y f5815b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5816c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f5817d;

    /* renamed from: e  reason: collision with root package name */
    private com.facebook.react.devsupport.c f5818e = new com.facebook.react.devsupport.c();

    /* renamed from: f  reason: collision with root package name */
    private u f5819f;

    public q(Activity activity, u uVar, String str, Bundle bundle) {
        this.f5814a = activity;
        this.f5816c = str;
        this.f5817d = bundle;
        this.f5819f = uVar;
    }

    private u h() {
        return this.f5819f;
    }

    protected y a() {
        return new y(this.f5814a);
    }

    public void a(int i, int i2, Intent intent, boolean z) {
        if (!h().l() || !z) {
            return;
        }
        h().h().a(this.f5814a, i, i2, intent);
    }

    public void a(String str) {
        if (this.f5815b == null) {
            this.f5815b = a();
            this.f5815b.a(h().h(), str, this.f5817d);
            return;
        }
        throw new IllegalStateException("Cannot loadApp while app is already running.");
    }

    public boolean a(int i, KeyEvent keyEvent) {
        if (!h().l() || !h().k()) {
            return false;
        }
        if (i == 82) {
            h().h().j();
            return true;
        }
        com.facebook.react.devsupport.c cVar = this.f5818e;
        c.d.k.a.a.a(cVar);
        if (!cVar.a(i, this.f5814a.getCurrentFocus())) {
            return false;
        }
        h().h().c().d();
        return true;
    }

    public y b() {
        return this.f5815b;
    }

    public void c() {
        a(this.f5816c);
    }

    public boolean d() {
        if (h().l()) {
            h().h().f();
            return true;
        }
        return false;
    }

    public void e() {
        y yVar = this.f5815b;
        if (yVar != null) {
            yVar.c();
            this.f5815b = null;
        }
        if (h().l()) {
            h().h().a(this.f5814a);
        }
    }

    public void f() {
        if (h().l()) {
            h().h().b(this.f5814a);
        }
    }

    public void g() {
        if (h().l()) {
            if (!(this.f5814a instanceof com.facebook.react.modules.core.b)) {
                throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
            }
            r h2 = h().h();
            Activity activity = this.f5814a;
            h2.a(activity, (com.facebook.react.modules.core.b) activity);
        }
    }
}
