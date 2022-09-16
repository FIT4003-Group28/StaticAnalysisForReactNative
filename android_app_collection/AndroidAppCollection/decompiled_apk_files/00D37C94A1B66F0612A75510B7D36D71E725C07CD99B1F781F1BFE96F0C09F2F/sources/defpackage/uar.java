package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: uar  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class uar implements amqo {
    public final /* synthetic */ AtomicReference a;
    private final /* synthetic */ int b;

    public /* synthetic */ uar(AtomicReference atomicReference, int i) {
        this.b = i;
        this.a = atomicReference;
    }

    @Override // defpackage.amqo
    public final Object get() {
        if (this.b == 0) {
            return (uba) this.a.get();
        }
        return (uaz) this.a.get();
    }
}
