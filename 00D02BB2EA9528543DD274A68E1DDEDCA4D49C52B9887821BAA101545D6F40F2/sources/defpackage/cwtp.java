package defpackage;

import dagger.internal.Factory;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cwtp  reason: default package */
/* loaded from: classes5.dex */
public final class cwtp implements Factory<Executor> {
    private final dzsj<cwrr> a;
    private final dzsj<dehq> b;
    private final dzsj<cwty> c;

    public cwtp(dzsj<cwrr> dzsjVar, dzsj<dehq> dzsjVar2, dzsj<cwty> dzsjVar3) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        Executor a = this.c.a().d() ? this.a.a() : this.b.a();
        dxjg.f(a);
        return a;
    }
}
