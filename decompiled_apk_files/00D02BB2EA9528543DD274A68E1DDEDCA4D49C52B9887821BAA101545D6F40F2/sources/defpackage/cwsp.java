package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwsp  reason: default package */
/* loaded from: classes5.dex */
public final class cwsp implements Factory<cwty> {
    private final dzsj<dbsg<cwty>> a;

    public cwsp(dzsj<dbsg<cwty>> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        dbsg dbsgVar = (dbsg) ((dxjd) this.a).a;
        cwrh cwrhVar = new cwrh();
        cwrhVar.a = 11;
        cwrhVar.b = 2;
        boolean z = true;
        cwrhVar.c = true;
        String str = cwrhVar.a == null ? " primesMetricExecutorPriority" : "";
        if (cwrhVar.b == null) {
            str = str.concat(" primesMetricExecutorPoolSize");
        }
        if (cwrhVar.c == null) {
            str = String.valueOf(str).concat(" enableDeferredTasks");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        cwri cwriVar = new cwri(cwrhVar.a.intValue(), cwrhVar.b.intValue(), cwrhVar.c.booleanValue());
        if (cwriVar.c() <= 0 || cwriVar.c() > 2) {
            z = false;
        }
        dbsk.n(z, "Thread pool size must be less than or equal to %s", 2);
        cwty cwtyVar = (cwty) dbsgVar.c(cwriVar);
        int i = cwsy.b;
        dxjg.f(cwtyVar);
        return cwtyVar;
    }
}
