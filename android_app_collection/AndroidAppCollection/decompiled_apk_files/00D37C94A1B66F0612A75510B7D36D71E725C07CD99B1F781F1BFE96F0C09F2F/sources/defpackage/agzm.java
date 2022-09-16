package defpackage;

import com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService;
/* compiled from: PG */
/* renamed from: agzm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agzm implements Runnable {
    public final /* synthetic */ OfflineTransferService a;
    public final /* synthetic */ agqz b;
    private final /* synthetic */ int c;

    public /* synthetic */ agzm(OfflineTransferService offlineTransferService, agqz agqzVar) {
        this.a = offlineTransferService;
        this.b = agqzVar;
    }

    public /* synthetic */ agzm(OfflineTransferService offlineTransferService, agqz agqzVar, int i) {
        this.c = i;
        this.a = offlineTransferService;
        this.b = agqzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            OfflineTransferService offlineTransferService = this.a;
            agqz agqzVar = this.b;
            if (!agxg.ae(agqzVar.f)) {
                return;
            }
            if (agqzVar.b == avkl.TRANSFER_STATE_COMPLETE) {
                ((agrn) offlineTransferService.j.get()).A(agqzVar);
                return;
            } else if (agqzVar.b == avkl.TRANSFER_STATE_FAILED) {
                ((agrn) offlineTransferService.j.get()).B(agqzVar);
                return;
            } else if (agqzVar.b != avkl.TRANSFER_STATE_TRANSFER_IN_QUEUE || !agxg.ai(agqzVar)) {
                return;
            } else {
                offlineTransferService.r(agqzVar, false);
                return;
            }
        }
        OfflineTransferService offlineTransferService2 = this.a;
        ((agrn) offlineTransferService2.j.get()).z(this.b);
    }
}
