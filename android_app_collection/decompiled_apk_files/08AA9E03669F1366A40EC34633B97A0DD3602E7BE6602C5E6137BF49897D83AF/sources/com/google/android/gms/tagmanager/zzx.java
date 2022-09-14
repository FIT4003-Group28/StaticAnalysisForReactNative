package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.tagmanager.ContainerHolder;
/* loaded from: classes.dex */
final class zzx extends Handler {
    private final ContainerHolder.ContainerAvailableListener zzawi;
    private final /* synthetic */ zzv zzawj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzx(zzv zzvVar, ContainerHolder.ContainerAvailableListener containerAvailableListener, Looper looper) {
        super(looper);
        this.zzawj = zzvVar;
        this.zzawi = containerAvailableListener;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            zzdi.e("Don't know how to handle this message.");
            return;
        }
        this.zzawi.onContainerAvailable(this.zzawj, (String) message.obj);
    }
}
