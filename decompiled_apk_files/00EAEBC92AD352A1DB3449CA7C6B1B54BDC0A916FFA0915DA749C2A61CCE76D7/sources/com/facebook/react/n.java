package com.facebook.react;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.Callback;
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f5801a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5802b;

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.react.modules.core.f f5803c;

    /* renamed from: d  reason: collision with root package name */
    private Callback f5804d;

    /* renamed from: e  reason: collision with root package name */
    private q f5805e;

    /* loaded from: classes.dex */
    class a extends q {
        a(Activity activity, u uVar, String str, Bundle bundle) {
            super(activity, uVar, str, bundle);
        }

        @Override // com.facebook.react.q
        protected y a() {
            return n.this.a();
        }
    }

    /* loaded from: classes.dex */
    class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5807a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String[] f5808b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int[] f5809c;

        b(int i, String[] strArr, int[] iArr) {
            this.f5807a = i;
            this.f5808b = strArr;
            this.f5809c = iArr;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            if (n.this.f5803c == null || !n.this.f5803c.onRequestPermissionsResult(this.f5807a, this.f5808b, this.f5809c)) {
                return;
            }
            n.this.f5803c = null;
        }
    }

    public n(m mVar, String str) {
        this.f5801a = mVar;
        this.f5802b = str;
    }

    protected y a() {
        return new y(b());
    }

    public void a(int i, int i2, Intent intent) {
        this.f5805e.a(i, i2, intent, true);
    }

    public void a(int i, String[] strArr, int[] iArr) {
        this.f5804d = new b(i, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Bundle bundle) {
        String d2 = d();
        this.f5805e = new a(e(), f(), d2, c());
        if (this.f5802b != null) {
            a(d2);
        }
    }

    protected void a(String str) {
        this.f5805e.a(str);
        e().setContentView(this.f5805e.b());
    }

    public void a(boolean z) {
        if (f().l()) {
            f().h().a(z);
        }
    }

    @TargetApi(23)
    public void a(String[] strArr, int i, com.facebook.react.modules.core.f fVar) {
        this.f5803c = fVar;
        e().requestPermissions(strArr, i);
    }

    public boolean a(int i, KeyEvent keyEvent) {
        if (!f().l() || !f().k() || i != 90) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean a(Intent intent) {
        if (f().l()) {
            f().h().a(intent);
            return true;
        }
        return false;
    }

    protected Context b() {
        Activity activity = this.f5801a;
        c.d.k.a.a.a(activity);
        return activity;
    }

    public boolean b(int i, KeyEvent keyEvent) {
        if (!f().l() || !f().k() || i != 90) {
            return false;
        }
        f().h().j();
        return true;
    }

    protected Bundle c() {
        return null;
    }

    public boolean c(int i, KeyEvent keyEvent) {
        return this.f5805e.a(i, keyEvent);
    }

    public String d() {
        return this.f5802b;
    }

    protected Activity e() {
        return (Activity) b();
    }

    protected u f() {
        return ((p) e().getApplication()).a();
    }

    public boolean g() {
        return this.f5805e.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h() {
        this.f5805e.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i() {
        this.f5805e.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
        this.f5805e.g();
        Callback callback = this.f5804d;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.f5804d = null;
        }
    }
}
