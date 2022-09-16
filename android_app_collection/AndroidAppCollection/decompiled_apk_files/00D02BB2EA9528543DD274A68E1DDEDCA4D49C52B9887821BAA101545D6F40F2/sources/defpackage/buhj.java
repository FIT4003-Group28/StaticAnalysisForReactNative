package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: buhj  reason: default package */
/* loaded from: classes4.dex */
public final class buhj implements buis {
    private final CronetEngine a;
    private final Executor b;

    public buhj(CronetEngine cronetEngine, Executor executor) {
        this.a = cronetEngine;
        this.b = executor;
    }

    @Override // defpackage.buis
    public final <S extends dssj> buir<S> a(dssj dssjVar, buid buidVar, buad buadVar) {
        return new buhi(dssjVar, buadVar, this.a, buidVar, this.b);
    }
}
