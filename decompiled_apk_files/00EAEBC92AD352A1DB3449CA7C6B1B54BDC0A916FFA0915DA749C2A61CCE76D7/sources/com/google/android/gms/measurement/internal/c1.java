package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7202b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f7203c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ a f7204d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c1(a aVar, String str, long j) {
        this.f7204d = aVar;
        this.f7202b = str;
        this.f7203c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7204d.c(this.f7202b, this.f7203c);
    }
}
