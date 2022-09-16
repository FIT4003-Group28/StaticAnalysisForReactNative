package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: rzy  reason: default package */
/* loaded from: classes4.dex */
public final class rzy extends t {
    private final AtomicBoolean e = new AtomicBoolean(false);

    @Override // defpackage.s
    public void e(apy apyVar, final u uVar) {
        super.e(apyVar, new u() { // from class: rzx
            @Override // defpackage.u
            public final void a(Object obj) {
                rzy.this.n(uVar, obj);
            }
        });
    }

    @Override // defpackage.t, defpackage.s
    public void i(Object obj) {
        this.e.set(true);
        super.i(obj);
    }

    @Override // defpackage.t, defpackage.s
    public void k(Object obj) {
        this.e.set(true);
        super.k(obj);
    }

    public /* synthetic */ void n(u uVar, Object obj) {
        if (this.e.compareAndSet(true, false)) {
            uVar.a(obj);
        }
    }
}
