package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
final class n5 implements Callable<List<aa>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ fa f7518a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7519b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7520c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ j5 f7521d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n5(j5 j5Var, fa faVar, String str, String str2) {
        this.f7521d = j5Var;
        this.f7518a = faVar;
        this.f7519b = str;
        this.f7520c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<aa> call() {
        r9 r9Var;
        r9 r9Var2;
        r9Var = this.f7521d.f7390a;
        r9Var.q();
        r9Var2 = this.f7521d.f7390a;
        return r9Var2.i().a(this.f7518a.f7303b, this.f7519b, this.f7520c);
    }
}
