package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cjyc  reason: default package */
/* loaded from: classes4.dex */
public final class cjyc implements bvkz {
    private final Executor a;

    public cjyc(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.bvkz
    public final Executor a() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
