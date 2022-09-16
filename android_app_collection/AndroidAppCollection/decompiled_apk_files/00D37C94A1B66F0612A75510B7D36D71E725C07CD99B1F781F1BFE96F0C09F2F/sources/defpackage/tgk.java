package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: tgk  reason: default package */
/* loaded from: classes4.dex */
public final class tgk implements ayom {
    final /* synthetic */ ayom a;
    final /* synthetic */ tgl b;
    private final AtomicBoolean c = new AtomicBoolean();

    public tgk(tgl tglVar, ayom ayomVar) {
        this.b = tglVar;
        this.a = ayomVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.c.compareAndSet(false, true)) {
            try {
                this.b.a.a(obj);
            } catch (Exception e) {
                throw new ted("Error happened with doOnFirst Action", e);
            }
        }
        this.a.c(obj);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        this.a.sj(aypgVar);
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.a.sm();
    }
}
