package com.facebook.react.uimanager;

import com.facebook.react.modules.core.a;
/* compiled from: GuardedFrameCallback.java */
/* loaded from: classes.dex */
public abstract class d extends a.AbstractC0069a {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.react.bridge.aj f3871a;

    protected abstract void a(long j);

    /* JADX INFO: Access modifiers changed from: protected */
    public d(com.facebook.react.bridge.aj ajVar) {
        this.f3871a = ajVar;
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0069a
    public final void b(long j) {
        try {
            a(j);
        } catch (RuntimeException e) {
            this.f3871a.a(e);
        }
    }
}
