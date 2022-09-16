package com.google.android.gms.common.api.internal;

import android.os.Bundle;
/* loaded from: classes.dex */
final class b1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ LifecycleCallback f6839b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f6840c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ a1 f6841d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(a1 a1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f6841d = a1Var;
        this.f6839b = lifecycleCallback;
        this.f6840c = str;
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
        i = this.f6841d.f6833c;
        if (i > 0) {
            LifecycleCallback lifecycleCallback = this.f6839b;
            bundle = this.f6841d.f6834d;
            if (bundle != null) {
                bundle3 = this.f6841d.f6834d;
                bundle2 = bundle3.getBundle(this.f6840c);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.a(bundle2);
        }
        i2 = this.f6841d.f6833c;
        if (i2 >= 2) {
            this.f6839b.d();
        }
        i3 = this.f6841d.f6833c;
        if (i3 >= 3) {
            this.f6839b.c();
        }
        i4 = this.f6841d.f6833c;
        if (i4 >= 4) {
            this.f6839b.e();
        }
        i5 = this.f6841d.f6833c;
        if (i5 >= 5) {
            this.f6839b.b();
        }
    }
}
