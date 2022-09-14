package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7581b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7582c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Object f7583d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ long f7584e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ j6 f7585f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p6(j6 j6Var, String str, String str2, Object obj, long j) {
        this.f7585f = j6Var;
        this.f7581b = str;
        this.f7582c = str2;
        this.f7583d = obj;
        this.f7584e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7585f.a(this.f7581b, this.f7582c, this.f7583d, this.f7584e);
    }
}
