package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pdh  reason: default package */
/* loaded from: classes7.dex */
public final class pdh {
    private final btvo a;
    private final auhq b;
    private final bvjj c;
    private final cqat d;
    private final dxio<akfa> e;
    private final auhi f;

    public pdh(auhq auhqVar, bvjj bvjjVar, cqat cqatVar, dxio<akfa> dxioVar, auhi auhiVar, btvo btvoVar) {
        this.a = btvoVar;
        this.b = auhqVar;
        this.c = bvjjVar;
        this.d = cqatVar;
        this.e = dxioVar;
        this.f = auhiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(augj augjVar, dlil dlilVar, int i) {
        bvrj.UI_THREAD.d();
        if (this.d.b() - this.c.w(bvjk.go, 0L) >= TimeUnit.SECONDS.toMillis(this.a.getUgcParameters().y()) || this.e.a().k() == null || dlilVar.b.size() <= 0) {
            this.b.f(i);
        } else {
            this.f.j(augjVar);
        }
    }
}
