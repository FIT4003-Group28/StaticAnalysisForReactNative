package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class LifecycleCallback {

    /* renamed from: b  reason: collision with root package name */
    protected final h f6828b;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(h hVar) {
        this.f6828b = hVar;
    }

    public static h a(Activity activity) {
        return a(new g(activity));
    }

    protected static h a(g gVar) {
        if (gVar.c()) {
            return zzc.a(gVar.b());
        }
        if (!gVar.d()) {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
        return a1.a(gVar.a());
    }

    @Keep
    private static h getChimeraLifecycleFragmentImpl(g gVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public Activity a() {
        return this.f6828b.e();
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void b() {
    }

    public void b(Bundle bundle) {
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }
}
