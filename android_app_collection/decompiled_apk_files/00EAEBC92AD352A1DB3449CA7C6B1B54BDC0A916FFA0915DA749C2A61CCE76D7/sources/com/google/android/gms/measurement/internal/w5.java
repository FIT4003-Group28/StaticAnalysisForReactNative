package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class w5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7755b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7756c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7757d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ long f7758e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ j5 f7759f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w5(j5 j5Var, String str, String str2, String str3, long j) {
        this.f7759f = j5Var;
        this.f7755b = str;
        this.f7756c = str2;
        this.f7757d = str3;
        this.f7758e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        String str = this.f7755b;
        if (str == null) {
            r9Var2 = this.f7759f.f7390a;
            r9Var2.s().D().a(this.f7756c, (q7) null);
            return;
        }
        q7 q7Var = new q7(this.f7757d, str, this.f7758e);
        r9Var = this.f7759f.f7390a;
        r9Var.s().D().a(this.f7756c, q7Var);
    }
}
