package defpackage;

import android.content.Context;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import dagger.internal.Factory;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cwxv  reason: default package */
/* loaded from: classes5.dex */
public final class cwxv implements Factory<cwxu> {
    private final dzsj<cwwp> a;
    private final dzsj<Context> b;
    private final dzsj<Executor> c;
    private final dzsj<cwxp> d;
    private final dzsj<dbsg<dzsj<NativeCrashHandlerImpl>>> e;
    private final dzsj<cwrb> f;
    private final dzsj<cxew> g;

    public cwxv(dzsj<cwwp> dzsjVar, dzsj<Context> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<cwxp> dzsjVar4, dzsj<dbsg<dzsj<NativeCrashHandlerImpl>>> dzsjVar5, dzsj<cwrb> dzsjVar6, dzsj<cxew> dzsjVar7) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
        this.e = dzsjVar5;
        this.f = dzsjVar6;
        this.g = dzsjVar7;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cwxu(((cwwq) this.a).a(), (Context) ((dxjd) this.b).a, this.c.a(), dxjc.c(this.d), (dbsg) ((dxjd) this.e).a, this.f.a(), ((cxex) this.g).a());
    }
}
