package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ e.a f6932b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(e.a aVar) {
        this.f6932b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6932b.n();
    }
}
