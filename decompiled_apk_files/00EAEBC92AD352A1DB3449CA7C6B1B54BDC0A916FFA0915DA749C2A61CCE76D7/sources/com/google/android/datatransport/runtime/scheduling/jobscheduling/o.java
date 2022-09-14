package com.google.android.datatransport.runtime.scheduling.jobscheduling;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final q f6768b;

    private o(q qVar) {
        this.f6768b = qVar;
    }

    public static Runnable a(q qVar) {
        return new o(qVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        r0.f6773d.a(p.a(this.f6768b));
    }
}
