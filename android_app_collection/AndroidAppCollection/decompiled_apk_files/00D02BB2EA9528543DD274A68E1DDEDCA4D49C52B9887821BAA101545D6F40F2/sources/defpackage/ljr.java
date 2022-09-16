package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ljr  reason: default package */
/* loaded from: classes7.dex */
public final class ljr implements Runnable {
    final /* synthetic */ lju a;

    public ljr(lju ljuVar) {
        this.a = ljuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.m();
        if (this.a.n.a.r().booleanValue()) {
            lju ljuVar = this.a;
            if (ljuVar.w) {
                return;
            }
            ljuVar.w = true;
            ljuVar.a.b(new Runnable(this) { // from class: ljq
                private final ljr a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    lju ljuVar2 = this.a.a;
                    if (ljuVar2.j.b) {
                        ljuVar2.p.k(new lrt(ljuVar2.e, ljuVar2.n.d, new Runnable(ljuVar2) { // from class: ljb
                            private final lju a;

                            {
                                this.a = ljuVar2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                lju ljuVar3 = this.a;
                                ljuVar3.p.a();
                                nol.b(ljuVar3.o);
                            }
                        }, ljuVar2.A));
                    }
                }
            }, bvrj.UI_THREAD);
        }
    }
}
