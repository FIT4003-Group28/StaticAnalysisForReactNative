package com.google.firebase.messaging;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final /* synthetic */ class e implements Executor {

    /* renamed from: a  reason: collision with root package name */
    static final Executor f9455a = new e();

    private e() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
