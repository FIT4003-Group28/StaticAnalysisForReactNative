package com.google.android.gms.common;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
final class c0 extends a0 {

    /* renamed from: e  reason: collision with root package name */
    private final Callable<String> f6947e;

    private c0(Callable<String> callable) {
        super(false, null, null);
        this.f6947e = callable;
    }

    @Override // com.google.android.gms.common.a0
    final String a() {
        try {
            return this.f6947e.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
