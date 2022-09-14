package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7178b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f7179c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ a f7180d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(a aVar, String str, long j) {
        this.f7180d = aVar;
        this.f7178b = str;
        this.f7179c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7180d.d(this.f7178b, this.f7179c);
    }
}
