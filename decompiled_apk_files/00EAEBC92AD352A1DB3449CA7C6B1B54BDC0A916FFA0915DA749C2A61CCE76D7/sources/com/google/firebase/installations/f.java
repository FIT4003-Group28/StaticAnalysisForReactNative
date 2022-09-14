package com.google.firebase.installations;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final g f9345b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9346c;

    private f(g gVar, boolean z) {
        this.f9345b = gVar;
        this.f9346c = z;
    }

    public static Runnable a(g gVar, boolean z) {
        return new f(gVar, z);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9345b.b(this.f9346c);
    }
}
