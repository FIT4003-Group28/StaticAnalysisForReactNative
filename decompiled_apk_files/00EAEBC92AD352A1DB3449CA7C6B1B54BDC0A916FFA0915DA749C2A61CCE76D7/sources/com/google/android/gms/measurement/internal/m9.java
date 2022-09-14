package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m9 extends h {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ r9 f7507e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ n9 f7508f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(n9 n9Var, a6 a6Var, r9 r9Var) {
        super(a6Var);
        this.f7508f = n9Var;
        this.f7507e = r9Var;
    }

    @Override // com.google.android.gms.measurement.internal.h
    public final void a() {
        this.f7508f.t();
        this.f7508f.c().B().a("Starting upload from DelayedRunnable");
        this.f7507e.p();
    }
}
