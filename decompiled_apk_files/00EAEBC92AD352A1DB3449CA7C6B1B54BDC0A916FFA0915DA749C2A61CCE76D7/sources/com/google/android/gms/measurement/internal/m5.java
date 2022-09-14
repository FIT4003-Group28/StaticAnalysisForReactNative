package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
final class m5 implements Callable<List<aa>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f7490a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7491b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7492c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ j5 f7493d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m5(j5 j5Var, String str, String str2, String str3) {
        this.f7493d = j5Var;
        this.f7490a = str;
        this.f7491b = str2;
        this.f7492c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<aa> call() {
        r9 r9Var;
        r9 r9Var2;
        r9Var = this.f7493d.f7390a;
        r9Var.q();
        r9Var2 = this.f7493d.f7390a;
        return r9Var2.i().a(this.f7490a, this.f7491b, this.f7492c);
    }
}
