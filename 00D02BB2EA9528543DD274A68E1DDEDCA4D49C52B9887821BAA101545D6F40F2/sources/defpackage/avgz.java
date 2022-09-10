package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avgz  reason: default package */
/* loaded from: classes2.dex */
public final class avgz implements bvkz {
    public final dxio<avrw> a;
    public final aver b;
    private final crzm<avzg> c;
    private final Executor d;

    public avgz(Executor executor, crzm<avzg> crzmVar, aver averVar, dxio<avrw> dxioVar) {
        this.d = executor;
        this.c = crzmVar;
        this.b = averVar;
        this.a = dxioVar;
    }

    @Override // defpackage.bvkz
    public final Executor a() {
        return this.d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bvqj.c(this.c.j(), new bvqg(this) { // from class: avgy
            private final avgz a;

            {
                this.a = this;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                avgz avgzVar = this.a;
                avzg avzgVar = (avzg) obj;
                if (avzgVar == null || avzj.d(avzgVar.a().b()) || avgzVar.a.a().a()) {
                    return;
                }
                avgzVar.b.e();
            }
        }, this.d);
    }
}
