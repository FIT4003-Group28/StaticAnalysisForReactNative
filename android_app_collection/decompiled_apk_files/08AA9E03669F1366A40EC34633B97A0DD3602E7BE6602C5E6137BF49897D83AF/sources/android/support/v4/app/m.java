package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: FragmentHostCallback.java */
/* loaded from: classes.dex */
public abstract class m<E> extends k {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f241a;

    /* renamed from: b  reason: collision with root package name */
    final Context f242b;

    /* renamed from: c  reason: collision with root package name */
    final int f243c;

    /* renamed from: d  reason: collision with root package name */
    final o f244d;
    private final Handler e;

    @Override // android.support.v4.app.k
    public View a(int i) {
        return null;
    }

    public void a(i iVar, String[] strArr, int i) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.support.v4.app.k
    public boolean a() {
        return true;
    }

    public boolean a(i iVar) {
        return true;
    }

    public boolean a(String str) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(i iVar) {
    }

    public void d() {
    }

    public boolean e() {
        return true;
    }

    public abstract E g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(j jVar) {
        this(jVar, jVar, jVar.f233c, 0);
    }

    m(Activity activity, Context context, Handler handler, int i) {
        this.f244d = new o();
        this.f241a = activity;
        this.f242b = context;
        this.e = handler;
        this.f243c = i;
    }

    public LayoutInflater b() {
        return LayoutInflater.from(this.f242b);
    }

    public void a(i iVar, Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f242b.startActivity(intent);
    }

    public void a(i iVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        a.a(this.f241a, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public int f() {
        return this.f243c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity h() {
        return this.f241a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context i() {
        return this.f242b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Handler j() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o k() {
        return this.f244d;
    }
}
