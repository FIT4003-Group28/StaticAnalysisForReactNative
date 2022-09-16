package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dl  reason: default package */
/* loaded from: classes3.dex */
public final class dl extends aby {
    final /* synthetic */ AtomicReference a;

    public dl(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.aby
    public final void a() {
        throw null;
    }

    @Override // defpackage.aby
    public final void b(Object obj) {
        aby abyVar = (aby) this.a.get();
        if (abyVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        abyVar.b(obj);
    }
}
