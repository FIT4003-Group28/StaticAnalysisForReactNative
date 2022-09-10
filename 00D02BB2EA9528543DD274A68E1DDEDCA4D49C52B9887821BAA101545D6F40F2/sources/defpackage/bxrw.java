package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxrw  reason: default package */
/* loaded from: classes4.dex */
public final class bxrw {
    public final dxio<bxrf> a;
    public final btvo b;
    public final Executor c;
    public final bvkx d;
    public final ckcw e;
    public final dbty<Void> f = dbud.a(new dbty(this) { // from class: bxru
        private final bxrw a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            final bxrw bxrwVar = this.a;
            bxrwVar.d.k(new Runnable(bxrwVar) { // from class: bxrv
                private final bxrw a;

                {
                    this.a = bxrwVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bxrw bxrwVar2 = this.a;
                    if (bxrwVar2.b.getSuggestParameters().w) {
                        boolean isDone = bxrwVar2.a.a().d().isDone();
                        ckco ckcoVar = (ckco) bxrwVar2.e.a(ckip.aj);
                        int i = 1;
                        if (true == isDone) {
                            i = 2;
                        }
                        ckcoVar.a(i);
                    }
                }
            }, bxrwVar.c, bvkw.ON_STARTUP_FULLY_COMPLETE);
            return null;
        }
    });

    public bxrw(Executor executor, dxio<bxrf> dxioVar, btvo btvoVar, bvkx bvkxVar, ckcw ckcwVar) {
        this.a = dxioVar;
        this.b = btvoVar;
        this.c = executor;
        this.d = bvkxVar;
        this.e = ckcwVar;
    }
}
