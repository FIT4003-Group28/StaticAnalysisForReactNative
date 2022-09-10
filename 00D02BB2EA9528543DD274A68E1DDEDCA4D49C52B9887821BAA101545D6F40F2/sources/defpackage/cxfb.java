package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cxfb  reason: default package */
/* loaded from: classes5.dex */
public final class cxfb {
    private static final cxfg d = cxfg.c(eaby.d);
    private static final cxez e = cxez.b(Integer.MAX_VALUE);
    public volatile cxfg a = d;
    public volatile int c = 3;
    public volatile cxez b = e;

    public cxfb(Executor executor, final dxio<? extends cwuw> dxioVar, final dzsj<cxfg> dzsjVar) {
        deha.e(new Runnable(this, dxioVar, dzsjVar) { // from class: cxfa
            private final cxfb a;
            private final dxio b;
            private final dzsj c;

            {
                this.a = this;
                this.b = dxioVar;
                this.c = dzsjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cxfb cxfbVar = this.a;
                dxio dxioVar2 = this.b;
                dzsj dzsjVar2 = this.c;
                try {
                    cwuw cwuwVar = (cwuw) dxioVar2.a();
                    cxfbVar.c = cwuwVar.b();
                    cxfbVar.b = cxez.b(cwuwVar.a());
                } catch (Throwable unused) {
                    cxfbVar.c = 2;
                }
                if (cxfbVar.c != 3 || dzsjVar2 == null) {
                    if (dzsjVar2 != null) {
                        return;
                    }
                    eabv bZ = eaby.d.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    eaby eabyVar = (eaby) bZ.b;
                    eabyVar.c = 2;
                    eabyVar.a |= 4;
                    cxfbVar.a = cxfg.c(bZ.bK());
                    return;
                }
                try {
                    cxfbVar.a = (cxfg) dzsjVar2.a();
                } catch (Throwable unused2) {
                    eabv bZ2 = eaby.d.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    eaby eabyVar2 = (eaby) bZ2.b;
                    eabyVar2.a = 2 | eabyVar2.a;
                    eabyVar2.b = 0L;
                    eaby eabyVar3 = (eaby) bZ2.b;
                    eabyVar3.c = 1;
                    eabyVar3.a |= 4;
                    cxfbVar.a = cxfg.c(bZ2.bK());
                }
            }
        }, executor);
    }
}
