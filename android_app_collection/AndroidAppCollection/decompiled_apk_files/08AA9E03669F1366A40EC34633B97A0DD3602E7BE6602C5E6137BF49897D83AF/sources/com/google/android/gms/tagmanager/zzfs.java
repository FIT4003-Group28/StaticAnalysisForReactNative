package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfs implements Handler.Callback {
    private final /* synthetic */ zzfr zzbco;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfs(zzfr zzfrVar) {
        this.zzbco = zzfrVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        boolean isPowerSaveMode;
        int i;
        if (1 == message.what) {
            obj = zzfn.zzbcb;
            if (obj.equals(message.obj)) {
                this.zzbco.zzbcn.dispatch();
                isPowerSaveMode = this.zzbco.zzbcn.isPowerSaveMode();
                if (!isPowerSaveMode) {
                    zzfr zzfrVar = this.zzbco;
                    i = this.zzbco.zzbcn.zzbcf;
                    zzfrVar.zzh(i);
                }
            }
        }
        return true;
    }
}
