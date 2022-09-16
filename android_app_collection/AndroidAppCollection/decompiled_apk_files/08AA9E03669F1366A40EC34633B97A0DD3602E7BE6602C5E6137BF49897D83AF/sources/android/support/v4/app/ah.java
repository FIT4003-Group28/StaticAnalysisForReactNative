package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.c;
import android.os.Bundle;
/* compiled from: SupportActivity.java */
/* loaded from: classes.dex */
public class ah extends Activity implements android.arch.lifecycle.e {

    /* renamed from: a  reason: collision with root package name */
    private android.support.v4.i.l<Class<? extends Object>, Object> f208a = new android.support.v4.i.l<>();

    /* renamed from: b  reason: collision with root package name */
    private android.arch.lifecycle.f f209b = new android.arch.lifecycle.f(this);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        android.arch.lifecycle.m.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f209b.a(c.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.arch.lifecycle.e
    public android.arch.lifecycle.c getLifecycle() {
        return this.f209b;
    }
}
