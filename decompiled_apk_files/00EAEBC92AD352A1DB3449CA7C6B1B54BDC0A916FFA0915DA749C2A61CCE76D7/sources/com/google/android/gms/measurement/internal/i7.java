package com.google.android.gms.measurement.internal;

import android.net.Uri;
/* loaded from: classes.dex */
final class i7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f7362b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Uri f7363c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7364d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f7365e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ e7 f7366f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i7(e7 e7Var, boolean z, Uri uri, String str, String str2) {
        this.f7366f = e7Var;
        this.f7362b = z;
        this.f7363c = uri;
        this.f7364d = str;
        this.f7365e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7366f.a(this.f7362b, this.f7363c, this.f7364d, this.f7365e);
    }
}
