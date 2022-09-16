package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h8 extends h {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ y7 f7345e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(y7 y7Var, a6 a6Var) {
        super(a6Var);
        this.f7345e = y7Var;
    }

    @Override // com.google.android.gms.measurement.internal.h
    public final void a() {
        this.f7345e.c().v().a("Tasks have been queued for a long time");
    }
}
