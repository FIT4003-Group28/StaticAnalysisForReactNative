package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.a;
/* loaded from: classes.dex */
public abstract class e extends a.AbstractC0125a {

    /* renamed from: b  reason: collision with root package name */
    private final ReactContext f5892b;

    /* JADX INFO: Access modifiers changed from: protected */
    public e(ReactContext reactContext) {
        this.f5892b = reactContext;
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0125a
    public final void a(long j) {
        try {
            b(j);
        } catch (RuntimeException e2) {
            this.f5892b.handleException(e2);
        }
    }

    protected abstract void b(long j);
}
