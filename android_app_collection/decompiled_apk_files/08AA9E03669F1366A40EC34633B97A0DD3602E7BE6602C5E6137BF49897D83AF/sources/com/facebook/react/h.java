package com.facebook.react;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
/* compiled from: ReactActivityDelegate.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f3440a;

    /* renamed from: b  reason: collision with root package name */
    private final android.support.v4.app.j f3441b = null;

    /* renamed from: c  reason: collision with root package name */
    private final String f3442c;

    /* renamed from: d  reason: collision with root package name */
    private p f3443d;
    private com.facebook.react.devsupport.c e;
    private com.facebook.react.modules.core.d f;
    private com.facebook.react.bridge.d g;

    protected Bundle a() {
        return null;
    }

    public h(Activity activity, String str) {
        this.f3440a = activity;
        this.f3442c = str;
    }

    protected p b() {
        return new p(i());
    }

    protected m c() {
        return ((i) j().getApplication()).a();
    }

    public j d() {
        return c().a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Bundle bundle) {
        if (this.f3442c != null) {
            a(this.f3442c);
        }
        this.e = new com.facebook.react.devsupport.c();
    }

    protected void a(String str) {
        if (this.f3443d != null) {
            throw new IllegalStateException("Cannot loadApp while app is already running.");
        }
        this.f3443d = b();
        this.f3443d.a(c().a(), str, a());
        j().setContentView(this.f3443d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        if (c().b()) {
            c().a().a(j());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        if (c().b()) {
            c().a().a(j(), (com.facebook.react.modules.core.b) j());
        }
        if (this.g != null) {
            this.g.a(new Object[0]);
            this.g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        if (this.f3443d != null) {
            this.f3443d.a();
            this.f3443d = null;
        }
        if (c().b()) {
            c().a().b(j());
        }
    }

    public void a(int i, int i2, Intent intent) {
        if (c().b()) {
            c().a().a(j(), i, i2, intent);
        }
    }

    public boolean a(int i, KeyEvent keyEvent) {
        if (!c().b() || !c().j()) {
            return false;
        }
        if (i == 82) {
            c().a().h();
            return true;
        } else if (!((com.facebook.react.devsupport.c) com.facebook.j.a.a.b(this.e)).a(i, j().getCurrentFocus())) {
            return false;
        } else {
            c().a().b().i();
            return true;
        }
    }

    public boolean h() {
        if (c().b()) {
            c().a().e();
            return true;
        }
        return false;
    }

    public boolean a(Intent intent) {
        if (c().b()) {
            c().a().a(intent);
            return true;
        }
        return false;
    }

    @TargetApi(23)
    public void a(String[] strArr, int i, com.facebook.react.modules.core.d dVar) {
        this.f = dVar;
        j().requestPermissions(strArr, i);
    }

    public void a(final int i, final String[] strArr, final int[] iArr) {
        this.g = new com.facebook.react.bridge.d() { // from class: com.facebook.react.h.1
            @Override // com.facebook.react.bridge.d
            public void a(Object... objArr) {
                if (h.this.f == null || !h.this.f.onRequestPermissionsResult(i, strArr, iArr)) {
                    return;
                }
                h.this.f = null;
            }
        };
    }

    private Context i() {
        if (this.f3440a != null) {
            return this.f3440a;
        }
        return (Context) com.facebook.j.a.a.b(this.f3441b);
    }

    private Activity j() {
        return (Activity) i();
    }
}
