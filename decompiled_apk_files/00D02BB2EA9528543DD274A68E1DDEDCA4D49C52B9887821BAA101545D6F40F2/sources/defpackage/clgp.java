package defpackage;

import dagger.internal.Factory;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: clgp  reason: default package */
/* loaded from: classes5.dex */
public final class clgp implements Factory<clgo> {
    private final dzsj<Executor> a;
    private final dzsj<clgu> b;
    private final dzsj<clgq> c;
    private final dzsj<clif> d;

    public clgp(dzsj<Executor> dzsjVar, dzsj<clgu> dzsjVar2, dzsj<clgq> dzsjVar3, dzsj<clif> dzsjVar4) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final clgo a() {
        return new clgo(this.a.a(), this.b.a(), ((clft) this.c).a(), this.d.a());
    }
}
