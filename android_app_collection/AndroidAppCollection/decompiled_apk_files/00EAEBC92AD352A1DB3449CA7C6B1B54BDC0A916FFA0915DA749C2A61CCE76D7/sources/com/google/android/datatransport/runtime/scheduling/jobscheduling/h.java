package com.google.android.datatransport.runtime.scheduling.jobscheduling;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final m f6739b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.a.a.i.m f6740c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6741d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f6742e;

    private h(m mVar, c.e.a.a.i.m mVar2, int i, Runnable runnable) {
        this.f6739b = mVar;
        this.f6740c = mVar2;
        this.f6741d = i;
        this.f6742e = runnable;
    }

    public static Runnable a(m mVar, c.e.a.a.i.m mVar2, int i, Runnable runnable) {
        return new h(mVar, mVar2, i, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        m.a(this.f6739b, this.f6740c, this.f6741d, this.f6742e);
    }
}
