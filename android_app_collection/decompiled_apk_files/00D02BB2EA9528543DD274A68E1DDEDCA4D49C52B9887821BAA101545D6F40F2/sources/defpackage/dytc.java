package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dytc  reason: default package */
/* loaded from: classes6.dex */
public final class dytc extends dyhd {
    public final dyhc a;
    final /* synthetic */ dytd b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public dytc(dytd dytdVar, dyhc dyhcVar) {
        this.b = dytdVar;
        dbsk.t(dyhcVar, "subchannel");
        this.a = dyhcVar;
    }

    @Override // defpackage.dyhd
    public final dygy a() {
        if (this.c.compareAndSet(false, true)) {
            ((dyrd) this.b.b).b.m.execute(new dytb(this));
        }
        return dygy.a;
    }
}
