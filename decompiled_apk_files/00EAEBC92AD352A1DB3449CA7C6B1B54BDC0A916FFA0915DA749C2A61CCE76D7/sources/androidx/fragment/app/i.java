package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
/* loaded from: classes.dex */
public abstract class i<E> extends e {

    /* renamed from: b  reason: collision with root package name */
    private final Activity f1691b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1692c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f1693d;

    /* renamed from: e  reason: collision with root package name */
    final l f1694e;

    i(Activity activity, Context context, Handler handler, int i) {
        this.f1694e = new m();
        this.f1691b = activity;
        androidx.core.util.g.a(context, "context == null");
        this.f1692c = context;
        androidx.core.util.g.a(handler, "handler == null");
        this.f1693d = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(c cVar) {
        this(cVar, cVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.e
    public View a(int i) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment) {
    }

    public void a(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f1692c.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void a(Fragment fragment, String[] strArr, int i) {
    }

    public boolean a(String str) {
        return false;
    }

    public boolean b(Fragment fragment) {
        return true;
    }

    @Override // androidx.fragment.app.e
    public boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity e() {
        return this.f1691b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f1692c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler g() {
        return this.f1693d;
    }

    /* renamed from: h */
    public abstract E mo70h();

    public LayoutInflater i() {
        return LayoutInflater.from(this.f1692c);
    }

    public void j() {
    }
}
