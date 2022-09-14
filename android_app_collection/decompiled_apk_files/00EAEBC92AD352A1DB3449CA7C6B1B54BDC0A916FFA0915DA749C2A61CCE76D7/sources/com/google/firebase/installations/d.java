package com.google.firebase.installations;
/* loaded from: classes.dex */
final /* synthetic */ class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final g f9342b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9343c;

    private d(g gVar, boolean z) {
        this.f9342b = gVar;
        this.f9343c = z;
    }

    public static Runnable a(g gVar, boolean z) {
        return new d(gVar, z);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9342b.c(this.f9343c);
    }
}
