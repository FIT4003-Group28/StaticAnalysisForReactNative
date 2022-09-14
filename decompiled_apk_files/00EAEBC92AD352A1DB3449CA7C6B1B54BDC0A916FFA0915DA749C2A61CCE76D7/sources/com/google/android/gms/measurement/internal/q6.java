package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q6 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f7607b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7608c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f7609d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Bundle f7610e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f7611f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ boolean f7612g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ boolean f7613h;
    private final /* synthetic */ String i;
    private final /* synthetic */ j6 j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q6(j6 j6Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.j = j6Var;
        this.f7607b = str;
        this.f7608c = str2;
        this.f7609d = j;
        this.f7610e = bundle;
        this.f7611f = z;
        this.f7612g = z2;
        this.f7613h = z3;
        this.i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.a(this.f7607b, this.f7608c, this.f7609d, this.f7610e, this.f7611f, this.f7612g, this.f7613h, this.i);
    }
}
