package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bypb  reason: default package */
/* loaded from: classes.dex */
public final class bypb implements bvkz {
    public final dxio<bypq> a;
    public final dxio<byqh> b;
    private final Executor c;
    private final btrm d;

    public bypb(Executor executor, btrm btrmVar, dxio<bypq> dxioVar, dxio<byqh> dxioVar2) {
        this.c = executor;
        this.d = btrmVar;
        this.a = dxioVar;
        this.b = dxioVar2;
    }

    @Override // defpackage.bvkz
    public final Executor a() {
        return this.c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        btrm btrmVar = this.d;
        dceq a = dcet.a();
        a.b(btvr.class, new bypc(btvr.class, this));
        btrmVar.g(this, a.a());
    }
}
