package defpackage;

import dagger.internal.Factory;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cxdm  reason: default package */
/* loaded from: classes5.dex */
public final class cxdm implements Factory<cxdl> {
    private final dzsj<cwwp> a;
    private final dzsj<Executor> b;
    private final dzsj<cxdg> c;
    private final dzsj<cxfg> d;
    private final dzsj<cxew> e;

    public cxdm(dzsj<cwwp> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<cxdg> dzsjVar3, dzsj<cxfg> dzsjVar4, dzsj<cxew> dzsjVar5) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
        this.e = dzsjVar5;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cxdl(((cwwq) this.a).a(), this.b.a(), dxjc.c(this.c), this.d, ((cxex) this.e).a());
    }
}
