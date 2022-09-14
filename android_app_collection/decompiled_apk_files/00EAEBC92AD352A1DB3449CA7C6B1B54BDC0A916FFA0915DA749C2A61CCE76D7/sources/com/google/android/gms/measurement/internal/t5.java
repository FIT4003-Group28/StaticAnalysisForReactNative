package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class t5 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ p f7705b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7706c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ j5 f7707d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t5(j5 j5Var, p pVar, String str) {
        this.f7707d = j5Var;
        this.f7705b = pVar;
        this.f7706c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r9 r9Var;
        r9 r9Var2;
        r9Var = this.f7707d.f7390a;
        r9Var.q();
        r9Var2 = this.f7707d.f7390a;
        r9Var2.a(this.f7705b, this.f7706c);
    }
}
