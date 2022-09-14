package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.e;
/* loaded from: classes.dex */
final class v implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ e.a f6929b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(e.a aVar) {
        this.f6929b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6929b.m();
    }
}
