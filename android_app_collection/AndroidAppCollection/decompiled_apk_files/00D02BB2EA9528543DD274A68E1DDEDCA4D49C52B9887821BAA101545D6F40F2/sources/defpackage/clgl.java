package defpackage;

import android.content.Context;
import dagger.internal.Factory;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: clgl  reason: default package */
/* loaded from: classes5.dex */
public final class clgl implements Factory<clgk> {
    private final dzsj<Context> a;
    private final dzsj<clfm> b;
    private final dzsj<clgu> c;
    private final dzsj<clgq> d;
    private final dzsj<Executor> e;
    private final dzsj<clif> f;

    public clgl(dzsj<Context> dzsjVar, dzsj<clfm> dzsjVar2, dzsj<clgu> dzsjVar3, dzsj<clgq> dzsjVar4, dzsj<Executor> dzsjVar5, dzsj<clif> dzsjVar6) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
        this.e = dzsjVar5;
        this.f = dzsjVar6;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final clgk a() {
        return new clgk((Context) ((dxjd) this.a).a, this.b.a(), this.c.a(), ((clft) this.d).a(), this.e.a(), this.f.a(), clih.b());
    }
}
