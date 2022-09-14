package com.google.android.gms.common.api.internal;

import android.os.Bundle;
/* loaded from: classes.dex */
final class c1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f6849b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f6850c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ zzc f6851d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c1(zzc zzcVar, LifecycleCallback lifecycleCallback, String str) {
        this.f6851d = zzcVar;
        this.f6849b = lifecycleCallback;
        this.f6850c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        i = this.f6851d.Y;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f6849b;
            bundle = this.f6851d.Z;
            if (bundle != null) {
                bundle3 = this.f6851d.Z;
                bundle2 = bundle3.getBundle(this.f6850c);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.a(bundle2);
        }
        i2 = this.f6851d.Y;
        if (i2 >= 2) {
            this.f6849b.d();
        }
        i3 = this.f6851d.Y;
        if (i3 >= 3) {
            this.f6849b.c();
        }
        i4 = this.f6851d.Y;
        if (i4 >= 4) {
            this.f6849b.e();
        }
        i5 = this.f6851d.Y;
        if (i5 >= 5) {
            this.f6849b.b();
        }
    }
}
