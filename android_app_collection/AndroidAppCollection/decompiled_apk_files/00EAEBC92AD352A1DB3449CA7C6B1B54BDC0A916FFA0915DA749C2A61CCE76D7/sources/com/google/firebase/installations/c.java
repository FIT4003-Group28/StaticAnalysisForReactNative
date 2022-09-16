package com.google.firebase.installations;
/* loaded from: classes.dex */
final /* synthetic */ class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final g f9341b;

    private c(g gVar) {
        this.f9341b = gVar;
    }

    public static Runnable a(g gVar) {
        return new c(gVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9341b.c(false);
    }
}
